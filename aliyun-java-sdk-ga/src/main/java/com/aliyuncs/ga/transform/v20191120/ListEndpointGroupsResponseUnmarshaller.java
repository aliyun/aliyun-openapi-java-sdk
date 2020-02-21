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

package com.aliyuncs.ga.transform.v20191120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ga.model.v20191120.ListEndpointGroupsResponse;
import com.aliyuncs.ga.model.v20191120.ListEndpointGroupsResponse.EndpointGroupsItem;
import com.aliyuncs.ga.model.v20191120.ListEndpointGroupsResponse.EndpointGroupsItem.EndpointConfigurationsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEndpointGroupsResponseUnmarshaller {

	public static ListEndpointGroupsResponse unmarshall(ListEndpointGroupsResponse listEndpointGroupsResponse, UnmarshallerContext _ctx) {
		
		listEndpointGroupsResponse.setRequestId(_ctx.stringValue("ListEndpointGroupsResponse.RequestId"));
		listEndpointGroupsResponse.setTotalCount(_ctx.integerValue("ListEndpointGroupsResponse.TotalCount"));
		listEndpointGroupsResponse.setPageNumber(_ctx.integerValue("ListEndpointGroupsResponse.PageNumber"));
		listEndpointGroupsResponse.setPageSize(_ctx.integerValue("ListEndpointGroupsResponse.PageSize"));

		List<EndpointGroupsItem> endpointGroups = new ArrayList<EndpointGroupsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEndpointGroupsResponse.EndpointGroups.Length"); i++) {
			EndpointGroupsItem endpointGroupsItem = new EndpointGroupsItem();
			endpointGroupsItem.setEndpointGroupId(_ctx.stringValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].EndpointGroupId"));
			endpointGroupsItem.setName(_ctx.stringValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].Name"));
			endpointGroupsItem.setDescription(_ctx.stringValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].Description"));
			endpointGroupsItem.setTrafficPercentage(_ctx.integerValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].TrafficPercentage"));
			endpointGroupsItem.setEndpointGroupRegion(_ctx.stringValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].EndpointGroupRegion"));
			endpointGroupsItem.setState(_ctx.stringValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].State"));
			endpointGroupsItem.setListenerId(_ctx.stringValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].ListenerId"));
			endpointGroupsItem.setHealthCheckIntervalSeconds(_ctx.integerValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].HealthCheckIntervalSeconds"));
			endpointGroupsItem.setHealthCheckPath(_ctx.stringValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].HealthCheckPath"));
			endpointGroupsItem.setHealthCheckPort(_ctx.integerValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].HealthCheckPort"));
			endpointGroupsItem.setHealthCheckProtocol(_ctx.stringValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].HealthCheckProtocol"));
			endpointGroupsItem.setThresholdCount(_ctx.integerValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].ThresholdCount"));

			List<EndpointConfigurationsItem> endpointConfigurations = new ArrayList<EndpointConfigurationsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].EndpointConfigurations.Length"); j++) {
				EndpointConfigurationsItem endpointConfigurationsItem = new EndpointConfigurationsItem();
				endpointConfigurationsItem.setEndpoint(_ctx.stringValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].EndpointConfigurations["+ j +"].Endpoint"));
				endpointConfigurationsItem.setWeight(_ctx.integerValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].EndpointConfigurations["+ j +"].Weight"));
				endpointConfigurationsItem.setType(_ctx.stringValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].EndpointConfigurations["+ j +"].Type"));

				endpointConfigurations.add(endpointConfigurationsItem);
			}
			endpointGroupsItem.setEndpointConfigurations(endpointConfigurations);

			endpointGroups.add(endpointGroupsItem);
		}
		listEndpointGroupsResponse.setEndpointGroups(endpointGroups);
	 
	 	return listEndpointGroupsResponse;
	}
}