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
import com.aliyuncs.emr.model.v20160408.DescribeClusterV2Response.ClusterInfo.AccessInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterV2Response.ClusterInfo.AccessInfo.ZKLink;
import com.aliyuncs.emr.model.v20160408.DescribeClusterV2Response.ClusterInfo.BootstrapAction;
import com.aliyuncs.emr.model.v20160408.DescribeClusterV2Response.ClusterInfo.FailReason;
import com.aliyuncs.emr.model.v20160408.DescribeClusterV2Response.ClusterInfo.GatewayClusterInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterV2Response.ClusterInfo.HostGroup;
import com.aliyuncs.emr.model.v20160408.DescribeClusterV2Response.ClusterInfo.HostGroup.Node;
import com.aliyuncs.emr.model.v20160408.DescribeClusterV2Response.ClusterInfo.HostGroup.Node.DaemonInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterV2Response.ClusterInfo.HostGroup.Node.DiskInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterV2Response.ClusterInfo.HostPoolInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterV2Response.ClusterInfo.RelateClusterInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterV2Response.ClusterInfo.SoftwareInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterV2Response.ClusterInfo.SoftwareInfo.Software;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterV2ResponseUnmarshaller {

	public static DescribeClusterV2Response unmarshall(DescribeClusterV2Response describeClusterV2Response, UnmarshallerContext _ctx) {
		
		describeClusterV2Response.setRequestId(_ctx.stringValue("DescribeClusterV2Response.RequestId"));

		ClusterInfo clusterInfo = new ClusterInfo();
		clusterInfo.setId(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.Id"));
		clusterInfo.setRegionId(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.RegionId"));
		clusterInfo.setDepositType(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.DepositType"));
		clusterInfo.setMachineType(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.MachineType"));
		clusterInfo.setZoneId(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.ZoneId"));
		clusterInfo.setName(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.Name"));
		clusterInfo.setExtraInfo(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.ExtraInfo"));
		clusterInfo.setRelateClusterId(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.RelateClusterId"));
		clusterInfo.setGatewayClusterIds(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.GatewayClusterIds"));
		clusterInfo.setCreateType(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.CreateType"));
		clusterInfo.setStartTime(_ctx.longValue("DescribeClusterV2Response.ClusterInfo.StartTime"));
		clusterInfo.setExpiredTime(_ctx.longValue("DescribeClusterV2Response.ClusterInfo.ExpiredTime"));
		clusterInfo.setStopTime(_ctx.longValue("DescribeClusterV2Response.ClusterInfo.StopTime"));
		clusterInfo.setLogEnable(_ctx.booleanValue("DescribeClusterV2Response.ClusterInfo.LogEnable"));
		clusterInfo.setLogPath(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.LogPath"));
		clusterInfo.setUserId(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.UserId"));
		clusterInfo.setStatus(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.Status"));
		clusterInfo.setHighAvailabilityEnable(_ctx.booleanValue("DescribeClusterV2Response.ClusterInfo.HighAvailabilityEnable"));
		clusterInfo.setLocalMetaDb(_ctx.booleanValue("DescribeClusterV2Response.ClusterInfo.LocalMetaDb"));
		clusterInfo.setChargeType(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.ChargeType"));
		clusterInfo.setPeriod(_ctx.integerValue("DescribeClusterV2Response.ClusterInfo.Period"));
		clusterInfo.setRunningTime(_ctx.integerValue("DescribeClusterV2Response.ClusterInfo.RunningTime"));
		clusterInfo.setMasterNodeTotal(_ctx.integerValue("DescribeClusterV2Response.ClusterInfo.MasterNodeTotal"));
		clusterInfo.setMasterNodeInService(_ctx.integerValue("DescribeClusterV2Response.ClusterInfo.MasterNodeInService"));
		clusterInfo.setCoreNodeTotal(_ctx.integerValue("DescribeClusterV2Response.ClusterInfo.CoreNodeTotal"));
		clusterInfo.setCoreNodeInService(_ctx.integerValue("DescribeClusterV2Response.ClusterInfo.CoreNodeInService"));
		clusterInfo.setTaskNodeTotal(_ctx.integerValue("DescribeClusterV2Response.ClusterInfo.TaskNodeTotal"));
		clusterInfo.setTaskNodeInService(_ctx.integerValue("DescribeClusterV2Response.ClusterInfo.TaskNodeInService"));
		clusterInfo.setShowSoftwareInterface(_ctx.booleanValue("DescribeClusterV2Response.ClusterInfo.ShowSoftwareInterface"));
		clusterInfo.setCreateResource(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.CreateResource"));
		clusterInfo.setVpcId(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.VpcId"));
		clusterInfo.setVSwitchId(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.VSwitchId"));
		clusterInfo.setNetType(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.NetType"));
		clusterInfo.setUserDefinedEmrEcsRole(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.UserDefinedEmrEcsRole"));
		clusterInfo.setIoOptimized(_ctx.booleanValue("DescribeClusterV2Response.ClusterInfo.IoOptimized"));
		clusterInfo.setInstanceGeneration(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.InstanceGeneration"));
		clusterInfo.setImageId(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.ImageId"));
		clusterInfo.setSecurityGroupId(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.SecurityGroupId"));
		clusterInfo.setSecurityGroupName(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.SecurityGroupName"));
		clusterInfo.setBootstrapFailed(_ctx.booleanValue("DescribeClusterV2Response.ClusterInfo.BootstrapFailed"));
		clusterInfo.setConfigurations(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.Configurations"));
		clusterInfo.setEasEnable(_ctx.booleanValue("DescribeClusterV2Response.ClusterInfo.EasEnable"));
		clusterInfo.setAutoScalingVersion(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.AutoScalingVersion"));
		clusterInfo.setAutoScalingEnable(_ctx.booleanValue("DescribeClusterV2Response.ClusterInfo.AutoScalingEnable"));
		clusterInfo.setAutoScalingAllowed(_ctx.booleanValue("DescribeClusterV2Response.ClusterInfo.AutoScalingAllowed"));
		clusterInfo.setAutoScalingSpotWithLimitAllowed(_ctx.booleanValue("DescribeClusterV2Response.ClusterInfo.AutoScalingSpotWithLimitAllowed"));
		clusterInfo.setAutoScalingByLoadAllowed(_ctx.booleanValue("DescribeClusterV2Response.ClusterInfo.AutoScalingByLoadAllowed"));
		clusterInfo.setAutoScalingWithGraceAllowed(_ctx.booleanValue("DescribeClusterV2Response.ClusterInfo.AutoScalingWithGraceAllowed"));
		clusterInfo.setResizeDiskEnable(_ctx.booleanValue("DescribeClusterV2Response.ClusterInfo.ResizeDiskEnable"));
		clusterInfo.setMetaStoreType(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.MetaStoreType"));
		clusterInfo.setK8sClusterId(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.K8sClusterId"));

		RelateClusterInfo relateClusterInfo = new RelateClusterInfo();
		relateClusterInfo.setClusterId(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.RelateClusterInfo.ClusterId"));
		relateClusterInfo.setClusterName(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.RelateClusterInfo.ClusterName"));
		relateClusterInfo.setStatus(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.RelateClusterInfo.Status"));
		clusterInfo.setRelateClusterInfo(relateClusterInfo);

		HostPoolInfo hostPoolInfo = new HostPoolInfo();
		hostPoolInfo.setHpBizId(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.HostPoolInfo.HpBizId"));
		hostPoolInfo.setHpName(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.HostPoolInfo.HpName"));
		clusterInfo.setHostPoolInfo(hostPoolInfo);

		FailReason failReason = new FailReason();
		failReason.setErrorCode(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.FailReason.ErrorCode"));
		failReason.setErrorMsg(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.FailReason.ErrorMsg"));
		failReason.setRequestId(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.FailReason.RequestId"));
		clusterInfo.setFailReason(failReason);

		SoftwareInfo softwareInfo = new SoftwareInfo();
		softwareInfo.setEmrVer(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.SoftwareInfo.EmrVer"));
		softwareInfo.setClusterType(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.SoftwareInfo.ClusterType"));

		List<Software> softwares = new ArrayList<Software>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterV2Response.ClusterInfo.SoftwareInfo.Softwares.Length"); i++) {
			Software software = new Software();
			software.setDisplayName(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.SoftwareInfo.Softwares["+ i +"].DisplayName"));
			software.setName(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.SoftwareInfo.Softwares["+ i +"].Name"));
			software.setOnlyDisplay(_ctx.booleanValue("DescribeClusterV2Response.ClusterInfo.SoftwareInfo.Softwares["+ i +"].OnlyDisplay"));
			software.setStartTpe(_ctx.integerValue("DescribeClusterV2Response.ClusterInfo.SoftwareInfo.Softwares["+ i +"].StartTpe"));
			software.setVersion(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.SoftwareInfo.Softwares["+ i +"].Version"));

			softwares.add(software);
		}
		softwareInfo.setSoftwares(softwares);
		clusterInfo.setSoftwareInfo(softwareInfo);

		AccessInfo accessInfo = new AccessInfo();

		List<ZKLink> zKLinks = new ArrayList<ZKLink>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterV2Response.ClusterInfo.AccessInfo.ZKLinks.Length"); i++) {
			ZKLink zKLink = new ZKLink();
			zKLink.setLink(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.AccessInfo.ZKLinks["+ i +"].Link"));
			zKLink.setPort(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.AccessInfo.ZKLinks["+ i +"].Port"));

			zKLinks.add(zKLink);
		}
		accessInfo.setZKLinks(zKLinks);
		clusterInfo.setAccessInfo(accessInfo);

		List<GatewayClusterInfo> gatewayClusterInfoList = new ArrayList<GatewayClusterInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterV2Response.ClusterInfo.GatewayClusterInfoList.Length"); i++) {
			GatewayClusterInfo gatewayClusterInfo = new GatewayClusterInfo();
			gatewayClusterInfo.setClusterId(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.GatewayClusterInfoList["+ i +"].ClusterId"));
			gatewayClusterInfo.setClusterName(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.GatewayClusterInfoList["+ i +"].ClusterName"));
			gatewayClusterInfo.setStatus(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.GatewayClusterInfoList["+ i +"].Status"));

			gatewayClusterInfoList.add(gatewayClusterInfo);
		}
		clusterInfo.setGatewayClusterInfoList(gatewayClusterInfoList);

		List<HostGroup> hostGroupList = new ArrayList<HostGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterV2Response.ClusterInfo.HostGroupList.Length"); i++) {
			HostGroup hostGroup = new HostGroup();
			hostGroup.setHostGroupId(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].HostGroupId"));
			hostGroup.setHostGroupName(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].HostGroupName"));
			hostGroup.setHostGroupType(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].HostGroupType"));
			hostGroup.setHostGroupSubType(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].HostGroupSubType"));
			hostGroup.setHostGroupChangeType(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].HostGroupChangeType"));
			hostGroup.setHostGroupChangeStatus(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].HostGroupChangeStatus"));
			hostGroup.setChargeType(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].ChargeType"));
			hostGroup.setPeriod(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Period"));
			hostGroup.setNodeCount(_ctx.integerValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].NodeCount"));
			hostGroup.setInstanceType(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].InstanceType"));
			hostGroup.setCpuCore(_ctx.integerValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].CpuCore"));
			hostGroup.setMemoryCapacity(_ctx.integerValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].MemoryCapacity"));
			hostGroup.setDiskType(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].DiskType"));
			hostGroup.setDiskCapacity(_ctx.integerValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].DiskCapacity"));
			hostGroup.setDiskCount(_ctx.integerValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].DiskCount"));
			hostGroup.setBandWidth(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].BandWidth"));
			hostGroup.setLockType(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].LockType"));
			hostGroup.setLockReason(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].LockReason"));

			List<Node> nodes = new ArrayList<Node>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes.Length"); j++) {
				Node node = new Node();
				node.setZoneId(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].ZoneId"));
				node.setInstanceId(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].InstanceId"));
				node.setStatus(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].Status"));
				node.setPubIp(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].PubIp"));
				node.setInnerIp(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].InnerIp"));
				node.setExpiredTime(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].ExpiredTime"));
				node.setCreateTime(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].CreateTime"));
				node.setEmrExpiredTime(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].EmrExpiredTime"));
				node.setSupportIpV6(_ctx.booleanValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].SupportIpV6"));

				List<DaemonInfo> daemonInfos = new ArrayList<DaemonInfo>();
				for (int k = 0; k < _ctx.lengthValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].DaemonInfos.Length"); k++) {
					DaemonInfo daemonInfo = new DaemonInfo();
					daemonInfo.setName(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].DaemonInfos["+ k +"].Name"));

					daemonInfos.add(daemonInfo);
				}
				node.setDaemonInfos(daemonInfos);

				List<DiskInfo> diskInfos = new ArrayList<DiskInfo>();
				for (int k = 0; k < _ctx.lengthValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].DiskInfos.Length"); k++) {
					DiskInfo diskInfo = new DiskInfo();
					diskInfo.setDevice(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].DiskInfos["+ k +"].Device"));
					diskInfo.setDiskName(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].DiskInfos["+ k +"].DiskName"));
					diskInfo.setDiskId(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].DiskInfos["+ k +"].DiskId"));
					diskInfo.setType(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].DiskInfos["+ k +"].Type"));
					diskInfo.setSize(_ctx.integerValue("DescribeClusterV2Response.ClusterInfo.HostGroupList["+ i +"].Nodes["+ j +"].DiskInfos["+ k +"].Size"));

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
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterV2Response.ClusterInfo.BootstrapActionList.Length"); i++) {
			BootstrapAction bootstrapAction = new BootstrapAction();
			bootstrapAction.setName(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.BootstrapActionList["+ i +"].Name"));
			bootstrapAction.setPath(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.BootstrapActionList["+ i +"].Path"));
			bootstrapAction.setArg(_ctx.stringValue("DescribeClusterV2Response.ClusterInfo.BootstrapActionList["+ i +"].Arg"));

			bootstrapActionList.add(bootstrapAction);
		}
		clusterInfo.setBootstrapActionList(bootstrapActionList);
		describeClusterV2Response.setClusterInfo(clusterInfo);
	 
	 	return describeClusterV2Response;
	}
}