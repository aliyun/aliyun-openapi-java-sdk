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

import com.aliyuncs.alikafka.model.v20181015.GetConsumerProgressResponse;
import com.aliyuncs.alikafka.model.v20181015.GetConsumerProgressResponse.ConsumerProgress;
import com.aliyuncs.alikafka.model.v20181015.GetConsumerProgressResponse.ConsumerProgress.TopicListItem;
import com.aliyuncs.alikafka.model.v20181015.GetConsumerProgressResponse.ConsumerProgress.TopicListItem.OffsetListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetConsumerProgressResponseUnmarshaller {

	public static GetConsumerProgressResponse unmarshall(GetConsumerProgressResponse getConsumerProgressResponse, UnmarshallerContext context) {
		
		getConsumerProgressResponse.setRequestId(context.stringValue("GetConsumerProgressResponse.RequestId"));
		getConsumerProgressResponse.setSuccess(context.booleanValue("GetConsumerProgressResponse.Success"));
		getConsumerProgressResponse.setCode(context.integerValue("GetConsumerProgressResponse.Code"));
		getConsumerProgressResponse.setMessage(context.stringValue("GetConsumerProgressResponse.Message"));

		ConsumerProgress consumerProgress = new ConsumerProgress();
		consumerProgress.setTotalDiff(context.longValue("GetConsumerProgressResponse.ConsumerProgress.TotalDiff"));
		consumerProgress.setLastTimestamp(context.longValue("GetConsumerProgressResponse.ConsumerProgress.LastTimestamp"));

		List<TopicListItem> topicList = new ArrayList<TopicListItem>();
		for (int i = 0; i < context.lengthValue("GetConsumerProgressResponse.ConsumerProgress.TopicList.Length"); i++) {
			TopicListItem topicListItem = new TopicListItem();
			topicListItem.setTopic(context.stringValue("GetConsumerProgressResponse.ConsumerProgress.TopicList["+ i +"].Topic"));
			topicListItem.setTotalDiff(context.longValue("GetConsumerProgressResponse.ConsumerProgress.TopicList["+ i +"].TotalDiff"));
			topicListItem.setLastTimestamp(context.longValue("GetConsumerProgressResponse.ConsumerProgress.TopicList["+ i +"].LastTimestamp"));

			List<OffsetListItem> offsetList = new ArrayList<OffsetListItem>();
			for (int j = 0; j < context.lengthValue("GetConsumerProgressResponse.ConsumerProgress.TopicList["+ i +"].OffsetList.Length"); j++) {
				OffsetListItem offsetListItem = new OffsetListItem();
				offsetListItem.setBrokerOffset(context.longValue("GetConsumerProgressResponse.ConsumerProgress.TopicList["+ i +"].OffsetList["+ j +"].BrokerOffset"));
				offsetListItem.setConsumerOffset(context.longValue("GetConsumerProgressResponse.ConsumerProgress.TopicList["+ i +"].OffsetList["+ j +"].ConsumerOffset"));
				offsetListItem.setLastTimestamp(context.longValue("GetConsumerProgressResponse.ConsumerProgress.TopicList["+ i +"].OffsetList["+ j +"].LastTimestamp"));
				offsetListItem.setPartition(context.integerValue("GetConsumerProgressResponse.ConsumerProgress.TopicList["+ i +"].OffsetList["+ j +"].Partition"));

				offsetList.add(offsetListItem);
			}
			topicListItem.setOffsetList(offsetList);

			topicList.add(topicListItem);
		}
		consumerProgress.setTopicList(topicList);
		getConsumerProgressResponse.setConsumerProgress(consumerProgress);
	 
	 	return getConsumerProgressResponse;
	}
}