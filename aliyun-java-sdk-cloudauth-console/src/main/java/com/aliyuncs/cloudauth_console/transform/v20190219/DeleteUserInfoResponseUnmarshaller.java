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

import com.aliyuncs.cloudauth_console.model.v20190219.DeleteUserInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteUserInfoResponseUnmarshaller {

	public static DeleteUserInfoResponse unmarshall(DeleteUserInfoResponse deleteUserInfoResponse, UnmarshallerContext _ctx) {
		
		deleteUserInfoResponse.setRequestId(_ctx.stringValue("DeleteUserInfoResponse.RequestId"));
		deleteUserInfoResponse.setSuccess(_ctx.booleanValue("DeleteUserInfoResponse.Success"));
	 
	 	return deleteUserInfoResponse;
	}
}