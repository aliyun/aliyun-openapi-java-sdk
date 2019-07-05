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

import com.aliyuncs.domain.model.v20180129.GetQualificationUploadPolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQualificationUploadPolicyResponseUnmarshaller {

	public static GetQualificationUploadPolicyResponse unmarshall(GetQualificationUploadPolicyResponse getQualificationUploadPolicyResponse, UnmarshallerContext _ctx) {
		
		getQualificationUploadPolicyResponse.setRequestId(_ctx.stringValue("GetQualificationUploadPolicyResponse.RequestId"));
		getQualificationUploadPolicyResponse.setAccessid(_ctx.stringValue("GetQualificationUploadPolicyResponse.Accessid"));
		getQualificationUploadPolicyResponse.setPolicy(_ctx.stringValue("GetQualificationUploadPolicyResponse.Policy"));
		getQualificationUploadPolicyResponse.setSignature(_ctx.stringValue("GetQualificationUploadPolicyResponse.Signature"));
		getQualificationUploadPolicyResponse.setDir(_ctx.stringValue("GetQualificationUploadPolicyResponse.Dir"));
		getQualificationUploadPolicyResponse.setPrefix(_ctx.stringValue("GetQualificationUploadPolicyResponse.Prefix"));
		getQualificationUploadPolicyResponse.setHost(_ctx.stringValue("GetQualificationUploadPolicyResponse.Host"));
		getQualificationUploadPolicyResponse.setExpire(_ctx.stringValue("GetQualificationUploadPolicyResponse.Expire"));
	 
	 	return getQualificationUploadPolicyResponse;
	}
}