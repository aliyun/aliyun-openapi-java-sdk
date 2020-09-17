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

package com.aliyuncs.emap.transform.v20200608;

import com.aliyuncs.emap.model.v20200608.GetUploadUrlInfoResponse;
import com.aliyuncs.emap.model.v20200608.GetUploadUrlInfoResponse.UploadToken;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUploadUrlInfoResponseUnmarshaller {

	public static GetUploadUrlInfoResponse unmarshall(GetUploadUrlInfoResponse getUploadUrlInfoResponse, UnmarshallerContext _ctx) {
		
		getUploadUrlInfoResponse.setRequestId(_ctx.stringValue("GetUploadUrlInfoResponse.RequestId"));
		getUploadUrlInfoResponse.setMessage(_ctx.stringValue("GetUploadUrlInfoResponse.Message"));
		getUploadUrlInfoResponse.setErrorCode(_ctx.stringValue("GetUploadUrlInfoResponse.ErrorCode"));
		getUploadUrlInfoResponse.setErrorMessage(_ctx.stringValue("GetUploadUrlInfoResponse.ErrorMessage"));
		getUploadUrlInfoResponse.setDynamicMessage(_ctx.stringValue("GetUploadUrlInfoResponse.DynamicMessage"));
		getUploadUrlInfoResponse.setSuccess(_ctx.booleanValue("GetUploadUrlInfoResponse.Success"));
		getUploadUrlInfoResponse.setDynamicCode(_ctx.stringValue("GetUploadUrlInfoResponse.DynamicCode"));
		getUploadUrlInfoResponse.setCode(_ctx.stringValue("GetUploadUrlInfoResponse.Code"));

		UploadToken uploadToken = new UploadToken();
		uploadToken.setAccessId(_ctx.stringValue("GetUploadUrlInfoResponse.UploadToken.AccessId"));
		uploadToken.setExpire(_ctx.stringValue("GetUploadUrlInfoResponse.UploadToken.Expire"));
		uploadToken.setSignature(_ctx.stringValue("GetUploadUrlInfoResponse.UploadToken.Signature"));
		uploadToken.setHost(_ctx.stringValue("GetUploadUrlInfoResponse.UploadToken.Host"));
		uploadToken.setPolicy(_ctx.stringValue("GetUploadUrlInfoResponse.UploadToken.Policy"));
		uploadToken.setDir(_ctx.stringValue("GetUploadUrlInfoResponse.UploadToken.Dir"));
		getUploadUrlInfoResponse.setUploadToken(uploadToken);
	 
	 	return getUploadUrlInfoResponse;
	}
}