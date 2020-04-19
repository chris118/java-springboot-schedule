package com.hhit.scheduled;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

//@Component注解用于对那些比较中立的类进行注释；
//相对与在持久层、业务层和控制层分别采用 @Repository、@Service 和 @Controller 对分层中的类进行注释
@Component
@EnableScheduling   // 2.开启定时任务
@EnableAsync        // 3.开启多线程
public class AsyncScheduleTask {

    //3.添加异步定时任务
    @Async
    @Scheduled(cron = "0/5 * * * * ?")
    //@Scheduled(fixedRate=5000)
    void configureTasks() {
        System.err.println("执行异步定时任务时间: AsyncScheduleTask---" + "time:" + LocalDateTime.now() + " thread_id: " +  + Thread.currentThread().getId());

    }
}
