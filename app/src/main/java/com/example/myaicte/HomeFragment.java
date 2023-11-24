package com.example.myaicte;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    Button dashboard;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        TextView textbutton = view.findViewById(R.id.clickableText);
        TextView textbutton2 = view.findViewById(R.id.clickableText2);
        TextView textbutton3 = view.findViewById(R.id.clickableText3);

        ImageSlider imageSlider = view.findViewById(R.id.slider);
        ArrayList<SlideModel> slideModel = new ArrayList<>();

        slideModel.add(new SlideModel(R.drawable.img1, ScaleTypes.FIT));
        slideModel.add(new SlideModel(R.drawable.img2, ScaleTypes.FIT));
        slideModel.add(new SlideModel(R.drawable.img3, ScaleTypes.FIT));
        slideModel.add(new SlideModel(R.drawable.img4, ScaleTypes.FIT));

        imageSlider.setImageList(slideModel, ScaleTypes.FIT);


        textbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent intent = new Intent(getActivity(), WebActivity2.class);
                startActivity(intent);*/
                InternShipFragment internShipFragment = new InternShipFragment();

                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container,internShipFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }

        });

        textbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AcademyFragment academyFragment = new AcademyFragment();

                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container,academyFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }

        });

        textbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                KarmaFragment karmaFragment = new KarmaFragment();

                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container,karmaFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }

        });
        return view;

    }
}