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

	public static QueryMessagesResponse unmarshall(QueryMessagesResponse queryMessagesResponse, UnmarshallerContext _ctx) {
		
		queryMessagesResponse.setRequestId(_ctx.stringValue("QueryMessagesResponse.RequestId"));
		queryMessagesResponse.setLogsId(_ctx.stringValue("QueryMessagesResponse.LogsId"));
		queryMessagesResponse.setSubCode(_ctx.stringValue("QueryMessagesResponse.SubCode"));
		queryMessagesResponse.setSubMessage(_ctx.stringValue("QueryMessagesResponse.SubMessage"));
		queryMessagesResponse.setCode(_ctx.stringValue("QueryMessagesResponse.Code"));
		queryMessagesResponse.setMessage(_ctx.stringValue("QueryMessagesResponse.Message"));
		queryMessagesResponse.setSuccess(_ctx.booleanValue("QueryMessagesResponse.Success"));

		List<BizMessage> bizMessages = new ArrayList<BizMessage>();
		for (int i = 0; i < _ctx.lengthValue("QueryMessagesResponse.BizMessages.Length"); i++) {
			BizMessage bizMessage = new BizMessage();
			bizMessage.setTopic(_ctx.stringValue("QueryMessagesResponse.BizMessages["+ i +"].Topic"));
			bizMessage.setDataId(_ctx.longValue("QueryMessagesResponse.BizMessages["+ i +"].DataId"));
			bizMessage.setPubTime(_ctx.stringValue("QueryMessagesResponse.BizMessages["+ i +"].PubTime"));
			bizMessage.setContentMapJson(_ctx.stringValue("QueryMessagesResponse.BizMessages["+ i +"].ContentMapJson"));

			bizMessages.add(bizMessage);
		}
		queryMessagesResponse.setBizMessages(bizMessages);
	 
	 	return queryMessagesResponse;
	}
}