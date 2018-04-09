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

import com.aliyuncs.emr.model.v20160408.DescribeClusterBasicInfoForAdminResponse;
import com.aliyuncs.emr.model.v20160408.DescribeClusterBasicInfoForAdminResponse.ClusterInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterBasicInfoForAdminResponse.ClusterInfo.BootstrapAction;
import com.aliyuncs.emr.model.v20160408.DescribeClusterBasicInfoForAdminResponse.ClusterInfo.EcsOrderInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterBasicInfoForAdminResponse.ClusterInfo.EcsOrderInfo.Node;
import com.aliyuncs.emr.model.v20160408.DescribeClusterBasicInfoForAdminResponse.ClusterInfo.EcsOrderInfo.Node.DiskInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterBasicInfoForAdminResponse.ClusterInfo.FailReason;
import com.aliyuncs.emr.model.v20160408.DescribeClusterBasicInfoForAdminResponse.ClusterInfo.SoftwareInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterBasicInfoForAdminResponse.ClusterInfo.SoftwareInfo.Software;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterBasicInfoForAdminResponseUnmarshaller {

	public static DescribeClusterBasicInfoForAdminResponse unmarshall(DescribeClusterBasicInfoForAdminResponse describeClusterBasicInfoForAdminResponse, UnmarshallerContext context) {
		
		describeClusterBasicInfoForAdminResponse.setRequestId(context.stringValue("DescribeClusterBasicInfoForAdminResponse.RequestId"));

		ClusterInfo clusterInfo = new ClusterInfo();
		clusterInfo.setId(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.Id"));
		clusterInfo.setBizId(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.BizId"));
		clusterInfo.setRegionId(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.RegionId"));
		clusterInfo.setZoneId(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.ZoneId"));
		clusterInfo.setName(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.Name"));
		clusterInfo.setCreateType(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.CreateType"));
		clusterInfo.setClusterType(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.ClusterType"));
		clusterInfo.setStartTime(context.longValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.StartTime"));
		clusterInfo.setStopTime(context.longValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.StopTime"));
		clusterInfo.setLogEnable(context.booleanValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.LogEnable"));
		clusterInfo.setLogPath(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.LogPath"));
		clusterInfo.setUserId(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.UserId"));
		clusterInfo.setStatus(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.Status"));
		clusterInfo.setHighAvailabilityEnable(context.booleanValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.HighAvailabilityEnable"));
		clusterInfo.setPayType(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.PayType"));
		clusterInfo.setExpiredTime(context.longValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.ExpiredTime"));
		clusterInfo.setPeriod(context.integerValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.Period"));
		clusterInfo.setRunningTime(context.integerValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.RunningTime"));
		clusterInfo.setMasterNodeTotal(context.integerValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.MasterNodeTotal"));
		clusterInfo.setMasterNodeInService(context.integerValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.MasterNodeInService"));
		clusterInfo.setCoreNodeTotal(context.integerValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.CoreNodeTotal"));
		clusterInfo.setCoreNodeInService(context.integerValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.CoreNodeInService"));
		clusterInfo.setTaskNodeTotal(context.integerValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.TaskNodeTotal"));
		clusterInfo.setTaskNodeInService(context.integerValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.TaskNodeInService"));
		clusterInfo.setShowSoftwareInterface(context.booleanValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.ShowSoftwareInterface"));
		clusterInfo.setCreateResource(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.CreateResource"));
		clusterInfo.setEcmClusterId(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.EcmClusterId"));
		clusterInfo.setVpcId(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.VpcId"));
		clusterInfo.setVSwitchId(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.VSwitchId"));
		clusterInfo.setNetType(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.NetType"));
		clusterInfo.setUserDefinedEmrEcsRole(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.UserDefinedEmrEcsRole"));
		clusterInfo.setIoOptimized(context.booleanValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.IoOptimized"));
		clusterInfo.setInstanceGeneration(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.InstanceGeneration"));
		clusterInfo.setImageId(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.ImageId"));
		clusterInfo.setSecurityGroupId(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.SecurityGroupId"));
		clusterInfo.setSecurityGroupName(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.SecurityGroupName"));
		clusterInfo.setBootstrapFailed(context.booleanValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.BootstrapFailed"));
		clusterInfo.setConfigurations(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.Configurations"));

		FailReason failReason = new FailReason();
		failReason.setErrorCode(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.FailReason.ErrorCode"));
		failReason.setErrorMsg(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.FailReason.ErrorMsg"));
		failReason.setRequestId(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.FailReason.RequestId"));
		clusterInfo.setFailReason(failReason);

		SoftwareInfo softwareInfo = new SoftwareInfo();
		softwareInfo.setEmrVer(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.SoftwareInfo.EmrVer"));
		softwareInfo.setClusterType(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.SoftwareInfo.ClusterType"));

		List<Software> softwares = new ArrayList<Software>();
		for (int i = 0; i < context.lengthValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.SoftwareInfo.Softwares.Length"); i++) {
			Software software = new Software();
			software.setDisplayName(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].DisplayName"));
			software.setName(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].Name"));
			software.setOnlyDisplay(context.booleanValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].OnlyDisplay"));
			software.setStartTpe(context.integerValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].StartTpe"));
			software.setVersion(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].Version"));

			softwares.add(software);
		}
		softwareInfo.setSoftwares(softwares);
		clusterInfo.setSoftwareInfo(softwareInfo);

		List<EcsOrderInfo> ecsOrderInfoList = new ArrayList<EcsOrderInfo>();
		for (int i = 0; i < context.lengthValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.EcsOrderInfoList.Length"); i++) {
			EcsOrderInfo ecsOrderInfo = new EcsOrderInfo();
			ecsOrderInfo.setNodeType(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].NodeType"));
			ecsOrderInfo.setInstanceType(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].InstanceType"));
			ecsOrderInfo.setCpuCore(context.integerValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].CpuCore"));
			ecsOrderInfo.setMemoryCapacity(context.integerValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].MemoryCapacity"));
			ecsOrderInfo.setDiskType(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].DiskType"));
			ecsOrderInfo.setDiskCapacity(context.integerValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].DiskCapacity"));
			ecsOrderInfo.setDiskCount(context.integerValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].DiskCount"));
			ecsOrderInfo.setBandWidth(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].BandWidth"));

			List<Node> nodes = new ArrayList<Node>();
			for (int j = 0; j < context.lengthValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes.Length"); j++) {
				Node node = new Node();
				node.setZoneId(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].ZoneId"));
				node.setInstanceId(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].InstanceId"));
				node.setStatus(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].Status"));
				node.setPubIp(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].PubIp"));
				node.setInnerIp(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].InnerIp"));
				node.setExpiredTime(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].ExpiredTime"));
				node.setEmrExpiredTime(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].EmrExpiredTime"));

				List<DiskInfo> diskInfos = new ArrayList<DiskInfo>();
				for (int k = 0; k < context.lengthValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].DiskInfos.Length"); k++) {
					DiskInfo diskInfo = new DiskInfo();
					diskInfo.setDevice(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].DiskInfos["+ k +"].Device"));
					diskInfo.setDiskName(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].DiskInfos["+ k +"].DiskName"));
					diskInfo.setDiskId(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].DiskInfos["+ k +"].DiskId"));
					diskInfo.setType(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].DiskInfos["+ k +"].Type"));
					diskInfo.setSize(context.integerValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.EcsOrderInfoList["+ i +"].Nodes["+ j +"].DiskInfos["+ k +"].Size"));

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
		for (int i = 0; i < context.lengthValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.BootstrapActionList.Length"); i++) {
			BootstrapAction bootstrapAction = new BootstrapAction();
			bootstrapAction.setName(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.BootstrapActionList["+ i +"].Name"));
			bootstrapAction.setPath(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.BootstrapActionList["+ i +"].Path"));
			bootstrapAction.setArg(context.stringValue("DescribeClusterBasicInfoForAdminResponse.ClusterInfo.BootstrapActionList["+ i +"].Arg"));

			bootstrapActionList.add(bootstrapAction);
		}
		clusterInfo.setBootstrapActionList(bootstrapActionList);
		describeClusterBasicInfoForAdminResponse.setClusterInfo(clusterInfo);
	 
	 	return describeClusterBasicInfoForAdminResponse;
	}
}