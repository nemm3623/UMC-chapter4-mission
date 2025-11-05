package com.example.umcchapter4mission.global.apiPayload.exception;

import com.example.umcchapter4mission.global.apiPayload.code.BaseErrorCode;

public class TestException extends GeneralException{
    public TestException(BaseErrorCode code) {
        super(code);
    }
}

