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

import com.aliyuncs.privatelink.model.v20200415.CreateVpcEndpointServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateVpcEndpointServiceResponseUnmarshaller {

	public static CreateVpcEndpointServiceResponse unmarshall(CreateVpcEndpointServiceResponse createVpcEndpointServiceResponse, UnmarshallerContext _ctx) {
		
		createVpcEndpointServiceResponse.setRequestId(_ctx.stringValue("CreateVpcEndpointServiceResponse.RequestId"));
		createVpcEndpointServiceResponse.setAutoAcceptEnabled(_ctx.booleanValue("CreateVpcEndpointServiceResponse.AutoAcceptEnabled"));
		createVpcEndpointServiceResponse.setCreateTime(_ctx.stringValue("CreateVpcEndpointServiceResponse.CreateTime"));
		createVpcEndpointServiceResponse.setServiceBusinessStatus(_ctx.stringValue("CreateVpcEndpointServiceResponse.ServiceBusinessStatus"));
		createVpcEndpointServiceResponse.setServiceDescription(_ctx.stringValue("CreateVpcEndpointServiceResponse.ServiceDescription"));
		createVpcEndpointServiceResponse.setServiceDomain(_ctx.stringValue("CreateVpcEndpointServiceResponse.ServiceDomain"));
		createVpcEndpointServiceResponse.setServiceId(_ctx.stringValue("CreateVpcEndpointServiceResponse.ServiceId"));
		createVpcEndpointServiceResponse.setServiceName(_ctx.stringValue("CreateVpcEndpointServiceResponse.ServiceName"));
		createVpcEndpointServiceResponse.setServiceStatus(_ctx.stringValue("CreateVpcEndpointServiceResponse.ServiceStatus"));
	 
	 	return createVpcEndpointServiceResponse;
	}
}