package com.samparents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.TextView;

import com.samparents.adapters.AttendanceListAdapter;

import rmn.androidscreenlibrary.ASSL;

public class AttendanceActivity extends AppCompatActivity {

    private static final String TAG = AttendanceActivity.class.getSimpleName();
    private RecyclerView recyclerViewAttendance;
    private AttendanceListAdapter attendanceListAdapter;
    private TextView textViewActionTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);
        new ASSL(this, (ViewGroup) findViewById(R.id.root), 1134, 720,
                false);
        initialization();
    }

    private void initialization() {
        Log.d(TAG,"init");
        recyclerViewAttendance = (RecyclerView) findViewById(R.id.recyclerViewAttendance);
        textViewActionTitle = (TextView) findViewById(R.id.textViewActionTitle);

        textViewActionTitle.setText("Attendance");

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerViewAttendance.setLayoutManager(manager);

        attendanceListAdapter = new AttendanceListAdapter(this);
        recyclerViewAttendance.setAdapter(attendanceListAdapter);
    }
}
