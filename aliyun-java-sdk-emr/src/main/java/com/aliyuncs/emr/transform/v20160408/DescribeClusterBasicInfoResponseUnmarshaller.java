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

import com.aliyuncs.emr.model.v20160408.DescribeClusterBasicInfoResponse;
import com.aliyuncs.emr.model.v20160408.DescribeClusterBasicInfoResponse.ClusterInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterBasicInfoResponse.ClusterInfo.AccessInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterBasicInfoResponse.ClusterInfo.AccessInfo.ZKLink;
import com.aliyuncs.emr.model.v20160408.DescribeClusterBasicInfoResponse.ClusterInfo.BootstrapAction;
import com.aliyuncs.emr.model.v20160408.DescribeClusterBasicInfoResponse.ClusterInfo.FailReason;
import com.aliyuncs.emr.model.v20160408.DescribeClusterBasicInfoResponse.ClusterInfo.GatewayClusterInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterBasicInfoResponse.ClusterInfo.HostPoolInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterBasicInfoResponse.ClusterInfo.RelateClusterInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterBasicInfoResponse.ClusterInfo.SoftwareInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterBasicInfoResponse.ClusterInfo.SoftwareInfo.Software;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterBasicInfoResponseUnmarshaller {

	public static DescribeClusterBasicInfoResponse unmarshall(DescribeClusterBasicInfoResponse describeClusterBasicInfoResponse, UnmarshallerContext _ctx) {
		
		describeClusterBasicInfoResponse.setRequestId(_ctx.stringValue("DescribeClusterBasicInfoResponse.RequestId"));

		ClusterInfo clusterInfo = new ClusterInfo();
		clusterInfo.setClusterId(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.ClusterId"));
		clusterInfo.setRegionId(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.RegionId"));
		clusterInfo.setMachineType(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.MachineType"));
		clusterInfo.setDepositType(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.DepositType"));
		clusterInfo.setZoneId(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.ZoneId"));
		clusterInfo.setName(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.Name"));
		clusterInfo.setRelateClusterId(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.RelateClusterId"));
		clusterInfo.setGatewayClusterIds(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.GatewayClusterIds"));
		clusterInfo.setCreateType(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.CreateType"));
		clusterInfo.setStartTime(_ctx.longValue("DescribeClusterBasicInfoResponse.ClusterInfo.StartTime"));
		clusterInfo.setExpiredTime(_ctx.longValue("DescribeClusterBasicInfoResponse.ClusterInfo.ExpiredTime"));
		clusterInfo.setStopTime(_ctx.longValue("DescribeClusterBasicInfoResponse.ClusterInfo.StopTime"));
		clusterInfo.setLogEnable(_ctx.booleanValue("DescribeClusterBasicInfoResponse.ClusterInfo.LogEnable"));
		clusterInfo.setLogPath(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.LogPath"));
		clusterInfo.setUserId(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.UserId"));
		clusterInfo.setStatus(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.Status"));
		clusterInfo.setHighAvailabilityEnable(_ctx.booleanValue("DescribeClusterBasicInfoResponse.ClusterInfo.HighAvailabilityEnable"));
		clusterInfo.setLocalMetaDb(_ctx.booleanValue("DescribeClusterBasicInfoResponse.ClusterInfo.LocalMetaDb"));
		clusterInfo.setChargeType(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.ChargeType"));
		clusterInfo.setPeriod(_ctx.integerValue("DescribeClusterBasicInfoResponse.ClusterInfo.Period"));
		clusterInfo.setRunningTime(_ctx.integerValue("DescribeClusterBasicInfoResponse.ClusterInfo.RunningTime"));
		clusterInfo.setMasterNodeTotal(_ctx.integerValue("DescribeClusterBasicInfoResponse.ClusterInfo.MasterNodeTotal"));
		clusterInfo.setMasterNodeInService(_ctx.integerValue("DescribeClusterBasicInfoResponse.ClusterInfo.MasterNodeInService"));
		clusterInfo.setCoreNodeTotal(_ctx.integerValue("DescribeClusterBasicInfoResponse.ClusterInfo.CoreNodeTotal"));
		clusterInfo.setCoreNodeInService(_ctx.integerValue("DescribeClusterBasicInfoResponse.ClusterInfo.CoreNodeInService"));
		clusterInfo.setTaskNodeTotal(_ctx.integerValue("DescribeClusterBasicInfoResponse.ClusterInfo.TaskNodeTotal"));
		clusterInfo.setTaskNodeInService(_ctx.integerValue("DescribeClusterBasicInfoResponse.ClusterInfo.TaskNodeInService"));
		clusterInfo.setShowSoftwareInterface(_ctx.booleanValue("DescribeClusterBasicInfoResponse.ClusterInfo.ShowSoftwareInterface"));
		clusterInfo.setCreateResource(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.CreateResource"));
		clusterInfo.setVpcId(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.VpcId"));
		clusterInfo.setVSwitchId(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.VSwitchId"));
		clusterInfo.setNetType(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.NetType"));
		clusterInfo.setUserDefinedEmrEcsRole(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.UserDefinedEmrEcsRole"));
		clusterInfo.setIoOptimized(_ctx.booleanValue("DescribeClusterBasicInfoResponse.ClusterInfo.IoOptimized"));
		clusterInfo.setInstanceGeneration(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.InstanceGeneration"));
		clusterInfo.setImageId(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.ImageId"));
		clusterInfo.setSecurityGroupId(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.SecurityGroupId"));
		clusterInfo.setSecurityGroupName(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.SecurityGroupName"));
		clusterInfo.setBootstrapFailed(_ctx.booleanValue("DescribeClusterBasicInfoResponse.ClusterInfo.BootstrapFailed"));
		clusterInfo.setConfigurations(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.Configurations"));
		clusterInfo.setEasEnable(_ctx.booleanValue("DescribeClusterBasicInfoResponse.ClusterInfo.EasEnable"));
		clusterInfo.setAutoScalingEnable(_ctx.booleanValue("DescribeClusterBasicInfoResponse.ClusterInfo.AutoScalingEnable"));
		clusterInfo.setAutoScalingAllowed(_ctx.booleanValue("DescribeClusterBasicInfoResponse.ClusterInfo.AutoScalingAllowed"));
		clusterInfo.setAutoScalingSpotWithLimitAllowed(_ctx.booleanValue("DescribeClusterBasicInfoResponse.ClusterInfo.AutoScalingSpotWithLimitAllowed"));
		clusterInfo.setAutoScalingByLoadAllowed(_ctx.booleanValue("DescribeClusterBasicInfoResponse.ClusterInfo.AutoScalingByLoadAllowed"));
		clusterInfo.setResizeDiskEnable(_ctx.booleanValue("DescribeClusterBasicInfoResponse.ClusterInfo.ResizeDiskEnable"));
		clusterInfo.setMetaStoreType(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.MetaStoreType"));

		RelateClusterInfo relateClusterInfo = new RelateClusterInfo();
		relateClusterInfo.setClusterId(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.RelateClusterInfo.ClusterId"));
		relateClusterInfo.setClusterName(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.RelateClusterInfo.ClusterName"));
		relateClusterInfo.setStatus(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.RelateClusterInfo.Status"));
		clusterInfo.setRelateClusterInfo(relateClusterInfo);

		HostPoolInfo hostPoolInfo = new HostPoolInfo();
		hostPoolInfo.setHpBizId(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.HostPoolInfo.HpBizId"));
		hostPoolInfo.setHpName(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.HostPoolInfo.HpName"));
		clusterInfo.setHostPoolInfo(hostPoolInfo);

		FailReason failReason = new FailReason();
		failReason.setErrorCode(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.FailReason.ErrorCode"));
		failReason.setErrorMsg(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.FailReason.ErrorMsg"));
		failReason.setRequestId(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.FailReason.RequestId"));
		clusterInfo.setFailReason(failReason);

		SoftwareInfo softwareInfo = new SoftwareInfo();
		softwareInfo.setEmrVer(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.SoftwareInfo.EmrVer"));
		softwareInfo.setClusterType(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.SoftwareInfo.ClusterType"));

		List<Software> softwares = new ArrayList<Software>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterBasicInfoResponse.ClusterInfo.SoftwareInfo.Softwares.Length"); i++) {
			Software software = new Software();
			software.setDisplayName(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].DisplayName"));
			software.setName(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].Name"));
			software.setOnlyDisplay(_ctx.booleanValue("DescribeClusterBasicInfoResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].OnlyDisplay"));
			software.setStartTpe(_ctx.integerValue("DescribeClusterBasicInfoResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].StartTpe"));
			software.setVersion(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].Version"));

			softwares.add(software);
		}
		softwareInfo.setSoftwares(softwares);
		clusterInfo.setSoftwareInfo(softwareInfo);

		AccessInfo accessInfo = new AccessInfo();

		List<ZKLink> zKLinks = new ArrayList<ZKLink>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterBasicInfoResponse.ClusterInfo.AccessInfo.ZKLinks.Length"); i++) {
			ZKLink zKLink = new ZKLink();
			zKLink.setLink(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.AccessInfo.ZKLinks["+ i +"].Link"));
			zKLink.setPort(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.AccessInfo.ZKLinks["+ i +"].Port"));

			zKLinks.add(zKLink);
		}
		accessInfo.setZKLinks(zKLinks);
		clusterInfo.setAccessInfo(accessInfo);

		List<GatewayClusterInfo> gatewayClusterInfoList = new ArrayList<GatewayClusterInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterBasicInfoResponse.ClusterInfo.GatewayClusterInfoList.Length"); i++) {
			GatewayClusterInfo gatewayClusterInfo = new GatewayClusterInfo();
			gatewayClusterInfo.setClusterId(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.GatewayClusterInfoList["+ i +"].ClusterId"));
			gatewayClusterInfo.setClusterName(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.GatewayClusterInfoList["+ i +"].ClusterName"));
			gatewayClusterInfo.setStatus(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.GatewayClusterInfoList["+ i +"].Status"));

			gatewayClusterInfoList.add(gatewayClusterInfo);
		}
		clusterInfo.setGatewayClusterInfoList(gatewayClusterInfoList);

		List<BootstrapAction> bootstrapActionList = new ArrayList<BootstrapAction>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterBasicInfoResponse.ClusterInfo.BootstrapActionList.Length"); i++) {
			BootstrapAction bootstrapAction = new BootstrapAction();
			bootstrapAction.setName(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.BootstrapActionList["+ i +"].Name"));
			bootstrapAction.setPath(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.BootstrapActionList["+ i +"].Path"));
			bootstrapAction.setArg(_ctx.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.BootstrapActionList["+ i +"].Arg"));

			bootstrapActionList.add(bootstrapAction);
		}
		clusterInfo.setBootstrapActionList(bootstrapActionList);
		describeClusterBasicInfoResponse.setClusterInfo(clusterInfo);
	 
	 	return describeClusterBasicInfoResponse;
	}
}