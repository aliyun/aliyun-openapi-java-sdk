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

import com.aliyuncs.alikafka.model.v20190916.GetTopicSubscribeStatusResponse;
import com.aliyuncs.alikafka.model.v20190916.GetTopicSubscribeStatusResponse.TopicSubscribeStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTopicSubscribeStatusResponseUnmarshaller {

	public static GetTopicSubscribeStatusResponse unmarshall(GetTopicSubscribeStatusResponse getTopicSubscribeStatusResponse, UnmarshallerContext _ctx) {
		
		getTopicSubscribeStatusResponse.setRequestId(_ctx.stringValue("GetTopicSubscribeStatusResponse.RequestId"));
		getTopicSubscribeStatusResponse.setCode(_ctx.integerValue("GetTopicSubscribeStatusResponse.Code"));
		getTopicSubscribeStatusResponse.setSuccess(_ctx.booleanValue("GetTopicSubscribeStatusResponse.Success"));
		getTopicSubscribeStatusResponse.setMessage(_ctx.stringValue("GetTopicSubscribeStatusResponse.Message"));

		TopicSubscribeStatus topicSubscribeStatus = new TopicSubscribeStatus();
		topicSubscribeStatus.setTopic(_ctx.stringValue("GetTopicSubscribeStatusResponse.TopicSubscribeStatus.Topic"));

		List<String> consumerGroups = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTopicSubscribeStatusResponse.TopicSubscribeStatus.ConsumerGroups.Length"); i++) {
			consumerGroups.add(_ctx.stringValue("GetTopicSubscribeStatusResponse.TopicSubscribeStatus.ConsumerGroups["+ i +"]"));
		}
		topicSubscribeStatus.setConsumerGroups(consumerGroups);
		getTopicSubscribeStatusResponse.setTopicSubscribeStatus(topicSubscribeStatus);
	 
	 	return getTopicSubscribeStatusResponse;
	}
}