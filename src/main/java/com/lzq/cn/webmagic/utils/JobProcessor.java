package com.lzq.cn.webmagic.utils;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.FilePipeline;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Selectable;

import java.util.List;

public class JobProcessor implements PageProcessor {

    private static String url = "https://search.51job.com/list/090200,000000,0000,00,9,99,java,2,1.html?lang=c&stype=&postchannel=0000&workyear=99&cotype=" +
            "99&degreefrom=99&jobterm=99&companysize=99&providesalary=99&lonlat=0%2C0&radius=-1&ord_field=0&confirmdate=" +
            "9&fromType=&dibiaoid=0&address=&line=&specialarea=00&from=&welfare=";

    public void process(Page page) {

        List<Selectable> list = page.getHtml().css("div#resultList div.el").nodes();


        


        page.putField("messagesList", messagesList);
    }








    private Site site = Site.me().setCharset("gbk");
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        Spider.create(new JobProcessor3()).
                addUrl(url).
                addPipeline(new FilePipeline("D:\\qwer"))
                .run();
    }
}
