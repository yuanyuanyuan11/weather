package base;

import androidx.appcompat.app.AppCompatActivity;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

public class BaseActivity extends AppCompatActivity implements Callback.CacheCallback<String> {
    public void loadData(String url){
        RequestParams params = new RequestParams(url);
        x.http().get(params,this);
    }
    @Override
    public boolean onCache(String result) {
        return false;
    }

    @Override
    public void onSuccess(String result) {

    }

    @Override
    public void onError(Throwable ex, boolean isOnCallback) {

    }

    @Override
    public void onCancelled(CancelledException cex) {

    }

    @Override
    public void onFinished() {

    }
}
