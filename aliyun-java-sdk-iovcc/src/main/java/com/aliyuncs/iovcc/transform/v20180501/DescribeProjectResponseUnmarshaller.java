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

import com.aliyuncs.iovcc.model.v20180501.DescribeProjectResponse;
import com.aliyuncs.iovcc.model.v20180501.DescribeProjectResponse.Project;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProjectResponseUnmarshaller {

	public static DescribeProjectResponse unmarshall(DescribeProjectResponse describeProjectResponse, UnmarshallerContext _ctx) {
		
		describeProjectResponse.setRequestId(_ctx.stringValue("DescribeProjectResponse.RequestId"));

		Project project = new Project();
		project.setId(_ctx.longValue("DescribeProjectResponse.Project.Id"));
		project.setProjectId(_ctx.stringValue("DescribeProjectResponse.Project.ProjectId"));
		project.setUserId(_ctx.stringValue("DescribeProjectResponse.Project.UserId"));
		project.setName(_ctx.stringValue("DescribeProjectResponse.Project.Name"));
		project.setStatus(_ctx.integerValue("DescribeProjectResponse.Project.Status"));
		project.setDescription(_ctx.stringValue("DescribeProjectResponse.Project.Description"));
		project.setGmtCreate(_ctx.longValue("DescribeProjectResponse.Project.GmtCreate"));
		project.setGmtModified(_ctx.longValue("DescribeProjectResponse.Project.GmtModified"));
		project.setCreator(_ctx.stringValue("DescribeProjectResponse.Project.Creator"));
		describeProjectResponse.setProject(project);
	 
	 	return describeProjectResponse;
	}
}