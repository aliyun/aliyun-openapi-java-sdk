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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.ListProjectAppsResponse;
import com.aliyuncs.iovcc.model.v20180501.ListProjectAppsResponse.Result;
import com.aliyuncs.iovcc.model.v20180501.ListProjectAppsResponse.Result.ProjectApp;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectAppsResponseUnmarshaller {

	public static ListProjectAppsResponse unmarshall(ListProjectAppsResponse listProjectAppsResponse, UnmarshallerContext _ctx) {
		
		listProjectAppsResponse.setRequestId(_ctx.stringValue("ListProjectAppsResponse.RequestId"));

		Result result = new Result();
		result.setTotalCount(_ctx.integerValue("ListProjectAppsResponse.Result.TotalCount"));
		result.setTotalPage(_ctx.integerValue("ListProjectAppsResponse.Result.TotalPage"));

		List<ProjectApp> projectApps = new ArrayList<ProjectApp>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectAppsResponse.Result.ProjectApps.Length"); i++) {
			ProjectApp projectApp = new ProjectApp();
			projectApp.setId(_ctx.longValue("ListProjectAppsResponse.Result.ProjectApps["+ i +"].Id"));
			projectApp.setAppId(_ctx.stringValue("ListProjectAppsResponse.Result.ProjectApps["+ i +"].AppId"));
			projectApp.setUserId(_ctx.stringValue("ListProjectAppsResponse.Result.ProjectApps["+ i +"].UserId"));
			projectApp.setProjectId(_ctx.stringValue("ListProjectAppsResponse.Result.ProjectApps["+ i +"].ProjectId"));
			projectApp.setAppName(_ctx.stringValue("ListProjectAppsResponse.Result.ProjectApps["+ i +"].AppName"));
			projectApp.setAppKey(_ctx.stringValue("ListProjectAppsResponse.Result.ProjectApps["+ i +"].AppKey"));
			projectApp.setAppSecret(_ctx.stringValue("ListProjectAppsResponse.Result.ProjectApps["+ i +"].AppSecret"));
			projectApp.setStatus(_ctx.integerValue("ListProjectAppsResponse.Result.ProjectApps["+ i +"].Status"));
			projectApp.setGmtCreate(_ctx.longValue("ListProjectAppsResponse.Result.ProjectApps["+ i +"].GmtCreate"));
			projectApp.setGmtModified(_ctx.longValue("ListProjectAppsResponse.Result.ProjectApps["+ i +"].GmtModified"));
			projectApp.setAppPkgName(_ctx.stringValue("ListProjectAppsResponse.Result.ProjectApps["+ i +"].AppPkgName"));
			projectApp.setOsType(_ctx.integerValue("ListProjectAppsResponse.Result.ProjectApps["+ i +"].OsType"));

			projectApps.add(projectApp);
		}
		result.setProjectApps(projectApps);
		listProjectAppsResponse.setResult(result);
	 
	 	return listProjectAppsResponse;
	}
}