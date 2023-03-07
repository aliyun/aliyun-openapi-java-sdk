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

import com.aliyuncs.vpc.model.v20160428.ListIpv4GatewaysResponse;
import com.aliyuncs.vpc.model.v20160428.ListIpv4GatewaysResponse.Ipv4GatewayModelsItem;
import com.aliyuncs.vpc.model.v20160428.ListIpv4GatewaysResponse.Ipv4GatewayModelsItem.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIpv4GatewaysResponseUnmarshaller {

	public static ListIpv4GatewaysResponse unmarshall(ListIpv4GatewaysResponse listIpv4GatewaysResponse, UnmarshallerContext _ctx) {
		
		listIpv4GatewaysResponse.setRequestId(_ctx.stringValue("ListIpv4GatewaysResponse.RequestId"));
		listIpv4GatewaysResponse.setNextToken(_ctx.stringValue("ListIpv4GatewaysResponse.NextToken"));
		listIpv4GatewaysResponse.setTotalCount(_ctx.stringValue("ListIpv4GatewaysResponse.TotalCount"));

		List<Ipv4GatewayModelsItem> ipv4GatewayModels = new ArrayList<Ipv4GatewayModelsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListIpv4GatewaysResponse.Ipv4GatewayModels.Length"); i++) {
			Ipv4GatewayModelsItem ipv4GatewayModelsItem = new Ipv4GatewayModelsItem();
			ipv4GatewayModelsItem.setVpcId(_ctx.stringValue("ListIpv4GatewaysResponse.Ipv4GatewayModels["+ i +"].VpcId"));
			ipv4GatewayModelsItem.setStatus(_ctx.stringValue("ListIpv4GatewaysResponse.Ipv4GatewayModels["+ i +"].Status"));
			ipv4GatewayModelsItem.setIpv4GatewayId(_ctx.stringValue("ListIpv4GatewaysResponse.Ipv4GatewayModels["+ i +"].Ipv4GatewayId"));
			ipv4GatewayModelsItem.setIpv4GatewayDescription(_ctx.stringValue("ListIpv4GatewaysResponse.Ipv4GatewayModels["+ i +"].Ipv4GatewayDescription"));
			ipv4GatewayModelsItem.setEnabled(_ctx.booleanValue("ListIpv4GatewaysResponse.Ipv4GatewayModels["+ i +"].Enabled"));
			ipv4GatewayModelsItem.setGmtCreate(_ctx.stringValue("ListIpv4GatewaysResponse.Ipv4GatewayModels["+ i +"].GmtCreate"));
			ipv4GatewayModelsItem.setIpv4GatewayRouteTableId(_ctx.stringValue("ListIpv4GatewaysResponse.Ipv4GatewayModels["+ i +"].Ipv4GatewayRouteTableId"));
			ipv4GatewayModelsItem.setIpv4GatewayName(_ctx.stringValue("ListIpv4GatewaysResponse.Ipv4GatewayModels["+ i +"].Ipv4GatewayName"));
			ipv4GatewayModelsItem.setResourceGroupId(_ctx.stringValue("ListIpv4GatewaysResponse.Ipv4GatewayModels["+ i +"].ResourceGroupId"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListIpv4GatewaysResponse.Ipv4GatewayModels["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("ListIpv4GatewaysResponse.Ipv4GatewayModels["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("ListIpv4GatewaysResponse.Ipv4GatewayModels["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			ipv4GatewayModelsItem.setTags(tags);

			ipv4GatewayModels.add(ipv4GatewayModelsItem);
		}
		listIpv4GatewaysResponse.setIpv4GatewayModels(ipv4GatewayModels);
	 
	 	return listIpv4GatewaysResponse;
	}
}