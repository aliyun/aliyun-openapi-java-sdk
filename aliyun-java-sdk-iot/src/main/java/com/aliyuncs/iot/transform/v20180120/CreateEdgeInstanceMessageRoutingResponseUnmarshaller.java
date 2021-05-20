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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.CreateEdgeInstanceMessageRoutingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateEdgeInstanceMessageRoutingResponseUnmarshaller {

	public static CreateEdgeInstanceMessageRoutingResponse unmarshall(CreateEdgeInstanceMessageRoutingResponse createEdgeInstanceMessageRoutingResponse, UnmarshallerContext _ctx) {
		
		createEdgeInstanceMessageRoutingResponse.setRequestId(_ctx.stringValue("CreateEdgeInstanceMessageRoutingResponse.RequestId"));
		createEdgeInstanceMessageRoutingResponse.setSuccess(_ctx.booleanValue("CreateEdgeInstanceMessageRoutingResponse.Success"));
		createEdgeInstanceMessageRoutingResponse.setCode(_ctx.stringValue("CreateEdgeInstanceMessageRoutingResponse.Code"));
		createEdgeInstanceMessageRoutingResponse.setErrorMessage(_ctx.stringValue("CreateEdgeInstanceMessageRoutingResponse.ErrorMessage"));
		createEdgeInstanceMessageRoutingResponse.setRouteId(_ctx.longValue("CreateEdgeInstanceMessageRoutingResponse.RouteId"));
	 
	 	return createEdgeInstanceMessageRoutingResponse;
	}
}