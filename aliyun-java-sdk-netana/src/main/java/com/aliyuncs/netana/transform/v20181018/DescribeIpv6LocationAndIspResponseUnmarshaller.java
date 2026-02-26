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

package com.aliyuncs.netana.transform.v20181018;

import com.aliyuncs.netana.model.v20181018.DescribeIpv6LocationAndIspResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIpv6LocationAndIspResponseUnmarshaller {

	public static DescribeIpv6LocationAndIspResponse unmarshall(DescribeIpv6LocationAndIspResponse describeIpv6LocationAndIspResponse, UnmarshallerContext _ctx) {
		
		describeIpv6LocationAndIspResponse.setRequestId(_ctx.stringValue("DescribeIpv6LocationAndIspResponse.RequestId"));
		describeIpv6LocationAndIspResponse.setCityCode(_ctx.stringValue("DescribeIpv6LocationAndIspResponse.CityCode"));
		describeIpv6LocationAndIspResponse.setISPCode(_ctx.stringValue("DescribeIpv6LocationAndIspResponse.ISPCode"));
		describeIpv6LocationAndIspResponse.setISP(_ctx.stringValue("DescribeIpv6LocationAndIspResponse.ISP"));
		describeIpv6LocationAndIspResponse.setCountry(_ctx.stringValue("DescribeIpv6LocationAndIspResponse.Country"));
		describeIpv6LocationAndIspResponse.setIpAddress(_ctx.stringValue("DescribeIpv6LocationAndIspResponse.IpAddress"));
		describeIpv6LocationAndIspResponse.setCity(_ctx.stringValue("DescribeIpv6LocationAndIspResponse.City"));
		describeIpv6LocationAndIspResponse.setCountryCode(_ctx.stringValue("DescribeIpv6LocationAndIspResponse.CountryCode"));
	 
	 	return describeIpv6LocationAndIspResponse;
	}
}