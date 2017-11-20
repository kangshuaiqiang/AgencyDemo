package demo.ksq.com.agencydemo.agency2;

import android.os.SystemClock;
import android.util.Log;

import java.text.SimpleDateFormat;


/**
 * Created by 黑白 on 2017/11/20.
 */

public class House implements IHouse {
    private final String TAG = House.class.getSimpleName();
    private String name;
    private double price;
    private IHouse proxy;

    public House(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public void getHouseInfo() {
        if (isProxy())
            Log.i(TAG, "House Info- name:" + name + "  ￥:" + price);
        else
            Log.i(TAG, "Please use correct proxy");
    }

    @Override
    public void signContract() {
        if (isProxy())
            Log.i(TAG, "Contract:" + name + "  signed at" +
                    new SimpleDateFormat("HH:mm:ss").format(SystemClock.uptimeMillis()));
        else
            Log.i(TAG, "Please use correct proxy");
    }

    @Override
    public void payFees() {
        if (isProxy())
            Log.i(TAG, "Bill: name-" + name + "  $-" + price);
        else
            Log.i(TAG, "Please use correct proxy");
    }

    @Override
    public IHouse getProxy() {
        if (null == proxy)
            proxy = new ProxyHouse(this);
        return proxy;
    }

    private boolean isProxy(){
        if (null == proxy)
            return false;
        else
            return true;
    }
}
