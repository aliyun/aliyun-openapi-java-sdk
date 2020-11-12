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

package com.aliyuncs.privatelink.transform.v20200415;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.privatelink.model.v20200415.ListVpcEndpointServicesByEndUserResponse;
import com.aliyuncs.privatelink.model.v20200415.ListVpcEndpointServicesByEndUserResponse.Service;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVpcEndpointServicesByEndUserResponseUnmarshaller {

	public static ListVpcEndpointServicesByEndUserResponse unmarshall(ListVpcEndpointServicesByEndUserResponse listVpcEndpointServicesByEndUserResponse, UnmarshallerContext _ctx) {
		
		listVpcEndpointServicesByEndUserResponse.setRequestId(_ctx.stringValue("ListVpcEndpointServicesByEndUserResponse.RequestId"));
		listVpcEndpointServicesByEndUserResponse.setMaxResults(_ctx.stringValue("ListVpcEndpointServicesByEndUserResponse.MaxResults"));
		listVpcEndpointServicesByEndUserResponse.setNextToken(_ctx.stringValue("ListVpcEndpointServicesByEndUserResponse.NextToken"));

		List<Service> services = new ArrayList<Service>();
		for (int i = 0; i < _ctx.lengthValue("ListVpcEndpointServicesByEndUserResponse.Services.Length"); i++) {
			Service service = new Service();
			service.setServiceDomain(_ctx.stringValue("ListVpcEndpointServicesByEndUserResponse.Services["+ i +"].ServiceDomain"));
			service.setServiceId(_ctx.stringValue("ListVpcEndpointServicesByEndUserResponse.Services["+ i +"].ServiceId"));
			service.setServiceName(_ctx.stringValue("ListVpcEndpointServicesByEndUserResponse.Services["+ i +"].ServiceName"));
			service.setPayer(_ctx.stringValue("ListVpcEndpointServicesByEndUserResponse.Services["+ i +"].Payer"));

			List<String> zones = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListVpcEndpointServicesByEndUserResponse.Services["+ i +"].Zones.Length"); j++) {
				zones.add(_ctx.stringValue("ListVpcEndpointServicesByEndUserResponse.Services["+ i +"].Zones["+ j +"]"));
			}
			service.setZones(zones);

			services.add(service);
		}
		listVpcEndpointServicesByEndUserResponse.setServices(services);
	 
	 	return listVpcEndpointServicesByEndUserResponse;
	}
}