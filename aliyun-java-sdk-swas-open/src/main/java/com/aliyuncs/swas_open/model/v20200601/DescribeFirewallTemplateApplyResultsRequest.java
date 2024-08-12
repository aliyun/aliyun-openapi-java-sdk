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

package com.aliyuncs.swas_open.model.v20200601;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeFirewallTemplateApplyResultsRequest extends RpcAcsRequest<DescribeFirewallTemplateApplyResultsResponse> {
	   

	private String firewallTemplateId;

	private String clientToken;

	private Integer pageNumber;

	private Integer pageSize;

	private List<String> taskIds;
	public DescribeFirewallTemplateApplyResultsRequest() {
		super("SWAS-OPEN", "2020-06-01", "DescribeFirewallTemplateApplyResults", "SWAS-OPEN");
		setMethod(MethodType.POST);
	}

	public String getFirewallTemplateId() {
		return this.firewallTemplateId;
	}

	public void setFirewallTemplateId(String firewallTemplateId) {
		this.firewallTemplateId = firewallTemplateId;
		if(firewallTemplateId != null){
			putQueryParameter("FirewallTemplateId", firewallTemplateId);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
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

	public List<String> getTaskIds() {
		return this.taskIds;
	}

	public void setTaskIds(List<String> taskIds) {
		this.taskIds = taskIds;	
		if (taskIds != null) {
			for (int i = 0; i < taskIds.size(); i++) {
				putQueryParameter("TaskId." + (i + 1) , taskIds.get(i));
			}
		}	
	}

	@Override
	public Class<DescribeFirewallTemplateApplyResultsResponse> getResponseClass() {
		return DescribeFirewallTemplateApplyResultsResponse.class;
	}

}
