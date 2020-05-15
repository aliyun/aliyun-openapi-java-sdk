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

import com.aliyuncs.geoip.model.v20200101.DescribeIpv4LocationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIpv4LocationResponseUnmarshaller {

	public static DescribeIpv4LocationResponse unmarshall(DescribeIpv4LocationResponse describeIpv4LocationResponse, UnmarshallerContext _ctx) {
		
		describeIpv4LocationResponse.setRequestId(_ctx.stringValue("DescribeIpv4LocationResponse.RequestId"));
		describeIpv4LocationResponse.setIp(_ctx.stringValue("DescribeIpv4LocationResponse.Ip"));
		describeIpv4LocationResponse.setCountry(_ctx.stringValue("DescribeIpv4LocationResponse.Country"));
		describeIpv4LocationResponse.setProvince(_ctx.stringValue("DescribeIpv4LocationResponse.Province"));
		describeIpv4LocationResponse.setCity(_ctx.stringValue("DescribeIpv4LocationResponse.City"));
		describeIpv4LocationResponse.setCounty(_ctx.stringValue("DescribeIpv4LocationResponse.County"));
		describeIpv4LocationResponse.setIsp(_ctx.stringValue("DescribeIpv4LocationResponse.Isp"));
		describeIpv4LocationResponse.setCountryCode(_ctx.stringValue("DescribeIpv4LocationResponse.CountryCode"));
		describeIpv4LocationResponse.setCountryEn(_ctx.stringValue("DescribeIpv4LocationResponse.CountryEn"));
		describeIpv4LocationResponse.setProvinceEn(_ctx.stringValue("DescribeIpv4LocationResponse.ProvinceEn"));
		describeIpv4LocationResponse.setCityEn(_ctx.stringValue("DescribeIpv4LocationResponse.CityEn"));
		describeIpv4LocationResponse.setLongitude(_ctx.stringValue("DescribeIpv4LocationResponse.Longitude"));
		describeIpv4LocationResponse.setLatitude(_ctx.stringValue("DescribeIpv4LocationResponse.Latitude"));
	 
	 	return describeIpv4LocationResponse;
	}
}