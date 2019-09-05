package com.dayee.controller;

import com.dayee.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xuruanshun on 2019/8/30.
 */
@RestController
@Slf4j
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping(value = "/addMemberAndEmial")
    public String addMemberAndEmial(){
        log.info("1");
        String result = memberService.addMemberAndEmial();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("4");
        return result;
    }


}
