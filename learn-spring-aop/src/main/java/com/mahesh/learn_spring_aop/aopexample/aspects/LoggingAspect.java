package com.mahesh.learn_spring_aop.aopexample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Before("com.mahesh.learn_spring_aop.aopexample.aspects.CommonPointcutConfig.allPackageConfigUsingBean()")
	public void logMethodBeforeCall(JoinPoint joinPoint) {
		logger.info("Before Aspect - Logged Method: {} called with arguments {}", joinPoint, joinPoint.getArgs());
	}
	
	@After("com.mahesh.learn_spring_aop.aopexample.aspects.CommonPointcutConfig.businessPackageConfig()")
	public void logMethodAfterCall(JoinPoint joinPoint) {
		logger.info("After Aspect - Logged Method: {} called with arguments {} ", joinPoint, joinPoint.getArgs());
	}
	
	@AfterThrowing(
			pointcut = "com.mahesh.learn_spring_aop.aopexample.aspects.CommonPointcutConfig.businessAndDataPackageConfig()",
			throwing = "exception")
	public void logMethodAfterThrowingCall(JoinPoint joinPoint, Exception exception) {
		logger.info("AfterThrowing Aspect - Logged Method: {} called with arguments {} exception {}", joinPoint, joinPoint.getArgs(), exception);
	}
	
	@AfterReturning(
			pointcut = "com.mahesh.learn_spring_aop.aopexample.aspects.CommonPointcutConfig.dataPackageConfig()",
			returning ="returnValue")
	public void logMethodAfterReturningCall(JoinPoint joinPoint) {
		logger.info("AfterReturning Aspect - Logged Method: {} called with arguments", joinPoint, joinPoint.getArgs());
	}
	
}
