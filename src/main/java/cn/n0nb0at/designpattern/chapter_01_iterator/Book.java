package cn.n0nb0at.designpattern.chapter_01_iterator;

/**
 * 表示书的类
 *
 * @author guopeng
 * @date 2019-05-02
 */
public class Book {

    /**
     * 书籍名称
     */
    private String name;

    /**
     * 构造方法
     *
     * @param name 初始化书名
     */
    public Book(String name) {
        this.name = name;
    }

    /**
     * 获取书名
     *
     * @return 当前书籍名称
     */
    public String getName() {
        return name;
    }
}
