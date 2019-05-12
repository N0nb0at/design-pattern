package cn.n0nb0at.designpattern.chapter_06_prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用者
 *
 * @author guopeng
 * @date 2019-05-11
 */
public class Manager {

    /**
     * 名字与实例的关系维护
     */
    private Map showCase = new HashMap();

    /**
     * 注册实例
     *
     * @param name 实例的名称
     * @param proto 实例
     */
    public void register(String name, Product proto) {
        showCase.put(name, proto);
    }

    /**
     * 创建实例
     *
     * @param protoName 待创建实例的名称
     * @return 被复制创建的实例
     */
    public Product create(String protoName) {
        Product product = (Product) showCase.get(protoName);
        return product.createClone();
    }
}
