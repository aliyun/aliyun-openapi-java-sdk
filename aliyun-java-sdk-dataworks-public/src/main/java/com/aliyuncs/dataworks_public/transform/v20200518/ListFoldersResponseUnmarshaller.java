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

import com.aliyuncs.dataworks_public.model.v20200518.ListFoldersResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListFoldersResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListFoldersResponse.Data.FoldersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFoldersResponseUnmarshaller {

	public static ListFoldersResponse unmarshall(ListFoldersResponse listFoldersResponse, UnmarshallerContext _ctx) {
		
		listFoldersResponse.setRequestId(_ctx.stringValue("ListFoldersResponse.RequestId"));
		listFoldersResponse.setSuccess(_ctx.booleanValue("ListFoldersResponse.Success"));
		listFoldersResponse.setErrorCode(_ctx.stringValue("ListFoldersResponse.ErrorCode"));
		listFoldersResponse.setErrorMessage(_ctx.stringValue("ListFoldersResponse.ErrorMessage"));
		listFoldersResponse.setHttpStatusCode(_ctx.integerValue("ListFoldersResponse.HttpStatusCode"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListFoldersResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListFoldersResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListFoldersResponse.Data.TotalCount"));

		List<FoldersItem> folders = new ArrayList<FoldersItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFoldersResponse.Data.Folders.Length"); i++) {
			FoldersItem foldersItem = new FoldersItem();
			foldersItem.setFolderId(_ctx.stringValue("ListFoldersResponse.Data.Folders["+ i +"].FolderId"));
			foldersItem.setFolderPath(_ctx.stringValue("ListFoldersResponse.Data.Folders["+ i +"].FolderPath"));

			folders.add(foldersItem);
		}
		data.setFolders(folders);
		listFoldersResponse.setData(data);
	 
	 	return listFoldersResponse;
	}
}