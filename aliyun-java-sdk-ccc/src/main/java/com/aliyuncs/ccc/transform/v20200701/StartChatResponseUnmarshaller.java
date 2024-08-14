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

package com.aliyuncs.ccc.transform.v20200701;

import com.aliyuncs.ccc.model.v20200701.StartChatResponse;
import com.aliyuncs.ccc.model.v20200701.StartChatResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartChatResponseUnmarshaller {

	public static StartChatResponse unmarshall(StartChatResponse startChatResponse, UnmarshallerContext _ctx) {
		
		startChatResponse.setRequestId(_ctx.stringValue("StartChatResponse.RequestId"));
		startChatResponse.setCode(_ctx.stringValue("StartChatResponse.Code"));
		startChatResponse.setHttpStatusCode(_ctx.integerValue("StartChatResponse.HttpStatusCode"));
		startChatResponse.setMessage(_ctx.stringValue("StartChatResponse.Message"));

		Data data = new Data();
		data.setChatConversationId(_ctx.stringValue("StartChatResponse.Data.ChatConversationId"));
		data.setJobId(_ctx.stringValue("StartChatResponse.Data.JobId"));
		startChatResponse.setData(data);
	 
	 	return startChatResponse;
	}
}