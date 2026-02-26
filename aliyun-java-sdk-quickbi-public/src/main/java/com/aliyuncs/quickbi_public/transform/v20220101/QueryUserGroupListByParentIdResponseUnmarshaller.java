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

import com.aliyuncs.quickbi_public.model.v20220101.QueryUserGroupListByParentIdResponse;
import com.aliyuncs.quickbi_public.model.v20220101.QueryUserGroupListByParentIdResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUserGroupListByParentIdResponseUnmarshaller {

	public static QueryUserGroupListByParentIdResponse unmarshall(QueryUserGroupListByParentIdResponse queryUserGroupListByParentIdResponse, UnmarshallerContext _ctx) {
		
		queryUserGroupListByParentIdResponse.setRequestId(_ctx.stringValue("QueryUserGroupListByParentIdResponse.RequestId"));
		queryUserGroupListByParentIdResponse.setSuccess(_ctx.booleanValue("QueryUserGroupListByParentIdResponse.Success"));

		List<Data> result = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("QueryUserGroupListByParentIdResponse.Result.Length"); i++) {
			Data data = new Data();
			data.setCreateTime(_ctx.stringValue("QueryUserGroupListByParentIdResponse.Result["+ i +"].CreateTime"));
			data.setCreateUser(_ctx.stringValue("QueryUserGroupListByParentIdResponse.Result["+ i +"].CreateUser"));
			data.setIdentifiedPath(_ctx.stringValue("QueryUserGroupListByParentIdResponse.Result["+ i +"].IdentifiedPath"));
			data.setModifiedTime(_ctx.stringValue("QueryUserGroupListByParentIdResponse.Result["+ i +"].ModifiedTime"));
			data.setModifyUser(_ctx.stringValue("QueryUserGroupListByParentIdResponse.Result["+ i +"].ModifyUser"));
			data.setParentUserGroupId(_ctx.stringValue("QueryUserGroupListByParentIdResponse.Result["+ i +"].ParentUserGroupId"));
			data.setUserGroupDescription(_ctx.stringValue("QueryUserGroupListByParentIdResponse.Result["+ i +"].UserGroupDescription"));
			data.setUserGroupId(_ctx.stringValue("QueryUserGroupListByParentIdResponse.Result["+ i +"].UserGroupId"));
			data.setUserGroupName(_ctx.stringValue("QueryUserGroupListByParentIdResponse.Result["+ i +"].UserGroupName"));

			result.add(data);
		}
		queryUserGroupListByParentIdResponse.setResult(result);
	 
	 	return queryUserGroupListByParentIdResponse;
	}
}