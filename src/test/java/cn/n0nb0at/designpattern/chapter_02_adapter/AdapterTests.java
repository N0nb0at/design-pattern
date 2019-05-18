package cn.n0nb0at.designpattern.chapter_02_adapter;

import cn.n0nb0at.designpattern.chapter_02_adapter.adapter_with_delegation.PrintClass;
import cn.n0nb0at.designpattern.chapter_02_adapter.adapter_with_delegation.PrintBannerWithDelegation;
import cn.n0nb0at.designpattern.chapter_02_adapter.adapter_with_extend.PrintInterface;
import cn.n0nb0at.designpattern.chapter_02_adapter.adapter_with_extend.PrintBannerWithExtend;
import cn.n0nb0at.designpattern.chapter_02_adapter.exercise_2_2.FileIO;
import cn.n0nb0at.designpattern.chapter_02_adapter.exercise_2_2.FileProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author guopeng
 * @date 2019-05-02
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AdapterTests {

    @Test
    public void adapterWithExtendTest() {
        PrintInterface printInterface = new PrintBannerWithExtend("Hello banner with extend");
        printInterface.printWeak();
        printInterface.printStrong();
    }

    @Test
    public void adapterWithDelegationTest() {
        PrintClass printClass = new PrintBannerWithDelegation("Hello banner with delegation");
        printClass.printWeak();
        printClass.printStrong();
    }

    @Test
    public void fileIOTest() {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("src/test/resources/chapter_02_adapter/file.properties");
            String year = f.getValue("year");
            System.out.printf("get year: %s\n", year);

            f.setValue("year", "2019");
            f.setValue("month", "05");
            f.setValue("day", "18");
            f.writeToFile("src/test/resources/chapter_02_adapter/newFile.properties");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
