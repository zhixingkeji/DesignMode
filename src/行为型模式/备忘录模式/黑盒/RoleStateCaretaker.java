package org.example.行为型模式.备忘录模式.黑盒;

import org.example.行为型模式.备忘录模式.白盒.RoleStateMemento;

public class RoleStateCaretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
