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
import com.google.gson.Gson;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ros.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetTemplateParameterConstraintsRequest extends RpcAcsRequest<GetTemplateParameterConstraintsResponse> {
	   

	private String clientToken;

	private String templateBody;

	private String stackId;

	private String templateURL;

	private String templateVersion;

	private List<Object> parametersKeyFilter;

	private List<Object> parametersOrder;

	private String templateId;

	private List<Parameters> parameterss;
	public GetTemplateParameterConstraintsRequest() {
		super("ROS", "2019-09-10", "GetTemplateParameterConstraints", "ros");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getStackId() {
		return this.stackId;
	}

	public void setStackId(String stackId) {
		this.stackId = stackId;
		if(stackId != null){
			putQueryParameter("StackId", stackId);
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

	public String getTemplateVersion() {
		return this.templateVersion;
	}

	public void setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
		if(templateVersion != null){
			putQueryParameter("TemplateVersion", templateVersion);
		}
	}

	public List<Object> getParametersKeyFilter() {
		return this.parametersKeyFilter;
	}

	public void setParametersKeyFilter(List<Object> parametersKeyFilter) {
		this.parametersKeyFilter = parametersKeyFilter;
		if(parametersKeyFilter != null){
			putQueryParameter("ParametersKeyFilter", new Gson().toJson(parametersKeyFilter));
		}
	}

	public List<Object> getParametersOrder() {
		return this.parametersOrder;
	}

	public void setParametersOrder(List<Object> parametersOrder) {
		this.parametersOrder = parametersOrder;
		if(parametersOrder != null){
			putQueryParameter("ParametersOrder", new Gson().toJson(parametersOrder));
		}
	}

	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putQueryParameter("TemplateId", templateId);
		}
	}

	public List<Parameters> getParameterss() {
		return this.parameterss;
	}

	public void setParameterss(List<Parameters> parameterss) {
		this.parameterss = parameterss;	
		if (parameterss != null) {
			for (int depth1 = 0; depth1 < parameterss.size(); depth1++) {
				putQueryParameter("Parameters." + (depth1 + 1) + ".ParameterValue" , parameterss.get(depth1).getParameterValue());
				putQueryParameter("Parameters." + (depth1 + 1) + ".ParameterKey" , parameterss.get(depth1).getParameterKey());
			}
		}	
	}

	public static class Parameters {

		private String parameterValue;

		private String parameterKey;

		public String getParameterValue() {
			return this.parameterValue;
		}

		public void setParameterValue(String parameterValue) {
			this.parameterValue = parameterValue;
		}

		public String getParameterKey() {
			return this.parameterKey;
		}

		public void setParameterKey(String parameterKey) {
			this.parameterKey = parameterKey;
		}
	}

	@Override
	public Class<GetTemplateParameterConstraintsResponse> getResponseClass() {
		return GetTemplateParameterConstraintsResponse.class;
	}

}
