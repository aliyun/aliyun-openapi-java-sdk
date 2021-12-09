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

package com.aliyuncs.sae.transform.v20190506;

import com.aliyuncs.sae.model.v20190506.UpdateGreyTagRouteResponse;
import com.aliyuncs.sae.model.v20190506.UpdateGreyTagRouteResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateGreyTagRouteResponseUnmarshaller {

	public static UpdateGreyTagRouteResponse unmarshall(UpdateGreyTagRouteResponse updateGreyTagRouteResponse, UnmarshallerContext _ctx) {
		
		updateGreyTagRouteResponse.setRequestId(_ctx.stringValue("UpdateGreyTagRouteResponse.RequestId"));
		updateGreyTagRouteResponse.setMessage(_ctx.stringValue("UpdateGreyTagRouteResponse.Message"));
		updateGreyTagRouteResponse.setTraceId(_ctx.stringValue("UpdateGreyTagRouteResponse.TraceId"));
		updateGreyTagRouteResponse.setErrorCode(_ctx.stringValue("UpdateGreyTagRouteResponse.ErrorCode"));
		updateGreyTagRouteResponse.setCode(_ctx.stringValue("UpdateGreyTagRouteResponse.Code"));
		updateGreyTagRouteResponse.setSuccess(_ctx.booleanValue("UpdateGreyTagRouteResponse.Success"));

		Data data = new Data();
		data.setGreyTagRouteId(_ctx.longValue("UpdateGreyTagRouteResponse.Data.GreyTagRouteId"));
		updateGreyTagRouteResponse.setData(data);
	 
	 	return updateGreyTagRouteResponse;
	}
}