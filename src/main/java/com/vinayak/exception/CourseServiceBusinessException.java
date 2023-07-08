package com.vinayak.exception;

public class CourseServiceBusinessException extends RuntimeException{

    public CourseServiceBusinessException(String message) {
        super(message);
    }
}
