package cn.n0nb0at.designpattern.chapter_04_factory_method;

/**
 * 产品，定义了可以操作的行为
 *
 * @author guopeng
 * @date 2019-05-04
 */
public abstract class Product {
    /**
     * 产品的子类可以被『使用』
     */
    public abstract void use();
}
