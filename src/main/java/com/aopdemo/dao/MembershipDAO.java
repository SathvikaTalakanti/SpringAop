package com.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO
{

    public void addSillyMember()
    {
        System.out.println(getClass()+": Adding a membership accounts\n");
    }
    public  void goToSleep()
    {
        System.out.println(getClass() +":  going to sleep");
    }
}
