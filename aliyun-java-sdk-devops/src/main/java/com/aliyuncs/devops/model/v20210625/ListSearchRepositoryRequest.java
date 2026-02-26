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

package com.aliyuncs.devops.model.v20210625;

import com.aliyuncs.RoaAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListSearchRepositoryRequest extends RoaAcsRequest<ListSearchRepositoryResponse> {
	   

	private String organizationId;

	@SerializedName("body")
	private Body body;
	public ListSearchRepositoryRequest() {
		super("devops", "2021-06-25", "ListSearchRepository");
		setUriPattern("/search/repo");
		setMethod(MethodType.POST);
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putQueryParameter("organizationId", organizationId);
		}
	}

	public Body getBody() {
		return this.body;
	}

	public void setBody(Body body) {
		this.body = body;	
		if (body != null) {
			putBodyParameter("body" , new Gson().toJson(body));
		}	
	}

	public static class Body {

		@SerializedName("aliyunPk")
		private String aliyunPk;

		@SerializedName("scope")
		private String scope;

		@SerializedName("pageSize")
		private Integer pageSize;

		@SerializedName("visibilityLevel")
		private Integer visibilityLevel;

		@SerializedName("page")
		private Integer page;

		@SerializedName("sort")
		private String sort;

		@SerializedName("keyword")
		private String keyword;

		@SerializedName("repoPath")
		private RepoPath repoPath;

		@SerializedName("order")
		private String order;

		public String getAliyunPk() {
			return this.aliyunPk;
		}

		public void setAliyunPk(String aliyunPk) {
			this.aliyunPk = aliyunPk;
		}

		public String getScope() {
			return this.scope;
		}

		public void setScope(String scope) {
			this.scope = scope;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getVisibilityLevel() {
			return this.visibilityLevel;
		}

		public void setVisibilityLevel(Integer visibilityLevel) {
			this.visibilityLevel = visibilityLevel;
		}

		public Integer getPage() {
			return this.page;
		}

		public void setPage(Integer page) {
			this.page = page;
		}

		public String getSort() {
			return this.sort;
		}

		public void setSort(String sort) {
			this.sort = sort;
		}

		public String getKeyword() {
			return this.keyword;
		}

		public void setKeyword(String keyword) {
			this.keyword = keyword;
		}

		public RepoPath getRepoPath() {
			return this.repoPath;
		}

		public void setRepoPath(RepoPath repoPath) {
			this.repoPath = repoPath;
		}

		public String getOrder() {
			return this.order;
		}

		public void setOrder(String order) {
			this.order = order;
		}

		public static class RepoPath {

			@SerializedName("matchType")
			private String matchType;

			@SerializedName("value")
			private String value;

			@SerializedName("operatorType")
			private String operatorType;

			public String getMatchType() {
				return this.matchType;
			}

			public void setMatchType(String matchType) {
				this.matchType = matchType;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getOperatorType() {
				return this.operatorType;
			}

			public void setOperatorType(String operatorType) {
				this.operatorType = operatorType;
			}
		}
	}

	@Override
	public Class<ListSearchRepositoryResponse> getResponseClass() {
		return ListSearchRepositoryResponse.class;
	}

}
