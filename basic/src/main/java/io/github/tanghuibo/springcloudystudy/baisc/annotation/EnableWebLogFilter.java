package io.github.tanghuibo.springcloudystudy.baisc.annotation;

import io.github.tanghuibo.springcloudystudy.baisc.config.WebLogHttpFilter;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author tanghuibo
 * @date 2020/7/14下午11:33
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(WebLogHttpFilter.class)
public @interface EnableWebLogFilter {
}
