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

import com.aliyuncs.outboundbot.model.v20191226.DescribeScriptVoiceConfigResponse;
import com.aliyuncs.outboundbot.model.v20191226.DescribeScriptVoiceConfigResponse.ScriptVoiceConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScriptVoiceConfigResponseUnmarshaller {

	public static DescribeScriptVoiceConfigResponse unmarshall(DescribeScriptVoiceConfigResponse describeScriptVoiceConfigResponse, UnmarshallerContext _ctx) {
		
		describeScriptVoiceConfigResponse.setRequestId(_ctx.stringValue("DescribeScriptVoiceConfigResponse.RequestId"));
		describeScriptVoiceConfigResponse.setSuccess(_ctx.booleanValue("DescribeScriptVoiceConfigResponse.Success"));
		describeScriptVoiceConfigResponse.setCode(_ctx.stringValue("DescribeScriptVoiceConfigResponse.Code"));
		describeScriptVoiceConfigResponse.setMessage(_ctx.stringValue("DescribeScriptVoiceConfigResponse.Message"));
		describeScriptVoiceConfigResponse.setHttpStatusCode(_ctx.integerValue("DescribeScriptVoiceConfigResponse.HttpStatusCode"));

		ScriptVoiceConfig scriptVoiceConfig = new ScriptVoiceConfig();
		scriptVoiceConfig.setScriptVoiceConfigId(_ctx.stringValue("DescribeScriptVoiceConfigResponse.ScriptVoiceConfig.ScriptVoiceConfigId"));
		scriptVoiceConfig.setInstanceId(_ctx.stringValue("DescribeScriptVoiceConfigResponse.ScriptVoiceConfig.InstanceId"));
		scriptVoiceConfig.setScriptId(_ctx.stringValue("DescribeScriptVoiceConfigResponse.ScriptVoiceConfig.ScriptId"));
		scriptVoiceConfig.setScriptContent(_ctx.stringValue("DescribeScriptVoiceConfigResponse.ScriptVoiceConfig.ScriptContent"));
		scriptVoiceConfig.setSource(_ctx.stringValue("DescribeScriptVoiceConfigResponse.ScriptVoiceConfig.Source"));
		scriptVoiceConfig.setType(_ctx.stringValue("DescribeScriptVoiceConfigResponse.ScriptVoiceConfig.Type"));
		scriptVoiceConfig.setScriptWaveformRelation(_ctx.stringValue("DescribeScriptVoiceConfigResponse.ScriptVoiceConfig.ScriptWaveformRelation"));
		describeScriptVoiceConfigResponse.setScriptVoiceConfig(scriptVoiceConfig);
	 
	 	return describeScriptVoiceConfigResponse;
	}
}