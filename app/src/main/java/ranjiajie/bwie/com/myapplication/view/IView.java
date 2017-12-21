package ranjiajie.bwie.com.myapplication.view;

import java.util.List;

import ranjiajie.bwie.com.myapplication.model.bean.DataBean;
import ranjiajie.bwie.com.myapplication.model.bean.MsgBean;

/**
 * Created by Administrator on 2017/12/21/021.
 */

public interface IView {
    void onSuccess(MsgBean<List<DataBean>> listMsgBean);
    void onFailed(Exception e);
    void delSuccess(MsgBean msgBean);
}
