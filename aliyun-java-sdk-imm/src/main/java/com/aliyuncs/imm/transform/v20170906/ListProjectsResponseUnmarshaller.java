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

package com.aliyuncs.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20170906.ListProjectsResponse;
import com.aliyuncs.imm.model.v20170906.ListProjectsResponse.ProjectsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectsResponseUnmarshaller {

	public static ListProjectsResponse unmarshall(ListProjectsResponse listProjectsResponse, UnmarshallerContext _ctx) {
		
		listProjectsResponse.setRequestId(_ctx.stringValue("ListProjectsResponse.RequestId"));
		listProjectsResponse.setNextMarker(_ctx.stringValue("ListProjectsResponse.NextMarker"));

		List<ProjectsItem> projects = new ArrayList<ProjectsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectsResponse.Projects.Length"); i++) {
			ProjectsItem projectsItem = new ProjectsItem();
			projectsItem.setProject(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].Project"));
			projectsItem.setEndpoint(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].Endpoint"));
			projectsItem.setServiceRole(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].ServiceRole"));
			projectsItem.setCreateTime(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].CreateTime"));
			projectsItem.setModifyTime(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].ModifyTime"));
			projectsItem.setCU(_ctx.integerValue("ListProjectsResponse.Projects["+ i +"].CU"));
			projectsItem.setType(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].Type"));
			projectsItem.setBillingType(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].BillingType"));

			projects.add(projectsItem);
		}
		listProjectsResponse.setProjects(projects);
	 
	 	return listProjectsResponse;
	}
}