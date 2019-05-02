package cn.n0nb0at.designpattern.chapter_01_iterator;

/**
 * 遍历集合的接口
 *
 * @author guopeng
 * @date 2019-05-02
 */
public interface Iterator {
    /**
     * 是否还有下一个元素
     *
     * @return 是否还有下一个元素
     */
    boolean hasNext();

    /**
     * 获取下一个元素
     *
     * @return 下一个元素
     */
    Object next();
}
