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

package com.aliyuncs.quickbi_public.transform.v20200731;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20200731.ListUserGroupsByUserIdResponse;
import com.aliyuncs.quickbi_public.model.v20200731.ListUserGroupsByUserIdResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserGroupsByUserIdResponseUnmarshaller {

	public static ListUserGroupsByUserIdResponse unmarshall(ListUserGroupsByUserIdResponse listUserGroupsByUserIdResponse, UnmarshallerContext _ctx) {
		
		listUserGroupsByUserIdResponse.setRequestId(_ctx.stringValue("ListUserGroupsByUserIdResponse.RequestId"));
		listUserGroupsByUserIdResponse.setSuccess(_ctx.booleanValue("ListUserGroupsByUserIdResponse.Success"));

		List<Data> result = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListUserGroupsByUserIdResponse.Result.Length"); i++) {
			Data data = new Data();
			data.setUsergroupId(_ctx.stringValue("ListUserGroupsByUserIdResponse.Result["+ i +"].UsergroupId"));
			data.setUsergroupName(_ctx.stringValue("ListUserGroupsByUserIdResponse.Result["+ i +"].UsergroupName"));
			data.setUsergroupDesc(_ctx.stringValue("ListUserGroupsByUserIdResponse.Result["+ i +"].UsergroupDesc"));
			data.setParentUsergroupId(_ctx.stringValue("ListUserGroupsByUserIdResponse.Result["+ i +"].ParentUsergroupId"));
			data.setIdentifiedPath(_ctx.stringValue("ListUserGroupsByUserIdResponse.Result["+ i +"].IdentifiedPath"));
			data.setCreateUser(_ctx.stringValue("ListUserGroupsByUserIdResponse.Result["+ i +"].CreateUser"));
			data.setModifyUser(_ctx.stringValue("ListUserGroupsByUserIdResponse.Result["+ i +"].ModifyUser"));
			data.setCreateTime(_ctx.stringValue("ListUserGroupsByUserIdResponse.Result["+ i +"].CreateTime"));
			data.setModifiedTime(_ctx.stringValue("ListUserGroupsByUserIdResponse.Result["+ i +"].ModifiedTime"));

			result.add(data);
		}
		listUserGroupsByUserIdResponse.setResult(result);
	 
	 	return listUserGroupsByUserIdResponse;
	}
}