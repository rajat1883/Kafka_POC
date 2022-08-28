# Kafka_POC

To run the project:

1. Run Maven Install
2. Add configuration to run Back-End in Intellij
3. Run Kafka locally using docker compose
   docker-compose -f docker-compose.yml up -d
4. Call /api/v1/orders/process to produce messages in users-v2 topic
5. The consumer will listen and log the message
6. Some additional commands

Connect to docker container for kafka: docker exec -it kafka /bin/sh

List topics: kafka-topics.sh --list --zookeeper zookeeper:2181

List messages in a topic: kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic users-v2 --from-beginning