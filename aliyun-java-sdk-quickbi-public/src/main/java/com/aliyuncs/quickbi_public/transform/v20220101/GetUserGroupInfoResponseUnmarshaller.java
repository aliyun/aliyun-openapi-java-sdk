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

import com.aliyuncs.quickbi_public.model.v20220101.GetUserGroupInfoResponse;
import com.aliyuncs.quickbi_public.model.v20220101.GetUserGroupInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserGroupInfoResponseUnmarshaller {

	public static GetUserGroupInfoResponse unmarshall(GetUserGroupInfoResponse getUserGroupInfoResponse, UnmarshallerContext _ctx) {
		
		getUserGroupInfoResponse.setRequestId(_ctx.stringValue("GetUserGroupInfoResponse.RequestId"));
		getUserGroupInfoResponse.setSuccess(_ctx.booleanValue("GetUserGroupInfoResponse.Success"));

		List<Data> result = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("GetUserGroupInfoResponse.Result.Length"); i++) {
			Data data = new Data();
			data.setIdentifiedPath(_ctx.stringValue("GetUserGroupInfoResponse.Result["+ i +"].IdentifiedPath"));
			data.setParentUsergroupId(_ctx.stringValue("GetUserGroupInfoResponse.Result["+ i +"].ParentUsergroupId"));
			data.setModifiedTime(_ctx.stringValue("GetUserGroupInfoResponse.Result["+ i +"].ModifiedTime"));
			data.setCreateUser(_ctx.stringValue("GetUserGroupInfoResponse.Result["+ i +"].CreateUser"));
			data.setUsergroupName(_ctx.stringValue("GetUserGroupInfoResponse.Result["+ i +"].UsergroupName"));
			data.setCreateTime(_ctx.stringValue("GetUserGroupInfoResponse.Result["+ i +"].CreateTime"));
			data.setUsergroupDesc(_ctx.stringValue("GetUserGroupInfoResponse.Result["+ i +"].UsergroupDesc"));
			data.setUsergroupId(_ctx.stringValue("GetUserGroupInfoResponse.Result["+ i +"].UsergroupId"));
			data.setModifyUser(_ctx.stringValue("GetUserGroupInfoResponse.Result["+ i +"].ModifyUser"));

			result.add(data);
		}
		getUserGroupInfoResponse.setResult(result);
	 
	 	return getUserGroupInfoResponse;
	}
}