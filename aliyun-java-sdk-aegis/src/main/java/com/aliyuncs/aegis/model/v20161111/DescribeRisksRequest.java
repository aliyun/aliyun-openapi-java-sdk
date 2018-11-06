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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeRisksRequest extends RpcAcsRequest<DescribeRisksResponse> {
	
	public DescribeRisksRequest() {
		super("aegis", "2016-11-11", "DescribeRisks", "vipaegis");
	}

	private String riskName;

	private String sourceIp;

	private Integer limit;

	private Long riskId;

	public String getRiskName() {
		return this.riskName;
	}

	public void setRiskName(String riskName) {
		this.riskName = riskName;
		if(riskName != null){
			putQueryParameter("RiskName", riskName);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public Integer getLimit() {
		return this.limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
		if(limit != null){
			putQueryParameter("Limit", limit.toString());
		}
	}

	public Long getRiskId() {
		return this.riskId;
	}

	public void setRiskId(Long riskId) {
		this.riskId = riskId;
		if(riskId != null){
			putQueryParameter("RiskId", riskId.toString());
		}
	}

	@Override
	public Class<DescribeRisksResponse> getResponseClass() {
		return DescribeRisksResponse.class;
	}

}
