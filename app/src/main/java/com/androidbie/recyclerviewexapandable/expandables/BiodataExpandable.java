package com.androidbie.recyclerviewexapandable.expandables;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidbie.recyclerviewexapandable.R;
import com.androidbie.recyclerviewexapandable.libmoduleExpandable.Adapter.ExpandableRecyclerAdapter;
import com.androidbie.recyclerviewexapandable.libmoduleExpandable.Model.ParentListItem;
import com.androidbie.recyclerviewexapandable.models.BiodataChildModel;
import com.androidbie.recyclerviewexapandable.models.BiodataParentModel;

import java.util.List;

/**
 * Created by putuguna on 04/01/17.
 */

public class BiodataExpandable extends ExpandableRecyclerAdapter<BiodataParentViewHolder, BiodataChildViewHolder> {

    private LayoutInflater mLayoutInflater;
    private Context mContext;

    public BiodataExpandable(@NonNull List<? extends ParentListItem> parentItemList,  Context mContext) {
        super(parentItemList);
        this.mLayoutInflater = LayoutInflater.from(mContext);
        this.mContext = mContext;
    }

    @Override
    public BiodataParentViewHolder onCreateParentViewHolder(ViewGroup parentViewGroup) {
        View view = mLayoutInflater.inflate(R.layout.item_list_parent, parentViewGroup, false);
        return new BiodataParentViewHolder(view);
    }

    @Override
    public BiodataChildViewHolder onCreateChildViewHolder(ViewGroup childViewGroup) {
        View view = mLayoutInflater.inflate(R.layout.item_list_child, childViewGroup, false);
        return new BiodataChildViewHolder(view);
    }

    @Override
    public void onBindParentViewHolder(BiodataParentViewHolder parentViewHolder, int position, ParentListItem parentListItem) {
        BiodataParentModel head = (BiodataParentModel) parentListItem;
        parentViewHolder.bind(head);

    }

    @Override
    public void onBindChildViewHolder(BiodataChildViewHolder childViewHolder, int position, Object childListItem) {
        BiodataChildModel child = (BiodataChildModel) childListItem;
        childViewHolder.bind(child);
    }
}
