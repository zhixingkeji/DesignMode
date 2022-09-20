package org.example.行为型模式.备忘录模式.黑盒;



//白盒备忘录 客户端和管理者不能操作备忘录
public class Client {
    public static void main(String[] args) {


        System.out.println("-----------大战boss前----------");
        //创建对象
       GameRole gameRole =  new GameRole();
        // 初始化
        gameRole.init();
        //展示
        gameRole.stateDisplay();

        //备份
       RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setMemento(gameRole.saveState());

        System.out.println("-----------大战boss后----------");
        // 损耗严重
        gameRole.fight();
        //展示
        gameRole.stateDisplay();

        System.out.println("-----------重新挑战----------");
        //恢复之前的状态
        gameRole.recoverState(roleStateCaretaker.getMemento());
        //展示
        gameRole.stateDisplay();


    }
}
