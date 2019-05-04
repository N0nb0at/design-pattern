package cn.n0nb0at.designpattern.chapter_04_factory_method;

/**
 * 工厂，创建者，负责生产 Product
 *
 * @author guopeng
 * @date 2019-05-04
 */
public abstract class Factory {

    /**
     * 生产产品：1、生产具体的产品；2、注册产品
     *
     * @param owner 被生产产品所需的属性，产品的拥有者名称
     * @return 产生的产品
     */
    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    /**
     * 生产产品的具体实现
     *
     * @param owner 拥有者名称
     * @return 被生产的产品
     */
    protected abstract Product createProduct(String owner);

    /**
     * 注册产品
     *
     * @param product 待注册产品
     */
    protected abstract void registerProduct(Product product);
}
