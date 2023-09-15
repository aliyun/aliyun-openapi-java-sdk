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

package com.aliyuncs.cams.transform.v20200606;

import com.aliyuncs.cams.model.v20200606.QueryChatappBindWabaResponse;
import com.aliyuncs.cams.model.v20200606.QueryChatappBindWabaResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryChatappBindWabaResponseUnmarshaller {

	public static QueryChatappBindWabaResponse unmarshall(QueryChatappBindWabaResponse queryChatappBindWabaResponse, UnmarshallerContext _ctx) {
		
		queryChatappBindWabaResponse.setRequestId(_ctx.stringValue("QueryChatappBindWabaResponse.RequestId"));
		queryChatappBindWabaResponse.setCode(_ctx.stringValue("QueryChatappBindWabaResponse.Code"));
		queryChatappBindWabaResponse.setMessage(_ctx.stringValue("QueryChatappBindWabaResponse.Message"));
		queryChatappBindWabaResponse.setAccessDeniedDetail(_ctx.stringValue("QueryChatappBindWabaResponse.AccessDeniedDetail"));

		Data data = new Data();
		data.setName(_ctx.stringValue("QueryChatappBindWabaResponse.Data.Name"));
		data.setCurrency(_ctx.stringValue("QueryChatappBindWabaResponse.Data.Currency"));
		data.setId(_ctx.stringValue("QueryChatappBindWabaResponse.Data.Id"));
		data.setMessageTemplateNamespace(_ctx.stringValue("QueryChatappBindWabaResponse.Data.MessageTemplateNamespace"));
		data.setAccountReviewStatus(_ctx.stringValue("QueryChatappBindWabaResponse.Data.AccountReviewStatus"));
		queryChatappBindWabaResponse.setData(data);
	 
	 	return queryChatappBindWabaResponse;
	}
}