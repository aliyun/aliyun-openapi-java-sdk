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

package com.aliyuncs.pts.transform.v20190810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20190810.ListArmsAppsResponse;
import com.aliyuncs.pts.model.v20190810.ListArmsAppsResponse.App;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListArmsAppsResponseUnmarshaller {

	public static ListArmsAppsResponse unmarshall(ListArmsAppsResponse listArmsAppsResponse, UnmarshallerContext _ctx) {
		
		listArmsAppsResponse.setRequestId(_ctx.stringValue("ListArmsAppsResponse.RequestId"));
		listArmsAppsResponse.setCode(_ctx.stringValue("ListArmsAppsResponse.Code"));
		listArmsAppsResponse.setMessage(_ctx.stringValue("ListArmsAppsResponse.Message"));
		listArmsAppsResponse.setHttpStatusCode(_ctx.integerValue("ListArmsAppsResponse.HttpStatusCode"));
		listArmsAppsResponse.setSuccess(_ctx.booleanValue("ListArmsAppsResponse.Success"));

		List<App> apps = new ArrayList<App>();
		for (int i = 0; i < _ctx.lengthValue("ListArmsAppsResponse.Apps.Length"); i++) {
			App app = new App();
			app.setRegionId(_ctx.stringValue("ListArmsAppsResponse.Apps["+ i +"].RegionId"));
			app.setRegionName(_ctx.stringValue("ListArmsAppsResponse.Apps["+ i +"].RegionName"));
			app.setAppName(_ctx.stringValue("ListArmsAppsResponse.Apps["+ i +"].AppName"));
			app.setPid(_ctx.stringValue("ListArmsAppsResponse.Apps["+ i +"].Pid"));

			apps.add(app);
		}
		listArmsAppsResponse.setApps(apps);
	 
	 	return listArmsAppsResponse;
	}
}