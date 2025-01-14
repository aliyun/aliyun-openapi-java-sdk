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

package com.aliyuncs.csas.model.v20230120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListApprovalProcessesRequest extends RpcAcsRequest<ListApprovalProcessesResponse> {
	   

	private List<String> processIds;

	private String policyId;

	private String saseUserId;

	private Long pageSize;

	private String policyType;

	private String processName;

	private Long currentPage;

	private String username;
	public ListApprovalProcessesRequest() {
		super("csas", "2023-01-20", "ListApprovalProcesses");
		setMethod(MethodType.GET);
	}

	public List<String> getProcessIds() {
		return this.processIds;
	}

	public void setProcessIds(List<String> processIds) {
		this.processIds = processIds;	
		if (processIds != null) {
			for (int depth1 = 0; depth1 < processIds.size(); depth1++) {
				putQueryParameter("ProcessIds." + (depth1 + 1) , processIds.get(depth1));
			}
		}	
	}

	public String getPolicyId() {
		return this.policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
		if(policyId != null){
			putQueryParameter("PolicyId", policyId);
		}
	}

	public String getSaseUserId() {
		return this.saseUserId;
	}

	public void setSaseUserId(String saseUserId) {
		this.saseUserId = saseUserId;
		if(saseUserId != null){
			putQueryParameter("SaseUserId", saseUserId);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getPolicyType() {
		return this.policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
		if(policyType != null){
			putQueryParameter("PolicyType", policyType);
		}
	}

	public String getProcessName() {
		return this.processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
		if(processName != null){
			putQueryParameter("ProcessName", processName);
		}
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
		if(username != null){
			putQueryParameter("Username", username);
		}
	}

	@Override
	public Class<ListApprovalProcessesResponse> getResponseClass() {
		return ListApprovalProcessesResponse.class;
	}

}
