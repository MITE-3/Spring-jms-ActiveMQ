/**
 * FileName: ConsumerMessageListener
 * Author:   MITE
 * Date:     2018/7/12 11:35
 * History:
 * <author>          <time>          <version>          <desc>
 * ��������           �޸�ʱ��           �汾��              ����
 */
package com.imooc.jms.consumer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * @author MITE
 * @create 2018/7/12
 * @since 1.0.0
 */
public class ConsumerMessageListener implements MessageListener {
    public void onMessage(Message message) {
        TextMessage textMessage= (TextMessage) message;
        try {
            System.out.println("����"+textMessage.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}