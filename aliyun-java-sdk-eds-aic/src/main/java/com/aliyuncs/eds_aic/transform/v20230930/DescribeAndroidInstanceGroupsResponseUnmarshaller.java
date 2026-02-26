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

package com.aliyuncs.eds_aic.transform.v20230930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eds_aic.model.v20230930.DescribeAndroidInstanceGroupsResponse;
import com.aliyuncs.eds_aic.model.v20230930.DescribeAndroidInstanceGroupsResponse.Data;
import com.aliyuncs.eds_aic.model.v20230930.DescribeAndroidInstanceGroupsResponse.Data.DisksItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAndroidInstanceGroupsResponseUnmarshaller {

	public static DescribeAndroidInstanceGroupsResponse unmarshall(DescribeAndroidInstanceGroupsResponse describeAndroidInstanceGroupsResponse, UnmarshallerContext _ctx) {
		
		describeAndroidInstanceGroupsResponse.setRequestId(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.RequestId"));
		describeAndroidInstanceGroupsResponse.setTotalCount(_ctx.integerValue("DescribeAndroidInstanceGroupsResponse.TotalCount"));
		describeAndroidInstanceGroupsResponse.setNextToken(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.NextToken"));
		describeAndroidInstanceGroupsResponse.setCode(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.Code"));
		describeAndroidInstanceGroupsResponse.setMessage(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.Message"));

		List<Data> instanceGroupModel = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel.Length"); i++) {
			Data data = new Data();
			data.setInstanceGroupId(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].InstanceGroupId"));
			data.setInstanceGroupName(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].InstanceGroupName"));
			data.setInstanceGroupStatus(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].InstanceGroupStatus"));
			data.setInstanceGroupSpec(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].InstanceGroupSpec"));
			data.setInstanceGroupSpecDescribe(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].InstanceGroupSpecDescribe"));
			data.setOfficeSiteId(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].OfficeSiteId"));
			data.setImageType(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].ImageType"));
			data.setImageId(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].ImageId"));
			data.setImageName(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].ImageName"));
			data.setNumberOfInstances(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].NumberOfInstances"));
			data.setChargeType(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].ChargeType"));
			data.setRegionId(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].RegionId"));
			data.setGmtCreate(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].GmtCreate"));
			data.setGmtModified(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].GmtModified"));
			data.setSaleMode(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].SaleMode"));
			data.setInstalledAppList(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].InstalledAppList"));
			data.setAuthorizedUserList(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].AuthorizedUserList"));
			data.setGmtExpired(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].GmtExpired"));
			data.setAppInstanceGroupId(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].AppInstanceGroupId"));
			data.setPropertiesTemplateId(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].PropertiesTemplateId"));
			data.setPolicyGroupId(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].PolicyGroupId"));
			data.setKeyPairId(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].KeyPairId"));
			data.setReserveMinAmount(_ctx.integerValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].ReserveMinAmount"));
			data.setMaxInstanceAmount(_ctx.integerValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].MaxInstanceAmount"));
			data.setScalingUsageThreshold(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].ScalingUsageThreshold"));
			data.setScalingStep(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].ScalingStep"));
			data.setScalingDownAfterIdleMinutes(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].ScalingDownAfterIdleMinutes"));
			data.setInUsedInstanceAmount(_ctx.integerValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].InUsedInstanceAmount"));
			data.setIdleInstanceAmount(_ctx.integerValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].IdleInstanceAmount"));
			data.setFileSystemId(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].FileSystemId"));
			data.setSessionTimeout(_ctx.integerValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].SessionTimeout"));
			data.setVSwitchId(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].VSwitchId"));
			data.setResolutionHeight(_ctx.integerValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].ResolutionHeight"));
			data.setResolutionWidth(_ctx.integerValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].ResolutionWidth"));
			data.setSystemVersion(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].SystemVersion"));
			data.setArchitectureType(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].ArchitectureType"));
			data.setMemory(_ctx.integerValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].Memory"));
			data.setCpu(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].Cpu"));
			data.setErrorCode(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].ErrorCode"));
			data.setRenderingType(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].RenderingType"));
			data.setAvailableInstanceAmount(_ctx.integerValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].AvailableInstanceAmount"));
			data.setEnableIpv6(_ctx.booleanValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].EnableIpv6"));
			data.setIpv6Bandwidth(_ctx.integerValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].Ipv6Bandwidth"));

			List<DisksItem> disks = new ArrayList<DisksItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].Disks.Length"); j++) {
				DisksItem disksItem = new DisksItem();
				disksItem.setDiskType(_ctx.stringValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].Disks["+ j +"].DiskType"));
				disksItem.setDiskSize(_ctx.integerValue("DescribeAndroidInstanceGroupsResponse.InstanceGroupModel["+ i +"].Disks["+ j +"].DiskSize"));

				disks.add(disksItem);
			}
			data.setDisks(disks);

			instanceGroupModel.add(data);
		}
		describeAndroidInstanceGroupsResponse.setInstanceGroupModel(instanceGroupModel);
	 
	 	return describeAndroidInstanceGroupsResponse;
	}
}