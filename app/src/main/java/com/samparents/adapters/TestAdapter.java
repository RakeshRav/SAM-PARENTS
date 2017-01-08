package com.samparents.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.samparents.R;

import java.util.zip.Inflater;

import rmn.androidscreenlibrary.ASSL;

/**
 * Created by rakesh on 8/1/17.
 */

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.ViewHolder>{

    private Context context;
    private LayoutInflater inflater;

    public TestAdapter(Context context)
    {
        this.context = context;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_test,parent, false);
        ViewHolder holder = new ViewHolder(view);
        ASSL.DoMagic(holder.linearlayoutTest);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private LinearLayout linearlayoutTest;
        public ViewHolder(View itemView) {
            super(itemView);
            linearlayoutTest = (LinearLayout) itemView.findViewById(R.id.linearlayoutTest);
        }
    }
}
