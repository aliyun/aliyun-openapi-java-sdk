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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListAgentlessRiskUuidRequest extends RpcAcsRequest<ListAgentlessRiskUuidResponse> {
	   

	private String internetIp;

	private String targetName;

	private Integer pageSize;

	private String machineName;

	private Integer currentPage;

	private Boolean risk;

	private String intranetIp;
	public ListAgentlessRiskUuidRequest() {
		super("Sas", "2018-12-03", "ListAgentlessRiskUuid");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInternetIp() {
		return this.internetIp;
	}

	public void setInternetIp(String internetIp) {
		this.internetIp = internetIp;
		if(internetIp != null){
			putQueryParameter("InternetIp", internetIp);
		}
	}

	public String getTargetName() {
		return this.targetName;
	}

	public void setTargetName(String targetName) {
		this.targetName = targetName;
		if(targetName != null){
			putQueryParameter("TargetName", targetName);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getMachineName() {
		return this.machineName;
	}

	public void setMachineName(String machineName) {
		this.machineName = machineName;
		if(machineName != null){
			putQueryParameter("MachineName", machineName);
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public Boolean getRisk() {
		return this.risk;
	}

	public void setRisk(Boolean risk) {
		this.risk = risk;
		if(risk != null){
			putQueryParameter("Risk", risk.toString());
		}
	}

	public String getIntranetIp() {
		return this.intranetIp;
	}

	public void setIntranetIp(String intranetIp) {
		this.intranetIp = intranetIp;
		if(intranetIp != null){
			putQueryParameter("IntranetIp", intranetIp);
		}
	}

	@Override
	public Class<ListAgentlessRiskUuidResponse> getResponseClass() {
		return ListAgentlessRiskUuidResponse.class;
	}

}
