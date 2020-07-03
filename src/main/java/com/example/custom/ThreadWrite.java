package com.example.custom;

/**
 * @author: wtt
 * @create: 2020/07/01
 */

import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

/**
 * 写线程
 */
public class ThreadWrite implements Runnable {
    private Poeple peo;
    private Integer count;
    private Semaphore s;
    private List<Poeple> peoList;

    public ThreadWrite(List<Poeple> peoList, Integer count, Semaphore s) {
        this.peoList = peoList;
        this.count = count;
        this.s = s;
    }

    @Override
    public void run() {
        /*信号量*/
        try {
            s.acquire();//获取锁
            System.out.println("ThreadWrite");
            Poeple poeple = new Poeple();
            poeple.setName("name1");
            poeple.setSex("nv");
            peoList.add(poeple);
            System.out.println(Thread.currentThread().getName() + "=========>" + peoList.size());
            s.release();//释放锁
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}