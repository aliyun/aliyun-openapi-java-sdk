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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.PublishScriptResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PublishScriptResponseUnmarshaller {

	public static PublishScriptResponse unmarshall(PublishScriptResponse publishScriptResponse, UnmarshallerContext _ctx) {
		
		publishScriptResponse.setRequestId(_ctx.stringValue("PublishScriptResponse.RequestId"));
		publishScriptResponse.setSuccess(_ctx.booleanValue("PublishScriptResponse.Success"));
		publishScriptResponse.setCode(_ctx.stringValue("PublishScriptResponse.Code"));
		publishScriptResponse.setErrorMessage(_ctx.stringValue("PublishScriptResponse.ErrorMessage"));
		publishScriptResponse.setSyntaxErrorMsg(_ctx.stringValue("PublishScriptResponse.SyntaxErrorMsg"));
	 
	 	return publishScriptResponse;
	}
}