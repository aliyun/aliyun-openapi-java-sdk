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

import com.aliyuncs.outboundbot.model.v20191226.WithdrawScriptResponse;
import com.aliyuncs.outboundbot.model.v20191226.WithdrawScriptResponse.Script;
import com.aliyuncs.transform.UnmarshallerContext;


public class WithdrawScriptResponseUnmarshaller {

	public static WithdrawScriptResponse unmarshall(WithdrawScriptResponse withdrawScriptResponse, UnmarshallerContext _ctx) {
		
		withdrawScriptResponse.setRequestId(_ctx.stringValue("WithdrawScriptResponse.RequestId"));
		withdrawScriptResponse.setCode(_ctx.stringValue("WithdrawScriptResponse.Code"));
		withdrawScriptResponse.setHttpStatusCode(_ctx.integerValue("WithdrawScriptResponse.HttpStatusCode"));
		withdrawScriptResponse.setMessage(_ctx.stringValue("WithdrawScriptResponse.Message"));
		withdrawScriptResponse.setSuccess(_ctx.booleanValue("WithdrawScriptResponse.Success"));

		Script script = new Script();
		script.setDebugStatus(_ctx.stringValue("WithdrawScriptResponse.Script.DebugStatus"));
		script.setIndustry(_ctx.stringValue("WithdrawScriptResponse.Script.Industry"));
		script.setIsDebugDrafted(_ctx.booleanValue("WithdrawScriptResponse.Script.IsDebugDrafted"));
		script.setIsDrafted(_ctx.booleanValue("WithdrawScriptResponse.Script.IsDrafted"));
		script.setScene(_ctx.stringValue("WithdrawScriptResponse.Script.Scene"));
		script.setScriptDescription(_ctx.stringValue("WithdrawScriptResponse.Script.ScriptDescription"));
		script.setScriptId(_ctx.stringValue("WithdrawScriptResponse.Script.ScriptId"));
		script.setScriptName(_ctx.stringValue("WithdrawScriptResponse.Script.ScriptName"));
		script.setStatus(_ctx.stringValue("WithdrawScriptResponse.Script.Status"));
		script.setUpdateTime(_ctx.longValue("WithdrawScriptResponse.Script.UpdateTime"));
		withdrawScriptResponse.setScript(script);
	 
	 	return withdrawScriptResponse;
	}
}