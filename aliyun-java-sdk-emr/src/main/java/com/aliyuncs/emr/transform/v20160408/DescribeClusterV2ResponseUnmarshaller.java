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

import com.aliyuncs.emr.model.v20160408.DescribeClusterV2Response;
import com.aliyuncs.emr.model.v20160408.DescribeClusterV2Response.ClusterInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterV2Response.ClusterInfo.BootstrapAction;
import com.aliyuncs.emr.model.v20160408.DescribeClusterV2Response.ClusterInfo.FailReason;
import com.aliyuncs.emr.model.v20160408.DescribeClusterV2Response.ClusterInfo.HostGroup;
import com.aliyuncs.emr.model.v20160408.DescribeClusterV2Response.ClusterInfo.HostGroup.Node;
import com.aliyuncs.emr.model.v20160408.DescribeClusterV2Response.ClusterInfo.HostGroup.Node.DaemonInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterV2Response.ClusterInfo.HostGroup.Node.DiskInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterV2Response.ClusterInfo.SoftwareInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterV2Response.ClusterInfo.SoftwareInfo.Software;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterV2ResponseUnmarshaller {

	public static DescribeClusterV2Response unmarshall(DescribeClusterV2Response describeClusterV2Response, UnmarshallerContext context) {
		
		describeClusterV2Response.setRequestId(context.stringValue("DescribeClusterV2Response.RequestId"));

		ClusterInfo clusterInfo = new ClusterInfo();
		clusterInfo.setId(context.stringValue("DescribeClusterV2Response.ClusterInfo.Id"));
		clusterInfo.setRegionId(context.stringValue("DescribeClusterV2Response.ClusterInfo.RegionId"));
		clusterInfo.setZoneId(context.stringValue("DescribeClusterV2Response.ClusterInfo.ZoneId"));
		clusterInfo.setName(context.stringValue("DescribeClusterV2Response.ClusterInfo.Name"));
		clusterInfo.setCreateType(context.stringValue("DescribeClusterV2Response.ClusterInfo.CreateType"));
		clusterInfo.setStartTime(context.longValue("DescribeClusterV2Response.ClusterInfo.StartTime"));
		clusterInfo.setStopTime(context.longValue("DescribeClusterV2Response.ClusterInfo.StopTime"));
		clusterInfo.setLogEnable(context.booleanValue("DescribeClusterV2Response.ClusterInfo.LogEnable"));
		clusterInfo.setLogPath(context.stringValue("DescribeClusterV2Response.ClusterInfo.LogPath"));
		clusterInfo.setUserId(context.stringValue("DescribeClusterV2Response.ClusterInfo.UserId"));
		clusterInfo.setStatus(context.stringValue("DescribeClusterV2Response.ClusterInfo.Status"));
		clusterInfo.setHighAvailabilityEnable(context.booleanValue("DescribeClusterV2Response.ClusterInfo.HighAvailabilityEnable"));
		clusterInfo.setChargeType(context.stringValue("DescribeClusterV2Response.ClusterInfo.ChargeType"));
		clusterInfo.setExpiredTime(context.longValue("DescribeClusterV2Response.ClusterInfo.ExpiredTime"));
		clusterInfo.setPeriod(context.integerValue("DescribeClusterV2Response.ClusterInfo.Period"));
		clusterInfo.setRunningTime(context.integerValue("DescribeClusterV2Response.ClusterInfo.RunningTime"));
		clusterInfo.setMasterNodeTotal(context.integerValue("DescribeClusterV2Response.ClusterInfo.MasterNodeTotal"));
		clusterInfo.setMasterNodeInService(context.integerValue("DescribeClusterV2Response.ClusterInfo.MasterNodeInService"));
		clusterInfo.setCoreNodeTotal(context.integerValue("DescribeClusterV2Response.ClusterInfo.CoreNodeTotal"));
		clusterInfo.setCoreNodeInService(context.integerValue("DescribeClusterV2Response.ClusterInfo.CoreNodeInService"));
		clusterInfo.setTaskNodeTotal(context.integerValue("DescribeClusterV2Response.ClusterInfo.TaskNodeTotal"));
		clusterInfo.setTaskNodeInService(context.integerValue("DescribeClusterV2Response.ClusterInfo.TaskNodeInService"));
		clusterInfo.setShowSoftwareInterface(context.booleanValue("DescribeClusterV2Response.ClusterInfo.ShowSoftwareInterface"));
		clusterInfo.setCreateResource(context.stringValue("DescribeClusterV2Response.ClusterInfo.CreateResource"));
		clusterInfo.setVpcId(context.stringValue("DescribeClusterV2Response.ClusterInfo.VpcId"));
		clusterInfo.setVSwitchId(context.stringValue("DescribeClusterV2Response.ClusterInfo.VSwitchId"));
		clusterInfo.setNetType(context.stringValue("DescribeClusterV2Response.ClusterInfo.NetType"));
		clusterInfo.setUserDefinedEmrEcsRole(context.stringValue("DescribeClusterV2Response.ClusterInfo.UserDefinedEmrEcsRole"));
		clusterInfo.setIoOptimized(context.booleanValue("DescribeClusterV2Response.ClusterInfo.IoOptimized"));
		clusterInfo.setInstanceGeneration(context.stringValue("DescribeClusterV2Response.ClusterInfo.InstanceGeneration"));
		clusterInfo.setImageId(context.stringValue("DescribeClusterV2Response.ClusterInfo.ImageId"));
		clusterInfo.setSecurityGroupId(context.stringValue("DescribeClusterV2Response.ClusterInfo.SecurityGroupId"));
		clusterInfo.setSecurityGroupName(context.stringValue("DescribeClusterV2Response.ClusterInfo.SecurityGroupName"));
		clusterInfo.setBootstrapFailed(context.booleanValue("DescribeClusterV2Response.ClusterInfo.BootstrapFailed"));
		clusterInfo.setConfigurations(context.stringValue("DescribeClusterV2Response.ClusterInfo.Configurations"));
		clusterInfo.setEasEnable(context.booleanValue("DescribeClusterV2Response.ClusterInfo.EasEnable"));

		FailReason failReason = new FailReason();
		failReason.setErrorCode(context.stringValue("DescribeClusterV2Response.ClusterInfo.FailReason.ErrorCode"));
		failReason.setErrorMsg(context.stringValue("DescribeClusterV2Response.ClusterInfo.FailReason.ErrorMsg"));
		failReason.setRequestId(context.stringValue("DescribeClusterV2Response.ClusterInfo.FailReason.RequestId"));
		clusterInfo.setFailReason(failReason);

		SoftwareInfo softwareInfo = new SoftwareInfo();
		softwareInfo.setEmrVer(context.stringValue("DescribeClusterV2Response.ClusterInfo.SoftwareInfo.EmrVer"));
		softwareInfo.setClusterType(context.stringValue("DescribeClusterV2Response.ClusterInfo.SoftwareInfo.ClusterType"));

		List<Software> softwares = new ArrayList<Software>();
		for (int i = 0; i < context.lengthValue("DescribeClusterV2Response.ClusterInfo.SoftwareInfo.Softwares.Length"); i++) {
			Software software = new Software();
			software.setDisplayName(context.stringValue("DescribeClusterV2Response.ClusterInfo.SoftwareInfo.Softwares["+ i +"].DisplayName"));
			software.setName(context.stringValue("DescribeClusterV2Response.ClusterInfo.SoftwareInfo.Softwares["+ i +"].Name"));
			software.setOnlyDisplay(context.booleanValue("DescribeClusterV2Response.ClusterInfo.SoftwareInfo.Softwares["+ i +"].OnlyDisplay"));
			software.setStartTpe(context.integerValue("DescribeClusterV2Response.ClusterInfo.SoftwareInfo.Softwares["+ i +"].StartTpe"));
			software.setVersion(context.stringValue("DescribeClusterV2Response.ClusterInfo.SoftwareInfo.Softwares["+ i +"].Version"));

			softwares.add(software);
		}
		softwareInfo.setSoftwares(softwares);
		clusterInfo.setSoftwareInfo(softwareInfo);

		List<HostGroup> hostGroupList = new ArrayList<HostGroup>();
		for (int i = 0; i < context.lengthValue("DescribeClusterV2Response.ClusterInfo.HostGroupList.Length"); i++) {
			HostGroup hostGroup = new HostGroup();
			hostGroup.setHostGroupId(context.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].HostGroupId"));
			hostGroup.setHostGroupName(context.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].HostGroupName"));
			hostGroup.setHostGroupType(context.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].HostGroupType"));
			hostGroup.setChargeType(context.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].ChargeType"));
			hostGroup.setPeriod(context.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Period"));
			hostGroup.setNodeCount(context.integerValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].NodeCount"));
			hostGroup.setInstanceType(context.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].InstanceType"));
			hostGroup.setCpuCore(context.integerValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].CpuCore"));
			hostGroup.setMemoryCapacity(context.integerValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].MemoryCapacity"));
			hostGroup.setDiskType(context.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].DiskType"));
			hostGroup.setDiskCapacity(context.integerValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].DiskCapacity"));
			hostGroup.setDiskCount(context.integerValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].DiskCount"));
			hostGroup.setBandWidth(context.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].BandWidth"));

			List<Node> nodes = new ArrayList<Node>();
			for (int j = 0; j < context.lengthValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes.Length"); j++) {
				Node node = new Node();
				node.setZoneId(context.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].ZoneId"));
				node.setInstanceId(context.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].InstanceId"));
				node.setStatus(context.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].Status"));
				node.setPubIp(context.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].PubIp"));
				node.setInnerIp(context.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].InnerIp"));
				node.setExpiredTime(context.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].ExpiredTime"));
				node.setCreateTime(context.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].CreateTime"));
				node.setEmrExpiredTime(context.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].EmrExpiredTime"));

				List<DaemonInfo> daemonInfos = new ArrayList<DaemonInfo>();
				for (int k = 0; k < context.lengthValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].DaemonInfos.Length"); k++) {
					DaemonInfo daemonInfo = new DaemonInfo();
					daemonInfo.setName(context.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].DaemonInfos["+ k +"].Name"));

					daemonInfos.add(daemonInfo);
				}
				node.setDaemonInfos(daemonInfos);

				List<DiskInfo> diskInfos = new ArrayList<DiskInfo>();
				for (int k = 0; k < context.lengthValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].DiskInfos.Length"); k++) {
					DiskInfo diskInfo = new DiskInfo();
					diskInfo.setDevice(context.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].DiskInfos["+ k +"].Device"));
					diskInfo.setDiskName(context.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].DiskInfos["+ k +"].DiskName"));
					diskInfo.setDiskId(context.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].DiskInfos["+ k +"].DiskId"));
					diskInfo.setType(context.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].DiskInfos["+ k +"].Type"));
					diskInfo.setSize(context.integerValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].DiskInfos["+ k +"].Size"));

					diskInfos.add(diskInfo);
				}
				node.setDiskInfos(diskInfos);

				nodes.add(node);
			}
			hostGroup.setNodes(nodes);

			hostGroupList.add(hostGroup);
		}
		clusterInfo.setHostGroupList(hostGroupList);

		List<BootstrapAction> bootstrapActionList = new ArrayList<BootstrapAction>();
		for (int i = 0; i < context.lengthValue("DescribeClusterV2Response.ClusterInfo.BootstrapActionList.Length"); i++) {
			BootstrapAction bootstrapAction = new BootstrapAction();
			bootstrapAction.setName(context.stringValue("DescribeClusterV2Response.ClusterInfo.BootstrapActionList["+ i +"].Name"));
			bootstrapAction.setPath(context.stringValue("DescribeClusterV2Response.ClusterInfo.BootstrapActionList["+ i +"].Path"));
			bootstrapAction.setArg(context.stringValue("DescribeClusterV2Response.ClusterInfo.BootstrapActionList["+ i +"].Arg"));

			bootstrapActionList.add(bootstrapAction);
		}
		clusterInfo.setBootstrapActionList(bootstrapActionList);
		describeClusterV2Response.setClusterInfo(clusterInfo);
	 
	 	return describeClusterV2Response;
	}
}