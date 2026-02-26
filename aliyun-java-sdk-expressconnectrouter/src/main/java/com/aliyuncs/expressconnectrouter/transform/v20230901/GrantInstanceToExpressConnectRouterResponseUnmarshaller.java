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

import com.aliyuncs.expressconnectrouter.model.v20230901.GrantInstanceToExpressConnectRouterResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GrantInstanceToExpressConnectRouterResponseUnmarshaller {

	public static GrantInstanceToExpressConnectRouterResponse unmarshall(GrantInstanceToExpressConnectRouterResponse grantInstanceToExpressConnectRouterResponse, UnmarshallerContext _ctx) {
		
		grantInstanceToExpressConnectRouterResponse.setRequestId(_ctx.stringValue("GrantInstanceToExpressConnectRouterResponse.RequestId"));
		grantInstanceToExpressConnectRouterResponse.setSuccess(_ctx.booleanValue("GrantInstanceToExpressConnectRouterResponse.Success"));
		grantInstanceToExpressConnectRouterResponse.setCode(_ctx.stringValue("GrantInstanceToExpressConnectRouterResponse.Code"));
		grantInstanceToExpressConnectRouterResponse.setMessage(_ctx.stringValue("GrantInstanceToExpressConnectRouterResponse.Message"));
		grantInstanceToExpressConnectRouterResponse.setHttpStatusCode(_ctx.integerValue("GrantInstanceToExpressConnectRouterResponse.HttpStatusCode"));
		grantInstanceToExpressConnectRouterResponse.setDynamicCode(_ctx.stringValue("GrantInstanceToExpressConnectRouterResponse.DynamicCode"));
		grantInstanceToExpressConnectRouterResponse.setDynamicMessage(_ctx.stringValue("GrantInstanceToExpressConnectRouterResponse.DynamicMessage"));
		grantInstanceToExpressConnectRouterResponse.setAccessDeniedDetail(_ctx.stringValue("GrantInstanceToExpressConnectRouterResponse.AccessDeniedDetail"));
	 
	 	return grantInstanceToExpressConnectRouterResponse;
	}
}