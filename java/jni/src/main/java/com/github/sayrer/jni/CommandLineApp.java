package com.github.sayrer.jni;

import com.github.sayrer.basic.InfoPrinter;

public class CommandLineApp {
    public static void main(String args[]) {
        System.out.println("\n" + InfoPrinter.getString() + "\n");
        JNILib jl = new JNILib();
        System.out.println("\n" + jl.stringFromJNI() + "\n");
    }
}