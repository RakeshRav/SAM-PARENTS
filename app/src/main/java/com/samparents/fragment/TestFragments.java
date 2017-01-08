package com.samparents.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.samparents.R;
import com.samparents.adapters.TestAdapter;

/**
 * Created by rakesh on 8/1/17.
 */

public class TestFragments extends Fragment {

    public static TestFragments getInstance()
    {
        return new TestFragments();
    }

    private RecyclerView recyclerViewTest;
    private TestAdapter adapter;

    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_test,container,false);
        
        init();
        return view;
    }

    private void init() {
        recyclerViewTest = (RecyclerView) view.findViewById(R.id.recyclerViewTest);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this.getContext());
        recyclerViewTest.setLayoutManager(manager);

        adapter = new TestAdapter(this.getContext());
        recyclerViewTest.setAdapter(adapter);
    }
}
