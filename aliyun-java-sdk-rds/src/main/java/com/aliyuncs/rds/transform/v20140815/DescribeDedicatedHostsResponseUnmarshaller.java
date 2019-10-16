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

import com.aliyuncs.rds.model.v20140815.DescribeDedicatedHostsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDedicatedHostsResponse.DedicatedHostsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDedicatedHostsResponseUnmarshaller {

	public static DescribeDedicatedHostsResponse unmarshall(DescribeDedicatedHostsResponse describeDedicatedHostsResponse, UnmarshallerContext _ctx) {
		
		describeDedicatedHostsResponse.setRequestId(_ctx.stringValue("DescribeDedicatedHostsResponse.RequestId"));
		describeDedicatedHostsResponse.setDedicatedHostGroupId(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHostGroupId"));

		List<DedicatedHostsItem> dedicatedHosts = new ArrayList<DedicatedHostsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDedicatedHostsResponse.DedicatedHosts.Length"); i++) {
			DedicatedHostsItem dedicatedHostsItem = new DedicatedHostsItem();
			dedicatedHostsItem.setHostName(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].HostName"));
			dedicatedHostsItem.setHostStatus(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].HostStatus"));
			dedicatedHostsItem.setInstanceNumber(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].InstanceNumber"));
			dedicatedHostsItem.setCPUAllocationRatio(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].CPUAllocationRatio"));
			dedicatedHostsItem.setMemAllocationRatio(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].MemAllocationRatio"));
			dedicatedHostsItem.setDiskAllocationRatio(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].DiskAllocationRatio"));
			dedicatedHostsItem.setVPCId(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].VPCId"));
			dedicatedHostsItem.setVSwitchId(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].VSwitchId"));
			dedicatedHostsItem.setZoneId(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].ZoneId"));
			dedicatedHostsItem.setIPAddress(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].IPAddress"));
			dedicatedHostsItem.setHostClass(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].HostClass"));
			dedicatedHostsItem.setCreatedTime(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].CreatedTime"));
			dedicatedHostsItem.setDedicatedHostId(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].DedicatedHostId"));
			dedicatedHostsItem.setAllocationStatus(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].AllocationStatus"));

			dedicatedHosts.add(dedicatedHostsItem);
		}
		describeDedicatedHostsResponse.setDedicatedHosts(dedicatedHosts);
	 
	 	return describeDedicatedHostsResponse;
	}
}