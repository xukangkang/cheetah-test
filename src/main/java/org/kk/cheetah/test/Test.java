package org.kk.cheetah.test;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        /*int times = 1000000;
        //MessagePack---------------------------------------------------
        MessagePack msgpack = new MessagePack();
        long end = -1;
        long start = System.currentTimeMillis();
        int length = 0;
        for (int i = 0; i < times; i++) {
            length += msgpack.write(consumerRecord).length;
        }
        System.out.println(length);
        end = System.currentTimeMillis();
        System.out.println("MessagePack time  " + (end - start));
        
        //Hessian--------------------------------------------------------
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        HessianOutput hessianOutput = new HessianOutput(byteArrayOutputStream);
        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            // Hessian的序列化输出
            hessianOutput.writeObject(consumerRecord);
            //byte[] serialize = byteArrayOutputStream();
        }
        hessianOutput.flush();
        System.out.println(byteArrayOutputStream.toByteArray().length);
        end = System.currentTimeMillis();
        System.out.println("Hessian time  " + (end - start));
        
        //java--------------------------------------------
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        ObjectOutputStream ops = new ObjectOutputStream(os);
        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            ops.writeObject(consumerRecord);
        }
        ops.flush();
        System.out.println(os.toByteArray().length);
        end = System.currentTimeMillis();
        System.out.println("java time  " + (end - start));
        
        //Marshalling--------------------------
        MarshallerFactory marshallerFactory = Marshalling
                .getProvidedMarshallerFactory("serial");
        MarshallingConfiguration marshallingConfiguration = new MarshallingConfiguration();
        marshallingConfiguration.setVersion(5);
        Marshaller marshaller = marshallerFactory.createMarshaller(marshallingConfiguration);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        marshaller.start(Marshalling.createByteOutput(byteArrayOutputStream2));
        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            marshaller.writeObject(consumerRecord);
        }
        marshaller.flush();
        System.out.println(byteArrayOutputStream2.toByteArray().length);
        end = System.currentTimeMillis();
        System.out.println("marshalling time  " + (end - start));*/
        //Hessian--------------------------------------------------------
        /*        Person p = new Person();
        p.setName("zhangsan10000");
        ConsumerRecord<String, Person> consumerRecord = new ConsumerRecord<String, Person>();
        consumerRecord.setKey("c1");
        consumerRecord.setData(p);
        consumerRecord.setTopic("topic12");
        
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        HessianOutput hessianOutput = new HessianOutput(byteArrayOutputStream);
        hessianOutput.writeObject(consumerRecord);*/

    }

}
