package com.tutorialsbuzz.recyclerviewitemleftswipe.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.tutorialsbuzz.recyclerviewitemleftswipe.R;

public class ItemViewHolder extends RecyclerView.ViewHolder {

    public LinearLayout regularLayout;
    public LinearLayout swipeLayout;
    public TextView listItem;
    public TextView undo;

    public ItemViewHolder(View view) {
        super(view);

        regularLayout = (LinearLayout) view.findViewById(R.id.regularLayout);
        listItem = (TextView) view.findViewById(R.id.list_item);
        swipeLayout = (LinearLayout) view.findViewById(R.id.swipeLayout);
        undo = (TextView) view.findViewById(R.id.undo);

    }
}