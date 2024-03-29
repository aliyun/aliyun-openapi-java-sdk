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

import com.aliyuncs.ga.model.v20191120.GetBasicEndpointGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBasicEndpointGroupResponseUnmarshaller {

	public static GetBasicEndpointGroupResponse unmarshall(GetBasicEndpointGroupResponse getBasicEndpointGroupResponse, UnmarshallerContext _ctx) {
		
		getBasicEndpointGroupResponse.setRequestId(_ctx.stringValue("GetBasicEndpointGroupResponse.RequestId"));
		getBasicEndpointGroupResponse.setAcceleratorId(_ctx.stringValue("GetBasicEndpointGroupResponse.AcceleratorId"));
		getBasicEndpointGroupResponse.setEndpointGroupId(_ctx.stringValue("GetBasicEndpointGroupResponse.EndpointGroupId"));
		getBasicEndpointGroupResponse.setName(_ctx.stringValue("GetBasicEndpointGroupResponse.Name"));
		getBasicEndpointGroupResponse.setDescription(_ctx.stringValue("GetBasicEndpointGroupResponse.Description"));
		getBasicEndpointGroupResponse.setEndpointGroupRegion(_ctx.stringValue("GetBasicEndpointGroupResponse.EndpointGroupRegion"));
		getBasicEndpointGroupResponse.setEndpointType(_ctx.stringValue("GetBasicEndpointGroupResponse.EndpointType"));
		getBasicEndpointGroupResponse.setEndpointAddress(_ctx.stringValue("GetBasicEndpointGroupResponse.EndpointAddress"));
		getBasicEndpointGroupResponse.setState(_ctx.stringValue("GetBasicEndpointGroupResponse.State"));
		getBasicEndpointGroupResponse.setEndpointSubAddress(_ctx.stringValue("GetBasicEndpointGroupResponse.EndpointSubAddress"));
	 
	 	return getBasicEndpointGroupResponse;
	}
}