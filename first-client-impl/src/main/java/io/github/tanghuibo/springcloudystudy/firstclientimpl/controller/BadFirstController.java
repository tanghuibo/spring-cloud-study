package io.github.tanghuibo.springcloudystudy.firstclientimpl.controller;

import io.github.tanghuibo.springcloudystudy.firstclient.api.BadFirstClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tanghuibo
 * @date 2020/7/18下午10:59
 */
@RestController
public class BadFirstController implements BadFirstClient {
    @Override
    public String timeout(Integer millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "timeout";
    }
}
