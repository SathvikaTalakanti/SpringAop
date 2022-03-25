package com.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopExpressions
{
    @Pointcut("execution(* com.aopdemo.dao.*.*(..))")//(* * .. )is for class, method any parameters
    public   void forDaoPackage(){}

    //craete pointcut for getter
    @Pointcut("execution(* com.aopdemo.dao.*.get*(..))")
  public void getter(){}

    @Pointcut("execution(* com.aopdemo.dao.*.set*(..))")
   public  void setter(){}

    //create pointcut: include package .. exclude getter/setter
    @Pointcut("forDaoPackage() && !(getter() || setter())")
   public  void forDaoPackageNoGetterSetter(){}


}
