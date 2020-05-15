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

import com.aliyuncs.iovcc.model.v20180501.ListProjectsResponse;
import com.aliyuncs.iovcc.model.v20180501.ListProjectsResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectsResponseUnmarshaller {

	public static ListProjectsResponse unmarshall(ListProjectsResponse listProjectsResponse, UnmarshallerContext _ctx) {
		
		listProjectsResponse.setRequestId(_ctx.stringValue("ListProjectsResponse.RequestId"));

		List<Result> projects = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectsResponse.Projects.Length"); i++) {
			Result result = new Result();
			result.setId(_ctx.longValue("ListProjectsResponse.Projects["+ i +"].Id"));
			result.setProjectId(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].ProjectId"));
			result.setUserId(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].UserId"));
			result.setName(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].Name"));
			result.setStatus(_ctx.integerValue("ListProjectsResponse.Projects["+ i +"].Status"));
			result.setDescription(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].Description"));
			result.setGmtCreate(_ctx.longValue("ListProjectsResponse.Projects["+ i +"].GmtCreate"));
			result.setGmtModified(_ctx.longValue("ListProjectsResponse.Projects["+ i +"].GmtModified"));
			result.setCreator(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].Creator"));

			projects.add(result);
		}
		listProjectsResponse.setProjects(projects);
	 
	 	return listProjectsResponse;
	}
}