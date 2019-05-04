package cn.n0nb0at.designpattern.chapter_04_factory_method;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author guopeng
 * @date 2019-05-04
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FactoryMethodTests {

    @Test
    public void factoryMethodTest() {
        // 创建工厂
        Factory factory = new IDCardFactory();
        // 生产 ID 卡
        Product cardFoo = factory.create("Foo");
        Product cardBar = factory.create("Bar");
        Product cardBaz = factory.create("Baz");

        // ID 卡的使用
        cardFoo.use();
        cardBar.use();
        cardBaz.use();

    }
}
