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
public class ListRemediationTemplatesRequest extends RpcAcsRequest<ListRemediationTemplatesResponse> {
	   

	private String managedRuleIdentifier;

	private String remediationType;

	private Long pageNumber;

	private Long pageSize;
	public ListRemediationTemplatesRequest() {
		super("Config", "2020-09-07", "ListRemediationTemplates");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getManagedRuleIdentifier() {
		return this.managedRuleIdentifier;
	}

	public void setManagedRuleIdentifier(String managedRuleIdentifier) {
		this.managedRuleIdentifier = managedRuleIdentifier;
		if(managedRuleIdentifier != null){
			putQueryParameter("ManagedRuleIdentifier", managedRuleIdentifier);
		}
	}

	public String getRemediationType() {
		return this.remediationType;
	}

	public void setRemediationType(String remediationType) {
		this.remediationType = remediationType;
		if(remediationType != null){
			putQueryParameter("RemediationType", remediationType);
		}
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
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

	@Override
	public Class<ListRemediationTemplatesResponse> getResponseClass() {
		return ListRemediationTemplatesResponse.class;
	}

}
