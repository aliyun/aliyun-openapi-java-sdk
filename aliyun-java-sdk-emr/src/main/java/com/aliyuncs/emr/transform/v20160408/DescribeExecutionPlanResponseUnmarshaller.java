/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.DescribeExecutionPlanResponse;
import com.aliyuncs.emr.model.v20160408.DescribeExecutionPlanResponse.ClusterInfo;
import com.aliyuncs.emr.model.v20160408.DescribeExecutionPlanResponse.ClusterInfo.BootstrapAction;
import com.aliyuncs.emr.model.v20160408.DescribeExecutionPlanResponse.ClusterInfo.Config;
import com.aliyuncs.emr.model.v20160408.DescribeExecutionPlanResponse.ClusterInfo.EcsOrderInfo;
import com.aliyuncs.emr.model.v20160408.DescribeExecutionPlanResponse.ClusterInfo.SoftwareInfo;
import com.aliyuncs.emr.model.v20160408.DescribeExecutionPlanResponse.ClusterInfo.SoftwareInfo.Software;
import com.aliyuncs.emr.model.v20160408.DescribeExecutionPlanResponse.JobInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExecutionPlanResponseUnmarshaller {

	public static DescribeExecutionPlanResponse unmarshall(DescribeExecutionPlanResponse describeExecutionPlanResponse, UnmarshallerContext context) {
		
		describeExecutionPlanResponse.setRequestId(context.stringValue("DescribeExecutionPlanResponse.RequestId"));
		describeExecutionPlanResponse.setId(context.stringValue("DescribeExecutionPlanResponse.Id"));
		describeExecutionPlanResponse.setName(context.stringValue("DescribeExecutionPlanResponse.Name"));
		describeExecutionPlanResponse.setStatus(context.stringValue("DescribeExecutionPlanResponse.Status"));
		describeExecutionPlanResponse.setStrategy(context.stringValue("DescribeExecutionPlanResponse.Strategy"));
		describeExecutionPlanResponse.setTimeInterval(context.integerValue("DescribeExecutionPlanResponse.TimeInterval"));
		describeExecutionPlanResponse.setStartTime(context.longValue("DescribeExecutionPlanResponse.StartTime"));
		describeExecutionPlanResponse.setTimeUnit(context.stringValue("DescribeExecutionPlanResponse.TimeUnit"));
		describeExecutionPlanResponse.setDayOfWeek(context.stringValue("DescribeExecutionPlanResponse.DayOfWeek"));
		describeExecutionPlanResponse.setDayOfMonth(context.stringValue("DescribeExecutionPlanResponse.DayOfMonth"));
		describeExecutionPlanResponse.setCreateClusterOnDemand(context.booleanValue("DescribeExecutionPlanResponse.CreateClusterOnDemand"));
		describeExecutionPlanResponse.setClusterId(context.stringValue("DescribeExecutionPlanResponse.ClusterId"));
		describeExecutionPlanResponse.setClusterName(context.stringValue("DescribeExecutionPlanResponse.ClusterName"));
		describeExecutionPlanResponse.setWorkflowApp(context.stringValue("DescribeExecutionPlanResponse.WorkflowApp"));
		describeExecutionPlanResponse.setExecutionPlanVersion(context.longValue("DescribeExecutionPlanResponse.ExecutionPlanVersion"));

		ClusterInfo clusterInfo = new ClusterInfo();
		clusterInfo.setName(context.stringValue("DescribeExecutionPlanResponse.ClusterInfo.Name"));
		clusterInfo.setZoneId(context.stringValue("DescribeExecutionPlanResponse.ClusterInfo.ZoneId"));
		clusterInfo.setLogEnable(context.booleanValue("DescribeExecutionPlanResponse.ClusterInfo.LogEnable"));
		clusterInfo.setLogPath(context.stringValue("DescribeExecutionPlanResponse.ClusterInfo.LogPath"));
		clusterInfo.setSecurityGroupId(context.stringValue("DescribeExecutionPlanResponse.ClusterInfo.SecurityGroupId"));
		clusterInfo.setEmrVer(context.stringValue("DescribeExecutionPlanResponse.ClusterInfo.EmrVer"));
		clusterInfo.setClusterType(context.stringValue("DescribeExecutionPlanResponse.ClusterInfo.ClusterType"));
		clusterInfo.setHighAvailabilityEnable(context.booleanValue("DescribeExecutionPlanResponse.ClusterInfo.HighAvailabilityEnable"));
		clusterInfo.setVpcId(context.stringValue("DescribeExecutionPlanResponse.ClusterInfo.VpcId"));
		clusterInfo.setVSwitchId(context.stringValue("DescribeExecutionPlanResponse.ClusterInfo.VSwitchId"));
		clusterInfo.setNetType(context.stringValue("DescribeExecutionPlanResponse.ClusterInfo.NetType"));
		clusterInfo.setIoOptimized(context.booleanValue("DescribeExecutionPlanResponse.ClusterInfo.IoOptimized"));
		clusterInfo.setInstanceGeneration(context.stringValue("DescribeExecutionPlanResponse.ClusterInfo.InstanceGeneration"));
		clusterInfo.setConfigurations(context.stringValue("DescribeExecutionPlanResponse.ClusterInfo.Configurations"));
		clusterInfo.setEasEnable(context.booleanValue("DescribeExecutionPlanResponse.ClusterInfo.EasEnable"));
		clusterInfo.setUseCustomHiveMetaDB(context.booleanValue("DescribeExecutionPlanResponse.ClusterInfo.UseCustomHiveMetaDB"));
		clusterInfo.setInitCustomHiveMetaDB(context.booleanValue("DescribeExecutionPlanResponse.ClusterInfo.InitCustomHiveMetaDB"));
		clusterInfo.setUserDefinedEmrEcsRole(context.stringValue("DescribeExecutionPlanResponse.ClusterInfo.UserDefinedEmrEcsRole"));
		clusterInfo.setUseLocalMetaDb(context.booleanValue("DescribeExecutionPlanResponse.ClusterInfo.UseLocalMetaDb"));

		SoftwareInfo softwareInfo = new SoftwareInfo();
		softwareInfo.setEmrVer(context.stringValue("DescribeExecutionPlanResponse.ClusterInfo.SoftwareInfo.EmrVer"));
		softwareInfo.setClusterType(context.stringValue("DescribeExecutionPlanResponse.ClusterInfo.SoftwareInfo.ClusterType"));

		List<Software> softwares = new ArrayList<Software>();
		for (int i = 0; i < context.lengthValue("DescribeExecutionPlanResponse.ClusterInfo.SoftwareInfo.Softwares.Length"); i++) {
			Software software = new Software();
			software.setDisplayName(context.stringValue("DescribeExecutionPlanResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].DisplayName"));
			software.setName(context.stringValue("DescribeExecutionPlanResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].Name"));
			software.setOnlyDisplay(context.booleanValue("DescribeExecutionPlanResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].OnlyDisplay"));
			software.setStartTpe(context.integerValue("DescribeExecutionPlanResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].StartTpe"));
			software.setVersion(context.stringValue("DescribeExecutionPlanResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].Version"));
			software.setOptional(context.booleanValue("DescribeExecutionPlanResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].Optional"));

			softwares.add(software);
		}
		softwareInfo.setSoftwares(softwares);
		clusterInfo.setSoftwareInfo(softwareInfo);

		List<EcsOrderInfo> ecsOrders = new ArrayList<EcsOrderInfo>();
		for (int i = 0; i < context.lengthValue("DescribeExecutionPlanResponse.ClusterInfo.EcsOrders.Length"); i++) {
			EcsOrderInfo ecsOrderInfo = new EcsOrderInfo();
			ecsOrderInfo.setIndex(context.integerValue("DescribeExecutionPlanResponse.ClusterInfo.EcsOrders["+ i +"].Index"));
			ecsOrderInfo.setNodeCount(context.integerValue("DescribeExecutionPlanResponse.ClusterInfo.EcsOrders["+ i +"].NodeCount"));
			ecsOrderInfo.setInstanceType(context.stringValue("DescribeExecutionPlanResponse.ClusterInfo.EcsOrders["+ i +"].InstanceType"));
			ecsOrderInfo.setDiskType(context.stringValue("DescribeExecutionPlanResponse.ClusterInfo.EcsOrders["+ i +"].DiskType"));
			ecsOrderInfo.setDiskCapacity(context.integerValue("DescribeExecutionPlanResponse.ClusterInfo.EcsOrders["+ i +"].DiskCapacity"));
			ecsOrderInfo.setNodeType(context.stringValue("DescribeExecutionPlanResponse.ClusterInfo.EcsOrders["+ i +"].NodeType"));
			ecsOrderInfo.setDiskCount(context.integerValue("DescribeExecutionPlanResponse.ClusterInfo.EcsOrders["+ i +"].DiskCount"));

			ecsOrders.add(ecsOrderInfo);
		}
		clusterInfo.setEcsOrders(ecsOrders);

		List<BootstrapAction> bootstrapActionList = new ArrayList<BootstrapAction>();
		for (int i = 0; i < context.lengthValue("DescribeExecutionPlanResponse.ClusterInfo.BootstrapActionList.Length"); i++) {
			BootstrapAction bootstrapAction = new BootstrapAction();
			bootstrapAction.setName(context.stringValue("DescribeExecutionPlanResponse.ClusterInfo.BootstrapActionList["+ i +"].Name"));
			bootstrapAction.setPath(context.stringValue("DescribeExecutionPlanResponse.ClusterInfo.BootstrapActionList["+ i +"].Path"));
			bootstrapAction.setArg(context.stringValue("DescribeExecutionPlanResponse.ClusterInfo.BootstrapActionList["+ i +"].Arg"));

			bootstrapActionList.add(bootstrapAction);
		}
		clusterInfo.setBootstrapActionList(bootstrapActionList);

		List<Config> configList = new ArrayList<Config>();
		for (int i = 0; i < context.lengthValue("DescribeExecutionPlanResponse.ClusterInfo.ConfigList.Length"); i++) {
			Config config = new Config();
			config.setServiceName(context.stringValue("DescribeExecutionPlanResponse.ClusterInfo.ConfigList["+ i +"].ServiceName"));
			config.setFileName(context.stringValue("DescribeExecutionPlanResponse.ClusterInfo.ConfigList["+ i +"].FileName"));
			config.setConfigKey(context.stringValue("DescribeExecutionPlanResponse.ClusterInfo.ConfigList["+ i +"].ConfigKey"));
			config.setConfigValue(context.stringValue("DescribeExecutionPlanResponse.ClusterInfo.ConfigList["+ i +"].ConfigValue"));
			config.setEncrypt(context.stringValue("DescribeExecutionPlanResponse.ClusterInfo.ConfigList["+ i +"].Encrypt"));

			configList.add(config);
		}
		clusterInfo.setConfigList(configList);
		describeExecutionPlanResponse.setClusterInfo(clusterInfo);

		List<JobInfo> jobInfoList = new ArrayList<JobInfo>();
		for (int i = 0; i < context.lengthValue("DescribeExecutionPlanResponse.JobInfoList.Length"); i++) {
			JobInfo jobInfo = new JobInfo();
			jobInfo.setId(context.stringValue("DescribeExecutionPlanResponse.JobInfoList["+ i +"].Id"));
			jobInfo.setName(context.stringValue("DescribeExecutionPlanResponse.JobInfoList["+ i +"].Name"));
			jobInfo.setType(context.stringValue("DescribeExecutionPlanResponse.JobInfoList["+ i +"].Type"));
			jobInfo.setRunParameter(context.stringValue("DescribeExecutionPlanResponse.JobInfoList["+ i +"].RunParameter"));
			jobInfo.setFailAct(context.stringValue("DescribeExecutionPlanResponse.JobInfoList["+ i +"].FailAct"));

			jobInfoList.add(jobInfo);
		}
		describeExecutionPlanResponse.setJobInfoList(jobInfoList);
	 
	 	return describeExecutionPlanResponse;
	}
}