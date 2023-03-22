package org.apache.dubbo.springboot.demo.consumer.spi.test.imp;

import org.apache.dubbo.springboot.demo.consumer.spi.test.Car;
import org.apache.dubbo.springboot.demo.consumer.spi.test.Person;

/**
 * Created by yiliou on 2022/11/14.
 */
public class BlackPerson implements Person {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public Car getCar() {
        System.out.println("black person.....");
        return this.car;
    }
}
