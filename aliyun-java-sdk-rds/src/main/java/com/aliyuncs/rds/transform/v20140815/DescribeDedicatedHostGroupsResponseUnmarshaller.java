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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeDedicatedHostGroupsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDedicatedHostGroupsResponse.DedicatedHostGroupsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDedicatedHostGroupsResponseUnmarshaller {

	public static DescribeDedicatedHostGroupsResponse unmarshall(DescribeDedicatedHostGroupsResponse describeDedicatedHostGroupsResponse, UnmarshallerContext _ctx) {
		
		describeDedicatedHostGroupsResponse.setRequestId(_ctx.stringValue("DescribeDedicatedHostGroupsResponse.RequestId"));

		List<DedicatedHostGroupsItem> dedicatedHostGroups = new ArrayList<DedicatedHostGroupsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups.Length"); i++) {
			DedicatedHostGroupsItem dedicatedHostGroupsItem = new DedicatedHostGroupsItem();
			dedicatedHostGroupsItem.setAllocationPolicy(_ctx.stringValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].AllocationPolicy"));
			dedicatedHostGroupsItem.setBastionInstanceId(_ctx.stringValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].BastionInstanceId"));
			dedicatedHostGroupsItem.setCpuAllocateRation(_ctx.floatValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].CpuAllocateRation"));
			dedicatedHostGroupsItem.setCpuAllocatedAmount(_ctx.floatValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].CpuAllocatedAmount"));
			dedicatedHostGroupsItem.setCpuAllocationRatio(_ctx.integerValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].CpuAllocationRatio"));
			dedicatedHostGroupsItem.setCreateTime(_ctx.stringValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].CreateTime"));
			dedicatedHostGroupsItem.setDedicatedHostCountGroupByHostType(_ctx.mapValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].DedicatedHostCountGroupByHostType"));
			dedicatedHostGroupsItem.setDedicatedHostGroupDesc(_ctx.stringValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].DedicatedHostGroupDesc"));
			dedicatedHostGroupsItem.setDedicatedHostGroupId(_ctx.stringValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].DedicatedHostGroupId"));
			dedicatedHostGroupsItem.setDiskAllocateRation(_ctx.floatValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].DiskAllocateRation"));
			dedicatedHostGroupsItem.setDiskAllocatedAmount(_ctx.floatValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].DiskAllocatedAmount"));
			dedicatedHostGroupsItem.setDiskAllocationRatio(_ctx.integerValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].DiskAllocationRatio"));
			dedicatedHostGroupsItem.setDiskUsedAmount(_ctx.floatValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].DiskUsedAmount"));
			dedicatedHostGroupsItem.setDiskUtility(_ctx.floatValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].DiskUtility"));
			dedicatedHostGroupsItem.setEngine(_ctx.stringValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].Engine"));
			dedicatedHostGroupsItem.setHostNumber(_ctx.integerValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].HostNumber"));
			dedicatedHostGroupsItem.setHostReplacePolicy(_ctx.stringValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].HostReplacePolicy"));
			dedicatedHostGroupsItem.setInstanceNumber(_ctx.integerValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].InstanceNumber"));
			dedicatedHostGroupsItem.setMemAllocateRation(_ctx.floatValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].MemAllocateRation"));
			dedicatedHostGroupsItem.setMemAllocatedAmount(_ctx.floatValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].MemAllocatedAmount"));
			dedicatedHostGroupsItem.setMemAllocationRatio(_ctx.integerValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].MemAllocationRatio"));
			dedicatedHostGroupsItem.setMemUsedAmount(_ctx.floatValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].MemUsedAmount"));
			dedicatedHostGroupsItem.setMemUtility(_ctx.floatValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].MemUtility"));
			dedicatedHostGroupsItem.setOpenPermission(_ctx.stringValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].OpenPermission"));
			dedicatedHostGroupsItem.setText(_ctx.stringValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].Text"));
			dedicatedHostGroupsItem.setVPCId(_ctx.stringValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].VPCId"));

			List<String> zoneIDList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].ZoneIDList.Length"); j++) {
				zoneIDList.add(_ctx.stringValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].ZoneIDList["+ j +"]"));
			}
			dedicatedHostGroupsItem.setZoneIDList(zoneIDList);

			dedicatedHostGroups.add(dedicatedHostGroupsItem);
		}
		describeDedicatedHostGroupsResponse.setDedicatedHostGroups(dedicatedHostGroups);
	 
	 	return describeDedicatedHostGroupsResponse;
	}
}