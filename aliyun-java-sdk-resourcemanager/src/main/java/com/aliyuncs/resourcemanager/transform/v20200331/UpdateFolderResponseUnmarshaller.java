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

import com.aliyuncs.resourcemanager.model.v20200331.UpdateFolderResponse;
import com.aliyuncs.resourcemanager.model.v20200331.UpdateFolderResponse.Folder;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateFolderResponseUnmarshaller {

	public static UpdateFolderResponse unmarshall(UpdateFolderResponse updateFolderResponse, UnmarshallerContext _ctx) {
		
		updateFolderResponse.setRequestId(_ctx.stringValue("UpdateFolderResponse.RequestId"));

		Folder folder = new Folder();
		folder.setFolderId(_ctx.stringValue("UpdateFolderResponse.Folder.FolderId"));
		folder.setParentFolderId(_ctx.stringValue("UpdateFolderResponse.Folder.ParentFolderId"));
		folder.setFolderName(_ctx.stringValue("UpdateFolderResponse.Folder.FolderName"));
		folder.setCreateTime(_ctx.stringValue("UpdateFolderResponse.Folder.CreateTime"));
		updateFolderResponse.setFolder(folder);
	 
	 	return updateFolderResponse;
	}
}