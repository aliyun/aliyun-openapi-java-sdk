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

import com.aliyuncs.netana.model.v20181018.DescribeNetworkAnalyticsDataTransferResponse;
import com.aliyuncs.netana.model.v20181018.DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfo;
import com.aliyuncs.netana.model.v20181018.DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfo.Carrier;
import com.aliyuncs.netana.model.v20181018.DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfo.Country;
import com.aliyuncs.netana.model.v20181018.DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfo.Province;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNetworkAnalyticsDataTransferResponseUnmarshaller {

	public static DescribeNetworkAnalyticsDataTransferResponse unmarshall(DescribeNetworkAnalyticsDataTransferResponse describeNetworkAnalyticsDataTransferResponse, UnmarshallerContext _ctx) {
		
		describeNetworkAnalyticsDataTransferResponse.setRequestId(_ctx.stringValue("DescribeNetworkAnalyticsDataTransferResponse.RequestId"));
		describeNetworkAnalyticsDataTransferResponse.setTotalCount(_ctx.integerValue("DescribeNetworkAnalyticsDataTransferResponse.TotalCount"));
		describeNetworkAnalyticsDataTransferResponse.setPageSize(_ctx.integerValue("DescribeNetworkAnalyticsDataTransferResponse.PageSize"));
		describeNetworkAnalyticsDataTransferResponse.setPageNumber(_ctx.integerValue("DescribeNetworkAnalyticsDataTransferResponse.PageNumber"));

		List<DataTransferInfo> dataTransferInfos = new ArrayList<DataTransferInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfos.Length"); i++) {
			DataTransferInfo dataTransferInfo = new DataTransferInfo();
			dataTransferInfo.setDataType(_ctx.stringValue("DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfos["+ i +"].DataType"));
			dataTransferInfo.setIp(_ctx.stringValue("DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfos["+ i +"].Ip"));
			dataTransferInfo.setInBoundTotalBytes(_ctx.stringValue("DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfos["+ i +"].InBoundTotalBytes"));
			dataTransferInfo.setOutBoundTotalBytes(_ctx.stringValue("DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfos["+ i +"].OutBoundTotalBytes"));
			dataTransferInfo.setDateTime(_ctx.stringValue("DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfos["+ i +"].DateTime"));

			Carrier carrier = new Carrier();
			carrier.setCarrierCode(_ctx.stringValue("DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfos["+ i +"].Carrier.CarrierCode"));
			carrier.setCarrierCn(_ctx.stringValue("DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfos["+ i +"].Carrier.CarrierCn"));
			carrier.setCarrierEn(_ctx.stringValue("DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfos["+ i +"].Carrier.CarrierEn"));
			dataTransferInfo.setCarrier(carrier);

			Country country = new Country();
			country.setCountryCn(_ctx.stringValue("DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfos["+ i +"].Country.CountryCn"));
			country.setCountryEn(_ctx.stringValue("DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfos["+ i +"].Country.CountryEn"));
			country.setCountryCode(_ctx.stringValue("DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfos["+ i +"].Country.CountryCode"));
			dataTransferInfo.setCountry(country);

			Province province = new Province();
			province.setProvinceCode(_ctx.stringValue("DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfos["+ i +"].Province.ProvinceCode"));
			province.setProvinceCn(_ctx.stringValue("DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfos["+ i +"].Province.ProvinceCn"));
			province.setProvinceEn(_ctx.stringValue("DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfos["+ i +"].Province.ProvinceEn"));
			dataTransferInfo.setProvince(province);

			dataTransferInfos.add(dataTransferInfo);
		}
		describeNetworkAnalyticsDataTransferResponse.setDataTransferInfos(dataTransferInfos);
	 
	 	return describeNetworkAnalyticsDataTransferResponse;
	}
}