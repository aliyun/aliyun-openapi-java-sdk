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
import com.aliyuncs.emr.model.v20160408.ListClusterTemplatesResponse.TemplateInfo.HostGroup;
import com.aliyuncs.emr.model.v20160408.ListClusterTemplatesResponse.TemplateInfo.SoftwareInfo;
import com.aliyuncs.emr.model.v20160408.ListClusterTemplatesResponse.TemplateInfo.SoftwareInfo.Software;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterTemplatesResponseUnmarshaller {

	public static ListClusterTemplatesResponse unmarshall(ListClusterTemplatesResponse listClusterTemplatesResponse, UnmarshallerContext context) {
		
		listClusterTemplatesResponse.setRequestId(context.stringValue("ListClusterTemplatesResponse.RequestId"));
		listClusterTemplatesResponse.setTotalCount(context.stringValue("ListClusterTemplatesResponse.TotalCount"));
		listClusterTemplatesResponse.setPageNumber(context.stringValue("ListClusterTemplatesResponse.PageNumber"));
		listClusterTemplatesResponse.setPageSize(context.stringValue("ListClusterTemplatesResponse.PageSize"));

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

			SoftwareInfo softwareInfo = new SoftwareInfo();
			softwareInfo.setEmrVer(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].SoftwareInfo.EmrVer"));
			softwareInfo.setClusterType(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].SoftwareInfo.ClusterType"));

			List<Software> softwares = new ArrayList<Software>();
			for (int j = 0; j < context.lengthValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].SoftwareInfo.Softwares.Length"); j++) {
				Software software = new Software();
				software.setDisplayName(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].SoftwareInfo.Softwares["+ j +"].DisplayName"));
				software.setName(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].SoftwareInfo.Softwares["+ j +"].Name"));
				software.setOnlyDisplay(context.booleanValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].SoftwareInfo.Softwares["+ j +"].OnlyDisplay"));
				software.setStartTpe(context.integerValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].SoftwareInfo.Softwares["+ j +"].StartTpe"));
				software.setVersion(context.stringValue("ListClusterTemplatesResponse.TemplateInfoList["+ i +"].SoftwareInfo.Softwares["+ j +"].Version"));

				softwares.add(software);
			}
			softwareInfo.setSoftwares(softwares);
			templateInfo.setSoftwareInfo(softwareInfo);

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

				hostGroupList.add(hostGroup);
			}
			templateInfo.setHostGroupList(hostGroupList);

			templateInfoList.add(templateInfo);
		}
		listClusterTemplatesResponse.setTemplateInfoList(templateInfoList);
	 
	 	return listClusterTemplatesResponse;
	}
}