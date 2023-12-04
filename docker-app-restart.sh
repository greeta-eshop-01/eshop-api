docker-compose -f docker-app-compose.yml down

mvn clean install -DskipTests

cd ../basket-service
mvn spring-boot:build-image -DskipTests \
  -Dspring-boot.build-image.imageName=basket-service

cd ./catalog/catalog-command-service
mvn spring-boot:build-image -DskipTests \
  -Dspring-boot.build-image.imageName=catalog-command-service

cd ../../catalog/catalog-query-service
mvn spring-boot:build-image -DskipTests \
  -Dspring-boot.build-image.imageName=catalog-query-service

cd ../../infrastructure/flux-gateway-service
mvn spring-boot:build-image -DskipTests \
  -Dspring-boot.build-image.imageName=flux-gateway-service

cd ../../infrastructure/graphql-gateway-service
mvn spring-boot:build-image -DskipTests \
  -Dspring-boot.build-image.imageName=graphql-gateway-service

cd ../../infrastructure/image-gateway-service
mvn spring-boot:build-image -DskipTests \
  -Dspring-boot.build-image.imageName=image-gateway-service

cd ../order-processing-service
mvn spring-boot:build-image -DskipTests \
  -Dspring-boot.build-image.imageName=order-processing-service

cd ../../gateway-service
mvn spring-boot:build-image -DskipTests \
  -Dspring-boot.build-image.imageName=gateway-service



cd ../

docker-compose -f docker-app-compose.yml up -d
