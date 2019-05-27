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

package com.aliyuncs.sddp.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sddp.model.v20190103.DescribeDataHubProjectsResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeDataHubProjectsResponse.Project;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataHubProjectsResponseUnmarshaller {

	public static DescribeDataHubProjectsResponse unmarshall(DescribeDataHubProjectsResponse describeDataHubProjectsResponse, UnmarshallerContext context) {
		
		describeDataHubProjectsResponse.setRequestId(context.stringValue("DescribeDataHubProjectsResponse.RequestId"));
		describeDataHubProjectsResponse.setPageSize(context.integerValue("DescribeDataHubProjectsResponse.PageSize"));
		describeDataHubProjectsResponse.setCurrentPage(context.integerValue("DescribeDataHubProjectsResponse.CurrentPage"));
		describeDataHubProjectsResponse.setTotalCount(context.integerValue("DescribeDataHubProjectsResponse.TotalCount"));

		List<Project> items = new ArrayList<Project>();
		for (int i = 0; i < context.lengthValue("DescribeDataHubProjectsResponse.Items.Length"); i++) {
			Project project = new Project();
			project.setId(context.longValue("DescribeDataHubProjectsResponse.Items["+ i +"].Id"));
			project.setName(context.stringValue("DescribeDataHubProjectsResponse.Items["+ i +"].Name"));
			project.setDescription(context.stringValue("DescribeDataHubProjectsResponse.Items["+ i +"].Description"));
			project.setCreationTime(context.longValue("DescribeDataHubProjectsResponse.Items["+ i +"].CreationTime"));
			project.setTopicCount(context.stringValue("DescribeDataHubProjectsResponse.Items["+ i +"].TopicCount"));
			project.setTopicTupleCount(context.stringValue("DescribeDataHubProjectsResponse.Items["+ i +"].TopicTupleCount"));
			project.setTopicBlobCount(context.longValue("DescribeDataHubProjectsResponse.Items["+ i +"].TopicBlobCount"));
			project.setUserId(context.longValue("DescribeDataHubProjectsResponse.Items["+ i +"].UserId"));
			project.setLoginName(context.stringValue("DescribeDataHubProjectsResponse.Items["+ i +"].LoginName"));
			project.setDisplayName(context.stringValue("DescribeDataHubProjectsResponse.Items["+ i +"].DisplayName"));

			items.add(project);
		}
		describeDataHubProjectsResponse.setItems(items);
	 
	 	return describeDataHubProjectsResponse;
	}
}