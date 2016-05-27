package com.repsly.utils.lib.list;

import android.content.Context;
import android.widget.ListView;

import java.util.List;

public abstract class RecyclerAdapter<T extends ListView> extends
        DataBinderAdapter {

    private List<T> items;
    private Context activity;

    public RecyclerAdapter(Context activity, List<T> items) {
        this.items = items;
        this.activity = activity;
    }

    public Context getActivity() {
        return activity;
    }

    public void setActivity(Context activity) {
        this.activity = activity;
    }

    @Override
    public int getItemCount() {
        return items == null ? 0 : items.size();
    }

    /*
    We override method from RecyclerView.Adapter to use only one adapter for every list.
    Now we can custom setup ids for ViewType in app.
    Considering this method result class will know which binder to use.
     */
    @Override
    public abstract int getItemViewType(int position);

    /*
    We override method from RecyclerView.Adapter to use only one adapter for every list.
    Considering viewType that method getItemViewType returned to us class know which binder to return
     */
    @Override
    public abstract <T extends DataBinder> T getDataBinder(int viewType);

    @Override
    public int getPosition(DataBinder binder, int binderPosition) {
        return binderPosition;
    }

    @Override
    public int getBinderPosition(int position) {
        return position;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public T getItem(int position) {
        return items.get(position);
    }

}
