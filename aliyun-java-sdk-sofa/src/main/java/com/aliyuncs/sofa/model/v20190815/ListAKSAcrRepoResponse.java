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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.ListAKSAcrRepoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAKSAcrRepoResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private RepoList repoList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public RepoList getRepoList() {
		return this.repoList;
	}

	public void setRepoList(RepoList repoList) {
		this.repoList = repoList;
	}

	public static class RepoList {

		private Long page;

		private Long pageSize;

		private Long total;

		private List<ReposItem> repos;

		public Long getPage() {
			return this.page;
		}

		public void setPage(Long page) {
			this.page = page;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public List<ReposItem> getRepos() {
			return this.repos;
		}

		public void setRepos(List<ReposItem> repos) {
			this.repos = repos;
		}

		public static class ReposItem {

			private String detail;

			private Long gmtCreate;

			private Long gmtModified;

			private String regionId;

			private String repoAuthorizeType;

			private String repoBuildType;

			private String repoName;

			private String repoNamespace;

			private String repoStatus;

			private String repoType;

			private String summary;

			private List<RepoDomainListItem> repoDomainList;

			public String getDetail() {
				return this.detail;
			}

			public void setDetail(String detail) {
				this.detail = detail;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getRepoAuthorizeType() {
				return this.repoAuthorizeType;
			}

			public void setRepoAuthorizeType(String repoAuthorizeType) {
				this.repoAuthorizeType = repoAuthorizeType;
			}

			public String getRepoBuildType() {
				return this.repoBuildType;
			}

			public void setRepoBuildType(String repoBuildType) {
				this.repoBuildType = repoBuildType;
			}

			public String getRepoName() {
				return this.repoName;
			}

			public void setRepoName(String repoName) {
				this.repoName = repoName;
			}

			public String getRepoNamespace() {
				return this.repoNamespace;
			}

			public void setRepoNamespace(String repoNamespace) {
				this.repoNamespace = repoNamespace;
			}

			public String getRepoStatus() {
				return this.repoStatus;
			}

			public void setRepoStatus(String repoStatus) {
				this.repoStatus = repoStatus;
			}

			public String getRepoType() {
				return this.repoType;
			}

			public void setRepoType(String repoType) {
				this.repoType = repoType;
			}

			public String getSummary() {
				return this.summary;
			}

			public void setSummary(String summary) {
				this.summary = summary;
			}

			public List<RepoDomainListItem> getRepoDomainList() {
				return this.repoDomainList;
			}

			public void setRepoDomainList(List<RepoDomainListItem> repoDomainList) {
				this.repoDomainList = repoDomainList;
			}

			public static class RepoDomainListItem {

				private String domain;

				private String type;

				public String getDomain() {
					return this.domain;
				}

				public void setDomain(String domain) {
					this.domain = domain;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}
			}
		}
	}

	@Override
	public ListAKSAcrRepoResponse getInstance(UnmarshallerContext context) {
		return	ListAKSAcrRepoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
