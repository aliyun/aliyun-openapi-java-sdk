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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.GetConcurrentConversationQuotaResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetConcurrentConversationQuotaResponseUnmarshaller {

	public static GetConcurrentConversationQuotaResponse unmarshall(GetConcurrentConversationQuotaResponse getConcurrentConversationQuotaResponse, UnmarshallerContext context) {
		
		getConcurrentConversationQuotaResponse.setRequestId(context.stringValue("GetConcurrentConversationQuotaResponse.RequestId"));
		getConcurrentConversationQuotaResponse.setSuccess(context.booleanValue("GetConcurrentConversationQuotaResponse.Success"));
		getConcurrentConversationQuotaResponse.setCode(context.stringValue("GetConcurrentConversationQuotaResponse.Code"));
		getConcurrentConversationQuotaResponse.setMessage(context.stringValue("GetConcurrentConversationQuotaResponse.Message"));
		getConcurrentConversationQuotaResponse.setHttpStatusCode(context.integerValue("GetConcurrentConversationQuotaResponse.HttpStatusCode"));
		getConcurrentConversationQuotaResponse.setMaxConcurrent(context.integerValue("GetConcurrentConversationQuotaResponse.MaxConcurrent"));
		getConcurrentConversationQuotaResponse.setRemainingConcurrent(context.integerValue("GetConcurrentConversationQuotaResponse.RemainingConcurrent"));
	 
	 	return getConcurrentConversationQuotaResponse;
	}
}