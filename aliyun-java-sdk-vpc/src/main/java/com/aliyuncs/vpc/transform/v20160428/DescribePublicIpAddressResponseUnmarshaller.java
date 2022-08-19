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

import com.aliyuncs.vpc.model.v20160428.DescribePublicIpAddressResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePublicIpAddressResponseUnmarshaller {

	public static DescribePublicIpAddressResponse unmarshall(DescribePublicIpAddressResponse describePublicIpAddressResponse, UnmarshallerContext _ctx) {
		
		describePublicIpAddressResponse.setRequestId(_ctx.stringValue("DescribePublicIpAddressResponse.RequestId"));
		describePublicIpAddressResponse.setSuccess(_ctx.booleanValue("DescribePublicIpAddressResponse.Success"));
		describePublicIpAddressResponse.setCode(_ctx.stringValue("DescribePublicIpAddressResponse.Code"));
		describePublicIpAddressResponse.setMessage(_ctx.stringValue("DescribePublicIpAddressResponse.Message"));
		describePublicIpAddressResponse.setPageSize(_ctx.integerValue("DescribePublicIpAddressResponse.PageSize"));
		describePublicIpAddressResponse.setPageNumber(_ctx.integerValue("DescribePublicIpAddressResponse.PageNumber"));
		describePublicIpAddressResponse.setTotalCount(_ctx.integerValue("DescribePublicIpAddressResponse.TotalCount"));
		describePublicIpAddressResponse.setRegionId(_ctx.stringValue("DescribePublicIpAddressResponse.RegionId"));
		describePublicIpAddressResponse.setPublicIpAddress(_ctx.stringValue("DescribePublicIpAddressResponse.PublicIpAddress"));

		List<String> ipRange = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribePublicIpAddressResponse.IpRange.Length"); i++) {
			ipRange.add(_ctx.stringValue("DescribePublicIpAddressResponse.IpRange["+ i +"]"));
		}
		describePublicIpAddressResponse.setIpRange(ipRange);
	 
	 	return describePublicIpAddressResponse;
	}
}