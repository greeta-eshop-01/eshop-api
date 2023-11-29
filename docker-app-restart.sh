docker-compose -f docker-app-compose.yml down

mvn clean install -DskipTests

cd ./author-book-service
mvn spring-boot:build-image -DskipTests \
  -Dspring-boot.build-image.imageName=author-book-service

cd ../book-review-service
mvn spring-boot:build-image -DskipTests \
  -Dspring-boot.build-image.imageName=book-review-service

cd ../gateway-service
mvn spring-boot:build-image -DskipTests \
  -Dspring-boot.build-image.imageName=gateway-service

cd ../

docker-compose -f docker-app-compose.yml up -d