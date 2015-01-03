package com.ktw.pattern.facade;

/**
 * Created by Kevin on 2014/11/5.
 */
public class Computer {
    private Cpu cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        cpu = new Cpu();
        memory = new Memory();
        disk = new Disk();
    }

    public void startup(){
        System.out.println("Computer starting up...");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("Welcome!");
    }

    public void shutdown(){
        System.out.println("Computer shutting down...");
        disk.shutdown();
        memory.shutdown();
        cpu.shutdown();
        System.out.println("Computer is off");
    }
}
