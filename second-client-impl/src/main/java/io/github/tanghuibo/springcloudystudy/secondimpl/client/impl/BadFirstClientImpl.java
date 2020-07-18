package io.github.tanghuibo.springcloudystudy.secondimpl.client.impl;

import io.github.tanghuibo.springcloudystudy.firstclient.api.BadFirstClient;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author tanghuibo
 * @date 2020/7/17上午12:47
 */
@FeignClient(
        name = "first-client",
        contextId = "bad-first-client",
        //fallback BadFirstClientImpl就会注册实例，
        //还是用fallbackFactory方便
        fallbackFactory = BadFirstClientFallbackFactory.class
)
public interface BadFirstClientImpl extends BadFirstClient {
}
