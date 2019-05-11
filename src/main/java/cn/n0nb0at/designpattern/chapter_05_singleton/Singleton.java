package cn.n0nb0at.designpattern.chapter_05_singleton;

/**
 * 单例模式类
 *
 * @author guopeng
 * @date 2019-05-11
 */
public class Singleton {
    /**
     * 需要生成的单例
     */
    private static Singleton singleton = new Singleton();

    /**
     * 构造方法
     */
    private Singleton () {
        System.out.println("生成了一个实例。");
    }

    /**
     * 获取单例实例
     *
     * @return 单例实例
     */
    public static Singleton getInstance() {
        return singleton;
    }
}
