package com.example.jean.retrofitexample.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.jean.retrofitexample.R;
import com.example.jean.retrofitexample.model.Book;
import com.example.jean.retrofitexample.model.Country;
import com.example.jean.retrofitexample.model.Data;
import com.example.jean.retrofitexample.presenter.CountryPresenter;

import java.util.List;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity implements CountryView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CountryPresenter countryPresenter = new CountryPresenter(this);

        // Maybe it's best to call it on onResume()
        countryPresenter.getCountries();
    }


    @Override
    public void countriesReady(List<Book> books) {
        for (Book result1 : books) {
            Book book = null;
            Log.i("RETROFIT", book.getTitle() + "\n"
                    + " - Alpha2:  " + book.getTitle() + " \n"
                    + " - Alpha3: " + book.getBrief());
        }
    }
}


