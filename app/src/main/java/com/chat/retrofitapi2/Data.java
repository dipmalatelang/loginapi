package com.chat.retrofitapi2;

import java.util.ArrayList;

public class Data   {

    private String message;
    private String symbol;
    private String bid;
     public Data(){ }
    public Data(String message, String symbol, String bid) {
        this.message = message;
        this.symbol = symbol;
        this.bid = bid;
    }



}
