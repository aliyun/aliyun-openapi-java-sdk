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

package com.aliyuncs.oos.transform.v20190601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oos.model.v20190601.ListApplicationsResponse;
import com.aliyuncs.oos.model.v20190601.ListApplicationsResponse.Application;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationsResponseUnmarshaller {

	public static ListApplicationsResponse unmarshall(ListApplicationsResponse listApplicationsResponse, UnmarshallerContext _ctx) {
		
		listApplicationsResponse.setRequestId(_ctx.stringValue("ListApplicationsResponse.RequestId"));
		listApplicationsResponse.setNextToken(_ctx.stringValue("ListApplicationsResponse.NextToken"));
		listApplicationsResponse.setMaxResults(_ctx.integerValue("ListApplicationsResponse.MaxResults"));

		List<Application> applications = new ArrayList<Application>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationsResponse.Applications.Length"); i++) {
			Application application = new Application();
			application.setDescription(_ctx.stringValue("ListApplicationsResponse.Applications["+ i +"].Description"));
			application.setUpdateDate(_ctx.stringValue("ListApplicationsResponse.Applications["+ i +"].UpdateDate"));
			application.setResourceGroupId(_ctx.stringValue("ListApplicationsResponse.Applications["+ i +"].ResourceGroupId"));
			application.setTags(_ctx.mapValue("ListApplicationsResponse.Applications["+ i +"].Tags"));
			application.setName(_ctx.stringValue("ListApplicationsResponse.Applications["+ i +"].Name"));
			application.setCreateDate(_ctx.stringValue("ListApplicationsResponse.Applications["+ i +"].CreateDate"));

			applications.add(application);
		}
		listApplicationsResponse.setApplications(applications);
	 
	 	return listApplicationsResponse;
	}
}