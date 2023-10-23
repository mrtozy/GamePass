package com.example.filmlerapp.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.filmlerapp.R;
import com.example.filmlerapp.data.entity.Filmler;
import com.example.filmlerapp.databinding.FragmentAnasayfaBinding;
import com.example.filmlerapp.databinding.FragmentDetayBinding;

public class DetayFragment extends Fragment {
    private FragmentDetayBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetayBinding.inflate(inflater, container, false);

        DetayFragmentArgs bundle = DetayFragmentArgs.fromBundle(getArguments());
        Filmler film = bundle.getFilm();



        binding.ivFilm.setImageResource(
                getResources()
                        .getIdentifier(film.getResim(),"drawable",requireContext().getPackageName()));



        return binding.getRoot();
    }
}