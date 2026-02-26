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

import com.aliyuncs.avatar.model.v20220130.DeleteAvatarResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteAvatarResponseUnmarshaller {

	public static DeleteAvatarResponse unmarshall(DeleteAvatarResponse deleteAvatarResponse, UnmarshallerContext _ctx) {
		
		deleteAvatarResponse.setRequestId(_ctx.stringValue("DeleteAvatarResponse.RequestId"));
		deleteAvatarResponse.setCode(_ctx.stringValue("DeleteAvatarResponse.Code"));
		deleteAvatarResponse.setMessage(_ctx.stringValue("DeleteAvatarResponse.Message"));
		deleteAvatarResponse.setSuccess(_ctx.booleanValue("DeleteAvatarResponse.Success"));
	 
	 	return deleteAvatarResponse;
	}
}