package com.ug11.instapost;

public class EmailException extends Exception {

    private String errorMessage;
    private int errorCode;

    public String getErrorMessage() {
        return errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public EmailException(int kodeeror){
        super();
        this.errorCode =kodeeror;
        if(kodeeror == 1){
            this.errorMessage = "Login Gagal! Email yang anda masukan tidak valid";
        }else if(kodeeror == 2){
            this.errorMessage = "Login Gagal! Email anda tidak terdaftar di google";
        }
    }
}
