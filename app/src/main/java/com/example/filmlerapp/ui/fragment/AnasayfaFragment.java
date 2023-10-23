package com.example.filmlerapp.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.filmlerapp.R;
import com.example.filmlerapp.data.entity.Filmler;
import com.example.filmlerapp.databinding.FragmentAnasayfaBinding;
import com.example.filmlerapp.ui.adapter.FilmlerAdapter;

import java.util.ArrayList;


public class AnasayfaFragment extends Fragment {
    private FragmentAnasayfaBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false);



        binding.filmRv.setLayoutManager(
                new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));

        ArrayList<Filmler> filmlerListesi = new ArrayList<>();
        Filmler f1 = new Filmler(1,"mw3");
        Filmler f2 = new Filmler(2,"lf");
        Filmler f3 = new Filmler(3,"fc24");
        Filmler f4 = new Filmler(4,"mk11");


        filmlerListesi.add(f1);
        filmlerListesi.add(f2);
        filmlerListesi.add(f3);
        filmlerListesi.add(f4);


        FilmlerAdapter filmlerAdapter = new FilmlerAdapter(requireContext(),filmlerListesi);
        binding.filmRv.setAdapter(filmlerAdapter);

        return binding.getRoot();
    }
}