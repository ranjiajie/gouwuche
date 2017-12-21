package ranjiajie.bwie.com.myapplication.utils;

import java.util.List;

import io.reactivex.Observable;
import ranjiajie.bwie.com.myapplication.model.bean.DataBean;
import ranjiajie.bwie.com.myapplication.model.bean.MsgBean;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2017/12/21/021.
 */

public interface ServiceApi {
    @GET("product/getCarts")
    Observable<MsgBean<List<DataBean>>> getDatas(@Query("uid") String uid, @Query("source") String source);
    @GET("product/deleteCart")
    Observable<MsgBean> deleteData(@Query("uid") String uid, @Query("pid") String pid,@Query("source") String source);
}
