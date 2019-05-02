package cn.n0nb0at.designpattern.chapter_02_adapter;

/**
 * 被适配者（实际情况）
 *
 * @author guopeng
 * @date 2019-05-02
 */
public class Banner {

    /**
     * 需要打印的标语
     */
    private String str;

    /**
     * 构造方法
     *
     * @param str 待打印标语
     */
    public Banner(String str) {
        this.str = str;
    }

    /**
     * 加括号显示
     */
    public void showWithParen() {
        System.out.println(String.format("(%s)", str));
    }

    /**
     * 加星号显示
     */
    public void showWithAster() {
        System.out.println(String.format("*%s*", str));
    }
}
