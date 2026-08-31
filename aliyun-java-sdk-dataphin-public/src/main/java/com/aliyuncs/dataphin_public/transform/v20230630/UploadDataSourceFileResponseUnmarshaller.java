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

import com.aliyuncs.dataphin_public.model.v20230630.UploadDataSourceFileResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadDataSourceFileResponseUnmarshaller {

	public static UploadDataSourceFileResponse unmarshall(UploadDataSourceFileResponse uploadDataSourceFileResponse, UnmarshallerContext _ctx) {
		
		uploadDataSourceFileResponse.setRequestId(_ctx.stringValue("UploadDataSourceFileResponse.RequestId"));
		uploadDataSourceFileResponse.setMessage(_ctx.stringValue("UploadDataSourceFileResponse.Message"));
		uploadDataSourceFileResponse.setHttpStatusCode(_ctx.integerValue("UploadDataSourceFileResponse.HttpStatusCode"));
		uploadDataSourceFileResponse.setFileId(_ctx.stringValue("UploadDataSourceFileResponse.FileId"));
		uploadDataSourceFileResponse.setCode(_ctx.stringValue("UploadDataSourceFileResponse.Code"));
		uploadDataSourceFileResponse.setSuccess(_ctx.booleanValue("UploadDataSourceFileResponse.Success"));
	 
	 	return uploadDataSourceFileResponse;
	}
}