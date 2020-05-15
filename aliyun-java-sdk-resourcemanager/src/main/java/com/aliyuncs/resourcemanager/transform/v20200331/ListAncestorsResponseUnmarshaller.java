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

import com.aliyuncs.resourcemanager.model.v20200331.ListAncestorsResponse;
import com.aliyuncs.resourcemanager.model.v20200331.ListAncestorsResponse.Folder;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAncestorsResponseUnmarshaller {

	public static ListAncestorsResponse unmarshall(ListAncestorsResponse listAncestorsResponse, UnmarshallerContext _ctx) {
		
		listAncestorsResponse.setRequestId(_ctx.stringValue("ListAncestorsResponse.RequestId"));

		List<Folder> folders = new ArrayList<Folder>();
		for (int i = 0; i < _ctx.lengthValue("ListAncestorsResponse.Folders.Length"); i++) {
			Folder folder = new Folder();
			folder.setFolderId(_ctx.stringValue("ListAncestorsResponse.Folders["+ i +"].FolderId"));
			folder.setFolderName(_ctx.stringValue("ListAncestorsResponse.Folders["+ i +"].FolderName"));
			folder.setCreateTime(_ctx.stringValue("ListAncestorsResponse.Folders["+ i +"].CreateTime"));

			folders.add(folder);
		}
		listAncestorsResponse.setFolders(folders);
	 
	 	return listAncestorsResponse;
	}
}