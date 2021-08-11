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

package com.aliyuncs.retailadvqa_public.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailadvqa_public.model.v20200515.GetTokenPayLoadByCheckResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.GetTokenPayLoadByCheckResponse.Data;
import com.aliyuncs.retailadvqa_public.model.v20200515.GetTokenPayLoadByCheckResponse.Data.WorkspacesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTokenPayLoadByCheckResponseUnmarshaller {

	public static GetTokenPayLoadByCheckResponse unmarshall(GetTokenPayLoadByCheckResponse getTokenPayLoadByCheckResponse, UnmarshallerContext _ctx) {
		
		getTokenPayLoadByCheckResponse.setRequestId(_ctx.stringValue("GetTokenPayLoadByCheckResponse.RequestId"));
		getTokenPayLoadByCheckResponse.setErrorCode(_ctx.stringValue("GetTokenPayLoadByCheckResponse.ErrorCode"));
		getTokenPayLoadByCheckResponse.setErrorDesc(_ctx.stringValue("GetTokenPayLoadByCheckResponse.ErrorDesc"));
		getTokenPayLoadByCheckResponse.setSuccess(_ctx.booleanValue("GetTokenPayLoadByCheckResponse.Success"));
		getTokenPayLoadByCheckResponse.setTraceId(_ctx.stringValue("GetTokenPayLoadByCheckResponse.TraceId"));

		Data data = new Data();
		data.setAud(_ctx.stringValue("GetTokenPayLoadByCheckResponse.Data.Aud"));
		data.setRole(_ctx.stringValue("GetTokenPayLoadByCheckResponse.Data.Role"));
		data.setRoleSign(_ctx.stringValue("GetTokenPayLoadByCheckResponse.Data.RoleSign"));
		data.setDbRegion(_ctx.stringValue("GetTokenPayLoadByCheckResponse.Data.DbRegion"));
		data.setTenantRegion(_ctx.stringValue("GetTokenPayLoadByCheckResponse.Data.TenantRegion"));
		data.setPurchasePackage(_ctx.stringValue("GetTokenPayLoadByCheckResponse.Data.PurchasePackage"));
		data.setPurchasePackageQuota(_ctx.stringValue("GetTokenPayLoadByCheckResponse.Data.PurchasePackageQuota"));
		data.setMainAccount(_ctx.stringValue("GetTokenPayLoadByCheckResponse.Data.MainAccount"));
		data.setMainAccountUid(_ctx.stringValue("GetTokenPayLoadByCheckResponse.Data.MainAccountUid"));
		data.setUserId(_ctx.stringValue("GetTokenPayLoadByCheckResponse.Data.UserId"));
		data.setNickName(_ctx.stringValue("GetTokenPayLoadByCheckResponse.Data.NickName"));
		data.setWorkspaceId(_ctx.stringValue("GetTokenPayLoadByCheckResponse.Data.WorkspaceId"));
		data.setLanguage(_ctx.stringValue("GetTokenPayLoadByCheckResponse.Data.Language"));

		List<WorkspacesItem> workspaces = new ArrayList<WorkspacesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTokenPayLoadByCheckResponse.Data.Workspaces.Length"); i++) {
			WorkspacesItem workspacesItem = new WorkspacesItem();
			workspacesItem.setRoleId(_ctx.stringValue("GetTokenPayLoadByCheckResponse.Data.Workspaces["+ i +"].RoleId"));
			workspacesItem.setName(_ctx.stringValue("GetTokenPayLoadByCheckResponse.Data.Workspaces["+ i +"].Name"));
			workspacesItem.setId(_ctx.stringValue("GetTokenPayLoadByCheckResponse.Data.Workspaces["+ i +"].Id"));

			workspaces.add(workspacesItem);
		}
		data.setWorkspaces(workspaces);
		getTokenPayLoadByCheckResponse.setData(data);
	 
	 	return getTokenPayLoadByCheckResponse;
	}
}