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

import com.aliyuncs.eiam.model.v20211201.ListApplicationsForUserResponse;
import com.aliyuncs.eiam.model.v20211201.ListApplicationsForUserResponse.Application;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationsForUserResponseUnmarshaller {

	public static ListApplicationsForUserResponse unmarshall(ListApplicationsForUserResponse listApplicationsForUserResponse, UnmarshallerContext _ctx) {
		
		listApplicationsForUserResponse.setRequestId(_ctx.stringValue("ListApplicationsForUserResponse.RequestId"));
		listApplicationsForUserResponse.setTotalCount(_ctx.longValue("ListApplicationsForUserResponse.TotalCount"));

		List<Application> applications = new ArrayList<Application>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationsForUserResponse.Applications.Length"); i++) {
			Application application = new Application();
			application.setApplicationId(_ctx.stringValue("ListApplicationsForUserResponse.Applications["+ i +"].ApplicationId"));
			application.setHasDirectAuthorization(_ctx.booleanValue("ListApplicationsForUserResponse.Applications["+ i +"].HasDirectAuthorization"));
			application.setHasInheritAuthorization(_ctx.booleanValue("ListApplicationsForUserResponse.Applications["+ i +"].HasInheritAuthorization"));

			applications.add(application);
		}
		listApplicationsForUserResponse.setApplications(applications);
	 
	 	return listApplicationsForUserResponse;
	}
}