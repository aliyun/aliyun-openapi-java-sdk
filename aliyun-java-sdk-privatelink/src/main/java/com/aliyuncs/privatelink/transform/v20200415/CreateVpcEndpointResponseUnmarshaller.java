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

import com.aliyuncs.privatelink.model.v20200415.CreateVpcEndpointResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateVpcEndpointResponseUnmarshaller {

	public static CreateVpcEndpointResponse unmarshall(CreateVpcEndpointResponse createVpcEndpointResponse, UnmarshallerContext _ctx) {
		
		createVpcEndpointResponse.setRequestId(_ctx.stringValue("CreateVpcEndpointResponse.RequestId"));
		createVpcEndpointResponse.setEndpointId(_ctx.stringValue("CreateVpcEndpointResponse.EndpointId"));
		createVpcEndpointResponse.setCreateTime(_ctx.stringValue("CreateVpcEndpointResponse.CreateTime"));
		createVpcEndpointResponse.setEndpointName(_ctx.stringValue("CreateVpcEndpointResponse.EndpointName"));
		createVpcEndpointResponse.setVpcId(_ctx.stringValue("CreateVpcEndpointResponse.VpcId"));
		createVpcEndpointResponse.setEndpointDescription(_ctx.stringValue("CreateVpcEndpointResponse.EndpointDescription"));
		createVpcEndpointResponse.setServiceId(_ctx.stringValue("CreateVpcEndpointResponse.ServiceId"));
		createVpcEndpointResponse.setServiceName(_ctx.stringValue("CreateVpcEndpointResponse.ServiceName"));
		createVpcEndpointResponse.setEndpointBusinessStatus(_ctx.stringValue("CreateVpcEndpointResponse.EndpointBusinessStatus"));
		createVpcEndpointResponse.setEndpointStatus(_ctx.stringValue("CreateVpcEndpointResponse.EndpointStatus"));
		createVpcEndpointResponse.setConnectionStatus(_ctx.stringValue("CreateVpcEndpointResponse.ConnectionStatus"));
		createVpcEndpointResponse.setEndpointDomain(_ctx.stringValue("CreateVpcEndpointResponse.EndpointDomain"));
		createVpcEndpointResponse.setBandwidth(_ctx.longValue("CreateVpcEndpointResponse.Bandwidth"));
	 
	 	return createVpcEndpointResponse;
	}
}