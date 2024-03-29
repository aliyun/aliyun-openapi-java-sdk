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

package com.aliyuncs.ros.model.v20190910;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ros.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ValidateTemplateRequest extends RpcAcsRequest<ValidateTemplateResponse> {
	   

	private String validationOption;

	private String clientToken;

	private String templateBody;

	private String templateURL;

	private List<String> updateInfoOptionss;
	public ValidateTemplateRequest() {
		super("ROS", "2019-09-10", "ValidateTemplate", "ros");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getValidationOption() {
		return this.validationOption;
	}

	public void setValidationOption(String validationOption) {
		this.validationOption = validationOption;
		if(validationOption != null){
			putQueryParameter("ValidationOption", validationOption);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getTemplateBody() {
		return this.templateBody;
	}

	public void setTemplateBody(String templateBody) {
		this.templateBody = templateBody;
		if(templateBody != null){
			putBodyParameter("TemplateBody", templateBody);
		}
	}

	public String getTemplateURL() {
		return this.templateURL;
	}

	public void setTemplateURL(String templateURL) {
		this.templateURL = templateURL;
		if(templateURL != null){
			putQueryParameter("TemplateURL", templateURL);
		}
	}

	public List<String> getUpdateInfoOptionss() {
		return this.updateInfoOptionss;
	}

	public void setUpdateInfoOptionss(List<String> updateInfoOptionss) {
		this.updateInfoOptionss = updateInfoOptionss;	
		if (updateInfoOptionss != null) {
			for (int i = 0; i < updateInfoOptionss.size(); i++) {
				putQueryParameter("UpdateInfoOptions." + (i + 1) , updateInfoOptionss.get(i));
			}
		}	
	}

	@Override
	public Class<ValidateTemplateResponse> getResponseClass() {
		return ValidateTemplateResponse.class;
	}

}
