package cn.n0nb0at.designpattern.chapter_02_adapter.adapter_with_extend;

import cn.n0nb0at.designpattern.chapter_02_adapter.Banner;

/**
 * 使用继承的适配器实现
 *
 * @author guopeng
 * @date 2019-05-02
 */
public class PrintBannerWithExtend extends Banner implements PrintInterface {

    /**
     * 构造方法
     *
     * @param str 需要打印的标语
     */
    public PrintBannerWithExtend(String str) {
        super(str);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
