package 代理模式.jdk动态代理;

//火车站
public class TranStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
