package org.example.行为型模式.备忘录模式.黑盒;


public class GameRole {
    private  int vit;
    private int atk;
    private int def;

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }



    //初始化
    public void init() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    //战斗
    public void fight() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    //保存角色状态
    public RoleStateMemento saveState() {
        return new RoleStateMemento(vit, atk ,def);
    }


    //恢复状态
    public void recoverState(Memento memento){
        RoleStateMemento roleStateMemento = (RoleStateMemento) memento;

        this.vit = roleStateMemento.getVit();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();


    }

    //展示状态功能
    public void stateDisplay(){
        System.out.println("角色生命:" + vit);
        System.out.println("角色攻击:" + atk);
        System.out.println("角色防御:" + def);
    }


    //私有内部类
    private class RoleStateMemento implements Memento {
        private  int vit;
        private int atk;

        public int getVit() {
            return vit;
        }

        public void setVit(int vit) {
            this.vit = vit;
        }

        public int getAtk() {
            return atk;
        }

        public void setAtk(int atk) {
            this.atk = atk;
        }

        public int getDef() {
            return def;
        }

        public void setDef(int def) {
            this.def = def;
        }

        public RoleStateMemento() {
        }

        public RoleStateMemento(int vit, int atk, int def) {
            this.vit = vit;
            this.atk = atk;
            this.def = def;
        }

        private int def;
    }
}
