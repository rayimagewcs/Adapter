package com.thinvent.middleware.mq;

import org.springframework.kafka.core.KafkaTemplate;

import com.thinvent.library.config.ServiceConfig;
import com.thinvent.library.util.SpringContextUtil;

public class ThinventProducer {
	@SuppressWarnings("rawtypes")
	private static KafkaTemplate kafkaTemplate;
	
	public ThinventProducer() {
		kafkaTemplate = SpringContextUtil.getApplicationContext().getBean(KafkaTemplate.class);
	}
	
	/**
	 * 告警信息发送至消息队列
	 * @param msg
	 */
	@SuppressWarnings("unchecked")
	public static void sendMessage(String msg) {
		String topic = ServiceConfig.getServiceConfig("middleware.basic", "topic");
		kafkaTemplate.send(topic, msg);
	}
}
