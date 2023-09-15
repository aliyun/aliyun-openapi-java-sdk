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

import com.aliyuncs.cams.model.v20200606.CreateChatappMigrationInitiateResponse;
import com.aliyuncs.cams.model.v20200606.CreateChatappMigrationInitiateResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateChatappMigrationInitiateResponseUnmarshaller {

	public static CreateChatappMigrationInitiateResponse unmarshall(CreateChatappMigrationInitiateResponse createChatappMigrationInitiateResponse, UnmarshallerContext _ctx) {
		
		createChatappMigrationInitiateResponse.setRequestId(_ctx.stringValue("CreateChatappMigrationInitiateResponse.RequestId"));
		createChatappMigrationInitiateResponse.setCode(_ctx.stringValue("CreateChatappMigrationInitiateResponse.Code"));
		createChatappMigrationInitiateResponse.setMessage(_ctx.stringValue("CreateChatappMigrationInitiateResponse.Message"));
		createChatappMigrationInitiateResponse.setAccessDeniedDetail(_ctx.stringValue("CreateChatappMigrationInitiateResponse.AccessDeniedDetail"));

		Data data = new Data();
		data.setPhoneNumber(_ctx.stringValue("CreateChatappMigrationInitiateResponse.Data.PhoneNumber"));
		data.setId(_ctx.stringValue("CreateChatappMigrationInitiateResponse.Data.Id"));
		data.setStatus(_ctx.stringValue("CreateChatappMigrationInitiateResponse.Data.Status"));
		createChatappMigrationInitiateResponse.setData(data);
	 
	 	return createChatappMigrationInitiateResponse;
	}
}