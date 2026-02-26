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

import com.aliyuncs.dataphin_public.model.v20230630.ListDataServiceMyApiPermissionsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListDataServiceMyApiPermissionsResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListDataServiceMyApiPermissionsResponse.PageResult.Permission;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataServiceMyApiPermissionsResponseUnmarshaller {

	public static ListDataServiceMyApiPermissionsResponse unmarshall(ListDataServiceMyApiPermissionsResponse listDataServiceMyApiPermissionsResponse, UnmarshallerContext _ctx) {
		
		listDataServiceMyApiPermissionsResponse.setRequestId(_ctx.stringValue("ListDataServiceMyApiPermissionsResponse.RequestId"));
		listDataServiceMyApiPermissionsResponse.setSuccess(_ctx.booleanValue("ListDataServiceMyApiPermissionsResponse.Success"));
		listDataServiceMyApiPermissionsResponse.setHttpStatusCode(_ctx.integerValue("ListDataServiceMyApiPermissionsResponse.HttpStatusCode"));
		listDataServiceMyApiPermissionsResponse.setCode(_ctx.stringValue("ListDataServiceMyApiPermissionsResponse.Code"));
		listDataServiceMyApiPermissionsResponse.setMessage(_ctx.stringValue("ListDataServiceMyApiPermissionsResponse.Message"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.integerValue("ListDataServiceMyApiPermissionsResponse.PageResult.TotalCount"));

		List<Permission> permissionList = new ArrayList<Permission>();
		for (int i = 0; i < _ctx.lengthValue("ListDataServiceMyApiPermissionsResponse.PageResult.PermissionList.Length"); i++) {
			Permission permission = new Permission();
			permission.setRole(_ctx.integerValue("ListDataServiceMyApiPermissionsResponse.PageResult.PermissionList["+ i +"].Role"));
			permission.setOwner(_ctx.stringValue("ListDataServiceMyApiPermissionsResponse.PageResult.PermissionList["+ i +"].Owner"));
			permission.setPrivilegeBelongTo(_ctx.stringValue("ListDataServiceMyApiPermissionsResponse.PageResult.PermissionList["+ i +"].PrivilegeBelongTo"));
			permission.setApiName(_ctx.stringValue("ListDataServiceMyApiPermissionsResponse.PageResult.PermissionList["+ i +"].ApiName"));
			permission.setPrivilegeFrom(_ctx.integerValue("ListDataServiceMyApiPermissionsResponse.PageResult.PermissionList["+ i +"].PrivilegeFrom"));
			permission.setProjectName(_ctx.stringValue("ListDataServiceMyApiPermissionsResponse.PageResult.PermissionList["+ i +"].ProjectName"));
			permission.setProjectId(_ctx.integerValue("ListDataServiceMyApiPermissionsResponse.PageResult.PermissionList["+ i +"].ProjectId"));
			permission.setOwnerUserName(_ctx.stringValue("ListDataServiceMyApiPermissionsResponse.PageResult.PermissionList["+ i +"].OwnerUserName"));
			permission.setCreator(_ctx.stringValue("ListDataServiceMyApiPermissionsResponse.PageResult.PermissionList["+ i +"].Creator"));
			permission.setApiId(_ctx.longValue("ListDataServiceMyApiPermissionsResponse.PageResult.PermissionList["+ i +"].ApiId"));
			permission.setCreateUserName(_ctx.stringValue("ListDataServiceMyApiPermissionsResponse.PageResult.PermissionList["+ i +"].CreateUserName"));

			permissionList.add(permission);
		}
		pageResult.setPermissionList(permissionList);
		listDataServiceMyApiPermissionsResponse.setPageResult(pageResult);
	 
	 	return listDataServiceMyApiPermissionsResponse;
	}
}