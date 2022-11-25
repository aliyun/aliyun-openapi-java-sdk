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

package com.aliyuncs.viapi_regen.transform.v20211119;

import com.aliyuncs.viapi_regen.model.v20211119.GetUserInfoResponse;
import com.aliyuncs.viapi_regen.model.v20211119.GetUserInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserInfoResponseUnmarshaller {

	public static GetUserInfoResponse unmarshall(GetUserInfoResponse getUserInfoResponse, UnmarshallerContext _ctx) {
		
		getUserInfoResponse.setRequestId(_ctx.stringValue("GetUserInfoResponse.RequestId"));
		getUserInfoResponse.setMessage(_ctx.stringValue("GetUserInfoResponse.Message"));
		getUserInfoResponse.setCode(_ctx.stringValue("GetUserInfoResponse.Code"));

		Data data = new Data();
		data.setParentUid(_ctx.stringValue("GetUserInfoResponse.Data.ParentUid"));
		data.setUserType(_ctx.stringValue("GetUserInfoResponse.Data.UserType"));
		getUserInfoResponse.setData(data);
	 
	 	return getUserInfoResponse;
	}
}