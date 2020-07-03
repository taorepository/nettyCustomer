package com.example.custom;

/**
 * @author: wtt
 * @create: 2020/07/01
 */
/**
 * 读取线程
 */
public class ThreadRead implements Runnable {
    private Poeple peo;

    public ThreadRead(Poeple peo) {
        this.peo = peo;
    }

    @Override
    public void run() {
        synchronized (peo) {
            System.out.println("ThreadRead");
            System.out.println(peo.getName());
            System.out.println(peo.getSex());
        }
    }
}