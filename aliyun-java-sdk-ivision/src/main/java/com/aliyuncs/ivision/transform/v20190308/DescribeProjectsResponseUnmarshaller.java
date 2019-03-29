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

package com.aliyuncs.ivision.transform.v20190308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ivision.model.v20190308.DescribeProjectsResponse;
import com.aliyuncs.ivision.model.v20190308.DescribeProjectsResponse.Project;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProjectsResponseUnmarshaller {

	public static DescribeProjectsResponse unmarshall(DescribeProjectsResponse describeProjectsResponse, UnmarshallerContext context) {
		
		describeProjectsResponse.setRequestId(context.stringValue("DescribeProjectsResponse.RequestId"));
		describeProjectsResponse.setTotalNum(context.longValue("DescribeProjectsResponse.TotalNum"));
		describeProjectsResponse.setCurrentPage(context.longValue("DescribeProjectsResponse.CurrentPage"));
		describeProjectsResponse.setPageSize(context.longValue("DescribeProjectsResponse.PageSize"));
		describeProjectsResponse.setNextPageToken(context.stringValue("DescribeProjectsResponse.NextPageToken"));

		List<Project> projects = new ArrayList<Project>();
		for (int i = 0; i < context.lengthValue("DescribeProjectsResponse.Projects.Length"); i++) {
			Project project = new Project();
			project.setProjectId(context.stringValue("DescribeProjectsResponse.Projects["+ i +"].ProjectId"));
			project.setName(context.stringValue("DescribeProjectsResponse.Projects["+ i +"].Name"));
			project.setDescription(context.stringValue("DescribeProjectsResponse.Projects["+ i +"].Description"));
			project.setProType(context.stringValue("DescribeProjectsResponse.Projects["+ i +"].ProType"));
			project.setIterCount(context.integerValue("DescribeProjectsResponse.Projects["+ i +"].IterCount"));
			project.setCreationTime(context.stringValue("DescribeProjectsResponse.Projects["+ i +"].CreationTime"));
			project.setStatus(context.stringValue("DescribeProjectsResponse.Projects["+ i +"].Status"));

			projects.add(project);
		}
		describeProjectsResponse.setProjects(projects);
	 
	 	return describeProjectsResponse;
	}
}