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

import com.aliyuncs.iot.model.v20180120.QueryTopicConfigResponse;
import com.aliyuncs.iot.model.v20180120.QueryTopicConfigResponse.TopicConfigInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTopicConfigResponseUnmarshaller {

	public static QueryTopicConfigResponse unmarshall(QueryTopicConfigResponse queryTopicConfigResponse, UnmarshallerContext _ctx) {
		
		queryTopicConfigResponse.setRequestId(_ctx.stringValue("QueryTopicConfigResponse.RequestId"));
		queryTopicConfigResponse.setCode(_ctx.stringValue("QueryTopicConfigResponse.Code"));
		queryTopicConfigResponse.setMessage(_ctx.stringValue("QueryTopicConfigResponse.Message"));
		queryTopicConfigResponse.setSuccess(_ctx.booleanValue("QueryTopicConfigResponse.Success"));

		List<TopicConfigInfo> data = new ArrayList<TopicConfigInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryTopicConfigResponse.Data.Length"); i++) {
			TopicConfigInfo topicConfigInfo = new TopicConfigInfo();
			topicConfigInfo.setTopicFullName(_ctx.stringValue("QueryTopicConfigResponse.Data["+ i +"].TopicFullName"));
			topicConfigInfo.setOperation(_ctx.stringValue("QueryTopicConfigResponse.Data["+ i +"].Operation"));
			topicConfigInfo.setProductKey(_ctx.stringValue("QueryTopicConfigResponse.Data["+ i +"].ProductKey"));
			topicConfigInfo.setDescription(_ctx.stringValue("QueryTopicConfigResponse.Data["+ i +"].Description"));
			topicConfigInfo.setCodec(_ctx.stringValue("QueryTopicConfigResponse.Data["+ i +"].Codec"));
			topicConfigInfo.setEnableBroadcast(_ctx.booleanValue("QueryTopicConfigResponse.Data["+ i +"].EnableBroadcast"));
			topicConfigInfo.setEnableProxySubscribe(_ctx.booleanValue("QueryTopicConfigResponse.Data["+ i +"].EnableProxySubscribe"));

			data.add(topicConfigInfo);
		}
		queryTopicConfigResponse.setData(data);
	 
	 	return queryTopicConfigResponse;
	}
}