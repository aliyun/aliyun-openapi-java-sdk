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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeAlarmEventListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAlarmEventListResponse extends AcsResponse {

	private String requestId;

	private List<SuspEventsItem> suspEvents;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SuspEventsItem> getSuspEvents() {
		return this.suspEvents;
	}

	public void setSuspEvents(List<SuspEventsItem> suspEvents) {
		this.suspEvents = suspEvents;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class SuspEventsItem {

		private Boolean dealed;

		private String stages;

		private String internetIp;

		private Integer suspiciousEventCount;

		private String k8sClusterName;

		private String containerImageId;

		private Long gmtModified;

		private String alarmEventNameOriginal;

		private String alarmUniqueInfo;

		private Boolean canCancelFault;

		private String appName;

		private String securityEventIds;

		private String k8sClusterId;

		private String containerImageName;

		private Boolean canBeDealOnLine;

		private String description;

		private Boolean containHwMode;

		private String k8sNodeId;

		private String instanceName;

		private String saleVersion;

		private String operateErrorCode;

		private String solution;

		private Boolean hasTraceInfo;

		private String dataSource;

		private Long operateTime;

		private String instanceId;

		private String intranetIp;

		private Long endTime;

		private String uuid;

		private Long startTime;

		private String k8sPodName;

		private String containerId;

		private String alarmEventType;

		private String k8sNamespace;

		private String k8sNodeName;

		private String alarmEventName;

		private String level;

		private List<TacticItem> tacticItems;

		public Boolean getDealed() {
			return this.dealed;
		}

		public void setDealed(Boolean dealed) {
			this.dealed = dealed;
		}

		public String getStages() {
			return this.stages;
		}

		public void setStages(String stages) {
			this.stages = stages;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public Integer getSuspiciousEventCount() {
			return this.suspiciousEventCount;
		}

		public void setSuspiciousEventCount(Integer suspiciousEventCount) {
			this.suspiciousEventCount = suspiciousEventCount;
		}

		public String getK8sClusterName() {
			return this.k8sClusterName;
		}

		public void setK8sClusterName(String k8sClusterName) {
			this.k8sClusterName = k8sClusterName;
		}

		public String getContainerImageId() {
			return this.containerImageId;
		}

		public void setContainerImageId(String containerImageId) {
			this.containerImageId = containerImageId;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getAlarmEventNameOriginal() {
			return this.alarmEventNameOriginal;
		}

		public void setAlarmEventNameOriginal(String alarmEventNameOriginal) {
			this.alarmEventNameOriginal = alarmEventNameOriginal;
		}

		public String getAlarmUniqueInfo() {
			return this.alarmUniqueInfo;
		}

		public void setAlarmUniqueInfo(String alarmUniqueInfo) {
			this.alarmUniqueInfo = alarmUniqueInfo;
		}

		public Boolean getCanCancelFault() {
			return this.canCancelFault;
		}

		public void setCanCancelFault(Boolean canCancelFault) {
			this.canCancelFault = canCancelFault;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getSecurityEventIds() {
			return this.securityEventIds;
		}

		public void setSecurityEventIds(String securityEventIds) {
			this.securityEventIds = securityEventIds;
		}

		public String getK8sClusterId() {
			return this.k8sClusterId;
		}

		public void setK8sClusterId(String k8sClusterId) {
			this.k8sClusterId = k8sClusterId;
		}

		public String getContainerImageName() {
			return this.containerImageName;
		}

		public void setContainerImageName(String containerImageName) {
			this.containerImageName = containerImageName;
		}

		public Boolean getCanBeDealOnLine() {
			return this.canBeDealOnLine;
		}

		public void setCanBeDealOnLine(Boolean canBeDealOnLine) {
			this.canBeDealOnLine = canBeDealOnLine;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Boolean getContainHwMode() {
			return this.containHwMode;
		}

		public void setContainHwMode(Boolean containHwMode) {
			this.containHwMode = containHwMode;
		}

		public String getK8sNodeId() {
			return this.k8sNodeId;
		}

		public void setK8sNodeId(String k8sNodeId) {
			this.k8sNodeId = k8sNodeId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getSaleVersion() {
			return this.saleVersion;
		}

		public void setSaleVersion(String saleVersion) {
			this.saleVersion = saleVersion;
		}

		public String getOperateErrorCode() {
			return this.operateErrorCode;
		}

		public void setOperateErrorCode(String operateErrorCode) {
			this.operateErrorCode = operateErrorCode;
		}

		public String getSolution() {
			return this.solution;
		}

		public void setSolution(String solution) {
			this.solution = solution;
		}

		public Boolean getHasTraceInfo() {
			return this.hasTraceInfo;
		}

		public void setHasTraceInfo(Boolean hasTraceInfo) {
			this.hasTraceInfo = hasTraceInfo;
		}

		public String getDataSource() {
			return this.dataSource;
		}

		public void setDataSource(String dataSource) {
			this.dataSource = dataSource;
		}

		public Long getOperateTime() {
			return this.operateTime;
		}

		public void setOperateTime(Long operateTime) {
			this.operateTime = operateTime;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public String getK8sPodName() {
			return this.k8sPodName;
		}

		public void setK8sPodName(String k8sPodName) {
			this.k8sPodName = k8sPodName;
		}

		public String getContainerId() {
			return this.containerId;
		}

		public void setContainerId(String containerId) {
			this.containerId = containerId;
		}

		public String getAlarmEventType() {
			return this.alarmEventType;
		}

		public void setAlarmEventType(String alarmEventType) {
			this.alarmEventType = alarmEventType;
		}

		public String getK8sNamespace() {
			return this.k8sNamespace;
		}

		public void setK8sNamespace(String k8sNamespace) {
			this.k8sNamespace = k8sNamespace;
		}

		public String getK8sNodeName() {
			return this.k8sNodeName;
		}

		public void setK8sNodeName(String k8sNodeName) {
			this.k8sNodeName = k8sNodeName;
		}

		public String getAlarmEventName() {
			return this.alarmEventName;
		}

		public void setAlarmEventName(String alarmEventName) {
			this.alarmEventName = alarmEventName;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public List<TacticItem> getTacticItems() {
			return this.tacticItems;
		}

		public void setTacticItems(List<TacticItem> tacticItems) {
			this.tacticItems = tacticItems;
		}

		public static class TacticItem {

			private String tacticId;

			private String tacticDisplayName;

			public String getTacticId() {
				return this.tacticId;
			}

			public void setTacticId(String tacticId) {
				this.tacticId = tacticId;
			}

			public String getTacticDisplayName() {
				return this.tacticDisplayName;
			}

			public void setTacticDisplayName(String tacticDisplayName) {
				this.tacticDisplayName = tacticDisplayName;
			}
		}
	}

	public static class PageInfo {

		private Integer currentPage;

		private Integer pageSize;

		private Integer totalCount;

		private Integer count;

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

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	@Override
	public DescribeAlarmEventListResponse getInstance(UnmarshallerContext context) {
		return	DescribeAlarmEventListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
