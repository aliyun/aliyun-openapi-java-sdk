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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExecutionPlanResponseUnmarshaller {

	public static DescribeExecutionPlanResponse unmarshall(DescribeExecutionPlanResponse describeExecutionPlanResponse, UnmarshallerContext _ctx) {
		
		describeExecutionPlanResponse.setRequestId(_ctx.stringValue("DescribeExecutionPlanResponse.RequestId"));
		describeExecutionPlanResponse.setId(_ctx.stringValue("DescribeExecutionPlanResponse.Id"));
		describeExecutionPlanResponse.setName(_ctx.stringValue("DescribeExecutionPlanResponse.Name"));
		describeExecutionPlanResponse.setStatus(_ctx.stringValue("DescribeExecutionPlanResponse.Status"));
		describeExecutionPlanResponse.setStrategy(_ctx.stringValue("DescribeExecutionPlanResponse.Strategy"));
		describeExecutionPlanResponse.setTimeInterval(_ctx.integerValue("DescribeExecutionPlanResponse.TimeInterval"));
		describeExecutionPlanResponse.setStartTime(_ctx.longValue("DescribeExecutionPlanResponse.StartTime"));
		describeExecutionPlanResponse.setTimeUnit(_ctx.stringValue("DescribeExecutionPlanResponse.TimeUnit"));
		describeExecutionPlanResponse.setDayOfWeek(_ctx.stringValue("DescribeExecutionPlanResponse.DayOfWeek"));
		describeExecutionPlanResponse.setDayOfMonth(_ctx.stringValue("DescribeExecutionPlanResponse.DayOfMonth"));
		describeExecutionPlanResponse.setCreateClusterOnDemand(_ctx.booleanValue("DescribeExecutionPlanResponse.CreateClusterOnDemand"));
		describeExecutionPlanResponse.setClusterId(_ctx.stringValue("DescribeExecutionPlanResponse.ClusterId"));
		describeExecutionPlanResponse.setClusterName(_ctx.stringValue("DescribeExecutionPlanResponse.ClusterName"));
		describeExecutionPlanResponse.setWorkflowApp(_ctx.stringValue("DescribeExecutionPlanResponse.WorkflowApp"));
		describeExecutionPlanResponse.setExecutionPlanVersion(_ctx.longValue("DescribeExecutionPlanResponse.ExecutionPlanVersion"));

		ClusterInfo clusterInfo = new ClusterInfo();
		clusterInfo.setName(_ctx.stringValue("DescribeExecutionPlanResponse.ClusterInfo.Name"));
		clusterInfo.setZoneId(_ctx.stringValue("DescribeExecutionPlanResponse.ClusterInfo.ZoneId"));
		clusterInfo.setLogEnable(_ctx.booleanValue("DescribeExecutionPlanResponse.ClusterInfo.LogEnable"));
		clusterInfo.setLogPath(_ctx.stringValue("DescribeExecutionPlanResponse.ClusterInfo.LogPath"));
		clusterInfo.setSecurityGroupId(_ctx.stringValue("DescribeExecutionPlanResponse.ClusterInfo.SecurityGroupId"));
		clusterInfo.setEmrVer(_ctx.stringValue("DescribeExecutionPlanResponse.ClusterInfo.EmrVer"));
		clusterInfo.setClusterType(_ctx.stringValue("DescribeExecutionPlanResponse.ClusterInfo.ClusterType"));
		clusterInfo.setHighAvailabilityEnable(_ctx.booleanValue("DescribeExecutionPlanResponse.ClusterInfo.HighAvailabilityEnable"));
		clusterInfo.setVpcId(_ctx.stringValue("DescribeExecutionPlanResponse.ClusterInfo.VpcId"));
		clusterInfo.setVSwitchId(_ctx.stringValue("DescribeExecutionPlanResponse.ClusterInfo.VSwitchId"));
		clusterInfo.setNetType(_ctx.stringValue("DescribeExecutionPlanResponse.ClusterInfo.NetType"));
		clusterInfo.setIoOptimized(_ctx.booleanValue("DescribeExecutionPlanResponse.ClusterInfo.IoOptimized"));
		clusterInfo.setInstanceGeneration(_ctx.stringValue("DescribeExecutionPlanResponse.ClusterInfo.InstanceGeneration"));
		clusterInfo.setConfigurations(_ctx.stringValue("DescribeExecutionPlanResponse.ClusterInfo.Configurations"));
		clusterInfo.setEasEnable(_ctx.booleanValue("DescribeExecutionPlanResponse.ClusterInfo.EasEnable"));
		clusterInfo.setUseCustomHiveMetaDB(_ctx.booleanValue("DescribeExecutionPlanResponse.ClusterInfo.UseCustomHiveMetaDB"));
		clusterInfo.setInitCustomHiveMetaDB(_ctx.booleanValue("DescribeExecutionPlanResponse.ClusterInfo.InitCustomHiveMetaDB"));
		clusterInfo.setUserDefinedEmrEcsRole(_ctx.stringValue("DescribeExecutionPlanResponse.ClusterInfo.UserDefinedEmrEcsRole"));
		clusterInfo.setUseLocalMetaDb(_ctx.booleanValue("DescribeExecutionPlanResponse.ClusterInfo.UseLocalMetaDb"));

		SoftwareInfo softwareInfo = new SoftwareInfo();
		softwareInfo.setEmrVer(_ctx.stringValue("DescribeExecutionPlanResponse.ClusterInfo.SoftwareInfo.EmrVer"));
		softwareInfo.setClusterType(_ctx.stringValue("DescribeExecutionPlanResponse.ClusterInfo.SoftwareInfo.ClusterType"));

		List<Software> softwares = new ArrayList<Software>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExecutionPlanResponse.ClusterInfo.SoftwareInfo.Softwares.Length"); i++) {
			Software software = new Software();
			software.setDisplayName(_ctx.stringValue("DescribeExecutionPlanResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].DisplayName"));
			software.setName(_ctx.stringValue("DescribeExecutionPlanResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].Name"));
			software.setOnlyDisplay(_ctx.booleanValue("DescribeExecutionPlanResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].OnlyDisplay"));
			software.setStartTpe(_ctx.integerValue("DescribeExecutionPlanResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].StartTpe"));
			software.setVersion(_ctx.stringValue("DescribeExecutionPlanResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].Version"));
			software.setOptional(_ctx.booleanValue("DescribeExecutionPlanResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].Optional"));

			softwares.add(software);
		}
		softwareInfo.setSoftwares(softwares);
		clusterInfo.setSoftwareInfo(softwareInfo);

		List<EcsOrderInfo> ecsOrders = new ArrayList<EcsOrderInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExecutionPlanResponse.ClusterInfo.EcsOrders.Length"); i++) {
			EcsOrderInfo ecsOrderInfo = new EcsOrderInfo();
			ecsOrderInfo.setIndex(_ctx.integerValue("DescribeExecutionPlanResponse.ClusterInfo.EcsOrders["+ i +"].Index"));
			ecsOrderInfo.setNodeCount(_ctx.integerValue("DescribeExecutionPlanResponse.ClusterInfo.EcsOrders["+ i +"].NodeCount"));
			ecsOrderInfo.setInstanceType(_ctx.stringValue("DescribeExecutionPlanResponse.ClusterInfo.EcsOrders["+ i +"].InstanceType"));
			ecsOrderInfo.setDiskType(_ctx.stringValue("DescribeExecutionPlanResponse.ClusterInfo.EcsOrders["+ i +"].DiskType"));
			ecsOrderInfo.setDiskCapacity(_ctx.integerValue("DescribeExecutionPlanResponse.ClusterInfo.EcsOrders["+ i +"].DiskCapacity"));
			ecsOrderInfo.setNodeType(_ctx.stringValue("DescribeExecutionPlanResponse.ClusterInfo.EcsOrders["+ i +"].NodeType"));
			ecsOrderInfo.setDiskCount(_ctx.integerValue("DescribeExecutionPlanResponse.ClusterInfo.EcsOrders["+ i +"].DiskCount"));

			ecsOrders.add(ecsOrderInfo);
		}
		clusterInfo.setEcsOrders(ecsOrders);

		List<BootstrapAction> bootstrapActionList = new ArrayList<BootstrapAction>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExecutionPlanResponse.ClusterInfo.BootstrapActionList.Length"); i++) {
			BootstrapAction bootstrapAction = new BootstrapAction();
			bootstrapAction.setName(_ctx.stringValue("DescribeExecutionPlanResponse.ClusterInfo.BootstrapActionList["+ i +"].Name"));
			bootstrapAction.setPath(_ctx.stringValue("DescribeExecutionPlanResponse.ClusterInfo.BootstrapActionList["+ i +"].Path"));
			bootstrapAction.setArg(_ctx.stringValue("DescribeExecutionPlanResponse.ClusterInfo.BootstrapActionList["+ i +"].Arg"));

			bootstrapActionList.add(bootstrapAction);
		}
		clusterInfo.setBootstrapActionList(bootstrapActionList);

		List<Config> configList = new ArrayList<Config>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExecutionPlanResponse.ClusterInfo.ConfigList.Length"); i++) {
			Config config = new Config();
			config.setServiceName(_ctx.stringValue("DescribeExecutionPlanResponse.ClusterInfo.ConfigList["+ i +"].ServiceName"));
			config.setFileName(_ctx.stringValue("DescribeExecutionPlanResponse.ClusterInfo.ConfigList["+ i +"].FileName"));
			config.setConfigKey(_ctx.stringValue("DescribeExecutionPlanResponse.ClusterInfo.ConfigList["+ i +"].ConfigKey"));
			config.setConfigValue(_ctx.stringValue("DescribeExecutionPlanResponse.ClusterInfo.ConfigList["+ i +"].ConfigValue"));
			config.setEncrypt(_ctx.stringValue("DescribeExecutionPlanResponse.ClusterInfo.ConfigList["+ i +"].Encrypt"));

			configList.add(config);
		}
		clusterInfo.setConfigList(configList);
		describeExecutionPlanResponse.setClusterInfo(clusterInfo);

		List<JobInfo> jobInfoList = new ArrayList<JobInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExecutionPlanResponse.JobInfoList.Length"); i++) {
			JobInfo jobInfo = new JobInfo();
			jobInfo.setId(_ctx.stringValue("DescribeExecutionPlanResponse.JobInfoList["+ i +"].Id"));
			jobInfo.setName(_ctx.stringValue("DescribeExecutionPlanResponse.JobInfoList["+ i +"].Name"));
			jobInfo.setType(_ctx.stringValue("DescribeExecutionPlanResponse.JobInfoList["+ i +"].Type"));
			jobInfo.setRunParameter(_ctx.stringValue("DescribeExecutionPlanResponse.JobInfoList["+ i +"].RunParameter"));
			jobInfo.setFailAct(_ctx.stringValue("DescribeExecutionPlanResponse.JobInfoList["+ i +"].FailAct"));

			jobInfoList.add(jobInfo);
		}
		describeExecutionPlanResponse.setJobInfoList(jobInfoList);
	 
	 	return describeExecutionPlanResponse;
	}
}