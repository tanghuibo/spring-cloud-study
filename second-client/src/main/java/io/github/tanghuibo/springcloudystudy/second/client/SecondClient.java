package io.github.tanghuibo.springcloudystudy.second.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author tanghuibo
 * @date 2020/7/17上午12:33
 */
@RequestMapping("second")
public interface SecondClient {

    /**
     * 说你好
     * @param username 用户名
     * @return 问候语
     */
    @GetMapping("sayHello")
    String sayHello(@RequestParam("username") String username);
}