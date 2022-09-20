package 代理模式.静态代理;

//代售点
public class ProxyPoint implements SellTickets{

    private TranStation tranStation = new TranStation();

    @Override
    public void sell() {
        System.out.println("收取中介费");
        tranStation.sell();

    }
}
