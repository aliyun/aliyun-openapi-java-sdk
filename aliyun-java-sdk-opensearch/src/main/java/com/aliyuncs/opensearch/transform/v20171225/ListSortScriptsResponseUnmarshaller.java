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

package com.aliyuncs.opensearch.transform.v20171225;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.opensearch.model.v20171225.ListSortScriptsResponse;
import com.aliyuncs.opensearch.model.v20171225.ListSortScriptsResponse.ScriptInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSortScriptsResponseUnmarshaller {

	public static ListSortScriptsResponse unmarshall(ListSortScriptsResponse listSortScriptsResponse, UnmarshallerContext _ctx) {
		
		listSortScriptsResponse.setRequestId(_ctx.stringValue("ListSortScriptsResponse.requestId"));

		List<ScriptInfo> result = new ArrayList<ScriptInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListSortScriptsResponse.result.Length"); i++) {
			ScriptInfo scriptInfo = new ScriptInfo();
			scriptInfo.setScriptName(_ctx.stringValue("ListSortScriptsResponse.result["+ i +"].scriptName"));
			scriptInfo.setType(_ctx.stringValue("ListSortScriptsResponse.result["+ i +"].type"));
			scriptInfo.setScope(_ctx.stringValue("ListSortScriptsResponse.result["+ i +"].scope"));
			scriptInfo.setStatus(_ctx.stringValue("ListSortScriptsResponse.result["+ i +"].status"));
			scriptInfo.setCreateTime(_ctx.stringValue("ListSortScriptsResponse.result["+ i +"].createTime"));
			scriptInfo.setModifyTime(_ctx.stringValue("ListSortScriptsResponse.result["+ i +"].modifyTime"));

			result.add(scriptInfo);
		}
		listSortScriptsResponse.setResult(result);
	 
	 	return listSortScriptsResponse;
	}
}