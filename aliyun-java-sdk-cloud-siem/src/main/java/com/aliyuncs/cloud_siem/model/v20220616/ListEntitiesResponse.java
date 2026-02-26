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

package com.aliyuncs.cloud_siem.model.v20220616;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloud_siem.transform.v20220616.ListEntitiesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEntitiesResponse extends AcsResponse {

	private Boolean success;

	private Integer code;

	private String message;

	private String requestId;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<ResponseDataItem> responseData;

		private PageInfo pageInfo;

		public List<ResponseDataItem> getResponseData() {
			return this.responseData;
		}

		public void setResponseData(List<ResponseDataItem> responseData) {
			this.responseData = responseData;
		}

		public PageInfo getPageInfo() {
			return this.pageInfo;
		}

		public void setPageInfo(PageInfo pageInfo) {
			this.pageInfo = pageInfo;
		}

		public static class ResponseDataItem {

			private Long id;

			private String gmtCreate;

			private String gmtModified;

			private Long aliuid;

			private String incidentUuid;

			private String alertUuid;

			private Integer alertNum;

			private Integer eventNum;

			private String cloudCode;

			private String entityType;

			private String entityName;

			private String entityInfo;

			private Long subUserId;

			private String entityId;

			private String entityUuid;

			private String malwareType;

			private String isAsset;

			private String isMalware;

			private String tags;

			private String agentDisposalMethod;

			private String agentDisposalPlaybookUuid;

			private String agentDisposalSuggestion;

			private String agentConfidence;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public Long getAliuid() {
				return this.aliuid;
			}

			public void setAliuid(Long aliuid) {
				this.aliuid = aliuid;
			}

			public String getIncidentUuid() {
				return this.incidentUuid;
			}

			public void setIncidentUuid(String incidentUuid) {
				this.incidentUuid = incidentUuid;
			}

			public String getAlertUuid() {
				return this.alertUuid;
			}

			public void setAlertUuid(String alertUuid) {
				this.alertUuid = alertUuid;
			}

			public Integer getAlertNum() {
				return this.alertNum;
			}

			public void setAlertNum(Integer alertNum) {
				this.alertNum = alertNum;
			}

			public Integer getEventNum() {
				return this.eventNum;
			}

			public void setEventNum(Integer eventNum) {
				this.eventNum = eventNum;
			}

			public String getCloudCode() {
				return this.cloudCode;
			}

			public void setCloudCode(String cloudCode) {
				this.cloudCode = cloudCode;
			}

			public String getEntityType() {
				return this.entityType;
			}

			public void setEntityType(String entityType) {
				this.entityType = entityType;
			}

			public String getEntityName() {
				return this.entityName;
			}

			public void setEntityName(String entityName) {
				this.entityName = entityName;
			}

			public String getEntityInfo() {
				return this.entityInfo;
			}

			public void setEntityInfo(String entityInfo) {
				this.entityInfo = entityInfo;
			}

			public Long getSubUserId() {
				return this.subUserId;
			}

			public void setSubUserId(Long subUserId) {
				this.subUserId = subUserId;
			}

			public String getEntityId() {
				return this.entityId;
			}

			public void setEntityId(String entityId) {
				this.entityId = entityId;
			}

			public String getEntityUuid() {
				return this.entityUuid;
			}

			public void setEntityUuid(String entityUuid) {
				this.entityUuid = entityUuid;
			}

			public String getMalwareType() {
				return this.malwareType;
			}

			public void setMalwareType(String malwareType) {
				this.malwareType = malwareType;
			}

			public String getIsAsset() {
				return this.isAsset;
			}

			public void setIsAsset(String isAsset) {
				this.isAsset = isAsset;
			}

			public String getIsMalware() {
				return this.isMalware;
			}

			public void setIsMalware(String isMalware) {
				this.isMalware = isMalware;
			}

			public String getTags() {
				return this.tags;
			}

			public void setTags(String tags) {
				this.tags = tags;
			}

			public String getAgentDisposalMethod() {
				return this.agentDisposalMethod;
			}

			public void setAgentDisposalMethod(String agentDisposalMethod) {
				this.agentDisposalMethod = agentDisposalMethod;
			}

			public String getAgentDisposalPlaybookUuid() {
				return this.agentDisposalPlaybookUuid;
			}

			public void setAgentDisposalPlaybookUuid(String agentDisposalPlaybookUuid) {
				this.agentDisposalPlaybookUuid = agentDisposalPlaybookUuid;
			}

			public String getAgentDisposalSuggestion() {
				return this.agentDisposalSuggestion;
			}

			public void setAgentDisposalSuggestion(String agentDisposalSuggestion) {
				this.agentDisposalSuggestion = agentDisposalSuggestion;
			}

			public String getAgentConfidence() {
				return this.agentConfidence;
			}

			public void setAgentConfidence(String agentConfidence) {
				this.agentConfidence = agentConfidence;
			}
		}

		public static class PageInfo {

			private Integer currentPage;

			private Integer pageSize;

			private Long totalCount;

			public Integer getCurrentPage() {
				return this.currentPage;
			}

			public void setCurrentPage(Integer currentPage) {
				this.currentPage = currentPage;
			}

			public Integer getPageSize() {
				return this.pageSize;
			}

			public void setPageSize(Integer pageSize) {
				this.pageSize = pageSize;
			}

			public Long getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Long totalCount) {
				this.totalCount = totalCount;
			}
		}
	}

	@Override
	public ListEntitiesResponse getInstance(UnmarshallerContext context) {
		return	ListEntitiesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
