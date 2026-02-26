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
public class ListApprovalSchemasRequest extends RpcAcsRequest<ListApprovalSchemasResponse> {
	   

	private List<String> schemaIds;

	private Long pageSize;

	private String schemaName;

	private String policyType;

	private Long currentPage;
	public ListApprovalSchemasRequest() {
		super("csas", "2023-01-20", "ListApprovalSchemas");
		setMethod(MethodType.GET);
	}

	public List<String> getSchemaIds() {
		return this.schemaIds;
	}

	public void setSchemaIds(List<String> schemaIds) {
		this.schemaIds = schemaIds;	
		if (schemaIds != null) {
			for (int depth1 = 0; depth1 < schemaIds.size(); depth1++) {
				putQueryParameter("SchemaIds." + (depth1 + 1) , schemaIds.get(depth1));
			}
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

	public String getSchemaName() {
		return this.schemaName;
	}

	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
		if(schemaName != null){
			putQueryParameter("SchemaName", schemaName);
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

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	@Override
	public Class<ListApprovalSchemasResponse> getResponseClass() {
		return ListApprovalSchemasResponse.class;
	}

}
