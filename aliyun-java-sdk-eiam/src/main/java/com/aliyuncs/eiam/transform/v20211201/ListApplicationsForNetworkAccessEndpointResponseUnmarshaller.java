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

import com.aliyuncs.eiam.model.v20211201.ListApplicationsForNetworkAccessEndpointResponse;
import com.aliyuncs.eiam.model.v20211201.ListApplicationsForNetworkAccessEndpointResponse.ApplicationForNetworkAccessEndpoint;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationsForNetworkAccessEndpointResponseUnmarshaller {

	public static ListApplicationsForNetworkAccessEndpointResponse unmarshall(ListApplicationsForNetworkAccessEndpointResponse listApplicationsForNetworkAccessEndpointResponse, UnmarshallerContext _ctx) {
		
		listApplicationsForNetworkAccessEndpointResponse.setRequestId(_ctx.stringValue("ListApplicationsForNetworkAccessEndpointResponse.RequestId"));
		listApplicationsForNetworkAccessEndpointResponse.setTotalCount(_ctx.longValue("ListApplicationsForNetworkAccessEndpointResponse.TotalCount"));
		listApplicationsForNetworkAccessEndpointResponse.setNextToken(_ctx.stringValue("ListApplicationsForNetworkAccessEndpointResponse.NextToken"));

		List<ApplicationForNetworkAccessEndpoint> applicationsForNetworkAccessEndpoint = new ArrayList<ApplicationForNetworkAccessEndpoint>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationsForNetworkAccessEndpointResponse.ApplicationsForNetworkAccessEndpoint.Length"); i++) {
			ApplicationForNetworkAccessEndpoint applicationForNetworkAccessEndpoint = new ApplicationForNetworkAccessEndpoint();
			applicationForNetworkAccessEndpoint.setInstanceId(_ctx.stringValue("ListApplicationsForNetworkAccessEndpointResponse.ApplicationsForNetworkAccessEndpoint["+ i +"].InstanceId"));
			applicationForNetworkAccessEndpoint.setApplicationId(_ctx.stringValue("ListApplicationsForNetworkAccessEndpointResponse.ApplicationsForNetworkAccessEndpoint["+ i +"].ApplicationId"));
			applicationForNetworkAccessEndpoint.setApplicationName(_ctx.stringValue("ListApplicationsForNetworkAccessEndpointResponse.ApplicationsForNetworkAccessEndpoint["+ i +"].ApplicationName"));

			applicationsForNetworkAccessEndpoint.add(applicationForNetworkAccessEndpoint);
		}
		listApplicationsForNetworkAccessEndpointResponse.setApplicationsForNetworkAccessEndpoint(applicationsForNetworkAccessEndpoint);
	 
	 	return listApplicationsForNetworkAccessEndpointResponse;
	}
}