import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class DemoQueueConsumer {

    public static void main(String[] args) throws Exception {
        //创建ConnectionFactory
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://192.168.211.128:61616");

        //创建连接对象Connection
        Connection connection = connectionFactory.createConnection();

        //开启连接
        connection.start();

        //创建会话对象
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        //创建需要接收的消息地址
        Queue test = session.createQueue("test2");


        //接收消息
        MessageConsumer consumer = session.createConsumer(test);

        while (true){
            //等待10秒，在10秒内一直处于接收消息状态
            Message message = consumer.receive(10000);

            if(message!=null){
                if(message instanceof  TextMessage){
                    //将消息转换成TextMessage
                    TextMessage textMessage = (TextMessage) message;

                    System.out.println("收到的内容是："+textMessage.getText());
                    break;
                }
            }
        }

        //关闭资源
        session.close();
        connection.close();
    }
}