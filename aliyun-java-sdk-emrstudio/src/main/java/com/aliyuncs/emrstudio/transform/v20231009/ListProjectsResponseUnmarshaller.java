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

package com.aliyuncs.emrstudio.transform.v20231009;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emrstudio.model.v20231009.ListProjectsResponse;
import com.aliyuncs.emrstudio.model.v20231009.ListProjectsResponse.Projects;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectsResponseUnmarshaller {

	public static ListProjectsResponse unmarshall(ListProjectsResponse listProjectsResponse, UnmarshallerContext _ctx) {
		
		listProjectsResponse.setNextToken(_ctx.stringValue("ListProjectsResponse.nextToken"));
		listProjectsResponse.setRequestId(_ctx.stringValue("ListProjectsResponse.requestId"));

		List<Projects> data = new ArrayList<Projects>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectsResponse.data.Length"); i++) {
			Projects projects = new Projects();
			projects.setName(_ctx.stringValue("ListProjectsResponse.data["+ i +"].name"));
			projects.setDescription(_ctx.stringValue("ListProjectsResponse.data["+ i +"].description"));
			projects.setProjectId(_ctx.longValue("ListProjectsResponse.data["+ i +"].projectId"));
			projects.setCode(_ctx.longValue("ListProjectsResponse.data["+ i +"].code"));

			data.add(projects);
		}
		listProjectsResponse.setData(data);
	 
	 	return listProjectsResponse;
	}
}