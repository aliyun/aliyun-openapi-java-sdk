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

package com.aliyuncs.aiworkspace.transform.v20200814;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aiworkspace.model.v20200814.ListAdminWorkspacesResponse;
import com.aliyuncs.aiworkspace.model.v20200814.ListAdminWorkspacesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAdminWorkspacesResponseUnmarshaller {

	public static ListAdminWorkspacesResponse unmarshall(ListAdminWorkspacesResponse listAdminWorkspacesResponse, UnmarshallerContext _ctx) {
		
		listAdminWorkspacesResponse.setRequestId(_ctx.stringValue("ListAdminWorkspacesResponse.RequestId"));
		listAdminWorkspacesResponse.setCode(_ctx.stringValue("ListAdminWorkspacesResponse.Code"));
		listAdminWorkspacesResponse.setMessage(_ctx.stringValue("ListAdminWorkspacesResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAdminWorkspacesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCreateTime(_ctx.longValue("ListAdminWorkspacesResponse.Data["+ i +"].CreateTime"));
			dataItem.setCreator(_ctx.stringValue("ListAdminWorkspacesResponse.Data["+ i +"].Creator"));
			dataItem.setDescription(_ctx.stringValue("ListAdminWorkspacesResponse.Data["+ i +"].Description"));
			dataItem.setWorkspaceId(_ctx.stringValue("ListAdminWorkspacesResponse.Data["+ i +"].WorkspaceId"));
			dataItem.setWorkspaceName(_ctx.stringValue("ListAdminWorkspacesResponse.Data["+ i +"].WorkspaceName"));

			data.add(dataItem);
		}
		listAdminWorkspacesResponse.setData(data);
	 
	 	return listAdminWorkspacesResponse;
	}
}