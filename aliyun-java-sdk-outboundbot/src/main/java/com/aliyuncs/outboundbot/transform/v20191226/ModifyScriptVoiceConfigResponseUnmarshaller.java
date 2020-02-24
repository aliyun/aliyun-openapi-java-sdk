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

import com.aliyuncs.outboundbot.model.v20191226.ModifyScriptVoiceConfigResponse;
import com.aliyuncs.outboundbot.model.v20191226.ModifyScriptVoiceConfigResponse.ScriptVoiceConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyScriptVoiceConfigResponseUnmarshaller {

	public static ModifyScriptVoiceConfigResponse unmarshall(ModifyScriptVoiceConfigResponse modifyScriptVoiceConfigResponse, UnmarshallerContext _ctx) {
		
		modifyScriptVoiceConfigResponse.setRequestId(_ctx.stringValue("ModifyScriptVoiceConfigResponse.RequestId"));
		modifyScriptVoiceConfigResponse.setSuccess(_ctx.booleanValue("ModifyScriptVoiceConfigResponse.Success"));
		modifyScriptVoiceConfigResponse.setCode(_ctx.stringValue("ModifyScriptVoiceConfigResponse.Code"));
		modifyScriptVoiceConfigResponse.setMessage(_ctx.stringValue("ModifyScriptVoiceConfigResponse.Message"));
		modifyScriptVoiceConfigResponse.setHttpStatusCode(_ctx.integerValue("ModifyScriptVoiceConfigResponse.HttpStatusCode"));

		ScriptVoiceConfig scriptVoiceConfig = new ScriptVoiceConfig();
		scriptVoiceConfig.setScriptVoiceConfigId(_ctx.stringValue("ModifyScriptVoiceConfigResponse.ScriptVoiceConfig.ScriptVoiceConfigId"));
		scriptVoiceConfig.setInstanceId(_ctx.stringValue("ModifyScriptVoiceConfigResponse.ScriptVoiceConfig.InstanceId"));
		scriptVoiceConfig.setScriptId(_ctx.stringValue("ModifyScriptVoiceConfigResponse.ScriptVoiceConfig.ScriptId"));
		scriptVoiceConfig.setScriptContent(_ctx.stringValue("ModifyScriptVoiceConfigResponse.ScriptVoiceConfig.ScriptContent"));
		scriptVoiceConfig.setSource(_ctx.stringValue("ModifyScriptVoiceConfigResponse.ScriptVoiceConfig.Source"));
		scriptVoiceConfig.setType(_ctx.stringValue("ModifyScriptVoiceConfigResponse.ScriptVoiceConfig.Type"));
		scriptVoiceConfig.setScriptWaveformRelation(_ctx.stringValue("ModifyScriptVoiceConfigResponse.ScriptVoiceConfig.ScriptWaveformRelation"));
		modifyScriptVoiceConfigResponse.setScriptVoiceConfig(scriptVoiceConfig);
	 
	 	return modifyScriptVoiceConfigResponse;
	}
}