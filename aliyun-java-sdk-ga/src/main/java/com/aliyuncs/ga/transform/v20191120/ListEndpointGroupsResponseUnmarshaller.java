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
import com.aliyuncs.ga.model.v20191120.ListEndpointGroupsResponse.EndpointGroupsItem.PortOverridesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEndpointGroupsResponseUnmarshaller {

	public static ListEndpointGroupsResponse unmarshall(ListEndpointGroupsResponse listEndpointGroupsResponse, UnmarshallerContext _ctx) {
		
		listEndpointGroupsResponse.setRequestId(_ctx.stringValue("ListEndpointGroupsResponse.RequestId"));
		listEndpointGroupsResponse.setTotalCount(_ctx.integerValue("ListEndpointGroupsResponse.TotalCount"));
		listEndpointGroupsResponse.setPageSize(_ctx.integerValue("ListEndpointGroupsResponse.PageSize"));
		listEndpointGroupsResponse.setPageNumber(_ctx.integerValue("ListEndpointGroupsResponse.PageNumber"));

		List<EndpointGroupsItem> endpointGroups = new ArrayList<EndpointGroupsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEndpointGroupsResponse.EndpointGroups.Length"); i++) {
			EndpointGroupsItem endpointGroupsItem = new EndpointGroupsItem();
			endpointGroupsItem.setEndpointGroupId(_ctx.stringValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].EndpointGroupId"));
			endpointGroupsItem.setState(_ctx.stringValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].State"));
			endpointGroupsItem.setHealthCheckPath(_ctx.stringValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].HealthCheckPath"));
			endpointGroupsItem.setEndpointGroupRegion(_ctx.stringValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].EndpointGroupRegion"));
			endpointGroupsItem.setHealthCheckIntervalSeconds(_ctx.integerValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].HealthCheckIntervalSeconds"));
			endpointGroupsItem.setTrafficPercentage(_ctx.integerValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].TrafficPercentage"));
			endpointGroupsItem.setHealthCheckProtocol(_ctx.stringValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].HealthCheckProtocol"));
			endpointGroupsItem.setThresholdCount(_ctx.integerValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].ThresholdCount"));
			endpointGroupsItem.setListenerId(_ctx.stringValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].ListenerId"));
			endpointGroupsItem.setAcceleratorId(_ctx.stringValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].AcceleratorId"));
			endpointGroupsItem.setEndpointGroupType(_ctx.stringValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].EndpointGroupType"));
			endpointGroupsItem.setEndpointRequestProtocol(_ctx.stringValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].EndpointRequestProtocol"));
			endpointGroupsItem.setDescription(_ctx.stringValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].Description"));
			endpointGroupsItem.setName(_ctx.stringValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].Name"));
			endpointGroupsItem.setHealthCheckPort(_ctx.integerValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].HealthCheckPort"));
			endpointGroupsItem.setHealthCheckEnabled(_ctx.booleanValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].HealthCheckEnabled"));

			List<String> endpointGroupIpList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].EndpointGroupIpList.Length"); j++) {
				endpointGroupIpList.add(_ctx.stringValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].EndpointGroupIpList["+ j +"]"));
			}
			endpointGroupsItem.setEndpointGroupIpList(endpointGroupIpList);

			List<String> endpointGroupUnconfirmedIpList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].EndpointGroupUnconfirmedIpList.Length"); j++) {
				endpointGroupUnconfirmedIpList.add(_ctx.stringValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].EndpointGroupUnconfirmedIpList["+ j +"]"));
			}
			endpointGroupsItem.setEndpointGroupUnconfirmedIpList(endpointGroupUnconfirmedIpList);

			List<String> forwardingRuleIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].ForwardingRuleIds.Length"); j++) {
				forwardingRuleIds.add(_ctx.stringValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].ForwardingRuleIds["+ j +"]"));
			}
			endpointGroupsItem.setForwardingRuleIds(forwardingRuleIds);

			List<EndpointConfigurationsItem> endpointConfigurations = new ArrayList<EndpointConfigurationsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].EndpointConfigurations.Length"); j++) {
				EndpointConfigurationsItem endpointConfigurationsItem = new EndpointConfigurationsItem();
				endpointConfigurationsItem.setType(_ctx.stringValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].EndpointConfigurations["+ j +"].Type"));
				endpointConfigurationsItem.setEnableClientIPPreservation(_ctx.booleanValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].EndpointConfigurations["+ j +"].EnableClientIPPreservation"));
				endpointConfigurationsItem.setWeight(_ctx.integerValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].EndpointConfigurations["+ j +"].Weight"));
				endpointConfigurationsItem.setProbeProtocol(_ctx.stringValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].EndpointConfigurations["+ j +"].ProbeProtocol"));
				endpointConfigurationsItem.setEndpoint(_ctx.stringValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].EndpointConfigurations["+ j +"].Endpoint"));
				endpointConfigurationsItem.setEnableProxyProtocol(_ctx.booleanValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].EndpointConfigurations["+ j +"].EnableProxyProtocol"));
				endpointConfigurationsItem.setProbePort(_ctx.integerValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].EndpointConfigurations["+ j +"].ProbePort"));
				endpointConfigurationsItem.setEndpointId(_ctx.stringValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].EndpointConfigurations["+ j +"].EndpointId"));

				endpointConfigurations.add(endpointConfigurationsItem);
			}
			endpointGroupsItem.setEndpointConfigurations(endpointConfigurations);

			List<PortOverridesItem> portOverrides = new ArrayList<PortOverridesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].PortOverrides.Length"); j++) {
				PortOverridesItem portOverridesItem = new PortOverridesItem();
				portOverridesItem.setListenerPort(_ctx.integerValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].PortOverrides["+ j +"].ListenerPort"));
				portOverridesItem.setEndpointPort(_ctx.integerValue("ListEndpointGroupsResponse.EndpointGroups["+ i +"].PortOverrides["+ j +"].EndpointPort"));

				portOverrides.add(portOverridesItem);
			}
			endpointGroupsItem.setPortOverrides(portOverrides);

			endpointGroups.add(endpointGroupsItem);
		}
		listEndpointGroupsResponse.setEndpointGroups(endpointGroups);
	 
	 	return listEndpointGroupsResponse;
	}
}