package com.example.umcchapter4mission.test.exception;

import com.example.umcchapter4mission.global.apiPayload.code.BaseErrorCode;
import com.example.umcchapter4mission.global.apiPayload.exception.GeneralException;

public class TestException extends GeneralException {
    public TestException(BaseErrorCode code) {
        super(code);
    }
}

