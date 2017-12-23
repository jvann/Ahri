package com.jibril.ahri;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FinanceFragment extends Fragment implements View.OnClickListener {

    //FAB elements
    public FloatingActionButton fabCreateQuickTransaction;
    public FloatingActionButton fabCreateTransaction;

    public FinanceFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initElements();
        startListeners();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_finance, container, false);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.fab_create_quick_transaction:
                Log.d("FAB", "QuickTransaction");
                break;
            case R.id.fab_create_transaction:
                Log.d("FAB", "Transaction");
                break;
            default:
                break;
        }
    }

    private void initElements() {

        //FAB elements
        fabCreateQuickTransaction = (FloatingActionButton) getView().findViewById(R.id.fab_create_quick_transaction);
        fabCreateTransaction = (FloatingActionButton) getView().findViewById(R.id.fab_create_transaction);
    }

    private void startListeners() {
        fabCreateQuickTransaction.setOnClickListener(this);
        fabCreateTransaction.setOnClickListener(this);
    }

}
