package recyclerview.in.recyclerview.lln.RecycleInRecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import recyclerview.in.recyclerview.lln.R;
import recyclerview.in.recyclerview.lln.RecycleInRecycle.Adapter.PrimaryAdapter;
import recyclerview.in.recyclerview.lln.RecycleInRecycle.Model.PrimaryModel;

public class PrimaryRecycleView extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private PrimaryAdapter mAdapter;
    private List<PrimaryModel> modelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary_recycle_view);
        getSupportActionBar().setTitle("Recycler in Recycler");

        init();
        layoutManager();
        divisorDecoration();
        createList();
        mRecyclerView.setAdapter(mAdapter);
    }

    private void init() {
        mRecyclerView = (RecyclerView) findViewById(R.id.rv_in_rv);
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
            modelList.add(new PrimaryModel("List Primary " + i));
        }

        mAdapter = new PrimaryAdapter(this, modelList);
    }

}
