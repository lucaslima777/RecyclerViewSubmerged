package recyclerview.in.recyclerview.lln.RecyclerViewSample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import recyclerview.in.recyclerview.lln.R;
import recyclerview.in.recyclerview.lln.RecyclerViewSample.Adapter.SampleAdapter;
import recyclerview.in.recyclerview.lln.RecyclerViewSample.Model.SampleModel;

public class SampleRecyclerView extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private SampleAdapter mAdapter;
    private List<SampleModel> modelList;
    private int value = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_recycler_view);
        getSupportActionBar().setTitle("RecyclerView");

        init();
        layoutManager();
        divisorDecoration();
        createList();
        mRecyclerView.setAdapter(mAdapter);

    }

    private void init() {
        mRecyclerView = (RecyclerView) findViewById(R.id.rv_sample);
    }

    private void layoutManager() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
    }

    private void divisorDecoration() {
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }

    private void createList() {
        modelList = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            modelList.add(new SampleModel("Item " + i));
            value = i;
        }

        mAdapter = new SampleAdapter(this, modelList);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add:
                value += 1;
                mAdapter.insertItem(new SampleModel("Item " + value));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
