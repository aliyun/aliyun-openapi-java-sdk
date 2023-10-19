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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.BatchGetUsersResponse;
import com.aliyuncs.dataphin_public.model.v20230630.BatchGetUsersResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchGetUsersResponseUnmarshaller {

	public static BatchGetUsersResponse unmarshall(BatchGetUsersResponse batchGetUsersResponse, UnmarshallerContext _ctx) {
		
		batchGetUsersResponse.setRequestId(_ctx.stringValue("BatchGetUsersResponse.RequestId"));
		batchGetUsersResponse.setSuccess(_ctx.booleanValue("BatchGetUsersResponse.Success"));
		batchGetUsersResponse.setHttpStatusCode(_ctx.integerValue("BatchGetUsersResponse.HttpStatusCode"));
		batchGetUsersResponse.setCode(_ctx.stringValue("BatchGetUsersResponse.Code"));
		batchGetUsersResponse.setMessage(_ctx.stringValue("BatchGetUsersResponse.Message"));

		List<User> data = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("BatchGetUsersResponse.Data.Length"); i++) {
			User user = new User();
			user.setAccountName(_ctx.stringValue("BatchGetUsersResponse.Data["+ i +"].AccountName"));
			user.setDingNumber(_ctx.stringValue("BatchGetUsersResponse.Data["+ i +"].DingNumber"));
			user.setDisplayName(_ctx.stringValue("BatchGetUsersResponse.Data["+ i +"].DisplayName"));
			user.setGmtCreate(_ctx.longValue("BatchGetUsersResponse.Data["+ i +"].GmtCreate"));
			user.setGmtModified(_ctx.longValue("BatchGetUsersResponse.Data["+ i +"].GmtModified"));
			user.setMail(_ctx.stringValue("BatchGetUsersResponse.Data["+ i +"].Mail"));
			user.setMobilePhone(_ctx.stringValue("BatchGetUsersResponse.Data["+ i +"].MobilePhone"));
			user.setNickName(_ctx.stringValue("BatchGetUsersResponse.Data["+ i +"].NickName"));
			user.setRealName(_ctx.stringValue("BatchGetUsersResponse.Data["+ i +"].RealName"));
			user.setSourceType(_ctx.stringValue("BatchGetUsersResponse.Data["+ i +"].SourceType"));
			user.setSourceUserId(_ctx.stringValue("BatchGetUsersResponse.Data["+ i +"].SourceUserId"));
			user.setTenantId(_ctx.longValue("BatchGetUsersResponse.Data["+ i +"].TenantId"));
			user.setUserId(_ctx.stringValue("BatchGetUsersResponse.Data["+ i +"].UserId"));
			user.setUserName(_ctx.stringValue("BatchGetUsersResponse.Data["+ i +"].UserName"));

			List<String> userTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("BatchGetUsersResponse.Data["+ i +"].UserTypes.Length"); j++) {
				userTypes.add(_ctx.stringValue("BatchGetUsersResponse.Data["+ i +"].UserTypes["+ j +"]"));
			}
			user.setUserTypes(userTypes);

			data.add(user);
		}
		batchGetUsersResponse.setData(data);
	 
	 	return batchGetUsersResponse;
	}
}