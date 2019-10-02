package com.example.proteintracker6;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Mhs1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Mhs1Fragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

   SendMessage1 sm1;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Mhs1Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Mhs1Fragment newInstance(String param1, String param2) {
        Mhs1Fragment fragment = new Mhs1Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView txtNim2 = getView().findViewById(R.id.textViewfr2);
        txtNim2.setText(mParam1 + ", "+ mParam2);

    Button btnSave1 = (Button) view.findViewById(R.id.btnSave1);
        btnSave1.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
               sm1.SendData("dd");
            }
        });
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            sm1 =(Mhs1Fragment.SendMessage1) getActivity();
        } catch (ClassCastException e) {
            throw new ClassCastException("Error in retrieving data. Please Try Again");
        }
    }

    interface SendMessage1{
        void SendData(String Message);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mhs1, container, false);
    }

}
