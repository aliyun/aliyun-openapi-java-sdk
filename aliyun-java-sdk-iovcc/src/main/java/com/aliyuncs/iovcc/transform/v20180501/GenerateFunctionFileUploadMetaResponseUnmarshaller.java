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

import com.aliyuncs.iovcc.model.v20180501.GenerateFunctionFileUploadMetaResponse;
import com.aliyuncs.iovcc.model.v20180501.GenerateFunctionFileUploadMetaResponse.UploadMeta;
import com.aliyuncs.iovcc.model.v20180501.GenerateFunctionFileUploadMetaResponse.UploadMeta.PostObjectPolicy;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateFunctionFileUploadMetaResponseUnmarshaller {

	public static GenerateFunctionFileUploadMetaResponse unmarshall(GenerateFunctionFileUploadMetaResponse generateFunctionFileUploadMetaResponse, UnmarshallerContext _ctx) {
		
		generateFunctionFileUploadMetaResponse.setRequestId(_ctx.stringValue("GenerateFunctionFileUploadMetaResponse.RequestId"));

		UploadMeta uploadMeta = new UploadMeta();
		uploadMeta.setSecurityToken(_ctx.stringValue("GenerateFunctionFileUploadMetaResponse.UploadMeta.SecurityToken"));
		uploadMeta.setObjectKey(_ctx.stringValue("GenerateFunctionFileUploadMetaResponse.UploadMeta.ObjectKey"));

		PostObjectPolicy postObjectPolicy = new PostObjectPolicy();
		postObjectPolicy.setAccessId(_ctx.stringValue("GenerateFunctionFileUploadMetaResponse.UploadMeta.PostObjectPolicy.AccessId"));
		postObjectPolicy.setExpire(_ctx.stringValue("GenerateFunctionFileUploadMetaResponse.UploadMeta.PostObjectPolicy.Expire"));
		postObjectPolicy.setPolicy(_ctx.stringValue("GenerateFunctionFileUploadMetaResponse.UploadMeta.PostObjectPolicy.Policy"));
		postObjectPolicy.setSignature(_ctx.stringValue("GenerateFunctionFileUploadMetaResponse.UploadMeta.PostObjectPolicy.Signature"));
		postObjectPolicy.setHost(_ctx.stringValue("GenerateFunctionFileUploadMetaResponse.UploadMeta.PostObjectPolicy.Host"));
		uploadMeta.setPostObjectPolicy(postObjectPolicy);
		generateFunctionFileUploadMetaResponse.setUploadMeta(uploadMeta);
	 
	 	return generateFunctionFileUploadMetaResponse;
	}
}