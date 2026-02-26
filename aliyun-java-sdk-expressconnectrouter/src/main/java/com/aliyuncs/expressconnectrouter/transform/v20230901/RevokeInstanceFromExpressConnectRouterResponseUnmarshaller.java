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

import com.aliyuncs.expressconnectrouter.model.v20230901.RevokeInstanceFromExpressConnectRouterResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RevokeInstanceFromExpressConnectRouterResponseUnmarshaller {

	public static RevokeInstanceFromExpressConnectRouterResponse unmarshall(RevokeInstanceFromExpressConnectRouterResponse revokeInstanceFromExpressConnectRouterResponse, UnmarshallerContext _ctx) {
		
		revokeInstanceFromExpressConnectRouterResponse.setRequestId(_ctx.stringValue("RevokeInstanceFromExpressConnectRouterResponse.RequestId"));
		revokeInstanceFromExpressConnectRouterResponse.setSuccess(_ctx.booleanValue("RevokeInstanceFromExpressConnectRouterResponse.Success"));
		revokeInstanceFromExpressConnectRouterResponse.setCode(_ctx.stringValue("RevokeInstanceFromExpressConnectRouterResponse.Code"));
		revokeInstanceFromExpressConnectRouterResponse.setMessage(_ctx.stringValue("RevokeInstanceFromExpressConnectRouterResponse.Message"));
		revokeInstanceFromExpressConnectRouterResponse.setHttpStatusCode(_ctx.integerValue("RevokeInstanceFromExpressConnectRouterResponse.HttpStatusCode"));
		revokeInstanceFromExpressConnectRouterResponse.setDynamicCode(_ctx.stringValue("RevokeInstanceFromExpressConnectRouterResponse.DynamicCode"));
		revokeInstanceFromExpressConnectRouterResponse.setDynamicMessage(_ctx.stringValue("RevokeInstanceFromExpressConnectRouterResponse.DynamicMessage"));
		revokeInstanceFromExpressConnectRouterResponse.setAccessDeniedDetail(_ctx.stringValue("RevokeInstanceFromExpressConnectRouterResponse.AccessDeniedDetail"));
	 
	 	return revokeInstanceFromExpressConnectRouterResponse;
	}
}