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

import com.aliyuncs.ga.model.v20191120.GetHealthStatusResponse;
import com.aliyuncs.ga.model.v20191120.GetHealthStatusResponse.EndpointGroupHealthStatuses;
import com.aliyuncs.ga.model.v20191120.GetHealthStatusResponse.EndpointGroupHealthStatuses.EndpointHealthStatuses;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHealthStatusResponseUnmarshaller {

	public static GetHealthStatusResponse unmarshall(GetHealthStatusResponse getHealthStatusResponse, UnmarshallerContext _ctx) {
		
		getHealthStatusResponse.setRequestId(_ctx.stringValue("GetHealthStatusResponse.RequestId"));
		getHealthStatusResponse.setListenerId(_ctx.stringValue("GetHealthStatusResponse.ListenerId"));
		getHealthStatusResponse.setHealthStatus(_ctx.stringValue("GetHealthStatusResponse.HealthStatus"));

		List<EndpointGroupHealthStatuses> endpointGroups = new ArrayList<EndpointGroupHealthStatuses>();
		for (int i = 0; i < _ctx.lengthValue("GetHealthStatusResponse.EndpointGroups.Length"); i++) {
			EndpointGroupHealthStatuses endpointGroupHealthStatuses = new EndpointGroupHealthStatuses();
			endpointGroupHealthStatuses.setEndpointGroupId(_ctx.stringValue("GetHealthStatusResponse.EndpointGroups["+ i +"].EndpointGroupId"));
			endpointGroupHealthStatuses.setEndpointGroupType(_ctx.stringValue("GetHealthStatusResponse.EndpointGroups["+ i +"].EndpointGroupType"));
			endpointGroupHealthStatuses.setHealthStatus(_ctx.stringValue("GetHealthStatusResponse.EndpointGroups["+ i +"].HealthStatus"));

			List<String> forwardingRuleIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetHealthStatusResponse.EndpointGroups["+ i +"].ForwardingRuleIds.Length"); j++) {
				forwardingRuleIds.add(_ctx.stringValue("GetHealthStatusResponse.EndpointGroups["+ i +"].ForwardingRuleIds["+ j +"]"));
			}
			endpointGroupHealthStatuses.setForwardingRuleIds(forwardingRuleIds);

			List<EndpointHealthStatuses> endpoints = new ArrayList<EndpointHealthStatuses>();
			for (int j = 0; j < _ctx.lengthValue("GetHealthStatusResponse.EndpointGroups["+ i +"].Endpoints.Length"); j++) {
				EndpointHealthStatuses endpointHealthStatuses = new EndpointHealthStatuses();
				endpointHealthStatuses.setEndpointId(_ctx.stringValue("GetHealthStatusResponse.EndpointGroups["+ i +"].Endpoints["+ j +"].EndpointId"));
				endpointHealthStatuses.setAddress(_ctx.stringValue("GetHealthStatusResponse.EndpointGroups["+ i +"].Endpoints["+ j +"].Address"));
				endpointHealthStatuses.setHealthStatus(_ctx.stringValue("GetHealthStatusResponse.EndpointGroups["+ i +"].Endpoints["+ j +"].HealthStatus"));
				endpointHealthStatuses.setHealthDetail(_ctx.stringValue("GetHealthStatusResponse.EndpointGroups["+ i +"].Endpoints["+ j +"].HealthDetail"));
				endpointHealthStatuses.setPort(_ctx.longValue("GetHealthStatusResponse.EndpointGroups["+ i +"].Endpoints["+ j +"].Port"));
				endpointHealthStatuses.setType(_ctx.stringValue("GetHealthStatusResponse.EndpointGroups["+ i +"].Endpoints["+ j +"].Type"));

				endpoints.add(endpointHealthStatuses);
			}
			endpointGroupHealthStatuses.setEndpoints(endpoints);

			endpointGroups.add(endpointGroupHealthStatuses);
		}
		getHealthStatusResponse.setEndpointGroups(endpointGroups);
	 
	 	return getHealthStatusResponse;
	}
}