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

package com.aliyuncs.imm.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20200930.AddStoryFilesResponse;
import com.aliyuncs.imm.model.v20200930.AddStoryFilesResponse.FilesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddStoryFilesResponseUnmarshaller {

	public static AddStoryFilesResponse unmarshall(AddStoryFilesResponse addStoryFilesResponse, UnmarshallerContext _ctx) {
		
		addStoryFilesResponse.setRequestId(_ctx.stringValue("AddStoryFilesResponse.RequestId"));

		List<FilesItem> files = new ArrayList<FilesItem>();
		for (int i = 0; i < _ctx.lengthValue("AddStoryFilesResponse.Files.Length"); i++) {
			FilesItem filesItem = new FilesItem();
			filesItem.setURI(_ctx.stringValue("AddStoryFilesResponse.Files["+ i +"].URI"));
			filesItem.setErrorCode(_ctx.stringValue("AddStoryFilesResponse.Files["+ i +"].ErrorCode"));
			filesItem.setErrorMessage(_ctx.stringValue("AddStoryFilesResponse.Files["+ i +"].ErrorMessage"));

			files.add(filesItem);
		}
		addStoryFilesResponse.setFiles(files);
	 
	 	return addStoryFilesResponse;
	}
}