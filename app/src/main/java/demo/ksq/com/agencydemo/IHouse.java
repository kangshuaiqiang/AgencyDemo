package demo.ksq.com.agencydemo;

/**
 * Created by 黑白 on 2017/11/20.
 *  根据场景先定义一个抽象主题,IHouse,提供三个方法,分别是获取房屋信息,签合同和付租金.
 */

public interface IHouse {
    void getHouseInfo();
    void signContract();
    void payFees();
}
