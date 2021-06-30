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

import com.aliyuncs.iot.model.v20180120.QueryMessageInfoResponse;
import com.aliyuncs.iot.model.v20180120.QueryMessageInfoResponse.Message;
import com.aliyuncs.iot.model.v20180120.QueryMessageInfoResponse.Message.UserProperty;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMessageInfoResponseUnmarshaller {

	public static QueryMessageInfoResponse unmarshall(QueryMessageInfoResponse queryMessageInfoResponse, UnmarshallerContext _ctx) {
		
		queryMessageInfoResponse.setRequestId(_ctx.stringValue("QueryMessageInfoResponse.RequestId"));
		queryMessageInfoResponse.setSuccess(_ctx.booleanValue("QueryMessageInfoResponse.Success"));
		queryMessageInfoResponse.setErrorMessage(_ctx.stringValue("QueryMessageInfoResponse.ErrorMessage"));
		queryMessageInfoResponse.setCode(_ctx.stringValue("QueryMessageInfoResponse.Code"));

		Message message = new Message();
		message.setUniMsgId(_ctx.stringValue("QueryMessageInfoResponse.Message.UniMsgId"));
		message.setTopicFullName(_ctx.stringValue("QueryMessageInfoResponse.Message.TopicFullName"));
		message.setMessageContent(_ctx.stringValue("QueryMessageInfoResponse.Message.MessageContent"));
		message.setGenerateTime(_ctx.longValue("QueryMessageInfoResponse.Message.GenerateTime"));

		List<UserProperty> userProperties = new ArrayList<UserProperty>();
		for (int i = 0; i < _ctx.lengthValue("QueryMessageInfoResponse.Message.UserProperties.Length"); i++) {
			UserProperty userProperty = new UserProperty();
			userProperty.setKey(_ctx.stringValue("QueryMessageInfoResponse.Message.UserProperties["+ i +"].Key"));
			userProperty.setValue(_ctx.stringValue("QueryMessageInfoResponse.Message.UserProperties["+ i +"].Value"));

			userProperties.add(userProperty);
		}
		message.setUserProperties(userProperties);
		queryMessageInfoResponse.setMessage(message);
	 
	 	return queryMessageInfoResponse;
	}
}