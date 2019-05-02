package cn.n0nb0at.designpattern.chapter_02_adapter.adapter_with_delegation;

/**
 *
 * @author guopeng
 * @date 2019-05-02
 */
public abstract class PrintClass {
    /**
     * 弱引用方式打印
     */
    public abstract void printWeak();

    /**
     * 强引用方式打印
     */
    public abstract void printStrong();
}
