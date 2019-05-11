package cn.n0nb0at.designpattern.chapter_05_singleton;

/**
 * @author guopeng
 * @date 2019-05-11
 */
public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton () {
        System.out.println("生成了一个实例。");
    }
    public static Singleton getInstance() {
        return singleton;
    }
}
