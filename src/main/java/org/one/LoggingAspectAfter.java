package org.one;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class LoggingAspectAfter {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspectAfter.class);

    @After("@annotation(com.example.annotations.ToLog)")
    public void logAfter(JoinPoint joinPoint) {
        logger.info("After executing method: {}", joinPoint.getSignature().getName());
    }
}