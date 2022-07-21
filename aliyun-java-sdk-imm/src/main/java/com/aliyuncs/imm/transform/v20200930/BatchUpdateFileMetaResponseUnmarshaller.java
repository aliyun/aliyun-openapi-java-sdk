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

import com.aliyuncs.imm.model.v20200930.BatchUpdateFileMetaResponse;
import com.aliyuncs.imm.model.v20200930.BatchUpdateFileMetaResponse.FilesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchUpdateFileMetaResponseUnmarshaller {

	public static BatchUpdateFileMetaResponse unmarshall(BatchUpdateFileMetaResponse batchUpdateFileMetaResponse, UnmarshallerContext _ctx) {
		
		batchUpdateFileMetaResponse.setRequestId(_ctx.stringValue("BatchUpdateFileMetaResponse.RequestId"));

		List<FilesItem> files = new ArrayList<FilesItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchUpdateFileMetaResponse.Files.Length"); i++) {
			FilesItem filesItem = new FilesItem();
			filesItem.setURI(_ctx.stringValue("BatchUpdateFileMetaResponse.Files["+ i +"].URI"));
			filesItem.setSuccess(_ctx.booleanValue("BatchUpdateFileMetaResponse.Files["+ i +"].Success"));
			filesItem.setMessage(_ctx.stringValue("BatchUpdateFileMetaResponse.Files["+ i +"].Message"));

			files.add(filesItem);
		}
		batchUpdateFileMetaResponse.setFiles(files);
	 
	 	return batchUpdateFileMetaResponse;
	}
}