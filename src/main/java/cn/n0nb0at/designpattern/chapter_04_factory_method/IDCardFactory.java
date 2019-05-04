package cn.n0nb0at.designpattern.chapter_04_factory_method;

import java.util.ArrayList;
import java.util.List;

/**
 * ID 卡工厂，具体创建者
 *
 * @author guopeng
 * @date 2019-05-04
 */
public class IDCardFactory extends Factory {

    /**
     * 被该工厂创建、注册的产品列表
     */
    private List owners = new ArrayList();

    /**
     * 获取产品列表
     *
     * @return 产品列表
     */
    public List getOwners() {
        return owners;
    }

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }
}
