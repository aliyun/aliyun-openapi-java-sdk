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

	public static DescribeNetworkAnalyticsDataTransferResponse unmarshall(DescribeNetworkAnalyticsDataTransferResponse describeNetworkAnalyticsDataTransferResponse, UnmarshallerContext context) {
		
		describeNetworkAnalyticsDataTransferResponse.setRequestId(context.stringValue("DescribeNetworkAnalyticsDataTransferResponse.RequestId"));
		describeNetworkAnalyticsDataTransferResponse.setTotalCount(context.integerValue("DescribeNetworkAnalyticsDataTransferResponse.TotalCount"));
		describeNetworkAnalyticsDataTransferResponse.setPageNumber(context.integerValue("DescribeNetworkAnalyticsDataTransferResponse.PageNumber"));
		describeNetworkAnalyticsDataTransferResponse.setPageSize(context.integerValue("DescribeNetworkAnalyticsDataTransferResponse.PageSize"));

		List<DataTransferInfo> dataTransferInfos = new ArrayList<DataTransferInfo>();
		for (int i = 0; i < context.lengthValue("DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfos.Length"); i++) {
			DataTransferInfo dataTransferInfo = new DataTransferInfo();
			dataTransferInfo.setInBoundTotalBytes(context.stringValue("DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfos["+ i +"].InBoundTotalBytes"));
			dataTransferInfo.setOutBoundTotalBytes(context.stringValue("DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfos["+ i +"].OutBoundTotalBytes"));
			dataTransferInfo.setDataType(context.stringValue("DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfos["+ i +"].DataType"));
			dataTransferInfo.setDateTime(context.stringValue("DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfos["+ i +"].DateTime"));
			dataTransferInfo.setIp(context.stringValue("DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfos["+ i +"].Ip"));

			Country country = new Country();
			country.setCountryCode(context.stringValue("DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfos["+ i +"].Country.CountryCode"));
			country.setCountryCn(context.booleanValue("DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfos["+ i +"].Country.CountryCn"));
			country.setCountryEn(context.stringValue("DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfos["+ i +"].Country.CountryEn"));
			dataTransferInfo.setCountry(country);

			Province province = new Province();
			province.setProvinceCode(context.stringValue("DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfos["+ i +"].Province.ProvinceCode"));
			province.setProvinceCn(context.booleanValue("DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfos["+ i +"].Province.ProvinceCn"));
			province.setProvinceEn(context.stringValue("DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfos["+ i +"].Province.ProvinceEn"));
			dataTransferInfo.setProvince(province);

			Carrier carrier = new Carrier();
			carrier.setCarrierCode(context.stringValue("DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfos["+ i +"].Carrier.CarrierCode"));
			carrier.setCarrierCn(context.booleanValue("DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfos["+ i +"].Carrier.CarrierCn"));
			carrier.setCarrierEn(context.stringValue("DescribeNetworkAnalyticsDataTransferResponse.DataTransferInfos["+ i +"].Carrier.CarrierEn"));
			dataTransferInfo.setCarrier(carrier);

			dataTransferInfos.add(dataTransferInfo);
		}
		describeNetworkAnalyticsDataTransferResponse.setDataTransferInfos(dataTransferInfos);
	 
	 	return describeNetworkAnalyticsDataTransferResponse;
	}
}