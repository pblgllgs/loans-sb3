package com.pblgllgs.loans.exception;
/*
 *
 * @author pblgl
 * Created on 08-01-2024
 *
 */

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class LoanAlreadyExistsException extends RuntimeException{

    public LoanAlreadyExistsException(String message) {
        super(message);
    }
}
