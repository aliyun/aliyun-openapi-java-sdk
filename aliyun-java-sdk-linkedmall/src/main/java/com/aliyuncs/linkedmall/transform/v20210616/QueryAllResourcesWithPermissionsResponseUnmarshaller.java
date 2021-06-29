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

package com.aliyuncs.linkedmall.transform.v20210616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkedmall.model.v20210616.QueryAllResourcesWithPermissionsResponse;
import com.aliyuncs.linkedmall.model.v20210616.QueryAllResourcesWithPermissionsResponse.QueryAllResourcesWithPermissionsResponse1;
import com.aliyuncs.linkedmall.model.v20210616.QueryAllResourcesWithPermissionsResponse.QueryAllResourcesWithPermissionsResponse1.PermissionOfResource;
import com.aliyuncs.linkedmall.model.v20210616.QueryAllResourcesWithPermissionsResponse.QueryAllResourcesWithPermissionsResponse1.PermissionOfResource.PermissionItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAllResourcesWithPermissionsResponseUnmarshaller {

	public static QueryAllResourcesWithPermissionsResponse unmarshall(QueryAllResourcesWithPermissionsResponse queryAllResourcesWithPermissionsResponse, UnmarshallerContext _ctx) {
		
		queryAllResourcesWithPermissionsResponse.setRequestId(_ctx.stringValue("QueryAllResourcesWithPermissionsResponse.RequestId"));
		queryAllResourcesWithPermissionsResponse.setCode(_ctx.stringValue("QueryAllResourcesWithPermissionsResponse.Code"));
		queryAllResourcesWithPermissionsResponse.setMessage(_ctx.stringValue("QueryAllResourcesWithPermissionsResponse.Message"));

		List<QueryAllResourcesWithPermissionsResponse1> data = new ArrayList<QueryAllResourcesWithPermissionsResponse1>();
		for (int i = 0; i < _ctx.lengthValue("QueryAllResourcesWithPermissionsResponse.Data.Length"); i++) {
			QueryAllResourcesWithPermissionsResponse1 queryAllResourcesWithPermissionsResponse1 = new QueryAllResourcesWithPermissionsResponse1();
			queryAllResourcesWithPermissionsResponse1.setResourceId(_ctx.stringValue("QueryAllResourcesWithPermissionsResponse.Data["+ i +"].ResourceId"));
			queryAllResourcesWithPermissionsResponse1.setName(_ctx.stringValue("QueryAllResourcesWithPermissionsResponse.Data["+ i +"].Name"));
			queryAllResourcesWithPermissionsResponse1.setCode(_ctx.stringValue("QueryAllResourcesWithPermissionsResponse.Data["+ i +"].Code"));
			queryAllResourcesWithPermissionsResponse1.setDescription(_ctx.stringValue("QueryAllResourcesWithPermissionsResponse.Data["+ i +"].Description"));
			queryAllResourcesWithPermissionsResponse1.setType(_ctx.stringValue("QueryAllResourcesWithPermissionsResponse.Data["+ i +"].Type"));
			queryAllResourcesWithPermissionsResponse1.setContent(_ctx.stringValue("QueryAllResourcesWithPermissionsResponse.Data["+ i +"].Content"));
			queryAllResourcesWithPermissionsResponse1.setCreator(_ctx.stringValue("QueryAllResourcesWithPermissionsResponse.Data["+ i +"].Creator"));

			List<Map<Object, Object>> resourceAttributeList = _ctx.listMapValue("QueryAllResourcesWithPermissionsResponse.Data["+ i +"].ResourceAttributeList");
			queryAllResourcesWithPermissionsResponse1.setResourceAttributeList(resourceAttributeList);

			List<PermissionOfResource> permissionOfResourceList = new ArrayList<PermissionOfResource>();
			for (int j = 0; j < _ctx.lengthValue("QueryAllResourcesWithPermissionsResponse.Data["+ i +"].PermissionOfResourceList.Length"); j++) {
				PermissionOfResource permissionOfResource = new PermissionOfResource();
				permissionOfResource.setName(_ctx.stringValue("QueryAllResourcesWithPermissionsResponse.Data["+ i +"].PermissionOfResourceList["+ j +"].Name"));
				permissionOfResource.setCode(_ctx.stringValue("QueryAllResourcesWithPermissionsResponse.Data["+ i +"].PermissionOfResourceList["+ j +"].Code"));
				permissionOfResource.setDescription(_ctx.stringValue("QueryAllResourcesWithPermissionsResponse.Data["+ i +"].PermissionOfResourceList["+ j +"].Description"));
				permissionOfResource.setPermissionId(_ctx.stringValue("QueryAllResourcesWithPermissionsResponse.Data["+ i +"].PermissionOfResourceList["+ j +"].PermissionId"));

				List<PermissionItem> permissionItemList = new ArrayList<PermissionItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryAllResourcesWithPermissionsResponse.Data["+ i +"].PermissionOfResourceList["+ j +"].PermissionItemList.Length"); k++) {
					PermissionItem permissionItem = new PermissionItem();
					permissionItem.setPermissionItemId(_ctx.stringValue("QueryAllResourcesWithPermissionsResponse.Data["+ i +"].PermissionOfResourceList["+ j +"].PermissionItemList["+ k +"].PermissionItemId"));
					permissionItem.setActionType(_ctx.stringValue("QueryAllResourcesWithPermissionsResponse.Data["+ i +"].PermissionOfResourceList["+ j +"].PermissionItemList["+ k +"].ActionType"));
					permissionItem.setPermissionType(_ctx.stringValue("QueryAllResourcesWithPermissionsResponse.Data["+ i +"].PermissionOfResourceList["+ j +"].PermissionItemList["+ k +"].PermissionType"));

					permissionItemList.add(permissionItem);
				}
				permissionOfResource.setPermissionItemList(permissionItemList);

				permissionOfResourceList.add(permissionOfResource);
			}
			queryAllResourcesWithPermissionsResponse1.setPermissionOfResourceList(permissionOfResourceList);

			data.add(queryAllResourcesWithPermissionsResponse1);
		}
		queryAllResourcesWithPermissionsResponse.setData(data);
	 
	 	return queryAllResourcesWithPermissionsResponse;
	}
}