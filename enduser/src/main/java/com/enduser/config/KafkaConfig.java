package com.enduser.config;

import com.enduser.constant.AppConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

    private static Logger logger = LoggerFactory.getLogger(KafkaConfig.class);
    @KafkaListener(topics = AppConstant.LOCATION_UPDATE_TOPIC, groupId = AppConstant.GROUP_ID)
    public void updateLocation(String value){
        logger.info(value);
    }
}
