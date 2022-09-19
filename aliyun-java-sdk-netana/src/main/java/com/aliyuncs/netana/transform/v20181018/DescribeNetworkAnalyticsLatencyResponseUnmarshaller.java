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

	public static DescribeNetworkAnalyticsLatencyResponse unmarshall(DescribeNetworkAnalyticsLatencyResponse describeNetworkAnalyticsLatencyResponse, UnmarshallerContext _ctx) {
		
		describeNetworkAnalyticsLatencyResponse.setRequestId(_ctx.stringValue("DescribeNetworkAnalyticsLatencyResponse.RequestId"));
		describeNetworkAnalyticsLatencyResponse.setTotalCount(_ctx.integerValue("DescribeNetworkAnalyticsLatencyResponse.TotalCount"));
		describeNetworkAnalyticsLatencyResponse.setPageSize(_ctx.integerValue("DescribeNetworkAnalyticsLatencyResponse.PageSize"));
		describeNetworkAnalyticsLatencyResponse.setPageNumber(_ctx.integerValue("DescribeNetworkAnalyticsLatencyResponse.PageNumber"));

		List<RoundTripLatencyInfo> roundTripLatencies = new ArrayList<RoundTripLatencyInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencies.Length"); i++) {
			RoundTripLatencyInfo roundTripLatencyInfo = new RoundTripLatencyInfo();
			roundTripLatencyInfo.setDataType(_ctx.stringValue("DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencies["+ i +"].DataType"));
			roundTripLatencyInfo.setIp(_ctx.stringValue("DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencies["+ i +"].Ip"));
			roundTripLatencyInfo.setRoundTripLatency(_ctx.stringValue("DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencies["+ i +"].RoundTripLatency"));
			roundTripLatencyInfo.setDateTime(_ctx.stringValue("DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencies["+ i +"].DateTime"));

			Carrier carrier = new Carrier();
			carrier.setCarrierCode(_ctx.stringValue("DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencies["+ i +"].Carrier.CarrierCode"));
			carrier.setCarrierCn(_ctx.stringValue("DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencies["+ i +"].Carrier.CarrierCn"));
			carrier.setCarrierEn(_ctx.stringValue("DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencies["+ i +"].Carrier.CarrierEn"));
			roundTripLatencyInfo.setCarrier(carrier);

			Country country = new Country();
			country.setCountryCn(_ctx.stringValue("DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencies["+ i +"].Country.CountryCn"));
			country.setCountryEn(_ctx.stringValue("DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencies["+ i +"].Country.CountryEn"));
			country.setCountryCode(_ctx.stringValue("DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencies["+ i +"].Country.CountryCode"));
			roundTripLatencyInfo.setCountry(country);

			Province province = new Province();
			province.setProvinceCode(_ctx.stringValue("DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencies["+ i +"].Province.ProvinceCode"));
			province.setProvinceCn(_ctx.stringValue("DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencies["+ i +"].Province.ProvinceCn"));
			province.setProvinceEn(_ctx.stringValue("DescribeNetworkAnalyticsLatencyResponse.RoundTripLatencies["+ i +"].Province.ProvinceEn"));
			roundTripLatencyInfo.setProvince(province);

			roundTripLatencies.add(roundTripLatencyInfo);
		}
		describeNetworkAnalyticsLatencyResponse.setRoundTripLatencies(roundTripLatencies);
	 
	 	return describeNetworkAnalyticsLatencyResponse;
	}
}