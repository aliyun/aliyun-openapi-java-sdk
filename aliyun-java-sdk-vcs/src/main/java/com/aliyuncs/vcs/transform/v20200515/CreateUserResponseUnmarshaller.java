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

package com.aliyuncs.vcs.transform.v20200515;

import com.aliyuncs.vcs.model.v20200515.CreateUserResponse;
import com.aliyuncs.vcs.model.v20200515.CreateUserResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateUserResponseUnmarshaller {

	public static CreateUserResponse unmarshall(CreateUserResponse createUserResponse, UnmarshallerContext _ctx) {
		
		createUserResponse.setRequestId(_ctx.stringValue("CreateUserResponse.RequestId"));
		createUserResponse.setCode(_ctx.stringValue("CreateUserResponse.Code"));
		createUserResponse.setMessage(_ctx.stringValue("CreateUserResponse.Message"));

		Data data = new Data();
		data.setUserId(_ctx.integerValue("CreateUserResponse.Data.UserId"));
		data.setIsvSubId(_ctx.stringValue("CreateUserResponse.Data.IsvSubId"));
		data.setUserName(_ctx.stringValue("CreateUserResponse.Data.UserName"));
		data.setUserGroupId(_ctx.integerValue("CreateUserResponse.Data.UserGroupId"));
		data.setIdNumber(_ctx.stringValue("CreateUserResponse.Data.IdNumber"));
		data.setFaceImageUrl(_ctx.stringValue("CreateUserResponse.Data.FaceImageUrl"));
		data.setAddress(_ctx.stringValue("CreateUserResponse.Data.Address"));
		data.setAge(_ctx.stringValue("CreateUserResponse.Data.Age"));
		data.setGender(_ctx.stringValue("CreateUserResponse.Data.Gender"));
		data.setPlateNo(_ctx.stringValue("CreateUserResponse.Data.PlateNo"));
		data.setPhoneNo(_ctx.stringValue("CreateUserResponse.Data.PhoneNo"));
		data.setAttachment(_ctx.stringValue("CreateUserResponse.Data.Attachment"));
		data.setBizId(_ctx.stringValue("CreateUserResponse.Data.BizId"));
		createUserResponse.setData(data);
	 
	 	return createUserResponse;
	}
}