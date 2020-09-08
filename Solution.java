/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Meet Katrodiya
 */
public class Solution {
    public static void main(String[] args) throws IOException{
        Account ac1=new Account(10000,"Savings");
        Account ac2=new Account(10000,"Checking");
        int type,t,amount;
        Account temp;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Select account:");
            System.out.println("1.Checking account");
            System.out.println("2.Savings account");
            System.out.println("3.View transactions");
            System.out.println("4.Exit");
            type=sc.nextInt();
            if(type==4)
                break;
            
            System.out.println("1.Withdraw money");
            System.out.println("2.Deposit money");
            t=sc.nextInt();
            temp=(type==1)?ac2:ac1;
            
            if(t==1){
                System.out.println("Enter amount to withdraw:");
                amount=sc.nextInt();
                temp.withdrawMoney(amount);
                System.out.println(temp.getType() + " Account balance" + temp.getBalance());
            }
            else{
                System.out.println("Enter amount to be deposited");
                amount=sc.nextInt();
                temp.depositMoney(amount);
                System.out.println(temp.getType() + " Account balance" + temp.getBalance());
            }
        }
    }
}
