package fixUse;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by LYF on 2016/8/23.
 */
public interface AddressService {
    @GET("user_getAcceptAddr.do")
    Observable<AddressFixBean> getAddressFixBean(@Query("userId")String userId);
}
