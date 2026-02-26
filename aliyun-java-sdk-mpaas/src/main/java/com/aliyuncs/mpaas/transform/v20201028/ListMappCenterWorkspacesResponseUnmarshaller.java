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

package com.aliyuncs.mpaas.transform.v20201028;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpaas.model.v20201028.ListMappCenterWorkspacesResponse;
import com.aliyuncs.mpaas.model.v20201028.ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult;
import com.aliyuncs.mpaas.model.v20201028.ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.MappCenterWorkspaceListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMappCenterWorkspacesResponseUnmarshaller {

	public static ListMappCenterWorkspacesResponse unmarshall(ListMappCenterWorkspacesResponse listMappCenterWorkspacesResponse, UnmarshallerContext _ctx) {
		
		listMappCenterWorkspacesResponse.setRequestId(_ctx.stringValue("ListMappCenterWorkspacesResponse.RequestId"));
		listMappCenterWorkspacesResponse.setResultMessage(_ctx.stringValue("ListMappCenterWorkspacesResponse.ResultMessage"));
		listMappCenterWorkspacesResponse.setResultCode(_ctx.stringValue("ListMappCenterWorkspacesResponse.ResultCode"));

		ListMappCenterWorkspaceResult listMappCenterWorkspaceResult = new ListMappCenterWorkspaceResult();
		listMappCenterWorkspaceResult.setSuccess(_ctx.booleanValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.Success"));
		listMappCenterWorkspaceResult.setResultMsg(_ctx.stringValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.ResultMsg"));
		listMappCenterWorkspaceResult.setUserId(_ctx.stringValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.UserId"));

		List<MappCenterWorkspaceListItem> mappCenterWorkspaceList = new ArrayList<MappCenterWorkspaceListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.MappCenterWorkspaceList.Length"); i++) {
			MappCenterWorkspaceListItem mappCenterWorkspaceListItem = new MappCenterWorkspaceListItem();
			mappCenterWorkspaceListItem.setDisplayName(_ctx.stringValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.MappCenterWorkspaceList["+ i +"].DisplayName"));
			mappCenterWorkspaceListItem.setStatus(_ctx.stringValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.MappCenterWorkspaceList["+ i +"].Status"));
			mappCenterWorkspaceListItem.setType(_ctx.stringValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.MappCenterWorkspaceList["+ i +"].Type"));
			mappCenterWorkspaceListItem.setZones(_ctx.stringValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.MappCenterWorkspaceList["+ i +"].Zones"));
			mappCenterWorkspaceListItem.setUpdateTime(_ctx.stringValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.MappCenterWorkspaceList["+ i +"].UpdateTime"));
			mappCenterWorkspaceListItem.setCreateTime(_ctx.stringValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.MappCenterWorkspaceList["+ i +"].CreateTime"));
			mappCenterWorkspaceListItem.setWorkspaceId(_ctx.stringValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.MappCenterWorkspaceList["+ i +"].WorkspaceId"));
			mappCenterWorkspaceListItem.setRegion(_ctx.stringValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.MappCenterWorkspaceList["+ i +"].Region"));
			mappCenterWorkspaceListItem.setCompatibleId(_ctx.stringValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.MappCenterWorkspaceList["+ i +"].CompatibleId"));
			mappCenterWorkspaceListItem.setId(_ctx.stringValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.MappCenterWorkspaceList["+ i +"].Id"));
			mappCenterWorkspaceListItem.setTenantId(_ctx.stringValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.MappCenterWorkspaceList["+ i +"].TenantId"));
			mappCenterWorkspaceListItem.setUid(_ctx.longValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.MappCenterWorkspaceList["+ i +"].Uid"));

			mappCenterWorkspaceList.add(mappCenterWorkspaceListItem);
		}
		listMappCenterWorkspaceResult.setMappCenterWorkspaceList(mappCenterWorkspaceList);
		listMappCenterWorkspacesResponse.setListMappCenterWorkspaceResult(listMappCenterWorkspaceResult);
	 
	 	return listMappCenterWorkspacesResponse;
	}
}