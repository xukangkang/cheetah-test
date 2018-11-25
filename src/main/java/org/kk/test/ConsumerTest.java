package org.kk.test;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.kk.cheetah.client.consumer.CheetahConsumer;
import org.kk.cheetah.common.model.response.ConsumerRecord;
import org.kk.cheetah.common.model.response.ConsumerRecords;

public class ConsumerTest {
    public static void main(String[] args) throws InterruptedException {
        Properties properties = new Properties();
        properties.put("clientId", "p1");
        properties.put("group", "g1");
        CheetahConsumer<Integer, String> cheetahConsumer = new CheetahConsumer<Integer, String>(properties);
        int count = 0;
        while (true) {
        	
            ConsumerRecords<Integer, String> consumerRecords = cheetahConsumer.poll();
            for (ConsumerRecord<Integer, String> consumerRecord : consumerRecords) {
                System.out.println(consumerRecord.getData());
            }
            TimeUnit.SECONDS.sleep(3);
        }

    }
}
