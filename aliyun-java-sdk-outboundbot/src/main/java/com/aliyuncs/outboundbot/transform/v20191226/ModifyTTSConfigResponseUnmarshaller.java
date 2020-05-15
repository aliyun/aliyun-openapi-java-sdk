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

import com.aliyuncs.outboundbot.model.v20191226.ModifyTTSConfigResponse;
import com.aliyuncs.outboundbot.model.v20191226.ModifyTTSConfigResponse.TTSConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyTTSConfigResponseUnmarshaller {

	public static ModifyTTSConfigResponse unmarshall(ModifyTTSConfigResponse modifyTTSConfigResponse, UnmarshallerContext _ctx) {
		
		modifyTTSConfigResponse.setRequestId(_ctx.stringValue("ModifyTTSConfigResponse.RequestId"));
		modifyTTSConfigResponse.setSuccess(_ctx.booleanValue("ModifyTTSConfigResponse.Success"));
		modifyTTSConfigResponse.setCode(_ctx.stringValue("ModifyTTSConfigResponse.Code"));
		modifyTTSConfigResponse.setMessage(_ctx.stringValue("ModifyTTSConfigResponse.Message"));
		modifyTTSConfigResponse.setHttpStatusCode(_ctx.integerValue("ModifyTTSConfigResponse.HttpStatusCode"));

		TTSConfig tTSConfig = new TTSConfig();
		tTSConfig.setTTSConfigId(_ctx.stringValue("ModifyTTSConfigResponse.TTSConfig.TTSConfigId"));
		tTSConfig.setScriptId(_ctx.stringValue("ModifyTTSConfigResponse.TTSConfig.ScriptId"));
		tTSConfig.setInstanceId(_ctx.stringValue("ModifyTTSConfigResponse.TTSConfig.InstanceId"));
		tTSConfig.setVoice(_ctx.stringValue("ModifyTTSConfigResponse.TTSConfig.Voice"));
		tTSConfig.setSpeechRate(_ctx.stringValue("ModifyTTSConfigResponse.TTSConfig.SpeechRate"));
		tTSConfig.setVolume(_ctx.stringValue("ModifyTTSConfigResponse.TTSConfig.Volume"));
		modifyTTSConfigResponse.setTTSConfig(tTSConfig);
	 
	 	return modifyTTSConfigResponse;
	}
}