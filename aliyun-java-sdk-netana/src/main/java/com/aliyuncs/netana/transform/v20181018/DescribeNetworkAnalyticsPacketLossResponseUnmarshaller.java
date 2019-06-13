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

import com.aliyuncs.netana.model.v20181018.DescribeNetworkAnalyticsPacketLossResponse;
import com.aliyuncs.netana.model.v20181018.DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfo;
import com.aliyuncs.netana.model.v20181018.DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfo.Carrier;
import com.aliyuncs.netana.model.v20181018.DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfo.Country;
import com.aliyuncs.netana.model.v20181018.DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfo.Province;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNetworkAnalyticsPacketLossResponseUnmarshaller {

	public static DescribeNetworkAnalyticsPacketLossResponse unmarshall(DescribeNetworkAnalyticsPacketLossResponse describeNetworkAnalyticsPacketLossResponse, UnmarshallerContext context) {
		
		describeNetworkAnalyticsPacketLossResponse.setRequestId(context.stringValue("DescribeNetworkAnalyticsPacketLossResponse.RequestId"));
		describeNetworkAnalyticsPacketLossResponse.setTotalCount(context.integerValue("DescribeNetworkAnalyticsPacketLossResponse.TotalCount"));
		describeNetworkAnalyticsPacketLossResponse.setPageNumber(context.integerValue("DescribeNetworkAnalyticsPacketLossResponse.PageNumber"));
		describeNetworkAnalyticsPacketLossResponse.setPageSize(context.integerValue("DescribeNetworkAnalyticsPacketLossResponse.PageSize"));

		List<PacketLossInfo> packetLossInfos = new ArrayList<PacketLossInfo>();
		for (int i = 0; i < context.lengthValue("DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfos.Length"); i++) {
			PacketLossInfo packetLossInfo = new PacketLossInfo();
			packetLossInfo.setInBoundTotalPacket(context.stringValue("DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfos["+ i +"].InBoundTotalPacket"));
			packetLossInfo.setOutBoundTotalPacket(context.stringValue("DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfos["+ i +"].OutBoundTotalPacket"));
			packetLossInfo.setDataType(context.stringValue("DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfos["+ i +"].DataType"));
			packetLossInfo.setDateTime(context.stringValue("DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfos["+ i +"].DateTime"));
			packetLossInfo.setIp(context.stringValue("DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfos["+ i +"].Ip"));

			Country country = new Country();
			country.setCountryCode(context.stringValue("DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfos["+ i +"].Country.CountryCode"));
			country.setCountryCn(context.booleanValue("DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfos["+ i +"].Country.CountryCn"));
			country.setCountryEn(context.stringValue("DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfos["+ i +"].Country.CountryEn"));
			packetLossInfo.setCountry(country);

			Province province = new Province();
			province.setProvinceCode(context.stringValue("DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfos["+ i +"].Province.ProvinceCode"));
			province.setProvinceCn(context.booleanValue("DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfos["+ i +"].Province.ProvinceCn"));
			province.setProvinceEn(context.stringValue("DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfos["+ i +"].Province.ProvinceEn"));
			packetLossInfo.setProvince(province);

			Carrier carrier = new Carrier();
			carrier.setCarrierCode(context.stringValue("DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfos["+ i +"].Carrier.CarrierCode"));
			carrier.setCarrierCn(context.booleanValue("DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfos["+ i +"].Carrier.CarrierCn"));
			carrier.setCarrierEn(context.stringValue("DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfos["+ i +"].Carrier.CarrierEn"));
			packetLossInfo.setCarrier(carrier);

			packetLossInfos.add(packetLossInfo);
		}
		describeNetworkAnalyticsPacketLossResponse.setPacketLossInfos(packetLossInfos);
	 
	 	return describeNetworkAnalyticsPacketLossResponse;
	}
}