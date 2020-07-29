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

package com.aliyuncs.mpaas.transform.v20190821;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpaas.model.v20190821.ListMappCenterWorkspacesResponse;
import com.aliyuncs.mpaas.model.v20190821.ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult;
import com.aliyuncs.mpaas.model.v20190821.ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.MappCenterWorkspaceListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMappCenterWorkspacesResponseUnmarshaller {

	public static ListMappCenterWorkspacesResponse unmarshall(ListMappCenterWorkspacesResponse listMappCenterWorkspacesResponse, UnmarshallerContext _ctx) {
		
		listMappCenterWorkspacesResponse.setRequestId(_ctx.stringValue("ListMappCenterWorkspacesResponse.RequestId"));
		listMappCenterWorkspacesResponse.setResultCode(_ctx.stringValue("ListMappCenterWorkspacesResponse.ResultCode"));
		listMappCenterWorkspacesResponse.setResultMessage(_ctx.stringValue("ListMappCenterWorkspacesResponse.ResultMessage"));

		ListMappCenterWorkspaceResult listMappCenterWorkspaceResult = new ListMappCenterWorkspaceResult();
		listMappCenterWorkspaceResult.setResultMsg(_ctx.stringValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.ResultMsg"));
		listMappCenterWorkspaceResult.setSuccess(_ctx.booleanValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.Success"));
		listMappCenterWorkspaceResult.setUserId(_ctx.stringValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.UserId"));

		List<MappCenterWorkspaceListItem> mappCenterWorkspaceList = new ArrayList<MappCenterWorkspaceListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.MappCenterWorkspaceList.Length"); i++) {
			MappCenterWorkspaceListItem mappCenterWorkspaceListItem = new MappCenterWorkspaceListItem();
			mappCenterWorkspaceListItem.setCompatibleId(_ctx.stringValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.MappCenterWorkspaceList["+ i +"].CompatibleId"));
			mappCenterWorkspaceListItem.setCreateTime(_ctx.stringValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.MappCenterWorkspaceList["+ i +"].CreateTime"));
			mappCenterWorkspaceListItem.setDisplayName(_ctx.stringValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.MappCenterWorkspaceList["+ i +"].DisplayName"));
			mappCenterWorkspaceListItem.setId(_ctx.stringValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.MappCenterWorkspaceList["+ i +"].Id"));
			mappCenterWorkspaceListItem.setRegion(_ctx.stringValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.MappCenterWorkspaceList["+ i +"].Region"));
			mappCenterWorkspaceListItem.setStatus(_ctx.stringValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.MappCenterWorkspaceList["+ i +"].Status"));
			mappCenterWorkspaceListItem.setTenantId(_ctx.stringValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.MappCenterWorkspaceList["+ i +"].TenantId"));
			mappCenterWorkspaceListItem.setType(_ctx.stringValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.MappCenterWorkspaceList["+ i +"].Type"));
			mappCenterWorkspaceListItem.setUid(_ctx.longValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.MappCenterWorkspaceList["+ i +"].Uid"));
			mappCenterWorkspaceListItem.setUpdateTime(_ctx.stringValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.MappCenterWorkspaceList["+ i +"].UpdateTime"));
			mappCenterWorkspaceListItem.setWorkspaceId(_ctx.stringValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.MappCenterWorkspaceList["+ i +"].WorkspaceId"));
			mappCenterWorkspaceListItem.setZones(_ctx.stringValue("ListMappCenterWorkspacesResponse.ListMappCenterWorkspaceResult.MappCenterWorkspaceList["+ i +"].Zones"));

			mappCenterWorkspaceList.add(mappCenterWorkspaceListItem);
		}
		listMappCenterWorkspaceResult.setMappCenterWorkspaceList(mappCenterWorkspaceList);
		listMappCenterWorkspacesResponse.setListMappCenterWorkspaceResult(listMappCenterWorkspaceResult);
	 
	 	return listMappCenterWorkspacesResponse;
	}
}