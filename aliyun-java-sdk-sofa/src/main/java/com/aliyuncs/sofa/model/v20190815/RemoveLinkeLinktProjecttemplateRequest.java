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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RemoveLinkeLinktProjecttemplateRequest extends RpcAcsRequest<RemoveLinkeLinktProjecttemplateResponse> {
	   

	private String projectSign;

	private String templateId;

	private String formJsonStr;
	public RemoveLinkeLinktProjecttemplateRequest() {
		super("SOFA", "2019-08-15", "RemoveLinkeLinktProjecttemplate", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProjectSign() {
		return this.projectSign;
	}

	public void setProjectSign(String projectSign) {
		this.projectSign = projectSign;
		if(projectSign != null){
			putBodyParameter("ProjectSign", projectSign);
		}
	}

	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putBodyParameter("TemplateId", templateId);
		}
	}

	public String getFormJsonStr() {
		return this.formJsonStr;
	}

	public void setFormJsonStr(String formJsonStr) {
		this.formJsonStr = formJsonStr;
		if(formJsonStr != null){
			putBodyParameter("FormJsonStr", formJsonStr);
		}
	}

	@Override
	public Class<RemoveLinkeLinktProjecttemplateResponse> getResponseClass() {
		return RemoveLinkeLinktProjecttemplateResponse.class;
	}

}
