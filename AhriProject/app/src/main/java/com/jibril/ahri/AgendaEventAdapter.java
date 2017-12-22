package com.jibril.ahri;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jibril on 12/22/17.
 */

public class AgendaEventAdapter extends ArrayAdapter<Event> {

    private Context context;

    public AgendaEventAdapter(Context context, ArrayList<Event> events) {
        super(context, 0, events);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.event_row, parent, false);
        }

        //Variables
        TextView tv_event_name = (TextView) convertView.findViewById(R.id.text_event_name);
        TextView tv_event_datetime = (TextView) convertView.findViewById(R.id.text_event_datetime);
        ImageView iv_event_status = (ImageView) convertView.findViewById(R.id.image_event_status);
        ImageView iv_event_divider = (ImageView) convertView.findViewById(R.id.image_divider);

        //Get event item
        Event event = getItem(position);

        //Set elements
        tv_event_name.setText("getName()");
        tv_event_datetime.setText("getDateTime");
        iv_event_status.setImageResource(R.mipmap.ic_done_white_24dp);
        iv_event_divider.setImageResource(R.drawable.divider_simple);

        return convertView;
    }

}
