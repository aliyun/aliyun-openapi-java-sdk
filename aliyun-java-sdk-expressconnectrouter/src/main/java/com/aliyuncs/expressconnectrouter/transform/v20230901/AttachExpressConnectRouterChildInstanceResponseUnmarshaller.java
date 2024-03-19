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

import com.aliyuncs.expressconnectrouter.model.v20230901.AttachExpressConnectRouterChildInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AttachExpressConnectRouterChildInstanceResponseUnmarshaller {

	public static AttachExpressConnectRouterChildInstanceResponse unmarshall(AttachExpressConnectRouterChildInstanceResponse attachExpressConnectRouterChildInstanceResponse, UnmarshallerContext _ctx) {
		
		attachExpressConnectRouterChildInstanceResponse.setRequestId(_ctx.stringValue("AttachExpressConnectRouterChildInstanceResponse.RequestId"));
		attachExpressConnectRouterChildInstanceResponse.setSuccess(_ctx.booleanValue("AttachExpressConnectRouterChildInstanceResponse.Success"));
		attachExpressConnectRouterChildInstanceResponse.setCode(_ctx.stringValue("AttachExpressConnectRouterChildInstanceResponse.Code"));
		attachExpressConnectRouterChildInstanceResponse.setMessage(_ctx.stringValue("AttachExpressConnectRouterChildInstanceResponse.Message"));
		attachExpressConnectRouterChildInstanceResponse.setHttpStatusCode(_ctx.integerValue("AttachExpressConnectRouterChildInstanceResponse.HttpStatusCode"));
		attachExpressConnectRouterChildInstanceResponse.setDynamicCode(_ctx.stringValue("AttachExpressConnectRouterChildInstanceResponse.DynamicCode"));
		attachExpressConnectRouterChildInstanceResponse.setDynamicMessage(_ctx.stringValue("AttachExpressConnectRouterChildInstanceResponse.DynamicMessage"));
		attachExpressConnectRouterChildInstanceResponse.setAccessDeniedDetail(_ctx.stringValue("AttachExpressConnectRouterChildInstanceResponse.AccessDeniedDetail"));
	 
	 	return attachExpressConnectRouterChildInstanceResponse;
	}
}