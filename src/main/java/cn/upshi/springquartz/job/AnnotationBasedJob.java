package cn.upshi.springquartz.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * spring-quartz AnnotationBasedJob
 * 描述：
 * 时间：2017-2-27 15:04.
 */

@Component
public class AnnotationBasedJob {

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    //执行计划
    @Scheduled(cron = "0/5 * * * * *")
    public void execute() {
        System.out.println(sdf.format(new Date()) + " 执行了定时任务 AnnotationBasedJob");
    }

}
