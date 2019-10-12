package com.yao.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengjie_yao
 * @date 2019/10/1115:58
 */
public class Subject {

    /**
     * 存储所有的观察者
     */
    private List<Observer> observers = new ArrayList<Observer>();

    /**
     * 状态
     */
    private int state;

    /**
     * 订阅
     *
     * @param observer
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 通知所有订阅的观察者
     */
    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }
}
