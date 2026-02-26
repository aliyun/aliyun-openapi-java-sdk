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

import com.aliyuncs.dataphin_public.model.v20230630.ListDataServiceMyAppPermissionsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListDataServiceMyAppPermissionsResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListDataServiceMyAppPermissionsResponse.PageResult.Permission;
import com.aliyuncs.dataphin_public.model.v20230630.ListDataServiceMyAppPermissionsResponse.PageResult.Permission.RemarkForDebug;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataServiceMyAppPermissionsResponseUnmarshaller {

	public static ListDataServiceMyAppPermissionsResponse unmarshall(ListDataServiceMyAppPermissionsResponse listDataServiceMyAppPermissionsResponse, UnmarshallerContext _ctx) {
		
		listDataServiceMyAppPermissionsResponse.setRequestId(_ctx.stringValue("ListDataServiceMyAppPermissionsResponse.RequestId"));
		listDataServiceMyAppPermissionsResponse.setSuccess(_ctx.booleanValue("ListDataServiceMyAppPermissionsResponse.Success"));
		listDataServiceMyAppPermissionsResponse.setHttpStatusCode(_ctx.integerValue("ListDataServiceMyAppPermissionsResponse.HttpStatusCode"));
		listDataServiceMyAppPermissionsResponse.setCode(_ctx.stringValue("ListDataServiceMyAppPermissionsResponse.Code"));
		listDataServiceMyAppPermissionsResponse.setMessage(_ctx.stringValue("ListDataServiceMyAppPermissionsResponse.Message"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.integerValue("ListDataServiceMyAppPermissionsResponse.PageResult.TotalCount"));

		List<Permission> permissionList = new ArrayList<Permission>();
		for (int i = 0; i < _ctx.lengthValue("ListDataServiceMyAppPermissionsResponse.PageResult.PermissionList.Length"); i++) {
			Permission permission = new Permission();
			permission.setOwner(_ctx.stringValue("ListDataServiceMyAppPermissionsResponse.PageResult.PermissionList["+ i +"].Owner"));
			permission.setProjectName(_ctx.stringValue("ListDataServiceMyAppPermissionsResponse.PageResult.PermissionList["+ i +"].ProjectName"));
			permission.setProjectId(_ctx.integerValue("ListDataServiceMyAppPermissionsResponse.PageResult.PermissionList["+ i +"].ProjectId"));
			permission.setCreator(_ctx.stringValue("ListDataServiceMyAppPermissionsResponse.PageResult.PermissionList["+ i +"].Creator"));
			permission.setCreateUserName(_ctx.stringValue("ListDataServiceMyAppPermissionsResponse.PageResult.PermissionList["+ i +"].CreateUserName"));
			permission.setAppName(_ctx.stringValue("ListDataServiceMyAppPermissionsResponse.PageResult.PermissionList["+ i +"].AppName"));
			permission.setRole(_ctx.integerValue("ListDataServiceMyAppPermissionsResponse.PageResult.PermissionList["+ i +"].Role"));
			permission.setPrivilegeBelongTo(_ctx.stringValue("ListDataServiceMyAppPermissionsResponse.PageResult.PermissionList["+ i +"].PrivilegeBelongTo"));
			permission.setAppId(_ctx.integerValue("ListDataServiceMyAppPermissionsResponse.PageResult.PermissionList["+ i +"].AppId"));
			permission.setPrivilegeFrom(_ctx.integerValue("ListDataServiceMyAppPermissionsResponse.PageResult.PermissionList["+ i +"].PrivilegeFrom"));
			permission.setOwnerUserName(_ctx.stringValue("ListDataServiceMyAppPermissionsResponse.PageResult.PermissionList["+ i +"].OwnerUserName"));
			permission.setCurrentUserRole(_ctx.stringValue("ListDataServiceMyAppPermissionsResponse.PageResult.PermissionList["+ i +"].CurrentUserRole"));

			List<RemarkForDebug> remarkForDebugList = new ArrayList<RemarkForDebug>();
			for (int j = 0; j < _ctx.lengthValue("ListDataServiceMyAppPermissionsResponse.PageResult.PermissionList["+ i +"].RemarkForDebugList.Length"); j++) {
				RemarkForDebug remarkForDebug = new RemarkForDebug();
				remarkForDebug.setValue(_ctx.stringValue("ListDataServiceMyAppPermissionsResponse.PageResult.PermissionList["+ i +"].RemarkForDebugList["+ j +"].Value"));
				remarkForDebug.setKey(_ctx.stringValue("ListDataServiceMyAppPermissionsResponse.PageResult.PermissionList["+ i +"].RemarkForDebugList["+ j +"].Key"));

				remarkForDebugList.add(remarkForDebug);
			}
			permission.setRemarkForDebugList(remarkForDebugList);

			permissionList.add(permission);
		}
		pageResult.setPermissionList(permissionList);
		listDataServiceMyAppPermissionsResponse.setPageResult(pageResult);
	 
	 	return listDataServiceMyAppPermissionsResponse;
	}
}