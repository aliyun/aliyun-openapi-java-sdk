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

package com.aliyuncs.ram.transform.v20150501;

import com.aliyuncs.ram.model.v20150501.CreateLoginProfileResponse;
import com.aliyuncs.ram.model.v20150501.CreateLoginProfileResponse.LoginProfile;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLoginProfileResponseUnmarshaller {

	public static CreateLoginProfileResponse unmarshall(CreateLoginProfileResponse createLoginProfileResponse, UnmarshallerContext _ctx) {
		
		createLoginProfileResponse.setRequestId(_ctx.stringValue("CreateLoginProfileResponse.RequestId"));

		LoginProfile loginProfile = new LoginProfile();
		loginProfile.setPasswordResetRequired(_ctx.booleanValue("CreateLoginProfileResponse.LoginProfile.PasswordResetRequired"));
		loginProfile.setCreateDate(_ctx.stringValue("CreateLoginProfileResponse.LoginProfile.CreateDate"));
		loginProfile.setUserName(_ctx.stringValue("CreateLoginProfileResponse.LoginProfile.UserName"));
		loginProfile.setMFABindRequired(_ctx.booleanValue("CreateLoginProfileResponse.LoginProfile.MFABindRequired"));
		createLoginProfileResponse.setLoginProfile(loginProfile);
	 
	 	return createLoginProfileResponse;
	}
}