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

package com.aliyuncs.cc5g.transform.v20220314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cc5g.model.v20220314.GetWirelessCloudConnectorResponse;
import com.aliyuncs.cc5g.model.v20220314.GetWirelessCloudConnectorResponse.NetLink;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWirelessCloudConnectorResponseUnmarshaller {

	public static GetWirelessCloudConnectorResponse unmarshall(GetWirelessCloudConnectorResponse getWirelessCloudConnectorResponse, UnmarshallerContext _ctx) {
		
		getWirelessCloudConnectorResponse.setRequestId(_ctx.stringValue("GetWirelessCloudConnectorResponse.RequestId"));
		getWirelessCloudConnectorResponse.setWirelessCloudConnectorId(_ctx.stringValue("GetWirelessCloudConnectorResponse.WirelessCloudConnectorId"));
		getWirelessCloudConnectorResponse.setStatus(_ctx.stringValue("GetWirelessCloudConnectorResponse.Status"));
		getWirelessCloudConnectorResponse.setName(_ctx.stringValue("GetWirelessCloudConnectorResponse.Name"));
		getWirelessCloudConnectorResponse.setDescription(_ctx.stringValue("GetWirelessCloudConnectorResponse.Description"));
		getWirelessCloudConnectorResponse.setRegionId(_ctx.stringValue("GetWirelessCloudConnectorResponse.RegionId"));
		getWirelessCloudConnectorResponse.setUseCase(_ctx.stringValue("GetWirelessCloudConnectorResponse.UseCase"));
		getWirelessCloudConnectorResponse.setDataPackageId(_ctx.stringValue("GetWirelessCloudConnectorResponse.DataPackageId"));
		getWirelessCloudConnectorResponse.setDataPackageType(_ctx.stringValue("GetWirelessCloudConnectorResponse.DataPackageType"));
		getWirelessCloudConnectorResponse.setCardCount(_ctx.stringValue("GetWirelessCloudConnectorResponse.CardCount"));
		getWirelessCloudConnectorResponse.setCreateTime(_ctx.stringValue("GetWirelessCloudConnectorResponse.CreateTime"));

		List<NetLink> netLinks = new ArrayList<NetLink>();
		for (int i = 0; i < _ctx.lengthValue("GetWirelessCloudConnectorResponse.NetLinks.Length"); i++) {
			NetLink netLink = new NetLink();
			netLink.setRegionId(_ctx.stringValue("GetWirelessCloudConnectorResponse.NetLinks["+ i +"].RegionId"));
			netLink.setNetLinkId(_ctx.stringValue("GetWirelessCloudConnectorResponse.NetLinks["+ i +"].NetLinkId"));
			netLink.setName(_ctx.stringValue("GetWirelessCloudConnectorResponse.NetLinks["+ i +"].Name"));
			netLink.setDescription(_ctx.stringValue("GetWirelessCloudConnectorResponse.NetLinks["+ i +"].Description"));
			netLink.setStatus(_ctx.stringValue("GetWirelessCloudConnectorResponse.NetLinks["+ i +"].Status"));
			netLink.setAPN(_ctx.stringValue("GetWirelessCloudConnectorResponse.NetLinks["+ i +"].APN"));
			netLink.setISP(_ctx.stringValue("GetWirelessCloudConnectorResponse.NetLinks["+ i +"].ISP"));
			netLink.setVpcId(_ctx.stringValue("GetWirelessCloudConnectorResponse.NetLinks["+ i +"].VpcId"));
			netLink.setCreateTime(_ctx.stringValue("GetWirelessCloudConnectorResponse.NetLinks["+ i +"].CreateTime"));

			List<String> vSwitchs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetWirelessCloudConnectorResponse.NetLinks["+ i +"].VSwitchs.Length"); j++) {
				vSwitchs.add(_ctx.stringValue("GetWirelessCloudConnectorResponse.NetLinks["+ i +"].VSwitchs["+ j +"]"));
			}
			netLink.setVSwitchs(vSwitchs);

			netLinks.add(netLink);
		}
		getWirelessCloudConnectorResponse.setNetLinks(netLinks);
	 
	 	return getWirelessCloudConnectorResponse;
	}
}