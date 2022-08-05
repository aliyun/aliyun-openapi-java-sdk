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

package com.aliyuncs.viapi_regen.transform.v20211119;

import com.aliyuncs.viapi_regen.model.v20211119.GetUploadPolicyResponse;
import com.aliyuncs.viapi_regen.model.v20211119.GetUploadPolicyResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUploadPolicyResponseUnmarshaller {

	public static GetUploadPolicyResponse unmarshall(GetUploadPolicyResponse getUploadPolicyResponse, UnmarshallerContext _ctx) {
		
		getUploadPolicyResponse.setRequestId(_ctx.stringValue("GetUploadPolicyResponse.RequestId"));
		getUploadPolicyResponse.setMessage(_ctx.stringValue("GetUploadPolicyResponse.Message"));
		getUploadPolicyResponse.setCode(_ctx.stringValue("GetUploadPolicyResponse.Code"));

		Data data = new Data();
		data.setAccessId(_ctx.stringValue("GetUploadPolicyResponse.Data.AccessId"));
		data.setPolicy(_ctx.stringValue("GetUploadPolicyResponse.Data.Policy"));
		data.setSignature(_ctx.stringValue("GetUploadPolicyResponse.Data.Signature"));
		data.setObjectKey(_ctx.stringValue("GetUploadPolicyResponse.Data.ObjectKey"));
		data.setFileName(_ctx.stringValue("GetUploadPolicyResponse.Data.FileName"));
		data.setBucketName(_ctx.stringValue("GetUploadPolicyResponse.Data.BucketName"));
		data.setEndpoint(_ctx.stringValue("GetUploadPolicyResponse.Data.Endpoint"));
		data.setOriginalFilename(_ctx.stringValue("GetUploadPolicyResponse.Data.OriginalFilename"));
		data.setSignedHttpUrl(_ctx.stringValue("GetUploadPolicyResponse.Data.SignedHttpUrl"));
		getUploadPolicyResponse.setData(data);
	 
	 	return getUploadPolicyResponse;
	}
}