package org.one;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class LoggingAspectBefore {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspectBefore.class);

    @Before("@annotation(com.example.annotations.ToLog)")
    public void logBefore(JoinPoint joinPoint) {
        logger.info("Before executing method: {}", joinPoint.getSignature().getName());
    }
}