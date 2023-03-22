package org.apache.dubbo.springboot.demo.consumer.spi.test.imp;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.springboot.demo.consumer.spi.test.Car;

/**
 * Created by yiliou on 2022/11/14.
 */
//@Adaptive
public class RedCar implements Car {
    @Override
    public String getName() {
        return "red";
    }

    @Override
    public String getName2(URL url) {
        return "redCar2";
    }
}
