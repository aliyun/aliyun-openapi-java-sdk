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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.ListApplicationsResponse;
import com.aliyuncs.ens.model.v20171110.ListApplicationsResponse.Application;
import com.aliyuncs.ens.model.v20171110.ListApplicationsResponse.Application.App;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationsResponseUnmarshaller {

	public static ListApplicationsResponse unmarshall(ListApplicationsResponse listApplicationsResponse, UnmarshallerContext _ctx) {
		
		listApplicationsResponse.setRequestId(_ctx.stringValue("ListApplicationsResponse.RequestId"));
		listApplicationsResponse.setPageNumber(_ctx.integerValue("ListApplicationsResponse.PageNumber"));
		listApplicationsResponse.setPageSize(_ctx.integerValue("ListApplicationsResponse.PageSize"));
		listApplicationsResponse.setTotalCount(_ctx.integerValue("ListApplicationsResponse.TotalCount"));

		List<Application> applications = new ArrayList<Application>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationsResponse.Applications.Length"); i++) {
			Application application = new Application();
			application.setClusterName(_ctx.stringValue("ListApplicationsResponse.Applications["+ i +"].ClusterName"));

			List<App> appList = new ArrayList<App>();
			for (int j = 0; j < _ctx.lengthValue("ListApplicationsResponse.Applications["+ i +"].AppList.Length"); j++) {
				App app = new App();
				app.setAppId(_ctx.stringValue("ListApplicationsResponse.Applications["+ i +"].AppList["+ j +"].AppId"));
				app.setAppInfo(_ctx.stringValue("ListApplicationsResponse.Applications["+ i +"].AppList["+ j +"].AppInfo"));

				appList.add(app);
			}
			application.setAppList(appList);

			applications.add(application);
		}
		listApplicationsResponse.setApplications(applications);
	 
	 	return listApplicationsResponse;
	}
}