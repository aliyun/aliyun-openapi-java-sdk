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

package com.aliyuncs.scsp.transform.v20200702;

import com.aliyuncs.scsp.model.v20200702.CreateEntityIvrRouteResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateEntityIvrRouteResponseUnmarshaller {

	public static CreateEntityIvrRouteResponse unmarshall(CreateEntityIvrRouteResponse createEntityIvrRouteResponse, UnmarshallerContext _ctx) {
		
		createEntityIvrRouteResponse.setRequestId(_ctx.stringValue("CreateEntityIvrRouteResponse.RequestId"));
		createEntityIvrRouteResponse.setCode(_ctx.stringValue("CreateEntityIvrRouteResponse.Code"));
		createEntityIvrRouteResponse.setMessage(_ctx.stringValue("CreateEntityIvrRouteResponse.Message"));
		createEntityIvrRouteResponse.setSuccess(_ctx.booleanValue("CreateEntityIvrRouteResponse.Success"));
	 
	 	return createEntityIvrRouteResponse;
	}
}