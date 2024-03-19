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

import com.aliyuncs.expressconnectrouter.model.v20230901.DisableExpressConnectRouterRouteEntriesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisableExpressConnectRouterRouteEntriesResponseUnmarshaller {

	public static DisableExpressConnectRouterRouteEntriesResponse unmarshall(DisableExpressConnectRouterRouteEntriesResponse disableExpressConnectRouterRouteEntriesResponse, UnmarshallerContext _ctx) {
		
		disableExpressConnectRouterRouteEntriesResponse.setRequestId(_ctx.stringValue("DisableExpressConnectRouterRouteEntriesResponse.RequestId"));
		disableExpressConnectRouterRouteEntriesResponse.setSuccess(_ctx.booleanValue("DisableExpressConnectRouterRouteEntriesResponse.Success"));
		disableExpressConnectRouterRouteEntriesResponse.setCode(_ctx.stringValue("DisableExpressConnectRouterRouteEntriesResponse.Code"));
		disableExpressConnectRouterRouteEntriesResponse.setMessage(_ctx.stringValue("DisableExpressConnectRouterRouteEntriesResponse.Message"));
		disableExpressConnectRouterRouteEntriesResponse.setHttpStatusCode(_ctx.integerValue("DisableExpressConnectRouterRouteEntriesResponse.HttpStatusCode"));
		disableExpressConnectRouterRouteEntriesResponse.setDynamicCode(_ctx.stringValue("DisableExpressConnectRouterRouteEntriesResponse.DynamicCode"));
		disableExpressConnectRouterRouteEntriesResponse.setDynamicMessage(_ctx.stringValue("DisableExpressConnectRouterRouteEntriesResponse.DynamicMessage"));
		disableExpressConnectRouterRouteEntriesResponse.setAccessDeniedDetail(_ctx.stringValue("DisableExpressConnectRouterRouteEntriesResponse.AccessDeniedDetail"));
	 
	 	return disableExpressConnectRouterRouteEntriesResponse;
	}
}