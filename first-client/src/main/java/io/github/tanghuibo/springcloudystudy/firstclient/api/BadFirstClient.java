package io.github.tanghuibo.springcloudystudy.firstclient.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author tanghuibo
 * @date 2020/7/17上午12:01
 */

@RequestMapping("badFirst")
public interface BadFirstClient {

    /**
     * 超时测试
     * @param millis 等待时间
     * @return “timeout”
     */
    @GetMapping("timeout")
    String timeout(@RequestParam("millis") Integer millis);
}
