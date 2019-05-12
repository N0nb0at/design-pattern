package cn.n0nb0at.designpattern.chapter_06_prototype;

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
public class PrototypeTests {

    @Test
    public void prototypeTest() {
        // 准备
        Manager manager = new Manager();

        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox wBox = new MessageBox('*');
        MessageBox sBox = new MessageBox('/');

        manager.register("strong message", underlinePen);
        manager.register("warning box", wBox);
        manager.register("slash box", sBox);

        // 生产
        Product pStrong = manager.create("strong message");
        pStrong.use("Hello, strong message.");

        Product pWarning = manager.create("warning box");
        pWarning.use("Hello, warning box.");

        Product pSlash = manager.create("slash box");
        pSlash.use("Hello, slash box.");
    }
}
