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

import com.aliyuncs.cloudauth.model.v20200618.ContrastSmartVerifyResponse;
import com.aliyuncs.cloudauth.model.v20200618.ContrastSmartVerifyResponse.ResultObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class ContrastSmartVerifyResponseUnmarshaller {

	public static ContrastSmartVerifyResponse unmarshall(ContrastSmartVerifyResponse contrastSmartVerifyResponse, UnmarshallerContext _ctx) {
		
		contrastSmartVerifyResponse.setRequestId(_ctx.stringValue("ContrastSmartVerifyResponse.RequestId"));
		contrastSmartVerifyResponse.setMessage(_ctx.stringValue("ContrastSmartVerifyResponse.Message"));
		contrastSmartVerifyResponse.setCode(_ctx.stringValue("ContrastSmartVerifyResponse.Code"));

		ResultObject resultObject = new ResultObject();
		resultObject.setCertifyId(_ctx.stringValue("ContrastSmartVerifyResponse.ResultObject.CertifyId"));
		resultObject.setPassed(_ctx.stringValue("ContrastSmartVerifyResponse.ResultObject.Passed"));
		resultObject.setSubCode(_ctx.stringValue("ContrastSmartVerifyResponse.ResultObject.SubCode"));
		resultObject.setVerifyInfo(_ctx.stringValue("ContrastSmartVerifyResponse.ResultObject.VerifyInfo"));
		resultObject.setRiskInfo(_ctx.stringValue("ContrastSmartVerifyResponse.ResultObject.RiskInfo"));
		contrastSmartVerifyResponse.setResultObject(resultObject);
	 
	 	return contrastSmartVerifyResponse;
	}
}