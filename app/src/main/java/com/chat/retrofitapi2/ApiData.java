package com.chat.retrofitapi2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ApiData {
    public int getSymbol;
    @SerializedName("result")
    @Expose
    private ArrayList<Result> result = null;

    public ArrayList<Result> getResult() {
        return result;
    }

    public void setResult(ArrayList<Result> result) {
        this.result = result;
    }

    public class Result {

        @SerializedName("message")
        @Expose
        private String message;
        @SerializedName("symbol")
        @Expose
        private String symbol;
        @SerializedName("bid")
        @Expose
        private String bid;
        @SerializedName("bidqty")
        @Expose
        private String bidqty;
        @SerializedName("ask")
        @Expose
        private String ask;
        @SerializedName("askqty")
        @Expose
        private String askqty;
        @SerializedName("ltp")
        @Expose
        private String ltp;
        @SerializedName("open")
        @Expose
        private String open;
        @SerializedName("close")
        @Expose
        private String close;
        @SerializedName("high")
        @Expose
        private String high;
        @SerializedName("low")
        @Expose
        private String low;
        @SerializedName("vol")
        @Expose
        private String vol;
        @SerializedName("oi")
        @Expose
        private String oi;
        @SerializedName("change")
        @Expose
        private String change;
        @SerializedName("netchange")
        @Expose
        private String netchange;
        @SerializedName("lotsize")
        @Expose
        private String lotsize;
        @SerializedName("ltt")
        @Expose
        private String ltt;
        @SerializedName("lut")
        @Expose
        private String lut;
        @SerializedName("expiry")
        @Expose
        private String expiry;
        @SerializedName("exchange")
        @Expose
        private String exchange;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public String getBid() {
            return bid;
        }

        public void setBid(String bid) {
            this.bid = bid;
        }

        public String getBidqty() {
            return bidqty;
        }

        public void setBidqty(String bidqty) {
            this.bidqty = bidqty;
        }

        public String getAsk() {
            return ask;
        }

        public void setAsk(String ask) {
            this.ask = ask;
        }

        public String getAskqty() {
            return askqty;
        }

        public void setAskqty(String askqty) {
            this.askqty = askqty;
        }

        public String getLtp() {
            return ltp;
        }

        public void setLtp(String ltp) {
            this.ltp = ltp;
        }

        public String getOpen() {
            return open;
        }

        public void setOpen(String open) {
            this.open = open;
        }

        public String getClose() {
            return close;
        }

        public void setClose(String close) {
            this.close = close;
        }

        public String getHigh() {
            return high;
        }

        public void setHigh(String high) {
            this.high = high;
        }

        public String getLow() {
            return low;
        }

        public void setLow(String low) {
            this.low = low;
        }

        public String getVol() {
            return vol;
        }

        public void setVol(String vol) {
            this.vol = vol;
        }

        public String getOi() {
            return oi;
        }

        public void setOi(String oi) {
            this.oi = oi;
        }

        public String getChange() {
            return change;
        }

        public void setChange(String change) {
            this.change = change;
        }

        public String getNetchange() {
            return netchange;
        }

        public void setNetchange(String netchange) {
            this.netchange = netchange;
        }

        public String getLotsize() {
            return lotsize;
        }

        public void setLotsize(String lotsize) {
            this.lotsize = lotsize;
        }

        public String getLtt() {
            return ltt;
        }

        public void setLtt(String ltt) {
            this.ltt = ltt;
        }

        public String getLut() {
            return lut;
        }

        public void setLut(String lut) {
            this.lut = lut;
        }

        public String getExpiry() {
            return expiry;
        }

        public void setExpiry(String expiry) {
            this.expiry = expiry;
        }

        public String getExchange() {
            return exchange;
        }

        public void setExchange(String exchange) {
            this.exchange = exchange;
        }

    }

}