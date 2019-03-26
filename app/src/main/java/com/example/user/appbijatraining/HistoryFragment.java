package com.example.user.appbijatraining;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class HistoryFragment extends Fragment {


    static List<HistoryList> historyLists;
    ListView listView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_history, container, false);

    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        historyLists = new ArrayList<>();

        historyLists.add(new HistoryList("Dummy notification 1"));
        historyLists.add(new HistoryList("Dummy notification 1"));
        historyLists.add(new HistoryList("Dummy notification 1"));
        historyLists.add(new HistoryList("Dummy notification 1"));
        historyLists.add(new HistoryList("Dummy notification 1"));
        historyLists.add(new HistoryList("Dummy notification 1"));
        historyLists.add(new HistoryList("Dummy notification 1"));
        historyLists.add(new HistoryList("Dummy notification 1"));
        historyLists.add(new HistoryList("Dummy notification 1"));
        historyLists.add(new HistoryList("Dummy notification 1"));
        historyLists.add(new HistoryList("Dummy notification 1"));
        historyLists.add(new HistoryList("Dummy notification 1"));


        listView = getActivity().findViewById(R.id.hist_list);

        HistoryListAdapter adapter = new HistoryListAdapter(getContext(), R.layout.custom_history_listitem, historyLists);

        listView.setAdapter(adapter);
    }
}
