package edu.pingpong.EnZinlum;

import java.security.PrivateKey;
import java.security.PublicKey;

public class Address {
    
    private PublicKey publicDirection;
    private PrivateKey privateDirection;
    private double balance = 0.0;
    private final String symbol = "EZI";

    public Address(PublicKey publicDirection, PrivateKey privateDirection, 
        double balance){
        this.publicDirection = publicDirection;
        this.privateDirection = privateDirection;
        this.balance = balance;
    }

    public PublicKey getPublicDirection() {
        return publicDirection;
    }

    public void setPublicDirection(PublicKey publicDirection) {
        this.publicDirection = publicDirection;
    }

    public PrivateKey getPrivateDirection() {
        return privateDirection;
    }

    public void setPrivateDirection(PrivateKey privateDirection) {
        this.privateDirection = privateDirection;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void addEZI(Double EZI){
        //
    }
}
