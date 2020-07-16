package io.github.tanghuibo.springcloudystudy.secondimpl.client.impl;

import io.github.tanghuibo.springcloudystudy.firstclient.api.FirstClient;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author tanghuibo
 * @date 2020/7/17上午12:47
 */
@FeignClient(
        name = "first-client"
)
public interface FirstClientImpl extends FirstClient {
}
