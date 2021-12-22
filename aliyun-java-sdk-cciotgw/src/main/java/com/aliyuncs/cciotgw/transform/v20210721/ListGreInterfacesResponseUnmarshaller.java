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

package com.aliyuncs.cciotgw.transform.v20210721;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cciotgw.model.v20210721.ListGreInterfacesResponse;
import com.aliyuncs.cciotgw.model.v20210721.ListGreInterfacesResponse.GreInterfaceItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGreInterfacesResponseUnmarshaller {

	public static ListGreInterfacesResponse unmarshall(ListGreInterfacesResponse listGreInterfacesResponse, UnmarshallerContext _ctx) {
		
		listGreInterfacesResponse.setRequestId(_ctx.stringValue("ListGreInterfacesResponse.RequestId"));
		listGreInterfacesResponse.setIoTCloudConnectorGatewayId(_ctx.stringValue("ListGreInterfacesResponse.IoTCloudConnectorGatewayId"));

		List<GreInterfaceItem> greInterface = new ArrayList<GreInterfaceItem>();
		for (int i = 0; i < _ctx.lengthValue("ListGreInterfacesResponse.GreInterface.Length"); i++) {
			GreInterfaceItem greInterfaceItem = new GreInterfaceItem();
			greInterfaceItem.setCustomerIp(_ctx.stringValue("ListGreInterfacesResponse.GreInterface["+ i +"].CustomerIp"));
			greInterfaceItem.setCustomerTunnelIp(_ctx.stringValue("ListGreInterfacesResponse.GreInterface["+ i +"].CustomerTunnelIp"));
			greInterfaceItem.setLocalTunnelIp(_ctx.stringValue("ListGreInterfacesResponse.GreInterface["+ i +"].LocalTunnelIp"));
			greInterfaceItem.setState(_ctx.stringValue("ListGreInterfacesResponse.GreInterface["+ i +"].State"));
			greInterfaceItem.setEnableKeepalive(_ctx.booleanValue("ListGreInterfacesResponse.GreInterface["+ i +"].EnableKeepalive"));
			greInterfaceItem.setGreGwId(_ctx.stringValue("ListGreInterfacesResponse.GreInterface["+ i +"].GreGwId"));
			greInterfaceItem.setForwardingUnitId(_ctx.stringValue("ListGreInterfacesResponse.GreInterface["+ i +"].ForwardingUnitId"));
			greInterfaceItem.setLocalIp(_ctx.stringValue("ListGreInterfacesResponse.GreInterface["+ i +"].LocalIp"));
			greInterfaceItem.setGreInterfaceId(_ctx.stringValue("ListGreInterfacesResponse.GreInterface["+ i +"].GreInterfaceId"));
			greInterfaceItem.setGreCidrs(_ctx.stringValue("ListGreInterfacesResponse.GreInterface["+ i +"].GreCidrs"));
			greInterfaceItem.setIoTCloudConnectorGatewayId(_ctx.stringValue("ListGreInterfacesResponse.GreInterface["+ i +"].IoTCloudConnectorGatewayId"));

			greInterface.add(greInterfaceItem);
		}
		listGreInterfacesResponse.setGreInterface(greInterface);
	 
	 	return listGreInterfacesResponse;
	}
}