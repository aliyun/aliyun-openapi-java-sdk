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

import com.aliyuncs.ga.model.v20191120.CreateBasicEndpointResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateBasicEndpointResponseUnmarshaller {

	public static CreateBasicEndpointResponse unmarshall(CreateBasicEndpointResponse createBasicEndpointResponse, UnmarshallerContext _ctx) {
		
		createBasicEndpointResponse.setRequestId(_ctx.stringValue("CreateBasicEndpointResponse.RequestId"));
		createBasicEndpointResponse.setEndpointGroupId(_ctx.stringValue("CreateBasicEndpointResponse.EndpointGroupId"));
		createBasicEndpointResponse.setEndpointId(_ctx.stringValue("CreateBasicEndpointResponse.EndpointId"));
	 
	 	return createBasicEndpointResponse;
	}
}