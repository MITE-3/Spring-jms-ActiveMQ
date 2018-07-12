/**
 * FileName: ProducerServiceImpl
 * Author:   MITE
 * Date:     2018/7/12 10:31
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.imooc.jms.producer;

import com.sun.deploy.panel.JSmartTextArea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.annotation.Resource;
import javax.jms.*;


/**
 * @author MITE
 * @create 2018/7/12
 * @since 1.0.0
 */
public class ProducerServiceImpl implements ProducerService {
    @Autowired
    JmsTemplate jmsTemplate;
    @Resource(name = "topicDestination")
    Destination destination;
    public void sendMessage(final String message) {
        jmsTemplate.send(destination, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                TextMessage textMessage=session.createTextMessage(message);
                return textMessage;
            }
        });
        System.out.println("发送消息"+message);
    }
}