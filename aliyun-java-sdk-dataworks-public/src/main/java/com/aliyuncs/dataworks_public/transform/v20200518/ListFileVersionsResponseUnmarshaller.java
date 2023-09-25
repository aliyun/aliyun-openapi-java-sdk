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

import com.aliyuncs.dataworks_public.model.v20200518.ListFileVersionsResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListFileVersionsResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListFileVersionsResponse.Data.FileVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFileVersionsResponseUnmarshaller {

	public static ListFileVersionsResponse unmarshall(ListFileVersionsResponse listFileVersionsResponse, UnmarshallerContext _ctx) {
		
		listFileVersionsResponse.setRequestId(_ctx.stringValue("ListFileVersionsResponse.RequestId"));
		listFileVersionsResponse.setHttpStatusCode(_ctx.integerValue("ListFileVersionsResponse.HttpStatusCode"));
		listFileVersionsResponse.setErrorMessage(_ctx.stringValue("ListFileVersionsResponse.ErrorMessage"));
		listFileVersionsResponse.setErrorCode(_ctx.stringValue("ListFileVersionsResponse.ErrorCode"));
		listFileVersionsResponse.setSuccess(_ctx.booleanValue("ListFileVersionsResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListFileVersionsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListFileVersionsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListFileVersionsResponse.Data.TotalCount"));

		List<FileVersion> fileVersions = new ArrayList<FileVersion>();
		for (int i = 0; i < _ctx.lengthValue("ListFileVersionsResponse.Data.FileVersions.Length"); i++) {
			FileVersion fileVersion = new FileVersion();
			fileVersion.setFileContent(_ctx.stringValue("ListFileVersionsResponse.Data.FileVersions["+ i +"].FileContent"));
			fileVersion.setStatus(_ctx.stringValue("ListFileVersionsResponse.Data.FileVersions["+ i +"].Status"));
			fileVersion.setIsCurrentProd(_ctx.booleanValue("ListFileVersionsResponse.Data.FileVersions["+ i +"].IsCurrentProd"));
			fileVersion.setCommitUser(_ctx.stringValue("ListFileVersionsResponse.Data.FileVersions["+ i +"].CommitUser"));
			fileVersion.setNodeContent(_ctx.stringValue("ListFileVersionsResponse.Data.FileVersions["+ i +"].NodeContent"));
			fileVersion.setComment(_ctx.stringValue("ListFileVersionsResponse.Data.FileVersions["+ i +"].Comment"));
			fileVersion.setFilePropertyContent(_ctx.stringValue("ListFileVersionsResponse.Data.FileVersions["+ i +"].FilePropertyContent"));
			fileVersion.setFileName(_ctx.stringValue("ListFileVersionsResponse.Data.FileVersions["+ i +"].FileName"));
			fileVersion.setUseType(_ctx.stringValue("ListFileVersionsResponse.Data.FileVersions["+ i +"].UseType"));
			fileVersion.setChangeType(_ctx.stringValue("ListFileVersionsResponse.Data.FileVersions["+ i +"].ChangeType"));
			fileVersion.setFileVersion(_ctx.integerValue("ListFileVersionsResponse.Data.FileVersions["+ i +"].FileVersion"));
			fileVersion.setCommitTime(_ctx.longValue("ListFileVersionsResponse.Data.FileVersions["+ i +"].CommitTime"));
			fileVersion.setNodeId(_ctx.longValue("ListFileVersionsResponse.Data.FileVersions["+ i +"].NodeId"));

			fileVersions.add(fileVersion);
		}
		data.setFileVersions(fileVersions);
		listFileVersionsResponse.setData(data);
	 
	 	return listFileVersionsResponse;
	}
}