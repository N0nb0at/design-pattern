package cn.n0nb0at.designpattern.chapter_02_adapter.exercise_2_2;

import java.io.IOException;

/**
 * 文件读写接口
 *
 * @author guopeng
 * @date 2019-05-18
 */
public interface FileIO {
    // 同文件中读取流
    void readFromFile(String fileName) throws IOException;
    // 将流写入文件
    void writeToFile(String fileName) throws IOException;
    // 设置属性
    void setValue(String key, String value);
    // 读取属性
    String getValue(String key);
}
