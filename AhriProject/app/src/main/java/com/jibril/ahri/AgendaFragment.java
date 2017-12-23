package com.jibril.ahri;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class AgendaFragment extends ListFragment implements View.OnClickListener {

    private AgendaEventAdapter adapterEvents;
    private ArrayList<Event> listEvents;

    //FAB elements
    public FloatingActionButton fabCreateQuickEvent;
    public FloatingActionButton fabCreateEvent;

    public AgendaFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        listEvents = getEvents();
        //TODO: Delete, just for debug
        adapterEvents = new AgendaEventAdapter(this.getContext(), listEvents);
        setListAdapter(adapterEvents);

        initElements();
        startListeners();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_agenda, container, false);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.fab_create_quick_event:
                Log.d("FAB", "QuickEvent");
                break;
            case R.id.fab_create_event:
                Log.d("FAB", "Event");
                break;
            default:
                break;
        }
    }

    private void initElements() {

        //FAB elements
        fabCreateQuickEvent = (FloatingActionButton) getView().findViewById(R.id.fab_create_quick_event);
        fabCreateEvent = (FloatingActionButton) getView().findViewById(R.id.fab_create_event);
    }

    private void startListeners() {
        fabCreateQuickEvent.setOnClickListener(this);
        fabCreateEvent.setOnClickListener(this);
    }

    //TODO: Delete after databae
    private ArrayList<Event> getEvents() {
        //Log to remind deletion.
        Log.w("REMOVE", "Remove getEvents after database creation.");
        ArrayList<Event> listEvent = new ArrayList<Event>();
        Event e = new Event("Success", "Wed", "1pm");
        listEvent.add(e);
        e = new Event("Success", "Wed", "1pm");
        listEvent.add(e);
        e = new Event("Success", "Wed", "1pm");
        listEvent.add(e);
        e = new Event("Success", "Wed", "1pm");
        listEvent.add(e);
        e = new Event("Success", "Wed", "1pm");
        listEvent.add(e);
        e = new Event("Success", "Wed", "1pm");
        listEvent.add(e);
        e = new Event("Success", "Wed", "1pm");
        listEvent.add(e);
        e = new Event("Success", "Wed", "1pm");
        listEvent.add(e);
        e = new Event("Success", "Wed", "1pm");
        listEvent.add(e);
        e = new Event("Success", "Wed", "1pm");
        listEvent.add(e);
        e = new Event("Success", "Wed", "1pm");
        listEvent.add(e);
        e = new Event("Success", "Wed", "1pm");
        listEvent.add(e);

        return listEvent;
    }

}
