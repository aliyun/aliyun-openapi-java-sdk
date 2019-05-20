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

package com.aliyuncs.yundun_ds.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.yundun_ds.model.v20190103.DescribeDataHubTopicsResponse;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeDataHubTopicsResponse.Topic;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataHubTopicsResponseUnmarshaller {

	public static DescribeDataHubTopicsResponse unmarshall(DescribeDataHubTopicsResponse describeDataHubTopicsResponse, UnmarshallerContext context) {
		
		describeDataHubTopicsResponse.setRequestId(context.stringValue("DescribeDataHubTopicsResponse.RequestId"));
		describeDataHubTopicsResponse.setPageSize(context.integerValue("DescribeDataHubTopicsResponse.PageSize"));
		describeDataHubTopicsResponse.setCurrentPage(context.integerValue("DescribeDataHubTopicsResponse.CurrentPage"));
		describeDataHubTopicsResponse.setTotalCount(context.integerValue("DescribeDataHubTopicsResponse.TotalCount"));

		List<Topic> items = new ArrayList<Topic>();
		for (int i = 0; i < context.lengthValue("DescribeDataHubTopicsResponse.Items.Length"); i++) {
			Topic topic = new Topic();
			topic.setId(context.longValue("DescribeDataHubTopicsResponse.Items["+ i +"].Id"));
			topic.setName(context.stringValue("DescribeDataHubTopicsResponse.Items["+ i +"].Name"));
			topic.setDescription(context.stringValue("DescribeDataHubTopicsResponse.Items["+ i +"].Description"));
			topic.setCreationTime(context.longValue("DescribeDataHubTopicsResponse.Items["+ i +"].CreationTime"));
			topic.setRecordType(context.stringValue("DescribeDataHubTopicsResponse.Items["+ i +"].RecordType"));
			topic.setLifeCycle(context.integerValue("DescribeDataHubTopicsResponse.Items["+ i +"].LifeCycle"));
			topic.setUserId(context.longValue("DescribeDataHubTopicsResponse.Items["+ i +"].UserId"));
			topic.setLoginName(context.stringValue("DescribeDataHubTopicsResponse.Items["+ i +"].LoginName"));
			topic.setDisplayName(context.stringValue("DescribeDataHubTopicsResponse.Items["+ i +"].DisplayName"));

			items.add(topic);
		}
		describeDataHubTopicsResponse.setItems(items);
	 
	 	return describeDataHubTopicsResponse;
	}
}