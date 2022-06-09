package com.sam.demolibsp.demosplib;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Handler  {
	@ExceptionHandler(Exception.class)
    public void uncaughtException(Exception e) {
        SpringBootBrakeDemo.notifier.report(e);
       
    }
}
