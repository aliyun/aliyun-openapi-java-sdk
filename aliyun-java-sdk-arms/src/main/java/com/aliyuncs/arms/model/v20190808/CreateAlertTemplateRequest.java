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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAlertTemplateRequest extends RpcAcsRequest<CreateAlertTemplateResponse> {
	   

	private String templateProvider;

	private String annotations;

	private String rule;

	private String type;

	private String message;

	private String parentId;

	private String labels;

	private String name;

	private String matchExpressions;
	public CreateAlertTemplateRequest() {
		super("ARMS", "2019-08-08", "CreateAlertTemplate");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTemplateProvider() {
		return this.templateProvider;
	}

	public void setTemplateProvider(String templateProvider) {
		this.templateProvider = templateProvider;
		if(templateProvider != null){
			putQueryParameter("TemplateProvider", templateProvider);
		}
	}

	public String getAnnotations() {
		return this.annotations;
	}

	public void setAnnotations(String annotations) {
		this.annotations = annotations;
		if(annotations != null){
			putQueryParameter("Annotations", annotations);
		}
	}

	public String getRule() {
		return this.rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
		if(rule != null){
			putQueryParameter("Rule", rule);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
		if(message != null){
			putQueryParameter("Message", message);
		}
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
		if(parentId != null){
			putQueryParameter("ParentId", parentId);
		}
	}

	public String getLabels() {
		return this.labels;
	}

	public void setLabels(String labels) {
		this.labels = labels;
		if(labels != null){
			putQueryParameter("Labels", labels);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getMatchExpressions() {
		return this.matchExpressions;
	}

	public void setMatchExpressions(String matchExpressions) {
		this.matchExpressions = matchExpressions;
		if(matchExpressions != null){
			putQueryParameter("MatchExpressions", matchExpressions);
		}
	}

	@Override
	public Class<CreateAlertTemplateResponse> getResponseClass() {
		return CreateAlertTemplateResponse.class;
	}

}
