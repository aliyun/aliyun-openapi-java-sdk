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
public class VerifyIntelligentCaptchaRequest extends RpcAcsRequest<VerifyIntelligentCaptchaResponse> {
	   

	private String captchaVerifyParam;

	private String sceneId;
	public VerifyIntelligentCaptchaRequest() {
		super("captcha", "2023-03-05", "VerifyIntelligentCaptcha");
		setMethod(MethodType.POST);
	}

	public String getCaptchaVerifyParam() {
		return this.captchaVerifyParam;
	}

	public void setCaptchaVerifyParam(String captchaVerifyParam) {
		this.captchaVerifyParam = captchaVerifyParam;
		if(captchaVerifyParam != null){
			putBodyParameter("CaptchaVerifyParam", captchaVerifyParam);
		}
	}

	public String getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
		if(sceneId != null){
			putBodyParameter("SceneId", sceneId);
		}
	}

	@Override
	public Class<VerifyIntelligentCaptchaResponse> getResponseClass() {
		return VerifyIntelligentCaptchaResponse.class;
	}

}
