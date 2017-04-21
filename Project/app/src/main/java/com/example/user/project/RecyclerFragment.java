package com.example.user.project;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerFragment extends Fragment {
    private RecyclerView recyclerView;

    /**
     * empty constructor
     */
    public RecyclerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             final Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recycler2, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        recyclerView.setAdapter(new RecyclerAdapter(getActivity(), getFragmentManager()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }

}
