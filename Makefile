travis-test:
	mkdir -p ./java-sdk-function-test/lib
	mvn package -Dmaven.test.skip=true -f ./aliyun-java-sdk-core/pom.xml
	mv ./aliyun-java-sdk-core/target/*.jar ./java-sdk-function-test/lib/core.jar
	mvn package -Dmaven.test.skip=true -f ./aliyun-java-sdk-ecs/pom.xml
	mv ./aliyun-java-sdk-ecs/target/*.jar ./java-sdk-function-test/lib/ecs.jar
	mvn package -Dmaven.test.skip=true -f ./aliyun-java-sdk-ccc/pom.xml
	mv ./aliyun-java-sdk-ccc/target/*.jar ./java-sdk-function-test/lib/ccc.jar
	mvn package -Dmaven.test.skip=true -f ./aliyun-java-sdk-slb/pom.xml
	mv ./aliyun-java-sdk-slb/target/*.jar ./java-sdk-function-test/lib/slb.jar
	mvn package -Dmaven.test.skip=true -f ./aliyun-java-sdk-cdn/pom.xml
	mv ./aliyun-java-sdk-cdn/target/*.jar ./java-sdk-function-test/lib/cdn.jar
	mvn package -Dmaven.test.skip=true -f ./aliyun-java-sdk-cloudapi/pom.xml
	mv ./aliyun-java-sdk-cloudapi/target/*.jar ./java-sdk-function-test/lib/cloudapi.jar
	mvn package -Dmaven.test.skip=true -f ./aliyun-java-sdk-ros/pom.xml
	mv ./aliyun-java-sdk-ros/target/*.jar ./java-sdk-function-test/lib/ros.jar
	mvn package -Dmaven.test.skip=true -f ./aliyun-java-sdk-ram/pom.xml
	mv ./aliyun-java-sdk-ram/target/*.jar ./java-sdk-function-test/lib/ram.jar
	mvn package -Dmaven.test.skip=true -f ./aliyun-java-sdk-vpc/pom.xml
	mv ./aliyun-java-sdk-vpc/target/*.jar ./java-sdk-function-test/lib/vpc.jar
	mvn package -Dmaven.test.skip=true -f ./aliyun-java-sdk-rds/pom.xml
	mv ./aliyun-java-sdk-rds/target/*.jar ./java-sdk-function-test/lib/rds.jar
	mvn package -Dmaven.test.skip=true -f ./aliyun-java-sdk-airec/pom.xml
	mv ./aliyun-java-sdk-airec/target/*.jar ./java-sdk-function-test/lib/airec.jar
	mvn package -Dmaven.test.skip=true -f ./aliyun-java-sdk-green/pom.xml
	mv ./aliyun-java-sdk-green/target/*.jar ./java-sdk-function-test/lib/green.jar
	mvn test -B -f ./java-sdk-function-test/pom.xml