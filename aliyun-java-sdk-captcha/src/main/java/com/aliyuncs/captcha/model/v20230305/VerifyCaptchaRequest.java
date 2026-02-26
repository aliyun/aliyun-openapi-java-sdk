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

package com.aliyuncs.captcha.model.v20230305;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class VerifyCaptchaRequest extends RpcAcsRequest<VerifyCaptchaResponse> {
	   

	private String captchaVerifyParam;
	public VerifyCaptchaRequest() {
		super("captcha", "2023-03-05", "VerifyCaptcha");
		setMethod(MethodType.POST);
	}

	public String getCaptchaVerifyParam() {
		return this.captchaVerifyParam;
	}

	public void setCaptchaVerifyParam(String captchaVerifyParam) {
		this.captchaVerifyParam = captchaVerifyParam;
		if(captchaVerifyParam != null){
			putQueryParameter("CaptchaVerifyParam", captchaVerifyParam);
		}
	}

	@Override
	public Class<VerifyCaptchaResponse> getResponseClass() {
		return VerifyCaptchaResponse.class;
	}

}
