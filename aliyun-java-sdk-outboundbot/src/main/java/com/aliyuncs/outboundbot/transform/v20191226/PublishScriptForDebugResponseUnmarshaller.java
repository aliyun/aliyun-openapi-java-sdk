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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.PublishScriptForDebugResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PublishScriptForDebugResponseUnmarshaller {

	public static PublishScriptForDebugResponse unmarshall(PublishScriptForDebugResponse publishScriptForDebugResponse, UnmarshallerContext _ctx) {
		
		publishScriptForDebugResponse.setRequestId(_ctx.stringValue("PublishScriptForDebugResponse.RequestId"));
		publishScriptForDebugResponse.setSuccess(_ctx.booleanValue("PublishScriptForDebugResponse.Success"));
		publishScriptForDebugResponse.setCode(_ctx.stringValue("PublishScriptForDebugResponse.Code"));
		publishScriptForDebugResponse.setMessage(_ctx.stringValue("PublishScriptForDebugResponse.Message"));
		publishScriptForDebugResponse.setHttpStatusCode(_ctx.integerValue("PublishScriptForDebugResponse.HttpStatusCode"));
	 
	 	return publishScriptForDebugResponse;
	}
}