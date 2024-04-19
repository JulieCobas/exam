package ch.etmles.payroll.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class EmployeeMinorsException extends RuntimeException {

    EmployeeMinorsException(String name){
        super("Hiring a minor employee is not legally possible : " + name);
    }
}