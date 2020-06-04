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

import com.aliyuncs.outboundbot.model.v20191226.WithdrawScriptReviewResponse;
import com.aliyuncs.outboundbot.model.v20191226.WithdrawScriptReviewResponse.Script;
import com.aliyuncs.transform.UnmarshallerContext;


public class WithdrawScriptReviewResponseUnmarshaller {

	public static WithdrawScriptReviewResponse unmarshall(WithdrawScriptReviewResponse withdrawScriptReviewResponse, UnmarshallerContext _ctx) {
		
		withdrawScriptReviewResponse.setRequestId(_ctx.stringValue("WithdrawScriptReviewResponse.RequestId"));
		withdrawScriptReviewResponse.setCode(_ctx.stringValue("WithdrawScriptReviewResponse.Code"));
		withdrawScriptReviewResponse.setHttpStatusCode(_ctx.integerValue("WithdrawScriptReviewResponse.HttpStatusCode"));
		withdrawScriptReviewResponse.setMessage(_ctx.stringValue("WithdrawScriptReviewResponse.Message"));
		withdrawScriptReviewResponse.setSuccess(_ctx.booleanValue("WithdrawScriptReviewResponse.Success"));

		Script script = new Script();
		script.setDebugStatus(_ctx.stringValue("WithdrawScriptReviewResponse.Script.DebugStatus"));
		script.setIndustry(_ctx.stringValue("WithdrawScriptReviewResponse.Script.Industry"));
		script.setIsDebugDrafted(_ctx.booleanValue("WithdrawScriptReviewResponse.Script.IsDebugDrafted"));
		script.setIsDrafted(_ctx.booleanValue("WithdrawScriptReviewResponse.Script.IsDrafted"));
		script.setScene(_ctx.stringValue("WithdrawScriptReviewResponse.Script.Scene"));
		script.setScriptDescription(_ctx.stringValue("WithdrawScriptReviewResponse.Script.ScriptDescription"));
		script.setScriptId(_ctx.stringValue("WithdrawScriptReviewResponse.Script.ScriptId"));
		script.setScriptName(_ctx.stringValue("WithdrawScriptReviewResponse.Script.ScriptName"));
		script.setStatus(_ctx.stringValue("WithdrawScriptReviewResponse.Script.Status"));
		script.setUpdateTime(_ctx.longValue("WithdrawScriptReviewResponse.Script.UpdateTime"));
		withdrawScriptReviewResponse.setScript(script);
	 
	 	return withdrawScriptReviewResponse;
	}
}