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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.GetUserBySourceIdResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetUserBySourceIdResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserBySourceIdResponseUnmarshaller {

	public static GetUserBySourceIdResponse unmarshall(GetUserBySourceIdResponse getUserBySourceIdResponse, UnmarshallerContext _ctx) {
		
		getUserBySourceIdResponse.setRequestId(_ctx.stringValue("GetUserBySourceIdResponse.RequestId"));
		getUserBySourceIdResponse.setSuccess(_ctx.booleanValue("GetUserBySourceIdResponse.Success"));
		getUserBySourceIdResponse.setHttpStatusCode(_ctx.integerValue("GetUserBySourceIdResponse.HttpStatusCode"));
		getUserBySourceIdResponse.setCode(_ctx.stringValue("GetUserBySourceIdResponse.Code"));
		getUserBySourceIdResponse.setMessage(_ctx.stringValue("GetUserBySourceIdResponse.Message"));

		User user = new User();
		user.setId(_ctx.stringValue("GetUserBySourceIdResponse.User.Id"));
		user.setDisplayName(_ctx.stringValue("GetUserBySourceIdResponse.User.DisplayName"));
		getUserBySourceIdResponse.setUser(user);
	 
	 	return getUserBySourceIdResponse;
	}
}