package com.example.lzq.retrefit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private Button address;
    private Retrofit retrofit;
    private Button address_two;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        address = (Button) findViewById(R.id.bt_address);
        address_two = (Button) findViewById(R.id.bt_address_two);

        retrofit = new Retrofit.Builder()
                //这里建议：- Base URL: 总是以/结尾；- @Url: 不要以/开头
                .baseUrl("http://103.37.144.94:8086/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                getAddress();
//                getAddressTwo();
                getAddressTwoRxjava();
            }
        });
        address_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new secondActivity().getThisActivity(MainActivity.this);
            }
        });
    }

    private void getAddressTwoRxjava() {
        APIService APIserviceT = retrofit.create(APIService.class);
        Observable<AddressTwoBean> observableR  = APIserviceT.getAddressRxjavaBean("483410");
        observableR.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<AddressTwoBean>() {
                    @Override
                    public void onCompleted() {
                        Log.i("wxl", "onCompleted");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i("wxl", "e=" + e.getMessage());
                    }

                    @Override
                    public void onNext(AddressTwoBean weatherJson) {
                        Toast.makeText(MainActivity.this, "response=" + weatherJson.getResponseData().getResultList().get(0).getName(), Toast.LENGTH_SHORT).show();
                    }
                });


    }

    /*private void getAddressTwo() {
        APIService APIserviceT = retrofit.create(APIService.class);
        Call<AddressTwoBean> callAddressTwo = APIserviceT.getAddressTwoBean("483410");
        callAddressTwo.enqueue(new Callback<AddressTwoBean>() {
            @Override
            public void onResponse(Call<AddressTwoBean> call, Response<AddressTwoBean> response) {
                Toast.makeText(MainActivity.this, "response=" + response.body().getResponseData().getResultList().get(0).getName(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<AddressTwoBean> call, Throwable t) {

            }

        });*/

   /* private void getAddress() {

        APIService APIservice = retrofit.create(APIService.class);
        Call<FirstPageBean> callAddress = APIservice.getAddressBean();

        callAddress.enqueue(new Callback<FirstPageBean>() {

            @Override
            public void onResponse(Response<FirstPageBean> response) {
//                Log.i("wxl", "response=" + response.body().toString());
                Toast.makeText(MainActivity.this,"response="+response.body().getResponseData().get(0).getName(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });


    }*/
}
