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

package com.aliyuncs.config.model.v20200907;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.config.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GenerateAggregateCompliancePackReportRequest extends RpcAcsRequest<GenerateAggregateCompliancePackReportResponse> {
	   

	private String clientToken;

	private Boolean multiFiles;

	private String aggregatorId;

	private String compliancePackId;
	public GenerateAggregateCompliancePackReportRequest() {
		super("Config", "2020-09-07", "GenerateAggregateCompliancePackReport", "config");
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
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public Boolean getMultiFiles() {
		return this.multiFiles;
	}

	public void setMultiFiles(Boolean multiFiles) {
		this.multiFiles = multiFiles;
		if(multiFiles != null){
			putBodyParameter("MultiFiles", multiFiles.toString());
		}
	}

	public String getAggregatorId() {
		return this.aggregatorId;
	}

	public void setAggregatorId(String aggregatorId) {
		this.aggregatorId = aggregatorId;
		if(aggregatorId != null){
			putBodyParameter("AggregatorId", aggregatorId);
		}
	}

	public String getCompliancePackId() {
		return this.compliancePackId;
	}

	public void setCompliancePackId(String compliancePackId) {
		this.compliancePackId = compliancePackId;
		if(compliancePackId != null){
			putBodyParameter("CompliancePackId", compliancePackId);
		}
	}

	@Override
	public Class<GenerateAggregateCompliancePackReportResponse> getResponseClass() {
		return GenerateAggregateCompliancePackReportResponse.class;
	}

}
