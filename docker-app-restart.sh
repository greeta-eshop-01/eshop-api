docker-compose -f docker-app-compose.yml down

mvn clean install -DskipTests

cd ./catalog/catalog-command-service
mvn spring-boot:build-image -DskipTests \
  -Dspring-boot.build-image.imageName=catalog-command-service

cd ../../catalog/catalog-query-service
mvn spring-boot:build-image -DskipTests \
  -Dspring-boot.build-image.imageName=catalog-query-service

cd ../../gateway-service
mvn spring-boot:build-image -DskipTests \
  -Dspring-boot.build-image.imageName=gateway-service



cd ../

docker-compose -f docker-app-compose.yml up -d
