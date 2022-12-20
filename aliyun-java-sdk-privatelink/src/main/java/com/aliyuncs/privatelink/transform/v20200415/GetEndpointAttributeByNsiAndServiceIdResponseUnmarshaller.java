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

import com.aliyuncs.privatelink.model.v20200415.GetEndpointAttributeByNsiAndServiceIdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEndpointAttributeByNsiAndServiceIdResponseUnmarshaller {

	public static GetEndpointAttributeByNsiAndServiceIdResponse unmarshall(GetEndpointAttributeByNsiAndServiceIdResponse getEndpointAttributeByNsiAndServiceIdResponse, UnmarshallerContext _ctx) {
		
		getEndpointAttributeByNsiAndServiceIdResponse.setRequestId(_ctx.stringValue("GetEndpointAttributeByNsiAndServiceIdResponse.RequestId"));
		getEndpointAttributeByNsiAndServiceIdResponse.setEndpointId(_ctx.stringValue("GetEndpointAttributeByNsiAndServiceIdResponse.EndpointId"));
		getEndpointAttributeByNsiAndServiceIdResponse.setPayer(_ctx.stringValue("GetEndpointAttributeByNsiAndServiceIdResponse.Payer"));
		getEndpointAttributeByNsiAndServiceIdResponse.setServiceId(_ctx.stringValue("GetEndpointAttributeByNsiAndServiceIdResponse.ServiceId"));
		getEndpointAttributeByNsiAndServiceIdResponse.setEndpointStatus(_ctx.stringValue("GetEndpointAttributeByNsiAndServiceIdResponse.EndpointStatus"));
		getEndpointAttributeByNsiAndServiceIdResponse.setVpcId(_ctx.stringValue("GetEndpointAttributeByNsiAndServiceIdResponse.VpcId"));
		getEndpointAttributeByNsiAndServiceIdResponse.setEndpointName(_ctx.stringValue("GetEndpointAttributeByNsiAndServiceIdResponse.EndpointName"));
		getEndpointAttributeByNsiAndServiceIdResponse.setEndpointType(_ctx.stringValue("GetEndpointAttributeByNsiAndServiceIdResponse.EndpointType"));
		getEndpointAttributeByNsiAndServiceIdResponse.setServiceName(_ctx.stringValue("GetEndpointAttributeByNsiAndServiceIdResponse.ServiceName"));
		getEndpointAttributeByNsiAndServiceIdResponse.setBandwidth(_ctx.integerValue("GetEndpointAttributeByNsiAndServiceIdResponse.Bandwidth"));
		getEndpointAttributeByNsiAndServiceIdResponse.setRegionId(_ctx.stringValue("GetEndpointAttributeByNsiAndServiceIdResponse.RegionId"));
		getEndpointAttributeByNsiAndServiceIdResponse.setConnectionStatus(_ctx.stringValue("GetEndpointAttributeByNsiAndServiceIdResponse.ConnectionStatus"));
		getEndpointAttributeByNsiAndServiceIdResponse.setZoneAffinityEnabled(_ctx.booleanValue("GetEndpointAttributeByNsiAndServiceIdResponse.ZoneAffinityEnabled"));
		getEndpointAttributeByNsiAndServiceIdResponse.setResourceOwner(_ctx.booleanValue("GetEndpointAttributeByNsiAndServiceIdResponse.ResourceOwner"));
		getEndpointAttributeByNsiAndServiceIdResponse.setZonePrivateIpAddressCount(_ctx.longValue("GetEndpointAttributeByNsiAndServiceIdResponse.ZonePrivateIpAddressCount"));
	 
	 	return getEndpointAttributeByNsiAndServiceIdResponse;
	}
}