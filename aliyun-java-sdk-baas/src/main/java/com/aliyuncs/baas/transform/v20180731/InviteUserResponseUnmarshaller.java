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

package com.aliyuncs.baas.transform.v20180731;

import com.aliyuncs.baas.model.v20180731.InviteUserResponse;
import com.aliyuncs.baas.model.v20180731.InviteUserResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class InviteUserResponseUnmarshaller {

	public static InviteUserResponse unmarshall(InviteUserResponse inviteUserResponse, UnmarshallerContext context) {
		
		inviteUserResponse.setRequestId(context.stringValue("InviteUserResponse.RequestId"));

		Result result = new Result();
		result.setBid(context.stringValue("InviteUserResponse.Result.Bid"));
		result.setBizid(context.stringValue("InviteUserResponse.Result.Bizid"));
		result.setCode(context.stringValue("InviteUserResponse.Result.Code"));
		result.setCreateTime(context.longValue("InviteUserResponse.Result.CreateTime"));
		result.setEmail(context.stringValue("InviteUserResponse.Result.Email"));
		result.setFromBid(context.stringValue("InviteUserResponse.Result.FromBid"));
		result.setFromUserId(context.integerValue("InviteUserResponse.Result.FromUserId"));
		result.setStatus(context.integerValue("InviteUserResponse.Result.Status"));
		result.setUpdateTime(context.longValue("InviteUserResponse.Result.UpdateTime"));
		result.setUserId(context.integerValue("InviteUserResponse.Result.UserId"));
		inviteUserResponse.setResult(result);
	 
	 	return inviteUserResponse;
	}
}