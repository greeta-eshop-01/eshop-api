docker-compose -f docker-app-compose.yml down
docker-compose down
docker-compose up -d

mvn clean install -DskipTests

cd ./analytics-service
mvn spring-boot:build-image -DskipTests \
  -Dspring-boot.build-image.imageName=analytics-service

cd ../basket-service
mvn spring-boot:build-image -DskipTests \
  -Dspring-boot.build-image.imageName=basket-service

cd ../catalog-command-service
mvn spring-boot:build-image -DskipTests \
  -Dspring-boot.build-image.imageName=catalog-command-service

cd ../catalog-query-service
mvn spring-boot:build-image -DskipTests \
  -Dspring-boot.build-image.imageName=catalog-query-service

cd ../flux-gateway-service
mvn spring-boot:build-image -DskipTests \
  -Dspring-boot.build-image.imageName=flux-gateway-service

cd ../graphql-gateway-service
mvn spring-boot:build-image -DskipTests \
  -Dspring-boot.build-image.imageName=graphql-gateway-service

cd ../image-gateway-service
mvn spring-boot:build-image -DskipTests \
  -Dspring-boot.build-image.imageName=image-gateway-service

cd ../order-grace-period-task-service
mvn spring-boot:build-image -DskipTests \
  -Dspring-boot.build-image.imageName=order-grace-period-task-service

cd ../order-notifications-service
mvn spring-boot:build-image -DskipTests \
  -Dspring-boot.build-image.imageName=order-notifications-service

cd ../order-processing-service
mvn spring-boot:build-image -DskipTests \
  -Dspring-boot.build-image.imageName=order-processing-service

cd ../payment-service
mvn spring-boot:build-image -DskipTests \
  -Dspring-boot.build-image.imageName=payment-service

cd ../rating-service
mvn spring-boot:build-image -DskipTests \
  -Dspring-boot.build-image.imageName=rating-service

cd ../gateway-service
mvn spring-boot:build-image -DskipTests \
  -Dspring-boot.build-image.imageName=gateway-service

cd ../

docker-compose -f docker-app-compose.yml up -d
