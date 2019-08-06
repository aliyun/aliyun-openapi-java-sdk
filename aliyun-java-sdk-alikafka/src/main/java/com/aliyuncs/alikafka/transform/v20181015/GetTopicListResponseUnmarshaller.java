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

package com.aliyuncs.alikafka.transform.v20181015;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alikafka.model.v20181015.GetTopicListResponse;
import com.aliyuncs.alikafka.model.v20181015.GetTopicListResponse.TopicListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTopicListResponseUnmarshaller {

	public static GetTopicListResponse unmarshall(GetTopicListResponse getTopicListResponse, UnmarshallerContext _ctx) {
		
		getTopicListResponse.setRequestId(_ctx.stringValue("GetTopicListResponse.RequestId"));
		getTopicListResponse.setSuccess(_ctx.booleanValue("GetTopicListResponse.Success"));
		getTopicListResponse.setCode(_ctx.integerValue("GetTopicListResponse.Code"));
		getTopicListResponse.setMessage(_ctx.stringValue("GetTopicListResponse.Message"));
		getTopicListResponse.setTotal(_ctx.integerValue("GetTopicListResponse.Total"));
		getTopicListResponse.setPageSize(_ctx.integerValue("GetTopicListResponse.PageSize"));
		getTopicListResponse.setCurrentPage(_ctx.integerValue("GetTopicListResponse.CurrentPage"));

		List<TopicListItem> topicList = new ArrayList<TopicListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTopicListResponse.TopicList.Length"); i++) {
			TopicListItem topicListItem = new TopicListItem();
			topicListItem.setTopic(_ctx.stringValue("GetTopicListResponse.TopicList["+ i +"].Topic"));
			topicListItem.setCreateTime(_ctx.longValue("GetTopicListResponse.TopicList["+ i +"].CreateTime"));
			topicListItem.setRemark(_ctx.stringValue("GetTopicListResponse.TopicList["+ i +"].Remark"));
			topicListItem.setStatus(_ctx.integerValue("GetTopicListResponse.TopicList["+ i +"].Status"));
			topicListItem.setInstanceId(_ctx.stringValue("GetTopicListResponse.TopicList["+ i +"].InstanceId"));
			topicListItem.setRegionId(_ctx.stringValue("GetTopicListResponse.TopicList["+ i +"].RegionId"));
			topicListItem.setStatusName(_ctx.stringValue("GetTopicListResponse.TopicList["+ i +"].StatusName"));
			topicListItem.setCompactTopic(_ctx.booleanValue("GetTopicListResponse.TopicList["+ i +"].CompactTopic"));
			topicListItem.setLocalTopic(_ctx.booleanValue("GetTopicListResponse.TopicList["+ i +"].LocalTopic"));
			topicListItem.setPartitionNum(_ctx.integerValue("GetTopicListResponse.TopicList["+ i +"].PartitionNum"));

			topicList.add(topicListItem);
		}
		getTopicListResponse.setTopicList(topicList);
	 
	 	return getTopicListResponse;
	}
}