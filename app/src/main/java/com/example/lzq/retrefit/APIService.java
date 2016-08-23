package com.example.lzq.retrefit;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by LYF on 2016/8/22.
 */
public interface APIService {

    @GET("course_getHomePage.do")
    Call<FirstPageBean> getAddressBean();

    @GET("user_getAcceptAddr.do")
    Call<AddressTwoBean> getAddressTwoBean(@Query("userId")String userId);

    @GET("user_getAcceptAddr.do")
    Observable<AddressTwoBean> getAddressRxjavaBean(@Query("userId")String userId);
}
