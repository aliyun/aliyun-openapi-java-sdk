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

package com.aliyuncs.avatar.transform.v20220130;

import com.aliyuncs.avatar.model.v20220130.Create2dAvatarResponse;
import com.aliyuncs.avatar.model.v20220130.Create2dAvatarResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class Create2dAvatarResponseUnmarshaller {

	public static Create2dAvatarResponse unmarshall(Create2dAvatarResponse create2dAvatarResponse, UnmarshallerContext _ctx) {
		
		create2dAvatarResponse.setRequestId(_ctx.stringValue("Create2dAvatarResponse.RequestId"));
		create2dAvatarResponse.setCode(_ctx.stringValue("Create2dAvatarResponse.Code"));
		create2dAvatarResponse.setMessage(_ctx.stringValue("Create2dAvatarResponse.Message"));
		create2dAvatarResponse.setSuccess(_ctx.booleanValue("Create2dAvatarResponse.Success"));

		Data data = new Data();
		data.setCode(_ctx.stringValue("Create2dAvatarResponse.Data.Code"));
		create2dAvatarResponse.setData(data);
	 
	 	return create2dAvatarResponse;
	}
}