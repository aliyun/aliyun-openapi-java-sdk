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
		describeEipAddressesResponse.setPageSize(_ctx.integerValue("DescribeEipAddressesResponse.PageSize"));
		describeEipAddressesResponse.setPageNumber(_ctx.integerValue("DescribeEipAddressesResponse.PageNumber"));
		describeEipAddressesResponse.setTotalCount(_ctx.integerValue("DescribeEipAddressesResponse.TotalCount"));

		List<EipAddress> eipAddresses = new ArrayList<EipAddress>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEipAddressesResponse.EipAddresses.Length"); i++) {
			EipAddress eipAddress = new EipAddress();
			eipAddress.setReservationActiveTime(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].ReservationActiveTime"));
			eipAddress.setStatus(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].Status"));
			eipAddress.setReservationOrderType(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].ReservationOrderType"));
			eipAddress.setAllocationTime(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].AllocationTime"));
			eipAddress.setNetmode(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].Netmode"));
			eipAddress.setChargeType(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].ChargeType"));
			eipAddress.setDescritpion(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].Descritpion"));
			eipAddress.setDescription(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].Description"));
			eipAddress.setMode(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].Mode"));
			eipAddress.setSegmentInstanceId(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].SegmentInstanceId"));
			eipAddress.setReservationInternetChargeType(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].ReservationInternetChargeType"));
			eipAddress.setBandwidthPackageId(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].BandwidthPackageId"));
			eipAddress.setIpAddress(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].IpAddress"));
			eipAddress.setBandwidth(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].Bandwidth"));
			eipAddress.setReservationBandwidth(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].ReservationBandwidth"));
			eipAddress.setEipBandwidth(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].EipBandwidth"));
			eipAddress.setName(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].Name"));
			eipAddress.setPrivateIpAddress(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].PrivateIpAddress"));
			eipAddress.setInstanceRegionId(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].InstanceRegionId"));
			eipAddress.setDeletionProtection(_ctx.booleanValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].DeletionProtection"));
			eipAddress.setInstanceId(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].InstanceId"));
			eipAddress.setSecondLimited(_ctx.booleanValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].SecondLimited"));
			eipAddress.setInstanceType(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].InstanceType"));
			eipAddress.setHDMonitorStatus(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].HDMonitorStatus"));
			eipAddress.setRegionId(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].RegionId"));
			eipAddress.setBandwidthPackageBandwidth(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].BandwidthPackageBandwidth"));
			eipAddress.setServiceManaged(_ctx.integerValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].ServiceManaged"));
			eipAddress.setExpiredTime(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].ExpiredTime"));
			eipAddress.setResourceGroupId(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].ResourceGroupId"));
			eipAddress.setAllocationId(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].AllocationId"));
			eipAddress.setInternetChargeType(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].InternetChargeType"));
			eipAddress.setBusinessStatus(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].BusinessStatus"));
			eipAddress.setBandwidthPackageType(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].BandwidthPackageType"));
			eipAddress.setHasReservationData(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].HasReservationData"));
			eipAddress.setISP(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].ISP"));
			eipAddress.setPublicIpAddressPoolId(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].PublicIpAddressPoolId"));

			List<String> availableRegions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].AvailableRegions.Length"); j++) {
				availableRegions.add(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].AvailableRegions["+ j +"]"));
			}
			eipAddress.setAvailableRegions(availableRegions);

			List<String> securityProtectionTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].SecurityProtectionTypes.Length"); j++) {
				securityProtectionTypes.add(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].SecurityProtectionTypes["+ j +"]"));
			}
			eipAddress.setSecurityProtectionTypes(securityProtectionTypes);

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