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

import com.aliyuncs.cc5g.model.v20220314.ListWirelessCloudConnectorsResponse;
import com.aliyuncs.cc5g.model.v20220314.ListWirelessCloudConnectorsResponse.WirelessCloudConnector;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWirelessCloudConnectorsResponseUnmarshaller {

	public static ListWirelessCloudConnectorsResponse unmarshall(ListWirelessCloudConnectorsResponse listWirelessCloudConnectorsResponse, UnmarshallerContext _ctx) {
		
		listWirelessCloudConnectorsResponse.setRequestId(_ctx.stringValue("ListWirelessCloudConnectorsResponse.RequestId"));
		listWirelessCloudConnectorsResponse.setNextToken(_ctx.stringValue("ListWirelessCloudConnectorsResponse.NextToken"));
		listWirelessCloudConnectorsResponse.setMaxResults(_ctx.stringValue("ListWirelessCloudConnectorsResponse.MaxResults"));
		listWirelessCloudConnectorsResponse.setTotalCount(_ctx.stringValue("ListWirelessCloudConnectorsResponse.TotalCount"));

		List<WirelessCloudConnector> wirelessCloudConnectors = new ArrayList<WirelessCloudConnector>();
		for (int i = 0; i < _ctx.lengthValue("ListWirelessCloudConnectorsResponse.WirelessCloudConnectors.Length"); i++) {
			WirelessCloudConnector wirelessCloudConnector = new WirelessCloudConnector();
			wirelessCloudConnector.setWirelessCloudConnectorId(_ctx.stringValue("ListWirelessCloudConnectorsResponse.WirelessCloudConnectors["+ i +"].WirelessCloudConnectorId"));
			wirelessCloudConnector.setStatus(_ctx.stringValue("ListWirelessCloudConnectorsResponse.WirelessCloudConnectors["+ i +"].Status"));
			wirelessCloudConnector.setName(_ctx.stringValue("ListWirelessCloudConnectorsResponse.WirelessCloudConnectors["+ i +"].Name"));
			wirelessCloudConnector.setDescription(_ctx.stringValue("ListWirelessCloudConnectorsResponse.WirelessCloudConnectors["+ i +"].Description"));
			wirelessCloudConnector.setRegionId(_ctx.stringValue("ListWirelessCloudConnectorsResponse.WirelessCloudConnectors["+ i +"].RegionId"));
			wirelessCloudConnector.setUseCase(_ctx.stringValue("ListWirelessCloudConnectorsResponse.WirelessCloudConnectors["+ i +"].UseCase"));
			wirelessCloudConnector.setDataPackageId(_ctx.stringValue("ListWirelessCloudConnectorsResponse.WirelessCloudConnectors["+ i +"].DataPackageId"));
			wirelessCloudConnector.setDataPackageType(_ctx.stringValue("ListWirelessCloudConnectorsResponse.WirelessCloudConnectors["+ i +"].DataPackageType"));
			wirelessCloudConnector.setCardCount(_ctx.stringValue("ListWirelessCloudConnectorsResponse.WirelessCloudConnectors["+ i +"].CardCount"));
			wirelessCloudConnector.setCreateTime(_ctx.stringValue("ListWirelessCloudConnectorsResponse.WirelessCloudConnectors["+ i +"].CreateTime"));

			wirelessCloudConnectors.add(wirelessCloudConnector);
		}
		listWirelessCloudConnectorsResponse.setWirelessCloudConnectors(wirelessCloudConnectors);
	 
	 	return listWirelessCloudConnectorsResponse;
	}
}