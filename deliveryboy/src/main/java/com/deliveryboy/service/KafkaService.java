package com.deliveryboy.service;

import com.deliveryboy.constant.AppConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    private static final Logger logger = LoggerFactory.getLogger(KafkaService.class);
    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    public boolean updateLocation(String location){
        this.kafkaTemplate.send(AppConstant.LOCATION_TOPIC_NAME, location);
        logger.info("Location produced");
        logger.info("---------------------");
        return true;
    }
}