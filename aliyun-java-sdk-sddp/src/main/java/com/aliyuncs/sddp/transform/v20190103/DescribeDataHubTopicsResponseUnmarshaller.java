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

import com.aliyuncs.sddp.model.v20190103.DescribeDataHubTopicsResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeDataHubTopicsResponse.Topic;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataHubTopicsResponseUnmarshaller {

	public static DescribeDataHubTopicsResponse unmarshall(DescribeDataHubTopicsResponse describeDataHubTopicsResponse, UnmarshallerContext _ctx) {
		
		describeDataHubTopicsResponse.setRequestId(_ctx.stringValue("DescribeDataHubTopicsResponse.RequestId"));
		describeDataHubTopicsResponse.setPageSize(_ctx.integerValue("DescribeDataHubTopicsResponse.PageSize"));
		describeDataHubTopicsResponse.setCurrentPage(_ctx.integerValue("DescribeDataHubTopicsResponse.CurrentPage"));
		describeDataHubTopicsResponse.setTotalCount(_ctx.integerValue("DescribeDataHubTopicsResponse.TotalCount"));

		List<Topic> items = new ArrayList<Topic>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataHubTopicsResponse.Items.Length"); i++) {
			Topic topic = new Topic();
			topic.setId(_ctx.longValue("DescribeDataHubTopicsResponse.Items["+ i +"].Id"));
			topic.setName(_ctx.stringValue("DescribeDataHubTopicsResponse.Items["+ i +"].Name"));
			topic.setDescription(_ctx.stringValue("DescribeDataHubTopicsResponse.Items["+ i +"].Description"));
			topic.setCreationTime(_ctx.longValue("DescribeDataHubTopicsResponse.Items["+ i +"].CreationTime"));
			topic.setRecordType(_ctx.stringValue("DescribeDataHubTopicsResponse.Items["+ i +"].RecordType"));
			topic.setLifeCycle(_ctx.integerValue("DescribeDataHubTopicsResponse.Items["+ i +"].LifeCycle"));
			topic.setUserId(_ctx.longValue("DescribeDataHubTopicsResponse.Items["+ i +"].UserId"));
			topic.setLoginName(_ctx.stringValue("DescribeDataHubTopicsResponse.Items["+ i +"].LoginName"));
			topic.setDisplayName(_ctx.stringValue("DescribeDataHubTopicsResponse.Items["+ i +"].DisplayName"));

			items.add(topic);
		}
		describeDataHubTopicsResponse.setItems(items);
	 
	 	return describeDataHubTopicsResponse;
	}
}