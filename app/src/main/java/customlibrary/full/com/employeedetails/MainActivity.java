package customlibrary.full.com.employeedetails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import customlibrary.full.com.chatmodule.ui.EmployeeListActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(MainActivity.this, EmployeeListActivity.class));
    }
}
