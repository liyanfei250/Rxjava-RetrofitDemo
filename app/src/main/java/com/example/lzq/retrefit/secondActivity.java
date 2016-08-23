package com.example.lzq.retrefit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import fixUse.AddressFixBean;
import fixUse.Network;
import fixUse.ObFixserver;
import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import util.NetworkDialogUtils;
import util.ToastUtils;

public class secondActivity extends AppCompatActivity implements View.OnClickListener{

    private Button bt_address_two;
    protected Subscription subscription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        NetworkDialogUtils.init(this);

        bt_address_two = (Button) findViewById(R.id.bt_address_two);
        bt_address_two.setOnClickListener(this);
    }

    Observer<AddressFixBean> observer = new ObFixserver<AddressFixBean>() {
        @Override
        public void onSuccess(AddressFixBean s) {
            Toast.makeText(secondActivity.this, "response1=" + s.getResponseData().getResultList().get(0).getName(), Toast.LENGTH_SHORT).show();
            ToastUtils.getInstance().showToast("response2=" + s.getResponseData().getResultList().get(0).getName());
        }
    };

    private void getThreeAddress() {
        subscription = Network.getAddressServiceApi()
                .getAddressFixBean("483410")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    public void getThisActivity(Context context) {
        context.startActivity(new Intent(context, secondActivity.class));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt_address_two:
//                getAddressTwoRxjava();
                getThreeAddress();
                break;
        }
    }

    private void getAddressTwoRxjava() {
        Observable<AddressFixBean> observableR  = Network.getAddressServiceApi().getAddressFixBean("483410");
        observableR.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<AddressFixBean>() {
                    @Override
                    public void onCompleted() {
                        Log.i("wxl", "onCompleted");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i("wxl", "e=" + e.getMessage());
                    }

                    @Override
                    public void onNext(AddressFixBean weatherJson) {
                        Toast.makeText(secondActivity.this, "response=" + weatherJson.getResponseData().getResultList().get(0).getName(), Toast.LENGTH_SHORT).show();
                        NetworkDialogUtils.getInstance().HideNetworkDialog();
                    }
                });


    }
}
