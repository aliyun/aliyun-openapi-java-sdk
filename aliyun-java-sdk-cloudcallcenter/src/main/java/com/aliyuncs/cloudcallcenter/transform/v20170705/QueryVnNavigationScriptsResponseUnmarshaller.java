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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.QueryVnNavigationScriptsResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.QueryVnNavigationScriptsResponse.NavigationScript;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryVnNavigationScriptsResponseUnmarshaller {

	public static QueryVnNavigationScriptsResponse unmarshall(QueryVnNavigationScriptsResponse queryVnNavigationScriptsResponse, UnmarshallerContext context) {
		
		queryVnNavigationScriptsResponse.setRequestId(context.stringValue("QueryVnNavigationScriptsResponse.RequestId"));
		queryVnNavigationScriptsResponse.setTotalCount(context.longValue("QueryVnNavigationScriptsResponse.TotalCount"));
		queryVnNavigationScriptsResponse.setPageNumber(context.integerValue("QueryVnNavigationScriptsResponse.PageNumber"));
		queryVnNavigationScriptsResponse.setPageSize(context.integerValue("QueryVnNavigationScriptsResponse.PageSize"));

		List<NavigationScript> navigationScripts = new ArrayList<NavigationScript>();
		for (int i = 0; i < context.lengthValue("QueryVnNavigationScriptsResponse.NavigationScripts.Length"); i++) {
			NavigationScript navigationScript = new NavigationScript();
			navigationScript.setNavigationScriptId(context.stringValue("QueryVnNavigationScriptsResponse.NavigationScripts["+ i +"].NavigationScriptId"));
			navigationScript.setTitle(context.stringValue("QueryVnNavigationScriptsResponse.NavigationScripts["+ i +"].Title"));
			navigationScript.setModifyTime(context.longValue("QueryVnNavigationScriptsResponse.NavigationScripts["+ i +"].ModifyTime"));
			navigationScript.setType(context.stringValue("QueryVnNavigationScriptsResponse.NavigationScripts["+ i +"].Type"));

			navigationScripts.add(navigationScript);
		}
		queryVnNavigationScriptsResponse.setNavigationScripts(navigationScripts);
	 
	 	return queryVnNavigationScriptsResponse;
	}
}