package org.openSource.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 张玉明
 * @see 用来统配跳转页面
 * @date 2019-6-23
 */
@Controller(value = "publicController")
@RequestMapping(value = "/page")
public class PublicController {

    /**
     *
     * @param url1 一个url地址
     * @return 返回视图让thymeleaf视图解析器进行解析
     */
    @RequestMapping(value = "/{url1}")
    public String oneUrlParam(
            @PathVariable(value = "url1") String url1
    ) {
        return url1;
    }

    /**
     *
     * @param url1 第一个url地址
     * @param url2 第二个url地址
     * @return 返回视图让thymeleaf视图解析器进行解析
     */
    @RequestMapping(value = "/{url1}/{url2}")
    public String twoUrlParam(
            @PathVariable(value = "url1") String url1,
            @PathVariable(value = "url2") String url2
    ) {
        return url1 + "/" + url2;
    }

    /**
     *
     * @param url1 第一个url地址
     * @param url2 第二个url地址
     * @param url3 第三个url地址
     * @return 返回视图让thymeleaf视图解析器进行解析
     */
    @RequestMapping(value = "/{url1}/{url2}/{url3}")
    public String threeUrlParam(
            @PathVariable(value = "url1") String url1,
            @PathVariable(value = "url2") String url2,
            @PathVariable(value = "url3") String url3
    ) {
        return url1 + "/" + url2 + "/" + url3;
    }

    /**
     *
     * @param url1 第一个url地址
     * @param url2 第二个url地址
     * @param url3 第三个url地址
     * @param url4 第四个url地址
     * @return 返回视图让thymeleaf视图解析器进行解析
     */
    @RequestMapping(value = "/{url1}/{url2}/{url3}/{url4}")
    public String fourUrlParam(
            @PathVariable(value = "url1") String url1,
            @PathVariable(value = "url2") String url2,
            @PathVariable(value = "url3") String url3,
            @PathVariable(value = "url4") String url4
    ) {
        return url1 + "/" + url2 + "/" + url3 + "/" + url4;
    }

}
