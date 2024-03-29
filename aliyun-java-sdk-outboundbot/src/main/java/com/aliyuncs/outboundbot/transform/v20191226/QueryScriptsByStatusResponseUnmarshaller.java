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

import com.aliyuncs.outboundbot.model.v20191226.QueryScriptsByStatusResponse;
import com.aliyuncs.outboundbot.model.v20191226.QueryScriptsByStatusResponse.Scripts;
import com.aliyuncs.outboundbot.model.v20191226.QueryScriptsByStatusResponse.Scripts.Script;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryScriptsByStatusResponseUnmarshaller {

	public static QueryScriptsByStatusResponse unmarshall(QueryScriptsByStatusResponse queryScriptsByStatusResponse, UnmarshallerContext _ctx) {
		
		queryScriptsByStatusResponse.setRequestId(_ctx.stringValue("QueryScriptsByStatusResponse.RequestId"));
		queryScriptsByStatusResponse.setHttpStatusCode(_ctx.integerValue("QueryScriptsByStatusResponse.HttpStatusCode"));
		queryScriptsByStatusResponse.setCode(_ctx.stringValue("QueryScriptsByStatusResponse.Code"));
		queryScriptsByStatusResponse.setMessage(_ctx.stringValue("QueryScriptsByStatusResponse.Message"));
		queryScriptsByStatusResponse.setSuccess(_ctx.booleanValue("QueryScriptsByStatusResponse.Success"));

		Scripts scripts = new Scripts();
		scripts.setPageNumber(_ctx.integerValue("QueryScriptsByStatusResponse.Scripts.PageNumber"));
		scripts.setPageSize(_ctx.integerValue("QueryScriptsByStatusResponse.Scripts.PageSize"));
		scripts.setTotalCount(_ctx.integerValue("QueryScriptsByStatusResponse.Scripts.TotalCount"));

		List<Script> list = new ArrayList<Script>();
		for (int i = 0; i < _ctx.lengthValue("QueryScriptsByStatusResponse.Scripts.List.Length"); i++) {
			Script script = new Script();
			script.setStatus(_ctx.stringValue("QueryScriptsByStatusResponse.Scripts.List["+ i +"].Status"));
			script.setUpdateTime(_ctx.longValue("QueryScriptsByStatusResponse.Scripts.List["+ i +"].UpdateTime"));
			script.setScriptId(_ctx.stringValue("QueryScriptsByStatusResponse.Scripts.List["+ i +"].ScriptId"));
			script.setAppliedVersion(_ctx.stringValue("QueryScriptsByStatusResponse.Scripts.List["+ i +"].AppliedVersion"));
			script.setIsDebugDrafted(_ctx.booleanValue("QueryScriptsByStatusResponse.Scripts.List["+ i +"].IsDebugDrafted"));
			script.setIndustry(_ctx.stringValue("QueryScriptsByStatusResponse.Scripts.List["+ i +"].Industry"));
			script.setScriptDescription(_ctx.stringValue("QueryScriptsByStatusResponse.Scripts.List["+ i +"].ScriptDescription"));
			script.setIsDrafted(_ctx.booleanValue("QueryScriptsByStatusResponse.Scripts.List["+ i +"].IsDrafted"));
			script.setDebugStatus(_ctx.stringValue("QueryScriptsByStatusResponse.Scripts.List["+ i +"].DebugStatus"));
			script.setDebugVersion(_ctx.stringValue("QueryScriptsByStatusResponse.Scripts.List["+ i +"].DebugVersion"));
			script.setScene(_ctx.stringValue("QueryScriptsByStatusResponse.Scripts.List["+ i +"].Scene"));
			script.setScriptName(_ctx.stringValue("QueryScriptsByStatusResponse.Scripts.List["+ i +"].ScriptName"));

			list.add(script);
		}
		scripts.setList(list);
		queryScriptsByStatusResponse.setScripts(scripts);
	 
	 	return queryScriptsByStatusResponse;
	}
}