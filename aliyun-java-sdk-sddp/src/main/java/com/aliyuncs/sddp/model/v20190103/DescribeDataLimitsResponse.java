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

package com.aliyuncs.sddp.model.v20190103;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sddp.transform.v20190103.DescribeDataLimitsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataLimitsResponse extends AcsResponse {

	private Integer currentPage;

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private List<DataLimit> items;

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<DataLimit> getItems() {
		return this.items;
	}

	public void setItems(List<DataLimit> items) {
		this.items = items;
	}

	public static class DataLimit {

		private Boolean supportEvent;

		private String errorMessage;

		private Integer checkStatus;

		private String localName;

		private String tenantName;

		private String agentId;

		private Long nextStartTime;

		private String connector;

		private Integer port;

		private String checkStatusName;

		private Integer agentState;

		private Integer samplingSize;

		private String parentId;

		private Integer datamaskStatus;

		private Integer processTotalCount;

		private Long resourceType;

		private String errorCode;

		private Integer ocrStatus;

		private Integer logStoreDay;

		private Integer eventStatus;

		private Boolean supportScan;

		private Long lastFinishedTime;

		private String userName;

		private Integer auditStatus;

		private Boolean supportOcr;

		private Boolean supportAgentInstall;

		private String engineType;

		private String instanceId;

		private Integer totalCount;

		private String instanceDescription;

		private String dbVersion;

		private String regionId;

		private Long gmtCreate;

		private Boolean supportAudit;

		private Integer autoScan;

		private String resourceTypeCode;

		private Boolean supportDatamask;

		private Integer processStatus;

		private Long id;

		private Integer enable;

		public Boolean getSupportEvent() {
			return this.supportEvent;
		}

		public void setSupportEvent(Boolean supportEvent) {
			this.supportEvent = supportEvent;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public Integer getCheckStatus() {
			return this.checkStatus;
		}

		public void setCheckStatus(Integer checkStatus) {
			this.checkStatus = checkStatus;
		}

		public String getLocalName() {
			return this.localName;
		}

		public void setLocalName(String localName) {
			this.localName = localName;
		}

		public String getTenantName() {
			return this.tenantName;
		}

		public void setTenantName(String tenantName) {
			this.tenantName = tenantName;
		}

		public String getAgentId() {
			return this.agentId;
		}

		public void setAgentId(String agentId) {
			this.agentId = agentId;
		}

		public Long getNextStartTime() {
			return this.nextStartTime;
		}

		public void setNextStartTime(Long nextStartTime) {
			this.nextStartTime = nextStartTime;
		}

		public String getConnector() {
			return this.connector;
		}

		public void setConnector(String connector) {
			this.connector = connector;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getCheckStatusName() {
			return this.checkStatusName;
		}

		public void setCheckStatusName(String checkStatusName) {
			this.checkStatusName = checkStatusName;
		}

		public Integer getAgentState() {
			return this.agentState;
		}

		public void setAgentState(Integer agentState) {
			this.agentState = agentState;
		}

		public Integer getSamplingSize() {
			return this.samplingSize;
		}

		public void setSamplingSize(Integer samplingSize) {
			this.samplingSize = samplingSize;
		}

		public String getParentId() {
			return this.parentId;
		}

		public void setParentId(String parentId) {
			this.parentId = parentId;
		}

		public Integer getDatamaskStatus() {
			return this.datamaskStatus;
		}

		public void setDatamaskStatus(Integer datamaskStatus) {
			this.datamaskStatus = datamaskStatus;
		}

		public Integer getProcessTotalCount() {
			return this.processTotalCount;
		}

		public void setProcessTotalCount(Integer processTotalCount) {
			this.processTotalCount = processTotalCount;
		}

		public Long getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(Long resourceType) {
			this.resourceType = resourceType;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public Integer getOcrStatus() {
			return this.ocrStatus;
		}

		public void setOcrStatus(Integer ocrStatus) {
			this.ocrStatus = ocrStatus;
		}

		public Integer getLogStoreDay() {
			return this.logStoreDay;
		}

		public void setLogStoreDay(Integer logStoreDay) {
			this.logStoreDay = logStoreDay;
		}

		public Integer getEventStatus() {
			return this.eventStatus;
		}

		public void setEventStatus(Integer eventStatus) {
			this.eventStatus = eventStatus;
		}

		public Boolean getSupportScan() {
			return this.supportScan;
		}

		public void setSupportScan(Boolean supportScan) {
			this.supportScan = supportScan;
		}

		public Long getLastFinishedTime() {
			return this.lastFinishedTime;
		}

		public void setLastFinishedTime(Long lastFinishedTime) {
			this.lastFinishedTime = lastFinishedTime;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public Integer getAuditStatus() {
			return this.auditStatus;
		}

		public void setAuditStatus(Integer auditStatus) {
			this.auditStatus = auditStatus;
		}

		public Boolean getSupportOcr() {
			return this.supportOcr;
		}

		public void setSupportOcr(Boolean supportOcr) {
			this.supportOcr = supportOcr;
		}

		public Boolean getSupportAgentInstall() {
			return this.supportAgentInstall;
		}

		public void setSupportAgentInstall(Boolean supportAgentInstall) {
			this.supportAgentInstall = supportAgentInstall;
		}

		public String getEngineType() {
			return this.engineType;
		}

		public void setEngineType(String engineType) {
			this.engineType = engineType;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public String getInstanceDescription() {
			return this.instanceDescription;
		}

		public void setInstanceDescription(String instanceDescription) {
			this.instanceDescription = instanceDescription;
		}

		public String getDbVersion() {
			return this.dbVersion;
		}

		public void setDbVersion(String dbVersion) {
			this.dbVersion = dbVersion;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Boolean getSupportAudit() {
			return this.supportAudit;
		}

		public void setSupportAudit(Boolean supportAudit) {
			this.supportAudit = supportAudit;
		}

		public Integer getAutoScan() {
			return this.autoScan;
		}

		public void setAutoScan(Integer autoScan) {
			this.autoScan = autoScan;
		}

		public String getResourceTypeCode() {
			return this.resourceTypeCode;
		}

		public void setResourceTypeCode(String resourceTypeCode) {
			this.resourceTypeCode = resourceTypeCode;
		}

		public Boolean getSupportDatamask() {
			return this.supportDatamask;
		}

		public void setSupportDatamask(Boolean supportDatamask) {
			this.supportDatamask = supportDatamask;
		}

		public Integer getProcessStatus() {
			return this.processStatus;
		}

		public void setProcessStatus(Integer processStatus) {
			this.processStatus = processStatus;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Integer getEnable() {
			return this.enable;
		}

		public void setEnable(Integer enable) {
			this.enable = enable;
		}
	}

	@Override
	public DescribeDataLimitsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDataLimitsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
