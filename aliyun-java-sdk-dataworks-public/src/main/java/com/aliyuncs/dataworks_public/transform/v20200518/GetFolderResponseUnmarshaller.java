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

import com.aliyuncs.dataworks_public.model.v20200518.GetFolderResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetFolderResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFolderResponseUnmarshaller {

	public static GetFolderResponse unmarshall(GetFolderResponse getFolderResponse, UnmarshallerContext _ctx) {
		
		getFolderResponse.setRequestId(_ctx.stringValue("GetFolderResponse.RequestId"));
		getFolderResponse.setSuccess(_ctx.booleanValue("GetFolderResponse.Success"));
		getFolderResponse.setErrorCode(_ctx.stringValue("GetFolderResponse.ErrorCode"));
		getFolderResponse.setErrorMessage(_ctx.stringValue("GetFolderResponse.ErrorMessage"));
		getFolderResponse.setHttpStatusCode(_ctx.integerValue("GetFolderResponse.HttpStatusCode"));

		Data data = new Data();
		data.setFolderId(_ctx.stringValue("GetFolderResponse.Data.FolderId"));
		data.setFolderPath(_ctx.stringValue("GetFolderResponse.Data.FolderPath"));
		getFolderResponse.setData(data);
	 
	 	return getFolderResponse;
	}
}