package com.example.jean.retrofitexample.presenter;

import com.example.jean.retrofitexample.model.Book;
import com.example.jean.retrofitexample.model.Country;
import com.example.jean.retrofitexample.model.Data;
import com.example.jean.retrofitexample.model.RestResponse;
import com.example.jean.retrofitexample.service.CountryService;
import com.example.jean.retrofitexample.view.CountryView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * This class represents the country view interface.
 *
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 29/07/16.
 * Jesus loves you.
 */
public class CountryPresenter {

    private CountryView countryView;
    private CountryService countryService;

    public CountryPresenter(CountryView view) {
        this.countryView = view;

        if (this.countryService == null) {
            this.countryService = new CountryService();
        }
    }

    public void getCountries() {
        countryService.getAPI().getResults().enqueue(new Callback<RestResponse>() {
            @Override
            public void onResponse(Call<RestResponse> call, Response<RestResponse> response) {
                RestResponse data = response.body();

                if (data != null && data.getResult() != null) {
                    List<Book> result = data.getResult();
                    countryView.countriesReady(result);
                }
            }

            @Override
            public void onFailure(Call<RestResponse> call, Throwable t) {
                try {
                           throw new InterruptedException("Something went wrong!");
                       } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
            }
        });

//       countryService.getAPI()
//               .getResults()
//               .enqueue(new Callback<Data>() {
//                    @Override
//            public void onResponse(Call<Data> call, Response<Data> response) {
//                Data data = response.body();
//
//                       if (data != null && data.getRestResponse() != null) {
//                            List<Book> result = data.getRestResponse().getResult();
//                          countryView.countriesReady(result);
//                       }
//                   }
//
//                   @Override
//                  public void onFailure(Call<Data> call, Throwable t) {
//                        try {
//                           throw new InterruptedException("Something went wrong!");
//                       } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                });
    }

}
