package org.kk.test;

import java.util.Properties;

import org.kk.cheetah.client.producer.CheetahProducer;
import org.kk.cheetah.common.model.request.ProducerRecordRequest;
import org.kk.test.model.Person;

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
        Properties properties = new Properties();
        properties.put("topic", "topic11");
        properties.put("server", "127.0.0.1:9997");
        final CheetahProducer<Integer, Person> producer = new CheetahProducer<Integer, Person>(properties);
        for (int i = 0; i < 9; i++) {
            Person person = new Person();
            person.setName("zhangsan" + i);
            ProducerRecordRequest<Integer, Person> producerRecordRequest = new ProducerRecordRequest<Integer, Person>(
                    i, person);
            producer.send(producerRecordRequest);
        }
    }
}
