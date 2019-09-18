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

package com.aliyuncs.alikafka.transform.v20190916;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alikafka.model.v20190916.GetConsumerProgressResponse;
import com.aliyuncs.alikafka.model.v20190916.GetConsumerProgressResponse.ConsumerProgress;
import com.aliyuncs.alikafka.model.v20190916.GetConsumerProgressResponse.ConsumerProgress.TopicListItem;
import com.aliyuncs.alikafka.model.v20190916.GetConsumerProgressResponse.ConsumerProgress.TopicListItem.OffsetListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetConsumerProgressResponseUnmarshaller {

	public static GetConsumerProgressResponse unmarshall(GetConsumerProgressResponse getConsumerProgressResponse, UnmarshallerContext _ctx) {
		
		getConsumerProgressResponse.setRequestId(_ctx.stringValue("GetConsumerProgressResponse.RequestId"));
		getConsumerProgressResponse.setSuccess(_ctx.booleanValue("GetConsumerProgressResponse.Success"));
		getConsumerProgressResponse.setCode(_ctx.integerValue("GetConsumerProgressResponse.Code"));
		getConsumerProgressResponse.setMessage(_ctx.stringValue("GetConsumerProgressResponse.Message"));

		ConsumerProgress consumerProgress = new ConsumerProgress();
		consumerProgress.setTotalDiff(_ctx.longValue("GetConsumerProgressResponse.ConsumerProgress.TotalDiff"));
		consumerProgress.setLastTimestamp(_ctx.longValue("GetConsumerProgressResponse.ConsumerProgress.LastTimestamp"));

		List<TopicListItem> topicList = new ArrayList<TopicListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetConsumerProgressResponse.ConsumerProgress.TopicList.Length"); i++) {
			TopicListItem topicListItem = new TopicListItem();
			topicListItem.setTopic(_ctx.stringValue("GetConsumerProgressResponse.ConsumerProgress.TopicList["+ i +"].Topic"));
			topicListItem.setTotalDiff(_ctx.longValue("GetConsumerProgressResponse.ConsumerProgress.TopicList["+ i +"].TotalDiff"));
			topicListItem.setLastTimestamp(_ctx.longValue("GetConsumerProgressResponse.ConsumerProgress.TopicList["+ i +"].LastTimestamp"));

			List<OffsetListItem> offsetList = new ArrayList<OffsetListItem>();
			for (int j = 0; j < _ctx.lengthValue("GetConsumerProgressResponse.ConsumerProgress.TopicList["+ i +"].OffsetList.Length"); j++) {
				OffsetListItem offsetListItem = new OffsetListItem();
				offsetListItem.setBrokerOffset(_ctx.longValue("GetConsumerProgressResponse.ConsumerProgress.TopicList["+ i +"].OffsetList["+ j +"].BrokerOffset"));
				offsetListItem.setConsumerOffset(_ctx.longValue("GetConsumerProgressResponse.ConsumerProgress.TopicList["+ i +"].OffsetList["+ j +"].ConsumerOffset"));
				offsetListItem.setLastTimestamp(_ctx.longValue("GetConsumerProgressResponse.ConsumerProgress.TopicList["+ i +"].OffsetList["+ j +"].LastTimestamp"));
				offsetListItem.setPartition(_ctx.integerValue("GetConsumerProgressResponse.ConsumerProgress.TopicList["+ i +"].OffsetList["+ j +"].Partition"));

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