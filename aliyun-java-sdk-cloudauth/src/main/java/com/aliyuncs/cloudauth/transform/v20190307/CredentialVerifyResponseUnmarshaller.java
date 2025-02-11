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

import com.aliyuncs.cloudauth.model.v20190307.CredentialVerifyResponse;
import com.aliyuncs.cloudauth.model.v20190307.CredentialVerifyResponse.ResultObject;
import com.aliyuncs.cloudauth.model.v20190307.CredentialVerifyResponse.ResultObject.VlResult;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CredentialVerifyResponseUnmarshaller {

	public static CredentialVerifyResponse unmarshall(CredentialVerifyResponse credentialVerifyResponse, UnmarshallerContext _ctx) {
		
		credentialVerifyResponse.setRequestId(_ctx.stringValue("CredentialVerifyResponse.RequestId"));
		credentialVerifyResponse.setCode(_ctx.stringValue("CredentialVerifyResponse.Code"));
		credentialVerifyResponse.setMessage(_ctx.stringValue("CredentialVerifyResponse.Message"));

		ResultObject resultObject = new ResultObject();
		resultObject.setResult(_ctx.stringValue("CredentialVerifyResponse.ResultObject.Result"));
		resultObject.setRiskTag(_ctx.stringValue("CredentialVerifyResponse.ResultObject.RiskTag"));
		resultObject.setRiskScore(_ctx.mapValue("CredentialVerifyResponse.ResultObject.RiskScore"));
		resultObject.setOcrInfo(_ctx.stringValue("CredentialVerifyResponse.ResultObject.OcrInfo"));
		resultObject.setVerifyResult(_ctx.stringValue("CredentialVerifyResponse.ResultObject.VerifyResult"));
		resultObject.setVerifyDetail(_ctx.stringValue("CredentialVerifyResponse.ResultObject.VerifyDetail"));
		resultObject.setMaterialInfo(_ctx.stringValue("CredentialVerifyResponse.ResultObject.MaterialInfo"));

		VlResult vlResult = new VlResult();
		vlResult.setSuccess(_ctx.booleanValue("CredentialVerifyResponse.ResultObject.VlResult.Success"));
		vlResult.setVlContent(_ctx.stringValue("CredentialVerifyResponse.ResultObject.VlResult.VlContent"));
		resultObject.setVlResult(vlResult);
		credentialVerifyResponse.setResultObject(resultObject);
	 
	 	return credentialVerifyResponse;
	}
}