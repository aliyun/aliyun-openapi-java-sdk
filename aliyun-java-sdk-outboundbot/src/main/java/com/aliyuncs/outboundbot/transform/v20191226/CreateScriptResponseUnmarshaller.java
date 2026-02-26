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

import com.aliyuncs.outboundbot.model.v20191226.CreateScriptResponse;
import com.aliyuncs.outboundbot.model.v20191226.CreateScriptResponse.Script;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateScriptResponseUnmarshaller {

	public static CreateScriptResponse unmarshall(CreateScriptResponse createScriptResponse, UnmarshallerContext _ctx) {
		
		createScriptResponse.setRequestId(_ctx.stringValue("CreateScriptResponse.RequestId"));
		createScriptResponse.setHttpStatusCode(_ctx.integerValue("CreateScriptResponse.HttpStatusCode"));
		createScriptResponse.setSuccess(_ctx.booleanValue("CreateScriptResponse.Success"));
		createScriptResponse.setChatbotId(_ctx.stringValue("CreateScriptResponse.ChatbotId"));
		createScriptResponse.setCode(_ctx.stringValue("CreateScriptResponse.Code"));
		createScriptResponse.setMessage(_ctx.stringValue("CreateScriptResponse.Message"));

		Script script = new Script();
		script.setStatus(_ctx.stringValue("CreateScriptResponse.Script.Status"));
		script.setUpdateTime(_ctx.longValue("CreateScriptResponse.Script.UpdateTime"));
		script.setIndustry(_ctx.stringValue("CreateScriptResponse.Script.Industry"));
		script.setScriptDescription(_ctx.stringValue("CreateScriptResponse.Script.ScriptDescription"));
		script.setIsDrafted(_ctx.booleanValue("CreateScriptResponse.Script.IsDrafted"));
		script.setDebugStatus(_ctx.stringValue("CreateScriptResponse.Script.DebugStatus"));
		script.setScriptId(_ctx.stringValue("CreateScriptResponse.Script.ScriptId"));
		script.setIsDebugDrafted(_ctx.booleanValue("CreateScriptResponse.Script.IsDebugDrafted"));
		script.setScriptName(_ctx.stringValue("CreateScriptResponse.Script.ScriptName"));
		script.setScene(_ctx.stringValue("CreateScriptResponse.Script.Scene"));
		script.setNluEngine(_ctx.stringValue("CreateScriptResponse.Script.NluEngine"));
		script.setNluAccessType(_ctx.stringValue("CreateScriptResponse.Script.NluAccessType"));
		createScriptResponse.setScript(script);
	 
	 	return createScriptResponse;
	}
}