package cn.n0nb0at.designpattern.chapter_04_factory_method;

/**
 * ID 卡，具体产品，决定具体的产品拥有哪些属性，并实现具体被『使用』的操作
 *
 * @author guopeng
 * @date 2019-05-04
 */
public class IDCard extends Product {

    /**
     * ID 卡拥有者
     */
    private String owner;

    /**
     * ID 卡构造方法
     *
     * @param owner 拥有者名称
     */
    public IDCard(String owner) {
        System.out.println(String.format("制作%s的ID卡。", owner));
        this.owner = owner;
    }

    /**
     * 获取 ID 卡拥有者名称
     *
     * @return ID 卡拥有者名称
     */
    public String getOwner() {
        return owner;
    }

    @Override
    public void use() {
        System.out.println(String.format("使用%s的ID卡。", owner));
    }
}
