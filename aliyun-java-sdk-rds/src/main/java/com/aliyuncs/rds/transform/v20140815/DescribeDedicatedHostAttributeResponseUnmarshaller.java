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

import com.aliyuncs.rds.model.v20140815.DescribeDedicatedHostAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDedicatedHostAttributeResponseUnmarshaller {

	public static DescribeDedicatedHostAttributeResponse unmarshall(DescribeDedicatedHostAttributeResponse describeDedicatedHostAttributeResponse, UnmarshallerContext _ctx) {
		
		describeDedicatedHostAttributeResponse.setRequestId(_ctx.stringValue("DescribeDedicatedHostAttributeResponse.RequestId"));
		describeDedicatedHostAttributeResponse.setDedicatedHostGroupId(_ctx.stringValue("DescribeDedicatedHostAttributeResponse.DedicatedHostGroupId"));
		describeDedicatedHostAttributeResponse.setDedicatedHostId(_ctx.stringValue("DescribeDedicatedHostAttributeResponse.DedicatedHostId"));
		describeDedicatedHostAttributeResponse.setRegionId(_ctx.stringValue("DescribeDedicatedHostAttributeResponse.RegionId"));
		describeDedicatedHostAttributeResponse.setZoneId(_ctx.stringValue("DescribeDedicatedHostAttributeResponse.ZoneId"));
		describeDedicatedHostAttributeResponse.setVPCId(_ctx.stringValue("DescribeDedicatedHostAttributeResponse.VPCId"));
		describeDedicatedHostAttributeResponse.setVSwitchId(_ctx.stringValue("DescribeDedicatedHostAttributeResponse.VSwitchId"));
		describeDedicatedHostAttributeResponse.setIPAddress(_ctx.stringValue("DescribeDedicatedHostAttributeResponse.IPAddress"));
		describeDedicatedHostAttributeResponse.setHostName(_ctx.stringValue("DescribeDedicatedHostAttributeResponse.HostName"));
		describeDedicatedHostAttributeResponse.setHostStatus(_ctx.stringValue("DescribeDedicatedHostAttributeResponse.HostStatus"));
		describeDedicatedHostAttributeResponse.setHostClass(_ctx.stringValue("DescribeDedicatedHostAttributeResponse.HostClass"));
		describeDedicatedHostAttributeResponse.setHostCPU(_ctx.integerValue("DescribeDedicatedHostAttributeResponse.HostCPU"));
		describeDedicatedHostAttributeResponse.setHostMem(_ctx.integerValue("DescribeDedicatedHostAttributeResponse.HostMem"));
		describeDedicatedHostAttributeResponse.setHostStorage(_ctx.integerValue("DescribeDedicatedHostAttributeResponse.HostStorage"));
		describeDedicatedHostAttributeResponse.setCPUAllocationRatio(_ctx.stringValue("DescribeDedicatedHostAttributeResponse.CPUAllocationRatio"));
		describeDedicatedHostAttributeResponse.setMemAllocationRatio(_ctx.stringValue("DescribeDedicatedHostAttributeResponse.MemAllocationRatio"));
		describeDedicatedHostAttributeResponse.setDiskAllocationRatio(_ctx.stringValue("DescribeDedicatedHostAttributeResponse.DiskAllocationRatio"));
		describeDedicatedHostAttributeResponse.setInstanceNumber(_ctx.integerValue("DescribeDedicatedHostAttributeResponse.InstanceNumber"));
		describeDedicatedHostAttributeResponse.setInstanceNumberMaster(_ctx.integerValue("DescribeDedicatedHostAttributeResponse.InstanceNumberMaster"));
		describeDedicatedHostAttributeResponse.setInstanceNumberSlave(_ctx.integerValue("DescribeDedicatedHostAttributeResponse.InstanceNumberSlave"));
		describeDedicatedHostAttributeResponse.setInstanceNumberROMaster(_ctx.integerValue("DescribeDedicatedHostAttributeResponse.InstanceNumberROMaster"));
		describeDedicatedHostAttributeResponse.setInstanceNumberROSlave(_ctx.integerValue("DescribeDedicatedHostAttributeResponse.InstanceNumberROSlave"));
		describeDedicatedHostAttributeResponse.setCreatedTime(_ctx.stringValue("DescribeDedicatedHostAttributeResponse.CreatedTime"));
		describeDedicatedHostAttributeResponse.setExpiredTime(_ctx.stringValue("DescribeDedicatedHostAttributeResponse.ExpiredTime"));
		describeDedicatedHostAttributeResponse.setAutoRenew(_ctx.stringValue("DescribeDedicatedHostAttributeResponse.AutoRenew"));
		describeDedicatedHostAttributeResponse.setAllocationStatus(_ctx.stringValue("DescribeDedicatedHostAttributeResponse.AllocationStatus"));
		describeDedicatedHostAttributeResponse.setCpuUsed(_ctx.stringValue("DescribeDedicatedHostAttributeResponse.CpuUsed"));
		describeDedicatedHostAttributeResponse.setMemoryUsed(_ctx.stringValue("DescribeDedicatedHostAttributeResponse.MemoryUsed"));
		describeDedicatedHostAttributeResponse.setStorageUsed(_ctx.stringValue("DescribeDedicatedHostAttributeResponse.StorageUsed"));
		describeDedicatedHostAttributeResponse.setHostType(_ctx.stringValue("DescribeDedicatedHostAttributeResponse.HostType"));
		describeDedicatedHostAttributeResponse.setAccountName(_ctx.stringValue("DescribeDedicatedHostAttributeResponse.AccountName"));
		describeDedicatedHostAttributeResponse.setOpenPermission(_ctx.stringValue("DescribeDedicatedHostAttributeResponse.OpenPermission"));
		describeDedicatedHostAttributeResponse.setImageCategory(_ctx.stringValue("DescribeDedicatedHostAttributeResponse.ImageCategory"));
	 
	 	return describeDedicatedHostAttributeResponse;
	}
}