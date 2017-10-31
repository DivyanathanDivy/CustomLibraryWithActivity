package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import customlibrary.full.com.chatmodule.R;
import jdo.EmployeeJDO;

/**
 * Created by divyanathan on 31/10/17.
 */

public class EmployeeAdapter extends ArrayAdapter {
    Context mContext;
    ArrayList<EmployeeJDO> mEmployeeJDOArrayList;
    int mLayoutResourseId;
    private static final String TAG = "EmployeeAdapter";

    public EmployeeAdapter(@NonNull Context context, int resource, ArrayList<EmployeeJDO> pEmployeeArrayList) {
        super(context, resource);
        mContext = context;
        mEmployeeJDOArrayList = pEmployeeArrayList;
        mLayoutResourseId = resource;
        Log.d(TAG, "EmployeeAdapter: ");
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Log.d(TAG, "getView: ");
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(mLayoutResourseId, parent, false);
        }
//        TextView lID = convertView.findViewById(R.id.emp_id_tv);
        TextView lName = convertView.findViewById(R.id.name_tv);
//        TextView lAge = convertView.findViewById(R.id.age_tv);
//        TextView lAddress = convertView.findViewById(R.id.address_tv);
//        lID.setText(""+lEmployeeJDO.getId());
        lName.setText(mEmployeeJDOArrayList.get(position).getName());
//        lAge.setText(""+lEmployeeJDO.getAge());
//        lAddress.setText(lEmployeeJDO.getAddress());
//        Log.d(TAG, "getView: id" + lEmployeeJDO.getId());
        return convertView;
    }

    @Override
    public int getCount() {
        return mEmployeeJDOArrayList.size();
    }

}
