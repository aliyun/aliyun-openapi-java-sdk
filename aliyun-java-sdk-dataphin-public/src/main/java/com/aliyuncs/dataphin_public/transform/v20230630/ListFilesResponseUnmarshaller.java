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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.ListFilesResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListFilesResponse.File;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFilesResponseUnmarshaller {

	public static ListFilesResponse unmarshall(ListFilesResponse listFilesResponse, UnmarshallerContext _ctx) {
		
		listFilesResponse.setRequestId(_ctx.stringValue("ListFilesResponse.RequestId"));
		listFilesResponse.setSuccess(_ctx.booleanValue("ListFilesResponse.Success"));
		listFilesResponse.setHttpStatusCode(_ctx.integerValue("ListFilesResponse.HttpStatusCode"));
		listFilesResponse.setCode(_ctx.stringValue("ListFilesResponse.Code"));
		listFilesResponse.setMessage(_ctx.stringValue("ListFilesResponse.Message"));

		List<File> fileList = new ArrayList<File>();
		for (int i = 0; i < _ctx.lengthValue("ListFilesResponse.FileList.Length"); i++) {
			File file = new File();
			file.setId(_ctx.longValue("ListFilesResponse.FileList["+ i +"].Id"));
			file.setName(_ctx.stringValue("ListFilesResponse.FileList["+ i +"].Name"));
			file.setProjectId(_ctx.longValue("ListFilesResponse.FileList["+ i +"].ProjectId"));
			file.setCategory(_ctx.stringValue("ListFilesResponse.FileList["+ i +"].Category"));
			file.setFileType(_ctx.stringValue("ListFilesResponse.FileList["+ i +"].FileType"));
			file.setDirectory(_ctx.stringValue("ListFilesResponse.FileList["+ i +"].Directory"));
			file.setContent(_ctx.stringValue("ListFilesResponse.FileList["+ i +"].Content"));
			file.setGmtCreate(_ctx.longValue("ListFilesResponse.FileList["+ i +"].GmtCreate"));
			file.setGmtModified(_ctx.longValue("ListFilesResponse.FileList["+ i +"].GmtModified"));
			file.setCreator(_ctx.stringValue("ListFilesResponse.FileList["+ i +"].Creator"));
			file.setLastModifier(_ctx.stringValue("ListFilesResponse.FileList["+ i +"].LastModifier"));

			fileList.add(file);
		}
		listFilesResponse.setFileList(fileList);
	 
	 	return listFilesResponse;
	}
}