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

import com.aliyuncs.vpc.model.v20160428.DescribeVpnGatewaysResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnGatewaysResponse.VpnGateway;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnGatewaysResponse.VpnGateway.ReservationData;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnGatewaysResponse.VpnGateway.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVpnGatewaysResponseUnmarshaller {

	public static DescribeVpnGatewaysResponse unmarshall(DescribeVpnGatewaysResponse describeVpnGatewaysResponse, UnmarshallerContext _ctx) {
		
		describeVpnGatewaysResponse.setRequestId(_ctx.stringValue("DescribeVpnGatewaysResponse.RequestId"));
		describeVpnGatewaysResponse.setPageSize(_ctx.integerValue("DescribeVpnGatewaysResponse.PageSize"));
		describeVpnGatewaysResponse.setPageNumber(_ctx.integerValue("DescribeVpnGatewaysResponse.PageNumber"));
		describeVpnGatewaysResponse.setTotalCount(_ctx.integerValue("DescribeVpnGatewaysResponse.TotalCount"));

		List<VpnGateway> vpnGateways = new ArrayList<VpnGateway>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpnGatewaysResponse.VpnGateways.Length"); i++) {
			VpnGateway vpnGateway = new VpnGateway();
			vpnGateway.setVpnType(_ctx.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].VpnType"));
			vpnGateway.setStatus(_ctx.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].Status"));
			vpnGateway.setVpcId(_ctx.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].VpcId"));
			vpnGateway.setSslMaxConnections(_ctx.longValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].SslMaxConnections"));
			vpnGateway.setSpec(_ctx.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].Spec"));
			vpnGateway.setInternetIp(_ctx.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].InternetIp"));
			vpnGateway.setCreateTime(_ctx.longValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].CreateTime"));
			vpnGateway.setAutoPropagate(_ctx.booleanValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].AutoPropagate"));
			vpnGateway.setChargeType(_ctx.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].ChargeType"));
			vpnGateway.setVpnGatewayId(_ctx.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].VpnGatewayId"));
			vpnGateway.setTag(_ctx.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].Tag"));
			vpnGateway.setIpsecVpn(_ctx.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].IpsecVpn"));
			vpnGateway.setEndTime(_ctx.longValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].EndTime"));
			vpnGateway.setVSwitchId(_ctx.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].VSwitchId"));
			vpnGateway.setDescription(_ctx.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].Description"));
			vpnGateway.setEnableBgp(_ctx.booleanValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].EnableBgp"));
			vpnGateway.setBusinessStatus(_ctx.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].BusinessStatus"));
			vpnGateway.setSslVpn(_ctx.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].SslVpn"));
			vpnGateway.setName(_ctx.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].Name"));
			vpnGateway.setNetworkType(_ctx.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].NetworkType"));
			vpnGateway.setDisasterRecoveryInternetIp(_ctx.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].DisasterRecoveryInternetIp"));
			vpnGateway.setDisasterRecoveryVSwitchId(_ctx.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].DisasterRecoveryVSwitchId"));
			vpnGateway.setSslVpnInternetIp(_ctx.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].SslVpnInternetIp"));
			vpnGateway.setResourceGroupId(_ctx.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].ResourceGroupId"));

			List<String> eniInstanceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].EniInstanceIds.Length"); j++) {
				eniInstanceIds.add(_ctx.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].EniInstanceIds["+ j +"]"));
			}
			vpnGateway.setEniInstanceIds(eniInstanceIds);

			ReservationData reservationData = new ReservationData();
			reservationData.setStatus(_ctx.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].ReservationData.Status"));
			reservationData.setReservationOrderType(_ctx.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].ReservationData.ReservationOrderType"));
			reservationData.setReservationIpsec(_ctx.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].ReservationData.ReservationIpsec"));
			reservationData.setReservationSpec(_ctx.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].ReservationData.ReservationSpec"));
			reservationData.setReservationSsl(_ctx.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].ReservationData.ReservationSsl"));
			reservationData.setReservationMaxConnections(_ctx.integerValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].ReservationData.ReservationMaxConnections"));
			reservationData.setReservationEndTime(_ctx.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].ReservationData.ReservationEndTime"));
			vpnGateway.setReservationData(reservationData);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			vpnGateway.setTags(tags);

			vpnGateways.add(vpnGateway);
		}
		describeVpnGatewaysResponse.setVpnGateways(vpnGateways);
	 
	 	return describeVpnGatewaysResponse;
	}
}