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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.GetConcurrentConversationQuotaResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetConcurrentConversationQuotaResponseUnmarshaller {

	public static GetConcurrentConversationQuotaResponse unmarshall(GetConcurrentConversationQuotaResponse getConcurrentConversationQuotaResponse, UnmarshallerContext _ctx) {
		
		getConcurrentConversationQuotaResponse.setRequestId(_ctx.stringValue("GetConcurrentConversationQuotaResponse.RequestId"));
		getConcurrentConversationQuotaResponse.setCode(_ctx.stringValue("GetConcurrentConversationQuotaResponse.Code"));
		getConcurrentConversationQuotaResponse.setHttpStatusCode(_ctx.integerValue("GetConcurrentConversationQuotaResponse.HttpStatusCode"));
		getConcurrentConversationQuotaResponse.setMaxConcurrent(_ctx.integerValue("GetConcurrentConversationQuotaResponse.MaxConcurrent"));
		getConcurrentConversationQuotaResponse.setMessage(_ctx.stringValue("GetConcurrentConversationQuotaResponse.Message"));
		getConcurrentConversationQuotaResponse.setRemainingConcurrent(_ctx.integerValue("GetConcurrentConversationQuotaResponse.RemainingConcurrent"));
		getConcurrentConversationQuotaResponse.setSuccess(_ctx.booleanValue("GetConcurrentConversationQuotaResponse.Success"));
	 
	 	return getConcurrentConversationQuotaResponse;
	}
}