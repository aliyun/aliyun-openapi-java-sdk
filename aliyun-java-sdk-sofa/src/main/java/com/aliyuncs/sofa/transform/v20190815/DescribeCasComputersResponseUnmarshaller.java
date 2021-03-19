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

import com.aliyuncs.sofa.model.v20190815.DescribeCasComputersResponse;
import com.aliyuncs.sofa.model.v20190815.DescribeCasComputersResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.DescribeCasComputersResponse.DataItem.DataDisksItem;
import com.aliyuncs.sofa.model.v20190815.DescribeCasComputersResponse.DataItem.DataDisksItem.Computer;
import com.aliyuncs.sofa.model.v20190815.DescribeCasComputersResponse.DataItem.OptionsItem;
import com.aliyuncs.sofa.model.v20190815.DescribeCasComputersResponse.DataItem.SystemDisk;
import com.aliyuncs.sofa.model.v20190815.DescribeCasComputersResponse.DataItem.SystemDisk.Computer1;
import com.aliyuncs.sofa.model.v20190815.DescribeCasComputersResponse.DataItem.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCasComputersResponseUnmarshaller {

	public static DescribeCasComputersResponse unmarshall(DescribeCasComputersResponse describeCasComputersResponse, UnmarshallerContext _ctx) {
		
		describeCasComputersResponse.setRequestId(_ctx.stringValue("DescribeCasComputersResponse.RequestId"));
		describeCasComputersResponse.setResultCode(_ctx.stringValue("DescribeCasComputersResponse.ResultCode"));
		describeCasComputersResponse.setResultMessage(_ctx.stringValue("DescribeCasComputersResponse.ResultMessage"));
		describeCasComputersResponse.setTotalCount(_ctx.longValue("DescribeCasComputersResponse.TotalCount"));
		describeCasComputersResponse.setPageSize(_ctx.longValue("DescribeCasComputersResponse.PageSize"));
		describeCasComputersResponse.setCurrentPage(_ctx.longValue("DescribeCasComputersResponse.CurrentPage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCasComputersResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAppId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].AppId"));
			dataItem.setAutoRenew(_ctx.booleanValue("DescribeCasComputersResponse.Data["+ i +"].AutoRenew"));
			dataItem.setAutoRenewPeriod(_ctx.longValue("DescribeCasComputersResponse.Data["+ i +"].AutoRenewPeriod"));
			dataItem.setBandwidth(_ctx.longValue("DescribeCasComputersResponse.Data["+ i +"].Bandwidth"));
			dataItem.setCommonImage(_ctx.booleanValue("DescribeCasComputersResponse.Data["+ i +"].CommonImage"));
			dataItem.setCpu(_ctx.longValue("DescribeCasComputersResponse.Data["+ i +"].Cpu"));
			dataItem.setCpuShared(_ctx.booleanValue("DescribeCasComputersResponse.Data["+ i +"].CpuShared"));
			dataItem.setCreationTime(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].CreationTime"));
			dataItem.setDeployMode(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].DeployMode"));
			dataItem.setDescription(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].Description"));
			dataItem.setElasticIp(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].ElasticIp"));
			dataItem.setExpiredTime(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].ExpiredTime"));
			dataItem.setIaasId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].IaasId"));
			dataItem.setIaasStatus(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].IaasStatus"));
			dataItem.setIaasType(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].IaasType"));
			dataItem.setId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].Id"));
			dataItem.setImageIaasId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].ImageIaasId"));
			dataItem.setImageId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].ImageId"));
			dataItem.setImageName(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].ImageName"));
			dataItem.setInitialized(_ctx.booleanValue("DescribeCasComputersResponse.Data["+ i +"].Initialized"));
			dataItem.setInstanceChargeType(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].InstanceChargeType"));
			dataItem.setIoOptimized(_ctx.booleanValue("DescribeCasComputersResponse.Data["+ i +"].IoOptimized"));
			dataItem.setLastOpsOrderId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].LastOpsOrderId"));
			dataItem.setLastOpsType(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].LastOpsType"));
			dataItem.setMemory(_ctx.longValue("DescribeCasComputersResponse.Data["+ i +"].Memory"));
			dataItem.setName(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].Name"));
			dataItem.setNetworkType(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].NetworkType"));
			dataItem.setOs(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].Os"));
			dataItem.setOsBit(_ctx.longValue("DescribeCasComputersResponse.Data["+ i +"].OsBit"));
			dataItem.setOsVersion(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].OsVersion"));
			dataItem.setPaasStatus(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].PaasStatus"));
			dataItem.setPassword(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].Password"));
			dataItem.setPrivateIp(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].PrivateIp"));
			dataItem.setProviderId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].ProviderId"));
			dataItem.setPublicIp(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].PublicIp"));
			dataItem.setRegionId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].RegionId"));
			dataItem.setSerialNumber(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].SerialNumber"));
			dataItem.setSpecIaasId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].SpecIaasId"));
			dataItem.setStatus(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].Status"));
			dataItem.setTenantId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].TenantId"));
			dataItem.setTenantId2(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].TenantId2"));
			dataItem.setThreadsPerCore(_ctx.longValue("DescribeCasComputersResponse.Data["+ i +"].ThreadsPerCore"));
			dataItem.setUtcCreate(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].UtcCreate"));
			dataItem.setUtcModified(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].UtcModified"));
			dataItem.setVpcId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].VpcId"));
			dataItem.setVSwitchIaasId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].VSwitchIaasId"));
			dataItem.setWorkspaceId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].WorkspaceId"));
			dataItem.setZoneId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].ZoneId"));

			List<String> appServiceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCasComputersResponse.Data["+ i +"].AppServiceIds.Length"); j++) {
				appServiceIds.add(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].AppServiceIds["+ j +"]"));
			}
			dataItem.setAppServiceIds(appServiceIds);

			List<String> assignedAppServiceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCasComputersResponse.Data["+ i +"].AssignedAppServiceIds.Length"); j++) {
				assignedAppServiceIds.add(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].AssignedAppServiceIds["+ j +"]"));
			}
			dataItem.setAssignedAppServiceIds(assignedAppServiceIds);

			SystemDisk systemDisk = new SystemDisk();
			systemDisk.setCategory(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].SystemDisk.Category"));
			systemDisk.setDeleteAutoSnapshot(_ctx.booleanValue("DescribeCasComputersResponse.Data["+ i +"].SystemDisk.DeleteAutoSnapshot"));
			systemDisk.setDeleteWithComputer(_ctx.booleanValue("DescribeCasComputersResponse.Data["+ i +"].SystemDisk.DeleteWithComputer"));
			systemDisk.setDevice(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].SystemDisk.Device"));
			systemDisk.setEnableAutoSnapshot(_ctx.booleanValue("DescribeCasComputersResponse.Data["+ i +"].SystemDisk.EnableAutoSnapshot"));
			systemDisk.setIaasId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].SystemDisk.IaasId"));
			systemDisk.setId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].SystemDisk.Id"));
			systemDisk.setImageId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].SystemDisk.ImageId"));
			systemDisk.setName(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].SystemDisk.Name"));
			systemDisk.setPortable(_ctx.booleanValue("DescribeCasComputersResponse.Data["+ i +"].SystemDisk.Portable"));
			systemDisk.setProviderId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].SystemDisk.ProviderId"));
			systemDisk.setRegionId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].SystemDisk.RegionId"));
			systemDisk.setSize(_ctx.longValue("DescribeCasComputersResponse.Data["+ i +"].SystemDisk.Size"));
			systemDisk.setStatus(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].SystemDisk.Status"));
			systemDisk.setTenantId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].SystemDisk.TenantId"));
			systemDisk.setType(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].SystemDisk.Type"));
			systemDisk.setUtcCreate(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].SystemDisk.UtcCreate"));
			systemDisk.setUtcModified(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].SystemDisk.UtcModified"));
			systemDisk.setWorkspaceId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].SystemDisk.WorkspaceId"));
			systemDisk.setZoneId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].SystemDisk.ZoneId"));

			Computer1 computer1 = new Computer1();
			computer1.setName(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].SystemDisk.Computer.Name"));
			computer1.setId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].SystemDisk.Computer.Id"));
			computer1.setIaasId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].SystemDisk.Computer.IaasId"));
			computer1.setStatus(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].SystemDisk.Computer.Status"));
			systemDisk.setComputer1(computer1);
			dataItem.setSystemDisk(systemDisk);

			List<DataDisksItem> dataDisks = new ArrayList<DataDisksItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCasComputersResponse.Data["+ i +"].DataDisks.Length"); j++) {
				DataDisksItem dataDisksItem = new DataDisksItem();
				dataDisksItem.setCategory(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].DataDisks["+ j +"].Category"));
				dataDisksItem.setDeleteAutoSnapshot(_ctx.booleanValue("DescribeCasComputersResponse.Data["+ i +"].DataDisks["+ j +"].DeleteAutoSnapshot"));
				dataDisksItem.setDeleteWithComputer(_ctx.booleanValue("DescribeCasComputersResponse.Data["+ i +"].DataDisks["+ j +"].DeleteWithComputer"));
				dataDisksItem.setDevice(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].DataDisks["+ j +"].Device"));
				dataDisksItem.setEnableAutoSnapshot(_ctx.booleanValue("DescribeCasComputersResponse.Data["+ i +"].DataDisks["+ j +"].EnableAutoSnapshot"));
				dataDisksItem.setIaasId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].DataDisks["+ j +"].IaasId"));
				dataDisksItem.setId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].DataDisks["+ j +"].Id"));
				dataDisksItem.setImageId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].DataDisks["+ j +"].ImageId"));
				dataDisksItem.setName(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].DataDisks["+ j +"].Name"));
				dataDisksItem.setPortable(_ctx.booleanValue("DescribeCasComputersResponse.Data["+ i +"].DataDisks["+ j +"].Portable"));
				dataDisksItem.setProviderId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].DataDisks["+ j +"].ProviderId"));
				dataDisksItem.setRegionId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].DataDisks["+ j +"].RegionId"));
				dataDisksItem.setSize(_ctx.longValue("DescribeCasComputersResponse.Data["+ i +"].DataDisks["+ j +"].Size"));
				dataDisksItem.setStatus(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].DataDisks["+ j +"].Status"));
				dataDisksItem.setTenantId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].DataDisks["+ j +"].TenantId"));
				dataDisksItem.setType(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].DataDisks["+ j +"].Type"));
				dataDisksItem.setUtcCreate(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].DataDisks["+ j +"].UtcCreate"));
				dataDisksItem.setUtcModified(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].DataDisks["+ j +"].UtcModified"));
				dataDisksItem.setWorkspaceId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].DataDisks["+ j +"].WorkspaceId"));
				dataDisksItem.setZoneId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].DataDisks["+ j +"].ZoneId"));

				Computer computer = new Computer();
				computer.setName(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].DataDisks["+ j +"].Computer.Name"));
				computer.setId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].DataDisks["+ j +"].Computer.Id"));
				computer.setIaasId(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].DataDisks["+ j +"].Computer.IaasId"));
				computer.setStatus(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].DataDisks["+ j +"].Computer.Status"));
				dataDisksItem.setComputer(computer);

				dataDisks.add(dataDisksItem);
			}
			dataItem.setDataDisks(dataDisks);

			List<OptionsItem> options = new ArrayList<OptionsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCasComputersResponse.Data["+ i +"].Options.Length"); j++) {
				OptionsItem optionsItem = new OptionsItem();
				optionsItem.setKey(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].Options["+ j +"].Key"));
				optionsItem.setValue(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].Options["+ j +"].Value"));

				options.add(optionsItem);
			}
			dataItem.setOptions(options);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCasComputersResponse.Data["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setKey(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].Tags["+ j +"].Key"));
				tagsItem.setValue(_ctx.stringValue("DescribeCasComputersResponse.Data["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagsItem);
			}
			dataItem.setTags(tags);

			data.add(dataItem);
		}
		describeCasComputersResponse.setData(data);
	 
	 	return describeCasComputersResponse;
	}
}