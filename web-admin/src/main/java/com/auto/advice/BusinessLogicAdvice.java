//package com.auto.advice;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
///**
// * 业务通知
// */
//@Aspect
//@Component
//public class BusinessLogicAdvice {
//
//    /**
//     * 切入点
//     */
//    @Pointcut("execution(* com.auto.service.impl.*.*(..))")
//    public void businessLogicPoint(){
//
//    }
//
//    @Before("businessLogicPoint()")
//    public String businessLogicBefore(JoinPoint joinPoint){
//        String pointCutMethod = joinPoint.getSignature().getName();
//        return pointCutMethod;
//    }
//
//}
