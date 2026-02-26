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

import com.aliyuncs.expressconnectrouter.model.v20230901.DetachExpressConnectRouterChildInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetachExpressConnectRouterChildInstanceResponseUnmarshaller {

	public static DetachExpressConnectRouterChildInstanceResponse unmarshall(DetachExpressConnectRouterChildInstanceResponse detachExpressConnectRouterChildInstanceResponse, UnmarshallerContext _ctx) {
		
		detachExpressConnectRouterChildInstanceResponse.setRequestId(_ctx.stringValue("DetachExpressConnectRouterChildInstanceResponse.RequestId"));
		detachExpressConnectRouterChildInstanceResponse.setSuccess(_ctx.booleanValue("DetachExpressConnectRouterChildInstanceResponse.Success"));
		detachExpressConnectRouterChildInstanceResponse.setCode(_ctx.stringValue("DetachExpressConnectRouterChildInstanceResponse.Code"));
		detachExpressConnectRouterChildInstanceResponse.setMessage(_ctx.stringValue("DetachExpressConnectRouterChildInstanceResponse.Message"));
		detachExpressConnectRouterChildInstanceResponse.setHttpStatusCode(_ctx.integerValue("DetachExpressConnectRouterChildInstanceResponse.HttpStatusCode"));
		detachExpressConnectRouterChildInstanceResponse.setDynamicCode(_ctx.stringValue("DetachExpressConnectRouterChildInstanceResponse.DynamicCode"));
		detachExpressConnectRouterChildInstanceResponse.setDynamicMessage(_ctx.stringValue("DetachExpressConnectRouterChildInstanceResponse.DynamicMessage"));
		detachExpressConnectRouterChildInstanceResponse.setAccessDeniedDetail(_ctx.stringValue("DetachExpressConnectRouterChildInstanceResponse.AccessDeniedDetail"));
	 
	 	return detachExpressConnectRouterChildInstanceResponse;
	}
}