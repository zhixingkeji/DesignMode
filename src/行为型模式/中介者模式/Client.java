package org.example.行为型模式.中介者模式;

public class Client {
    public static void main(String[] args) {
        MediatorStructure mediatorStructure = new MediatorStructure();

        Tenant tenant = new Tenant("租客",mediatorStructure);

        HouseOwner houseOwner = new HouseOwner("房主",mediatorStructure);

        mediatorStructure.setTenant(tenant);
        mediatorStructure.setOwner(houseOwner);

        tenant.constact("我想要租房子");
        houseOwner.constact("我这里有三间房,你要租吗");
    }
}
