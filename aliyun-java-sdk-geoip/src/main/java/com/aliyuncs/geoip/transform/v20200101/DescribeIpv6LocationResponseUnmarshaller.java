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

package com.aliyuncs.geoip.transform.v20200101;

import com.aliyuncs.geoip.model.v20200101.DescribeIpv6LocationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIpv6LocationResponseUnmarshaller {

	public static DescribeIpv6LocationResponse unmarshall(DescribeIpv6LocationResponse describeIpv6LocationResponse, UnmarshallerContext _ctx) {
		
		describeIpv6LocationResponse.setRequestId(_ctx.stringValue("DescribeIpv6LocationResponse.RequestId"));
		describeIpv6LocationResponse.setIp(_ctx.stringValue("DescribeIpv6LocationResponse.Ip"));
		describeIpv6LocationResponse.setCountry(_ctx.stringValue("DescribeIpv6LocationResponse.Country"));
		describeIpv6LocationResponse.setProvince(_ctx.stringValue("DescribeIpv6LocationResponse.Province"));
		describeIpv6LocationResponse.setCity(_ctx.stringValue("DescribeIpv6LocationResponse.City"));
		describeIpv6LocationResponse.setCounty(_ctx.stringValue("DescribeIpv6LocationResponse.County"));
		describeIpv6LocationResponse.setIsp(_ctx.stringValue("DescribeIpv6LocationResponse.Isp"));
	 
	 	return describeIpv6LocationResponse;
	}
}