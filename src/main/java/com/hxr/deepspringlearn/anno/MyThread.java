package com.hxr.deepspringlearn.anno;

public class MyThread implements Runnable {
    @Override
    public void run() {

        ThreadLocal<String> aa = new ThreadLocal<>();
        ThreadLocal<Integer> bb = new ThreadLocal<>();
        bb.set(1);

        aa.set("sda");
        System.out.println(aa.get());
        Integer integer = bb.get();
        bb.set(integer+1);
        bb.get();
    }
}
