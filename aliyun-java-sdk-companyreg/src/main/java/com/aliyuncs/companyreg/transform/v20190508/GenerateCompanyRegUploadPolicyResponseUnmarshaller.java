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

package com.aliyuncs.companyreg.transform.v20190508;

import com.aliyuncs.companyreg.model.v20190508.GenerateCompanyRegUploadPolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateCompanyRegUploadPolicyResponseUnmarshaller {

	public static GenerateCompanyRegUploadPolicyResponse unmarshall(GenerateCompanyRegUploadPolicyResponse generateCompanyRegUploadPolicyResponse, UnmarshallerContext _ctx) {
		
		generateCompanyRegUploadPolicyResponse.setRequestId(_ctx.stringValue("GenerateCompanyRegUploadPolicyResponse.RequestId"));
		generateCompanyRegUploadPolicyResponse.setAccessId(_ctx.stringValue("GenerateCompanyRegUploadPolicyResponse.AccessId"));
		generateCompanyRegUploadPolicyResponse.setSignature(_ctx.stringValue("GenerateCompanyRegUploadPolicyResponse.Signature"));
		generateCompanyRegUploadPolicyResponse.setFileDir(_ctx.stringValue("GenerateCompanyRegUploadPolicyResponse.FileDir"));
		generateCompanyRegUploadPolicyResponse.setHost(_ctx.stringValue("GenerateCompanyRegUploadPolicyResponse.Host"));
		generateCompanyRegUploadPolicyResponse.setExpireTime(_ctx.longValue("GenerateCompanyRegUploadPolicyResponse.ExpireTime"));
		generateCompanyRegUploadPolicyResponse.setEncodedPolicy(_ctx.stringValue("GenerateCompanyRegUploadPolicyResponse.EncodedPolicy"));
		generateCompanyRegUploadPolicyResponse.setMin(_ctx.longValue("GenerateCompanyRegUploadPolicyResponse.Min"));
		generateCompanyRegUploadPolicyResponse.setMax(_ctx.longValue("GenerateCompanyRegUploadPolicyResponse.Max"));
		generateCompanyRegUploadPolicyResponse.setEncryption(_ctx.stringValue("GenerateCompanyRegUploadPolicyResponse.Encryption"));
	 
	 	return generateCompanyRegUploadPolicyResponse;
	}
}