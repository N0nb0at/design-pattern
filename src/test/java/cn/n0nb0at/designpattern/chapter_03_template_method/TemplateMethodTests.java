package cn.n0nb0at.designpattern.chapter_03_template_method;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author guopeng
 * @date 2019-05-03
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TemplateMethodTests {

    @Test
    public void templateMethodTest() {
        // 字符打印类的实现
        AbstractDisplay charDisplay = new CharDisplay('N');
        charDisplay.display();

        // 字符串打印类的实现
        AbstractDisplay enStringDisplay = new StringDisplay("Hello, world.");
        enStringDisplay.display();

        AbstractDisplay chStringDisplay = new StringDisplay("你好，世界。");
        chStringDisplay.display();
    }
}
