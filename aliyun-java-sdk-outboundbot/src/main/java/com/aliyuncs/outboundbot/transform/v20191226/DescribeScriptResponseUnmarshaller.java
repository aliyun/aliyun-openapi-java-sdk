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

import com.aliyuncs.outboundbot.model.v20191226.DescribeScriptResponse;
import com.aliyuncs.outboundbot.model.v20191226.DescribeScriptResponse.Script;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScriptResponseUnmarshaller {

	public static DescribeScriptResponse unmarshall(DescribeScriptResponse describeScriptResponse, UnmarshallerContext _ctx) {
		
		describeScriptResponse.setRequestId(_ctx.stringValue("DescribeScriptResponse.RequestId"));
		describeScriptResponse.setCode(_ctx.stringValue("DescribeScriptResponse.Code"));
		describeScriptResponse.setHttpStatusCode(_ctx.integerValue("DescribeScriptResponse.HttpStatusCode"));
		describeScriptResponse.setMessage(_ctx.stringValue("DescribeScriptResponse.Message"));
		describeScriptResponse.setSuccess(_ctx.booleanValue("DescribeScriptResponse.Success"));
		describeScriptResponse.setChatbotId(_ctx.stringValue("DescribeScriptResponse.ChatbotId"));
		describeScriptResponse.setAsrConfig(_ctx.stringValue("DescribeScriptResponse.AsrConfig"));
		describeScriptResponse.setTtsConfig(_ctx.stringValue("DescribeScriptResponse.TtsConfig"));

		Script script = new Script();
		script.setDebugStatus(_ctx.stringValue("DescribeScriptResponse.Script.DebugStatus"));
		script.setIndustry(_ctx.stringValue("DescribeScriptResponse.Script.Industry"));
		script.setIsDebugDrafted(_ctx.booleanValue("DescribeScriptResponse.Script.IsDebugDrafted"));
		script.setIsDrafted(_ctx.booleanValue("DescribeScriptResponse.Script.IsDrafted"));
		script.setScene(_ctx.stringValue("DescribeScriptResponse.Script.Scene"));
		script.setScriptDescription(_ctx.stringValue("DescribeScriptResponse.Script.ScriptDescription"));
		script.setScriptId(_ctx.stringValue("DescribeScriptResponse.Script.ScriptId"));
		script.setScriptName(_ctx.stringValue("DescribeScriptResponse.Script.ScriptName"));
		script.setStatus(_ctx.stringValue("DescribeScriptResponse.Script.Status"));
		script.setUpdateTime(_ctx.longValue("DescribeScriptResponse.Script.UpdateTime"));
		script.setChatbotId(_ctx.stringValue("DescribeScriptResponse.Script.ChatbotId"));
		script.setAsrConfig(_ctx.stringValue("DescribeScriptResponse.Script.AsrConfig"));
		script.setTtsConfig(_ctx.stringValue("DescribeScriptResponse.Script.TtsConfig"));
		script.setMiniPlaybackConfigEnabled(_ctx.booleanValue("DescribeScriptResponse.Script.MiniPlaybackConfigEnabled"));
		describeScriptResponse.setScript(script);
	 
	 	return describeScriptResponse;
	}
}