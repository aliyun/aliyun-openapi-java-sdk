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

package com.aliyuncs.aiccs.model.v20191015;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aiccs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class EditQualityRuleTagRequest extends RpcAcsRequest<EditQualityRuleTagResponse> {
	   

	private String instanceId;

	private List<AnalysisTypes> analysisTypess;
	public EditQualityRuleTagRequest() {
		super("aiccs", "2019-10-15", "EditQualityRuleTag");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public List<AnalysisTypes> getAnalysisTypess() {
		return this.analysisTypess;
	}

	public void setAnalysisTypess(List<AnalysisTypes> analysisTypess) {
		this.analysisTypess = analysisTypess;	
		if (analysisTypess != null) {
			for (int depth1 = 0; depth1 < analysisTypess.size(); depth1++) {
				putQueryParameter("AnalysisTypes." + (depth1 + 1) + ".Name" , analysisTypess.get(depth1).getName());
				putQueryParameter("AnalysisTypes." + (depth1 + 1) + ".Id" , analysisTypess.get(depth1).getId());
			}
		}	
	}

	public static class AnalysisTypes {

		private String name;

		private Long id;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}
	}

	@Override
	public Class<EditQualityRuleTagResponse> getResponseClass() {
		return EditQualityRuleTagResponse.class;
	}

}
