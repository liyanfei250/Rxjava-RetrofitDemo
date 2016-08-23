package fixUse;

import retrofit2.adapter.rxjava.HttpException;
import rx.Observer;
import util.Logger;
import util.NetworkDialogUtils;
import util.ToastUtils;

/**
 * Created by LYF on 2016/8/23.
 */
public abstract class ObFixserver<T> implements Observer<T> {

    /*@Override
            public void onStart() {
                super.onStart();
            }*/
    @Override
    public void onCompleted() {
        NetworkDialogUtils.getInstance().HideNetworkDialog();
    }

    @Override
    public void onError(Throwable e) {
        NetworkDialogUtils.getInstance().HideNetworkDialog();
        Logger.e(this, e.getMessage());
        e.printStackTrace();
        //在这里做全局的错误处理
        if (e instanceof HttpException) {
            ToastUtils.getInstance().showToast(e.getMessage());
        }
        ToastUtils.getInstance().showToast(e.getMessage());

    }

    @Override
    public void onNext(T t) {
        onSuccess(t);
    }

    public abstract void onSuccess(T t);
}
