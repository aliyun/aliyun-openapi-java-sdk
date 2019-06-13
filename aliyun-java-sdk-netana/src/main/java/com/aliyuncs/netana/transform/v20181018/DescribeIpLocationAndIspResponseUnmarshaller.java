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

import com.aliyuncs.netana.model.v20181018.DescribeIpLocationAndIspResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIpLocationAndIspResponseUnmarshaller {

	public static DescribeIpLocationAndIspResponse unmarshall(DescribeIpLocationAndIspResponse describeIpLocationAndIspResponse, UnmarshallerContext context) {
		
		describeIpLocationAndIspResponse.setRequestId(context.stringValue("DescribeIpLocationAndIspResponse.RequestId"));
		describeIpLocationAndIspResponse.setIpAddress(context.stringValue("DescribeIpLocationAndIspResponse.IpAddress"));
		describeIpLocationAndIspResponse.setCountry(context.stringValue("DescribeIpLocationAndIspResponse.Country"));
		describeIpLocationAndIspResponse.setCity(context.stringValue("DescribeIpLocationAndIspResponse.City"));
		describeIpLocationAndIspResponse.setISP(context.stringValue("DescribeIpLocationAndIspResponse.ISP"));
		describeIpLocationAndIspResponse.setCountryCode(context.stringValue("DescribeIpLocationAndIspResponse.CountryCode"));
		describeIpLocationAndIspResponse.setCityCode(context.stringValue("DescribeIpLocationAndIspResponse.CityCode"));
		describeIpLocationAndIspResponse.setISPCode(context.stringValue("DescribeIpLocationAndIspResponse.ISPCode"));
	 
	 	return describeIpLocationAndIspResponse;
	}
}