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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.ListScriptVoiceConfigsResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListScriptVoiceConfigsResponse.ScriptVoiceConfigs;
import com.aliyuncs.outboundbot.model.v20191226.ListScriptVoiceConfigsResponse.ScriptVoiceConfigs.ScriptVoiceConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListScriptVoiceConfigsResponseUnmarshaller {

	public static ListScriptVoiceConfigsResponse unmarshall(ListScriptVoiceConfigsResponse listScriptVoiceConfigsResponse, UnmarshallerContext _ctx) {
		
		listScriptVoiceConfigsResponse.setRequestId(_ctx.stringValue("ListScriptVoiceConfigsResponse.RequestId"));
		listScriptVoiceConfigsResponse.setSuccess(_ctx.booleanValue("ListScriptVoiceConfigsResponse.Success"));
		listScriptVoiceConfigsResponse.setCode(_ctx.stringValue("ListScriptVoiceConfigsResponse.Code"));
		listScriptVoiceConfigsResponse.setMessage(_ctx.stringValue("ListScriptVoiceConfigsResponse.Message"));
		listScriptVoiceConfigsResponse.setHttpStatusCode(_ctx.integerValue("ListScriptVoiceConfigsResponse.HttpStatusCode"));

		ScriptVoiceConfigs scriptVoiceConfigs = new ScriptVoiceConfigs();
		scriptVoiceConfigs.setTotalCount(_ctx.integerValue("ListScriptVoiceConfigsResponse.ScriptVoiceConfigs.TotalCount"));
		scriptVoiceConfigs.setPageNumber(_ctx.integerValue("ListScriptVoiceConfigsResponse.ScriptVoiceConfigs.PageNumber"));
		scriptVoiceConfigs.setPageSize(_ctx.integerValue("ListScriptVoiceConfigsResponse.ScriptVoiceConfigs.PageSize"));

		List<ScriptVoiceConfig> list = new ArrayList<ScriptVoiceConfig>();
		for (int i = 0; i < _ctx.lengthValue("ListScriptVoiceConfigsResponse.ScriptVoiceConfigs.List.Length"); i++) {
			ScriptVoiceConfig scriptVoiceConfig = new ScriptVoiceConfig();
			scriptVoiceConfig.setScriptVoiceConfigId(_ctx.stringValue("ListScriptVoiceConfigsResponse.ScriptVoiceConfigs.List["+ i +"].ScriptVoiceConfigId"));
			scriptVoiceConfig.setInstanceId(_ctx.stringValue("ListScriptVoiceConfigsResponse.ScriptVoiceConfigs.List["+ i +"].InstanceId"));
			scriptVoiceConfig.setScriptId(_ctx.stringValue("ListScriptVoiceConfigsResponse.ScriptVoiceConfigs.List["+ i +"].ScriptId"));
			scriptVoiceConfig.setScriptContent(_ctx.stringValue("ListScriptVoiceConfigsResponse.ScriptVoiceConfigs.List["+ i +"].ScriptContent"));
			scriptVoiceConfig.setSource(_ctx.stringValue("ListScriptVoiceConfigsResponse.ScriptVoiceConfigs.List["+ i +"].Source"));
			scriptVoiceConfig.setType(_ctx.stringValue("ListScriptVoiceConfigsResponse.ScriptVoiceConfigs.List["+ i +"].Type"));
			scriptVoiceConfig.setScriptWaveformRelation(_ctx.stringValue("ListScriptVoiceConfigsResponse.ScriptVoiceConfigs.List["+ i +"].ScriptWaveformRelation"));

			list.add(scriptVoiceConfig);
		}
		scriptVoiceConfigs.setList(list);
		listScriptVoiceConfigsResponse.setScriptVoiceConfigs(scriptVoiceConfigs);
	 
	 	return listScriptVoiceConfigsResponse;
	}
}