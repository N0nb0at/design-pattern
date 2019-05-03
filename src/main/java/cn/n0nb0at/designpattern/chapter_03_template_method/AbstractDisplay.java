package cn.n0nb0at.designpattern.chapter_03_template_method;

/**
 * 控制流程的父类
 *
 * @author guopeng
 * @date 2019-05-03
 */
public abstract class AbstractDisplay {
    /**
     * 交给子类实现的打开方法
     */
    public abstract void open();

    /**
     * 交给子类实现的打印方法
     */
    public abstract void print();

    /**
     * 交给子类实现的关闭方法
     */
    public abstract void close();

    /**
     * 父类控制的处理流程：
     * 1、打开
     * 2、循环打印 5 次
     * 3、关闭
     */
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
