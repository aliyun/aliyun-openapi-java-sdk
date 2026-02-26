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

import com.aliyuncs.cams.model.v20200606.GetMigrationVerifyCodeResponse;
import com.aliyuncs.cams.model.v20200606.GetMigrationVerifyCodeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMigrationVerifyCodeResponseUnmarshaller {

	public static GetMigrationVerifyCodeResponse unmarshall(GetMigrationVerifyCodeResponse getMigrationVerifyCodeResponse, UnmarshallerContext _ctx) {
		
		getMigrationVerifyCodeResponse.setRequestId(_ctx.stringValue("GetMigrationVerifyCodeResponse.RequestId"));
		getMigrationVerifyCodeResponse.setCode(_ctx.stringValue("GetMigrationVerifyCodeResponse.Code"));
		getMigrationVerifyCodeResponse.setMessage(_ctx.stringValue("GetMigrationVerifyCodeResponse.Message"));
		getMigrationVerifyCodeResponse.setAccessDeniedDetail(_ctx.stringValue("GetMigrationVerifyCodeResponse.AccessDeniedDetail"));

		Data data = new Data();
		data.setPhoneNumber(_ctx.stringValue("GetMigrationVerifyCodeResponse.Data.PhoneNumber"));
		data.setId(_ctx.stringValue("GetMigrationVerifyCodeResponse.Data.Id"));
		getMigrationVerifyCodeResponse.setData(data);
	 
	 	return getMigrationVerifyCodeResponse;
	}
}