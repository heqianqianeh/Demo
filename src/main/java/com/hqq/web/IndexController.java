package com.hqq.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Package: com.hqq.web
 * User: 何芊芊
 * Email: heqianqian1@jd.com
 * Date: 2017/11/6
 * Time: 18:01
 * Description:
 */
@Controller
public class IndexController {


    @RequestMapping("/index")
    public String index() {
        return "home";
    }
}
