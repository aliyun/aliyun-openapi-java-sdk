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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterTemplateResponseUnmarshaller {

	public static DescribeClusterTemplateResponse unmarshall(DescribeClusterTemplateResponse describeClusterTemplateResponse, UnmarshallerContext _ctx) {
		
		describeClusterTemplateResponse.setRequestId(_ctx.stringValue("DescribeClusterTemplateResponse.RequestId"));

		TemplateInfo templateInfo = new TemplateInfo();
		templateInfo.setId(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.Id"));
		templateInfo.setTemplateName(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.TemplateName"));
		templateInfo.setEmrVer(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.EmrVer"));
		templateInfo.setLogEnable(_ctx.booleanValue("DescribeClusterTemplateResponse.TemplateInfo.LogEnable"));
		templateInfo.setLogPath(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.LogPath"));
		templateInfo.setUserId(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.UserId"));
		templateInfo.setUserDefinedEmrEcsRole(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.UserDefinedEmrEcsRole"));
		templateInfo.setMasterNodeTotal(_ctx.integerValue("DescribeClusterTemplateResponse.TemplateInfo.MasterNodeTotal"));
		templateInfo.setVpcId(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.VpcId"));
		templateInfo.setVSwitchId(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.VSwitchId"));
		templateInfo.setNetType(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.NetType"));
		templateInfo.setIoOptimized(_ctx.booleanValue("DescribeClusterTemplateResponse.TemplateInfo.IoOptimized"));
		templateInfo.setInstanceGeneration(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.InstanceGeneration"));
		templateInfo.setHighAvailabilityEnable(_ctx.booleanValue("DescribeClusterTemplateResponse.TemplateInfo.HighAvailabilityEnable"));
		templateInfo.setEasEnable(_ctx.booleanValue("DescribeClusterTemplateResponse.TemplateInfo.EasEnable"));
		templateInfo.setGmtCreate(_ctx.longValue("DescribeClusterTemplateResponse.TemplateInfo.GmtCreate"));
		templateInfo.setGmtModified(_ctx.longValue("DescribeClusterTemplateResponse.TemplateInfo.GmtModified"));
		templateInfo.setZoneId(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.ZoneId"));
		templateInfo.setClusterType(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.ClusterType"));
		templateInfo.setSecurityGroupId(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.SecurityGroupId"));
		templateInfo.setSecurityGroupName(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.SecurityGroupName"));
		templateInfo.setConfigurations(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.Configurations"));
		templateInfo.setAllowNotebook(_ctx.booleanValue("DescribeClusterTemplateResponse.TemplateInfo.AllowNotebook"));
		templateInfo.setCreateSource(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.CreateSource"));
		templateInfo.setUseLocalMetaDb(_ctx.booleanValue("DescribeClusterTemplateResponse.TemplateInfo.UseLocalMetaDb"));
		templateInfo.setSshEnable(_ctx.booleanValue("DescribeClusterTemplateResponse.TemplateInfo.SshEnable"));
		templateInfo.setIsOpenPublicIp(_ctx.booleanValue("DescribeClusterTemplateResponse.TemplateInfo.IsOpenPublicIp"));
		templateInfo.setDepositType(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.DepositType"));
		templateInfo.setMachineType(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.MachineType"));
		templateInfo.setUseCustomHiveMetaDb(_ctx.booleanValue("DescribeClusterTemplateResponse.TemplateInfo.UseCustomHiveMetaDb"));
		templateInfo.setInitCustomHiveMetaDb(_ctx.booleanValue("DescribeClusterTemplateResponse.TemplateInfo.InitCustomHiveMetaDb"));
		templateInfo.setKeyPairName(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.KeyPairName"));
		templateInfo.setMasterPwd(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.MasterPwd"));
		templateInfo.setMetaStoreType(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.MetaStoreType"));
		templateInfo.setMetaStoreConf(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.MetaStoreConf"));

		List<String> softwareInfoList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterTemplateResponse.TemplateInfo.SoftwareInfoList.Length"); i++) {
			softwareInfoList.add(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.SoftwareInfoList["+ i +"]"));
		}
		templateInfo.setSoftwareInfoList(softwareInfoList);

		List<BootstrapAction> bootstrapActionList = new ArrayList<BootstrapAction>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterTemplateResponse.TemplateInfo.BootstrapActionList.Length"); i++) {
			BootstrapAction bootstrapAction = new BootstrapAction();
			bootstrapAction.setName(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.BootstrapActionList["+ i +"].Name"));
			bootstrapAction.setPath(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.BootstrapActionList["+ i +"].Path"));
			bootstrapAction.setArg(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.BootstrapActionList["+ i +"].Arg"));

			bootstrapActionList.add(bootstrapAction);
		}
		templateInfo.setBootstrapActionList(bootstrapActionList);

		List<HostGroup> hostGroupList = new ArrayList<HostGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterTemplateResponse.TemplateInfo.HostGroupList.Length"); i++) {
			HostGroup hostGroup = new HostGroup();
			hostGroup.setHostGroupId(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.HostGroupList["+ i +"].HostGroupId"));
			hostGroup.setHostGroupName(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.HostGroupList["+ i +"].HostGroupName"));
			hostGroup.setHostGroupType(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.HostGroupList["+ i +"].HostGroupType"));
			hostGroup.setChargeType(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.HostGroupList["+ i +"].ChargeType"));
			hostGroup.setPeriod(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.HostGroupList["+ i +"].Period"));
			hostGroup.setNodeCount(_ctx.integerValue("DescribeClusterTemplateResponse.TemplateInfo.HostGroupList["+ i +"].NodeCount"));
			hostGroup.setInstanceType(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.HostGroupList["+ i +"].InstanceType"));
			hostGroup.setDiskType(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.HostGroupList["+ i +"].DiskType"));
			hostGroup.setDiskCapacity(_ctx.integerValue("DescribeClusterTemplateResponse.TemplateInfo.HostGroupList["+ i +"].DiskCapacity"));
			hostGroup.setDiskCount(_ctx.integerValue("DescribeClusterTemplateResponse.TemplateInfo.HostGroupList["+ i +"].DiskCount"));
			hostGroup.setSysDiskType(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.HostGroupList["+ i +"].SysDiskType"));
			hostGroup.setSysDiskCapacity(_ctx.integerValue("DescribeClusterTemplateResponse.TemplateInfo.HostGroupList["+ i +"].SysDiskCapacity"));
			hostGroup.setMultiInstanceTypes(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.HostGroupList["+ i +"].MultiInstanceTypes"));

			hostGroupList.add(hostGroup);
		}
		templateInfo.setHostGroupList(hostGroupList);

		List<Config> configList = new ArrayList<Config>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterTemplateResponse.TemplateInfo.ConfigList.Length"); i++) {
			Config config = new Config();
			config.setServiceName(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.ConfigList["+ i +"].ServiceName"));
			config.setFileName(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.ConfigList["+ i +"].FileName"));
			config.setConfigKey(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.ConfigList["+ i +"].ConfigKey"));
			config.setConfigValue(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.ConfigList["+ i +"].ConfigValue"));
			config.setEncrypt(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.ConfigList["+ i +"].Encrypt"));
			config.setReplace(_ctx.stringValue("DescribeClusterTemplateResponse.TemplateInfo.ConfigList["+ i +"].Replace"));

			configList.add(config);
		}
		templateInfo.setConfigList(configList);
		describeClusterTemplateResponse.setTemplateInfo(templateInfo);
	 
	 	return describeClusterTemplateResponse;
	}
}