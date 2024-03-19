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

import com.aliyuncs.expressconnectrouter.model.v20230901.ModifyExpressConnectRouterResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyExpressConnectRouterResponseUnmarshaller {

	public static ModifyExpressConnectRouterResponse unmarshall(ModifyExpressConnectRouterResponse modifyExpressConnectRouterResponse, UnmarshallerContext _ctx) {
		
		modifyExpressConnectRouterResponse.setRequestId(_ctx.stringValue("ModifyExpressConnectRouterResponse.RequestId"));
		modifyExpressConnectRouterResponse.setSuccess(_ctx.booleanValue("ModifyExpressConnectRouterResponse.Success"));
		modifyExpressConnectRouterResponse.setCode(_ctx.stringValue("ModifyExpressConnectRouterResponse.Code"));
		modifyExpressConnectRouterResponse.setMessage(_ctx.stringValue("ModifyExpressConnectRouterResponse.Message"));
		modifyExpressConnectRouterResponse.setHttpStatusCode(_ctx.integerValue("ModifyExpressConnectRouterResponse.HttpStatusCode"));
		modifyExpressConnectRouterResponse.setDynamicCode(_ctx.stringValue("ModifyExpressConnectRouterResponse.DynamicCode"));
		modifyExpressConnectRouterResponse.setDynamicMessage(_ctx.stringValue("ModifyExpressConnectRouterResponse.DynamicMessage"));
		modifyExpressConnectRouterResponse.setAccessDeniedDetail(_ctx.stringValue("ModifyExpressConnectRouterResponse.AccessDeniedDetail"));
	 
	 	return modifyExpressConnectRouterResponse;
	}
}