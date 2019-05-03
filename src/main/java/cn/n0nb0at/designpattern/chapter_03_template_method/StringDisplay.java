package cn.n0nb0at.designpattern.chapter_03_template_method;

/**
 * 控制字符串类型打印具体内容的子类
 *
 * @author guopeng
 * @date 2019-05-03
 */
public class StringDisplay extends AbstractDisplay {

    /**
     * 需要打印的字符串
     */
    private String string;

    /**
     * 行宽 - 字符串长度
     */
    private int width;

    /**
     * 字符串打印类构造方法
     *
     * @param string 待打印字符串
     */
    public StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    /**
     * 首行和尾行打印的边框方法
     */
    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        // TODO 中文字符打印不对齐。两个原因：
        //  1、中文字符可能不是等宽字体；
        //  2、string.getBytes().length 计算得出的长度与命令行打印长度不一致
        System.out.println(String.format("|%s|", string));
    }

    @Override
    public void close() {
        printLine();
    }
}
