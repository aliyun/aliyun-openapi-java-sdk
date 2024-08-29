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

import com.aliyuncs.outboundbot.model.v20191226.ListScriptsResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListScriptsResponse.Scripts;
import com.aliyuncs.outboundbot.model.v20191226.ListScriptsResponse.Scripts.Script;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListScriptsResponseUnmarshaller {

	public static ListScriptsResponse unmarshall(ListScriptsResponse listScriptsResponse, UnmarshallerContext _ctx) {
		
		listScriptsResponse.setRequestId(_ctx.stringValue("ListScriptsResponse.RequestId"));
		listScriptsResponse.setHttpStatusCode(_ctx.integerValue("ListScriptsResponse.HttpStatusCode"));
		listScriptsResponse.setCode(_ctx.stringValue("ListScriptsResponse.Code"));
		listScriptsResponse.setMessage(_ctx.stringValue("ListScriptsResponse.Message"));
		listScriptsResponse.setSuccess(_ctx.booleanValue("ListScriptsResponse.Success"));

		Scripts scripts = new Scripts();
		scripts.setPageNumber(_ctx.integerValue("ListScriptsResponse.Scripts.PageNumber"));
		scripts.setPageSize(_ctx.integerValue("ListScriptsResponse.Scripts.PageSize"));
		scripts.setTotalCount(_ctx.integerValue("ListScriptsResponse.Scripts.TotalCount"));

		List<Script> list = new ArrayList<Script>();
		for (int i = 0; i < _ctx.lengthValue("ListScriptsResponse.Scripts.List.Length"); i++) {
			Script script = new Script();
			script.setStatus(_ctx.stringValue("ListScriptsResponse.Scripts.List["+ i +"].Status"));
			script.setUpdateTime(_ctx.longValue("ListScriptsResponse.Scripts.List["+ i +"].UpdateTime"));
			script.setScriptId(_ctx.stringValue("ListScriptsResponse.Scripts.List["+ i +"].ScriptId"));
			script.setIsDebugDrafted(_ctx.booleanValue("ListScriptsResponse.Scripts.List["+ i +"].IsDebugDrafted"));
			script.setIndustry(_ctx.stringValue("ListScriptsResponse.Scripts.List["+ i +"].Industry"));
			script.setScriptDescription(_ctx.stringValue("ListScriptsResponse.Scripts.List["+ i +"].ScriptDescription"));
			script.setIsDrafted(_ctx.booleanValue("ListScriptsResponse.Scripts.List["+ i +"].IsDrafted"));
			script.setDebugStatus(_ctx.stringValue("ListScriptsResponse.Scripts.List["+ i +"].DebugStatus"));
			script.setMiniPlaybackEnable(_ctx.booleanValue("ListScriptsResponse.Scripts.List["+ i +"].MiniPlaybackEnable"));
			script.setRejectReason(_ctx.stringValue("ListScriptsResponse.Scripts.List["+ i +"].RejectReason"));
			script.setFailReason(_ctx.stringValue("ListScriptsResponse.Scripts.List["+ i +"].FailReason"));
			script.setScene(_ctx.stringValue("ListScriptsResponse.Scripts.List["+ i +"].Scene"));
			script.setScriptName(_ctx.stringValue("ListScriptsResponse.Scripts.List["+ i +"].ScriptName"));
			script.setNewBargeInEnable(_ctx.booleanValue("ListScriptsResponse.Scripts.List["+ i +"].NewBargeInEnable"));
			script.setLongWaitEnable(_ctx.booleanValue("ListScriptsResponse.Scripts.List["+ i +"].LongWaitEnable"));
			script.setEmotionEnable(_ctx.booleanValue("ListScriptsResponse.Scripts.List["+ i +"].EmotionEnable"));
			script.setIsPreset(_ctx.booleanValue("ListScriptsResponse.Scripts.List["+ i +"].IsPreset"));
			script.setAgentKey(_ctx.stringValue("ListScriptsResponse.Scripts.List["+ i +"].AgentKey"));
			script.setAgentLlm(_ctx.booleanValue("ListScriptsResponse.Scripts.List["+ i +"].AgentLlm"));
			script.setAgentId(_ctx.longValue("ListScriptsResponse.Scripts.List["+ i +"].agentId"));
			script.setNluEngine(_ctx.stringValue("ListScriptsResponse.Scripts.List["+ i +"].NluEngine"));
			script.setNluAccessType(_ctx.stringValue("ListScriptsResponse.Scripts.List["+ i +"].NluAccessType"));
			script.setCreateTime(_ctx.longValue("ListScriptsResponse.Scripts.List["+ i +"].CreateTime"));

			list.add(script);
		}
		scripts.setList(list);
		listScriptsResponse.setScripts(scripts);
	 
	 	return listScriptsResponse;
	}
}