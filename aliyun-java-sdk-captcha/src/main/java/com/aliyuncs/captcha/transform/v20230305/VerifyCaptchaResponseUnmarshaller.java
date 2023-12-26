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

package com.aliyuncs.captcha.transform.v20230305;

import com.aliyuncs.captcha.model.v20230305.VerifyCaptchaResponse;
import com.aliyuncs.captcha.model.v20230305.VerifyCaptchaResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class VerifyCaptchaResponseUnmarshaller {

	public static VerifyCaptchaResponse unmarshall(VerifyCaptchaResponse verifyCaptchaResponse, UnmarshallerContext _ctx) {
		
		verifyCaptchaResponse.setRequestId(_ctx.stringValue("VerifyCaptchaResponse.RequestId"));
		verifyCaptchaResponse.setSuccess(_ctx.booleanValue("VerifyCaptchaResponse.Success"));
		verifyCaptchaResponse.setCode(_ctx.stringValue("VerifyCaptchaResponse.Code"));
		verifyCaptchaResponse.setMessage(_ctx.stringValue("VerifyCaptchaResponse.Message"));

		Result result = new Result();
		result.setVerifyResult(_ctx.booleanValue("VerifyCaptchaResponse.Result.VerifyResult"));
		verifyCaptchaResponse.setResult(result);
	 
	 	return verifyCaptchaResponse;
	}
}