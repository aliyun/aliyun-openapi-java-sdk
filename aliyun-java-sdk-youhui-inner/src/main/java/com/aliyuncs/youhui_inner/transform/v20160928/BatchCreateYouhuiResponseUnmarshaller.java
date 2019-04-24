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

package com.aliyuncs.youhui_inner.transform.v20160928;

import com.aliyuncs.youhui_inner.model.v20160928.BatchCreateYouhuiResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchCreateYouhuiResponseUnmarshaller {

	public static BatchCreateYouhuiResponse unmarshall(BatchCreateYouhuiResponse batchCreateYouhuiResponse, UnmarshallerContext context) {
		
		batchCreateYouhuiResponse.setRequestId(context.stringValue("BatchCreateYouhuiResponse.RequestId"));
		batchCreateYouhuiResponse.setSuccess(context.booleanValue("BatchCreateYouhuiResponse.Success"));
		batchCreateYouhuiResponse.setCode(context.stringValue("BatchCreateYouhuiResponse.Code"));
		batchCreateYouhuiResponse.setMessage(context.stringValue("BatchCreateYouhuiResponse.Message"));
		batchCreateYouhuiResponse.setIsIdempotentResp(context.booleanValue("BatchCreateYouhuiResponse.IsIdempotentResp"));
		batchCreateYouhuiResponse.setData(context.stringValue("BatchCreateYouhuiResponse.Data"));
	 
	 	return batchCreateYouhuiResponse;
	}
}