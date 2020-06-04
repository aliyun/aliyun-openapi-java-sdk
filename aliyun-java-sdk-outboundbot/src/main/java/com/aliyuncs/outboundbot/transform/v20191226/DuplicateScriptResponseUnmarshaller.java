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

import com.aliyuncs.outboundbot.model.v20191226.DuplicateScriptResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DuplicateScriptResponseUnmarshaller {

	public static DuplicateScriptResponse unmarshall(DuplicateScriptResponse duplicateScriptResponse, UnmarshallerContext _ctx) {
		
		duplicateScriptResponse.setRequestId(_ctx.stringValue("DuplicateScriptResponse.RequestId"));
		duplicateScriptResponse.setCode(_ctx.stringValue("DuplicateScriptResponse.Code"));
		duplicateScriptResponse.setHttpStatusCode(_ctx.integerValue("DuplicateScriptResponse.HttpStatusCode"));
		duplicateScriptResponse.setMessage(_ctx.stringValue("DuplicateScriptResponse.Message"));
		duplicateScriptResponse.setScriptId(_ctx.stringValue("DuplicateScriptResponse.ScriptId"));
		duplicateScriptResponse.setSuccess(_ctx.booleanValue("DuplicateScriptResponse.Success"));
	 
	 	return duplicateScriptResponse;
	}
}