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
import com.aliyuncs.emr.model.v20160408.DescribeClusterBasicInfoResponse.ClusterInfo.BootstrapAction;
import com.aliyuncs.emr.model.v20160408.DescribeClusterBasicInfoResponse.ClusterInfo.FailReason;
import com.aliyuncs.emr.model.v20160408.DescribeClusterBasicInfoResponse.ClusterInfo.SoftwareInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterBasicInfoResponse.ClusterInfo.SoftwareInfo.Software;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterBasicInfoResponseUnmarshaller {

	public static DescribeClusterBasicInfoResponse unmarshall(DescribeClusterBasicInfoResponse describeClusterBasicInfoResponse, UnmarshallerContext context) {
		
		describeClusterBasicInfoResponse.setRequestId(context.stringValue("DescribeClusterBasicInfoResponse.RequestId"));

		ClusterInfo clusterInfo = new ClusterInfo();
		clusterInfo.setId(context.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.Id"));
		clusterInfo.setBizId(context.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.BizId"));
		clusterInfo.setRegionId(context.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.RegionId"));
		clusterInfo.setZoneId(context.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.ZoneId"));
		clusterInfo.setName(context.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.Name"));
		clusterInfo.setCreateType(context.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.CreateType"));
		clusterInfo.setStartTime(context.longValue("DescribeClusterBasicInfoResponse.ClusterInfo.StartTime"));
		clusterInfo.setStopTime(context.longValue("DescribeClusterBasicInfoResponse.ClusterInfo.StopTime"));
		clusterInfo.setLogEnable(context.booleanValue("DescribeClusterBasicInfoResponse.ClusterInfo.LogEnable"));
		clusterInfo.setLogPath(context.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.LogPath"));
		clusterInfo.setStatus(context.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.Status"));
		clusterInfo.setHighAvailabilityEnable(context.booleanValue("DescribeClusterBasicInfoResponse.ClusterInfo.HighAvailabilityEnable"));
		clusterInfo.setChargeType(context.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.ChargeType"));
		clusterInfo.setExpiredTime(context.longValue("DescribeClusterBasicInfoResponse.ClusterInfo.ExpiredTime"));
		clusterInfo.setPeriod(context.integerValue("DescribeClusterBasicInfoResponse.ClusterInfo.Period"));
		clusterInfo.setRunningTime(context.integerValue("DescribeClusterBasicInfoResponse.ClusterInfo.RunningTime"));
		clusterInfo.setMasterNodeTotal(context.integerValue("DescribeClusterBasicInfoResponse.ClusterInfo.MasterNodeTotal"));
		clusterInfo.setMasterNodeInService(context.integerValue("DescribeClusterBasicInfoResponse.ClusterInfo.MasterNodeInService"));
		clusterInfo.setCoreNodeTotal(context.integerValue("DescribeClusterBasicInfoResponse.ClusterInfo.CoreNodeTotal"));
		clusterInfo.setCoreNodeInService(context.integerValue("DescribeClusterBasicInfoResponse.ClusterInfo.CoreNodeInService"));
		clusterInfo.setTaskNodeTotal(context.integerValue("DescribeClusterBasicInfoResponse.ClusterInfo.TaskNodeTotal"));
		clusterInfo.setTaskNodeInService(context.integerValue("DescribeClusterBasicInfoResponse.ClusterInfo.TaskNodeInService"));
		clusterInfo.setShowSoftwareInterface(context.booleanValue("DescribeClusterBasicInfoResponse.ClusterInfo.ShowSoftwareInterface"));
		clusterInfo.setVpcId(context.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.VpcId"));
		clusterInfo.setVSwitchId(context.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.VSwitchId"));
		clusterInfo.setNetType(context.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.NetType"));
		clusterInfo.setUserDefinedEmrEcsRole(context.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.UserDefinedEmrEcsRole"));
		clusterInfo.setIoOptimized(context.booleanValue("DescribeClusterBasicInfoResponse.ClusterInfo.IoOptimized"));
		clusterInfo.setInstanceGeneration(context.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.InstanceGeneration"));
		clusterInfo.setBootstrapFailed(context.booleanValue("DescribeClusterBasicInfoResponse.ClusterInfo.BootstrapFailed"));
		clusterInfo.setConfigurations(context.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.Configurations"));
		clusterInfo.setImageId(context.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.ImageId"));
		clusterInfo.setSecurityGroupId(context.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.SecurityGroupId"));
		clusterInfo.setSecurityGroupName(context.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.SecurityGroupName"));
		clusterInfo.setEasEnable(context.booleanValue("DescribeClusterBasicInfoResponse.ClusterInfo.EasEnable"));

		SoftwareInfo softwareInfo = new SoftwareInfo();
		softwareInfo.setEmrVer(context.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.SoftwareInfo.EmrVer"));
		softwareInfo.setClusterType(context.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.SoftwareInfo.ClusterType"));

		List<Software> softwares = new ArrayList<Software>();
		for (int i = 0; i < context.lengthValue("DescribeClusterBasicInfoResponse.ClusterInfo.SoftwareInfo.Softwares.Length"); i++) {
			Software software = new Software();
			software.setDisplayName(context.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].DisplayName"));
			software.setName(context.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].Name"));
			software.setOnlyDisplay(context.booleanValue("DescribeClusterBasicInfoResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].OnlyDisplay"));
			software.setStartTpe(context.integerValue("DescribeClusterBasicInfoResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].StartTpe"));
			software.setVersion(context.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.SoftwareInfo.Softwares["+ i +"].Version"));

			softwares.add(software);
		}
		softwareInfo.setSoftwares(softwares);
		clusterInfo.setSoftwareInfo(softwareInfo);

		FailReason failReason = new FailReason();
		failReason.setErrorCode(context.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.FailReason.ErrorCode"));
		failReason.setErrorMsg(context.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.FailReason.ErrorMsg"));
		failReason.setRequestId(context.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.FailReason.RequestId"));
		clusterInfo.setFailReason(failReason);

		List<BootstrapAction> bootstrapActionList = new ArrayList<BootstrapAction>();
		for (int i = 0; i < context.lengthValue("DescribeClusterBasicInfoResponse.ClusterInfo.BootstrapActionList.Length"); i++) {
			BootstrapAction bootstrapAction = new BootstrapAction();
			bootstrapAction.setName(context.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.BootstrapActionList["+ i +"].Name"));
			bootstrapAction.setPath(context.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.BootstrapActionList["+ i +"].Path"));
			bootstrapAction.setArg(context.stringValue("DescribeClusterBasicInfoResponse.ClusterInfo.BootstrapActionList["+ i +"].Arg"));

			bootstrapActionList.add(bootstrapAction);
		}
		clusterInfo.setBootstrapActionList(bootstrapActionList);
		describeClusterBasicInfoResponse.setClusterInfo(clusterInfo);
	 
	 	return describeClusterBasicInfoResponse;
	}
}