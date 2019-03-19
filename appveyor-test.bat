call md .\java-sdk-function-test\lib
call mvn package -Dmaven.test.skip=true -f .\aliyun-java-sdk-core\pom.xml
call move .\aliyun-java-sdk-core\target\*.jar .\java-sdk-function-test\lib\core.jar
call mvn package -Dmaven.test.skip=true -f .\aliyun-java-sdk-ecs\pom.xml
call move .\aliyun-java-sdk-ecs\target\*.jar .\java-sdk-function-test\lib\ecs.jar
call mvn package -Dmaven.test.skip=true -f .\aliyun-java-sdk-ccc\pom.xml
call move .\aliyun-java-sdk-ccc\target\*.jar .\java-sdk-function-test\lib\ccc.jar
call mvn package -Dmaven.test.skip=true -f .\aliyun-java-sdk-slb\pom.xml
call move .\aliyun-java-sdk-slb\target\*.jar .\java-sdk-function-test\lib\slb.jar
call mvn package -Dmaven.test.skip=true -f .\aliyun-java-sdk-cdn\pom.xml
call move .\aliyun-java-sdk-cdn\target\*.jar .\java-sdk-function-test\lib\cdn.jar
call mvn package -Dmaven.test.skip=true -f .\aliyun-java-sdk-cloudapi\pom.xml
call move .\aliyun-java-sdk-cloudapi\target\*.jar .\java-sdk-function-test\lib\cloudapi.jar
call mvn package -Dmaven.test.skip=true -f .\aliyun-java-sdk-ros\pom.xml
call move .\aliyun-java-sdk-ros\target\*.jar .\java-sdk-function-test\lib\ros.jar
call mvn package -Dmaven.test.skip=true -f .\aliyun-java-sdk-ram\pom.xml
call move .\aliyun-java-sdk-ram\target\*.jar .\java-sdk-function-test\lib\ram.jar
call mvn package -Dmaven.test.skip=true -f .\aliyun-java-sdk-vpc\pom.xml
call move .\aliyun-java-sdk-vpc\target\*.jar .\java-sdk-function-test\lib\vpc.jar
call mvn package -Dmaven.test.skip=true -f .\aliyun-java-sdk-rds\pom.xml
call move .\aliyun-java-sdk-rds\target\*.jar .\java-sdk-function-test\lib\rds.jar
call mvn package -Dmaven.test.skip=true -f .\aliyun-java-sdk-airec\pom.xml
call move .\aliyun-java-sdk-airec\target\*.jar .\java-sdk-function-test\lib\airec.jar
call mvn package -Dmaven.test.skip=true -f .\aliyun-java-sdk-green\pom.xml
call move .\aliyun-java-sdk-green\target\*.jar .\java-sdk-function-test\lib\green.jar
call mvn package -Dmaven.test.skip=true -f .\aliyun-java-sdk-imagesearch\pom.xml
call move .\aliyun-java-sdk-imagesearch\target\*.jar .\java-sdk-function-test\lib\imagesearch.jar
call mvn test -B -f .\java-sdk-function-test\pom.xml
