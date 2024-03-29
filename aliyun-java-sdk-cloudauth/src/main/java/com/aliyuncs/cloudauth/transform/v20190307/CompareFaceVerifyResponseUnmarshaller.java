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

import com.aliyuncs.cloudauth.model.v20190307.CompareFaceVerifyResponse;
import com.aliyuncs.cloudauth.model.v20190307.CompareFaceVerifyResponse.ResultObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class CompareFaceVerifyResponseUnmarshaller {

	public static CompareFaceVerifyResponse unmarshall(CompareFaceVerifyResponse compareFaceVerifyResponse, UnmarshallerContext _ctx) {
		
		compareFaceVerifyResponse.setRequestId(_ctx.stringValue("CompareFaceVerifyResponse.RequestId"));
		compareFaceVerifyResponse.setCode(_ctx.stringValue("CompareFaceVerifyResponse.Code"));
		compareFaceVerifyResponse.setMessage(_ctx.stringValue("CompareFaceVerifyResponse.Message"));

		ResultObject resultObject = new ResultObject();
		resultObject.setCertifyId(_ctx.stringValue("CompareFaceVerifyResponse.ResultObject.CertifyId"));
		resultObject.setVerifyScore(_ctx.floatValue("CompareFaceVerifyResponse.ResultObject.VerifyScore"));
		resultObject.setPassed(_ctx.stringValue("CompareFaceVerifyResponse.ResultObject.Passed"));
		compareFaceVerifyResponse.setResultObject(resultObject);
	 
	 	return compareFaceVerifyResponse;
	}
}