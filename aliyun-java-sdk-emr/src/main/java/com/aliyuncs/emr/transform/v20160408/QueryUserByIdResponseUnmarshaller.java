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

package com.aliyuncs.emr.transform.v20160408;

import com.aliyuncs.emr.model.v20160408.QueryUserByIdResponse;
import com.aliyuncs.emr.model.v20160408.QueryUserByIdResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUserByIdResponseUnmarshaller {

	public static QueryUserByIdResponse unmarshall(QueryUserByIdResponse queryUserByIdResponse, UnmarshallerContext context) {
		
		queryUserByIdResponse.setRequestId(context.stringValue("QueryUserByIdResponse.RequestId"));

		User user = new User();
		user.setId(context.stringValue("QueryUserByIdResponse.User.Id"));
		user.setAliyunId(context.stringValue("QueryUserByIdResponse.User.AliyunId"));
		user.setAliyunOmtId(context.stringValue("QueryUserByIdResponse.User.AliyunOmtId"));
		user.setUserId(context.stringValue("QueryUserByIdResponse.User.UserId"));
		user.setEmail(context.stringValue("QueryUserByIdResponse.User.Email"));
		user.setStatus(context.stringValue("QueryUserByIdResponse.User.Status"));
		user.setDefaultSecGroup(context.stringValue("QueryUserByIdResponse.User.DefaultSecGroup"));
		user.setRegionId(context.stringValue("QueryUserByIdResponse.User.RegionId"));
		user.setChannelId(context.stringValue("QueryUserByIdResponse.User.ChannelId"));
		queryUserByIdResponse.setUser(user);
	 
	 	return queryUserByIdResponse;
	}
}