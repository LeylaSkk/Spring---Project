package tn.esprit.skouri_leila.configuration;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Aspect
@Component
@Slf4j
public class ExamAOP {
    @Before("execution(* tn.esprit.skouri_leila.services.*.*(..))")
   // @After("execution(* tn.esprit.skouri_leila.services.*.*(..))")
    //@AfterReturning("execution(* tn.esprit.skouri_leila.services.*.*(..))")
        //@AfterThrowing("execution(* tn.esprit.skouri_leila.services.*.*(..))")
        //@Around("execution(* tn.esprit.skouri_leila.services.*.*(..))")

    public void logMethodEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Welcomen to one of the services of the Boycott application : " + name + " : ");
    }

    /*@Around("execution(* tn.esprit.skouri_leila.services.*.*(..))")
    Object methodAround(ProceedingJoinPoint pjp )throws Throwable{
     LocalDate start=LocalDate.now();
    Object obj =pjp.proceed();
    Object time=LocalDate.now().compareTo(start);
    log.info("execution response time = " +time);
    return obj;
    }*/

}
