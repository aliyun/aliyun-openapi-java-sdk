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

	public static DescribeNetworkAnalyticsNetQualityResponse unmarshall(DescribeNetworkAnalyticsNetQualityResponse describeNetworkAnalyticsNetQualityResponse, UnmarshallerContext _ctx) {
		
		describeNetworkAnalyticsNetQualityResponse.setRequestId(_ctx.stringValue("DescribeNetworkAnalyticsNetQualityResponse.RequestId"));
		describeNetworkAnalyticsNetQualityResponse.setTotalCount(_ctx.integerValue("DescribeNetworkAnalyticsNetQualityResponse.TotalCount"));
		describeNetworkAnalyticsNetQualityResponse.setPageSize(_ctx.integerValue("DescribeNetworkAnalyticsNetQualityResponse.PageSize"));
		describeNetworkAnalyticsNetQualityResponse.setPageNumber(_ctx.integerValue("DescribeNetworkAnalyticsNetQualityResponse.PageNumber"));

		List<NetQuality> netQualities = new ArrayList<NetQuality>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkAnalyticsNetQualityResponse.NetQualities.Length"); i++) {
			NetQuality netQuality = new NetQuality();
			netQuality.setDataType(_ctx.stringValue("DescribeNetworkAnalyticsNetQualityResponse.NetQualities["+ i +"].DataType"));
			netQuality.setRoundTripLatency(_ctx.stringValue("DescribeNetworkAnalyticsNetQualityResponse.NetQualities["+ i +"].RoundTripLatency"));
			netQuality.setNetLevel(_ctx.stringValue("DescribeNetworkAnalyticsNetQualityResponse.NetQualities["+ i +"].NetLevel"));
			netQuality.setDateTime(_ctx.stringValue("DescribeNetworkAnalyticsNetQualityResponse.NetQualities["+ i +"].DateTime"));

			Carrier carrier = new Carrier();
			carrier.setCarrierCode(_ctx.stringValue("DescribeNetworkAnalyticsNetQualityResponse.NetQualities["+ i +"].Carrier.CarrierCode"));
			carrier.setCarrierCn(_ctx.stringValue("DescribeNetworkAnalyticsNetQualityResponse.NetQualities["+ i +"].Carrier.CarrierCn"));
			carrier.setCarrierEn(_ctx.stringValue("DescribeNetworkAnalyticsNetQualityResponse.NetQualities["+ i +"].Carrier.CarrierEn"));
			netQuality.setCarrier(carrier);

			Country country = new Country();
			country.setCountryCn(_ctx.stringValue("DescribeNetworkAnalyticsNetQualityResponse.NetQualities["+ i +"].Country.CountryCn"));
			country.setCountryEn(_ctx.stringValue("DescribeNetworkAnalyticsNetQualityResponse.NetQualities["+ i +"].Country.CountryEn"));
			country.setCountryCode(_ctx.stringValue("DescribeNetworkAnalyticsNetQualityResponse.NetQualities["+ i +"].Country.CountryCode"));
			netQuality.setCountry(country);

			Province province = new Province();
			province.setProvinceCode(_ctx.stringValue("DescribeNetworkAnalyticsNetQualityResponse.NetQualities["+ i +"].Province.ProvinceCode"));
			province.setProvinceCn(_ctx.stringValue("DescribeNetworkAnalyticsNetQualityResponse.NetQualities["+ i +"].Province.ProvinceCn"));
			province.setProvinceEn(_ctx.stringValue("DescribeNetworkAnalyticsNetQualityResponse.NetQualities["+ i +"].Province.ProvinceEn"));
			netQuality.setProvince(province);

			netQualities.add(netQuality);
		}
		describeNetworkAnalyticsNetQualityResponse.setNetQualities(netQualities);
	 
	 	return describeNetworkAnalyticsNetQualityResponse;
	}
}