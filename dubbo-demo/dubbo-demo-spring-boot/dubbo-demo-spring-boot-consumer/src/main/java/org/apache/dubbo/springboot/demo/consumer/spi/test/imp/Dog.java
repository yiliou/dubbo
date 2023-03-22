package org.apache.dubbo.springboot.demo.consumer.spi.test.imp;

import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.springboot.demo.consumer.spi.test.Animal;

/**
 * Created by yiliou on 2023/3/22.
 * 如果接口和接口方法上没有@Adaptive
 * 想要获取getAdaptiveExtension扩展点
 * 需要在实现了上加@Adaptive
 * 如果有多个实现类，只能加载配置文件里最后一个扩展点
 */
@Adaptive
public class Dog implements Animal {

    @Override
    public void cry() {
        System.out.println("wang wang ....");
    }
}
