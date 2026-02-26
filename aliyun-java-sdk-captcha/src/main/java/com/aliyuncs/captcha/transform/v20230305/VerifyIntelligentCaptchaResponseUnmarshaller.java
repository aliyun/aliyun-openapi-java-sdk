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

import com.aliyuncs.captcha.model.v20230305.VerifyIntelligentCaptchaResponse;
import com.aliyuncs.captcha.model.v20230305.VerifyIntelligentCaptchaResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class VerifyIntelligentCaptchaResponseUnmarshaller {

	public static VerifyIntelligentCaptchaResponse unmarshall(VerifyIntelligentCaptchaResponse verifyIntelligentCaptchaResponse, UnmarshallerContext _ctx) {
		
		verifyIntelligentCaptchaResponse.setRequestId(_ctx.stringValue("VerifyIntelligentCaptchaResponse.RequestId"));
		verifyIntelligentCaptchaResponse.setSuccess(_ctx.booleanValue("VerifyIntelligentCaptchaResponse.Success"));
		verifyIntelligentCaptchaResponse.setCode(_ctx.stringValue("VerifyIntelligentCaptchaResponse.Code"));
		verifyIntelligentCaptchaResponse.setMessage(_ctx.stringValue("VerifyIntelligentCaptchaResponse.Message"));

		Result result = new Result();
		result.setVerifyResult(_ctx.booleanValue("VerifyIntelligentCaptchaResponse.Result.VerifyResult"));
		result.setVerifyCode(_ctx.stringValue("VerifyIntelligentCaptchaResponse.Result.VerifyCode"));
		verifyIntelligentCaptchaResponse.setResult(result);
	 
	 	return verifyIntelligentCaptchaResponse;
	}
}