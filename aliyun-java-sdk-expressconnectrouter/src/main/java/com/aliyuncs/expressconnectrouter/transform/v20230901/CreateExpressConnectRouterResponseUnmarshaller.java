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

import com.aliyuncs.expressconnectrouter.model.v20230901.CreateExpressConnectRouterResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateExpressConnectRouterResponseUnmarshaller {

	public static CreateExpressConnectRouterResponse unmarshall(CreateExpressConnectRouterResponse createExpressConnectRouterResponse, UnmarshallerContext _ctx) {
		
		createExpressConnectRouterResponse.setRequestId(_ctx.stringValue("CreateExpressConnectRouterResponse.RequestId"));
		createExpressConnectRouterResponse.setSuccess(_ctx.booleanValue("CreateExpressConnectRouterResponse.Success"));
		createExpressConnectRouterResponse.setCode(_ctx.stringValue("CreateExpressConnectRouterResponse.Code"));
		createExpressConnectRouterResponse.setMessage(_ctx.stringValue("CreateExpressConnectRouterResponse.Message"));
		createExpressConnectRouterResponse.setHttpStatusCode(_ctx.integerValue("CreateExpressConnectRouterResponse.HttpStatusCode"));
		createExpressConnectRouterResponse.setDynamicCode(_ctx.stringValue("CreateExpressConnectRouterResponse.DynamicCode"));
		createExpressConnectRouterResponse.setDynamicMessage(_ctx.stringValue("CreateExpressConnectRouterResponse.DynamicMessage"));
		createExpressConnectRouterResponse.setAccessDeniedDetail(_ctx.stringValue("CreateExpressConnectRouterResponse.AccessDeniedDetail"));
		createExpressConnectRouterResponse.setEcrId(_ctx.stringValue("CreateExpressConnectRouterResponse.EcrId"));
	 
	 	return createExpressConnectRouterResponse;
	}
}