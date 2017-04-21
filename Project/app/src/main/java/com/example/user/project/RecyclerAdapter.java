package com.example.user.project;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by user on 4/20/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private ArrayList<String> arrayList = new ArrayList<String>();
    private Context context;
    private FragmentManager fragmentManager;

    /**
     * @param ctx             context of activity
     * @param fragmentManager fragment manager object
     */
    public RecyclerAdapter(final Context ctx, final FragmentManager fragmentManager) {
        this.context = ctx;
        arrayList.add("hello");
        arrayList.add("are");
        arrayList.add("you");
        this.fragmentManager = fragmentManager;
    }
    @Override
    public ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.tvText.setText(arrayList.get(position));


    }


    /**
     * view holde for adapter
     */
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView tvText;

        /**
         * @param itemView yo take view for row
         */
        public ViewHolder(final View itemView) {
            super(itemView);
            tvText = (TextView) itemView.findViewById(R.id.txt);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(final View v) {
            Toast.makeText(context, String.valueOf(arrayList.size()), Toast.LENGTH_SHORT).show();
            fragmentManager.beginTransaction().replace(R.id.frag_container, new MainViewPagerFragment()).commit();


        }
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
