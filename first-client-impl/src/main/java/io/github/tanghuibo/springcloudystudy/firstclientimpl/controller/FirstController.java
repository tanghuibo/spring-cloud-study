package io.github.tanghuibo.springcloudystudy.firstclientimpl.controller;

import io.github.tanghuibo.springcloudystudy.firstclient.api.FirstClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tanghuibo
 * @date 2020/7/14下午11:12
 */
@RestController
public class FirstController implements FirstClient {


    @Override
    public String sayHello(String username) {
        return String.format("hello %s, I am first client", username);
    }
}
