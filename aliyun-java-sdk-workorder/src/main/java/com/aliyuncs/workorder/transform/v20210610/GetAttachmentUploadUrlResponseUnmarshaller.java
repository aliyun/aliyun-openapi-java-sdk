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

package com.aliyuncs.workorder.transform.v20210610;

import com.aliyuncs.workorder.model.v20210610.GetAttachmentUploadUrlResponse;
import com.aliyuncs.workorder.model.v20210610.GetAttachmentUploadUrlResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAttachmentUploadUrlResponseUnmarshaller {

	public static GetAttachmentUploadUrlResponse unmarshall(GetAttachmentUploadUrlResponse getAttachmentUploadUrlResponse, UnmarshallerContext _ctx) {
		
		getAttachmentUploadUrlResponse.setRequestId(_ctx.stringValue("GetAttachmentUploadUrlResponse.RequestId"));
		getAttachmentUploadUrlResponse.setCode(_ctx.integerValue("GetAttachmentUploadUrlResponse.Code"));
		getAttachmentUploadUrlResponse.setMessage(_ctx.stringValue("GetAttachmentUploadUrlResponse.Message"));
		getAttachmentUploadUrlResponse.setSuccess(_ctx.booleanValue("GetAttachmentUploadUrlResponse.Success"));

		Data data = new Data();
		data.setObjectKey(_ctx.stringValue("GetAttachmentUploadUrlResponse.Data.ObjectKey"));
		data.setPutSignedUrl(_ctx.stringValue("GetAttachmentUploadUrlResponse.Data.PutSignedUrl"));
		data.setGetSignedUrl(_ctx.stringValue("GetAttachmentUploadUrlResponse.Data.GetSignedUrl"));
		getAttachmentUploadUrlResponse.setData(data);
	 
	 	return getAttachmentUploadUrlResponse;
	}
}