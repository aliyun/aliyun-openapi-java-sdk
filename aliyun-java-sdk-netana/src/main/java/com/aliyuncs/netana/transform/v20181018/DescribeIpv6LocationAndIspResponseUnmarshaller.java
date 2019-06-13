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

	public static DescribeIpv6LocationAndIspResponse unmarshall(DescribeIpv6LocationAndIspResponse describeIpv6LocationAndIspResponse, UnmarshallerContext context) {
		
		describeIpv6LocationAndIspResponse.setRequestId(context.stringValue("DescribeIpv6LocationAndIspResponse.RequestId"));
		describeIpv6LocationAndIspResponse.setIpAddress(context.stringValue("DescribeIpv6LocationAndIspResponse.IpAddress"));
		describeIpv6LocationAndIspResponse.setCountry(context.stringValue("DescribeIpv6LocationAndIspResponse.Country"));
		describeIpv6LocationAndIspResponse.setCity(context.stringValue("DescribeIpv6LocationAndIspResponse.City"));
		describeIpv6LocationAndIspResponse.setISP(context.stringValue("DescribeIpv6LocationAndIspResponse.ISP"));
		describeIpv6LocationAndIspResponse.setCountryCode(context.stringValue("DescribeIpv6LocationAndIspResponse.CountryCode"));
		describeIpv6LocationAndIspResponse.setCityCode(context.stringValue("DescribeIpv6LocationAndIspResponse.CityCode"));
		describeIpv6LocationAndIspResponse.setISPCode(context.stringValue("DescribeIpv6LocationAndIspResponse.ISPCode"));
	 
	 	return describeIpv6LocationAndIspResponse;
	}
}