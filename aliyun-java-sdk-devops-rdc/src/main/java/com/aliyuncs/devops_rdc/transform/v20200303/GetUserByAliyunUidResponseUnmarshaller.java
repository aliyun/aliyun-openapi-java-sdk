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

package com.aliyuncs.devops_rdc.transform.v20200303;

import com.aliyuncs.devops_rdc.model.v20200303.GetUserByAliyunUidResponse;
import com.aliyuncs.devops_rdc.model.v20200303.GetUserByAliyunUidResponse.Object;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserByAliyunUidResponseUnmarshaller {

	public static GetUserByAliyunUidResponse unmarshall(GetUserByAliyunUidResponse getUserByAliyunUidResponse, UnmarshallerContext _ctx) {
		
		getUserByAliyunUidResponse.setRequestId(_ctx.stringValue("GetUserByAliyunUidResponse.RequestId"));
		getUserByAliyunUidResponse.setErrorMsg(_ctx.stringValue("GetUserByAliyunUidResponse.ErrorMsg"));
		getUserByAliyunUidResponse.setSuccessful(_ctx.booleanValue("GetUserByAliyunUidResponse.Successful"));
		getUserByAliyunUidResponse.setErrorCode(_ctx.stringValue("GetUserByAliyunUidResponse.ErrorCode"));

		Object object = new Object();
		object.setAliyunPk(_ctx.stringValue("GetUserByAliyunUidResponse.Object.AliyunPk"));
		object.setEmail(_ctx.stringValue("GetUserByAliyunUidResponse.Object.Email"));
		object.setAvatarUrl(_ctx.stringValue("GetUserByAliyunUidResponse.Object.AvatarUrl"));
		object.setName(_ctx.stringValue("GetUserByAliyunUidResponse.Object.Name"));
		object.setId(_ctx.stringValue("GetUserByAliyunUidResponse.Object.Id"));
		object.setPhone(_ctx.stringValue("GetUserByAliyunUidResponse.Object.Phone"));
		getUserByAliyunUidResponse.setObject(object);
	 
	 	return getUserByAliyunUidResponse;
	}
}