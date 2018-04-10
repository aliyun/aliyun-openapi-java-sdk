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

package com.aliyuncs.csb.model.v20171118;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class FindApproveServiceListRequest extends RpcAcsRequest<FindApproveServiceListResponse> {
	
	public FindApproveServiceListRequest() {
		super("CSB", "2017-11-18", "FindApproveServiceList", "CSB");
		setProtocol(ProtocolType.HTTPS);
	}

	private String approveLevel;

	private String projectName;

	private Boolean showDelService;

	private Long csbId;

	private String alias;

	private String serviceName;

	public String getApproveLevel() {
		return this.approveLevel;
	}

	public void setApproveLevel(String approveLevel) {
		this.approveLevel = approveLevel;
		if(approveLevel != null){
			putQueryParameter("approveLevel", approveLevel);
		}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("projectName", projectName);
		}
	}

	public Boolean getShowDelService() {
		return this.showDelService;
	}

	public void setShowDelService(Boolean showDelService) {
		this.showDelService = showDelService;
		if(showDelService != null){
			putQueryParameter("showDelService", showDelService.toString());
		}
	}

	public Long getCsbId() {
		return this.csbId;
	}

	public void setCsbId(Long csbId) {
		this.csbId = csbId;
		if(csbId != null){
			putQueryParameter("csbId", csbId.toString());
		}
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
		if(alias != null){
			putQueryParameter("alias", alias);
		}
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
		if(serviceName != null){
			putQueryParameter("serviceName", serviceName);
		}
	}

	@Override
	public Class<FindApproveServiceListResponse> getResponseClass() {
		return FindApproveServiceListResponse.class;
	}

}
