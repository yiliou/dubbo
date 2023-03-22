package org.apache.dubbo.springboot.demo.consumer.spi.test.imp;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.springboot.demo.consumer.spi.test.Car;

/**
 * Created by yiliou on 2022/11/14.
 */
public class CarWarpper2 implements Car {

    private Car car;

    public CarWarpper2(Car car) {
        this.car = car;
    }

    @Override
    public String getName() {
        System.out.println("wraper2.....");
        return this.car.getName();
    }

    @Override
    public String getName2(URL url) {
        System.out.println("wraper2.....");
        return car.getName2(url);
    }
}
