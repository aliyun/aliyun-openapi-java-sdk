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

import com.aliyuncs.emr.model.v20160408.DescribeClusterForAdminResponse;
import com.aliyuncs.emr.model.v20160408.DescribeClusterForAdminResponse.ClusterInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterForAdminResponse.ClusterInfo.BootstrapAction;
import com.aliyuncs.emr.model.v20160408.DescribeClusterForAdminResponse.ClusterInfo.EcsOrderInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterForAdminResponse.ClusterInfo.EcsOrderInfo.Node2;
import com.aliyuncs.emr.model.v20160408.DescribeClusterForAdminResponse.ClusterInfo.EcsOrderInfo.Node2.DaemonInfo5;
import com.aliyuncs.emr.model.v20160408.DescribeClusterForAdminResponse.ClusterInfo.EcsOrderInfo.Node2.DiskInfo6;
import com.aliyuncs.emr.model.v20160408.DescribeClusterForAdminResponse.ClusterInfo.FailReason;
import com.aliyuncs.emr.model.v20160408.DescribeClusterForAdminResponse.ClusterInfo.HostGroup;
import com.aliyuncs.emr.model.v20160408.DescribeClusterForAdminResponse.ClusterInfo.HostGroup.Node;
import com.aliyuncs.emr.model.v20160408.DescribeClusterForAdminResponse.ClusterInfo.HostGroup.Node.DaemonInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterForAdminResponse.ClusterInfo.HostGroup.Node.DiskInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterForAdminResponse.ClusterInfo.SoftwareInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterForAdminResponse.ClusterInfo.SoftwareInfo.Software;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterForAdminResponseUnmarshaller {

	public static DescribeClusterForAdminResponse unmarshall(DescribeClusterForAdminResponse describeClusterForAdminResponse, UnmarshallerContext context) {
		
		describeClusterForAdminResponse.setRequestId(context.stringValue("DescribeClusterForAdminResponse.RequestId"));

		ClusterInfo clusterInfo = new ClusterInfo();
		clusterInfo.setId(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.Id"));
		clusterInfo.setRegionId(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.RegionId"));
		clusterInfo.setZoneId(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.ZoneId"));
		clusterInfo.setName(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.Name"));
		clusterInfo.setCreateType(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.CreateType"));
		clusterInfo.setStartTime(context.longValue("DescribeClusterForAdminResponse.ClusterInfo.StartTime"));
		clusterInfo.setStopTime(context.longValue("DescribeClusterForAdminResponse.ClusterInfo.StopTime"));
		clusterInfo.setLogEnable(context.booleanValue("DescribeClusterForAdminResponse.ClusterInfo.LogEnable"));
		clusterInfo.setLogPath(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.LogPath"));
		clusterInfo.setStatus(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.Status"));
		clusterInfo.setHighAvailabilityEnable(context.booleanValue("DescribeClusterForAdminResponse.ClusterInfo.HighAvailabilityEnable"));
		clusterInfo.setChargeType(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.ChargeType"));
		clusterInfo.setExpiredTime(context.longValue("DescribeClusterForAdminResponse.ClusterInfo.ExpiredTime"));
		clusterInfo.setPeriod(context.integerValue("DescribeClusterForAdminResponse.ClusterInfo.Period"));
		clusterInfo.setRunningTime(context.integerValue("DescribeClusterForAdminResponse.ClusterInfo.RunningTime"));
		clusterInfo.setMasterNodeTotal(context.integerValue("DescribeClusterForAdminResponse.ClusterInfo.MasterNodeTotal"));
		clusterInfo.setMasterNodeInService(context.integerValue("DescribeClusterForAdminResponse.ClusterInfo.MasterNodeInService"));
		clusterInfo.setCoreNodeTotal(context.integerValue("DescribeClusterForAdminResponse.ClusterInfo.CoreNodeTotal"));
		clusterInfo.setCoreNodeInService(context.integerValue("DescribeClusterForAdminResponse.ClusterInfo.CoreNodeInService"));
		clusterInfo.setTaskNodeTotal(context.integerValue("DescribeClusterForAdminResponse.ClusterInfo.TaskNodeTotal"));
		clusterInfo.setTaskNodeInService(context.integerValue("DescribeClusterForAdminResponse.ClusterInfo.TaskNodeInService"));
		clusterInfo.setShowSoftwareInterface(context.booleanValue("DescribeClusterForAdminResponse.ClusterInfo.ShowSoftwareInterface"));
		clusterInfo.setCreateResource(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.CreateResource"));
		clusterInfo.setVpcId(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.VpcId"));
		clusterInfo.setVSwitchId(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.VSwitchId"));
		clusterInfo.setNetType(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.NetType"));
		clusterInfo.setUserDefinedEmrEcsRole(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.UserDefinedEmrEcsRole"));
		clusterInfo.setIoOptimized(context.booleanValue("DescribeClusterForAdminResponse.ClusterInfo.IoOptimized"));
		clusterInfo.setInstanceGeneration(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.InstanceGeneration"));
		clusterInfo.setImageId(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.ImageId"));
		clusterInfo.setSecurityGroupId(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.SecurityGroupId"));
		clusterInfo.setSecurityGroupName(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.SecurityGroupName"));
		clusterInfo.setBootstrapFailed(context.booleanValue("DescribeClusterForAdminResponse.ClusterInfo.BootstrapFailed"));
		clusterInfo.setConfigurations(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.Configurations"));

		FailReason failReason = new FailReason();
		failReason.setErrorCode(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.FailReason.ErrorCode"));
		failReason.setErrorMsg(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.FailReason.ErrorMsg"));
		failReason.setRequestId(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.FailReason.RequestId"));
		clusterInfo.setFailReason(failReason);

		SoftwareInfo softwareInfo = new SoftwareInfo();
		softwareInfo.setEmrVer(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.SoftwareInfo.EmrVer"));
		softwareInfo.setClusterType(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.SoftwareInfo.ClusterType"));

		List<Software> softwares = new ArrayList<Software>();
		for (int i = 0; i < context.lengthValue("DescribeClusterForAdminResponse.ClusterInfo.SoftwareInfo.Softwares.Length"); i++) {
			Software software = new Software();
			software.setDisplayName(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].DisplayName"));
			software.setName(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].Name"));
			software.setOnlyDisplay(context.booleanValue("DescribeClusterForAdminResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].OnlyDisplay"));
			software.setStartTpe(context.integerValue("DescribeClusterForAdminResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].StartTpe"));
			software.setVersion(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].Version"));

			softwares.add(software);
		}
		softwareInfo.setSoftwares(softwares);
		clusterInfo.setSoftwareInfo(softwareInfo);

		List<HostGroup> hostGroupList = new ArrayList<HostGroup>();
		for (int i = 0; i < context.lengthValue("DescribeClusterForAdminResponse.ClusterInfo.HostGroupList.Length"); i++) {
			HostGroup hostGroup = new HostGroup();
			hostGroup.setHostGroupId(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.HostGroupList["+ i +"].HostGroupId"));
			hostGroup.setHostGroupName(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.HostGroupList["+ i +"].HostGroupName"));
			hostGroup.setHostGroupType(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.HostGroupList["+ i +"].HostGroupType"));
			hostGroup.setChargeType(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.HostGroupList["+ i +"].ChargeType"));
			hostGroup.setPeriod(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.HostGroupList["+ i +"].Period"));
			hostGroup.setNodeCount(context.integerValue("DescribeClusterForAdminResponse.ClusterInfo.HostGroupList["+ i +"].NodeCount"));
			hostGroup.setInstanceType(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.HostGroupList["+ i +"].InstanceType"));
			hostGroup.setCpuCore(context.integerValue("DescribeClusterForAdminResponse.ClusterInfo.HostGroupList["+ i +"].CpuCore"));
			hostGroup.setMemoryCapacity(context.integerValue("DescribeClusterForAdminResponse.ClusterInfo.HostGroupList["+ i +"].MemoryCapacity"));
			hostGroup.setDiskType(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.HostGroupList["+ i +"].DiskType"));
			hostGroup.setDiskCapacity(context.integerValue("DescribeClusterForAdminResponse.ClusterInfo.HostGroupList["+ i +"].DiskCapacity"));
			hostGroup.setDiskCount(context.integerValue("DescribeClusterForAdminResponse.ClusterInfo.HostGroupList["+ i +"].DiskCount"));
			hostGroup.setBandWidth(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.HostGroupList["+ i +"].BandWidth"));

			List<Node> nodes = new ArrayList<Node>();
			for (int j = 0; j < context.lengthValue("DescribeClusterForAdminResponse.ClusterInfo.HostGroupList["+ i +"].Nodes.Length"); j++) {
				Node node = new Node();
				node.setZoneId(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].ZoneId"));
				node.setInstanceId(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].InstanceId"));
				node.setStatus(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].Status"));
				node.setPubIp(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].PubIp"));
				node.setInnerIp(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].InnerIp"));
				node.setExpiredTime(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].ExpiredTime"));
				node.setEmrExpiredTime(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].EmrExpiredTime"));

				List<DaemonInfo> daemonInfos = new ArrayList<DaemonInfo>();
				for (int k = 0; k < context.lengthValue("DescribeClusterForAdminResponse.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].DaemonInfos.Length"); k++) {
					DaemonInfo daemonInfo = new DaemonInfo();
					daemonInfo.setName(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].DaemonInfos["+ k +"].Name"));

					daemonInfos.add(daemonInfo);
				}
				node.setDaemonInfos(daemonInfos);

				List<DiskInfo> diskInfos = new ArrayList<DiskInfo>();
				for (int k = 0; k < context.lengthValue("DescribeClusterForAdminResponse.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].DiskInfos.Length"); k++) {
					DiskInfo diskInfo = new DiskInfo();
					diskInfo.setDevice(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].DiskInfos["+ k +"].Device"));
					diskInfo.setDiskName(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].DiskInfos["+ k +"].DiskName"));
					diskInfo.setDiskId(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].DiskInfos["+ k +"].DiskId"));
					diskInfo.setType(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].DiskInfos["+ k +"].Type"));
					diskInfo.setSize(context.integerValue("DescribeClusterForAdminResponse.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].DiskInfos["+ k +"].Size"));

					diskInfos.add(diskInfo);
				}
				node.setDiskInfos(diskInfos);

				nodes.add(node);
			}
			hostGroup.setNodes(nodes);

			hostGroupList.add(hostGroup);
		}
		clusterInfo.setHostGroupList(hostGroupList);

		List<EcsOrderInfo> ecsOrderInfoList = new ArrayList<EcsOrderInfo>();
		for (int i = 0; i < context.lengthValue("DescribeClusterForAdminResponse.ClusterInfo.EcsOrderInfoList.Length"); i++) {
			EcsOrderInfo ecsOrderInfo = new EcsOrderInfo();
			ecsOrderInfo.setNodeType(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].NodeType"));
			ecsOrderInfo.setInstanceType(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].InstanceType"));
			ecsOrderInfo.setCpuCore(context.integerValue("DescribeClusterForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].CpuCore"));
			ecsOrderInfo.setMemoryCapacity(context.integerValue("DescribeClusterForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].MemoryCapacity"));
			ecsOrderInfo.setDiskType(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].DiskType"));
			ecsOrderInfo.setDiskCapacity(context.integerValue("DescribeClusterForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].DiskCapacity"));
			ecsOrderInfo.setDiskCount(context.integerValue("DescribeClusterForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].DiskCount"));
			ecsOrderInfo.setBandWidth(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].BandWidth"));

			List<Node2> nodes1 = new ArrayList<Node2>();
			for (int j = 0; j < context.lengthValue("DescribeClusterForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes.Length"); j++) {
				Node2 node2 = new Node2();
				node2.setZoneId(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].ZoneId"));
				node2.setInstanceId(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].InstanceId"));
				node2.setStatus(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].Status"));
				node2.setPubIp(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].PubIp"));
				node2.setInnerIp(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].InnerIp"));
				node2.setExpiredTime(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].ExpiredTime"));
				node2.setEmrExpiredTime(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].EmrExpiredTime"));

				List<DaemonInfo5> daemonInfos3 = new ArrayList<DaemonInfo5>();
				for (int k = 0; k < context.lengthValue("DescribeClusterForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].DaemonInfos.Length"); k++) {
					DaemonInfo5 daemonInfo5 = new DaemonInfo5();
					daemonInfo5.setName(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].DaemonInfos["+ k +"].Name"));

					daemonInfos3.add(daemonInfo5);
				}
				node2.setDaemonInfos3(daemonInfos3);

				List<DiskInfo6> diskInfos4 = new ArrayList<DiskInfo6>();
				for (int k = 0; k < context.lengthValue("DescribeClusterForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].DiskInfos.Length"); k++) {
					DiskInfo6 diskInfo6 = new DiskInfo6();
					diskInfo6.setDevice(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].DiskInfos["+ k +"].Device"));
					diskInfo6.setDiskName(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].DiskInfos["+ k +"].DiskName"));
					diskInfo6.setDiskId(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].DiskInfos["+ k +"].DiskId"));
					diskInfo6.setType(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].DiskInfos["+ k +"].Type"));
					diskInfo6.setSize(context.integerValue("DescribeClusterForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].DiskInfos["+ k +"].Size"));

					diskInfos4.add(diskInfo6);
				}
				node2.setDiskInfos4(diskInfos4);

				nodes1.add(node2);
			}
			ecsOrderInfo.setNodes1(nodes1);

			ecsOrderInfoList.add(ecsOrderInfo);
		}
		clusterInfo.setEcsOrderInfoList(ecsOrderInfoList);

		List<BootstrapAction> bootstrapActionList = new ArrayList<BootstrapAction>();
		for (int i = 0; i < context.lengthValue("DescribeClusterForAdminResponse.ClusterInfo.BootstrapActionList.Length"); i++) {
			BootstrapAction bootstrapAction = new BootstrapAction();
			bootstrapAction.setName(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.BootstrapActionList["+ i +"].Name"));
			bootstrapAction.setPath(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.BootstrapActionList["+ i +"].Path"));
			bootstrapAction.setArg(context.stringValue("DescribeClusterForAdminResponse.ClusterInfo.BootstrapActionList["+ i +"].Arg"));

			bootstrapActionList.add(bootstrapAction);
		}
		clusterInfo.setBootstrapActionList(bootstrapActionList);
		describeClusterForAdminResponse.setClusterInfo(clusterInfo);
	 
	 	return describeClusterForAdminResponse;
	}
}