package org.apache.dubbo.springboot.demo.consumer.spi.test;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * Created by yiliou on 2022/11/14 14:13.
 */
@SPI
public interface Car {
//@Adaptive
    String getName();

    /**
     * @Adaptive 从请求URL中获取key（规范：UserService => user.service; Car => car）, key=car;
     * @Adaptive(value = {"a","b"}) 从请求URL中获取a的值, 如果没有a，再从URL中获取b的值,如果都找不到报错;
     * @param url
     * @return
     */
    @Adaptive
    String getName2(URL url);
}
