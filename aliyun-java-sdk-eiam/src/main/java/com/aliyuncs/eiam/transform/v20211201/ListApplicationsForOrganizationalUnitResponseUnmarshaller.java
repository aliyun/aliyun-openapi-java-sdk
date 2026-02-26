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

import com.aliyuncs.eiam.model.v20211201.ListApplicationsForOrganizationalUnitResponse;
import com.aliyuncs.eiam.model.v20211201.ListApplicationsForOrganizationalUnitResponse.Application;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationsForOrganizationalUnitResponseUnmarshaller {

	public static ListApplicationsForOrganizationalUnitResponse unmarshall(ListApplicationsForOrganizationalUnitResponse listApplicationsForOrganizationalUnitResponse, UnmarshallerContext _ctx) {
		
		listApplicationsForOrganizationalUnitResponse.setRequestId(_ctx.stringValue("ListApplicationsForOrganizationalUnitResponse.RequestId"));
		listApplicationsForOrganizationalUnitResponse.setTotalCount(_ctx.longValue("ListApplicationsForOrganizationalUnitResponse.TotalCount"));

		List<Application> applications = new ArrayList<Application>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationsForOrganizationalUnitResponse.Applications.Length"); i++) {
			Application application = new Application();
			application.setApplicationId(_ctx.stringValue("ListApplicationsForOrganizationalUnitResponse.Applications["+ i +"].ApplicationId"));

			applications.add(application);
		}
		listApplicationsForOrganizationalUnitResponse.setApplications(applications);
	 
	 	return listApplicationsForOrganizationalUnitResponse;
	}
}