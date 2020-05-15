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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeEipAddressesResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeEipAddressesResponse.EipAddress;
import com.aliyuncs.vpc.model.v20160428.DescribeEipAddressesResponse.EipAddress.LockReason;
import com.aliyuncs.vpc.model.v20160428.DescribeEipAddressesResponse.EipAddress.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEipAddressesResponseUnmarshaller {

	public static DescribeEipAddressesResponse unmarshall(DescribeEipAddressesResponse describeEipAddressesResponse, UnmarshallerContext _ctx) {
		
		describeEipAddressesResponse.setRequestId(_ctx.stringValue("DescribeEipAddressesResponse.RequestId"));
		describeEipAddressesResponse.setTotalCount(_ctx.integerValue("DescribeEipAddressesResponse.TotalCount"));
		describeEipAddressesResponse.setPageNumber(_ctx.integerValue("DescribeEipAddressesResponse.PageNumber"));
		describeEipAddressesResponse.setPageSize(_ctx.integerValue("DescribeEipAddressesResponse.PageSize"));

		List<EipAddress> eipAddresses = new ArrayList<EipAddress>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEipAddressesResponse.EipAddresses.Length"); i++) {
			EipAddress eipAddress = new EipAddress();
			eipAddress.setRegionId(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].RegionId"));
			eipAddress.setIpAddress(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].IpAddress"));
			eipAddress.setPrivateIpAddress(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].PrivateIpAddress"));
			eipAddress.setAllocationId(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].AllocationId"));
			eipAddress.setStatus(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].Status"));
			eipAddress.setInstanceId(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].InstanceId"));
			eipAddress.setBandwidth(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].Bandwidth"));
			eipAddress.setEipBandwidth(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].EipBandwidth"));
			eipAddress.setInternetChargeType(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].InternetChargeType"));
			eipAddress.setAllocationTime(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].AllocationTime"));
			eipAddress.setInstanceType(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].InstanceType"));
			eipAddress.setInstanceRegionId(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].InstanceRegionId"));
			eipAddress.setChargeType(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].ChargeType"));
			eipAddress.setExpiredTime(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].ExpiredTime"));
			eipAddress.setHDMonitorStatus(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].HDMonitorStatus"));
			eipAddress.setName(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].Name"));
			eipAddress.setISP(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].ISP"));
			eipAddress.setDescritpion(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].Descritpion"));
			eipAddress.setBandwidthPackageId(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].BandwidthPackageId"));
			eipAddress.setBandwidthPackageType(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].BandwidthPackageType"));
			eipAddress.setBandwidthPackageBandwidth(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].BandwidthPackageBandwidth"));
			eipAddress.setResourceGroupId(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].ResourceGroupId"));
			eipAddress.setHasReservationData(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].HasReservationData"));
			eipAddress.setReservationBandwidth(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].ReservationBandwidth"));
			eipAddress.setReservationInternetChargeType(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].ReservationInternetChargeType"));
			eipAddress.setReservationActiveTime(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].ReservationActiveTime"));
			eipAddress.setReservationOrderType(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].ReservationOrderType"));
			eipAddress.setMode(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].Mode"));
			eipAddress.setDeletionProtection(_ctx.booleanValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].DeletionProtection"));
			eipAddress.setSecondLimited(_ctx.booleanValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].SecondLimited"));
			eipAddress.setSegmentInstanceId(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].SegmentInstanceId"));

			List<String> availableRegions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].AvailableRegions.Length"); j++) {
				availableRegions.add(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].AvailableRegions["+ j +"]"));
			}
			eipAddress.setAvailableRegions(availableRegions);

			List<LockReason> operationLocks = new ArrayList<LockReason>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].OperationLocks.Length"); j++) {
				LockReason lockReason = new LockReason();
				lockReason.setLockReason(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].OperationLocks["+ j +"].LockReason"));

				operationLocks.add(lockReason);
			}
			eipAddress.setOperationLocks(operationLocks);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			eipAddress.setTags(tags);

			eipAddresses.add(eipAddress);
		}
		describeEipAddressesResponse.setEipAddresses(eipAddresses);
	 
	 	return describeEipAddressesResponse;
	}
}