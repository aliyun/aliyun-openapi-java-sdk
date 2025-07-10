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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribeFlowLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFlowLogsResponse extends AcsResponse {

	private String pageSize;

	private String pageNumber;

	private String requestId;

	private String totalCount;

	private String success;

	private List<FlowLog> flowLogs;

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public List<FlowLog> getFlowLogs() {
		return this.flowLogs;
	}

	public void setFlowLogs(List<FlowLog> flowLogs) {
		this.flowLogs = flowLogs;
	}

	public static class FlowLog {

		private String status;

		private String creationTime;

		private String flowLogName;

		private String trafficType;

		private String resourceType;

		private String description;

		private String projectName;

		private String logStoreName;

		private String resourceId;

		private String regionId;

		private String flowLogId;

		private String businessStatus;

		private Integer aggregationInterval;

		private String serviceType;

		private String resourceGroupId;

		private String flowLogDeliverStatus;

		private String flowLogDeliverErrorMessage;

		private String ipVersion;

		private String trafficAnalyzerId;

		private Boolean enableTrafficAnalyze;

		private Boolean enableLogDelivery;

		private List<Tag> tags;

		private List<String> trafficPath;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getFlowLogName() {
			return this.flowLogName;
		}

		public void setFlowLogName(String flowLogName) {
			this.flowLogName = flowLogName;
		}

		public String getTrafficType() {
			return this.trafficType;
		}

		public void setTrafficType(String trafficType) {
			this.trafficType = trafficType;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getLogStoreName() {
			return this.logStoreName;
		}

		public void setLogStoreName(String logStoreName) {
			this.logStoreName = logStoreName;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getFlowLogId() {
			return this.flowLogId;
		}

		public void setFlowLogId(String flowLogId) {
			this.flowLogId = flowLogId;
		}

		public String getBusinessStatus() {
			return this.businessStatus;
		}

		public void setBusinessStatus(String businessStatus) {
			this.businessStatus = businessStatus;
		}

		public Integer getAggregationInterval() {
			return this.aggregationInterval;
		}

		public void setAggregationInterval(Integer aggregationInterval) {
			this.aggregationInterval = aggregationInterval;
		}

		public String getServiceType() {
			return this.serviceType;
		}

		public void setServiceType(String serviceType) {
			this.serviceType = serviceType;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getFlowLogDeliverStatus() {
			return this.flowLogDeliverStatus;
		}

		public void setFlowLogDeliverStatus(String flowLogDeliverStatus) {
			this.flowLogDeliverStatus = flowLogDeliverStatus;
		}

		public String getFlowLogDeliverErrorMessage() {
			return this.flowLogDeliverErrorMessage;
		}

		public void setFlowLogDeliverErrorMessage(String flowLogDeliverErrorMessage) {
			this.flowLogDeliverErrorMessage = flowLogDeliverErrorMessage;
		}

		public String getIpVersion() {
			return this.ipVersion;
		}

		public void setIpVersion(String ipVersion) {
			this.ipVersion = ipVersion;
		}

		public String getTrafficAnalyzerId() {
			return this.trafficAnalyzerId;
		}

		public void setTrafficAnalyzerId(String trafficAnalyzerId) {
			this.trafficAnalyzerId = trafficAnalyzerId;
		}

		public Boolean getEnableTrafficAnalyze() {
			return this.enableTrafficAnalyze;
		}

		public void setEnableTrafficAnalyze(Boolean enableTrafficAnalyze) {
			this.enableTrafficAnalyze = enableTrafficAnalyze;
		}

		public Boolean getEnableLogDelivery() {
			return this.enableLogDelivery;
		}

		public void setEnableLogDelivery(Boolean enableLogDelivery) {
			this.enableLogDelivery = enableLogDelivery;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<String> getTrafficPath() {
			return this.trafficPath;
		}

		public void setTrafficPath(List<String> trafficPath) {
			this.trafficPath = trafficPath;
		}

		public static class Tag {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public DescribeFlowLogsResponse getInstance(UnmarshallerContext context) {
		return	DescribeFlowLogsResponseUnmarshaller.unmarshall(this, context);
	}
}
