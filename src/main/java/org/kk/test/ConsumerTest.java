package org.kk.test;

import java.util.Properties;

import org.kk.cheetah.client.consumer.CheetahConsumer;
import org.kk.cheetah.common.model.response.ConsumerRecord;
import org.kk.cheetah.common.model.response.ConsumerRecords;
import org.kk.test.model.Person;

public class ConsumerTest {
    public static void main(String[] args) throws InterruptedException {
        Properties properties = new Properties();
        //properties.put("clientId", "p1");
        properties.put("group", "g1");
        properties.put("topic", "topic11");
        properties.put("server", "127.0.0.1:9997");
        CheetahConsumer<Integer, Person> cheetahConsumer = new CheetahConsumer<Integer, Person>(properties);
        while (true) {
            ConsumerRecords<Integer, Person> consumerRecords = cheetahConsumer.poll();
            for (ConsumerRecord<Integer, Person> consumerRecord : consumerRecords) {
                System.out.println(consumerRecord.getData());
            }
            //TimeUnit.SECONDS.sleep(3);
        }
    }
}
