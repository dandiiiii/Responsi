package com.example.jean.retrofitexample.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 29/07/16.
 * Jesus loves you.
 */
public class RestResponse {

    @SerializedName("success")
    private Boolean messages;

    @SerializedName("Data")
    private List<Book> result;

    public List<Book> getResult() {
        return result;
    }

    public Boolean getMessages() {
        return messages;
    }

}