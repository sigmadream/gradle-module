package com.sangkon.api.service;

import com.sangkon.common.enums.CodeEnum;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public String save() {
        System.out.println(CodeEnum.SUCCESS.getCode());
        return "save";
    }

    public String find() {
        System.out.println(CodeEnum.UNKNOWN_ERROR.getCode());
        return "find";
    }
}
