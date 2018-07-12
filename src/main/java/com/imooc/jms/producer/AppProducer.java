/**
 * FileName: AppProducer
 * Author:   MITE
 * Date:     2018/7/12 10:45
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.imooc.jms.producer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author MITE
 * @create 2018/7/12
 * @since 1.0.0
 */
public class AppProducer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("producer.xml");
        ProducerService service = context.getBean(ProducerService.class);
        for (int i=0;i<50;i++) {
            service.sendMessage("test"+i);
        }
        context.close();
    }
}