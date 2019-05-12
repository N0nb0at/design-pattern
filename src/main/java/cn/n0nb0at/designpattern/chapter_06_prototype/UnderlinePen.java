package cn.n0nb0at.designpattern.chapter_06_prototype;

/**
 * 下划线原型
 *
 * @author guopeng
 * @date 2019-05-11
 */
public class UnderlinePen implements Product {

    /**
     * 下划线字符
     */
    private char ulChar;

    /**
     * 构造方法
     *
     * @param ulChar 下划线字符
     */
    public UnderlinePen(char ulChar) {
        this.ulChar = ulChar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println(String.format("\"%s\"", s));
        System.out.print(" ");
        for (int i = 0; i < length; i++) {
            System.out.print(ulChar);
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        Product product = null;
        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            System.out.print("不支持复制：");
            e.printStackTrace();
        }
        return product;
    }
}
