package org.jlfang.concurrent.reentranlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Cris
 * @description 可重入锁Demo
 * @date 2019/7/25
 */
public class ReentrantLockDemo {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock(true);

        Thread t = new Thread();
        reentrantLock.lock();
        reentrantLock.unlock();

    }
}
