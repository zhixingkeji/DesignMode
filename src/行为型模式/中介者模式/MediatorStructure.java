package org.example.行为型模式.中介者模式;

//具体中介者角色类
public class MediatorStructure extends Mediator{
    //聚合房主和租房者对象
    private HouseOwner owner;
    private Tenant tenant;

    public HouseOwner getOwner() {
        return owner;
    }

    public void setOwner(HouseOwner owner) {
        this.owner = owner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }


    @Override
    public void constact(String message, Person person) {
        if (person == owner) {
            tenant.getMessage(message);
        }else {
            owner.getMessage(message);
        }
    }
}
