package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author yp
 * @description 观众，切面类
 * @date 2017/10/29 16:37
 */
@Aspect //将一个pojo定义为切面
public class Audience {
    /**
     * 定义命名的切点
     */
    @Pointcut("execution(** target.Performance.perform(..))")
    public void performance(){}

    /**
     * 环绕通知可以替换多个不同的前置通知和后置通知
     * @param joinPoint
     */
    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            joinPoint.proceed();
            System.out.println("CLAP CLAP CLAP");
        }catch (Throwable e){
            System.out.println("Demanding a refund");
        }
    }

    /**
     * 在表演之前调用
     */
    /*@Before("performance()")
    public void silenceCellsPhones(){
        System.out.println("Silencing cell phones");
    }

    *//**
     * 表演之前调用
     *//*
    @Before("performance()")
    public void takeSeats(){
        System.out.println("Taking seats");
    }

    *//**
     * 表演之后调用
     *//*
    @AfterReturning("performance()")
    public void applause(){
        System.out.println("CLAP CLAP CLAP");
    }

    *//**
     * 表演之后调用
     *//*
    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("Demanding a refund");
    }*/
}
