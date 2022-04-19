package com.daiancosta.interceptor.enums;

public enum ValidationType {
    REMOVE ("Removed"),
    CONFIABLE ("Confiable"),
    ANNONYMOUS ("Online");

    String value;

    ValidationType(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

}
