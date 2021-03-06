/**
 * 
 */
package com.guttv.pm.frame.msg.rabbit;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.io.IOUtils;

import com.guttv.pm.core.msg.ProducerFactory;
import com.guttv.pm.core.msg.rabbit.RabbitProducer;

/**
 * @author Peter
 *
 */
public class RabbitTopicProducerForQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		String path = "rabbit://test_123456";
		RabbitProducer producer = (RabbitProducer)ProducerFactory.create(path);


		String[] mediaType = { "series", "program", "movie" };

		String[] actionType = { "regist", "update", "delete" };

		boolean flag = true;
		while (flag) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {

					String routingKey = mediaType[i] + "." + actionType[j];

					String message = "I can do it : " + routingKey + ":";
					
					producer.write(message, routingKey);
					
					System.out.println("发送数据：" + message);
					
					Thread.sleep(100);
				}
			}
			
			Thread.sleep(20000);
		}
		
		IOUtils.closeQuietly(producer);
	}

}
