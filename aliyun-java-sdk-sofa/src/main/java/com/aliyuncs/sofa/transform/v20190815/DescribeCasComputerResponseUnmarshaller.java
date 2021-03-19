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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.DescribeCasComputerResponse;
import com.aliyuncs.sofa.model.v20190815.DescribeCasComputerResponse.Data;
import com.aliyuncs.sofa.model.v20190815.DescribeCasComputerResponse.Data.DataDisksItem;
import com.aliyuncs.sofa.model.v20190815.DescribeCasComputerResponse.Data.DataDisksItem.Computer;
import com.aliyuncs.sofa.model.v20190815.DescribeCasComputerResponse.Data.OptionsItem;
import com.aliyuncs.sofa.model.v20190815.DescribeCasComputerResponse.Data.SystemDisk;
import com.aliyuncs.sofa.model.v20190815.DescribeCasComputerResponse.Data.SystemDisk.Computer1;
import com.aliyuncs.sofa.model.v20190815.DescribeCasComputerResponse.Data.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCasComputerResponseUnmarshaller {

	public static DescribeCasComputerResponse unmarshall(DescribeCasComputerResponse describeCasComputerResponse, UnmarshallerContext _ctx) {
		
		describeCasComputerResponse.setRequestId(_ctx.stringValue("DescribeCasComputerResponse.RequestId"));
		describeCasComputerResponse.setResultCode(_ctx.stringValue("DescribeCasComputerResponse.ResultCode"));
		describeCasComputerResponse.setResultMessage(_ctx.stringValue("DescribeCasComputerResponse.ResultMessage"));

		Data data = new Data();
		data.setAppId(_ctx.stringValue("DescribeCasComputerResponse.Data.AppId"));
		data.setAutoRenew(_ctx.booleanValue("DescribeCasComputerResponse.Data.AutoRenew"));
		data.setAutoRenewPeriod(_ctx.longValue("DescribeCasComputerResponse.Data.AutoRenewPeriod"));
		data.setBandwidth(_ctx.longValue("DescribeCasComputerResponse.Data.Bandwidth"));
		data.setCommonImage(_ctx.booleanValue("DescribeCasComputerResponse.Data.CommonImage"));
		data.setCpu(_ctx.longValue("DescribeCasComputerResponse.Data.Cpu"));
		data.setCpuShared(_ctx.booleanValue("DescribeCasComputerResponse.Data.CpuShared"));
		data.setCreationTime(_ctx.stringValue("DescribeCasComputerResponse.Data.CreationTime"));
		data.setDeployMode(_ctx.stringValue("DescribeCasComputerResponse.Data.DeployMode"));
		data.setDescription(_ctx.stringValue("DescribeCasComputerResponse.Data.Description"));
		data.setElasticIp(_ctx.stringValue("DescribeCasComputerResponse.Data.ElasticIp"));
		data.setExpiredTime(_ctx.stringValue("DescribeCasComputerResponse.Data.ExpiredTime"));
		data.setIaasId(_ctx.stringValue("DescribeCasComputerResponse.Data.IaasId"));
		data.setIaasStatus(_ctx.stringValue("DescribeCasComputerResponse.Data.IaasStatus"));
		data.setIaasType(_ctx.stringValue("DescribeCasComputerResponse.Data.IaasType"));
		data.setId(_ctx.stringValue("DescribeCasComputerResponse.Data.Id"));
		data.setImageIaasId(_ctx.stringValue("DescribeCasComputerResponse.Data.ImageIaasId"));
		data.setImageId(_ctx.stringValue("DescribeCasComputerResponse.Data.ImageId"));
		data.setImageName(_ctx.stringValue("DescribeCasComputerResponse.Data.ImageName"));
		data.setInitialized(_ctx.booleanValue("DescribeCasComputerResponse.Data.Initialized"));
		data.setInstanceChargeType(_ctx.stringValue("DescribeCasComputerResponse.Data.InstanceChargeType"));
		data.setIoOptimized(_ctx.booleanValue("DescribeCasComputerResponse.Data.IoOptimized"));
		data.setLastOpsOrderId(_ctx.stringValue("DescribeCasComputerResponse.Data.LastOpsOrderId"));
		data.setLastOpsType(_ctx.stringValue("DescribeCasComputerResponse.Data.LastOpsType"));
		data.setMemory(_ctx.longValue("DescribeCasComputerResponse.Data.Memory"));
		data.setName(_ctx.stringValue("DescribeCasComputerResponse.Data.Name"));
		data.setNetworkType(_ctx.stringValue("DescribeCasComputerResponse.Data.NetworkType"));
		data.setOs(_ctx.stringValue("DescribeCasComputerResponse.Data.Os"));
		data.setOsBit(_ctx.longValue("DescribeCasComputerResponse.Data.OsBit"));
		data.setOsVersion(_ctx.stringValue("DescribeCasComputerResponse.Data.OsVersion"));
		data.setPaasStatus(_ctx.stringValue("DescribeCasComputerResponse.Data.PaasStatus"));
		data.setPassword(_ctx.stringValue("DescribeCasComputerResponse.Data.Password"));
		data.setPrivateIp(_ctx.stringValue("DescribeCasComputerResponse.Data.PrivateIp"));
		data.setProviderId(_ctx.stringValue("DescribeCasComputerResponse.Data.ProviderId"));
		data.setPublicIp(_ctx.stringValue("DescribeCasComputerResponse.Data.PublicIp"));
		data.setRegionId(_ctx.stringValue("DescribeCasComputerResponse.Data.RegionId"));
		data.setSerialNumber(_ctx.stringValue("DescribeCasComputerResponse.Data.SerialNumber"));
		data.setSpecIaasId(_ctx.stringValue("DescribeCasComputerResponse.Data.SpecIaasId"));
		data.setStatus(_ctx.stringValue("DescribeCasComputerResponse.Data.Status"));
		data.setTenantId(_ctx.stringValue("DescribeCasComputerResponse.Data.TenantId"));
		data.setTenantId2(_ctx.stringValue("DescribeCasComputerResponse.Data.TenantId2"));
		data.setThreadsPerCore(_ctx.longValue("DescribeCasComputerResponse.Data.ThreadsPerCore"));
		data.setUtcCreate(_ctx.stringValue("DescribeCasComputerResponse.Data.UtcCreate"));
		data.setUtcModified(_ctx.stringValue("DescribeCasComputerResponse.Data.UtcModified"));
		data.setVpcId(_ctx.stringValue("DescribeCasComputerResponse.Data.VpcId"));
		data.setVSwitchIaasId(_ctx.stringValue("DescribeCasComputerResponse.Data.VSwitchIaasId"));
		data.setWorkspaceId(_ctx.stringValue("DescribeCasComputerResponse.Data.WorkspaceId"));
		data.setZoneId(_ctx.stringValue("DescribeCasComputerResponse.Data.ZoneId"));

		List<String> appServiceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCasComputerResponse.Data.AppServiceIds.Length"); i++) {
			appServiceIds.add(_ctx.stringValue("DescribeCasComputerResponse.Data.AppServiceIds["+ i +"]"));
		}
		data.setAppServiceIds(appServiceIds);

		List<String> assignedAppServiceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCasComputerResponse.Data.AssignedAppServiceIds.Length"); i++) {
			assignedAppServiceIds.add(_ctx.stringValue("DescribeCasComputerResponse.Data.AssignedAppServiceIds["+ i +"]"));
		}
		data.setAssignedAppServiceIds(assignedAppServiceIds);

		SystemDisk systemDisk = new SystemDisk();
		systemDisk.setCategory(_ctx.stringValue("DescribeCasComputerResponse.Data.SystemDisk.Category"));
		systemDisk.setDeleteAutoSnapshot(_ctx.booleanValue("DescribeCasComputerResponse.Data.SystemDisk.DeleteAutoSnapshot"));
		systemDisk.setDeleteWithComputer(_ctx.booleanValue("DescribeCasComputerResponse.Data.SystemDisk.DeleteWithComputer"));
		systemDisk.setDevice(_ctx.stringValue("DescribeCasComputerResponse.Data.SystemDisk.Device"));
		systemDisk.setEnableAutoSnapshot(_ctx.booleanValue("DescribeCasComputerResponse.Data.SystemDisk.EnableAutoSnapshot"));
		systemDisk.setIaasId(_ctx.stringValue("DescribeCasComputerResponse.Data.SystemDisk.IaasId"));
		systemDisk.setId(_ctx.stringValue("DescribeCasComputerResponse.Data.SystemDisk.Id"));
		systemDisk.setImageId(_ctx.stringValue("DescribeCasComputerResponse.Data.SystemDisk.ImageId"));
		systemDisk.setName(_ctx.stringValue("DescribeCasComputerResponse.Data.SystemDisk.Name"));
		systemDisk.setPortable(_ctx.booleanValue("DescribeCasComputerResponse.Data.SystemDisk.Portable"));
		systemDisk.setProviderId(_ctx.stringValue("DescribeCasComputerResponse.Data.SystemDisk.ProviderId"));
		systemDisk.setRegionId(_ctx.stringValue("DescribeCasComputerResponse.Data.SystemDisk.RegionId"));
		systemDisk.setSize(_ctx.longValue("DescribeCasComputerResponse.Data.SystemDisk.Size"));
		systemDisk.setStatus(_ctx.stringValue("DescribeCasComputerResponse.Data.SystemDisk.Status"));
		systemDisk.setTenantId(_ctx.stringValue("DescribeCasComputerResponse.Data.SystemDisk.TenantId"));
		systemDisk.setType(_ctx.stringValue("DescribeCasComputerResponse.Data.SystemDisk.Type"));
		systemDisk.setUtcCreate(_ctx.stringValue("DescribeCasComputerResponse.Data.SystemDisk.UtcCreate"));
		systemDisk.setUtcModified(_ctx.stringValue("DescribeCasComputerResponse.Data.SystemDisk.UtcModified"));
		systemDisk.setWorkspaceId(_ctx.stringValue("DescribeCasComputerResponse.Data.SystemDisk.WorkspaceId"));
		systemDisk.setZoneId(_ctx.stringValue("DescribeCasComputerResponse.Data.SystemDisk.ZoneId"));

		Computer1 computer1 = new Computer1();
		computer1.setName(_ctx.stringValue("DescribeCasComputerResponse.Data.SystemDisk.Computer.Name"));
		computer1.setId(_ctx.stringValue("DescribeCasComputerResponse.Data.SystemDisk.Computer.Id"));
		computer1.setIaasId(_ctx.stringValue("DescribeCasComputerResponse.Data.SystemDisk.Computer.IaasId"));
		computer1.setStatus(_ctx.stringValue("DescribeCasComputerResponse.Data.SystemDisk.Computer.Status"));
		systemDisk.setComputer1(computer1);
		data.setSystemDisk(systemDisk);

		List<DataDisksItem> dataDisks = new ArrayList<DataDisksItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCasComputerResponse.Data.DataDisks.Length"); i++) {
			DataDisksItem dataDisksItem = new DataDisksItem();
			dataDisksItem.setCategory(_ctx.stringValue("DescribeCasComputerResponse.Data.DataDisks["+ i +"].Category"));
			dataDisksItem.setDeleteAutoSnapshot(_ctx.booleanValue("DescribeCasComputerResponse.Data.DataDisks["+ i +"].DeleteAutoSnapshot"));
			dataDisksItem.setDeleteWithComputer(_ctx.booleanValue("DescribeCasComputerResponse.Data.DataDisks["+ i +"].DeleteWithComputer"));
			dataDisksItem.setDevice(_ctx.stringValue("DescribeCasComputerResponse.Data.DataDisks["+ i +"].Device"));
			dataDisksItem.setEnableAutoSnapshot(_ctx.booleanValue("DescribeCasComputerResponse.Data.DataDisks["+ i +"].EnableAutoSnapshot"));
			dataDisksItem.setIaasId(_ctx.stringValue("DescribeCasComputerResponse.Data.DataDisks["+ i +"].IaasId"));
			dataDisksItem.setId(_ctx.stringValue("DescribeCasComputerResponse.Data.DataDisks["+ i +"].Id"));
			dataDisksItem.setImageId(_ctx.stringValue("DescribeCasComputerResponse.Data.DataDisks["+ i +"].ImageId"));
			dataDisksItem.setName(_ctx.stringValue("DescribeCasComputerResponse.Data.DataDisks["+ i +"].Name"));
			dataDisksItem.setPortable(_ctx.booleanValue("DescribeCasComputerResponse.Data.DataDisks["+ i +"].Portable"));
			dataDisksItem.setProviderId(_ctx.stringValue("DescribeCasComputerResponse.Data.DataDisks["+ i +"].ProviderId"));
			dataDisksItem.setRegionId(_ctx.stringValue("DescribeCasComputerResponse.Data.DataDisks["+ i +"].RegionId"));
			dataDisksItem.setSize(_ctx.longValue("DescribeCasComputerResponse.Data.DataDisks["+ i +"].Size"));
			dataDisksItem.setStatus(_ctx.stringValue("DescribeCasComputerResponse.Data.DataDisks["+ i +"].Status"));
			dataDisksItem.setTenantId(_ctx.stringValue("DescribeCasComputerResponse.Data.DataDisks["+ i +"].TenantId"));
			dataDisksItem.setType(_ctx.stringValue("DescribeCasComputerResponse.Data.DataDisks["+ i +"].Type"));
			dataDisksItem.setUtcCreate(_ctx.stringValue("DescribeCasComputerResponse.Data.DataDisks["+ i +"].UtcCreate"));
			dataDisksItem.setUtcModified(_ctx.stringValue("DescribeCasComputerResponse.Data.DataDisks["+ i +"].UtcModified"));
			dataDisksItem.setWorkspaceId(_ctx.stringValue("DescribeCasComputerResponse.Data.DataDisks["+ i +"].WorkspaceId"));
			dataDisksItem.setZoneId(_ctx.stringValue("DescribeCasComputerResponse.Data.DataDisks["+ i +"].ZoneId"));

			Computer computer = new Computer();
			computer.setName(_ctx.stringValue("DescribeCasComputerResponse.Data.DataDisks["+ i +"].Computer.Name"));
			computer.setId(_ctx.stringValue("DescribeCasComputerResponse.Data.DataDisks["+ i +"].Computer.Id"));
			computer.setIaasId(_ctx.stringValue("DescribeCasComputerResponse.Data.DataDisks["+ i +"].Computer.IaasId"));
			computer.setStatus(_ctx.stringValue("DescribeCasComputerResponse.Data.DataDisks["+ i +"].Computer.Status"));
			dataDisksItem.setComputer(computer);

			dataDisks.add(dataDisksItem);
		}
		data.setDataDisks(dataDisks);

		List<OptionsItem> options = new ArrayList<OptionsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCasComputerResponse.Data.Options.Length"); i++) {
			OptionsItem optionsItem = new OptionsItem();
			optionsItem.setKey(_ctx.stringValue("DescribeCasComputerResponse.Data.Options["+ i +"].Key"));
			optionsItem.setValue(_ctx.stringValue("DescribeCasComputerResponse.Data.Options["+ i +"].Value"));

			options.add(optionsItem);
		}
		data.setOptions(options);

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCasComputerResponse.Data.Tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setKey(_ctx.stringValue("DescribeCasComputerResponse.Data.Tags["+ i +"].Key"));
			tagsItem.setValue(_ctx.stringValue("DescribeCasComputerResponse.Data.Tags["+ i +"].Value"));

			tags.add(tagsItem);
		}
		data.setTags(tags);
		describeCasComputerResponse.setData(data);
	 
	 	return describeCasComputerResponse;
	}
}