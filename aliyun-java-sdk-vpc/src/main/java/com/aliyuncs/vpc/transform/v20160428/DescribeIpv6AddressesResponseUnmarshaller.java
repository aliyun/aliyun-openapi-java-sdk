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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeIpv6AddressesResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeIpv6AddressesResponse.Ipv6Address;
import com.aliyuncs.vpc.model.v20160428.DescribeIpv6AddressesResponse.Ipv6Address.Ipv6InternetBandwidth;
import com.aliyuncs.vpc.model.v20160428.DescribeIpv6AddressesResponse.Ipv6Address.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIpv6AddressesResponseUnmarshaller {

	public static DescribeIpv6AddressesResponse unmarshall(DescribeIpv6AddressesResponse describeIpv6AddressesResponse, UnmarshallerContext _ctx) {
		
		describeIpv6AddressesResponse.setRequestId(_ctx.stringValue("DescribeIpv6AddressesResponse.RequestId"));
		describeIpv6AddressesResponse.setPageSize(_ctx.integerValue("DescribeIpv6AddressesResponse.PageSize"));
		describeIpv6AddressesResponse.setPageNumber(_ctx.integerValue("DescribeIpv6AddressesResponse.PageNumber"));
		describeIpv6AddressesResponse.setTotalCount(_ctx.integerValue("DescribeIpv6AddressesResponse.TotalCount"));

		List<Ipv6Address> ipv6Addresses = new ArrayList<Ipv6Address>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIpv6AddressesResponse.Ipv6Addresses.Length"); i++) {
			Ipv6Address ipv6Address = new Ipv6Address();
			ipv6Address.setVpcId(_ctx.stringValue("DescribeIpv6AddressesResponse.Ipv6Addresses["+ i +"].VpcId"));
			ipv6Address.setStatus(_ctx.stringValue("DescribeIpv6AddressesResponse.Ipv6Addresses["+ i +"].Status"));
			ipv6Address.setIpv6AddressId(_ctx.stringValue("DescribeIpv6AddressesResponse.Ipv6Addresses["+ i +"].Ipv6AddressId"));
			ipv6Address.setAllocationTime(_ctx.stringValue("DescribeIpv6AddressesResponse.Ipv6Addresses["+ i +"].AllocationTime"));
			ipv6Address.setIpv6AddressName(_ctx.stringValue("DescribeIpv6AddressesResponse.Ipv6Addresses["+ i +"].Ipv6AddressName"));
			ipv6Address.setIpv6AddressDescription(_ctx.stringValue("DescribeIpv6AddressesResponse.Ipv6Addresses["+ i +"].Ipv6AddressDescription"));
			ipv6Address.setAssociatedInstanceType(_ctx.stringValue("DescribeIpv6AddressesResponse.Ipv6Addresses["+ i +"].AssociatedInstanceType"));
			ipv6Address.setAssociatedInstanceId(_ctx.stringValue("DescribeIpv6AddressesResponse.Ipv6Addresses["+ i +"].AssociatedInstanceId"));
			ipv6Address.setNetworkType(_ctx.stringValue("DescribeIpv6AddressesResponse.Ipv6Addresses["+ i +"].NetworkType"));
			ipv6Address.setIpv6Address(_ctx.stringValue("DescribeIpv6AddressesResponse.Ipv6Addresses["+ i +"].Ipv6Address"));
			ipv6Address.setAddressType(_ctx.stringValue("DescribeIpv6AddressesResponse.Ipv6Addresses["+ i +"].AddressType"));
			ipv6Address.setIpv6Isp(_ctx.stringValue("DescribeIpv6AddressesResponse.Ipv6Addresses["+ i +"].Ipv6Isp"));
			ipv6Address.setVSwitchId(_ctx.stringValue("DescribeIpv6AddressesResponse.Ipv6Addresses["+ i +"].VSwitchId"));
			ipv6Address.setIpv6GatewayId(_ctx.stringValue("DescribeIpv6AddressesResponse.Ipv6Addresses["+ i +"].Ipv6GatewayId"));
			ipv6Address.setRealBandwidth(_ctx.integerValue("DescribeIpv6AddressesResponse.Ipv6Addresses["+ i +"].RealBandwidth"));
			ipv6Address.setResourceGroupId(_ctx.stringValue("DescribeIpv6AddressesResponse.Ipv6Addresses["+ i +"].ResourceGroupId"));
			ipv6Address.setServiceManaged(_ctx.integerValue("DescribeIpv6AddressesResponse.Ipv6Addresses["+ i +"].ServiceManaged"));

			Ipv6InternetBandwidth ipv6InternetBandwidth = new Ipv6InternetBandwidth();
			ipv6InternetBandwidth.setInternetChargeType(_ctx.stringValue("DescribeIpv6AddressesResponse.Ipv6Addresses["+ i +"].Ipv6InternetBandwidth.InternetChargeType"));
			ipv6InternetBandwidth.setBusinessStatus(_ctx.stringValue("DescribeIpv6AddressesResponse.Ipv6Addresses["+ i +"].Ipv6InternetBandwidth.BusinessStatus"));
			ipv6InternetBandwidth.setBandwidth(_ctx.integerValue("DescribeIpv6AddressesResponse.Ipv6Addresses["+ i +"].Ipv6InternetBandwidth.Bandwidth"));
			ipv6InternetBandwidth.setIpv6InternetBandwidthId(_ctx.stringValue("DescribeIpv6AddressesResponse.Ipv6Addresses["+ i +"].Ipv6InternetBandwidth.Ipv6InternetBandwidthId"));
			ipv6InternetBandwidth.setInstanceChargeType(_ctx.stringValue("DescribeIpv6AddressesResponse.Ipv6Addresses["+ i +"].Ipv6InternetBandwidth.InstanceChargeType"));
			ipv6InternetBandwidth.setHasReservationData(_ctx.booleanValue("DescribeIpv6AddressesResponse.Ipv6Addresses["+ i +"].Ipv6InternetBandwidth.HasReservationData"));
			ipv6InternetBandwidth.setReservationInternetChargeType(_ctx.stringValue("DescribeIpv6AddressesResponse.Ipv6Addresses["+ i +"].Ipv6InternetBandwidth.ReservationInternetChargeType"));
			ipv6InternetBandwidth.setReservationOrderType(_ctx.stringValue("DescribeIpv6AddressesResponse.Ipv6Addresses["+ i +"].Ipv6InternetBandwidth.ReservationOrderType"));
			ipv6InternetBandwidth.setReservationActiveTime(_ctx.stringValue("DescribeIpv6AddressesResponse.Ipv6Addresses["+ i +"].Ipv6InternetBandwidth.ReservationActiveTime"));
			ipv6InternetBandwidth.setReservationBandwidth(_ctx.longValue("DescribeIpv6AddressesResponse.Ipv6Addresses["+ i +"].Ipv6InternetBandwidth.ReservationBandwidth"));
			ipv6Address.setIpv6InternetBandwidth(ipv6InternetBandwidth);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeIpv6AddressesResponse.Ipv6Addresses["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeIpv6AddressesResponse.Ipv6Addresses["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeIpv6AddressesResponse.Ipv6Addresses["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			ipv6Address.setTags(tags);

			ipv6Addresses.add(ipv6Address);
		}
		describeIpv6AddressesResponse.setIpv6Addresses(ipv6Addresses);
	 
	 	return describeIpv6AddressesResponse;
	}
}