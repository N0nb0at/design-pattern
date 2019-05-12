package cn.n0nb0at.designpattern.chapter_06_prototype;

/**
 * 消息盒原型
 *
 * @author guopeng
 * @date 2019-05-11
 */
public class MessageBox implements Product {

    /**
     * 装饰符
     */
    private char decoChar;

    /**
     * 构造方法
     *
     * @param decoChar 装饰符
     */
    public MessageBox(char decoChar) {
        this.decoChar = decoChar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;

        printDecoChar(decoChar, length);
        System.out.println();
        System.out.println(String.format("%s %s %s", decoChar, s, decoChar));
        printDecoChar(decoChar, length);
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

    /**
     * 装饰符打印
     *
     * @param decoChar 装饰符
     * @param sLength 被装饰字符串长度
     */
    private void printDecoChar(char decoChar, int sLength) {
        for (int i = 0; i < sLength + 4; i++) {
            System.out.print(decoChar);
        }
    }
}
