package recyclerview.in.recyclerview.lln;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import recyclerview.in.recyclerview.lln.RecycleInRecycle.PrimaryRecycleView;
import recyclerview.in.recyclerview.lln.RecyclerViewSample.SampleRecyclerView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_rv_sample;
    private Button btn_rv_in_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        registerClick();
    }

    private void init() {
        btn_rv_sample = (Button) findViewById(R.id.btn_rv_sample);
        btn_rv_in_rv = (Button) findViewById(R.id.btn_rv_in_rv);
    }

    private void registerClick() {
        btn_rv_sample.setOnClickListener(this);
        btn_rv_in_rv.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_rv_sample:
                Intent IntentSampleRV = new Intent(MainActivity.this, SampleRecyclerView.class);
                startActivity(IntentSampleRV);
                break;
            case R.id.btn_rv_in_rv:
                Intent IntentRvInRv = new Intent(MainActivity.this, PrimaryRecycleView.class);
                startActivity(IntentRvInRv);
                break;
        }
    }
}
