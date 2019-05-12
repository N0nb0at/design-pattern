package cn.n0nb0at.designpattern.chapter_06_prototype;

/**
 * 原型
 *
 * @author guopeng
 * @date 2019-05-11
 */
public interface Product extends Cloneable {
    /**
     * 各原型具体的使用方法
     *
     * @param s 被修饰的字符串
     */
    void use(String s);

    /**
     * 复制生成方法
     *
     * @return 根据原型复制出的产品
     */
    Product createClone();
}
