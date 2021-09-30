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

import com.aliyuncs.vpc.model.v20160428.ListVpcEndpointServicesByEndUserResponse;
import com.aliyuncs.vpc.model.v20160428.ListVpcEndpointServicesByEndUserResponse.Service;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVpcEndpointServicesByEndUserResponseUnmarshaller {

	public static ListVpcEndpointServicesByEndUserResponse unmarshall(ListVpcEndpointServicesByEndUserResponse listVpcEndpointServicesByEndUserResponse, UnmarshallerContext _ctx) {
		
		listVpcEndpointServicesByEndUserResponse.setRequestId(_ctx.stringValue("ListVpcEndpointServicesByEndUserResponse.RequestId"));
		listVpcEndpointServicesByEndUserResponse.setNextToken(_ctx.stringValue("ListVpcEndpointServicesByEndUserResponse.NextToken"));
		listVpcEndpointServicesByEndUserResponse.setMaxResults(_ctx.longValue("ListVpcEndpointServicesByEndUserResponse.MaxResults"));

		List<Service> services = new ArrayList<Service>();
		for (int i = 0; i < _ctx.lengthValue("ListVpcEndpointServicesByEndUserResponse.Services.Length"); i++) {
			Service service = new Service();
			service.setServiceId(_ctx.stringValue("ListVpcEndpointServicesByEndUserResponse.Services["+ i +"].ServiceId"));
			service.setServiceName(_ctx.stringValue("ListVpcEndpointServicesByEndUserResponse.Services["+ i +"].ServiceName"));
			service.setDefaultPolicyDocument(_ctx.stringValue("ListVpcEndpointServicesByEndUserResponse.Services["+ i +"].DefaultPolicyDocument"));
			service.setSupportPolicy(_ctx.booleanValue("ListVpcEndpointServicesByEndUserResponse.Services["+ i +"].SupportPolicy"));
			service.setServiceDomain(_ctx.stringValue("ListVpcEndpointServicesByEndUserResponse.Services["+ i +"].ServiceDomain"));

			services.add(service);
		}
		listVpcEndpointServicesByEndUserResponse.setServices(services);
	 
	 	return listVpcEndpointServicesByEndUserResponse;
	}
}