package cn.n0nb0at.designpattern.chapter_02_adapter.adapter_with_delegation;

import cn.n0nb0at.designpattern.chapter_02_adapter.Banner;

/**
 * 委托方式的适配器
 *
 * @author guopeng
 * @date 2019-05-02
 */
public class PrintBannerWithDelegation extends PrintClass {

    /**
     * 被委托的广告牌
     */
    private Banner banner;

    /**
     * 构造方法
     *
     * @param str 被委托广告牌的标语
     */
    public PrintBannerWithDelegation(String str) {
        this.banner = new Banner(str);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
