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
import com.aliyuncs.sofa.transform.v20190815.QueryLinkeBahamutArchdomainsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkeBahamutArchdomainsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorMessage;

	private String errorMsgParamsMap;

	private String message;

	private Boolean success;

	private List<ResultItem> result;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMsgParamsMap() {
		return this.errorMsgParamsMap;
	}

	public void setErrorMsgParamsMap(String errorMsgParamsMap) {
		this.errorMsgParamsMap = errorMsgParamsMap;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String bakOwner;

		private String bakTestOwner;

		private Long created;

		private Boolean deleted;

		private String description;

		private String externalId;

		private String id;

		private Long lastModified;

		private String level;

		private String name;

		private String owner;

		private String parentId;

		private String tenantId;

		private String testOwner;

		private List<String> appMetaIds;

		private List<String> linkcGroups;

		public String getBakOwner() {
			return this.bakOwner;
		}

		public void setBakOwner(String bakOwner) {
			this.bakOwner = bakOwner;
		}

		public String getBakTestOwner() {
			return this.bakTestOwner;
		}

		public void setBakTestOwner(String bakTestOwner) {
			this.bakTestOwner = bakTestOwner;
		}

		public Long getCreated() {
			return this.created;
		}

		public void setCreated(Long created) {
			this.created = created;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getExternalId() {
			return this.externalId;
		}

		public void setExternalId(String externalId) {
			this.externalId = externalId;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Long getLastModified() {
			return this.lastModified;
		}

		public void setLastModified(Long lastModified) {
			this.lastModified = lastModified;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getParentId() {
			return this.parentId;
		}

		public void setParentId(String parentId) {
			this.parentId = parentId;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getTestOwner() {
			return this.testOwner;
		}

		public void setTestOwner(String testOwner) {
			this.testOwner = testOwner;
		}

		public List<String> getAppMetaIds() {
			return this.appMetaIds;
		}

		public void setAppMetaIds(List<String> appMetaIds) {
			this.appMetaIds = appMetaIds;
		}

		public List<String> getLinkcGroups() {
			return this.linkcGroups;
		}

		public void setLinkcGroups(List<String> linkcGroups) {
			this.linkcGroups = linkcGroups;
		}
	}

	@Override
	public QueryLinkeBahamutArchdomainsResponse getInstance(UnmarshallerContext context) {
		return	QueryLinkeBahamutArchdomainsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
