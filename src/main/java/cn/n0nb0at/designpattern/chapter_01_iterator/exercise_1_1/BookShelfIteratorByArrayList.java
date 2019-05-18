package cn.n0nb0at.designpattern.chapter_01_iterator.exercise_1_1;

import cn.n0nb0at.designpattern.chapter_01_iterator.Iterator;

/**
 * @author guopeng
 * @date 2019-05-18
 */
public class BookShelfIteratorByArrayList implements Iterator {

    /**
     * 迭代器归属的书架
     */
    private BookShelfByArrayList bookShelf;

    /**
     * 迭代器所指向书的索引
     */
    private int index;

    /**
     * 书架迭代器构造方法
     *
     * @param shelfByArrayList 迭代器归属的书架
     */
    public BookShelfIteratorByArrayList(BookShelfByArrayList shelfByArrayList) {
        this.bookShelf = shelfByArrayList;
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

