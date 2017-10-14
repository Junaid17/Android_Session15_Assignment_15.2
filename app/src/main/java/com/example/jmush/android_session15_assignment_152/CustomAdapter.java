package com.example.jmush.android_session15_assignment_152;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jmush on 10/14/17.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private ArrayList<DataModel> dataSet;

//Creating holder class which holds the view
    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName;
        TextView textViewVersion;
        public MyViewHolder(View itemView) {
            super(itemView);

            textViewName= (TextView) itemView.findViewById(R.id.textViewName);
            textViewVersion= (TextView) itemView.findViewById(R.id.textViewVersion);
        }
    }

    public CustomAdapter(ArrayList<DataModel> data) {
        this.dataSet = data;
    }

//Getting view from Layout


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_layout,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);

        return myViewHolder;
    }
// Setting the text values to cardview
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        textViewName.setText(dataSet.get(position).getName());
        textViewVersion.setText(dataSet.get(position).getVersion());

    }
// Return size of the list
    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
