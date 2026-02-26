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

package com.aliyuncs.devops.transform.v20210625;

import com.aliyuncs.devops.model.v20210625.GetWorkitemAttachmentCreatemetaResponse;
import com.aliyuncs.devops.model.v20210625.GetWorkitemAttachmentCreatemetaResponse.UploadInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWorkitemAttachmentCreatemetaResponseUnmarshaller {

	public static GetWorkitemAttachmentCreatemetaResponse unmarshall(GetWorkitemAttachmentCreatemetaResponse getWorkitemAttachmentCreatemetaResponse, UnmarshallerContext _ctx) {
		
		getWorkitemAttachmentCreatemetaResponse.setRequestId(_ctx.stringValue("GetWorkitemAttachmentCreatemetaResponse.requestId"));
		getWorkitemAttachmentCreatemetaResponse.setErrorCode(_ctx.stringValue("GetWorkitemAttachmentCreatemetaResponse.errorCode"));
		getWorkitemAttachmentCreatemetaResponse.setErrorMessage(_ctx.stringValue("GetWorkitemAttachmentCreatemetaResponse.errorMessage"));
		getWorkitemAttachmentCreatemetaResponse.setSuccess(_ctx.stringValue("GetWorkitemAttachmentCreatemetaResponse.success"));

		UploadInfo uploadInfo = new UploadInfo();
		uploadInfo.setAccessid(_ctx.stringValue("GetWorkitemAttachmentCreatemetaResponse.uploadInfo.accessid"));
		uploadInfo.setPolicy(_ctx.stringValue("GetWorkitemAttachmentCreatemetaResponse.uploadInfo.policy"));
		uploadInfo.setSignature(_ctx.stringValue("GetWorkitemAttachmentCreatemetaResponse.uploadInfo.signature"));
		uploadInfo.setDir(_ctx.stringValue("GetWorkitemAttachmentCreatemetaResponse.uploadInfo.dir"));
		uploadInfo.setHost(_ctx.stringValue("GetWorkitemAttachmentCreatemetaResponse.uploadInfo.host"));
		getWorkitemAttachmentCreatemetaResponse.setUploadInfo(uploadInfo);
	 
	 	return getWorkitemAttachmentCreatemetaResponse;
	}
}