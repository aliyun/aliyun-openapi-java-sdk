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

package com.aliyuncs.aliyuncvc.transform.v20191030;

import com.aliyuncs.aliyuncvc.model.v20191030.InviteUserResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InviteUserResponseUnmarshaller {

	public static InviteUserResponse unmarshall(InviteUserResponse inviteUserResponse, UnmarshallerContext _ctx) {
		
		inviteUserResponse.setRequestId(_ctx.stringValue("InviteUserResponse.RequestId"));
		inviteUserResponse.setErrorCode(_ctx.integerValue("InviteUserResponse.ErrorCode"));
		inviteUserResponse.setMessage(_ctx.stringValue("InviteUserResponse.Message"));
		inviteUserResponse.setSuccess(_ctx.booleanValue("InviteUserResponse.Success"));
	 
	 	return inviteUserResponse;
	}
}