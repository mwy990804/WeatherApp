package com.example.weatherapp.base;

import androidx.fragment.app.Fragment;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;


/*xutils加载网络数据的步骤
 * 1.声明整体模块
 *  2.执行网络请求操作
 * */
public class BaseFragment extends Fragment implements Callback.CommonCallback<String>{
    public void loadData(String path){
        RequestParams params = new RequestParams(path);
        x.http().get(params,this);

    }
//获取数据成功时，会回调的接口
    @Override
    public void onSuccess(String s) {

    }
//获取任务失败时会调用的接口
    @Override
    public void onError(Throwable throwable, boolean b) {

    }
//取消请求时，会调用的接口
    @Override
    public void onCancelled(CancelledException e) {

    }
//请求完成后会调用的接口
    @Override
    public void onFinished() {

    }
}
