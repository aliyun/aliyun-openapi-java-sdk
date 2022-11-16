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

package com.aliyuncs.eiam.transform.v20211201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eiam.model.v20211201.ListApplicationsResponse;
import com.aliyuncs.eiam.model.v20211201.ListApplicationsResponse.Application;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationsResponseUnmarshaller {

	public static ListApplicationsResponse unmarshall(ListApplicationsResponse listApplicationsResponse, UnmarshallerContext _ctx) {
		
		listApplicationsResponse.setRequestId(_ctx.stringValue("ListApplicationsResponse.RequestId"));
		listApplicationsResponse.setTotalCount(_ctx.longValue("ListApplicationsResponse.TotalCount"));

		List<Application> applications = new ArrayList<Application>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationsResponse.Applications.Length"); i++) {
			Application application = new Application();
			application.setInstanceId(_ctx.stringValue("ListApplicationsResponse.Applications["+ i +"].InstanceId"));
			application.setApplicationId(_ctx.stringValue("ListApplicationsResponse.Applications["+ i +"].ApplicationId"));
			application.setClientId(_ctx.stringValue("ListApplicationsResponse.Applications["+ i +"].ClientId"));
			application.setLogoUrl(_ctx.stringValue("ListApplicationsResponse.Applications["+ i +"].LogoUrl"));
			application.setApplicationName(_ctx.stringValue("ListApplicationsResponse.Applications["+ i +"].ApplicationName"));
			application.setDescription(_ctx.stringValue("ListApplicationsResponse.Applications["+ i +"].Description"));
			application.setSsoType(_ctx.stringValue("ListApplicationsResponse.Applications["+ i +"].SsoType"));
			application.setApplicationSourceType(_ctx.stringValue("ListApplicationsResponse.Applications["+ i +"].ApplicationSourceType"));
			application.setFeatures(_ctx.stringValue("ListApplicationsResponse.Applications["+ i +"].Features"));
			application.setStatus(_ctx.stringValue("ListApplicationsResponse.Applications["+ i +"].Status"));
			application.setCreateTime(_ctx.longValue("ListApplicationsResponse.Applications["+ i +"].CreateTime"));
			application.setUpdateTime(_ctx.longValue("ListApplicationsResponse.Applications["+ i +"].UpdateTime"));
			application.setServiceManaged(_ctx.booleanValue("ListApplicationsResponse.Applications["+ i +"].ServiceManaged"));
			application.setManagedServiceCode(_ctx.stringValue("ListApplicationsResponse.Applications["+ i +"].ManagedServiceCode"));

			applications.add(application);
		}
		listApplicationsResponse.setApplications(applications);
	 
	 	return listApplicationsResponse;
	}
}