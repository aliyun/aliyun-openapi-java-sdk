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

import com.aliyuncs.emr.model.v20160408.ListClusterTemplatesResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterTemplatesResponse.TemplateInfo;
import com.aliyuncs.emr.model.v20160408.ListClusterTemplatesResponse.TemplateInfo.BootstrapAction;
import com.aliyuncs.emr.model.v20160408.ListClusterTemplatesResponse.TemplateInfo.Config;
import com.aliyuncs.emr.model.v20160408.ListClusterTemplatesResponse.TemplateInfo.HostGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterTemplatesResponseUnmarshaller {

	public static ListClusterTemplatesResponse unmarshall(ListClusterTemplatesResponse listClusterTemplatesResponse, UnmarshallerContext context) {
		
		listClusterTemplatesResponse.setRequestId(context.stringValue("ListClusterTemplatesResponse.RequestId"));
		listClusterTemplatesResponse.setTotalCount(context.integerValue("ListClusterTemplatesResponse.TotalCount"));
		listClusterTemplatesResponse.setPageNumber(context.integerValue("ListClusterTemplatesResponse.PageNumber"));
		listClusterTemplatesResponse.setPageSize(context.integerValue("ListClusterTemplatesResponse.PageSize"));

		List<TemplateInfo> templateInfoList = new ArrayList<TemplateInfo>();
		for (int i = 0; i < context.lengthValue("ListClusterTemplatesResponse.TemplateInfoList.Length"); i++) {
			TemplateInfo templateInfo = new TemplateInfo();
			templateInfo.setId(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].Id"));
			templateInfo.setTemplateName(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].TemplateName"));
			templateInfo.setLogEnable(context.booleanValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].LogEnable"));
			templateInfo.setLogPath(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].LogPath"));
			templateInfo.setUserId(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].UserId"));
			templateInfo.setUserDefinedEmrEcsRole(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].UserDefinedEmrEcsRole"));
			templateInfo.setMasterNodeTotal(context.integerValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].MasterNodeTotal"));
			templateInfo.setVpcId(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].VpcId"));
			templateInfo.setVSwitchId(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].VSwitchId"));
			templateInfo.setNetType(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].NetType"));
			templateInfo.setIoOptimized(context.booleanValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].IoOptimized"));
			templateInfo.setInstanceGeneration(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].InstanceGeneration"));
			templateInfo.setHighAvailabilityEnable(context.booleanValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].HighAvailabilityEnable"));
			templateInfo.setEasEnable(context.booleanValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].EasEnable"));
			templateInfo.setGmtCreate(context.longValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].GmtCreate"));
			templateInfo.setGmtModified(context.longValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].GmtModified"));
			templateInfo.setZoneId(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].ZoneId"));
			templateInfo.setClusterType(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].ClusterType"));
			templateInfo.setSecurityGroupId(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].SecurityGroupId"));
			templateInfo.setSecurityGroupName(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].SecurityGroupName"));
			templateInfo.setConfigurations(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].Configurations"));
			templateInfo.setAllowNotebook(context.booleanValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].AllowNotebook"));
			templateInfo.setCreateSource(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].CreateSource"));
			templateInfo.setUseLocalMetaDb(context.booleanValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].UseLocalMetaDb"));
			templateInfo.setSshEnable(context.booleanValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].SshEnable"));
			templateInfo.setIsOpenPublicIp(context.booleanValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].IsOpenPublicIp"));
			templateInfo.setDepositType(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].DepositType"));
			templateInfo.setMachineType(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].MachineType"));
			templateInfo.setUseCustomHiveMetaDb(context.booleanValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].UseCustomHiveMetaDb"));
			templateInfo.setInitCustomHiveMetaDb(context.booleanValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].InitCustomHiveMetaDb"));

			List<String> softwareInfoList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].SoftwareInfoList.Length"); j++) {
				softwareInfoList.add(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].SoftwareInfoList["+ j +"]"));
			}
			templateInfo.setSoftwareInfoList(softwareInfoList);

			List<BootstrapAction> bootstrapActionList = new ArrayList<BootstrapAction>();
			for (int j = 0; j < context.lengthValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].BootstrapActionList.Length"); j++) {
				BootstrapAction bootstrapAction = new BootstrapAction();
				bootstrapAction.setName(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].BootstrapActionList["+ j +"].Name"));
				bootstrapAction.setPath(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].BootstrapActionList["+ j +"].Path"));
				bootstrapAction.setArg(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].BootstrapActionList["+ j +"].Arg"));

				bootstrapActionList.add(bootstrapAction);
			}
			templateInfo.setBootstrapActionList(bootstrapActionList);

			List<HostGroup> hostGroupList = new ArrayList<HostGroup>();
			for (int j = 0; j < context.lengthValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].HostGroupList.Length"); j++) {
				HostGroup hostGroup = new HostGroup();
				hostGroup.setHostGroupId(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].HostGroupList["+ j +"].HostGroupId"));
				hostGroup.setHostGroupName(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].HostGroupList["+ j +"].HostGroupName"));
				hostGroup.setHostGroupType(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].HostGroupList["+ j +"].HostGroupType"));
				hostGroup.setChargeType(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].HostGroupList["+ j +"].ChargeType"));
				hostGroup.setPeriod(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].HostGroupList["+ j +"].Period"));
				hostGroup.setNodeCount(context.integerValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].HostGroupList["+ j +"].NodeCount"));
				hostGroup.setInstanceType(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].HostGroupList["+ j +"].InstanceType"));
				hostGroup.setDiskType(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].HostGroupList["+ j +"].DiskType"));
				hostGroup.setDiskCapacity(context.integerValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].HostGroupList["+ j +"].DiskCapacity"));
				hostGroup.setDiskCount(context.integerValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].HostGroupList["+ j +"].DiskCount"));
				hostGroup.setSysDiskType(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].HostGroupList["+ j +"].SysDiskType"));
				hostGroup.setSysDiskCapacity(context.integerValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].HostGroupList["+ j +"].SysDiskCapacity"));
				hostGroup.setMultiInstanceTypes(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].HostGroupList["+ j +"].MultiInstanceTypes"));

				hostGroupList.add(hostGroup);
			}
			templateInfo.setHostGroupList(hostGroupList);

			List<Config> configList = new ArrayList<Config>();
			for (int j = 0; j < context.lengthValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].ConfigList.Length"); j++) {
				Config config = new Config();
				config.setServiceName(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].ConfigList["+ j +"].ServiceName"));
				config.setFileName(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].ConfigList["+ j +"].FileName"));
				config.setConfigKey(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].ConfigList["+ j +"].ConfigKey"));
				config.setConfigValue(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].ConfigList["+ j +"].ConfigValue"));
				config.setEncrypt(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].ConfigList["+ j +"].Encrypt"));
				config.setReplace(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].ConfigList["+ j +"].Replace"));

				configList.add(config);
			}
			templateInfo.setConfigList(configList);

			templateInfoList.add(templateInfo);
		}
		listClusterTemplatesResponse.setTemplateInfoList(templateInfoList);
	 
	 	return listClusterTemplatesResponse;
	}
}