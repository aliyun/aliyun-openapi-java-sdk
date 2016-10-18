Batchcompute SDK For Java
-------------------------

### 1. 环境

#### (1). 配置jdk

需要配置：JAVA_HOME 和 PATH 这个不再赘述。

#### (2). 配置maven

从官网下载一个maven（注意依赖的jdk版本），解压后配置 PATH.

配置 ~/.m2/settings.xml 文件。 可以从这里下载：[http://yunpan.alibaba-inc.com/share/link/N6PYGZVJq]
需要注意, 一定不要用默认的这种方式：~/.m2/repository ，最好配置绝对路径。

```xml
<!-- localRepository
      | The path to the local repository maven will use to store artifacts.
      |
      | Default: ~/.m2/repository
    -->
    <localRepository>/Users/zu/.m2/repository</localRepository>
```

#### (3) 安装依赖

```
mvn clean install  # 安装依赖
```

2. 开发常用命令

```bash
mvn test     # 运行测试case

make co  # 生成代码覆盖率文档
make doc # 生成Reference文档
```


3. 发布

* 1. 测试版本(SNAPSHOT)版本通过执行 mvn deploy 命令上传到 maven 仓库；

先修改version为SNAPSHOP

```xml
<version>3.1.1-SNAPSHOP</version>
```

发布命令(SNAPSHOT版本可以重复发)
```bash
make deploy
```

* 2. 正式版本通过本地执行 mvn package 命令打包，然后通过 Aone2 发布到 maven 仓库, [发布地址](http://aone.alibaba-inc.com/aone2/library/upload),
> 注意发布正式版之前需要把pom中core包引用改为正式版本,最新版本通过如下地址查询：[查询地址](http://repo.alibaba-inc.com/nexus/#nexus-search;gav~com.aliyun~aliyun-java-sdk-core~~~);
* 3. 正式版本发布后请把发布包及SDK版本发邮件到lijie.ma@alibaba-inc.com,由马立杰发布到 maven 官方仓库;
* 4. 公司maven库会代理maven官方库，所以如果需要发到maven官方库可以省略第二步。


### 2. 如何使用

#### (0) pom.xml 中配置

前往[http://repo.alibaba-inc.com/nexus]中查找下面2个包。
将其xml描述放到pom.xml的dependencies标签中。例如：

```xml
<dependency>
    <groupId>com.aliyun</groupId>
    <artifactId>aliyun-java-sdk-core</artifactId>
    <version>3.0.3</version>
</dependency>


<dependency>
    <groupId>com.aliyun</groupId>
    <artifactId>aliyun-java-sdk-batchcompute</artifactId>
    <version>3.1.1</version>
</dependency>
```

#### (1) 构造 client 对象

```java
import com.aliyuncs.batchcompute.main.v20151111.*;  //注意版本号: v20151111, 目前支持2个版本的: v20150630 & v20151111
...


String regionId="cn-hangzhou";
String accessKeyId="${your_access_key_id}";
String accessKeySecret="${your_access_key_secret}";

/** 构造 BatchCompute 客户端 */
BatchCompute client = new BatchComputeClient(regionId, accessKeyId, accessKeySecret);
```

#### (2) 使用 client 对象的方法:

```java
try {
    //使用客户端对象，创建Job
    CreateJobResponse response = client.createJob(job);

    //创建成功后，返回jobId
    String jobId = response.getJobId();

    System.out.println("Job created success, got jobId "+jobId);

} catch (ClientException e) {
    e.printStackTrace();

    System.out.println("Job created failed, errorCode:"+ e.getErrCode()+", errorMessage:"+e.getErrMsg());
}
```

#### (3)  client 对象支持的方法:

版本 v20150630:

| 序号 | 方法 | 描述 |
| ----- | ---- | ---- |
| 1. | createJob(JobDescription job) | 创建Job |
| 2. | updateJobPriority(String jobId, int priority) | 设置Job优先级 |
| 3. | deleteJob(String jobId) | 删除Job |
| 4. | getJob(String jobId) | 获取Job状态信息 |
| 5. | listJobs() | 列举Job状态信息 |
| 6. | getJobDescription(String jobId) | 获取Job描述信息 |
| 7. | stopJob(String jobId) | 停止job |
| 8. | startJob(String jobId) | 重新启动job |
| 9. | listTasks(String jobId) | 列举一个job下所有task的状态信息 |
| 10. | listImages() | 列举所有镜像 |


版本 v20151111:

| 序号 | 方法 | 描述 |
| ----- | ---- | ---- |
|  | *Cluster相关* | |
| 1. | createCluster(ClusterDescription clusterDesc) | 创建Cluster |
| 2. | getCluster(String clusterId) | 获取Cluster信息 |
| 3. | deleteCluster(String clusterId) | 删除Cluster |
| 4. | listClusters(String marker, int maxItemCount) | 列举Cluster信息 |
| 5. | changeClusterDesiredVMCount(String clusterId, String groupName, int count) | 修改期望虚机数 |
|  | *ClusterInstance相关* | |
| 1. | listClusterInstances(String clusterId, String groupName) | 获取ClusterInstance 列表 |
| 2. | getClusterInstance(String clusterId, String groupName, String instanceId) | 获取ClusterInstance信息 |
| 3. | deleteClusterInstance(String clusterId,String groupName, String instanceId) | 删除ClusterInstance |
| 4. | recreateClusterInstance(String clusterId, String groupName, String instanceId) | 重新创建ClusterInstance |
|  | *Job相关* | |
| 1. | createJob(JobDescription job) | 创建Job |
| 2. | changeJobPriority(String jobId, int priority) | 设置Job优先级 |
| 3. | deleteJob(String jobId) | 删除Job |
| 4. | getJob(String jobId) | 获取Job状态信息 |
| 5. | getJobDescription(String jobId) | 获取Job描述信息 |
| 6. | stopJob(String jobId) | 停止job |
| 7. | startJob(String jobId) | 重新启动job |
| 8. | listJobs(String marker, int maxItemCount) | 列举Job状态信息 |
|  | *Task相关* | |
| 1. | listTasks(String jobId,String marker, int maxItemCount) | 列举一个job下所有task的状态信息 |
| 2. | getTask(String jobId, String taskName) | 获取task状态信息 |
|  | *Instance相关* | |
| 1. | listInstances(String jobId, String taskName, String marker, int maxItemCount) | 获取task状态信息 |
| 2. | getInstance(String jobId, String taskName) | 获取 instance 状态信息 |
|  | *Image相关* | |
| 1. | listImages(String marker, int maxItemCount) | 列举Images |
| 2. | getImage(String imageId) | 获取 Image 信息 |
| 2. | deleteImage(String imageId) | 删除Image |
| 2. | createImage(ImageDescription imageDescription) | 创建Image |
