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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.netana.model.v20181018.DescribeNetworkAnalyticsNetQualityResponse;
import com.aliyuncs.netana.model.v20181018.DescribeNetworkAnalyticsNetQualityResponse.NetQuality;
import com.aliyuncs.netana.model.v20181018.DescribeNetworkAnalyticsNetQualityResponse.NetQuality.Carrier;
import com.aliyuncs.netana.model.v20181018.DescribeNetworkAnalyticsNetQualityResponse.NetQuality.Country;
import com.aliyuncs.netana.model.v20181018.DescribeNetworkAnalyticsNetQualityResponse.NetQuality.Province;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNetworkAnalyticsNetQualityResponseUnmarshaller {

	public static DescribeNetworkAnalyticsNetQualityResponse unmarshall(DescribeNetworkAnalyticsNetQualityResponse describeNetworkAnalyticsNetQualityResponse, UnmarshallerContext context) {
		
		describeNetworkAnalyticsNetQualityResponse.setRequestId(context.stringValue("DescribeNetworkAnalyticsNetQualityResponse.RequestId"));
		describeNetworkAnalyticsNetQualityResponse.setTotalCount(context.integerValue("DescribeNetworkAnalyticsNetQualityResponse.TotalCount"));
		describeNetworkAnalyticsNetQualityResponse.setPageNumber(context.integerValue("DescribeNetworkAnalyticsNetQualityResponse.PageNumber"));
		describeNetworkAnalyticsNetQualityResponse.setPageSize(context.integerValue("DescribeNetworkAnalyticsNetQualityResponse.PageSize"));

		List<NetQuality> netQualities = new ArrayList<NetQuality>();
		for (int i = 0; i < context.lengthValue("DescribeNetworkAnalyticsNetQualityResponse.NetQualities.Length"); i++) {
			NetQuality netQuality = new NetQuality();
			netQuality.setRoundTripLatency(context.stringValue("DescribeNetworkAnalyticsNetQualityResponse.NetQualities["+ i +"].RoundTripLatency"));
			netQuality.setNetLevel(context.stringValue("DescribeNetworkAnalyticsNetQualityResponse.NetQualities["+ i +"].NetLevel"));
			netQuality.setDataType(context.stringValue("DescribeNetworkAnalyticsNetQualityResponse.NetQualities["+ i +"].DataType"));
			netQuality.setDateTime(context.stringValue("DescribeNetworkAnalyticsNetQualityResponse.NetQualities["+ i +"].DateTime"));

			Country country = new Country();
			country.setCountryCode(context.stringValue("DescribeNetworkAnalyticsNetQualityResponse.NetQualities["+ i +"].Country.CountryCode"));
			country.setCountryCn(context.booleanValue("DescribeNetworkAnalyticsNetQualityResponse.NetQualities["+ i +"].Country.CountryCn"));
			country.setCountryEn(context.stringValue("DescribeNetworkAnalyticsNetQualityResponse.NetQualities["+ i +"].Country.CountryEn"));
			netQuality.setCountry(country);

			Province province = new Province();
			province.setProvinceCode(context.stringValue("DescribeNetworkAnalyticsNetQualityResponse.NetQualities["+ i +"].Province.ProvinceCode"));
			province.setProvinceCn(context.booleanValue("DescribeNetworkAnalyticsNetQualityResponse.NetQualities["+ i +"].Province.ProvinceCn"));
			province.setProvinceEn(context.stringValue("DescribeNetworkAnalyticsNetQualityResponse.NetQualities["+ i +"].Province.ProvinceEn"));
			netQuality.setProvince(province);

			Carrier carrier = new Carrier();
			carrier.setCarrierCode(context.stringValue("DescribeNetworkAnalyticsNetQualityResponse.NetQualities["+ i +"].Carrier.CarrierCode"));
			carrier.setCarrierCn(context.booleanValue("DescribeNetworkAnalyticsNetQualityResponse.NetQualities["+ i +"].Carrier.CarrierCn"));
			carrier.setCarrierEn(context.stringValue("DescribeNetworkAnalyticsNetQualityResponse.NetQualities["+ i +"].Carrier.CarrierEn"));
			netQuality.setCarrier(carrier);

			netQualities.add(netQuality);
		}
		describeNetworkAnalyticsNetQualityResponse.setNetQualities(netQualities);
	 
	 	return describeNetworkAnalyticsNetQualityResponse;
	}
}