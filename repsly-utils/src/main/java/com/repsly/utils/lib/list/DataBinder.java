package com.repsly.utils.lib.list;

/**
 * Created by Alen on 26.5.2016..
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * This class is used as data binder for recyclerview items
 * Needs to be extended because is just abstract class and can't be instance alone
 */
public abstract class DataBinder<T extends RecyclerView.ViewHolder> {

    public RecyclerAdapter dataBindAdapter;

    public DataBinder(RecyclerAdapter dataBindAdapter) {
        this.dataBindAdapter = dataBindAdapter;
    }

    /*
    This method is used to inflate specific layout that is used for binder
     */
    public View getView(ViewGroup parent) {
        return LayoutInflater.from(parent.getContext()).inflate(
                provideLayout(), parent, false);
    }

    abstract public T newViewHolder(ViewGroup parent);

    abstract public void bindViewHolder(T holder, int position);

    abstract public int getItemCount();

    public abstract int provideLayout();
}
