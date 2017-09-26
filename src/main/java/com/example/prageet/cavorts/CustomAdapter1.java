package com.example.prageet.cavorts;

import android.content.Context;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter1 extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values;

    public CustomAdapter1(Context context, String[] values)
    {
        super(context,R.layout.activity_tab__events,values);
        this.context = context;
        this.values = values;
    }

    public View getView(int position , View ConvertView , ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.activity_tab__events,parent,false);
        TextView textView = (TextView)rowView.findViewById(R.id.textView_custom1);
        ImageView imgview = (ImageView)rowView.findViewById(R.id.pic);
        textView.setText(values[position]);
        String s = values[position];
        if(s.equalsIgnoreCase("Football"))
                imgview.setImageResource(R.drawable.cavorts2);
        else
                imgview.setImageResource(R.drawable.cavorts1);

        return rowView;
    }

}
