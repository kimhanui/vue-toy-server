package com.example.vuetoyserver.common.utils;

public class CommonUtils {
    public static boolean isStringEmpty(String str){
        if(str == null || str==""){
            return true;
        }
        return false;
    }
}
