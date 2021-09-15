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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeEipAddressesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeEipAddressesResponse.EipAddress;
import com.aliyuncs.ecs.model.v20140526.DescribeEipAddressesResponse.EipAddress.LockReason;
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
			eipAddress.setStatus(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].Status"));
			eipAddress.setAllocationTime(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].AllocationTime"));
			eipAddress.setChargeType(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].ChargeType"));
			eipAddress.setInstanceId(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].InstanceId"));
			eipAddress.setInstanceType(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].InstanceType"));
			eipAddress.setRegionId(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].RegionId"));
			eipAddress.setIpAddress(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].IpAddress"));
			eipAddress.setBandwidth(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].Bandwidth"));
			eipAddress.setExpiredTime(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].ExpiredTime"));
			eipAddress.setAllocationId(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].AllocationId"));
			eipAddress.setInternetChargeType(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].InternetChargeType"));
			eipAddress.setEipBandwidth(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].EipBandwidth"));

			List<LockReason> operationLocks = new ArrayList<LockReason>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].OperationLocks.Length"); j++) {
				LockReason lockReason = new LockReason();
				lockReason.setLockReason(_ctx.stringValue("DescribeEipAddressesResponse.EipAddresses["+ i +"].OperationLocks["+ j +"].LockReason"));

				operationLocks.add(lockReason);
			}
			eipAddress.setOperationLocks(operationLocks);

			eipAddresses.add(eipAddress);
		}
		describeEipAddressesResponse.setEipAddresses(eipAddresses);
	 
	 	return describeEipAddressesResponse;
	}
}