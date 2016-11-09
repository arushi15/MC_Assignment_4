package com.example.arush.list1;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by arush on 09-11-2016.
 */

public class Holder extends RecyclerView.ViewHolder implements View.OnClickListener
{

    TextView titletext,detailstext;
    ItemClickListener itemClickListener;
    CheckBox checkBox ;
    public Holder(View view)
    {
        super(view);
        titletext= (TextView) view.findViewById(R.id.titletext);
        detailstext= (TextView) view.findViewById(R.id.postext);
        checkBox= (CheckBox) view.findViewById(R.id.checkBox);
        view.setOnClickListener(this);
    }
    @Override
    public void onClick(View v)
    {
        this.itemClickListener.onItemClick(v,getLayoutPosition());
    }
    public void setItemClickListener(ItemClickListener ic)
    {
       this.itemClickListener=ic;
    }
}