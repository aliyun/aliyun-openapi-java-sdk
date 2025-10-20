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

import com.aliyuncs.eiam.model.v20211201.ListApplicationsForNetworkZoneResponse;
import com.aliyuncs.eiam.model.v20211201.ListApplicationsForNetworkZoneResponse.Application;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationsForNetworkZoneResponseUnmarshaller {

	public static ListApplicationsForNetworkZoneResponse unmarshall(ListApplicationsForNetworkZoneResponse listApplicationsForNetworkZoneResponse, UnmarshallerContext _ctx) {
		
		listApplicationsForNetworkZoneResponse.setRequestId(_ctx.stringValue("ListApplicationsForNetworkZoneResponse.RequestId"));
		listApplicationsForNetworkZoneResponse.setTotalCount(_ctx.longValue("ListApplicationsForNetworkZoneResponse.TotalCount"));
		listApplicationsForNetworkZoneResponse.setNextToken(_ctx.stringValue("ListApplicationsForNetworkZoneResponse.NextToken"));
		listApplicationsForNetworkZoneResponse.setPreviousToken(_ctx.stringValue("ListApplicationsForNetworkZoneResponse.PreviousToken"));
		listApplicationsForNetworkZoneResponse.setMaxResults(_ctx.integerValue("ListApplicationsForNetworkZoneResponse.MaxResults"));

		List<Application> applications = new ArrayList<Application>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationsForNetworkZoneResponse.Applications.Length"); i++) {
			Application application = new Application();
			application.setInstanceId(_ctx.stringValue("ListApplicationsForNetworkZoneResponse.Applications["+ i +"].InstanceId"));
			application.setApplicationId(_ctx.stringValue("ListApplicationsForNetworkZoneResponse.Applications["+ i +"].ApplicationId"));
			application.setApplicationName(_ctx.stringValue("ListApplicationsForNetworkZoneResponse.Applications["+ i +"].ApplicationName"));

			applications.add(application);
		}
		listApplicationsForNetworkZoneResponse.setApplications(applications);
	 
	 	return listApplicationsForNetworkZoneResponse;
	}
}