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

import com.aliyuncs.voicenavigator.model.v20180612.ListNavigationScriptsResponse;
import com.aliyuncs.voicenavigator.model.v20180612.ListNavigationScriptsResponse.NavigationScript;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNavigationScriptsResponseUnmarshaller {

	public static ListNavigationScriptsResponse unmarshall(ListNavigationScriptsResponse listNavigationScriptsResponse, UnmarshallerContext _ctx) {
		
		listNavigationScriptsResponse.setRequestId(_ctx.stringValue("ListNavigationScriptsResponse.RequestId"));
		listNavigationScriptsResponse.setTotalCount(_ctx.longValue("ListNavigationScriptsResponse.TotalCount"));
		listNavigationScriptsResponse.setPageNumber(_ctx.integerValue("ListNavigationScriptsResponse.PageNumber"));
		listNavigationScriptsResponse.setPageSize(_ctx.integerValue("ListNavigationScriptsResponse.PageSize"));

		List<NavigationScript> navigationScripts = new ArrayList<NavigationScript>();
		for (int i = 0; i < _ctx.lengthValue("ListNavigationScriptsResponse.NavigationScripts.Length"); i++) {
			NavigationScript navigationScript = new NavigationScript();
			navigationScript.setNavigationScriptId(_ctx.stringValue("ListNavigationScriptsResponse.NavigationScripts["+ i +"].NavigationScriptId"));
			navigationScript.setTitle(_ctx.stringValue("ListNavigationScriptsResponse.NavigationScripts["+ i +"].Title"));
			navigationScript.setModifyTime(_ctx.longValue("ListNavigationScriptsResponse.NavigationScripts["+ i +"].ModifyTime"));
			navigationScript.setType(_ctx.stringValue("ListNavigationScriptsResponse.NavigationScripts["+ i +"].Type"));

			navigationScripts.add(navigationScript);
		}
		listNavigationScriptsResponse.setNavigationScripts(navigationScripts);
	 
	 	return listNavigationScriptsResponse;
	}
}