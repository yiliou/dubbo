package org.apache.dubbo.springboot.demo.consumer.spi.test.imp;

import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.springboot.demo.consumer.spi.test.Animal;

/**
 * Created by yiliou on 2023/3/22.
 */
@Adaptive
public class Cat implements Animal {
    @Override
    public void cry() {
        System.out.println("miao miao ....");
    }
}
