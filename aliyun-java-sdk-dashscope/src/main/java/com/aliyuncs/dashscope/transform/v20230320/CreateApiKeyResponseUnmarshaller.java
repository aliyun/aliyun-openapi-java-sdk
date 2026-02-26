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

import com.aliyuncs.dashscope.model.v20230320.CreateApiKeyResponse;
import com.aliyuncs.dashscope.model.v20230320.CreateApiKeyResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateApiKeyResponseUnmarshaller {

	public static CreateApiKeyResponse unmarshall(CreateApiKeyResponse createApiKeyResponse, UnmarshallerContext _ctx) {
		
		createApiKeyResponse.setRequestId(_ctx.stringValue("CreateApiKeyResponse.RequestId"));
		createApiKeyResponse.setSuccess(_ctx.booleanValue("CreateApiKeyResponse.Success"));
		createApiKeyResponse.setAccessDeniedDetail(_ctx.stringValue("CreateApiKeyResponse.AccessDeniedDetail"));

		Data data = new Data();
		data.setId(_ctx.longValue("CreateApiKeyResponse.Data.Id"));
		data.setUserId(_ctx.stringValue("CreateApiKeyResponse.Data.UserId"));
		data.setApiKey(_ctx.stringValue("CreateApiKeyResponse.Data.ApiKey"));
		data.setGmtCreate(_ctx.stringValue("CreateApiKeyResponse.Data.GmtCreate"));
		data.setGmtExpire(_ctx.stringValue("CreateApiKeyResponse.Data.GmtExpire"));
		data.setLatestActiveTime(_ctx.stringValue("CreateApiKeyResponse.Data.LatestActiveTime"));
		createApiKeyResponse.setData(data);
	 
	 	return createApiKeyResponse;
	}
}