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

import com.aliyuncs.ga.model.v20191120.GetBasicEndpointResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBasicEndpointResponseUnmarshaller {

	public static GetBasicEndpointResponse unmarshall(GetBasicEndpointResponse getBasicEndpointResponse, UnmarshallerContext _ctx) {
		
		getBasicEndpointResponse.setRequestId(_ctx.stringValue("GetBasicEndpointResponse.RequestId"));
		getBasicEndpointResponse.setAcceleratorId(_ctx.stringValue("GetBasicEndpointResponse.AcceleratorId"));
		getBasicEndpointResponse.setEndpointGroupId(_ctx.stringValue("GetBasicEndpointResponse.EndpointGroupId"));
		getBasicEndpointResponse.setEndPointId(_ctx.stringValue("GetBasicEndpointResponse.EndPointId"));
		getBasicEndpointResponse.setName(_ctx.stringValue("GetBasicEndpointResponse.Name"));
		getBasicEndpointResponse.setEndpointType(_ctx.stringValue("GetBasicEndpointResponse.EndpointType"));
		getBasicEndpointResponse.setEndpointAddress(_ctx.stringValue("GetBasicEndpointResponse.EndpointAddress"));
		getBasicEndpointResponse.setEndpointSubAddress(_ctx.stringValue("GetBasicEndpointResponse.EndpointSubAddress"));
		getBasicEndpointResponse.setEndpointSubAddressType(_ctx.stringValue("GetBasicEndpointResponse.EndpointSubAddressType"));
		getBasicEndpointResponse.setEndpointZoneId(_ctx.stringValue("GetBasicEndpointResponse.EndpointZoneId"));
		getBasicEndpointResponse.setState(_ctx.stringValue("GetBasicEndpointResponse.State"));
	 
	 	return getBasicEndpointResponse;
	}
}