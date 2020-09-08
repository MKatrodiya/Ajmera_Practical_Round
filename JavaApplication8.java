/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class Account{
    private int balance;
    private String type;
    private File records;
    Account(int balance, String type) throws IOException{
        this.balance=balance;
        this.type=type;
        records=new File(type + ".txt");
        if(!records.exists())
            records.createNewFile();
    }
    public int getBalance(){
        return this.balance;
    }
    public String getType(){
        return this.type;
    }
    public void withdrawMoney(int amount) throws IOException{
        if(amount>balance){
            System.out.println("Insufficient balance");
            return;
        }
        if(amount%500!=0){
            System.out.println("Enter amount in multiples of 500");
        }
        else{
            String fname=this.type + ".txt";
            FileWriter fw=new FileWriter(fname,true);
            this.balance-=amount;
            System.out.println("Withdrawl successful");
            String temp="Debit" + "  " + amount ;
            for(int i=0;i<temp.length();i++){
                fw.append(temp.charAt(i));
            }
            fw.append('\n');
            fw.close();
        }
        
        
    }
    
    public void depositMoney(int amount) throws IOException{
        if(amount%500!=0){
            System.out.println("Enter amount in multiples of 500");
        }
        else{
            String fname=this.type + ".txt";
            FileWriter fw=new FileWriter(fname,true);
            this.balance+=amount;
            System.out.println("Money deposited successfully");
            String temp="Credit" + "  " + amount ;
            for(int i=0;i<temp.length();i++){
                fw.append(temp.charAt(i));
            }
            fw.append('\n');
            fw.close();
        }
        
    }
    
 
}