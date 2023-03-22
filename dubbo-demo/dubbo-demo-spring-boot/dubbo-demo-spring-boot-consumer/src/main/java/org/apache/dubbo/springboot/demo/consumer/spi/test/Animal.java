package org.apache.dubbo.springboot.demo.consumer.spi.test;

import org.apache.dubbo.common.extension.SPI;

/**
 * Created by yiliou on 2023/3/22 11:10.
 */
@SPI
public interface Animal {

    void cry();
}
