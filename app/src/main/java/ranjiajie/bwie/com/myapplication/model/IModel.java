package ranjiajie.bwie.com.myapplication.model;

import ranjiajie.bwie.com.myapplication.present.IPresent;

/**
 * Created by Administrator on 2017/12/21/021.
 */

public interface IModel {
    void delData(IPresent iPresent, String uid, String pid);
    void getData(IPresent iPresent, String uid);
}
