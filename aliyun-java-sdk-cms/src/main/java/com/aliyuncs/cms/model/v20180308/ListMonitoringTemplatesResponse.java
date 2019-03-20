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

package com.aliyuncs.cms.model.v20180308;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20180308.ListMonitoringTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMonitoringTemplatesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer errorCode;

	private String errorMessage;

	private Long pageSize;

	private Long pageNumber;

	private Long total;

	private List<Resource> resources;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<Resource> getResources() {
		return this.resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public static class Resource {

		private String name;

		private String namespace;

		private String description;

		private String alertTemplatesJson;

		private Long restVersion;

		private Long id;

		private Long gmtCreate;

		private Long gmtModified;

		private String eventRuleTemplatesJson;

		private List<ApplyHistory> applyHistories;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getAlertTemplatesJson() {
			return this.alertTemplatesJson;
		}

		public void setAlertTemplatesJson(String alertTemplatesJson) {
			this.alertTemplatesJson = alertTemplatesJson;
		}

		public Long getRestVersion() {
			return this.restVersion;
		}

		public void setRestVersion(Long restVersion) {
			this.restVersion = restVersion;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
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

		public String getEventRuleTemplatesJson() {
			return this.eventRuleTemplatesJson;
		}

		public void setEventRuleTemplatesJson(String eventRuleTemplatesJson) {
			this.eventRuleTemplatesJson = eventRuleTemplatesJson;
		}

		public List<ApplyHistory> getApplyHistories() {
			return this.applyHistories;
		}

		public void setApplyHistories(List<ApplyHistory> applyHistories) {
			this.applyHistories = applyHistories;
		}

		public static class ApplyHistory {

			private Long groupId;

			private String groupName;

			private Long applyTime;

			public Long getGroupId() {
				return this.groupId;
			}

			public void setGroupId(Long groupId) {
				this.groupId = groupId;
			}

			public String getGroupName() {
				return this.groupName;
			}

			public void setGroupName(String groupName) {
				this.groupName = groupName;
			}

			public Long getApplyTime() {
				return this.applyTime;
			}

			public void setApplyTime(Long applyTime) {
				this.applyTime = applyTime;
			}
		}
	}

	@Override
	public ListMonitoringTemplatesResponse getInstance(UnmarshallerContext context) {
		return	ListMonitoringTemplatesResponseUnmarshaller.unmarshall(this, context);
	}
}
