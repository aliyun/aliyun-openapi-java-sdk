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

package com.aliyuncs.cloudauth.transform.v20190307;

import com.aliyuncs.cloudauth.model.v20190307.ContrastFaceVerifyResponse;
import com.aliyuncs.cloudauth.model.v20190307.ContrastFaceVerifyResponse.ResultObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class ContrastFaceVerifyResponseUnmarshaller {

	public static ContrastFaceVerifyResponse unmarshall(ContrastFaceVerifyResponse contrastFaceVerifyResponse, UnmarshallerContext _ctx) {
		
		contrastFaceVerifyResponse.setRequestId(_ctx.stringValue("ContrastFaceVerifyResponse.RequestId"));
		contrastFaceVerifyResponse.setMessage(_ctx.stringValue("ContrastFaceVerifyResponse.Message"));
		contrastFaceVerifyResponse.setCode(_ctx.stringValue("ContrastFaceVerifyResponse.Code"));

		ResultObject resultObject = new ResultObject();
		resultObject.setPassed(_ctx.stringValue("ContrastFaceVerifyResponse.ResultObject.Passed"));
		resultObject.setIdentityInfo(_ctx.stringValue("ContrastFaceVerifyResponse.ResultObject.IdentityInfo"));
		resultObject.setMaterialInfo(_ctx.stringValue("ContrastFaceVerifyResponse.ResultObject.MaterialInfo"));
		resultObject.setSubCode(_ctx.stringValue("ContrastFaceVerifyResponse.ResultObject.SubCode"));
		resultObject.setCertifyId(_ctx.stringValue("ContrastFaceVerifyResponse.ResultObject.CertifyId"));
		contrastFaceVerifyResponse.setResultObject(resultObject);
	 
	 	return contrastFaceVerifyResponse;
	}
}