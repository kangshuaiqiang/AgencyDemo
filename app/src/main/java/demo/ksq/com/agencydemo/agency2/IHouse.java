package demo.ksq.com.agencydemo.agency2;

/**
 * Created by 黑白 on 2017/11/20.
 */

public interface IHouse {
    void getHouseInfo();
    void signContract();
    void payFees();
    IHouse getProxy();
}
