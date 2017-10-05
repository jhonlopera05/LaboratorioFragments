package com.jhonlopera.laboratorioxfragments;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;




public class DataFragment extends Fragment implements View.OnClickListener {

    opintercafe Opinterface;
    Button bcalcular;


    public DataFragment() {

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_data, container, false);
        bcalcular =(Button) view.findViewById(R.id.bcalcular2);
        bcalcular.setOnClickListener(this);
        return view;
    }
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        Opinterface =(opintercafe) activity;
    }


    @Override
    public void onClick(View v) {
        Opinterface.openOperationFragmet();
    }
}
