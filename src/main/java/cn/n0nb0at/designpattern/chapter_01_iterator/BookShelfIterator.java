package cn.n0nb0at.designpattern.chapter_01_iterator;

/**
 * 遍历书架的类
 *
 * @author guopeng
 * @date 2019-05-02
 */
public class BookShelfIterator implements Iterator {

    /**
     * 迭代器归属的书架
     */
    private BookShelf bookShelf;

    /**
     * 迭代器所指向书的索引
     */
    private int index;

    /**
     * 书架迭代器构造方法
     *
     * @param bookShelf 迭代器归属的书架
     */
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Object next() {
        return bookShelf.getBookAt(index++);
    }
}
