package com.example.filmlerapp.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.filmlerapp.R;
import com.example.filmlerapp.data.entity.Filmler;
import com.example.filmlerapp.databinding.CardTasarimBinding;
import com.example.filmlerapp.databinding.FragmentAnasayfaBinding;
import com.example.filmlerapp.ui.fragment.AnasayfaFragmentDirections;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class FilmlerAdapter extends RecyclerView.Adapter<FilmlerAdapter.CardTasarimTutucu> {
    private Context mContext;
    private List<Filmler> filmlerListesi;

    public FilmlerAdapter(Context mContext, List<Filmler> filmlerListesi) {
        this.mContext = mContext;
        this.filmlerListesi = filmlerListesi;
    }

    public class CardTasarimTutucu extends RecyclerView.ViewHolder{
        private CardTasarimBinding tasarim;

        public CardTasarimTutucu(CardTasarimBinding tasarim) {
            super(tasarim.getRoot());
            this.tasarim = tasarim;
        }
    }

    @NonNull
    @Override
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardTasarimBinding binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false);
        return new CardTasarimTutucu(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {//0,1,2
        Filmler film = filmlerListesi.get(position);
        CardTasarimBinding t = holder.tasarim;

        t.imageViewFilm.setImageResource(
                mContext.getResources()
                        .getIdentifier(film.getResim(),"drawable",mContext.getPackageName()));



        t.cardViewFilm.setOnClickListener(view -> {
            AnasayfaFragmentDirections.DetayGecis gecis = AnasayfaFragmentDirections.detayGecis(film);
            Navigation.findNavController(view).navigate(gecis);
        });
    }

    @Override
    public int getItemCount() {
        return filmlerListesi.size();//3
    }
}
