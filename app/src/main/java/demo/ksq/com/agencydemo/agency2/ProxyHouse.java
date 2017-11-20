package demo.ksq.com.agencydemo.agency2;

import android.util.Log;


/**
 * Created by 黑白 on 2017/11/20.
 */

public class ProxyHouse implements IHouse {
    private final String TAG = ProxyHouse.class.getSimpleName();
    private IHouse house;

    public ProxyHouse(IHouse house){
        this.house = house;
    }

    @Override
    public void getHouseInfo() {
        Log.i(TAG, "searching");
        house.getHouseInfo();
        Log.i(TAG, "search finished");
    }

    @Override
    public void signContract() {
        Log.i(TAG, "prepare contract");
        house.signContract();
    }

    @Override
    public void payFees() {
        house.payFees();
    }

    @Override
    public IHouse getProxy() {
        return null;
    }
}
