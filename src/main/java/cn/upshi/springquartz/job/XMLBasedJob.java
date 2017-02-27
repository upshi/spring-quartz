package cn.upshi.springquartz.job;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * web com.yiheidaodi.web.job
 * 描述：
 * 时间：2017-2-27 15:04.
 */

public class XMLBasedJob {

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public void execute() {
        System.out.println(sdf.format(new Date()) + " 执行了定时任务 XMLBasedJob");
    }

}
