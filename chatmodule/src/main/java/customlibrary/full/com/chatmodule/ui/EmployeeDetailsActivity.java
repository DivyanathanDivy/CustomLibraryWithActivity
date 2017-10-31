package customlibrary.full.com.chatmodule.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import customlibrary.full.com.chatmodule.R;
import jdo.EmployeeJDO;

public class EmployeeDetailsActivity extends AppCompatActivity {

    private static final String TAG = "EmployeeDetailsActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_details);
        EmployeeJDO lEmployeeJDO = (EmployeeJDO) getIntent().getSerializableExtra("EmployeeDetails");
        TextView lID = (TextView) findViewById(R.id.emp_id_tv);
        TextView lName =(TextView) findViewById(R.id.name_tv);
        TextView lAge = (TextView)findViewById(R.id.age_tv);
        TextView lAddress = (TextView)findViewById(R.id.address_tv);
//        lID.setText(""+lEmployeeJDO.getId());
//        lName.setText(lEmployeeJDO.getName());
//        lAge.setText(""+lEmployeeJDO.getAge());
//        lAddress.setText(lEmployeeJDO.getAddress());
        Log.d(TAG, "getView: id" + lEmployeeJDO.getName());
    }
}
