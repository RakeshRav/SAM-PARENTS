package com.samparents.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.samparents.R;

import rmn.androidscreenlibrary.ASSL;

/**
 * Created by rakesh on 8/1/17.
 */

public class AttendanceListAdapter extends RecyclerView.Adapter<AttendanceListAdapter.ViewHolder> {

    private static final String TAG = AttendanceListAdapter.class.getSimpleName();
    private Context mContext;
    private LayoutInflater mInflater;

    public AttendanceListAdapter(Context context) {
        mContext = context;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_attendance, parent, false);
        ViewHolder holder = new ViewHolder(view);
        ASSL.DoMagic(holder.linearlayoutAttd);
        Log.d(TAG,"Holder");
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private LinearLayout linearlayoutAttd;
        public ViewHolder(View itemView) {
            super(itemView);
            linearlayoutAttd = (LinearLayout) itemView.findViewById(R.id.linearlayoutAttd);
        }
    }
}
