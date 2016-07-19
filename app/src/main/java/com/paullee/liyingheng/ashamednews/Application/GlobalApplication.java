package com.paullee.liyingheng.ashamednews.application;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import com.paullee.liyingheng.ashamednews.UserInfo;

/**
 * Created by liyingheng on 16/7/17.
 */

public class GlobalApplication extends Application{

    public static final String BASE_URL_PATH="http://172.17.129.220/qiubai/";
    public static final String URL_BASE_AVATAR=BASE_URL_PATH+"Userimg/";
    public static final String URL_BASE_PIMG=BASE_URL_PATH+"Valueimg/";

    public static final String URL_HOT = BASE_URL_PATH + "ganhuo.php?start=0&end=5";
    public static final String URL_NEW = BASE_URL_PATH + "nencao.php?start=0&end=5";
    public static final String URL_TEXT = BASE_URL_PATH + "wenzi.php?start=0&end=5";

    public static final String URL_REGISTER = BASE_URL_PATH + "adduser.php";
    public static final String URL_LOGIN = BASE_URL_PATH + "login.php";
    public static final String URL_POSTNEW = BASE_URL_PATH + "addvalue.php";

    public static UserInfo userInfo = null;

}
