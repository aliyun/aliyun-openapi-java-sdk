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

package com.aliyuncs.mns_open.transform.v20220119;

import com.aliyuncs.mns_open.model.v20220119.GetTopicAttributesResponse;
import com.aliyuncs.mns_open.model.v20220119.GetTopicAttributesResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTopicAttributesResponseUnmarshaller {

	public static GetTopicAttributesResponse unmarshall(GetTopicAttributesResponse getTopicAttributesResponse, UnmarshallerContext _ctx) {
		
		getTopicAttributesResponse.setRequestId(_ctx.stringValue("GetTopicAttributesResponse.RequestId"));
		getTopicAttributesResponse.setCode(_ctx.longValue("GetTopicAttributesResponse.Code"));
		getTopicAttributesResponse.setStatus(_ctx.stringValue("GetTopicAttributesResponse.Status"));
		getTopicAttributesResponse.setMessage(_ctx.stringValue("GetTopicAttributesResponse.Message"));
		getTopicAttributesResponse.setSuccess(_ctx.booleanValue("GetTopicAttributesResponse.Success"));

		Data data = new Data();
		data.setTopicName(_ctx.stringValue("GetTopicAttributesResponse.Data.TopicName"));
		data.setMessageCount(_ctx.longValue("GetTopicAttributesResponse.Data.MessageCount"));
		data.setMaxMessageSize(_ctx.longValue("GetTopicAttributesResponse.Data.MaxMessageSize"));
		data.setMessageRetentionPeriod(_ctx.longValue("GetTopicAttributesResponse.Data.MessageRetentionPeriod"));
		data.setCreateTime(_ctx.longValue("GetTopicAttributesResponse.Data.CreateTime"));
		data.setLastModifyTime(_ctx.longValue("GetTopicAttributesResponse.Data.LastModifyTime"));
		data.setTopicUrl(_ctx.stringValue("GetTopicAttributesResponse.Data.TopicUrl"));
		data.setLoggingEnabled(_ctx.booleanValue("GetTopicAttributesResponse.Data.LoggingEnabled"));
		data.setTopicInnerUrl(_ctx.stringValue("GetTopicAttributesResponse.Data.TopicInnerUrl"));
		getTopicAttributesResponse.setData(data);
	 
	 	return getTopicAttributesResponse;
	}
}