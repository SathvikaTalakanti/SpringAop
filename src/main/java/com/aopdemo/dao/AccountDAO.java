package com.aopdemo.dao;


import com.aopdemo.Account;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDAO
{
   private  String name;
   private  String serviceCode;

   // add a new method
    public List<Account> findAccounts(boolean tripWire)
    {
        // for academic purpose ... simulate an exception
        if (tripWire) {
            throw new RuntimeException("No soup for you!!!");
        }

        List<Account> myAccounts=new ArrayList<>();

        // create sample accounts
        Account temp1=new Account("Jhon","silver");
        Account temp2=new Account("Sathvika","Platinum");
        Account temp3=new Account("Luca","Gold");

        // add them to our accounts list

        myAccounts.add(temp1);
        myAccounts.add(temp2);
        myAccounts.add(temp3);

        return  myAccounts;

    }




    public  void addAccount(Account theAccount,boolean vipFlag)
    {
        System.out.println(getClass()+ " : Adding account");

    }
    public boolean doWork()
    {
        System.out.println(getClass() + ": dowork()");
        return false;
    }

    public void setName(String name)
    {
        System.out.println(getClass() + ":in setName");
        this.name = name;
    }

    public String getName()
    {
        System.out.println(getClass() + ":in getName");
        return name;
    }

    public String getServiceCode()
    {
        System.out.println(getClass() + ":in getServiceCode");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode)
    {
        System.out.println(getClass() + ":in setServiceCode");
        this.serviceCode = serviceCode;
    }
}
