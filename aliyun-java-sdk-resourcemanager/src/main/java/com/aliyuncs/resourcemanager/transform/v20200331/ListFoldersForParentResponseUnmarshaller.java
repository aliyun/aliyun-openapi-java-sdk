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

package com.aliyuncs.resourcemanager.transform.v20200331;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcemanager.model.v20200331.ListFoldersForParentResponse;
import com.aliyuncs.resourcemanager.model.v20200331.ListFoldersForParentResponse.Folder;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFoldersForParentResponseUnmarshaller {

	public static ListFoldersForParentResponse unmarshall(ListFoldersForParentResponse listFoldersForParentResponse, UnmarshallerContext _ctx) {
		
		listFoldersForParentResponse.setRequestId(_ctx.stringValue("ListFoldersForParentResponse.RequestId"));
		listFoldersForParentResponse.setPageNumber(_ctx.integerValue("ListFoldersForParentResponse.PageNumber"));
		listFoldersForParentResponse.setPageSize(_ctx.integerValue("ListFoldersForParentResponse.PageSize"));
		listFoldersForParentResponse.setTotalCount(_ctx.integerValue("ListFoldersForParentResponse.TotalCount"));

		List<Folder> folders = new ArrayList<Folder>();
		for (int i = 0; i < _ctx.lengthValue("ListFoldersForParentResponse.Folders.Length"); i++) {
			Folder folder = new Folder();
			folder.setFolderId(_ctx.stringValue("ListFoldersForParentResponse.Folders["+ i +"].FolderId"));
			folder.setFolderName(_ctx.stringValue("ListFoldersForParentResponse.Folders["+ i +"].FolderName"));
			folder.setCreateTime(_ctx.stringValue("ListFoldersForParentResponse.Folders["+ i +"].CreateTime"));

			folders.add(folder);
		}
		listFoldersForParentResponse.setFolders(folders);
	 
	 	return listFoldersForParentResponse;
	}
}