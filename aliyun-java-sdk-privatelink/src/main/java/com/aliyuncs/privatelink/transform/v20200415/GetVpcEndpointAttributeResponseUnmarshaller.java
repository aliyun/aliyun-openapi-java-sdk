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

import com.aliyuncs.privatelink.model.v20200415.GetVpcEndpointAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVpcEndpointAttributeResponseUnmarshaller {

	public static GetVpcEndpointAttributeResponse unmarshall(GetVpcEndpointAttributeResponse getVpcEndpointAttributeResponse, UnmarshallerContext _ctx) {
		
		getVpcEndpointAttributeResponse.setRequestId(_ctx.stringValue("GetVpcEndpointAttributeResponse.RequestId"));
		getVpcEndpointAttributeResponse.setPayer(_ctx.stringValue("GetVpcEndpointAttributeResponse.Payer"));
		getVpcEndpointAttributeResponse.setEndpointDomain(_ctx.stringValue("GetVpcEndpointAttributeResponse.EndpointDomain"));
		getVpcEndpointAttributeResponse.setResourceOwner(_ctx.booleanValue("GetVpcEndpointAttributeResponse.ResourceOwner"));
		getVpcEndpointAttributeResponse.setCreateTime(_ctx.stringValue("GetVpcEndpointAttributeResponse.CreateTime"));
		getVpcEndpointAttributeResponse.setEndpointBusinessStatus(_ctx.stringValue("GetVpcEndpointAttributeResponse.EndpointBusinessStatus"));
		getVpcEndpointAttributeResponse.setEndpointDescription(_ctx.stringValue("GetVpcEndpointAttributeResponse.EndpointDescription"));
		getVpcEndpointAttributeResponse.setServiceId(_ctx.stringValue("GetVpcEndpointAttributeResponse.ServiceId"));
		getVpcEndpointAttributeResponse.setEndpointStatus(_ctx.stringValue("GetVpcEndpointAttributeResponse.EndpointStatus"));
		getVpcEndpointAttributeResponse.setEndpointName(_ctx.stringValue("GetVpcEndpointAttributeResponse.EndpointName"));
		getVpcEndpointAttributeResponse.setVpcId(_ctx.stringValue("GetVpcEndpointAttributeResponse.VpcId"));
		getVpcEndpointAttributeResponse.setServiceName(_ctx.stringValue("GetVpcEndpointAttributeResponse.ServiceName"));
		getVpcEndpointAttributeResponse.setEndpointId(_ctx.stringValue("GetVpcEndpointAttributeResponse.EndpointId"));
		getVpcEndpointAttributeResponse.setBandwidth(_ctx.integerValue("GetVpcEndpointAttributeResponse.Bandwidth"));
		getVpcEndpointAttributeResponse.setRegionId(_ctx.stringValue("GetVpcEndpointAttributeResponse.RegionId"));
		getVpcEndpointAttributeResponse.setConnectionStatus(_ctx.stringValue("GetVpcEndpointAttributeResponse.ConnectionStatus"));
		getVpcEndpointAttributeResponse.setZoneAffinityEnabled(_ctx.booleanValue("GetVpcEndpointAttributeResponse.ZoneAffinityEnabled"));
	 
	 	return getVpcEndpointAttributeResponse;
	}
}