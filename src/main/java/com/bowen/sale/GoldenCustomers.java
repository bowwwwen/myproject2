package com.bowen.sale;

public class GoldenCustomers extends NormalCustomer{
    public GoldenCustomers (String id, int amount){
        this.id = id;
        this.amount = amount;

    }
    public void print(){
        float bonus = (amount/1000)*200;
        float free = (amount/1000)*200;
        float total = amount - free;
        if (total>1000){
            System.out.println(id + "\t" + amount + "\t" + total +"("+bonus+")");
        }else {
            System.out.println(id+"\t"+amount+"\t"+"\t"+total+"("+ bonus +")");
        }
    }
}
