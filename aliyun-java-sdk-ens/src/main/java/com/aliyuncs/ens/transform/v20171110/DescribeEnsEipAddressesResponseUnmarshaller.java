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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeEnsEipAddressesResponse;
import com.aliyuncs.ens.model.v20171110.DescribeEnsEipAddressesResponse.EipAddress;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEnsEipAddressesResponseUnmarshaller {

	public static DescribeEnsEipAddressesResponse unmarshall(DescribeEnsEipAddressesResponse describeEnsEipAddressesResponse, UnmarshallerContext _ctx) {
		
		describeEnsEipAddressesResponse.setRequestId(_ctx.stringValue("DescribeEnsEipAddressesResponse.RequestId"));
		describeEnsEipAddressesResponse.setPageNumber(_ctx.integerValue("DescribeEnsEipAddressesResponse.PageNumber"));
		describeEnsEipAddressesResponse.setPageSize(_ctx.integerValue("DescribeEnsEipAddressesResponse.PageSize"));
		describeEnsEipAddressesResponse.setTotalCount(_ctx.integerValue("DescribeEnsEipAddressesResponse.TotalCount"));

		List<EipAddress> eipAddresses = new ArrayList<EipAddress>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEnsEipAddressesResponse.EipAddresses.Length"); i++) {
			EipAddress eipAddress = new EipAddress();
			eipAddress.setAllocationId(_ctx.stringValue("DescribeEnsEipAddressesResponse.EipAddresses["+ i +"].AllocationId"));
			eipAddress.setAllocationTime(_ctx.stringValue("DescribeEnsEipAddressesResponse.EipAddresses["+ i +"].AllocationTime"));
			eipAddress.setBandwidth(_ctx.integerValue("DescribeEnsEipAddressesResponse.EipAddresses["+ i +"].Bandwidth"));
			eipAddress.setChargeType(_ctx.stringValue("DescribeEnsEipAddressesResponse.EipAddresses["+ i +"].ChargeType"));
			eipAddress.setDescription(_ctx.stringValue("DescribeEnsEipAddressesResponse.EipAddresses["+ i +"].Description"));
			eipAddress.setInstanceId(_ctx.stringValue("DescribeEnsEipAddressesResponse.EipAddresses["+ i +"].InstanceId"));
			eipAddress.setInstanceType(_ctx.stringValue("DescribeEnsEipAddressesResponse.EipAddresses["+ i +"].InstanceType"));
			eipAddress.setInternetChargeType(_ctx.stringValue("DescribeEnsEipAddressesResponse.EipAddresses["+ i +"].InternetChargeType"));
			eipAddress.setIpAddress(_ctx.stringValue("DescribeEnsEipAddressesResponse.EipAddresses["+ i +"].IpAddress"));
			eipAddress.setName(_ctx.stringValue("DescribeEnsEipAddressesResponse.EipAddresses["+ i +"].Name"));
			eipAddress.setEnsRegionId(_ctx.stringValue("DescribeEnsEipAddressesResponse.EipAddresses["+ i +"].EnsRegionId"));
			eipAddress.setStatus(_ctx.stringValue("DescribeEnsEipAddressesResponse.EipAddresses["+ i +"].Status"));
			eipAddress.setIsp(_ctx.stringValue("DescribeEnsEipAddressesResponse.EipAddresses["+ i +"].Isp"));

			eipAddresses.add(eipAddress);
		}
		describeEnsEipAddressesResponse.setEipAddresses(eipAddresses);
	 
	 	return describeEnsEipAddressesResponse;
	}
}