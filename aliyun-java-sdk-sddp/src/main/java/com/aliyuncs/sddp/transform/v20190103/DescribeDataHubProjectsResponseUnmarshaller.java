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

	public static DescribeDataHubProjectsResponse unmarshall(DescribeDataHubProjectsResponse describeDataHubProjectsResponse, UnmarshallerContext _ctx) {
		
		describeDataHubProjectsResponse.setRequestId(_ctx.stringValue("DescribeDataHubProjectsResponse.RequestId"));
		describeDataHubProjectsResponse.setPageSize(_ctx.integerValue("DescribeDataHubProjectsResponse.PageSize"));
		describeDataHubProjectsResponse.setCurrentPage(_ctx.integerValue("DescribeDataHubProjectsResponse.CurrentPage"));
		describeDataHubProjectsResponse.setTotalCount(_ctx.integerValue("DescribeDataHubProjectsResponse.TotalCount"));

		List<Project> items = new ArrayList<Project>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataHubProjectsResponse.Items.Length"); i++) {
			Project project = new Project();
			project.setId(_ctx.longValue("DescribeDataHubProjectsResponse.Items["+ i +"].Id"));
			project.setName(_ctx.stringValue("DescribeDataHubProjectsResponse.Items["+ i +"].Name"));
			project.setDescription(_ctx.stringValue("DescribeDataHubProjectsResponse.Items["+ i +"].Description"));
			project.setCreationTime(_ctx.longValue("DescribeDataHubProjectsResponse.Items["+ i +"].CreationTime"));
			project.setTopicCount(_ctx.stringValue("DescribeDataHubProjectsResponse.Items["+ i +"].TopicCount"));
			project.setTopicTupleCount(_ctx.stringValue("DescribeDataHubProjectsResponse.Items["+ i +"].TopicTupleCount"));
			project.setTopicBlobCount(_ctx.longValue("DescribeDataHubProjectsResponse.Items["+ i +"].TopicBlobCount"));
			project.setUserId(_ctx.longValue("DescribeDataHubProjectsResponse.Items["+ i +"].UserId"));
			project.setLoginName(_ctx.stringValue("DescribeDataHubProjectsResponse.Items["+ i +"].LoginName"));
			project.setDisplayName(_ctx.stringValue("DescribeDataHubProjectsResponse.Items["+ i +"].DisplayName"));

			items.add(project);
		}
		describeDataHubProjectsResponse.setItems(items);
	 
	 	return describeDataHubProjectsResponse;
	}
}