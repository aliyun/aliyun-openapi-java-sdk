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

import com.aliyuncs.dataworks_public.model.v20200518.GetFileVersionResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetFileVersionResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFileVersionResponseUnmarshaller {

	public static GetFileVersionResponse unmarshall(GetFileVersionResponse getFileVersionResponse, UnmarshallerContext _ctx) {
		
		getFileVersionResponse.setRequestId(_ctx.stringValue("GetFileVersionResponse.RequestId"));
		getFileVersionResponse.setSuccess(_ctx.booleanValue("GetFileVersionResponse.Success"));
		getFileVersionResponse.setErrorCode(_ctx.stringValue("GetFileVersionResponse.ErrorCode"));
		getFileVersionResponse.setErrorMessage(_ctx.stringValue("GetFileVersionResponse.ErrorMessage"));
		getFileVersionResponse.setHttpStatusCode(_ctx.integerValue("GetFileVersionResponse.HttpStatusCode"));

		Data data = new Data();
		data.setFileVersion(_ctx.integerValue("GetFileVersionResponse.Data.FileVersion"));
		data.setFileContent(_ctx.stringValue("GetFileVersionResponse.Data.FileContent"));
		data.setFilePropertyContent(_ctx.stringValue("GetFileVersionResponse.Data.FilePropertyContent"));
		data.setNodeContent(_ctx.stringValue("GetFileVersionResponse.Data.NodeContent"));
		data.setComment(_ctx.stringValue("GetFileVersionResponse.Data.Comment"));
		data.setNodeId(_ctx.longValue("GetFileVersionResponse.Data.NodeId"));
		data.setIsCurrentProd(_ctx.booleanValue("GetFileVersionResponse.Data.IsCurrentProd"));
		data.setChangeType(_ctx.stringValue("GetFileVersionResponse.Data.ChangeType"));
		data.setStatus(_ctx.stringValue("GetFileVersionResponse.Data.Status"));
		data.setFileName(_ctx.stringValue("GetFileVersionResponse.Data.FileName"));
		data.setCommitUser(_ctx.stringValue("GetFileVersionResponse.Data.CommitUser"));
		data.setCommitTime(_ctx.longValue("GetFileVersionResponse.Data.CommitTime"));
		data.setUseType(_ctx.stringValue("GetFileVersionResponse.Data.UseType"));
		getFileVersionResponse.setData(data);
	 
	 	return getFileVersionResponse;
	}
}