package cn.n0nb0at.designpattern.chapter_01_iterator.exercise_1_1;

import cn.n0nb0at.designpattern.chapter_01_iterator.Aggregate;
import cn.n0nb0at.designpattern.chapter_01_iterator.Book;
import cn.n0nb0at.designpattern.chapter_01_iterator.Iterator;

import java.util.ArrayList;

/**
 * @author guopeng
 * @date 2019-05-18
 */
public class BookShelfByArrayList implements Aggregate {

    /**
     * 书架内包含的书籍
     */
    private ArrayList<Book> books;

    /**
     * 最后一本书籍的索引
     */
    private int last = 0;

    /**
     * 构造方法
     *
     * @param maxSize 当前书架最大容量
     */
    public BookShelfByArrayList(int maxSize) {
        this.books = new ArrayList<>(maxSize);
    }

    /**
     * 根据索引位置获取书籍
     *
     * @param index 索引
     * @return 索引位置对应的书籍
     */
    public Book getBookAt(int index) {
        return books.get(index);
    }

    /**
     * 向书架内添加书籍
     *
     * @param book 新增的书籍
     */
    public void appendBook(Book book) {
        books.add(book);
    }

    /**
     * 获取当前书架已放置的书籍容量
     *
     * @return 容量
     */
    public int getLength() {
        return books.size();
    }

    /**
     * 当前类的迭代器
     *
     * @return 书架的迭代器
     */
    public Iterator iterator() {
        return new BookShelfIteratorByArrayList(this);
    }
}
