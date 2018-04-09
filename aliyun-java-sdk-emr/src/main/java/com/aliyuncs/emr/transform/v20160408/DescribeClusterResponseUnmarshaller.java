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

import com.aliyuncs.emr.model.v20160408.DescribeClusterResponse;
import com.aliyuncs.emr.model.v20160408.DescribeClusterResponse.ClusterInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterResponse.ClusterInfo.BootstrapAction;
import com.aliyuncs.emr.model.v20160408.DescribeClusterResponse.ClusterInfo.EcsOrderInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterResponse.ClusterInfo.EcsOrderInfo.Node;
import com.aliyuncs.emr.model.v20160408.DescribeClusterResponse.ClusterInfo.EcsOrderInfo.Node.DaemonInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterResponse.ClusterInfo.EcsOrderInfo.Node.DiskInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterResponse.ClusterInfo.FailReason;
import com.aliyuncs.emr.model.v20160408.DescribeClusterResponse.ClusterInfo.SoftwareInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterResponse.ClusterInfo.SoftwareInfo.Software;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterResponseUnmarshaller {

	public static DescribeClusterResponse unmarshall(DescribeClusterResponse describeClusterResponse, UnmarshallerContext context) {
		
		describeClusterResponse.setRequestId(context.stringValue("DescribeClusterResponse.RequestId"));

		ClusterInfo clusterInfo = new ClusterInfo();
		clusterInfo.setId(context.stringValue("DescribeClusterResponse.ClusterInfo.Id"));
		clusterInfo.setRegionId(context.stringValue("DescribeClusterResponse.ClusterInfo.RegionId"));
		clusterInfo.setZoneId(context.stringValue("DescribeClusterResponse.ClusterInfo.ZoneId"));
		clusterInfo.setName(context.stringValue("DescribeClusterResponse.ClusterInfo.Name"));
		clusterInfo.setCreateType(context.stringValue("DescribeClusterResponse.ClusterInfo.CreateType"));
		clusterInfo.setStartTime(context.longValue("DescribeClusterResponse.ClusterInfo.StartTime"));
		clusterInfo.setStopTime(context.longValue("DescribeClusterResponse.ClusterInfo.StopTime"));
		clusterInfo.setLogEnable(context.booleanValue("DescribeClusterResponse.ClusterInfo.LogEnable"));
		clusterInfo.setLogPath(context.stringValue("DescribeClusterResponse.ClusterInfo.LogPath"));
		clusterInfo.setUserId(context.stringValue("DescribeClusterResponse.ClusterInfo.UserId"));
		clusterInfo.setStatus(context.stringValue("DescribeClusterResponse.ClusterInfo.Status"));
		clusterInfo.setHighAvailabilityEnable(context.booleanValue("DescribeClusterResponse.ClusterInfo.HighAvailabilityEnable"));
		clusterInfo.setChargeType(context.stringValue("DescribeClusterResponse.ClusterInfo.ChargeType"));
		clusterInfo.setExpiredTime(context.longValue("DescribeClusterResponse.ClusterInfo.ExpiredTime"));
		clusterInfo.setPeriod(context.integerValue("DescribeClusterResponse.ClusterInfo.Period"));
		clusterInfo.setRunningTime(context.integerValue("DescribeClusterResponse.ClusterInfo.RunningTime"));
		clusterInfo.setMasterNodeTotal(context.integerValue("DescribeClusterResponse.ClusterInfo.MasterNodeTotal"));
		clusterInfo.setMasterNodeInService(context.integerValue("DescribeClusterResponse.ClusterInfo.MasterNodeInService"));
		clusterInfo.setCoreNodeTotal(context.integerValue("DescribeClusterResponse.ClusterInfo.CoreNodeTotal"));
		clusterInfo.setCoreNodeInService(context.integerValue("DescribeClusterResponse.ClusterInfo.CoreNodeInService"));
		clusterInfo.setTaskNodeTotal(context.integerValue("DescribeClusterResponse.ClusterInfo.TaskNodeTotal"));
		clusterInfo.setTaskNodeInService(context.integerValue("DescribeClusterResponse.ClusterInfo.TaskNodeInService"));
		clusterInfo.setShowSoftwareInterface(context.booleanValue("DescribeClusterResponse.ClusterInfo.ShowSoftwareInterface"));
		clusterInfo.setCreateResource(context.stringValue("DescribeClusterResponse.ClusterInfo.CreateResource"));
		clusterInfo.setVpcId(context.stringValue("DescribeClusterResponse.ClusterInfo.VpcId"));
		clusterInfo.setVSwitchId(context.stringValue("DescribeClusterResponse.ClusterInfo.VSwitchId"));
		clusterInfo.setNetType(context.stringValue("DescribeClusterResponse.ClusterInfo.NetType"));
		clusterInfo.setUserDefinedEmrEcsRole(context.stringValue("DescribeClusterResponse.ClusterInfo.UserDefinedEmrEcsRole"));
		clusterInfo.setIoOptimized(context.booleanValue("DescribeClusterResponse.ClusterInfo.IoOptimized"));
		clusterInfo.setInstanceGeneration(context.stringValue("DescribeClusterResponse.ClusterInfo.InstanceGeneration"));
		clusterInfo.setImageId(context.stringValue("DescribeClusterResponse.ClusterInfo.ImageId"));
		clusterInfo.setSecurityGroupId(context.stringValue("DescribeClusterResponse.ClusterInfo.SecurityGroupId"));
		clusterInfo.setSecurityGroupName(context.stringValue("DescribeClusterResponse.ClusterInfo.SecurityGroupName"));
		clusterInfo.setBootstrapFailed(context.booleanValue("DescribeClusterResponse.ClusterInfo.BootstrapFailed"));
		clusterInfo.setConfigurations(context.stringValue("DescribeClusterResponse.ClusterInfo.Configurations"));
		clusterInfo.setEasEnable(context.booleanValue("DescribeClusterResponse.ClusterInfo.EasEnable"));

		FailReason failReason = new FailReason();
		failReason.setErrorCode(context.stringValue("DescribeClusterResponse.ClusterInfo.FailReason.ErrorCode"));
		failReason.setErrorMsg(context.stringValue("DescribeClusterResponse.ClusterInfo.FailReason.ErrorMsg"));
		failReason.setRequestId(context.stringValue("DescribeClusterResponse.ClusterInfo.FailReason.RequestId"));
		clusterInfo.setFailReason(failReason);

		SoftwareInfo softwareInfo = new SoftwareInfo();
		softwareInfo.setEmrVer(context.stringValue("DescribeClusterResponse.ClusterInfo.SoftwareInfo.EmrVer"));
		softwareInfo.setClusterType(context.stringValue("DescribeClusterResponse.ClusterInfo.SoftwareInfo.ClusterType"));

		List<Software> softwares = new ArrayList<Software>();
		for (int i = 0; i < context.lengthValue("DescribeClusterResponse.ClusterInfo.SoftwareInfo.Softwares.Length"); i++) {
			Software software = new Software();
			software.setDisplayName(context.stringValue("DescribeClusterResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].DisplayName"));
			software.setName(context.stringValue("DescribeClusterResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].Name"));
			software.setOnlyDisplay(context.booleanValue("DescribeClusterResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].OnlyDisplay"));
			software.setStartTpe(context.integerValue("DescribeClusterResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].StartTpe"));
			software.setVersion(context.stringValue("DescribeClusterResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].Version"));

			softwares.add(software);
		}
		softwareInfo.setSoftwares(softwares);
		clusterInfo.setSoftwareInfo(softwareInfo);

		List<EcsOrderInfo> ecsOrderInfoList = new ArrayList<EcsOrderInfo>();
		for (int i = 0; i < context.lengthValue("DescribeClusterResponse.ClusterInfo.EcsOrderInfoList.Length"); i++) {
			EcsOrderInfo ecsOrderInfo = new EcsOrderInfo();
			ecsOrderInfo.setNodeType(context.stringValue("DescribeClusterResponse.ClusterInfo.EcsOrderInfoList["+ i +"].NodeType"));
			ecsOrderInfo.setInstanceType(context.stringValue("DescribeClusterResponse.ClusterInfo.EcsOrderInfoList["+ i +"].InstanceType"));
			ecsOrderInfo.setCpuCore(context.integerValue("DescribeClusterResponse.ClusterInfo.EcsOrderInfoList["+ i +"].CpuCore"));
			ecsOrderInfo.setMemoryCapacity(context.integerValue("DescribeClusterResponse.ClusterInfo.EcsOrderInfoList["+ i +"].MemoryCapacity"));
			ecsOrderInfo.setDiskType(context.stringValue("DescribeClusterResponse.ClusterInfo.EcsOrderInfoList["+ i +"].DiskType"));
			ecsOrderInfo.setDiskCapacity(context.integerValue("DescribeClusterResponse.ClusterInfo.EcsOrderInfoList["+ i +"].DiskCapacity"));
			ecsOrderInfo.setDiskCount(context.integerValue("DescribeClusterResponse.ClusterInfo.EcsOrderInfoList["+ i +"].DiskCount"));
			ecsOrderInfo.setBandWidth(context.stringValue("DescribeClusterResponse.ClusterInfo.EcsOrderInfoList["+ i +"].BandWidth"));

			List<Node> nodes = new ArrayList<Node>();
			for (int j = 0; j < context.lengthValue("DescribeClusterResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes.Length"); j++) {
				Node node = new Node();
				node.setZoneId(context.stringValue("DescribeClusterResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].ZoneId"));
				node.setInstanceId(context.stringValue("DescribeClusterResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].InstanceId"));
				node.setStatus(context.stringValue("DescribeClusterResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].Status"));
				node.setPubIp(context.stringValue("DescribeClusterResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].PubIp"));
				node.setInnerIp(context.stringValue("DescribeClusterResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].InnerIp"));
				node.setExpiredTime(context.stringValue("DescribeClusterResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].ExpiredTime"));
				node.setEmrExpiredTime(context.stringValue("DescribeClusterResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].EmrExpiredTime"));

				List<DaemonInfo> daemonInfos = new ArrayList<DaemonInfo>();
				for (int k = 0; k < context.lengthValue("DescribeClusterResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].DaemonInfos.Length"); k++) {
					DaemonInfo daemonInfo = new DaemonInfo();
					daemonInfo.setName(context.stringValue("DescribeClusterResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].DaemonInfos["+ k +"].Name"));

					daemonInfos.add(daemonInfo);
				}
				node.setDaemonInfos(daemonInfos);

				List<DiskInfo> diskInfos = new ArrayList<DiskInfo>();
				for (int k = 0; k < context.lengthValue("DescribeClusterResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].DiskInfos.Length"); k++) {
					DiskInfo diskInfo = new DiskInfo();
					diskInfo.setDevice(context.stringValue("DescribeClusterResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].DiskInfos["+ k +"].Device"));
					diskInfo.setDiskName(context.stringValue("DescribeClusterResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].DiskInfos["+ k +"].DiskName"));
					diskInfo.setDiskId(context.stringValue("DescribeClusterResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].DiskInfos["+ k +"].DiskId"));
					diskInfo.setType(context.stringValue("DescribeClusterResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].DiskInfos["+ k +"].Type"));
					diskInfo.setSize(context.integerValue("DescribeClusterResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].DiskInfos["+ k +"].Size"));

					diskInfos.add(diskInfo);
				}
				node.setDiskInfos(diskInfos);

				nodes.add(node);
			}
			ecsOrderInfo.setNodes(nodes);

			ecsOrderInfoList.add(ecsOrderInfo);
		}
		clusterInfo.setEcsOrderInfoList(ecsOrderInfoList);

		List<BootstrapAction> bootstrapActionList = new ArrayList<BootstrapAction>();
		for (int i = 0; i < context.lengthValue("DescribeClusterResponse.ClusterInfo.BootstrapActionList.Length"); i++) {
			BootstrapAction bootstrapAction = new BootstrapAction();
			bootstrapAction.setName(context.stringValue("DescribeClusterResponse.ClusterInfo.BootstrapActionList["+ i +"].Name"));
			bootstrapAction.setPath(context.stringValue("DescribeClusterResponse.ClusterInfo.BootstrapActionList["+ i +"].Path"));
			bootstrapAction.setArg(context.stringValue("DescribeClusterResponse.ClusterInfo.BootstrapActionList["+ i +"].Arg"));

			bootstrapActionList.add(bootstrapAction);
		}
		clusterInfo.setBootstrapActionList(bootstrapActionList);
		describeClusterResponse.setClusterInfo(clusterInfo);
	 
	 	return describeClusterResponse;
	}
}