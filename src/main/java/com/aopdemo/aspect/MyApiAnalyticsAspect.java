package com.aopdemo.aspect;

import com.aopdemo.aspect.AopExpressions;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyApiAnalyticsAspect
{
    @Before("com.aopdemo.aspect.AopExpressions.forDaoPackageNoGetterSetter()")
    public  void performApiAnalytics()
    {
        System.out.println("\n=====>>> Executing @API analytics");
    }
}
