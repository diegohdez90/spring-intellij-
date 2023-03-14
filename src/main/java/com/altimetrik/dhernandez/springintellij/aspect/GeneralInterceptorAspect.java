package com.altimetrik.dhernandez.springintellij.aspect;

import com.altimetrik.dhernandez.springintellij.models.Pupil;
import com.altimetrik.dhernandez.springintellij.models.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.nio.channels.Pipe;

@Aspect
@Component
public class GeneralInterceptorAspect {

    private static final Logger log = LogManager.getLogger(GeneralInterceptorAspect.class);

    // @Pointcut("execution(* com.altimetrik.dhernandez.springintellij.controllers.*.*(..))")
    @Pointcut("@annotation(com.altimetrik.dhernandez.springintellij.annotations.MyAnnotation)")
    public void loggingPointCut() {

    }

    @Before("loggingPointCut()")
    public void before(JoinPoint joinPoint) {
        log.info("Before method invoked::" + joinPoint.getSignature());
    }

    @After("loggingPointCut()")
    public void after(JoinPoint joinPoint) {
        log.info("After method invoked::" + joinPoint.getSignature());
    }

    @AfterReturning(
            value = "execution(* com.altimetrik.dhernandez.springintellij.controllers.PupilController.*(..))",
            returning = "pupil"
    )
    public void afterReturning(JoinPoint joinPoint, Pupil pupil) {
        log.info("AfterReturning method invoked for student::" + pupil.toString());
    }

    @AfterThrowing(
            value = "execution(* com.altimetrik.dhernandez.springintellij.controllers.PupilController.*(..))",
            throwing = "e"
    )
    public void afterThrowing(JoinPoint joinPoint, Exception e) {
        log.info("AfterThrowing method invoked for student::" + e.getMessage());
    }

    @Around("loggingPointCut()")
    public Object around(ProceedingJoinPoint joinPoint)  throws  Throwable{
        log.info("Before method invoke at Around decorator::" + joinPoint.getSignature());
        Object object = joinPoint.proceed();
        if (object instanceof Pupil) {
            log.info("Around Pupil After method invoked..." + joinPoint.getSignature());
        } else if (object instanceof Student) {
            log.info("Around Student After method invoked..." + joinPoint.getSignature());
        }
        return object;
    }
}
