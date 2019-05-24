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

package com.aliyuncs.linkedmall.transform.v20180116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkedmall.model.v20180116.QueryMessagesResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryMessagesResponse.BizMessage;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMessagesResponseUnmarshaller {

	public static QueryMessagesResponse unmarshall(QueryMessagesResponse queryMessagesResponse, UnmarshallerContext context) {
		
		queryMessagesResponse.setRequestId(context.stringValue("QueryMessagesResponse.RequestId"));
		queryMessagesResponse.setLogsId(context.stringValue("QueryMessagesResponse.LogsId"));
		queryMessagesResponse.setSubCode(context.stringValue("QueryMessagesResponse.SubCode"));
		queryMessagesResponse.setSubMessage(context.stringValue("QueryMessagesResponse.SubMessage"));
		queryMessagesResponse.setCode(context.stringValue("QueryMessagesResponse.Code"));
		queryMessagesResponse.setMessage(context.stringValue("QueryMessagesResponse.Message"));
		queryMessagesResponse.setSuccess(context.booleanValue("QueryMessagesResponse.Success"));

		List<BizMessage> bizMessages = new ArrayList<BizMessage>();
		for (int i = 0; i < context.lengthValue("QueryMessagesResponse.BizMessages.Length"); i++) {
			BizMessage bizMessage = new BizMessage();
			bizMessage.setTopic(context.stringValue("QueryMessagesResponse.BizMessages["+ i +"].Topic"));
			bizMessage.setDataId(context.longValue("QueryMessagesResponse.BizMessages["+ i +"].DataId"));
			bizMessage.setPubTime(context.stringValue("QueryMessagesResponse.BizMessages["+ i +"].PubTime"));
			bizMessage.setContentMapJson(context.stringValue("QueryMessagesResponse.BizMessages["+ i +"].ContentMapJson"));

			bizMessages.add(bizMessage);
		}
		queryMessagesResponse.setBizMessages(bizMessages);
	 
	 	return queryMessagesResponse;
	}
}