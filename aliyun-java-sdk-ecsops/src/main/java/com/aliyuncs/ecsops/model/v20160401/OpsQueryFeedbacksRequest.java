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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryFeedbacksRequest extends RpcAcsRequest<OpsQueryFeedbacksResponse> {
	   

	private List<String> functionNamess;

	private String feedback;

	private String category;

	private String auditParamStr;
	public OpsQueryFeedbacksRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryFeedbacks", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getFunctionNamess() {
		return this.functionNamess;
	}

	public void setFunctionNamess(List<String> functionNamess) {
		this.functionNamess = functionNamess;	
		if (functionNamess != null) {
			for (int i = 0; i < functionNamess.size(); i++) {
				putQueryParameter("FunctionNames." + (i + 1) , functionNamess.get(i));
			}
		}	
	}

	public String getFeedback() {
		return this.feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
		if(feedback != null){
			putQueryParameter("Feedback", feedback);
		}
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
		if(category != null){
			putQueryParameter("Category", category);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsQueryFeedbacksResponse> getResponseClass() {
		return OpsQueryFeedbacksResponse.class;
	}

}
