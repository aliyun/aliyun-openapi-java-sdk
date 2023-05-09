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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QueryDeviceSubTopicResponse;
import com.aliyuncs.iot.model.v20180120.QueryDeviceSubTopicResponse.Topic;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceSubTopicResponseUnmarshaller {

	public static QueryDeviceSubTopicResponse unmarshall(QueryDeviceSubTopicResponse queryDeviceSubTopicResponse, UnmarshallerContext _ctx) {
		
		queryDeviceSubTopicResponse.setRequestId(_ctx.stringValue("QueryDeviceSubTopicResponse.RequestId"));
		queryDeviceSubTopicResponse.setCode(_ctx.stringValue("QueryDeviceSubTopicResponse.Code"));
		queryDeviceSubTopicResponse.setErrorMessage(_ctx.stringValue("QueryDeviceSubTopicResponse.ErrorMessage"));
		queryDeviceSubTopicResponse.setSuccess(_ctx.booleanValue("QueryDeviceSubTopicResponse.Success"));

		List<Topic> topicList = new ArrayList<Topic>();
		for (int i = 0; i < _ctx.lengthValue("QueryDeviceSubTopicResponse.TopicList.Length"); i++) {
			Topic topic = new Topic();
			topic.setTopicName(_ctx.stringValue("QueryDeviceSubTopicResponse.TopicList["+ i +"].TopicName"));
			topic.setTimestamp(_ctx.longValue("QueryDeviceSubTopicResponse.TopicList["+ i +"].Timestamp"));

			topicList.add(topic);
		}
		queryDeviceSubTopicResponse.setTopicList(topicList);
	 
	 	return queryDeviceSubTopicResponse;
	}
}