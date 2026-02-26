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

import com.aliyuncs.ga.model.v20191120.ListCustomRoutingEndpointTrafficPoliciesResponse;
import com.aliyuncs.ga.model.v20191120.ListCustomRoutingEndpointTrafficPoliciesResponse.PoliciesItem;
import com.aliyuncs.ga.model.v20191120.ListCustomRoutingEndpointTrafficPoliciesResponse.PoliciesItem.PortRangesItem;
import com.aliyuncs.ga.model.v20191120.ListCustomRoutingEndpointTrafficPoliciesResponse.PoliciesItem.ServiceManagedInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCustomRoutingEndpointTrafficPoliciesResponseUnmarshaller {

	public static ListCustomRoutingEndpointTrafficPoliciesResponse unmarshall(ListCustomRoutingEndpointTrafficPoliciesResponse listCustomRoutingEndpointTrafficPoliciesResponse, UnmarshallerContext _ctx) {
		
		listCustomRoutingEndpointTrafficPoliciesResponse.setRequestId(_ctx.stringValue("ListCustomRoutingEndpointTrafficPoliciesResponse.RequestId"));
		listCustomRoutingEndpointTrafficPoliciesResponse.setTotalCount(_ctx.integerValue("ListCustomRoutingEndpointTrafficPoliciesResponse.TotalCount"));
		listCustomRoutingEndpointTrafficPoliciesResponse.setPageSize(_ctx.integerValue("ListCustomRoutingEndpointTrafficPoliciesResponse.PageSize"));
		listCustomRoutingEndpointTrafficPoliciesResponse.setPageNumber(_ctx.integerValue("ListCustomRoutingEndpointTrafficPoliciesResponse.PageNumber"));

		List<PoliciesItem> policies = new ArrayList<PoliciesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCustomRoutingEndpointTrafficPoliciesResponse.Policies.Length"); i++) {
			PoliciesItem policiesItem = new PoliciesItem();
			policiesItem.setAcceleratorId(_ctx.stringValue("ListCustomRoutingEndpointTrafficPoliciesResponse.Policies["+ i +"].AcceleratorId"));
			policiesItem.setListenerId(_ctx.stringValue("ListCustomRoutingEndpointTrafficPoliciesResponse.Policies["+ i +"].ListenerId"));
			policiesItem.setEndpointGroupId(_ctx.stringValue("ListCustomRoutingEndpointTrafficPoliciesResponse.Policies["+ i +"].EndpointGroupId"));
			policiesItem.setEndpointId(_ctx.stringValue("ListCustomRoutingEndpointTrafficPoliciesResponse.Policies["+ i +"].EndpointId"));
			policiesItem.setPolicyId(_ctx.stringValue("ListCustomRoutingEndpointTrafficPoliciesResponse.Policies["+ i +"].PolicyId"));
			policiesItem.setAddress(_ctx.stringValue("ListCustomRoutingEndpointTrafficPoliciesResponse.Policies["+ i +"].Address"));
			policiesItem.setServiceId(_ctx.stringValue("ListCustomRoutingEndpointTrafficPoliciesResponse.Policies["+ i +"].ServiceId"));
			policiesItem.setServiceManaged(_ctx.booleanValue("ListCustomRoutingEndpointTrafficPoliciesResponse.Policies["+ i +"].ServiceManaged"));

			List<PortRangesItem> portRanges = new ArrayList<PortRangesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListCustomRoutingEndpointTrafficPoliciesResponse.Policies["+ i +"].PortRanges.Length"); j++) {
				PortRangesItem portRangesItem = new PortRangesItem();
				portRangesItem.setFromPort(_ctx.integerValue("ListCustomRoutingEndpointTrafficPoliciesResponse.Policies["+ i +"].PortRanges["+ j +"].FromPort"));
				portRangesItem.setToPort(_ctx.integerValue("ListCustomRoutingEndpointTrafficPoliciesResponse.Policies["+ i +"].PortRanges["+ j +"].ToPort"));

				portRanges.add(portRangesItem);
			}
			policiesItem.setPortRanges(portRanges);

			List<ServiceManagedInfosItem> serviceManagedInfos = new ArrayList<ServiceManagedInfosItem>();
			for (int j = 0; j < _ctx.lengthValue("ListCustomRoutingEndpointTrafficPoliciesResponse.Policies["+ i +"].ServiceManagedInfos.Length"); j++) {
				ServiceManagedInfosItem serviceManagedInfosItem = new ServiceManagedInfosItem();
				serviceManagedInfosItem.setAction(_ctx.stringValue("ListCustomRoutingEndpointTrafficPoliciesResponse.Policies["+ i +"].ServiceManagedInfos["+ j +"].Action"));
				serviceManagedInfosItem.setChildType(_ctx.stringValue("ListCustomRoutingEndpointTrafficPoliciesResponse.Policies["+ i +"].ServiceManagedInfos["+ j +"].ChildType"));
				serviceManagedInfosItem.setIsManaged(_ctx.booleanValue("ListCustomRoutingEndpointTrafficPoliciesResponse.Policies["+ i +"].ServiceManagedInfos["+ j +"].IsManaged"));

				serviceManagedInfos.add(serviceManagedInfosItem);
			}
			policiesItem.setServiceManagedInfos(serviceManagedInfos);

			policies.add(policiesItem);
		}
		listCustomRoutingEndpointTrafficPoliciesResponse.setPolicies(policies);
	 
	 	return listCustomRoutingEndpointTrafficPoliciesResponse;
	}
}