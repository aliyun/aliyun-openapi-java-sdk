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

package com.aliyuncs.voicenavigator.transform.v20180612;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.voicenavigator.model.v20180612.QueryNavigationScriptsResponse;
import com.aliyuncs.voicenavigator.model.v20180612.QueryNavigationScriptsResponse.NavigationScript;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryNavigationScriptsResponseUnmarshaller {

	public static QueryNavigationScriptsResponse unmarshall(QueryNavigationScriptsResponse queryNavigationScriptsResponse, UnmarshallerContext _ctx) {
		
		queryNavigationScriptsResponse.setRequestId(_ctx.stringValue("QueryNavigationScriptsResponse.RequestId"));
		queryNavigationScriptsResponse.setTotalCount(_ctx.longValue("QueryNavigationScriptsResponse.TotalCount"));
		queryNavigationScriptsResponse.setPageNumber(_ctx.integerValue("QueryNavigationScriptsResponse.PageNumber"));
		queryNavigationScriptsResponse.setPageSize(_ctx.integerValue("QueryNavigationScriptsResponse.PageSize"));

		List<NavigationScript> navigationScripts = new ArrayList<NavigationScript>();
		for (int i = 0; i < _ctx.lengthValue("QueryNavigationScriptsResponse.NavigationScripts.Length"); i++) {
			NavigationScript navigationScript = new NavigationScript();
			navigationScript.setNavigationScriptId(_ctx.stringValue("QueryNavigationScriptsResponse.NavigationScripts["+ i +"].NavigationScriptId"));
			navigationScript.setTitle(_ctx.stringValue("QueryNavigationScriptsResponse.NavigationScripts["+ i +"].Title"));
			navigationScript.setModifyTime(_ctx.longValue("QueryNavigationScriptsResponse.NavigationScripts["+ i +"].ModifyTime"));
			navigationScript.setType(_ctx.stringValue("QueryNavigationScriptsResponse.NavigationScripts["+ i +"].Type"));

			navigationScripts.add(navigationScript);
		}
		queryNavigationScriptsResponse.setNavigationScripts(navigationScripts);
	 
	 	return queryNavigationScriptsResponse;
	}
}