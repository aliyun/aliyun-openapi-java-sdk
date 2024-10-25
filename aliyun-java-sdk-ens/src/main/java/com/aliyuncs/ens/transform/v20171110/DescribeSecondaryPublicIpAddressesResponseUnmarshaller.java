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

import com.aliyuncs.ens.model.v20171110.DescribeSecondaryPublicIpAddressesResponse;
import com.aliyuncs.ens.model.v20171110.DescribeSecondaryPublicIpAddressesResponse.Ip;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSecondaryPublicIpAddressesResponseUnmarshaller {

	public static DescribeSecondaryPublicIpAddressesResponse unmarshall(DescribeSecondaryPublicIpAddressesResponse describeSecondaryPublicIpAddressesResponse, UnmarshallerContext _ctx) {
		
		describeSecondaryPublicIpAddressesResponse.setRequestId(_ctx.stringValue("DescribeSecondaryPublicIpAddressesResponse.RequestId"));
		describeSecondaryPublicIpAddressesResponse.setPageNumber(_ctx.integerValue("DescribeSecondaryPublicIpAddressesResponse.PageNumber"));
		describeSecondaryPublicIpAddressesResponse.setPageSize(_ctx.integerValue("DescribeSecondaryPublicIpAddressesResponse.PageSize"));
		describeSecondaryPublicIpAddressesResponse.setTotalCount(_ctx.integerValue("DescribeSecondaryPublicIpAddressesResponse.TotalCount"));

		List<Ip> secondaryPublicIpAddresses = new ArrayList<Ip>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecondaryPublicIpAddressesResponse.SecondaryPublicIpAddresses.Length"); i++) {
			Ip ip = new Ip();
			ip.setCidrMask(_ctx.integerValue("DescribeSecondaryPublicIpAddressesResponse.SecondaryPublicIpAddresses["+ i +"].CidrMask"));
			ip.setGateway(_ctx.stringValue("DescribeSecondaryPublicIpAddressesResponse.SecondaryPublicIpAddresses["+ i +"].Gateway"));
			ip.setSecondaryPublicIpAddress(_ctx.stringValue("DescribeSecondaryPublicIpAddressesResponse.SecondaryPublicIpAddresses["+ i +"].SecondaryPublicIpAddress"));
			ip.setIsp(_ctx.stringValue("DescribeSecondaryPublicIpAddressesResponse.SecondaryPublicIpAddresses["+ i +"].Isp"));
			ip.setSecondaryPublicIpId(_ctx.stringValue("DescribeSecondaryPublicIpAddressesResponse.SecondaryPublicIpAddresses["+ i +"].SecondaryPublicIpId"));
			ip.setEnsRegionId(_ctx.stringValue("DescribeSecondaryPublicIpAddressesResponse.SecondaryPublicIpAddresses["+ i +"].EnsRegionId"));
			ip.setCreationTime(_ctx.stringValue("DescribeSecondaryPublicIpAddressesResponse.SecondaryPublicIpAddresses["+ i +"].CreationTime"));
			ip.setIpVersion(_ctx.stringValue("DescribeSecondaryPublicIpAddressesResponse.SecondaryPublicIpAddresses["+ i +"].IpVersion"));

			secondaryPublicIpAddresses.add(ip);
		}
		describeSecondaryPublicIpAddressesResponse.setSecondaryPublicIpAddresses(secondaryPublicIpAddresses);
	 
	 	return describeSecondaryPublicIpAddressesResponse;
	}
}