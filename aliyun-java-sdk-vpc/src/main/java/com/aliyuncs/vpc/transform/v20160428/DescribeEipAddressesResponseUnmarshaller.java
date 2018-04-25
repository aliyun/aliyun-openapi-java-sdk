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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEipAddressesResponseUnmarshaller {

	public static DescribeEipAddressesResponse unmarshall(DescribeEipAddressesResponse describeEipAddressesResponse, UnmarshallerContext context) {
		
		describeEipAddressesResponse.setRequestId(context.stringValue("DescribeEipAddressesResponse.RequestId"));
		describeEipAddressesResponse.setTotalCount(context.integerValue("DescribeEipAddressesResponse.TotalCount"));
		describeEipAddressesResponse.setPageNumber(context.integerValue("DescribeEipAddressesResponse.PageNumber"));
		describeEipAddressesResponse.setPageSize(context.integerValue("DescribeEipAddressesResponse.PageSize"));

		List<EipAddress> eipAddresses = new ArrayList<EipAddress>();
		for (int i = 0; i < context.lengthValue("DescribeEipAddressesResponse.EipAddresses.Length"); i++) {
			EipAddress eipAddress = new EipAddress();
			eipAddress.setRegionId(context.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].RegionId"));
			eipAddress.setIpAddress(context.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].IpAddress"));
			eipAddress.setAllocationId(context.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].AllocationId"));
			eipAddress.setStatus(context.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].Status"));
			eipAddress.setInstanceId(context.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].InstanceId"));
			eipAddress.setBandwidth(context.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].Bandwidth"));
			eipAddress.setEipBandwidth(context.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].EipBandwidth"));
			eipAddress.setInternetChargeType(context.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].InternetChargeType"));
			eipAddress.setAllocationTime(context.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].AllocationTime"));
			eipAddress.setInstanceType(context.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].InstanceType"));
			eipAddress.setInstanceRegionId(context.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].InstanceRegionId"));
			eipAddress.setChargeType(context.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].ChargeType"));
			eipAddress.setExpiredTime(context.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].ExpiredTime"));
			eipAddress.setName(context.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].Name"));
			eipAddress.setISP(context.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].ISP"));
			eipAddress.setDescritpion(context.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].Descritpion"));
			eipAddress.setBandwidthPackageId(context.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].BandwidthPackageId"));
			eipAddress.setBandwidthPackageType(context.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].BandwidthPackageType"));
			eipAddress.setResourceGroupId(context.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].ResourceGroupId"));

			List<String> availableRegions = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].AvailableRegions.Length"); j++) {
				availableRegions.add(context.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].AvailableRegions["+ j +"]"));
			}
			eipAddress.setAvailableRegions(availableRegions);

			List<LockReason> operationLocks = new ArrayList<LockReason>();
			for (int j = 0; j < context.lengthValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].OperationLocks.Length"); j++) {
				LockReason lockReason = new LockReason();
				lockReason.setLockReason(context.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].OperationLocks["+ j +"].LockReason"));

				operationLocks.add(lockReason);
			}
			eipAddress.setOperationLocks(operationLocks);

			eipAddresses.add(eipAddress);
		}
		describeEipAddressesResponse.setEipAddresses(eipAddresses);
	 
	 	return describeEipAddressesResponse;
	}
}