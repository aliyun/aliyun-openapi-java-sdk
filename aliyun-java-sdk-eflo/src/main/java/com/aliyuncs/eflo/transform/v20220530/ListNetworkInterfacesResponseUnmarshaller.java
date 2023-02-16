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

package com.aliyuncs.eflo.transform.v20220530;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eflo.model.v20220530.ListNetworkInterfacesResponse;
import com.aliyuncs.eflo.model.v20220530.ListNetworkInterfacesResponse.Content;
import com.aliyuncs.eflo.model.v20220530.ListNetworkInterfacesResponse.Content.DataItem;
import com.aliyuncs.eflo.model.v20220530.ListNetworkInterfacesResponse.Content.DataItem.PrivateIpAddressMacGroupItem;
import com.aliyuncs.eflo.model.v20220530.ListNetworkInterfacesResponse.Content.DataItem.SubnetBaseInfo;
import com.aliyuncs.eflo.model.v20220530.ListNetworkInterfacesResponse.Content.DataItem.VpdBaseInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNetworkInterfacesResponseUnmarshaller {

	public static ListNetworkInterfacesResponse unmarshall(ListNetworkInterfacesResponse listNetworkInterfacesResponse, UnmarshallerContext _ctx) {
		
		listNetworkInterfacesResponse.setRequestId(_ctx.stringValue("ListNetworkInterfacesResponse.RequestId"));
		listNetworkInterfacesResponse.setCode(_ctx.integerValue("ListNetworkInterfacesResponse.Code"));
		listNetworkInterfacesResponse.setMessage(_ctx.stringValue("ListNetworkInterfacesResponse.Message"));

		Content content = new Content();
		content.setTotal(_ctx.longValue("ListNetworkInterfacesResponse.Content.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListNetworkInterfacesResponse.Content.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTenantId(_ctx.stringValue("ListNetworkInterfacesResponse.Content.Data["+ i +"].TenantId"));
			dataItem.setRegionId(_ctx.stringValue("ListNetworkInterfacesResponse.Content.Data["+ i +"].RegionId"));
			dataItem.setNetworkInterfaceId(_ctx.stringValue("ListNetworkInterfacesResponse.Content.Data["+ i +"].NetworkInterfaceId"));
			dataItem.setNodeId(_ctx.stringValue("ListNetworkInterfacesResponse.Content.Data["+ i +"].NodeId"));
			dataItem.setZoneId(_ctx.stringValue("ListNetworkInterfacesResponse.Content.Data["+ i +"].ZoneId"));
			dataItem.setIp(_ctx.stringValue("ListNetworkInterfacesResponse.Content.Data["+ i +"].Ip"));
			dataItem.setServiceMac(_ctx.stringValue("ListNetworkInterfacesResponse.Content.Data["+ i +"].ServiceMac"));
			dataItem.setStatus(_ctx.stringValue("ListNetworkInterfacesResponse.Content.Data["+ i +"].Status"));
			dataItem.setGateway(_ctx.stringValue("ListNetworkInterfacesResponse.Content.Data["+ i +"].Gateway"));
			dataItem.setGmtCreate(_ctx.stringValue("ListNetworkInterfacesResponse.Content.Data["+ i +"].GmtCreate"));
			dataItem.setQuota(_ctx.integerValue("ListNetworkInterfacesResponse.Content.Data["+ i +"].Quota"));

			List<String> ethernet = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListNetworkInterfacesResponse.Content.Data["+ i +"].Ethernet.Length"); j++) {
				ethernet.add(_ctx.stringValue("ListNetworkInterfacesResponse.Content.Data["+ i +"].Ethernet["+ j +"]"));
			}
			dataItem.setEthernet(ethernet);

			VpdBaseInfo vpdBaseInfo = new VpdBaseInfo();
			vpdBaseInfo.setVpdId(_ctx.stringValue("ListNetworkInterfacesResponse.Content.Data["+ i +"].VpdBaseInfo.VpdId"));
			vpdBaseInfo.setName(_ctx.stringValue("ListNetworkInterfacesResponse.Content.Data["+ i +"].VpdBaseInfo.Name"));
			vpdBaseInfo.setCidr(_ctx.stringValue("ListNetworkInterfacesResponse.Content.Data["+ i +"].VpdBaseInfo.Cidr"));
			vpdBaseInfo.setGmtCreate(_ctx.stringValue("ListNetworkInterfacesResponse.Content.Data["+ i +"].VpdBaseInfo.GmtCreate"));
			dataItem.setVpdBaseInfo(vpdBaseInfo);

			SubnetBaseInfo subnetBaseInfo = new SubnetBaseInfo();
			subnetBaseInfo.setSubnetId(_ctx.stringValue("ListNetworkInterfacesResponse.Content.Data["+ i +"].SubnetBaseInfo.SubnetId"));
			subnetBaseInfo.setName(_ctx.stringValue("ListNetworkInterfacesResponse.Content.Data["+ i +"].SubnetBaseInfo.Name"));
			subnetBaseInfo.setCidr(_ctx.stringValue("ListNetworkInterfacesResponse.Content.Data["+ i +"].SubnetBaseInfo.Cidr"));
			subnetBaseInfo.setGmtCreate(_ctx.stringValue("ListNetworkInterfacesResponse.Content.Data["+ i +"].SubnetBaseInfo.GmtCreate"));
			dataItem.setSubnetBaseInfo(subnetBaseInfo);

			List<PrivateIpAddressMacGroupItem> privateIpAddressMacGroup = new ArrayList<PrivateIpAddressMacGroupItem>();
			for (int j = 0; j < _ctx.lengthValue("ListNetworkInterfacesResponse.Content.Data["+ i +"].PrivateIpAddressMacGroup.Length"); j++) {
				PrivateIpAddressMacGroupItem privateIpAddressMacGroupItem = new PrivateIpAddressMacGroupItem();
				privateIpAddressMacGroupItem.setIpName(_ctx.stringValue("ListNetworkInterfacesResponse.Content.Data["+ i +"].PrivateIpAddressMacGroup["+ j +"].IpName"));
				privateIpAddressMacGroupItem.setPrivateIpAddress(_ctx.stringValue("ListNetworkInterfacesResponse.Content.Data["+ i +"].PrivateIpAddressMacGroup["+ j +"].PrivateIpAddress"));
				privateIpAddressMacGroupItem.setIpAddressMac(_ctx.stringValue("ListNetworkInterfacesResponse.Content.Data["+ i +"].PrivateIpAddressMacGroup["+ j +"].IpAddressMac"));
				privateIpAddressMacGroupItem.setStatus(_ctx.stringValue("ListNetworkInterfacesResponse.Content.Data["+ i +"].PrivateIpAddressMacGroup["+ j +"].Status"));
				privateIpAddressMacGroupItem.setMessage(_ctx.stringValue("ListNetworkInterfacesResponse.Content.Data["+ i +"].PrivateIpAddressMacGroup["+ j +"].Message"));

				privateIpAddressMacGroup.add(privateIpAddressMacGroupItem);
			}
			dataItem.setPrivateIpAddressMacGroup(privateIpAddressMacGroup);

			data.add(dataItem);
		}
		content.setData(data);
		listNetworkInterfacesResponse.setContent(content);
	 
	 	return listNetworkInterfacesResponse;
	}
}