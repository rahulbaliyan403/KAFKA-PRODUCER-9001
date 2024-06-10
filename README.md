# KAFKA-PRODUCER-9001
STEP 1: DOWNLOAD AND INSTALL KAFKA
https://dlcdn.apache.org/kafka/3.2.0/...

STEP 2: START THE KAFKA ENVIRONMENT
Start the ZooKeeper service
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

Start the Kafka broker service
.\bin\windows\kafka-server-start.bat .\config\server.properties

STEP 3: CREATE A TOPIC TO STORE YOUR EVENTS
.\bin\windows\kafka-topics.bat --create --topic topic_demo --bootstrap-server localhost:9092

STEP 4: WRITE SOME EVENTS INTO THE TOPIC
.\bin\windows\kafka-console-producer.bat --topic topic_demo --bootstrap-server localhost:9092

or
.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic topic_demo

STEP 5:  READ THE EVENTS
.\bin\windows\kafka-console-consumer.bat --topic topic_demo --from-beginning --bootstrap-server localhost:9092
hello world
topic demo


{"username" : "Rahul", "password" : "1234", "age" : "32"}

https://www.youtube.com/watch?v=Ht7Nonpylr0&list=PLGRDMO4rOGcNLwoack4ZiTyewUcF6y6BU&index=10

https://medium.com/@issa.khodadadi88/implementing-kafka-producer-and-consumer-in-spring-boot-75796f0ce242