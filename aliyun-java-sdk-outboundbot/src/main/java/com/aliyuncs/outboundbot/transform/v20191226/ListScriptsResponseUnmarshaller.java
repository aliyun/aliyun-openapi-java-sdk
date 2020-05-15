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
		listScriptsResponse.setSuccess(_ctx.booleanValue("ListScriptsResponse.Success"));
		listScriptsResponse.setCode(_ctx.stringValue("ListScriptsResponse.Code"));
		listScriptsResponse.setMessage(_ctx.stringValue("ListScriptsResponse.Message"));
		listScriptsResponse.setHttpStatusCode(_ctx.integerValue("ListScriptsResponse.HttpStatusCode"));

		Scripts scripts = new Scripts();
		scripts.setTotalCount(_ctx.integerValue("ListScriptsResponse.Scripts.TotalCount"));
		scripts.setPageNumber(_ctx.integerValue("ListScriptsResponse.Scripts.PageNumber"));
		scripts.setPageSize(_ctx.integerValue("ListScriptsResponse.Scripts.PageSize"));

		List<Script> list = new ArrayList<Script>();
		for (int i = 0; i < _ctx.lengthValue("ListScriptsResponse.Scripts.List.Length"); i++) {
			Script script = new Script();
			script.setScriptId(_ctx.stringValue("ListScriptsResponse.Scripts.List["+ i +"].ScriptId"));
			script.setScriptName(_ctx.stringValue("ListScriptsResponse.Scripts.List["+ i +"].ScriptName"));
			script.setScriptDescription(_ctx.stringValue("ListScriptsResponse.Scripts.List["+ i +"].ScriptDescription"));
			script.setIndustry(_ctx.stringValue("ListScriptsResponse.Scripts.List["+ i +"].Industry"));
			script.setScene(_ctx.stringValue("ListScriptsResponse.Scripts.List["+ i +"].Scene"));
			script.setStatus(_ctx.stringValue("ListScriptsResponse.Scripts.List["+ i +"].Status"));
			script.setDebugStatus(_ctx.stringValue("ListScriptsResponse.Scripts.List["+ i +"].DebugStatus"));
			script.setUpdateTime(_ctx.longValue("ListScriptsResponse.Scripts.List["+ i +"].UpdateTime"));
			script.setIsDrafted(_ctx.booleanValue("ListScriptsResponse.Scripts.List["+ i +"].IsDrafted"));
			script.setIsDebugDrafted(_ctx.booleanValue("ListScriptsResponse.Scripts.List["+ i +"].IsDebugDrafted"));
			script.setFailReason(_ctx.stringValue("ListScriptsResponse.Scripts.List["+ i +"].FailReason"));

			list.add(script);
		}
		scripts.setList(list);
		listScriptsResponse.setScripts(scripts);
	 
	 	return listScriptsResponse;
	}
}