package cn.n0nb0at.designpattern.chapter_02_adapter.adapter_with_extend;

/**
 *
 * @author guopeng
 * @date 2019-05-02
 */
public interface PrintInterface {
    /**
     * 弱引用方式打印
     */
    void printWeak();

    /**
     * 强引用方式打印
     */
    void printStrong();
}
