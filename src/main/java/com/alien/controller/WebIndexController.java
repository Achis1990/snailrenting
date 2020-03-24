package com.alien.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by alien on 2020/3/21 0021 15:09
 */
@Api(value = "网站首页")
@Log4j2
@Controller
@RequestMapping("/index")
public class WebIndexController {

    /**
     * 网站浏览量 访问index页面数量+1 表记录
     * 用户登录量 用户登陆 次数+1 用户表记录
     * 房屋浏览量 房屋详情+1 房屋总浏览量 计算count
     */

    /**
     * 用户申请房东审核（实名认证）
     * 用户成为租客身份变更
     */

    @ApiOperation(value = "网站首页页面")
    @RequestMapping("/Web_index")
    public ModelAndView Web_index() {
        log.info("网站首页页面");
        ModelAndView modelAndView = new ModelAndView("/Web_index");
        modelAndView.addObject("checkword", "ALIEN");
        return modelAndView;
    }


}