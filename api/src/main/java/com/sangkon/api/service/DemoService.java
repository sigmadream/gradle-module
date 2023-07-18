package com.sangkon.api.service;

import com.sangkon.common.enums.CodeEnum;
import com.sangkon.common.enums.service.CommonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DemoService {

    private final CommonService commonService;

    public String save() {
        System.out.println(CodeEnum.SUCCESS.getCode());
        System.out.println(commonService.commonService());
        return "save";
    }

    public String find() {
        System.out.println(CodeEnum.UNKNOWN_ERROR.getCode());
        return "find";
    }
}
