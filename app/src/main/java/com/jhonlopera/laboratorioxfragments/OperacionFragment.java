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
import android.widget.TextView;


public class OperacionFragment extends Fragment implements View.OnClickListener {

    opintercafe Opinterface;
    Button bcalcular;
    Button bcalcular2;
    Button bcalcular3;
    TextView t;



    public OperacionFragment() {

    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_operacion, container, false);
        bcalcular =(Button) view.findViewById(R.id.bcalcular);
        bcalcular.setOnClickListener(this);
        bcalcular2 =(Button) view.findViewById(R.id.bcalcular2);
        bcalcular2.setOnClickListener(this);
        bcalcular3 =(Button) view.findViewById(R.id.bcalcular3);
        bcalcular3.setOnClickListener(this);
        t=(TextView) view.findViewById(R.id.tvf);



        Bundle bundle = getArguments();
        String nombre = bundle.getString("nombre");
        ((TextView) view.findViewById(R.id.tvf)).setText("Por ahora no hay nada");

        return view;
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Opinterface =(opintercafe) activity;
    }


    @Override
    public void onClick(View v) {
        if (v==bcalcular) {

            Opinterface.openDatafragment();

        }
        else if (v==bcalcular2){
            Bundle bundle = getArguments();
            String nombre = bundle.getString("nombre");
            cambiartexto(nombre);
        }
        else {
            Bundle bundle = getArguments();
            String nombre = bundle.getString("correo");
            cambiartexto(nombre);
        }

    }

    public  void cambiartexto(String mensaje){

        t.setText(mensaje);
    }

    public void cambiar_imagen(String foto){

    }
}
