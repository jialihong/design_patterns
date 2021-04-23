//package com.amity.design.atomic;
//
//import javax.xml.crypto.Data;
//import java.util.concurrent.locks.StampedLock;
//
///**
// * Created by Amity on 2021/3/11 下午 5:50
// */
//public class StampedSample {
//    private final StampedLock sl = new StampedLock();
//
//    void mutate() {
//        long stamp = sl.writeLock();
//        try {
//            write();
//        } finally {
//            sl.unlockWrite(stamp);
//        }
//    }
//
//    Data access() {
//        Long stamp = sl.tryOptimisticRead();
//        Data data = read();
//        if(!sl.validate(stamp)) {
//            stamp = sl.readLock();
//            try{
//                data = read();
//            }finally {
//                sl.unlockRead(stamp);
//            }
//        }
//        return data;
//    }
//}
