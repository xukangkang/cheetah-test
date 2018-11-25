package org.kk.test;

import java.util.Properties;

import org.kk.cheetah.client.producer.CheetahProducer;
import org.kk.cheetah.common.model.request.ProducerRecordRequest;

public class ProducerTest {
    public static void main(String[] args) {

        final String[] clientIds = new String[] {
                "c1",
                "c2",
                "c3"
        };
        for (int j = 0; j < 3; j++) {
            final int k = j;
            Properties properties = new Properties();
            properties.put("clientId", clientIds[k]);
            final CheetahProducer<Integer, String> producer = new CheetahProducer<Integer, String>(properties);
            new Thread(new Runnable() {
                public void run() {
                    for (int i = 0; i < 8; i++) {
                        System.out.println("发送第" + i + "条数据");
                        ProducerRecordRequest<Integer, String> producerRecordRequest = new ProducerRecordRequest<Integer, String>(
                                "testTopic", i, "zhangsan");
                        producer.send(producerRecordRequest);
                    }
                }
            }).start();

        }

    }
}
