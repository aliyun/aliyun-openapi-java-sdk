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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.UploadLinkeLinktAttachmentResponse;
import com.aliyuncs.sofa.model.v20190815.UploadLinkeLinktAttachmentResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadLinkeLinktAttachmentResponseUnmarshaller {

	public static UploadLinkeLinktAttachmentResponse unmarshall(UploadLinkeLinktAttachmentResponse uploadLinkeLinktAttachmentResponse, UnmarshallerContext _ctx) {
		
		uploadLinkeLinktAttachmentResponse.setRequestId(_ctx.stringValue("UploadLinkeLinktAttachmentResponse.RequestId"));
		uploadLinkeLinktAttachmentResponse.setResultCode(_ctx.stringValue("UploadLinkeLinktAttachmentResponse.ResultCode"));
		uploadLinkeLinktAttachmentResponse.setResultMessage(_ctx.stringValue("UploadLinkeLinktAttachmentResponse.ResultMessage"));
		uploadLinkeLinktAttachmentResponse.setErrorCode(_ctx.longValue("UploadLinkeLinktAttachmentResponse.ErrorCode"));
		uploadLinkeLinktAttachmentResponse.setErrorMessage(_ctx.stringValue("UploadLinkeLinktAttachmentResponse.ErrorMessage"));
		uploadLinkeLinktAttachmentResponse.setResponseStatusCode(_ctx.longValue("UploadLinkeLinktAttachmentResponse.ResponseStatusCode"));
		uploadLinkeLinktAttachmentResponse.setSuccess(_ctx.booleanValue("UploadLinkeLinktAttachmentResponse.Success"));

		Data data = new Data();
		data.setCreatedAt(_ctx.longValue("UploadLinkeLinktAttachmentResponse.Data.CreatedAt"));
		data.setDeleted(_ctx.booleanValue("UploadLinkeLinktAttachmentResponse.Data.Deleted"));
		data.setFilename(_ctx.stringValue("UploadLinkeLinktAttachmentResponse.Data.Filename"));
		data.setId(_ctx.longValue("UploadLinkeLinktAttachmentResponse.Data.Id"));
		data.setStoredFilename(_ctx.stringValue("UploadLinkeLinktAttachmentResponse.Data.StoredFilename"));
		data.setTarget(_ctx.stringValue("UploadLinkeLinktAttachmentResponse.Data.Target"));
		data.setTargetType(_ctx.stringValue("UploadLinkeLinktAttachmentResponse.Data.TargetType"));
		data.setUpdatedAt(_ctx.longValue("UploadLinkeLinktAttachmentResponse.Data.UpdatedAt"));
		data.setUrl(_ctx.stringValue("UploadLinkeLinktAttachmentResponse.Data.Url"));
		uploadLinkeLinktAttachmentResponse.setData(data);
	 
	 	return uploadLinkeLinktAttachmentResponse;
	}
}