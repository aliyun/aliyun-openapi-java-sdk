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

package com.aliyuncs.aliyuncvc.transform.v20190919;

import com.aliyuncs.aliyuncvc.model.v20190919.QueryUserInfoResponse;
import com.aliyuncs.aliyuncvc.model.v20190919.QueryUserInfoResponse.UserInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUserInfoResponseUnmarshaller {

	public static QueryUserInfoResponse unmarshall(QueryUserInfoResponse queryUserInfoResponse, UnmarshallerContext _ctx) {
		
		queryUserInfoResponse.setRequestId(_ctx.stringValue("QueryUserInfoResponse.RequestId"));
		queryUserInfoResponse.setErrorCode(_ctx.integerValue("QueryUserInfoResponse.ErrorCode"));
		queryUserInfoResponse.setMessage(_ctx.stringValue("QueryUserInfoResponse.Message"));
		queryUserInfoResponse.setSuccess(_ctx.booleanValue("QueryUserInfoResponse.Success"));

		UserInfo userInfo = new UserInfo();
		userInfo.setCurNum(_ctx.integerValue("QueryUserInfoResponse.UserInfo.CurNum"));
		userInfo.setMemberConcurrentMax(_ctx.integerValue("QueryUserInfoResponse.UserInfo.MemberConcurrentMax"));
		userInfo.setMaxNum(_ctx.integerValue("QueryUserInfoResponse.UserInfo.MaxNum"));
		queryUserInfoResponse.setUserInfo(userInfo);
	 
	 	return queryUserInfoResponse;
	}
}