package com.example.prageet.cavorts;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class Tab_Events extends ListFragment {
    String[] names = {"Football","Cricket","Vollyball"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        
        setListAdapter(new CustomAdapter1(this.getContext(),names));

        return inflater.inflate(R.layout.activity_tab__events, container, false);
    }
}