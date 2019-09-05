package com.dayee.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by xuruanshun on 2019/8/30.
 */
@Service
@Slf4j
public class MemberService {

    @Async
    public String addMemberAndEmial(){
        log.info("2");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("3");
        return "success";
    }
}
