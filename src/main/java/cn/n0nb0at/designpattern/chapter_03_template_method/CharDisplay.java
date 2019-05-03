package cn.n0nb0at.designpattern.chapter_03_template_method;

/**
 * 控制字符类型打印具体内容的子类
 *
 * @author guopeng
 * @date 2019-05-03
 */
public class CharDisplay extends AbstractDisplay {

    /**
     * 需要打印的字符
     */
    private char ch;

    /**
     * 字符打印的构造方法
     *
     * @param ch 待打印字符
     */
    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
