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

package com.aliyuncs.mns.transform.v20210319;

import com.aliyuncs.mns.model.v20210319.GetTopicResponse;
import com.aliyuncs.mns.model.v20210319.GetTopicResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTopicResponseUnmarshaller {

	public static GetTopicResponse unmarshall(GetTopicResponse getTopicResponse, UnmarshallerContext _ctx) {
		
		getTopicResponse.setRequestId(_ctx.stringValue("GetTopicResponse.RequestId"));
		getTopicResponse.setCode(_ctx.longValue("GetTopicResponse.Code"));
		getTopicResponse.setStatus(_ctx.stringValue("GetTopicResponse.Status"));
		getTopicResponse.setMessage(_ctx.stringValue("GetTopicResponse.Message"));
		getTopicResponse.setSuccess(_ctx.booleanValue("GetTopicResponse.Success"));

		Data data = new Data();
		data.setTopicName(_ctx.stringValue("GetTopicResponse.Data.TopicName"));
		data.setMessageCount(_ctx.longValue("GetTopicResponse.Data.MessageCount"));
		data.setMaxMessageSize(_ctx.longValue("GetTopicResponse.Data.MaxMessageSize"));
		data.setMessageRetentionPeriod(_ctx.longValue("GetTopicResponse.Data.MessageRetentionPeriod"));
		data.setCreateTime(_ctx.longValue("GetTopicResponse.Data.CreateTime"));
		data.setLastModifyTime(_ctx.longValue("GetTopicResponse.Data.LastModifyTime"));
		data.setTopicUrl(_ctx.stringValue("GetTopicResponse.Data.TopicUrl"));
		data.setLoggingEnabled(_ctx.booleanValue("GetTopicResponse.Data.LoggingEnabled"));
		data.setTopicInnerUrl(_ctx.stringValue("GetTopicResponse.Data.TopicInnerUrl"));
		getTopicResponse.setData(data);
	 
	 	return getTopicResponse;
	}
}