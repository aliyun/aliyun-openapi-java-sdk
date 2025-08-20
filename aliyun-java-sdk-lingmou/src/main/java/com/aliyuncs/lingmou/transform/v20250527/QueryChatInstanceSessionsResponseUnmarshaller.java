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

package com.aliyuncs.lingmou.transform.v20250527;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.lingmou.model.v20250527.QueryChatInstanceSessionsResponse;
import com.aliyuncs.lingmou.model.v20250527.QueryChatInstanceSessionsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryChatInstanceSessionsResponseUnmarshaller {

	public static QueryChatInstanceSessionsResponse unmarshall(QueryChatInstanceSessionsResponse queryChatInstanceSessionsResponse, UnmarshallerContext _ctx) {
		
		queryChatInstanceSessionsResponse.setRequestId(_ctx.stringValue("QueryChatInstanceSessionsResponse.requestId"));
		queryChatInstanceSessionsResponse.setSuccess(_ctx.booleanValue("QueryChatInstanceSessionsResponse.success"));
		queryChatInstanceSessionsResponse.setCode(_ctx.stringValue("QueryChatInstanceSessionsResponse.code"));
		queryChatInstanceSessionsResponse.setMessage(_ctx.stringValue("QueryChatInstanceSessionsResponse.message"));
		queryChatInstanceSessionsResponse.setHttpStatusCode(_ctx.integerValue("QueryChatInstanceSessionsResponse.httpStatusCode"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryChatInstanceSessionsResponse.data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setSessionId(_ctx.stringValue("QueryChatInstanceSessionsResponse.data["+ i +"].sessionId"));
			dataItem.setMainAccountId(_ctx.longValue("QueryChatInstanceSessionsResponse.data["+ i +"].mainAccountId"));
			dataItem.setCreatedAt(_ctx.longValue("QueryChatInstanceSessionsResponse.data["+ i +"].createdAt"));

			data.add(dataItem);
		}
		queryChatInstanceSessionsResponse.setData(data);
	 
	 	return queryChatInstanceSessionsResponse;
	}
}