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

package com.aliyuncs.foas.transform.v20181111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.foas.model.v20181111.ListChildFolderResponse;
import com.aliyuncs.foas.model.v20181111.ListChildFolderResponse.Folder;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListChildFolderResponseUnmarshaller {

	public static ListChildFolderResponse unmarshall(ListChildFolderResponse listChildFolderResponse, UnmarshallerContext _ctx) {
		
		listChildFolderResponse.setRequestId(_ctx.stringValue("ListChildFolderResponse.RequestId"));

		List<Folder> folders = new ArrayList<Folder>();
		for (int i = 0; i < _ctx.lengthValue("ListChildFolderResponse.Folders.Length"); i++) {
			Folder folder = new Folder();
			folder.setFolderId(_ctx.longValue("ListChildFolderResponse.Folders["+ i +"].FolderId"));
			folder.setPath(_ctx.stringValue("ListChildFolderResponse.Folders["+ i +"].Path"));

			folders.add(folder);
		}
		listChildFolderResponse.setFolders(folders);
	 
	 	return listChildFolderResponse;
	}
}