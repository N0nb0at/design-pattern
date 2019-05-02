package cn.n0nb0at.designpattern.chapter_01_iterator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Iterator 模式测试类
 *
 * @author guopeng
 * @date 2019-05-02
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class IteratorTests {

    @Test
    public void bookShelfIteratorTest() {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Hackers and Painters"));
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));

        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());

        }
    }
}
