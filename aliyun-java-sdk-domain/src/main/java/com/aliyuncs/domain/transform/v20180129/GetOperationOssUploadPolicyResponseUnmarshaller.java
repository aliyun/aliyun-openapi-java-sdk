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

package com.aliyuncs.domain.transform.v20180129;

import com.aliyuncs.domain.model.v20180129.GetOperationOssUploadPolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOperationOssUploadPolicyResponseUnmarshaller {

	public static GetOperationOssUploadPolicyResponse unmarshall(GetOperationOssUploadPolicyResponse getOperationOssUploadPolicyResponse, UnmarshallerContext _ctx) {
		
		getOperationOssUploadPolicyResponse.setRequestId(_ctx.stringValue("GetOperationOssUploadPolicyResponse.RequestId"));
		getOperationOssUploadPolicyResponse.setFileDir(_ctx.stringValue("GetOperationOssUploadPolicyResponse.FileDir"));
		getOperationOssUploadPolicyResponse.setEncodedPolicy(_ctx.stringValue("GetOperationOssUploadPolicyResponse.EncodedPolicy"));
		getOperationOssUploadPolicyResponse.setAccessid(_ctx.stringValue("GetOperationOssUploadPolicyResponse.Accessid"));
		getOperationOssUploadPolicyResponse.setSignature(_ctx.stringValue("GetOperationOssUploadPolicyResponse.Signature"));
		getOperationOssUploadPolicyResponse.setHost(_ctx.stringValue("GetOperationOssUploadPolicyResponse.Host"));
		getOperationOssUploadPolicyResponse.setExpireTime(_ctx.stringValue("GetOperationOssUploadPolicyResponse.ExpireTime"));
	 
	 	return getOperationOssUploadPolicyResponse;
	}
}