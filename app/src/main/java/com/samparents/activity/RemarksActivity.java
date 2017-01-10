package com.samparents.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.TextView;

import com.samparents.R;
import com.samparents.adapters.AttendanceListAdapter;
import com.samparents.adapters.RemarksListAdapter;

import rmn.androidscreenlibrary.ASSL;

public class RemarksActivity extends AppCompatActivity {

    private static final String TAG = RemarksActivity.class.getSimpleName();
    private RecyclerView recyclerViewRemarks;
    private RemarksListAdapter remarksListAdapter;
    private TextView textViewActionTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remarks);
        new ASSL(this, (ViewGroup) findViewById(R.id.root), 1134, 720,
                false);
        initialization();
    }

    private void initialization() {
        Log.d(TAG,"init");
        recyclerViewRemarks = (RecyclerView) findViewById(R.id.recyclerViewRemarks);
        textViewActionTitle = (TextView) findViewById(R.id.textViewActionTitle);

        textViewActionTitle.setText("Attendance");

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerViewRemarks.setLayoutManager(manager);

        remarksListAdapter = new RemarksListAdapter(this);
        recyclerViewRemarks.setAdapter(remarksListAdapter);
    }
}
