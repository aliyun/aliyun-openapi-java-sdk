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
public class FindApprovalOrderListRequest extends RpcAcsRequest<FindApprovalOrderListResponse> {
	
	public FindApprovalOrderListRequest() {
		super("CSB", "2017-11-18", "FindApprovalOrderList", "CSB");
		setProtocol(ProtocolType.HTTPS);
	}

	private String projectName;

	private String alias;

	private String serviceName;

	private Integer pageNum;

	private Long serviceId;

	private Boolean onlyPending;

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("ProjectName", projectName);
		}
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
		if(alias != null){
			putQueryParameter("Alias", alias);
		}
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
		if(serviceName != null){
			putQueryParameter("ServiceName", serviceName);
		}
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
		}
	}

	public Long getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
		if(serviceId != null){
			putQueryParameter("ServiceId", serviceId.toString());
		}
	}

	public Boolean getOnlyPending() {
		return this.onlyPending;
	}

	public void setOnlyPending(Boolean onlyPending) {
		this.onlyPending = onlyPending;
		if(onlyPending != null){
			putQueryParameter("OnlyPending", onlyPending.toString());
		}
	}

	@Override
	public Class<FindApprovalOrderListResponse> getResponseClass() {
		return FindApprovalOrderListResponse.class;
	}

}
