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

import com.aliyuncs.vpc.model.v20160428.ListGatewayRouteTableEntriesResponse;
import com.aliyuncs.vpc.model.v20160428.ListGatewayRouteTableEntriesResponse.GatewayRouteEntryModelsItem;
import com.aliyuncs.vpc.model.v20160428.ListGatewayRouteTableEntriesResponse.GatewayRouteEntryModelsItem.NextHop;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGatewayRouteTableEntriesResponseUnmarshaller {

	public static ListGatewayRouteTableEntriesResponse unmarshall(ListGatewayRouteTableEntriesResponse listGatewayRouteTableEntriesResponse, UnmarshallerContext _ctx) {
		
		listGatewayRouteTableEntriesResponse.setRequestId(_ctx.stringValue("ListGatewayRouteTableEntriesResponse.RequestId"));
		listGatewayRouteTableEntriesResponse.setNextToken(_ctx.stringValue("ListGatewayRouteTableEntriesResponse.NextToken"));
		listGatewayRouteTableEntriesResponse.setTotalCount(_ctx.stringValue("ListGatewayRouteTableEntriesResponse.TotalCount"));

		List<GatewayRouteEntryModelsItem> gatewayRouteEntryModels = new ArrayList<GatewayRouteEntryModelsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListGatewayRouteTableEntriesResponse.GatewayRouteEntryModels.Length"); i++) {
			GatewayRouteEntryModelsItem gatewayRouteEntryModelsItem = new GatewayRouteEntryModelsItem();
			gatewayRouteEntryModelsItem.setStatus(_ctx.stringValue("ListGatewayRouteTableEntriesResponse.GatewayRouteEntryModels["+ i +"].Status"));
			gatewayRouteEntryModelsItem.setNextHopId(_ctx.stringValue("ListGatewayRouteTableEntriesResponse.GatewayRouteEntryModels["+ i +"].NextHopId"));
			gatewayRouteEntryModelsItem.setDescription(_ctx.stringValue("ListGatewayRouteTableEntriesResponse.GatewayRouteEntryModels["+ i +"].Description"));
			gatewayRouteEntryModelsItem.setNextHopType(_ctx.stringValue("ListGatewayRouteTableEntriesResponse.GatewayRouteEntryModels["+ i +"].NextHopType"));
			gatewayRouteEntryModelsItem.setDestinationCidrBlock(_ctx.stringValue("ListGatewayRouteTableEntriesResponse.GatewayRouteEntryModels["+ i +"].DestinationCidrBlock"));
			gatewayRouteEntryModelsItem.setName(_ctx.stringValue("ListGatewayRouteTableEntriesResponse.GatewayRouteEntryModels["+ i +"].Name"));

			List<NextHop> nextHops = new ArrayList<NextHop>();
			for (int j = 0; j < _ctx.lengthValue("ListGatewayRouteTableEntriesResponse.GatewayRouteEntryModels["+ i +"].NextHops.Length"); j++) {
				NextHop nextHop = new NextHop();
				nextHop.setNextHopId(_ctx.stringValue("ListGatewayRouteTableEntriesResponse.GatewayRouteEntryModels["+ i +"].NextHops["+ j +"].NextHopId"));
				nextHop.setNextHopType(_ctx.stringValue("ListGatewayRouteTableEntriesResponse.GatewayRouteEntryModels["+ i +"].NextHops["+ j +"].NextHopType"));
				nextHop.setWeight(_ctx.stringValue("ListGatewayRouteTableEntriesResponse.GatewayRouteEntryModels["+ i +"].NextHops["+ j +"].Weight"));
				nextHop.setEnabled(_ctx.stringValue("ListGatewayRouteTableEntriesResponse.GatewayRouteEntryModels["+ i +"].NextHops["+ j +"].Enabled"));

				nextHops.add(nextHop);
			}
			gatewayRouteEntryModelsItem.setNextHops(nextHops);

			gatewayRouteEntryModels.add(gatewayRouteEntryModelsItem);
		}
		listGatewayRouteTableEntriesResponse.setGatewayRouteEntryModels(gatewayRouteEntryModels);
	 
	 	return listGatewayRouteTableEntriesResponse;
	}
}