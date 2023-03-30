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

package com.aliyuncs.eflo.model.v20220530;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListVpdGrantRulesRequest extends RpcAcsRequest<ListVpdGrantRulesResponse> {
	   

	private String grantTenantId;

	private Integer pageNumber;

	private String grantRuleId;

	private Integer pageSize;

	private String erId;

	private Boolean forSelect;

	private String instanceId;

	private String instanceName;

	private Boolean enablePage;
	public ListVpdGrantRulesRequest() {
		super("eflo", "2022-05-30", "ListVpdGrantRules", "eflo");
		setMethod(MethodType.POST);
	}

	public String getGrantTenantId() {
		return this.grantTenantId;
	}

	public void setGrantTenantId(String grantTenantId) {
		this.grantTenantId = grantTenantId;
		if(grantTenantId != null){
			putBodyParameter("GrantTenantId", grantTenantId);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getGrantRuleId() {
		return this.grantRuleId;
	}

	public void setGrantRuleId(String grantRuleId) {
		this.grantRuleId = grantRuleId;
		if(grantRuleId != null){
			putBodyParameter("GrantRuleId", grantRuleId);
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

	public String getErId() {
		return this.erId;
	}

	public void setErId(String erId) {
		this.erId = erId;
		if(erId != null){
			putBodyParameter("ErId", erId);
		}
	}

	public Boolean getForSelect() {
		return this.forSelect;
	}

	public void setForSelect(Boolean forSelect) {
		this.forSelect = forSelect;
		if(forSelect != null){
			putBodyParameter("ForSelect", forSelect.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putBodyParameter("InstanceName", instanceName);
		}
	}

	public Boolean getEnablePage() {
		return this.enablePage;
	}

	public void setEnablePage(Boolean enablePage) {
		this.enablePage = enablePage;
		if(enablePage != null){
			putBodyParameter("EnablePage", enablePage.toString());
		}
	}

	@Override
	public Class<ListVpdGrantRulesResponse> getResponseClass() {
		return ListVpdGrantRulesResponse.class;
	}

}
