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

import com.aliyuncs.cloudmarketing.model.v20180910.RequestUploadFileResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RequestUploadFileResponseUnmarshaller {

	public static RequestUploadFileResponse unmarshall(RequestUploadFileResponse requestUploadFileResponse, UnmarshallerContext context) {
		
		requestUploadFileResponse.setRequestId(context.stringValue("RequestUploadFileResponse.RequestId"));
		requestUploadFileResponse.setSuccess(context.booleanValue("RequestUploadFileResponse.Success"));
		requestUploadFileResponse.setMessage(context.stringValue("RequestUploadFileResponse.Message"));
		requestUploadFileResponse.setErrorCode(context.stringValue("RequestUploadFileResponse.ErrorCode"));
		requestUploadFileResponse.setAccessId(context.stringValue("RequestUploadFileResponse.AccessId"));
		requestUploadFileResponse.setPolicy(context.stringValue("RequestUploadFileResponse.Policy"));
		requestUploadFileResponse.setSignature(context.stringValue("RequestUploadFileResponse.Signature"));
		requestUploadFileResponse.setDir(context.stringValue("RequestUploadFileResponse.Dir"));
		requestUploadFileResponse.setHost(context.stringValue("RequestUploadFileResponse.Host"));
		requestUploadFileResponse.setExpire(context.stringValue("RequestUploadFileResponse.Expire"));
	 
	 	return requestUploadFileResponse;
	}
}