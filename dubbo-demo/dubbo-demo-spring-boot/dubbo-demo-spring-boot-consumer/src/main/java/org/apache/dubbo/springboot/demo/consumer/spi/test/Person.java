package org.apache.dubbo.springboot.demo.consumer.spi.test;

import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * Created by yiliou on 2022/11/14 14:32.
 */
@SPI

public interface Person {
    Car getCar();
}
