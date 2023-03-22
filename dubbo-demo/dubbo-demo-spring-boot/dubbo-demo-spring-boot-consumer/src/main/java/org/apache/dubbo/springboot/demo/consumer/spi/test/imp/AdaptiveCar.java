package org.apache.dubbo.springboot.demo.consumer.spi.test.imp;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.springboot.demo.consumer.spi.test.Car;

/**
 * Created by luo.zhi.kun on 2022/11/14.
 */
//@Adaptive
public class AdaptiveCar implements Car {
    @Override
    public String getName() {
        return "adaptive";
    }

    @Override
    public String getName2(URL url) {
        return "AdaptiveCar2";
    }
}
