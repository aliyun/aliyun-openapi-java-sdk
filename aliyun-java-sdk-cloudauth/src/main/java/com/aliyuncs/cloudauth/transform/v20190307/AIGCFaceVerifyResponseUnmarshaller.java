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

import com.aliyuncs.cloudauth.model.v20190307.AIGCFaceVerifyResponse;
import com.aliyuncs.cloudauth.model.v20190307.AIGCFaceVerifyResponse.ResultObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class AIGCFaceVerifyResponseUnmarshaller {

	public static AIGCFaceVerifyResponse unmarshall(AIGCFaceVerifyResponse aIGCFaceVerifyResponse, UnmarshallerContext _ctx) {
		
		aIGCFaceVerifyResponse.setRequestId(_ctx.stringValue("AIGCFaceVerifyResponse.RequestId"));
		aIGCFaceVerifyResponse.setMessage(_ctx.stringValue("AIGCFaceVerifyResponse.Message"));
		aIGCFaceVerifyResponse.setCode(_ctx.stringValue("AIGCFaceVerifyResponse.Code"));

		ResultObject resultObject = new ResultObject();
		resultObject.setResult(_ctx.stringValue("AIGCFaceVerifyResponse.ResultObject.Result"));
		resultObject.setScore(_ctx.stringValue("AIGCFaceVerifyResponse.ResultObject.Score"));
		resultObject.setCertifyId(_ctx.stringValue("AIGCFaceVerifyResponse.ResultObject.CertifyId"));
		aIGCFaceVerifyResponse.setResultObject(resultObject);
	 
	 	return aIGCFaceVerifyResponse;
	}
}