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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListDataServiceFoldersResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListDataServiceFoldersResponse.FolderPagingResult;
import com.aliyuncs.dataworks_public.model.v20200518.ListDataServiceFoldersResponse.FolderPagingResult.Folder;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataServiceFoldersResponseUnmarshaller {

	public static ListDataServiceFoldersResponse unmarshall(ListDataServiceFoldersResponse listDataServiceFoldersResponse, UnmarshallerContext _ctx) {
		
		listDataServiceFoldersResponse.setRequestId(_ctx.stringValue("ListDataServiceFoldersResponse.RequestId"));

		FolderPagingResult folderPagingResult = new FolderPagingResult();
		folderPagingResult.setPageNumber(_ctx.integerValue("ListDataServiceFoldersResponse.FolderPagingResult.PageNumber"));
		folderPagingResult.setPageSize(_ctx.integerValue("ListDataServiceFoldersResponse.FolderPagingResult.PageSize"));
		folderPagingResult.setTotalCount(_ctx.integerValue("ListDataServiceFoldersResponse.FolderPagingResult.TotalCount"));

		List<Folder> folders = new ArrayList<Folder>();
		for (int i = 0; i < _ctx.lengthValue("ListDataServiceFoldersResponse.FolderPagingResult.Folders.Length"); i++) {
			Folder folder = new Folder();
			folder.setParentId(_ctx.longValue("ListDataServiceFoldersResponse.FolderPagingResult.Folders["+ i +"].ParentId"));
			folder.setModifiedTime(_ctx.stringValue("ListDataServiceFoldersResponse.FolderPagingResult.Folders["+ i +"].ModifiedTime"));
			folder.setGroupId(_ctx.stringValue("ListDataServiceFoldersResponse.FolderPagingResult.Folders["+ i +"].GroupId"));
			folder.setFolderId(_ctx.longValue("ListDataServiceFoldersResponse.FolderPagingResult.Folders["+ i +"].FolderId"));
			folder.setFolderName(_ctx.stringValue("ListDataServiceFoldersResponse.FolderPagingResult.Folders["+ i +"].FolderName"));
			folder.setProjectId(_ctx.longValue("ListDataServiceFoldersResponse.FolderPagingResult.Folders["+ i +"].ProjectId"));
			folder.setCreatedTime(_ctx.stringValue("ListDataServiceFoldersResponse.FolderPagingResult.Folders["+ i +"].CreatedTime"));
			folder.setTenantId(_ctx.longValue("ListDataServiceFoldersResponse.FolderPagingResult.Folders["+ i +"].TenantId"));

			folders.add(folder);
		}
		folderPagingResult.setFolders(folders);
		listDataServiceFoldersResponse.setFolderPagingResult(folderPagingResult);
	 
	 	return listDataServiceFoldersResponse;
	}
}