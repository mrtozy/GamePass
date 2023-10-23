package com.example.filmlerapp.data.entity;

import java.io.Serializable;

public class Filmler implements Serializable {
    private int id;

    private String resim;


    public Filmler() {
    }

    public Filmler(int id ,String resim) {
        this.id = id;

        this.resim = resim;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getResim() {
        return resim;
    }

    public void setResim(String resim) {
        this.resim = resim;
    }


}
