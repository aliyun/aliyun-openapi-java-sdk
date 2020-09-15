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

package com.aliyuncs.cloudauth_console.transform.v20190219;

import com.aliyuncs.cloudauth_console.model.v20190219.SaveUserInfoResponse;
import com.aliyuncs.cloudauth_console.model.v20190219.SaveUserInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveUserInfoResponseUnmarshaller {

	public static SaveUserInfoResponse unmarshall(SaveUserInfoResponse saveUserInfoResponse, UnmarshallerContext _ctx) {
		
		saveUserInfoResponse.setRequestId(_ctx.stringValue("SaveUserInfoResponse.RequestId"));
		saveUserInfoResponse.setSuccess(_ctx.booleanValue("SaveUserInfoResponse.Success"));
		saveUserInfoResponse.setHttpStatusCode(_ctx.integerValue("SaveUserInfoResponse.HttpStatusCode"));

		Data data = new Data();
		data.setId(_ctx.longValue("SaveUserInfoResponse.Data.Id"));
		data.setGmtCreate(_ctx.longValue("SaveUserInfoResponse.Data.GmtCreate"));
		saveUserInfoResponse.setData(data);
	 
	 	return saveUserInfoResponse;
	}
}