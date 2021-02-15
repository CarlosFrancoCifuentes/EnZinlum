package edu.pingpong.EnZinlum;

import java.rmi.server.Skeleton;
import java.security.PrivateKey;
import java.security.PublicKey;

public class Address {
    
    private PublicKey PK = null;
    private PrivateKey SK = null;
    private double balance = 0.0;
    private final String symbol = "EZI";

    public Address(PublicKey publicDirection, PrivateKey privateDirection, 
        double balance){
        this.PK = publicDirection;
        this.SK = privateDirection;
        this.balance = balance;
    }

    private PublicKey getPublicDirection() {
        return this.PK;
    }

    public void setPublicDirection(PublicKey publicDirection) {
        this.PK = publicDirection;
    }

    private PrivateKey getPrivateDirection() {
        return this.SK;
    }

    private void setPrivateDirection(PrivateKey privateDirection) {
        this.SK = privateDirection;
    }

    double getBalance() {
        return this.balance;
    }

    boolean isSKpresent(){
        return this.getPrivateDirection() != null ? true : false;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void addEZI(Double EZI){
        //
    }
}
