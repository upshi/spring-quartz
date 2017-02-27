package cn.upshi.springquartz.job;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * spring-quartz XMLBasedJob
 * 描述：
 * 时间：2017-2-27 15:04.
 */

public class XMLBasedJob {

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    //具体执行定时器任务逻辑的方法
    public void execute() {
        System.out.println(sdf.format(new Date()) + " 执行了定时任务 XMLBasedJob");
    }

}
