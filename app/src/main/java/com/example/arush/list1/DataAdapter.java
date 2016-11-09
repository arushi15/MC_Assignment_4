package com.example.arush.list1;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by arush on 09-11-2016.
 */

public class DataAdapter extends RecyclerView.Adapter<Holder> {
    Context c;
    ArrayList<todo> todolist;

    public DataAdapter(Context c, ArrayList<todo> todolist)
    {
        this.c = c;
        this.todolist = todolist;
    }
    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        //VIEW OBJ
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,parent,false);
        //HOLDER
        Holder holder=new Holder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(Holder holder, int position)
    {
        holder.titletext.setText(todolist.get(position).getTitle());
        holder.postext.setText(todolist.get(position).getDetails());
        //CLICKED
        holder.titletext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: 09-11-2016 OPEN NEW ACTIVITY
            }
        });

        holder.checkBox.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // TODO: 09-11-2016 mark task as done, delete task from db
            }
        });
    }

    @Override
    public int getItemCount() {
        return todolist.size();
    }

}