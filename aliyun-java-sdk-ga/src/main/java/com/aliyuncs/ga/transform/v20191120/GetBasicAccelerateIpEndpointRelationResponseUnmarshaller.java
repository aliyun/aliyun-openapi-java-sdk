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

import com.aliyuncs.ga.model.v20191120.GetBasicAccelerateIpEndpointRelationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBasicAccelerateIpEndpointRelationResponseUnmarshaller {

	public static GetBasicAccelerateIpEndpointRelationResponse unmarshall(GetBasicAccelerateIpEndpointRelationResponse getBasicAccelerateIpEndpointRelationResponse, UnmarshallerContext _ctx) {
		
		getBasicAccelerateIpEndpointRelationResponse.setRequestId(_ctx.stringValue("GetBasicAccelerateIpEndpointRelationResponse.RequestId"));
		getBasicAccelerateIpEndpointRelationResponse.setEndpointId(_ctx.stringValue("GetBasicAccelerateIpEndpointRelationResponse.EndpointId"));
		getBasicAccelerateIpEndpointRelationResponse.setEndpointName(_ctx.stringValue("GetBasicAccelerateIpEndpointRelationResponse.EndpointName"));
		getBasicAccelerateIpEndpointRelationResponse.setEndpointType(_ctx.stringValue("GetBasicAccelerateIpEndpointRelationResponse.EndpointType"));
		getBasicAccelerateIpEndpointRelationResponse.setEndpointAddress(_ctx.stringValue("GetBasicAccelerateIpEndpointRelationResponse.EndpointAddress"));
		getBasicAccelerateIpEndpointRelationResponse.setEndpointSubAddress(_ctx.stringValue("GetBasicAccelerateIpEndpointRelationResponse.EndpointSubAddress"));
		getBasicAccelerateIpEndpointRelationResponse.setEndpointSubAddressType(_ctx.stringValue("GetBasicAccelerateIpEndpointRelationResponse.EndpointSubAddressType"));
		getBasicAccelerateIpEndpointRelationResponse.setEndpointZoneId(_ctx.stringValue("GetBasicAccelerateIpEndpointRelationResponse.EndpointZoneId"));
		getBasicAccelerateIpEndpointRelationResponse.setAccelerateIpId(_ctx.stringValue("GetBasicAccelerateIpEndpointRelationResponse.AccelerateIpId"));
		getBasicAccelerateIpEndpointRelationResponse.setIpAddress(_ctx.stringValue("GetBasicAccelerateIpEndpointRelationResponse.IpAddress"));
		getBasicAccelerateIpEndpointRelationResponse.setState(_ctx.stringValue("GetBasicAccelerateIpEndpointRelationResponse.State"));
		getBasicAccelerateIpEndpointRelationResponse.setAcceleratorId(_ctx.stringValue("GetBasicAccelerateIpEndpointRelationResponse.AcceleratorId"));
	 
	 	return getBasicAccelerateIpEndpointRelationResponse;
	}
}