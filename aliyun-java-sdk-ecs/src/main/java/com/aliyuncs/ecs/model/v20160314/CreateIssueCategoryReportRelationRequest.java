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

package com.aliyuncs.ecs.model.v20160314;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateIssueCategoryReportRelationRequest extends RpcAcsRequest<CreateIssueCategoryReportRelationResponse> {
	   

	private List<RelationModelList> relationModelLists;
	public CreateIssueCategoryReportRelationRequest() {
		super("Ecs", "2016-03-14", "CreateIssueCategoryReportRelation", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<RelationModelList> getRelationModelLists() {
		return this.relationModelLists;
	}

	public void setRelationModelLists(List<RelationModelList> relationModelLists) {
		this.relationModelLists = relationModelLists;	
		if (relationModelLists != null) {
			for (int depth1 = 0; depth1 < relationModelLists.size(); depth1++) {
				putQueryParameter("RelationModelList." + (depth1 + 1) + ".IssueCategoryId" , relationModelLists.get(depth1).getIssueCategoryId());
				putQueryParameter("RelationModelList." + (depth1 + 1) + ".IssueCategoryName" , relationModelLists.get(depth1).getIssueCategoryName());
				putQueryParameter("RelationModelList." + (depth1 + 1) + ".ReportId" , relationModelLists.get(depth1).getReportId());
				putQueryParameter("RelationModelList." + (depth1 + 1) + ".CustomerInputContent" , relationModelLists.get(depth1).getCustomerInputContent());
				putQueryParameter("RelationModelList." + (depth1 + 1) + ".MappingTools" , relationModelLists.get(depth1).getMappingTools());
			}
		}	
	}

	public static class RelationModelList {

		private Long issueCategoryId;

		private String issueCategoryName;

		private String reportId;

		private String customerInputContent;

		private String mappingTools;

		public Long getIssueCategoryId() {
			return this.issueCategoryId;
		}

		public void setIssueCategoryId(Long issueCategoryId) {
			this.issueCategoryId = issueCategoryId;
		}

		public String getIssueCategoryName() {
			return this.issueCategoryName;
		}

		public void setIssueCategoryName(String issueCategoryName) {
			this.issueCategoryName = issueCategoryName;
		}

		public String getReportId() {
			return this.reportId;
		}

		public void setReportId(String reportId) {
			this.reportId = reportId;
		}

		public String getCustomerInputContent() {
			return this.customerInputContent;
		}

		public void setCustomerInputContent(String customerInputContent) {
			this.customerInputContent = customerInputContent;
		}

		public String getMappingTools() {
			return this.mappingTools;
		}

		public void setMappingTools(String mappingTools) {
			this.mappingTools = mappingTools;
		}
	}

	@Override
	public Class<CreateIssueCategoryReportRelationResponse> getResponseClass() {
		return CreateIssueCategoryReportRelationResponse.class;
	}

}
