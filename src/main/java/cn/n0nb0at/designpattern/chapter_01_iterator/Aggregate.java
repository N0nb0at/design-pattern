package cn.n0nb0at.designpattern.chapter_01_iterator;

/**
 * 表示集合的接口
 *
 * @author guopeng
 * @date 2019-05-02
 */
public interface Aggregate {
    /**
     * 获取迭代器
     *
     * @return 当前类的迭代器
     */
    Iterator iterator();
}
