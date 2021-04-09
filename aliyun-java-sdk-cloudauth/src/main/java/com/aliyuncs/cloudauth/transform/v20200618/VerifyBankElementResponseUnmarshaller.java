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

package com.aliyuncs.cloudauth.transform.v20200618;

import com.aliyuncs.cloudauth.model.v20200618.VerifyBankElementResponse;
import com.aliyuncs.cloudauth.model.v20200618.VerifyBankElementResponse.ResultObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class VerifyBankElementResponseUnmarshaller {

	public static VerifyBankElementResponse unmarshall(VerifyBankElementResponse verifyBankElementResponse, UnmarshallerContext _ctx) {
		
		verifyBankElementResponse.setRequestId(_ctx.stringValue("VerifyBankElementResponse.RequestId"));
		verifyBankElementResponse.setMessage(_ctx.stringValue("VerifyBankElementResponse.Message"));
		verifyBankElementResponse.setCode(_ctx.stringValue("VerifyBankElementResponse.Code"));

		ResultObject resultObject = new ResultObject();
		resultObject.setPassed(_ctx.stringValue("VerifyBankElementResponse.ResultObject.Passed"));
		resultObject.setSubCode(_ctx.stringValue("VerifyBankElementResponse.ResultObject.SubCode"));
		resultObject.setMaterialInfo(_ctx.stringValue("VerifyBankElementResponse.ResultObject.MaterialInfo"));
		resultObject.setCertifyId(_ctx.stringValue("VerifyBankElementResponse.ResultObject.CertifyId"));
		verifyBankElementResponse.setResultObject(resultObject);
	 
	 	return verifyBankElementResponse;
	}
}