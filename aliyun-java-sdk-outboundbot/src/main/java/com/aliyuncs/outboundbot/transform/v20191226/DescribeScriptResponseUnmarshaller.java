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
		describeScriptResponse.setHttpStatusCode(_ctx.integerValue("DescribeScriptResponse.HttpStatusCode"));
		describeScriptResponse.setSuccess(_ctx.booleanValue("DescribeScriptResponse.Success"));
		describeScriptResponse.setChatbotId(_ctx.stringValue("DescribeScriptResponse.ChatbotId"));
		describeScriptResponse.setCode(_ctx.stringValue("DescribeScriptResponse.Code"));
		describeScriptResponse.setMessage(_ctx.stringValue("DescribeScriptResponse.Message"));
		describeScriptResponse.setTtsConfig(_ctx.stringValue("DescribeScriptResponse.TtsConfig"));
		describeScriptResponse.setAsrConfig(_ctx.stringValue("DescribeScriptResponse.AsrConfig"));
		describeScriptResponse.setNlsConfig(_ctx.stringValue("DescribeScriptResponse.NlsConfig"));

		Script script = new Script();
		script.setStatus(_ctx.stringValue("DescribeScriptResponse.Script.Status"));
		script.setUpdateTime(_ctx.longValue("DescribeScriptResponse.Script.UpdateTime"));
		script.setChatbotId(_ctx.stringValue("DescribeScriptResponse.Script.ChatbotId"));
		script.setScriptId(_ctx.stringValue("DescribeScriptResponse.Script.ScriptId"));
		script.setIsDebugDrafted(_ctx.booleanValue("DescribeScriptResponse.Script.IsDebugDrafted"));
		script.setIndustry(_ctx.stringValue("DescribeScriptResponse.Script.Industry"));
		script.setScriptDescription(_ctx.stringValue("DescribeScriptResponse.Script.ScriptDescription"));
		script.setMiniPlaybackEnable(_ctx.booleanValue("DescribeScriptResponse.Script.MiniPlaybackEnable"));
		script.setIsDrafted(_ctx.booleanValue("DescribeScriptResponse.Script.IsDrafted"));
		script.setTtsConfig(_ctx.stringValue("DescribeScriptResponse.Script.TtsConfig"));
		script.setDebugStatus(_ctx.stringValue("DescribeScriptResponse.Script.DebugStatus"));
		script.setAsrConfig(_ctx.stringValue("DescribeScriptResponse.Script.AsrConfig"));
		script.setScene(_ctx.stringValue("DescribeScriptResponse.Script.Scene"));
		script.setScriptName(_ctx.stringValue("DescribeScriptResponse.Script.ScriptName"));
		script.setNewBargeInEnable(_ctx.booleanValue("DescribeScriptResponse.Script.NewBargeInEnable"));
		script.setLongWaitEnable(_ctx.booleanValue("DescribeScriptResponse.Script.LongWaitEnable"));
		describeScriptResponse.setScript(script);
	 
	 	return describeScriptResponse;
	}
}