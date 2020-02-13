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

package com.aliyuncs.cspro.model.v20180315;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetSiteCheckResultDetailRequest extends RpcAcsRequest<GetSiteCheckResultDetailResponse> {
	   

	private Long resultId;

	private String riskType;

	private String type;
	public GetSiteCheckResultDetailRequest() {
		super("cspro", "2018-03-15", "GetSiteCheckResultDetail", "cspro");
		setMethod(MethodType.GET);
	}

	public Long getResultId() {
		return this.resultId;
	}

	public void setResultId(Long resultId) {
		this.resultId = resultId;
		if(resultId != null){
			putQueryParameter("ResultId", resultId.toString());
		}
	}

	public String getRiskType() {
		return this.riskType;
	}

	public void setRiskType(String riskType) {
		this.riskType = riskType;
		if(riskType != null){
			putQueryParameter("RiskType", riskType);
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

	@Override
	public Class<GetSiteCheckResultDetailResponse> getResponseClass() {
		return GetSiteCheckResultDetailResponse.class;
	}

}
