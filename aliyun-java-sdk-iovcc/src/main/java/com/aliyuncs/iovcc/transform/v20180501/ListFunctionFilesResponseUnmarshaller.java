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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.ListFunctionFilesResponse;
import com.aliyuncs.iovcc.model.v20180501.ListFunctionFilesResponse.FileList;
import com.aliyuncs.iovcc.model.v20180501.ListFunctionFilesResponse.FileList.File;
import com.aliyuncs.iovcc.model.v20180501.ListFunctionFilesResponse.FileList.Pagination;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFunctionFilesResponseUnmarshaller {

	public static ListFunctionFilesResponse unmarshall(ListFunctionFilesResponse listFunctionFilesResponse, UnmarshallerContext _ctx) {
		
		listFunctionFilesResponse.setRequestId(_ctx.stringValue("ListFunctionFilesResponse.RequestId"));

		FileList fileList = new FileList();

		Pagination pagination = new Pagination();
		pagination.setPageIndex(_ctx.integerValue("ListFunctionFilesResponse.FileList.Pagination.PageIndex"));
		pagination.setPageSize(_ctx.integerValue("ListFunctionFilesResponse.FileList.Pagination.PageSize"));
		pagination.setTotalCount(_ctx.integerValue("ListFunctionFilesResponse.FileList.Pagination.TotalCount"));
		pagination.setTotalPageCount(_ctx.integerValue("ListFunctionFilesResponse.FileList.Pagination.TotalPageCount"));
		fileList.setPagination(pagination);

		List<File> files = new ArrayList<File>();
		for (int i = 0; i < _ctx.lengthValue("ListFunctionFilesResponse.FileList.Files.Length"); i++) {
			File file = new File();
			file.setId(_ctx.longValue("ListFunctionFilesResponse.FileList.Files["+ i +"].Id"));
			file.setName(_ctx.stringValue("ListFunctionFilesResponse.FileList.Files["+ i +"].Name"));
			file.setContentId(_ctx.longValue("ListFunctionFilesResponse.FileList.Files["+ i +"].ContentId"));
			file.setStatus(_ctx.integerValue("ListFunctionFilesResponse.FileList.Files["+ i +"].Status"));
			file.setGmtCreate(_ctx.longValue("ListFunctionFilesResponse.FileList.Files["+ i +"].GmtCreate"));
			file.setGmtModified(_ctx.longValue("ListFunctionFilesResponse.FileList.Files["+ i +"].GmtModified"));
			file.setDescription(_ctx.stringValue("ListFunctionFilesResponse.FileList.Files["+ i +"].Description"));
			file.setSandboxDeployTime(_ctx.longValue("ListFunctionFilesResponse.FileList.Files["+ i +"].SandboxDeployTime"));
			file.setProductionDeployTime(_ctx.longValue("ListFunctionFilesResponse.FileList.Files["+ i +"].ProductionDeployTime"));
			file.setSandboxDeployStatus(_ctx.integerValue("ListFunctionFilesResponse.FileList.Files["+ i +"].SandboxDeployStatus"));
			file.setProductionDeployStatus(_ctx.integerValue("ListFunctionFilesResponse.FileList.Files["+ i +"].ProductionDeployStatus"));

			files.add(file);
		}
		fileList.setFiles(files);
		listFunctionFilesResponse.setFileList(fileList);
	 
	 	return listFunctionFilesResponse;
	}
}