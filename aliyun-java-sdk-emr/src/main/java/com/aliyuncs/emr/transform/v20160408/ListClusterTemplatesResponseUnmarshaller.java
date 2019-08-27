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

	public static ListClusterTemplatesResponse unmarshall(ListClusterTemplatesResponse listClusterTemplatesResponse, UnmarshallerContext _ctx) {
		
		listClusterTemplatesResponse.setRequestId(_ctx.stringValue("ListClusterTemplatesResponse.RequestId"));
		listClusterTemplatesResponse.setTotalCount(_ctx.integerValue("ListClusterTemplatesResponse.TotalCount"));
		listClusterTemplatesResponse.setPageNumber(_ctx.integerValue("ListClusterTemplatesResponse.PageNumber"));
		listClusterTemplatesResponse.setPageSize(_ctx.integerValue("ListClusterTemplatesResponse.PageSize"));

		List<TemplateInfo> templateInfoList = new ArrayList<TemplateInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterTemplatesResponse.TemplateInfoList.Length"); i++) {
			TemplateInfo templateInfo = new TemplateInfo();
			templateInfo.setId(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].Id"));
			templateInfo.setTemplateName(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].TemplateName"));
			templateInfo.setLogEnable(_ctx.booleanValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].LogEnable"));
			templateInfo.setLogPath(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].LogPath"));
			templateInfo.setUserId(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].UserId"));
			templateInfo.setUserDefinedEmrEcsRole(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].UserDefinedEmrEcsRole"));
			templateInfo.setMasterNodeTotal(_ctx.integerValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].MasterNodeTotal"));
			templateInfo.setVpcId(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].VpcId"));
			templateInfo.setVSwitchId(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].VSwitchId"));
			templateInfo.setNetType(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].NetType"));
			templateInfo.setIoOptimized(_ctx.booleanValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].IoOptimized"));
			templateInfo.setInstanceGeneration(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].InstanceGeneration"));
			templateInfo.setHighAvailabilityEnable(_ctx.booleanValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].HighAvailabilityEnable"));
			templateInfo.setEasEnable(_ctx.booleanValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].EasEnable"));
			templateInfo.setGmtCreate(_ctx.longValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].GmtCreate"));
			templateInfo.setGmtModified(_ctx.longValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].GmtModified"));
			templateInfo.setZoneId(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].ZoneId"));
			templateInfo.setClusterType(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].ClusterType"));
			templateInfo.setSecurityGroupId(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].SecurityGroupId"));
			templateInfo.setSecurityGroupName(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].SecurityGroupName"));
			templateInfo.setConfigurations(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].Configurations"));
			templateInfo.setAllowNotebook(_ctx.booleanValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].AllowNotebook"));
			templateInfo.setCreateSource(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].CreateSource"));
			templateInfo.setUseLocalMetaDb(_ctx.booleanValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].UseLocalMetaDb"));
			templateInfo.setSshEnable(_ctx.booleanValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].SshEnable"));
			templateInfo.setIsOpenPublicIp(_ctx.booleanValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].IsOpenPublicIp"));
			templateInfo.setDepositType(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].DepositType"));
			templateInfo.setMachineType(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].MachineType"));
			templateInfo.setUseCustomHiveMetaDb(_ctx.booleanValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].UseCustomHiveMetaDb"));
			templateInfo.setInitCustomHiveMetaDb(_ctx.booleanValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].InitCustomHiveMetaDb"));
			templateInfo.setKeyPairName(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].KeyPairName"));
			templateInfo.setMetaStoreType(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].MetaStoreType"));
			templateInfo.setMetaStoreConf(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].MetaStoreConf"));

			List<String> softwareInfoList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].SoftwareInfoList.Length"); j++) {
				softwareInfoList.add(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].SoftwareInfoList["+ j +"]"));
			}
			templateInfo.setSoftwareInfoList(softwareInfoList);

			List<BootstrapAction> bootstrapActionList = new ArrayList<BootstrapAction>();
			for (int j = 0; j < _ctx.lengthValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].BootstrapActionList.Length"); j++) {
				BootstrapAction bootstrapAction = new BootstrapAction();
				bootstrapAction.setName(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].BootstrapActionList["+ j +"].Name"));
				bootstrapAction.setPath(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].BootstrapActionList["+ j +"].Path"));
				bootstrapAction.setArg(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].BootstrapActionList["+ j +"].Arg"));

				bootstrapActionList.add(bootstrapAction);
			}
			templateInfo.setBootstrapActionList(bootstrapActionList);

			List<HostGroup> hostGroupList = new ArrayList<HostGroup>();
			for (int j = 0; j < _ctx.lengthValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].HostGroupList.Length"); j++) {
				HostGroup hostGroup = new HostGroup();
				hostGroup.setHostGroupId(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].HostGroupList["+ j +"].HostGroupId"));
				hostGroup.setHostGroupName(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].HostGroupList["+ j +"].HostGroupName"));
				hostGroup.setHostGroupType(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].HostGroupList["+ j +"].HostGroupType"));
				hostGroup.setChargeType(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].HostGroupList["+ j +"].ChargeType"));
				hostGroup.setPeriod(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].HostGroupList["+ j +"].Period"));
				hostGroup.setNodeCount(_ctx.integerValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].HostGroupList["+ j +"].NodeCount"));
				hostGroup.setInstanceType(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].HostGroupList["+ j +"].InstanceType"));
				hostGroup.setDiskType(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].HostGroupList["+ j +"].DiskType"));
				hostGroup.setDiskCapacity(_ctx.integerValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].HostGroupList["+ j +"].DiskCapacity"));
				hostGroup.setDiskCount(_ctx.integerValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].HostGroupList["+ j +"].DiskCount"));
				hostGroup.setSysDiskType(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].HostGroupList["+ j +"].SysDiskType"));
				hostGroup.setSysDiskCapacity(_ctx.integerValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].HostGroupList["+ j +"].SysDiskCapacity"));
				hostGroup.setMultiInstanceTypes(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].HostGroupList["+ j +"].MultiInstanceTypes"));

				hostGroupList.add(hostGroup);
			}
			templateInfo.setHostGroupList(hostGroupList);

			List<Config> configList = new ArrayList<Config>();
			for (int j = 0; j < _ctx.lengthValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].ConfigList.Length"); j++) {
				Config config = new Config();
				config.setServiceName(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].ConfigList["+ j +"].ServiceName"));
				config.setFileName(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].ConfigList["+ j +"].FileName"));
				config.setConfigKey(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].ConfigList["+ j +"].ConfigKey"));
				config.setConfigValue(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].ConfigList["+ j +"].ConfigValue"));
				config.setEncrypt(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].ConfigList["+ j +"].Encrypt"));
				config.setReplace(_ctx.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].ConfigList["+ j +"].Replace"));

				configList.add(config);
			}
			templateInfo.setConfigList(configList);

			templateInfoList.add(templateInfo);
		}
		listClusterTemplatesResponse.setTemplateInfoList(templateInfoList);
	 
	 	return listClusterTemplatesResponse;
	}
}