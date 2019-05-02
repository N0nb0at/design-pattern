package cn.n0nb0at.designpattern.chapter_01_iterator;

/**
 * 表示书架的类
 *
 * @author guopeng
 * @date 2019-05-02
 */
public class BookShelf implements Aggregate {

    /**
     * 书架内包含的书籍
     */
    private Book[] books;

    /**
     * 最后一本书籍的索引
     */
    private int last = 0;

    /**
     * 构造方法
     *
     * @param maxSize 当前书架最大容量
     */
    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    /**
     * 根据索引位置获取书籍
     *
     * @param index 索引
     * @return 索引位置对应的书籍
     */
    public Book getBookAt(int index) {
        return books[index];
    }

    /**
     * 向书架内添加书籍
     *
     * @param book 新增的书籍
     */
    public void appendBook(Book book) {
        this.books[last++] = book;
    }

    /**
     * 获取当前书架已放置的书籍容量
     *
     * @return 容量 - 1
     */
    public int getLength() {
        return last;
    }

    /**
     * 当前类的迭代器
     *
     * @return 书架的迭代器
     */
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
