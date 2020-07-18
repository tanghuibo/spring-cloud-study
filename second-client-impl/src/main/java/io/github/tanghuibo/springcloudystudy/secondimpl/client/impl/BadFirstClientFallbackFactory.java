package io.github.tanghuibo.springcloudystudy.secondimpl.client.impl;


import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author tanghuibo
 * @date 2020/7/18下午11:37
 */

@Component
public class BadFirstClientFallbackFactory implements FallbackFactory<BadFirstClientImpl> {


    @Override
    public BadFirstClientImpl create(Throwable throwable) {

        return new BadFirstClientImpl() {

            @Override
            public String timeout(Integer millis) {
                return "from fallback";
            }
        };
    }
}
