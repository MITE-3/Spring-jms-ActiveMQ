/**
 * FileName: AppConsumer
 * Author:   MITE
 * Date:     2018/7/12 11:42
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.imooc.jms.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author MITE
 * @create 2018/7/12
 * @since 1.0.0
 */
public class AppConsumer {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("consumer.xml");

    }
}