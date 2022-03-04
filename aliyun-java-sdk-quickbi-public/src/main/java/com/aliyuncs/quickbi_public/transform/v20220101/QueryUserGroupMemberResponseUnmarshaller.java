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

package com.aliyuncs.quickbi_public.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20220101.QueryUserGroupMemberResponse;
import com.aliyuncs.quickbi_public.model.v20220101.QueryUserGroupMemberResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUserGroupMemberResponseUnmarshaller {

	public static QueryUserGroupMemberResponse unmarshall(QueryUserGroupMemberResponse queryUserGroupMemberResponse, UnmarshallerContext _ctx) {
		
		queryUserGroupMemberResponse.setRequestId(_ctx.stringValue("QueryUserGroupMemberResponse.RequestId"));
		queryUserGroupMemberResponse.setSuccess(_ctx.booleanValue("QueryUserGroupMemberResponse.Success"));

		List<Data> result = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("QueryUserGroupMemberResponse.Result.Length"); i++) {
			Data data = new Data();
			data.setParentUserGroupName(_ctx.stringValue("QueryUserGroupMemberResponse.Result["+ i +"].ParentUserGroupName"));
			data.setIsUserGroup(_ctx.booleanValue("QueryUserGroupMemberResponse.Result["+ i +"].IsUserGroup"));
			data.setName(_ctx.stringValue("QueryUserGroupMemberResponse.Result["+ i +"].Name"));
			data.setParentUserGroupId(_ctx.stringValue("QueryUserGroupMemberResponse.Result["+ i +"].ParentUserGroupId"));
			data.setId(_ctx.stringValue("QueryUserGroupMemberResponse.Result["+ i +"].Id"));

			result.add(data);
		}
		queryUserGroupMemberResponse.setResult(result);
	 
	 	return queryUserGroupMemberResponse;
	}
}