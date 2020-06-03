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

import com.aliyuncs.vpc.model.v20160428.DescribeVpnGatewayResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnGatewayResponse.ReservationData;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnGatewayResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVpnGatewayResponseUnmarshaller {

	public static DescribeVpnGatewayResponse unmarshall(DescribeVpnGatewayResponse describeVpnGatewayResponse, UnmarshallerContext _ctx) {
		
		describeVpnGatewayResponse.setRequestId(_ctx.stringValue("DescribeVpnGatewayResponse.RequestId"));
		describeVpnGatewayResponse.setVpnGatewayId(_ctx.stringValue("DescribeVpnGatewayResponse.VpnGatewayId"));
		describeVpnGatewayResponse.setVpcId(_ctx.stringValue("DescribeVpnGatewayResponse.VpcId"));
		describeVpnGatewayResponse.setVSwitchId(_ctx.stringValue("DescribeVpnGatewayResponse.VSwitchId"));
		describeVpnGatewayResponse.setInternetIp(_ctx.stringValue("DescribeVpnGatewayResponse.InternetIp"));
		describeVpnGatewayResponse.setCreateTime(_ctx.longValue("DescribeVpnGatewayResponse.CreateTime"));
		describeVpnGatewayResponse.setEndTime(_ctx.longValue("DescribeVpnGatewayResponse.EndTime"));
		describeVpnGatewayResponse.setSpec(_ctx.stringValue("DescribeVpnGatewayResponse.Spec"));
		describeVpnGatewayResponse.setName(_ctx.stringValue("DescribeVpnGatewayResponse.Name"));
		describeVpnGatewayResponse.setDescription(_ctx.stringValue("DescribeVpnGatewayResponse.Description"));
		describeVpnGatewayResponse.setStatus(_ctx.stringValue("DescribeVpnGatewayResponse.Status"));
		describeVpnGatewayResponse.setBusinessStatus(_ctx.stringValue("DescribeVpnGatewayResponse.BusinessStatus"));
		describeVpnGatewayResponse.setChargeType(_ctx.stringValue("DescribeVpnGatewayResponse.ChargeType"));
		describeVpnGatewayResponse.setIpsecVpn(_ctx.stringValue("DescribeVpnGatewayResponse.IpsecVpn"));
		describeVpnGatewayResponse.setSslVpn(_ctx.stringValue("DescribeVpnGatewayResponse.SslVpn"));
		describeVpnGatewayResponse.setSslMaxConnections(_ctx.longValue("DescribeVpnGatewayResponse.SslMaxConnections"));
		describeVpnGatewayResponse.setTag(_ctx.stringValue("DescribeVpnGatewayResponse.Tag"));
		describeVpnGatewayResponse.setEnableBgp(_ctx.booleanValue("DescribeVpnGatewayResponse.EnableBgp"));
		describeVpnGatewayResponse.setAutoPropagate(_ctx.booleanValue("DescribeVpnGatewayResponse.AutoPropagate"));

		ReservationData reservationData = new ReservationData();
		reservationData.setStatus(_ctx.stringValue("DescribeVpnGatewayResponse.ReservationData.Status"));
		reservationData.setReservationEndTime(_ctx.stringValue("DescribeVpnGatewayResponse.ReservationData.ReservationEndTime"));
		reservationData.setReservationOrderType(_ctx.stringValue("DescribeVpnGatewayResponse.ReservationData.ReservationOrderType"));
		reservationData.setReservationSpec(_ctx.stringValue("DescribeVpnGatewayResponse.ReservationData.ReservationSpec"));
		reservationData.setReservationIpsec(_ctx.stringValue("DescribeVpnGatewayResponse.ReservationData.ReservationIpsec"));
		reservationData.setReservationSsl(_ctx.stringValue("DescribeVpnGatewayResponse.ReservationData.ReservationSsl"));
		reservationData.setReservationMaxConnections(_ctx.integerValue("DescribeVpnGatewayResponse.ReservationData.ReservationMaxConnections"));
		describeVpnGatewayResponse.setReservationData(reservationData);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpnGatewayResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("DescribeVpnGatewayResponse.Tags["+ i +"].Key"));
			tag.setValue(_ctx.stringValue("DescribeVpnGatewayResponse.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		describeVpnGatewayResponse.setTags(tags);
	 
	 	return describeVpnGatewayResponse;
	}
}