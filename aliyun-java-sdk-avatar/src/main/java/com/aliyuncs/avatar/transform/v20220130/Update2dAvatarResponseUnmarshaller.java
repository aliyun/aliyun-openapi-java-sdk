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

import com.aliyuncs.avatar.model.v20220130.Update2dAvatarResponse;
import com.aliyuncs.avatar.model.v20220130.Update2dAvatarResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class Update2dAvatarResponseUnmarshaller {

	public static Update2dAvatarResponse unmarshall(Update2dAvatarResponse update2dAvatarResponse, UnmarshallerContext _ctx) {
		
		update2dAvatarResponse.setRequestId(_ctx.stringValue("Update2dAvatarResponse.RequestId"));
		update2dAvatarResponse.setCode(_ctx.stringValue("Update2dAvatarResponse.Code"));
		update2dAvatarResponse.setMessage(_ctx.stringValue("Update2dAvatarResponse.Message"));
		update2dAvatarResponse.setSuccess(_ctx.booleanValue("Update2dAvatarResponse.Success"));

		Data data = new Data();
		data.setCode(_ctx.stringValue("Update2dAvatarResponse.Data.Code"));
		update2dAvatarResponse.setData(data);
	 
	 	return update2dAvatarResponse;
	}
}