package com.chat.retrofitapi2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class LoginData {

    @SerializedName("description")
    @Expose
    private Description description;
    @SerializedName("response")
    @Expose
    private Response response;

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }



    public class Description {

        @SerializedName("result")
        @Expose
        private String result;
        @SerializedName("status")
        @Expose
        private String status;

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

    }
    public class Response {

        @SerializedName("AuthToken")
        @Expose
        private String authToken;
        @SerializedName("ExpiresOn")
        @Expose
        private String expiresOn;
        @SerializedName("IssuedOn")
        @Expose
        private String issuedOn;

        public String getAuthToken() {
            return authToken;
        }

        public void setAuthToken(String authToken) {
            this.authToken = authToken;
        }

        public String getExpiresOn() {
            return expiresOn;
        }

        public void setExpiresOn(String expiresOn) {
            this.expiresOn = expiresOn;
        }

        public String getIssuedOn() {
            return issuedOn;
        }

        public void setIssuedOn(String issuedOn) {
            this.issuedOn = issuedOn;
        }

    }

}
