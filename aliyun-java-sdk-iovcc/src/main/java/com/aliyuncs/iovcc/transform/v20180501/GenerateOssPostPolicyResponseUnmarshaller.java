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

package com.aliyuncs.iovcc.transform.v20180501;

import com.aliyuncs.iovcc.model.v20180501.GenerateOssPostPolicyResponse;
import com.aliyuncs.iovcc.model.v20180501.GenerateOssPostPolicyResponse.OssPostPolicy;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateOssPostPolicyResponseUnmarshaller {

	public static GenerateOssPostPolicyResponse unmarshall(GenerateOssPostPolicyResponse generateOssPostPolicyResponse, UnmarshallerContext _ctx) {
		
		generateOssPostPolicyResponse.setRequestId(_ctx.stringValue("GenerateOssPostPolicyResponse.RequestId"));

		OssPostPolicy ossPostPolicy = new OssPostPolicy();
		ossPostPolicy.setAccessId(_ctx.stringValue("GenerateOssPostPolicyResponse.OssPostPolicy.AccessId"));
		ossPostPolicy.setPolicy(_ctx.stringValue("GenerateOssPostPolicyResponse.OssPostPolicy.Policy"));
		ossPostPolicy.setSignature(_ctx.stringValue("GenerateOssPostPolicyResponse.OssPostPolicy.Signature"));
		ossPostPolicy.setHost(_ctx.stringValue("GenerateOssPostPolicyResponse.OssPostPolicy.Host"));
		ossPostPolicy.setExpire(_ctx.stringValue("GenerateOssPostPolicyResponse.OssPostPolicy.Expire"));
		generateOssPostPolicyResponse.setOssPostPolicy(ossPostPolicy);
	 
	 	return generateOssPostPolicyResponse;
	}
}