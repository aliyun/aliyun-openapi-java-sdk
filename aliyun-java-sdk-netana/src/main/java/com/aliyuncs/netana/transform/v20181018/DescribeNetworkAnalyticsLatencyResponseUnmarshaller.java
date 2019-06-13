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

import com.aliyuncs.netana.model.v20181018.DescribeNetworkAnalyticsLatencyResponse;
import com.aliyuncs.netana.model.v20181018.DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencyInfo;
import com.aliyuncs.netana.model.v20181018.DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencyInfo.Carrier;
import com.aliyuncs.netana.model.v20181018.DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencyInfo.Country;
import com.aliyuncs.netana.model.v20181018.DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencyInfo.Province;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNetworkAnalyticsLatencyResponseUnmarshaller {

	public static DescribeNetworkAnalyticsLatencyResponse unmarshall(DescribeNetworkAnalyticsLatencyResponse describeNetworkAnalyticsLatencyResponse, UnmarshallerContext context) {
		
		describeNetworkAnalyticsLatencyResponse.setRequestId(context.stringValue("DescribeNetworkAnalyticsLatencyResponse.RequestId"));
		describeNetworkAnalyticsLatencyResponse.setTotalCount(context.integerValue("DescribeNetworkAnalyticsLatencyResponse.TotalCount"));
		describeNetworkAnalyticsLatencyResponse.setPageNumber(context.integerValue("DescribeNetworkAnalyticsLatencyResponse.PageNumber"));
		describeNetworkAnalyticsLatencyResponse.setPageSize(context.integerValue("DescribeNetworkAnalyticsLatencyResponse.PageSize"));

		List<RoundTripLatencyInfo> roundTripLatencies = new ArrayList<RoundTripLatencyInfo>();
		for (int i = 0; i < context.lengthValue("DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencies.Length"); i++) {
			RoundTripLatencyInfo roundTripLatencyInfo = new RoundTripLatencyInfo();
			roundTripLatencyInfo.setRoundTripLatency(context.stringValue("DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencies["+ i +"].RoundTripLatency"));
			roundTripLatencyInfo.setDataType(context.stringValue("DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencies["+ i +"].DataType"));
			roundTripLatencyInfo.setDateTime(context.stringValue("DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencies["+ i +"].DateTime"));
			roundTripLatencyInfo.setIp(context.stringValue("DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencies["+ i +"].Ip"));

			Country country = new Country();
			country.setCountryCode(context.stringValue("DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencies["+ i +"].Country.CountryCode"));
			country.setCountryCn(context.booleanValue("DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencies["+ i +"].Country.CountryCn"));
			country.setCountryEn(context.stringValue("DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencies["+ i +"].Country.CountryEn"));
			roundTripLatencyInfo.setCountry(country);

			Province province = new Province();
			province.setProvinceCode(context.stringValue("DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencies["+ i +"].Province.ProvinceCode"));
			province.setProvinceCn(context.booleanValue("DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencies["+ i +"].Province.ProvinceCn"));
			province.setProvinceEn(context.stringValue("DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencies["+ i +"].Province.ProvinceEn"));
			roundTripLatencyInfo.setProvince(province);

			Carrier carrier = new Carrier();
			carrier.setCarrierCode(context.stringValue("DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencies["+ i +"].Carrier.CarrierCode"));
			carrier.setCarrierCn(context.booleanValue("DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencies["+ i +"].Carrier.CarrierCn"));
			carrier.setCarrierEn(context.stringValue("DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencies["+ i +"].Carrier.CarrierEn"));
			roundTripLatencyInfo.setCarrier(carrier);

			roundTripLatencies.add(roundTripLatencyInfo);
		}
		describeNetworkAnalyticsLatencyResponse.setRoundTripLatencies(roundTripLatencies);
	 
	 	return describeNetworkAnalyticsLatencyResponse;
	}
}