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
import com.aliyuncs.sofa.transform.v20190815.AllLinkeantcodeAntcodeProjectsallResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AllLinkeantcodeAntcodeProjectsallResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long amount;

	private String responsePage;

	private String responsePageInfoNextPage;

	private String responsePageInfoPerPage;

	private String responsePageInfoPrevPage;

	private String responsePageInfoTotal;

	private String responsePageInfoTotalPages;

	private Long responseStatusCode;

	private Long total;

	private List<ListItem> list;

	private List<StateCountsItem> stateCounts;

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

	public Long getAmount() {
		return this.amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getResponsePage() {
		return this.responsePage;
	}

	public void setResponsePage(String responsePage) {
		this.responsePage = responsePage;
	}

	public String getResponsePageInfoNextPage() {
		return this.responsePageInfoNextPage;
	}

	public void setResponsePageInfoNextPage(String responsePageInfoNextPage) {
		this.responsePageInfoNextPage = responsePageInfoNextPage;
	}

	public String getResponsePageInfoPerPage() {
		return this.responsePageInfoPerPage;
	}

	public void setResponsePageInfoPerPage(String responsePageInfoPerPage) {
		this.responsePageInfoPerPage = responsePageInfoPerPage;
	}

	public String getResponsePageInfoPrevPage() {
		return this.responsePageInfoPrevPage;
	}

	public void setResponsePageInfoPrevPage(String responsePageInfoPrevPage) {
		this.responsePageInfoPrevPage = responsePageInfoPrevPage;
	}

	public String getResponsePageInfoTotal() {
		return this.responsePageInfoTotal;
	}

	public void setResponsePageInfoTotal(String responsePageInfoTotal) {
		this.responsePageInfoTotal = responsePageInfoTotal;
	}

	public String getResponsePageInfoTotalPages() {
		return this.responsePageInfoTotalPages;
	}

	public void setResponsePageInfoTotalPages(String responsePageInfoTotalPages) {
		this.responsePageInfoTotalPages = responsePageInfoTotalPages;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<ListItem> getList() {
		return this.list;
	}

	public void setList(List<ListItem> list) {
		this.list = list;
	}

	public List<StateCountsItem> getStateCounts() {
		return this.stateCounts;
	}

	public void setStateCounts(List<StateCountsItem> stateCounts) {
		this.stateCounts = stateCounts;
	}

	public static class ListItem {

		private String description;

		private String httpUrlToRepo;

		private Long id;

		private String lastActivityAt;

		private String name;

		private String nameWithNamespace;

		private String path;

		private String pathWithNamespace;

		private String repositorySize;

		private String sshUrlToRepo;

		private Long visibilityLevel;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getHttpUrlToRepo() {
			return this.httpUrlToRepo;
		}

		public void setHttpUrlToRepo(String httpUrlToRepo) {
			this.httpUrlToRepo = httpUrlToRepo;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getLastActivityAt() {
			return this.lastActivityAt;
		}

		public void setLastActivityAt(String lastActivityAt) {
			this.lastActivityAt = lastActivityAt;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNameWithNamespace() {
			return this.nameWithNamespace;
		}

		public void setNameWithNamespace(String nameWithNamespace) {
			this.nameWithNamespace = nameWithNamespace;
		}

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getPathWithNamespace() {
			return this.pathWithNamespace;
		}

		public void setPathWithNamespace(String pathWithNamespace) {
			this.pathWithNamespace = pathWithNamespace;
		}

		public String getRepositorySize() {
			return this.repositorySize;
		}

		public void setRepositorySize(String repositorySize) {
			this.repositorySize = repositorySize;
		}

		public String getSshUrlToRepo() {
			return this.sshUrlToRepo;
		}

		public void setSshUrlToRepo(String sshUrlToRepo) {
			this.sshUrlToRepo = sshUrlToRepo;
		}

		public Long getVisibilityLevel() {
			return this.visibilityLevel;
		}

		public void setVisibilityLevel(Long visibilityLevel) {
			this.visibilityLevel = visibilityLevel;
		}
	}

	public static class StateCountsItem {

		private Long count;

		private String state;

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}
	}

	@Override
	public AllLinkeantcodeAntcodeProjectsallResponse getInstance(UnmarshallerContext context) {
		return	AllLinkeantcodeAntcodeProjectsallResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
