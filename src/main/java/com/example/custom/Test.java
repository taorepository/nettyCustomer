package com.example.custom;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

/**
 * @author: wtt
 * @create: 2020/07/01
 */
public class Test {

    public static void main(String[] args) {
        Semaphore s = new Semaphore(6);//信号量 同时处理三个线程
        List<Poeple> peo = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < 20; i++) {
            new Thread(new ThreadWrite(peo,count,s),"线程"+i).start();
            new Thread(new ThreadWrite(peo,count,s),"线程"+i).start();
            new Thread(new ThreadWrite(peo,count,s),"线程"+i).start();
            new Thread(new ThreadWrite(peo,count,s),"线程"+i).start();
            new Thread(new ThreadWrite(peo,count,s),"线程"+i).start();
            new Thread(new ThreadWrite(peo,count,s),"线程"+i).start();
        }
    }
}







