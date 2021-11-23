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

package com.aliyuncs.bssopenapi.transform.v20171214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bssopenapi.model.v20171214.QueryPermissionListResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryPermissionListResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QueryPermissionListResponse.Data.PermissionListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPermissionListResponseUnmarshaller {

	public static QueryPermissionListResponse unmarshall(QueryPermissionListResponse queryPermissionListResponse, UnmarshallerContext _ctx) {
		
		queryPermissionListResponse.setRequestId(_ctx.stringValue("QueryPermissionListResponse.RequestId"));
		queryPermissionListResponse.setCode(_ctx.stringValue("QueryPermissionListResponse.Code"));
		queryPermissionListResponse.setMessage(_ctx.stringValue("QueryPermissionListResponse.Message"));
		queryPermissionListResponse.setSuccess(_ctx.booleanValue("QueryPermissionListResponse.Success"));

		Data data = new Data();
		data.setEndTime(_ctx.stringValue("QueryPermissionListResponse.Data.EndTime"));
		data.setRelationType(_ctx.stringValue("QueryPermissionListResponse.Data.RelationType"));
		data.setStartTime(_ctx.stringValue("QueryPermissionListResponse.Data.StartTime"));
		data.setState(_ctx.stringValue("QueryPermissionListResponse.Data.State"));
		data.setMasterId(_ctx.longValue("QueryPermissionListResponse.Data.MasterId"));
		data.setMemberId(_ctx.longValue("QueryPermissionListResponse.Data.MemberId"));
		data.setSetupTime(_ctx.stringValue("QueryPermissionListResponse.Data.SetupTime"));

		List<PermissionListItem> permissionList = new ArrayList<PermissionListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryPermissionListResponse.Data.PermissionList.Length"); i++) {
			PermissionListItem permissionListItem = new PermissionListItem();
			permissionListItem.setEndTime(_ctx.stringValue("QueryPermissionListResponse.Data.PermissionList["+ i +"].EndTime"));
			permissionListItem.setStartTime(_ctx.stringValue("QueryPermissionListResponse.Data.PermissionList["+ i +"].StartTime"));
			permissionListItem.setPermissionCode(_ctx.stringValue("QueryPermissionListResponse.Data.PermissionList["+ i +"].PermissionCode"));
			permissionListItem.setPermissionName(_ctx.stringValue("QueryPermissionListResponse.Data.PermissionList["+ i +"].PermissionName"));

			permissionList.add(permissionListItem);
		}
		data.setPermissionList(permissionList);
		queryPermissionListResponse.setData(data);
	 
	 	return queryPermissionListResponse;
	}
}