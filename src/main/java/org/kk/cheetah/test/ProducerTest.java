package org.kk.cheetah.test;

import java.util.Properties;
import java.util.concurrent.atomic.AtomicInteger;

import org.kk.cheetah.client.producer.CheetahProducer;
import org.kk.cheetah.common.model.request.ProducerRecordRequest;
import org.kk.cheetah.test.model.Person;

public class ProducerTest {
    public static void main(String[] args) {

        /*        final String[] clientIds = new String[] {
                "c1",
                "c2",
                "c3"
        };
        final Person person = new Person();
        person.setName("张三");
        for (int j = 0; j < 3; j++) {
            final int k = j;
            Properties properties = new Properties();
            properties.put("clientId", clientIds[k]);
            properties.put("topic", "topic10");
            final CheetahProducer<Integer, Person> producer = new CheetahProducer<Integer, Person>(properties);
            new Thread(new Runnable() {
                public void run() {
                    for (int i = 0; i < 9; i++) {
                        System.out.println("发送第" + i + "条数据");
                        ProducerRecordRequest<Integer, Person> producerRecordRequest = new ProducerRecordRequest<Integer, Person>(
                                i, person);
                        producer.send(producerRecordRequest);
                    }
                }
            }).start();
        }*/
        final Properties properties = new Properties();
        properties.put("topic", "topic12");
        properties.put("server", "101.101.135.27:9997");
        //        properties.put("server", "127.0.0.1:9997");
        final AtomicInteger ai = new AtomicInteger();
        for (int index = 0; index < 24; index++) {
            new Thread(new Runnable() {
                public void run() {
                    CheetahProducer<Integer, Person> producer = new CheetahProducer<Integer, Person>(properties);
                    for (int i = 0; i < 1000000; i++) {
                        Person person = new Person();
                        person.setName("zhangsan" + ai.incrementAndGet());
                        ProducerRecordRequest<Integer, Person> producerRecordRequest = new ProducerRecordRequest<Integer, Person>(
                                i, person);
                        producer.send(producerRecordRequest);
                    }

                }
            }).start();

        }

    }
}
