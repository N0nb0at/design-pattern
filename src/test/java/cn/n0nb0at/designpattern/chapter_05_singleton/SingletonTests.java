package cn.n0nb0at.designpattern.chapter_05_singleton;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author guopeng
 * @date 2019-05-11
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SingletonTests {

    @Test
    public void singletonTest() {
        System.out.println("Start.");
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if (s1 == s2) {
            System.out.println("s1 与 s2 是相同的实例。");
        } else {
            System.out.println("s1 与 s2 是不同的实例");
        }
        System.out.println("End.");
    }
}
