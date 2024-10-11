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

import com.aliyuncs.dataphin_public.model.v20230630.GetAdHocFileResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetAdHocFileResponse.FileInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAdHocFileResponseUnmarshaller {

	public static GetAdHocFileResponse unmarshall(GetAdHocFileResponse getAdHocFileResponse, UnmarshallerContext _ctx) {
		
		getAdHocFileResponse.setRequestId(_ctx.stringValue("GetAdHocFileResponse.RequestId"));
		getAdHocFileResponse.setSuccess(_ctx.booleanValue("GetAdHocFileResponse.Success"));
		getAdHocFileResponse.setHttpStatusCode(_ctx.integerValue("GetAdHocFileResponse.HttpStatusCode"));
		getAdHocFileResponse.setCode(_ctx.stringValue("GetAdHocFileResponse.Code"));
		getAdHocFileResponse.setMessage(_ctx.stringValue("GetAdHocFileResponse.Message"));

		FileInfo fileInfo = new FileInfo();
		fileInfo.setId(_ctx.longValue("GetAdHocFileResponse.FileInfo.Id"));
		fileInfo.setName(_ctx.stringValue("GetAdHocFileResponse.FileInfo.Name"));
		fileInfo.setProjectId(_ctx.longValue("GetAdHocFileResponse.FileInfo.ProjectId"));
		fileInfo.setDirectory(_ctx.stringValue("GetAdHocFileResponse.FileInfo.Directory"));
		fileInfo.setContent(_ctx.stringValue("GetAdHocFileResponse.FileInfo.Content"));
		fileInfo.setCreator(_ctx.stringValue("GetAdHocFileResponse.FileInfo.Creator"));
		fileInfo.setLastModifier(_ctx.stringValue("GetAdHocFileResponse.FileInfo.LastModifier"));
		getAdHocFileResponse.setFileInfo(fileInfo);
	 
	 	return getAdHocFileResponse;
	}
}