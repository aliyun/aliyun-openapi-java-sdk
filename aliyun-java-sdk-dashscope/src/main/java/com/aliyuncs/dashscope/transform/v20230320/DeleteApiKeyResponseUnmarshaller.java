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

package com.aliyuncs.dashscope.transform.v20230320;

import com.aliyuncs.dashscope.model.v20230320.DeleteApiKeyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteApiKeyResponseUnmarshaller {

	public static DeleteApiKeyResponse unmarshall(DeleteApiKeyResponse deleteApiKeyResponse, UnmarshallerContext _ctx) {
		
		deleteApiKeyResponse.setRequestId(_ctx.stringValue("DeleteApiKeyResponse.RequestId"));
		deleteApiKeyResponse.setSuccess(_ctx.booleanValue("DeleteApiKeyResponse.Success"));
		deleteApiKeyResponse.setCode(_ctx.integerValue("DeleteApiKeyResponse.Code"));
		deleteApiKeyResponse.setErrorCode(_ctx.stringValue("DeleteApiKeyResponse.ErrorCode"));
		deleteApiKeyResponse.setMessage(_ctx.stringValue("DeleteApiKeyResponse.Message"));
		deleteApiKeyResponse.setAccessDeniedDetail(_ctx.stringValue("DeleteApiKeyResponse.AccessDeniedDetail"));
	 
	 	return deleteApiKeyResponse;
	}
}