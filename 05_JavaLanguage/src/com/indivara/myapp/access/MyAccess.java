package com.indivara.myapp.access;

public class MyAccess {
    private void methodPrivate(){
        System.out.println("Private Access");
    }
    public void methodPublic(){
        methodPrivate();
        System.out.println("Public Access");
    }
    protected void methodProtected(){
        System.out.println("Protected Access");
    }
    void methodDefault(){
        System.out.println("Default Access");
    }


}