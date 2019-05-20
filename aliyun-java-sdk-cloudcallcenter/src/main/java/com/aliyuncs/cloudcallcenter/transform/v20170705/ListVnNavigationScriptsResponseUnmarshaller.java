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

import com.aliyuncs.cloudcallcenter.model.v20170705.ListVnNavigationScriptsResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListVnNavigationScriptsResponse.NavigationScript;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVnNavigationScriptsResponseUnmarshaller {

	public static ListVnNavigationScriptsResponse unmarshall(ListVnNavigationScriptsResponse listVnNavigationScriptsResponse, UnmarshallerContext context) {
		
		listVnNavigationScriptsResponse.setRequestId(context.stringValue("ListVnNavigationScriptsResponse.RequestId"));
		listVnNavigationScriptsResponse.setTotalCount(context.longValue("ListVnNavigationScriptsResponse.TotalCount"));
		listVnNavigationScriptsResponse.setPageNumber(context.integerValue("ListVnNavigationScriptsResponse.PageNumber"));
		listVnNavigationScriptsResponse.setPageSize(context.integerValue("ListVnNavigationScriptsResponse.PageSize"));

		List<NavigationScript> navigationScripts = new ArrayList<NavigationScript>();
		for (int i = 0; i < context.lengthValue("ListVnNavigationScriptsResponse.NavigationScripts.Length"); i++) {
			NavigationScript navigationScript = new NavigationScript();
			navigationScript.setNavigationScriptId(context.stringValue("ListVnNavigationScriptsResponse.NavigationScripts["+ i +"].NavigationScriptId"));
			navigationScript.setTitle(context.stringValue("ListVnNavigationScriptsResponse.NavigationScripts["+ i +"].Title"));
			navigationScript.setModifyTime(context.longValue("ListVnNavigationScriptsResponse.NavigationScripts["+ i +"].ModifyTime"));
			navigationScript.setType(context.stringValue("ListVnNavigationScriptsResponse.NavigationScripts["+ i +"].Type"));

			navigationScripts.add(navigationScript);
		}
		listVnNavigationScriptsResponse.setNavigationScripts(navigationScripts);
	 
	 	return listVnNavigationScriptsResponse;
	}
}