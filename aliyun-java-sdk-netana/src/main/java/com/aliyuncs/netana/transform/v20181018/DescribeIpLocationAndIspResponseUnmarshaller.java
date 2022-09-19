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

	public static DescribeIpLocationAndIspResponse unmarshall(DescribeIpLocationAndIspResponse describeIpLocationAndIspResponse, UnmarshallerContext _ctx) {
		
		describeIpLocationAndIspResponse.setRequestId(_ctx.stringValue("DescribeIpLocationAndIspResponse.RequestId"));
		describeIpLocationAndIspResponse.setCityCode(_ctx.stringValue("DescribeIpLocationAndIspResponse.CityCode"));
		describeIpLocationAndIspResponse.setISPCode(_ctx.stringValue("DescribeIpLocationAndIspResponse.ISPCode"));
		describeIpLocationAndIspResponse.setISP(_ctx.stringValue("DescribeIpLocationAndIspResponse.ISP"));
		describeIpLocationAndIspResponse.setCountry(_ctx.stringValue("DescribeIpLocationAndIspResponse.Country"));
		describeIpLocationAndIspResponse.setIpAddress(_ctx.stringValue("DescribeIpLocationAndIspResponse.IpAddress"));
		describeIpLocationAndIspResponse.setCity(_ctx.stringValue("DescribeIpLocationAndIspResponse.City"));
		describeIpLocationAndIspResponse.setCountryCode(_ctx.stringValue("DescribeIpLocationAndIspResponse.CountryCode"));
	 
	 	return describeIpLocationAndIspResponse;
	}
}