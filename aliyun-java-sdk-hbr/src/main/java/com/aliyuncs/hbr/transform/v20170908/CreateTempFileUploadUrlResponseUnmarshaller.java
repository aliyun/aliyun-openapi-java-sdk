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

package com.aliyuncs.hbr.transform.v20170908;

import com.aliyuncs.hbr.model.v20170908.CreateTempFileUploadUrlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTempFileUploadUrlResponseUnmarshaller {

	public static CreateTempFileUploadUrlResponse unmarshall(CreateTempFileUploadUrlResponse createTempFileUploadUrlResponse, UnmarshallerContext _ctx) {
		
		createTempFileUploadUrlResponse.setRequestId(_ctx.stringValue("CreateTempFileUploadUrlResponse.RequestId"));
		createTempFileUploadUrlResponse.setEndpoint(_ctx.stringValue("CreateTempFileUploadUrlResponse.Endpoint"));
		createTempFileUploadUrlResponse.setExpireTime(_ctx.longValue("CreateTempFileUploadUrlResponse.ExpireTime"));
		createTempFileUploadUrlResponse.setSuccess(_ctx.booleanValue("CreateTempFileUploadUrlResponse.Success"));
		createTempFileUploadUrlResponse.setCode(_ctx.stringValue("CreateTempFileUploadUrlResponse.Code"));
		createTempFileUploadUrlResponse.setTempFileKey(_ctx.stringValue("CreateTempFileUploadUrlResponse.TempFileKey"));
		createTempFileUploadUrlResponse.setMessage(_ctx.stringValue("CreateTempFileUploadUrlResponse.Message"));
		createTempFileUploadUrlResponse.setBucketName(_ctx.stringValue("CreateTempFileUploadUrlResponse.BucketName"));
		createTempFileUploadUrlResponse.setOssAccessKeyId(_ctx.stringValue("CreateTempFileUploadUrlResponse.OssAccessKeyId"));
		createTempFileUploadUrlResponse.setPolicy(_ctx.stringValue("CreateTempFileUploadUrlResponse.Policy"));
		createTempFileUploadUrlResponse.setSignature(_ctx.stringValue("CreateTempFileUploadUrlResponse.Signature"));
	 
	 	return createTempFileUploadUrlResponse;
	}
}