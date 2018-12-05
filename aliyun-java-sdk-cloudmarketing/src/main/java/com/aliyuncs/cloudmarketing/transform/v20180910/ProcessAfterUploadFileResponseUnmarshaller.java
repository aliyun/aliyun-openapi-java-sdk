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

package com.aliyuncs.cloudmarketing.transform.v20180910;

import com.aliyuncs.cloudmarketing.model.v20180910.ProcessAfterUploadFileResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ProcessAfterUploadFileResponseUnmarshaller {

	public static ProcessAfterUploadFileResponse unmarshall(ProcessAfterUploadFileResponse processAfterUploadFileResponse, UnmarshallerContext context) {
		
		processAfterUploadFileResponse.setRequestId(context.stringValue("ProcessAfterUploadFileResponse.RequestId"));
		processAfterUploadFileResponse.setSuccess(context.booleanValue("ProcessAfterUploadFileResponse.Success"));
		processAfterUploadFileResponse.setMessage(context.stringValue("ProcessAfterUploadFileResponse.Message"));
		processAfterUploadFileResponse.setErrorCode(context.stringValue("ProcessAfterUploadFileResponse.ErrorCode"));
		processAfterUploadFileResponse.setFileId(context.longValue("ProcessAfterUploadFileResponse.FileId"));
	 
	 	return processAfterUploadFileResponse;
	}
}