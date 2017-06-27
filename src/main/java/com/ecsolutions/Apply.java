package com.ecsolutions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Administrator on 2017/6/27.
 */
@Controller
public class Apply {

    public Apply() {
    }

    @GetMapping("/apply")
    public String getApplyPage() {
        return "index";
    }
}
