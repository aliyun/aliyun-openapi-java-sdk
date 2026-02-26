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

import com.aliyuncs.expressconnectrouter.model.v20230901.EnableExpressConnectRouterRouteEntriesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableExpressConnectRouterRouteEntriesResponseUnmarshaller {

	public static EnableExpressConnectRouterRouteEntriesResponse unmarshall(EnableExpressConnectRouterRouteEntriesResponse enableExpressConnectRouterRouteEntriesResponse, UnmarshallerContext _ctx) {
		
		enableExpressConnectRouterRouteEntriesResponse.setRequestId(_ctx.stringValue("EnableExpressConnectRouterRouteEntriesResponse.RequestId"));
		enableExpressConnectRouterRouteEntriesResponse.setSuccess(_ctx.booleanValue("EnableExpressConnectRouterRouteEntriesResponse.Success"));
		enableExpressConnectRouterRouteEntriesResponse.setCode(_ctx.stringValue("EnableExpressConnectRouterRouteEntriesResponse.Code"));
		enableExpressConnectRouterRouteEntriesResponse.setMessage(_ctx.stringValue("EnableExpressConnectRouterRouteEntriesResponse.Message"));
		enableExpressConnectRouterRouteEntriesResponse.setHttpStatusCode(_ctx.integerValue("EnableExpressConnectRouterRouteEntriesResponse.HttpStatusCode"));
		enableExpressConnectRouterRouteEntriesResponse.setDynamicCode(_ctx.stringValue("EnableExpressConnectRouterRouteEntriesResponse.DynamicCode"));
		enableExpressConnectRouterRouteEntriesResponse.setDynamicMessage(_ctx.stringValue("EnableExpressConnectRouterRouteEntriesResponse.DynamicMessage"));
		enableExpressConnectRouterRouteEntriesResponse.setAccessDeniedDetail(_ctx.stringValue("EnableExpressConnectRouterRouteEntriesResponse.AccessDeniedDetail"));
	 
	 	return enableExpressConnectRouterRouteEntriesResponse;
	}
}