package org.apache.dubbo.springboot.demo.consumer.spi.test;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.model.ApplicationModel;

/**
 * Created by luo.zhi.kun on 2022/11/14.
 */
public class SpiTest {

    public static void main(String[] args) {
        ExtensionLoader<Car> loader = ApplicationModel.defaultModel().getDefaultModule().getExtensionLoader(Car.class);
        Car adaptiveExtension = loader.getAdaptiveExtension();
//        System.out.println( adaptiveExtension.getName());
        System.out.println("=============================================");
        Car red = loader.getExtension("red");
        String name = red.getName();
        System.out.println(name);
        System.out.println("=============================================");

        URL url1 = URL.valueOf("http://localhost:8080/user?car=red");
        String name2 = adaptiveExtension.getName2(url1);
        System.out.println(name2);
        System.out.println("=============================================");

        ExtensionLoader<Person> extensionLoader = ApplicationModel.defaultModel().getDefaultModule().getExtensionLoader(Person.class);

        Person black = extensionLoader.getExtension("black");
        URL url = URL.valueOf("http://localhost:8080/user?car=black");
        String name1 = black.getCar().getName2(url);
        System.out.println(name1);


        System.out.println("=============================================");
        Animal animal = ApplicationModel.defaultModel().getDefaultModule().getAdaptiveExtension(Animal.class);
        animal.cry();

    }
}
