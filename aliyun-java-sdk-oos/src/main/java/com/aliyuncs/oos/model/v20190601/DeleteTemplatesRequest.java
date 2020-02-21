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

package com.aliyuncs.oos.model.v20190601;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteTemplatesRequest extends RpcAcsRequest<DeleteTemplatesResponse> {
	   

	private String templateNames;

	private Boolean autoDeleteExecutions;
	public DeleteTemplatesRequest() {
		super("oos", "2019-06-01", "DeleteTemplates", "oos");
		setMethod(MethodType.POST);
	}

	public String getTemplateNames() {
		return this.templateNames;
	}

	public void setTemplateNames(String templateNames) {
		this.templateNames = templateNames;
		if(templateNames != null){
			putQueryParameter("TemplateNames", templateNames);
		}
	}

	public Boolean getAutoDeleteExecutions() {
		return this.autoDeleteExecutions;
	}

	public void setAutoDeleteExecutions(Boolean autoDeleteExecutions) {
		this.autoDeleteExecutions = autoDeleteExecutions;
		if(autoDeleteExecutions != null){
			putQueryParameter("AutoDeleteExecutions", autoDeleteExecutions.toString());
		}
	}

	@Override
	public Class<DeleteTemplatesResponse> getResponseClass() {
		return DeleteTemplatesResponse.class;
	}

}
