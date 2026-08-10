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

package com.aliyuncs.dataphin_public.model.v20230630;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SearchKgBySemanticRequest extends RpcAcsRequest<SearchKgBySemanticResponse> {
	   

	private Long opTenantId;

	@SerializedName("searchCommand")
	private SearchCommand searchCommand;

	private String workspaceId;
	public SearchKgBySemanticRequest() {
		super("dataphin-public", "2023-06-30", "SearchKgBySemantic");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getOpTenantId() {
		return this.opTenantId;
	}

	public void setOpTenantId(Long opTenantId) {
		this.opTenantId = opTenantId;
		if(opTenantId != null){
			putQueryParameter("OpTenantId", opTenantId.toString());
		}
	}

	public SearchCommand getSearchCommand() {
		return this.searchCommand;
	}

	public void setSearchCommand(SearchCommand searchCommand) {
		this.searchCommand = searchCommand;	
		if (searchCommand != null) {
			putBodyParameter("SearchCommand" , new Gson().toJson(searchCommand));
		}	
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putQueryParameter("WorkspaceId", workspaceId);
		}
	}

	public static class SearchCommand {

		@SerializedName("TopK")
		private Integer topK;

		@SerializedName("EntityTypeCodes")
		private List<String> entityTypeCodes;

		@SerializedName("MinSimilarity")
		private Float minSimilarity;

		@SerializedName("PropertyCode")
		private String propertyCode;

		@SerializedName("QueryText")
		private String queryText;

		public Integer getTopK() {
			return this.topK;
		}

		public void setTopK(Integer topK) {
			this.topK = topK;
		}

		public List<String> getEntityTypeCodes() {
			return this.entityTypeCodes;
		}

		public void setEntityTypeCodes(List<String> entityTypeCodes) {
			this.entityTypeCodes = entityTypeCodes;
		}

		public Float getMinSimilarity() {
			return this.minSimilarity;
		}

		public void setMinSimilarity(Float minSimilarity) {
			this.minSimilarity = minSimilarity;
		}

		public String getPropertyCode() {
			return this.propertyCode;
		}

		public void setPropertyCode(String propertyCode) {
			this.propertyCode = propertyCode;
		}

		public String getQueryText() {
			return this.queryText;
		}

		public void setQueryText(String queryText) {
			this.queryText = queryText;
		}
	}

	@Override
	public Class<SearchKgBySemanticResponse> getResponseClass() {
		return SearchKgBySemanticResponse.class;
	}

}
