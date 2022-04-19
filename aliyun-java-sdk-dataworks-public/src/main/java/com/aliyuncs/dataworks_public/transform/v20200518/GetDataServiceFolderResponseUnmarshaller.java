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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.GetDataServiceFolderResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetDataServiceFolderResponse.Folder;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataServiceFolderResponseUnmarshaller {

	public static GetDataServiceFolderResponse unmarshall(GetDataServiceFolderResponse getDataServiceFolderResponse, UnmarshallerContext _ctx) {
		
		getDataServiceFolderResponse.setRequestId(_ctx.stringValue("GetDataServiceFolderResponse.RequestId"));

		Folder folder = new Folder();
		folder.setTenantId(_ctx.longValue("GetDataServiceFolderResponse.Folder.TenantId"));
		folder.setProjectId(_ctx.longValue("GetDataServiceFolderResponse.Folder.ProjectId"));
		folder.setFolderId(_ctx.longValue("GetDataServiceFolderResponse.Folder.FolderId"));
		folder.setFolderName(_ctx.stringValue("GetDataServiceFolderResponse.Folder.FolderName"));
		folder.setCreatedTime(_ctx.stringValue("GetDataServiceFolderResponse.Folder.CreatedTime"));
		folder.setModifiedTime(_ctx.stringValue("GetDataServiceFolderResponse.Folder.ModifiedTime"));
		folder.setGroupId(_ctx.stringValue("GetDataServiceFolderResponse.Folder.GroupId"));
		folder.setParentId(_ctx.longValue("GetDataServiceFolderResponse.Folder.ParentId"));
		getDataServiceFolderResponse.setFolder(folder);
	 
	 	return getDataServiceFolderResponse;
	}
}