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

	public static DescribeNetworkAnalyticsPacketLossResponse unmarshall(DescribeNetworkAnalyticsPacketLossResponse describeNetworkAnalyticsPacketLossResponse, UnmarshallerContext _ctx) {
		
		describeNetworkAnalyticsPacketLossResponse.setRequestId(_ctx.stringValue("DescribeNetworkAnalyticsPacketLossResponse.RequestId"));
		describeNetworkAnalyticsPacketLossResponse.setTotalCount(_ctx.integerValue("DescribeNetworkAnalyticsPacketLossResponse.TotalCount"));
		describeNetworkAnalyticsPacketLossResponse.setPageSize(_ctx.integerValue("DescribeNetworkAnalyticsPacketLossResponse.PageSize"));
		describeNetworkAnalyticsPacketLossResponse.setPageNumber(_ctx.integerValue("DescribeNetworkAnalyticsPacketLossResponse.PageNumber"));

		List<PacketLossInfo> packetLossInfos = new ArrayList<PacketLossInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfos.Length"); i++) {
			PacketLossInfo packetLossInfo = new PacketLossInfo();
			packetLossInfo.setDataType(_ctx.stringValue("DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfos["+ i +"].DataType"));
			packetLossInfo.setOutBoundTotalPacket(_ctx.stringValue("DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfos["+ i +"].OutBoundTotalPacket"));
			packetLossInfo.setInBoundTotalPacket(_ctx.stringValue("DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfos["+ i +"].InBoundTotalPacket"));
			packetLossInfo.setIp(_ctx.stringValue("DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfos["+ i +"].Ip"));
			packetLossInfo.setDateTime(_ctx.stringValue("DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfos["+ i +"].DateTime"));

			Carrier carrier = new Carrier();
			carrier.setCarrierCode(_ctx.stringValue("DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfos["+ i +"].Carrier.CarrierCode"));
			carrier.setCarrierCn(_ctx.stringValue("DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfos["+ i +"].Carrier.CarrierCn"));
			carrier.setCarrierEn(_ctx.stringValue("DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfos["+ i +"].Carrier.CarrierEn"));
			packetLossInfo.setCarrier(carrier);

			Country country = new Country();
			country.setCountryCn(_ctx.stringValue("DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfos["+ i +"].Country.CountryCn"));
			country.setCountryEn(_ctx.stringValue("DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfos["+ i +"].Country.CountryEn"));
			country.setCountryCode(_ctx.stringValue("DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfos["+ i +"].Country.CountryCode"));
			packetLossInfo.setCountry(country);

			Province province = new Province();
			province.setProvinceCode(_ctx.stringValue("DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfos["+ i +"].Province.ProvinceCode"));
			province.setProvinceCn(_ctx.stringValue("DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfos["+ i +"].Province.ProvinceCn"));
			province.setProvinceEn(_ctx.stringValue("DescribeNetworkAnalyticsPacketLossResponse.PacketLossInfos["+ i +"].Province.ProvinceEn"));
			packetLossInfo.setProvince(province);

			packetLossInfos.add(packetLossInfo);
		}
		describeNetworkAnalyticsPacketLossResponse.setPacketLossInfos(packetLossInfos);
	 
	 	return describeNetworkAnalyticsPacketLossResponse;
	}
}