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
public class DescribeFirewallTemplatesRequest extends RpcAcsRequest<DescribeFirewallTemplatesResponse> {
	   

	private List<String> firewallTemplateIds;

	private Integer pageNumber;

	private String name;

	private Integer pageSize;
	public DescribeFirewallTemplatesRequest() {
		super("SWAS-OPEN", "2020-06-01", "DescribeFirewallTemplates", "SWAS-OPEN");
		setMethod(MethodType.POST);
	}

	public List<String> getFirewallTemplateIds() {
		return this.firewallTemplateIds;
	}

	public void setFirewallTemplateIds(List<String> firewallTemplateIds) {
		this.firewallTemplateIds = firewallTemplateIds;	
		if (firewallTemplateIds != null) {
			for (int i = 0; i < firewallTemplateIds.size(); i++) {
				putQueryParameter("FirewallTemplateId." + (i + 1) , firewallTemplateIds.get(i));
			}
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
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

	@Override
	public Class<DescribeFirewallTemplatesResponse> getResponseClass() {
		return DescribeFirewallTemplatesResponse.class;
	}

}
