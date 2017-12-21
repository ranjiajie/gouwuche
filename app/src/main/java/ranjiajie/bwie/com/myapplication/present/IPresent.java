package ranjiajie.bwie.com.myapplication.present;

import java.util.List;

import ranjiajie.bwie.com.myapplication.model.bean.DataBean;
import ranjiajie.bwie.com.myapplication.model.bean.MsgBean;

/**
 * Created by Administrator on 2017/12/21/021.
 */

public interface IPresent {
    void delcont(String uid,String pid);
    void getcont(String uid);
    void delData(MsgBean msgBean);
    void getData(MsgBean<List<DataBean>> listMsgBean);
}
