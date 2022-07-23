package com.example.logtest;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



class LogTestApplicationTests {

    @Test
    void contextLoads() {
        Logger logger= LoggerFactory.getLogger(LogTestApplicationTests.class);
        logger.trace("trace");
        System.out.println("abc");

    }

}
