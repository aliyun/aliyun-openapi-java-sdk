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

package com.aliyuncs.expressconnectrouter.transform.v20230901;

import com.aliyuncs.expressconnectrouter.model.v20230901.ForceDeleteExpressConnectRouterResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ForceDeleteExpressConnectRouterResponseUnmarshaller {

	public static ForceDeleteExpressConnectRouterResponse unmarshall(ForceDeleteExpressConnectRouterResponse forceDeleteExpressConnectRouterResponse, UnmarshallerContext _ctx) {
		
		forceDeleteExpressConnectRouterResponse.setRequestId(_ctx.stringValue("ForceDeleteExpressConnectRouterResponse.RequestId"));
		forceDeleteExpressConnectRouterResponse.setSuccess(_ctx.booleanValue("ForceDeleteExpressConnectRouterResponse.Success"));
		forceDeleteExpressConnectRouterResponse.setCode(_ctx.stringValue("ForceDeleteExpressConnectRouterResponse.Code"));
		forceDeleteExpressConnectRouterResponse.setMessage(_ctx.stringValue("ForceDeleteExpressConnectRouterResponse.Message"));
		forceDeleteExpressConnectRouterResponse.setHttpStatusCode(_ctx.integerValue("ForceDeleteExpressConnectRouterResponse.HttpStatusCode"));
		forceDeleteExpressConnectRouterResponse.setDynamicCode(_ctx.stringValue("ForceDeleteExpressConnectRouterResponse.DynamicCode"));
		forceDeleteExpressConnectRouterResponse.setDynamicMessage(_ctx.stringValue("ForceDeleteExpressConnectRouterResponse.DynamicMessage"));
		forceDeleteExpressConnectRouterResponse.setAccessDeniedDetail(_ctx.stringValue("ForceDeleteExpressConnectRouterResponse.AccessDeniedDetail"));
	 
	 	return forceDeleteExpressConnectRouterResponse;
	}
}