package com.github.sayrer.jni;

public class JNILib {
    static {
        System.loadLibrary("democpp");
    }
    public native String stringFromJNI();
}