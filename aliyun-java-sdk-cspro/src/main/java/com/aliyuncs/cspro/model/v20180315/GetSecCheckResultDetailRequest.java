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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetSecCheckResultDetailRequest extends RpcAcsRequest<GetSecCheckResultDetailResponse> {
	   

	private String riskType;

	private String riskSource;

	private Long resultId;

	private Integer pageSize;

	private Integer currentPage;
	public GetSecCheckResultDetailRequest() {
		super("cspro", "2018-03-15", "GetSecCheckResultDetail", "cspro");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getRiskType() {
		return this.riskType;
	}

	public void setRiskType(String riskType) {
		this.riskType = riskType;
		if(riskType != null){
			putBodyParameter("RiskType", riskType);
		}
	}

	public String getRiskSource() {
		return this.riskSource;
	}

	public void setRiskSource(String riskSource) {
		this.riskSource = riskSource;
		if(riskSource != null){
			putBodyParameter("RiskSource", riskSource);
		}
	}

	public Long getResultId() {
		return this.resultId;
	}

	public void setResultId(Long resultId) {
		this.resultId = resultId;
		if(resultId != null){
			putBodyParameter("ResultId", resultId.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putBodyParameter("CurrentPage", currentPage.toString());
		}
	}

	@Override
	public Class<GetSecCheckResultDetailResponse> getResponseClass() {
		return GetSecCheckResultDetailResponse.class;
	}

}
