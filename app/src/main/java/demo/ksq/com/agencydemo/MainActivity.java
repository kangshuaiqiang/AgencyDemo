package demo.ksq.com.agencydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import demo.ksq.com.agencydemo.obj.ProxyHandler;

public class MainActivity extends AppCompatActivity {
    private final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //简单代理
        test();
        //动态代理
        test_2();
        

    }

    private void test_2() {
        ProxyHandler proxy = new ProxyHandler();
        IHouse house = (IHouse) proxy.newProxyInstance(new House("Downton Abbey", 5000));
        Log.i(TAG, "looking for a perfect house");
        house.getHouseInfo();
        Log.i(TAG, "thinking");
        house.signContract();
        house.payFees();
        Log.i(TAG, "so easy");
    }

    private void test() {
        IHouse house = new House("Downton Abbey", 5000);
        IHouse proxyHouse = new ProxyHouse(house);
        Log.i(TAG, "looking for a perfect house");
        proxyHouse.getHouseInfo();
        Log.i(TAG, "thinking");
        proxyHouse.signContract();
        proxyHouse.payFees();
        Log.i(TAG, "so easy");
    }
}
