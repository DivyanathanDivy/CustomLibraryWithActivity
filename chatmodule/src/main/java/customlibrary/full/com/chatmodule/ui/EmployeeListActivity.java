package customlibrary.full.com.chatmodule.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import adapter.EmployeeAdapter;
import customlibrary.full.com.chatmodule.R;
import jdo.EmployeeJDO;

public class EmployeeListActivity extends AppCompatActivity {

    ArrayList<EmployeeJDO> mEmployeeArrayList;
    ListView mListView;
    EmployeeAdapter mEmployeeAdapter;
    private static final String TAG = "EmployeeListActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_list);
        mEmployeeArrayList = new ArrayList<>();
        mListView          = (ListView) findViewById(R.id.list_view);
        for (int i=0;i<20;i++){
            EmployeeJDO lEmployeeDetails = new EmployeeJDO();
            lEmployeeDetails.setId(i);
            lEmployeeDetails.setName("Name "+(i+1));
            lEmployeeDetails.setAge(20+i);
            lEmployeeDetails.setAddress("Address "+(i+1));
            mEmployeeArrayList.add(lEmployeeDetails);
        }
        Log.d(TAG, "onCreate: "+mEmployeeArrayList.size());
        mEmployeeAdapter   = new EmployeeAdapter(EmployeeListActivity.this,R.layout.employee_list,mEmployeeArrayList);
        mListView.setAdapter(mEmployeeAdapter);
        Log.d(TAG, "onCreate: size "+mEmployeeArrayList.size());
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent lIntent = new Intent(EmployeeListActivity.this,EmployeeDetailsActivity.class);
                lIntent.putExtra("EmployeeDetails",mEmployeeArrayList.get(i));
                startActivity(lIntent);
            }
        });
    }
}
