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

import com.aliyuncs.emr.model.v20160408.DescribeClusterTemplateResponse;
import com.aliyuncs.emr.model.v20160408.DescribeClusterTemplateResponse.TemplateInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterTemplateResponse.TemplateInfo.BootstrapAction;
import com.aliyuncs.emr.model.v20160408.DescribeClusterTemplateResponse.TemplateInfo.Config;
import com.aliyuncs.emr.model.v20160408.DescribeClusterTemplateResponse.TemplateInfo.HostGroup;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterTemplateResponseUnmarshaller {

	public static DescribeClusterTemplateResponse unmarshall(DescribeClusterTemplateResponse describeClusterTemplateResponse, UnmarshallerContext context) {
		
		describeClusterTemplateResponse.setRequestId(context.stringValue("DescribeClusterTemplateResponse.RequestId"));

		TemplateInfo templateInfo = new TemplateInfo();
		templateInfo.setId(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.Id"));
		templateInfo.setTemplateName(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.TemplateName"));
		templateInfo.setEmrVer(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.EmrVer"));
		templateInfo.setLogEnable(context.booleanValue("DescribeClusterTemplateResponse.TemplateInfo.LogEnable"));
		templateInfo.setLogPath(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.LogPath"));
		templateInfo.setUserId(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.UserId"));
		templateInfo.setUserDefinedEmrEcsRole(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.UserDefinedEmrEcsRole"));
		templateInfo.setMasterNodeTotal(context.integerValue("DescribeClusterTemplateResponse.TemplateInfo.MasterNodeTotal"));
		templateInfo.setVpcId(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.VpcId"));
		templateInfo.setVSwitchId(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.VSwitchId"));
		templateInfo.setNetType(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.NetType"));
		templateInfo.setIoOptimized(context.booleanValue("DescribeClusterTemplateResponse.TemplateInfo.IoOptimized"));
		templateInfo.setInstanceGeneration(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.InstanceGeneration"));
		templateInfo.setHighAvailabilityEnable(context.booleanValue("DescribeClusterTemplateResponse.TemplateInfo.HighAvailabilityEnable"));
		templateInfo.setEasEnable(context.booleanValue("DescribeClusterTemplateResponse.TemplateInfo.EasEnable"));
		templateInfo.setGmtCreate(context.longValue("DescribeClusterTemplateResponse.TemplateInfo.GmtCreate"));
		templateInfo.setGmtModified(context.longValue("DescribeClusterTemplateResponse.TemplateInfo.GmtModified"));
		templateInfo.setZoneId(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.ZoneId"));
		templateInfo.setClusterType(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.ClusterType"));
		templateInfo.setSecurityGroupId(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.SecurityGroupId"));
		templateInfo.setSecurityGroupName(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.SecurityGroupName"));
		templateInfo.setConfigurations(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.Configurations"));
		templateInfo.setAllowNotebook(context.booleanValue("DescribeClusterTemplateResponse.TemplateInfo.AllowNotebook"));
		templateInfo.setCreateSource(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.CreateSource"));
		templateInfo.setUseLocalMetaDb(context.booleanValue("DescribeClusterTemplateResponse.TemplateInfo.UseLocalMetaDb"));
		templateInfo.setSshEnable(context.booleanValue("DescribeClusterTemplateResponse.TemplateInfo.SshEnable"));
		templateInfo.setIsOpenPublicIp(context.booleanValue("DescribeClusterTemplateResponse.TemplateInfo.IsOpenPublicIp"));
		templateInfo.setDepositType(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.DepositType"));
		templateInfo.setMachineType(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.MachineType"));
		templateInfo.setUseCustomHiveMetaDb(context.booleanValue("DescribeClusterTemplateResponse.TemplateInfo.UseCustomHiveMetaDb"));
		templateInfo.setInitCustomHiveMetaDb(context.booleanValue("DescribeClusterTemplateResponse.TemplateInfo.InitCustomHiveMetaDb"));

		List<String> softwareInfoList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeClusterTemplateResponse.TemplateInfo.SoftwareInfoList.Length"); i++) {
			softwareInfoList.add(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.SoftwareInfoList["+ i +"]"));
		}
		templateInfo.setSoftwareInfoList(softwareInfoList);

		List<BootstrapAction> bootstrapActionList = new ArrayList<BootstrapAction>();
		for (int i = 0; i < context.lengthValue("DescribeClusterTemplateResponse.TemplateInfo.BootstrapActionList.Length"); i++) {
			BootstrapAction bootstrapAction = new BootstrapAction();
			bootstrapAction.setName(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.BootstrapActionList["+ i +"].Name"));
			bootstrapAction.setPath(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.BootstrapActionList["+ i +"].Path"));
			bootstrapAction.setArg(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.BootstrapActionList["+ i +"].Arg"));

			bootstrapActionList.add(bootstrapAction);
		}
		templateInfo.setBootstrapActionList(bootstrapActionList);

		List<HostGroup> hostGroupList = new ArrayList<HostGroup>();
		for (int i = 0; i < context.lengthValue("DescribeClusterTemplateResponse.TemplateInfo.HostGroupList.Length"); i++) {
			HostGroup hostGroup = new HostGroup();
			hostGroup.setHostGroupId(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.HostGroupList["+ i +"].HostGroupId"));
			hostGroup.setHostGroupName(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.HostGroupList["+ i +"].HostGroupName"));
			hostGroup.setHostGroupType(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.HostGroupList["+ i +"].HostGroupType"));
			hostGroup.setChargeType(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.HostGroupList["+ i +"].ChargeType"));
			hostGroup.setPeriod(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.HostGroupList["+ i +"].Period"));
			hostGroup.setNodeCount(context.integerValue("DescribeClusterTemplateResponse.TemplateInfo.HostGroupList["+ i +"].NodeCount"));
			hostGroup.setInstanceType(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.HostGroupList["+ i +"].InstanceType"));
			hostGroup.setDiskType(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.HostGroupList["+ i +"].DiskType"));
			hostGroup.setDiskCapacity(context.integerValue("DescribeClusterTemplateResponse.TemplateInfo.HostGroupList["+ i +"].DiskCapacity"));
			hostGroup.setDiskCount(context.integerValue("DescribeClusterTemplateResponse.TemplateInfo.HostGroupList["+ i +"].DiskCount"));
			hostGroup.setSysDiskType(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.HostGroupList["+ i +"].SysDiskType"));
			hostGroup.setSysDiskCapacity(context.integerValue("DescribeClusterTemplateResponse.TemplateInfo.HostGroupList["+ i +"].SysDiskCapacity"));
			hostGroup.setMultiInstanceTypes(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.HostGroupList["+ i +"].MultiInstanceTypes"));

			hostGroupList.add(hostGroup);
		}
		templateInfo.setHostGroupList(hostGroupList);

		List<Config> configList = new ArrayList<Config>();
		for (int i = 0; i < context.lengthValue("DescribeClusterTemplateResponse.TemplateInfo.ConfigList.Length"); i++) {
			Config config = new Config();
			config.setServiceName(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.ConfigList["+ i +"].ServiceName"));
			config.setFileName(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.ConfigList["+ i +"].FileName"));
			config.setConfigKey(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.ConfigList["+ i +"].ConfigKey"));
			config.setConfigValue(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.ConfigList["+ i +"].ConfigValue"));
			config.setEncrypt(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.ConfigList["+ i +"].Encrypt"));
			config.setReplace(context.stringValue("DescribeClusterTemplateResponse.TemplateInfo.ConfigList["+ i +"].Replace"));

			configList.add(config);
		}
		templateInfo.setConfigList(configList);
		describeClusterTemplateResponse.setTemplateInfo(templateInfo);
	 
	 	return describeClusterTemplateResponse;
	}
}