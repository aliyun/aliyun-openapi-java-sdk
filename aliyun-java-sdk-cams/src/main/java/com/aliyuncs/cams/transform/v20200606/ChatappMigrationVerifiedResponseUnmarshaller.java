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

import com.aliyuncs.cams.model.v20200606.ChatappMigrationVerifiedResponse;
import com.aliyuncs.cams.model.v20200606.ChatappMigrationVerifiedResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChatappMigrationVerifiedResponseUnmarshaller {

	public static ChatappMigrationVerifiedResponse unmarshall(ChatappMigrationVerifiedResponse chatappMigrationVerifiedResponse, UnmarshallerContext _ctx) {
		
		chatappMigrationVerifiedResponse.setRequestId(_ctx.stringValue("ChatappMigrationVerifiedResponse.RequestId"));
		chatappMigrationVerifiedResponse.setCode(_ctx.stringValue("ChatappMigrationVerifiedResponse.Code"));
		chatappMigrationVerifiedResponse.setMessage(_ctx.stringValue("ChatappMigrationVerifiedResponse.Message"));
		chatappMigrationVerifiedResponse.setAccessDeniedDetail(_ctx.stringValue("ChatappMigrationVerifiedResponse.AccessDeniedDetail"));

		Data data = new Data();
		data.setPhoneNumber(_ctx.stringValue("ChatappMigrationVerifiedResponse.Data.PhoneNumber"));
		data.setId(_ctx.stringValue("ChatappMigrationVerifiedResponse.Data.Id"));
		chatappMigrationVerifiedResponse.setData(data);
	 
	 	return chatappMigrationVerifiedResponse;
	}
}