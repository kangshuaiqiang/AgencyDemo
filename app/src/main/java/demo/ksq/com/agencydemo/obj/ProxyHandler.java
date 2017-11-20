package demo.ksq.com.agencydemo.obj;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by 黑白 on 2017/11/20.
 */

public class ProxyHandler implements InvocationHandler {

    private final String TAG = ProxyHandler.class.getSimpleName();
    Object targetObj;

    public Object newProxyInstance(Object targetObj){
        this.targetObj = targetObj;
        return Proxy.newProxyInstance(targetObj.getClass().getClassLoader(),
                targetObj.getClass().getInterfaces(), this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object ret;
        Log.i(TAG, "method name:" + method.getName());
        ret = method.invoke(targetObj, args);
        return ret;
    }
}
