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

import com.aliyuncs.eflo.model.v20220530.GetNetworkInterfaceResponse;
import com.aliyuncs.eflo.model.v20220530.GetNetworkInterfaceResponse.Content;
import com.aliyuncs.eflo.model.v20220530.GetNetworkInterfaceResponse.Content.PrivateIpAddressMacGroupItem;
import com.aliyuncs.eflo.model.v20220530.GetNetworkInterfaceResponse.Content.SubnetBaseInfo;
import com.aliyuncs.eflo.model.v20220530.GetNetworkInterfaceResponse.Content.VpdBaseInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNetworkInterfaceResponseUnmarshaller {

	public static GetNetworkInterfaceResponse unmarshall(GetNetworkInterfaceResponse getNetworkInterfaceResponse, UnmarshallerContext _ctx) {
		
		getNetworkInterfaceResponse.setRequestId(_ctx.stringValue("GetNetworkInterfaceResponse.RequestId"));
		getNetworkInterfaceResponse.setCode(_ctx.integerValue("GetNetworkInterfaceResponse.Code"));
		getNetworkInterfaceResponse.setMessage(_ctx.stringValue("GetNetworkInterfaceResponse.Message"));

		Content content = new Content();
		content.setTenantId(_ctx.stringValue("GetNetworkInterfaceResponse.Content.TenantId"));
		content.setRegionId(_ctx.stringValue("GetNetworkInterfaceResponse.Content.RegionId"));
		content.setNetworkInterfaceId(_ctx.stringValue("GetNetworkInterfaceResponse.Content.NetworkInterfaceId"));
		content.setNodeId(_ctx.stringValue("GetNetworkInterfaceResponse.Content.NodeId"));
		content.setZoneId(_ctx.stringValue("GetNetworkInterfaceResponse.Content.ZoneId"));
		content.setIp(_ctx.stringValue("GetNetworkInterfaceResponse.Content.Ip"));
		content.setServiceMac(_ctx.stringValue("GetNetworkInterfaceResponse.Content.ServiceMac"));
		content.setStatus(_ctx.stringValue("GetNetworkInterfaceResponse.Content.Status"));
		content.setGateway(_ctx.stringValue("GetNetworkInterfaceResponse.Content.Gateway"));
		content.setCreateTime(_ctx.stringValue("GetNetworkInterfaceResponse.Content.CreateTime"));
		content.setQuota(_ctx.integerValue("GetNetworkInterfaceResponse.Content.Quota"));
		content.setNcType(_ctx.stringValue("GetNetworkInterfaceResponse.Content.NcType"));
		content.setNetworkInterfaceName(_ctx.stringValue("GetNetworkInterfaceResponse.Content.NetworkInterfaceName"));

		List<String> ethernet = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetNetworkInterfaceResponse.Content.Ethernet.Length"); i++) {
			ethernet.add(_ctx.stringValue("GetNetworkInterfaceResponse.Content.Ethernet["+ i +"]"));
		}
		content.setEthernet(ethernet);

		VpdBaseInfo vpdBaseInfo = new VpdBaseInfo();
		vpdBaseInfo.setVpdId(_ctx.stringValue("GetNetworkInterfaceResponse.Content.VpdBaseInfo.VpdId"));
		vpdBaseInfo.setVpdName(_ctx.stringValue("GetNetworkInterfaceResponse.Content.VpdBaseInfo.VpdName"));
		vpdBaseInfo.setCidr(_ctx.stringValue("GetNetworkInterfaceResponse.Content.VpdBaseInfo.Cidr"));
		vpdBaseInfo.setCreateTime(_ctx.stringValue("GetNetworkInterfaceResponse.Content.VpdBaseInfo.CreateTime"));
		content.setVpdBaseInfo(vpdBaseInfo);

		SubnetBaseInfo subnetBaseInfo = new SubnetBaseInfo();
		subnetBaseInfo.setSubnetId(_ctx.stringValue("GetNetworkInterfaceResponse.Content.SubnetBaseInfo.SubnetId"));
		subnetBaseInfo.setSubnetName(_ctx.stringValue("GetNetworkInterfaceResponse.Content.SubnetBaseInfo.SubnetName"));
		subnetBaseInfo.setCidr(_ctx.stringValue("GetNetworkInterfaceResponse.Content.SubnetBaseInfo.Cidr"));
		subnetBaseInfo.setCreateTime(_ctx.stringValue("GetNetworkInterfaceResponse.Content.SubnetBaseInfo.CreateTime"));
		content.setSubnetBaseInfo(subnetBaseInfo);

		List<PrivateIpAddressMacGroupItem> privateIpAddressMacGroup = new ArrayList<PrivateIpAddressMacGroupItem>();
		for (int i = 0; i < _ctx.lengthValue("GetNetworkInterfaceResponse.Content.PrivateIpAddressMacGroup.Length"); i++) {
			PrivateIpAddressMacGroupItem privateIpAddressMacGroupItem = new PrivateIpAddressMacGroupItem();
			privateIpAddressMacGroupItem.setIpName(_ctx.stringValue("GetNetworkInterfaceResponse.Content.PrivateIpAddressMacGroup["+ i +"].IpName"));
			privateIpAddressMacGroupItem.setPrivateIpAddress(_ctx.stringValue("GetNetworkInterfaceResponse.Content.PrivateIpAddressMacGroup["+ i +"].PrivateIpAddress"));
			privateIpAddressMacGroupItem.setIpAddressMac(_ctx.stringValue("GetNetworkInterfaceResponse.Content.PrivateIpAddressMacGroup["+ i +"].IpAddressMac"));
			privateIpAddressMacGroupItem.setStatus(_ctx.stringValue("GetNetworkInterfaceResponse.Content.PrivateIpAddressMacGroup["+ i +"].Status"));
			privateIpAddressMacGroupItem.setMessage(_ctx.stringValue("GetNetworkInterfaceResponse.Content.PrivateIpAddressMacGroup["+ i +"].Message"));

			privateIpAddressMacGroup.add(privateIpAddressMacGroupItem);
		}
		content.setPrivateIpAddressMacGroup(privateIpAddressMacGroup);
		getNetworkInterfaceResponse.setContent(content);
	 
	 	return getNetworkInterfaceResponse;
	}
}