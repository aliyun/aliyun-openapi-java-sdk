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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListTopicsResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListTopicsResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListTopicsResponse.Data.TopicsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTopicsResponseUnmarshaller {

	public static ListTopicsResponse unmarshall(ListTopicsResponse listTopicsResponse, UnmarshallerContext _ctx) {
		
		listTopicsResponse.setRequestId(_ctx.stringValue("ListTopicsResponse.RequestId"));
		listTopicsResponse.setHttpStatusCode(_ctx.integerValue("ListTopicsResponse.HttpStatusCode"));
		listTopicsResponse.setErrorMessage(_ctx.stringValue("ListTopicsResponse.ErrorMessage"));
		listTopicsResponse.setErrorCode(_ctx.stringValue("ListTopicsResponse.ErrorCode"));
		listTopicsResponse.setSuccess(_ctx.booleanValue("ListTopicsResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListTopicsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListTopicsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListTopicsResponse.Data.TotalCount"));

		List<TopicsItem> topics = new ArrayList<TopicsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTopicsResponse.Data.Topics.Length"); i++) {
			TopicsItem topicsItem = new TopicsItem();
			topicsItem.setTopicName(_ctx.stringValue("ListTopicsResponse.Data.Topics["+ i +"].TopicName"));
			topicsItem.setProjectId(_ctx.longValue("ListTopicsResponse.Data.Topics["+ i +"].ProjectId"));
			topicsItem.setNodeOwner(_ctx.stringValue("ListTopicsResponse.Data.Topics["+ i +"].NodeOwner"));
			topicsItem.setInstanceId(_ctx.longValue("ListTopicsResponse.Data.Topics["+ i +"].InstanceId"));
			topicsItem.setFixTime(_ctx.longValue("ListTopicsResponse.Data.Topics["+ i +"].FixTime"));
			topicsItem.setTopicType(_ctx.stringValue("ListTopicsResponse.Data.Topics["+ i +"].TopicType"));
			topicsItem.setTopicStatus(_ctx.stringValue("ListTopicsResponse.Data.Topics["+ i +"].TopicStatus"));
			topicsItem.setHappenTime(_ctx.longValue("ListTopicsResponse.Data.Topics["+ i +"].HappenTime"));
			topicsItem.setNodeName(_ctx.stringValue("ListTopicsResponse.Data.Topics["+ i +"].NodeName"));
			topicsItem.setTopicId(_ctx.longValue("ListTopicsResponse.Data.Topics["+ i +"].TopicId"));
			topicsItem.setAddTime(_ctx.longValue("ListTopicsResponse.Data.Topics["+ i +"].AddTime"));
			topicsItem.setNodeId(_ctx.longValue("ListTopicsResponse.Data.Topics["+ i +"].NodeId"));

			topics.add(topicsItem);
		}
		data.setTopics(topics);
		listTopicsResponse.setData(data);
	 
	 	return listTopicsResponse;
	}
}