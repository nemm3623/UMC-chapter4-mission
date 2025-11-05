package com.example.umcchapter4mission.test.service.query;


import com.example.umcchapter4mission.test.exception.TestException;
import com.example.umcchapter4mission.test.exception.code.TestErrorCode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestQueryServiceImpl implements TestQueryService {

    @Override
        public void checkFlag(Long flag){
            if (flag == 1){
                throw new TestException(TestErrorCode.TEST_EXCEPTION);
            }
        }
}

