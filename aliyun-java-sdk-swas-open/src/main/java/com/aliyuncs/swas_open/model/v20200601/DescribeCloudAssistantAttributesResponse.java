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

package com.aliyuncs.swas_open.model.v20200601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.swas_open.transform.v20200601.DescribeCloudAssistantAttributesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCloudAssistantAttributesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<Status> cloudAssistant;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Status> getCloudAssistant() {
		return this.cloudAssistant;
	}

	public void setCloudAssistant(List<Status> cloudAssistant) {
		this.cloudAssistant = cloudAssistant;
	}

	public static class Status {

		private String instanceId;

		private String cloudAssistantStatus;

		private String lastInvokedTime;

		private String cloudAssistantVersion;

		private Long activeTaskCount;

		private Long invocationCount;

		private String lastHeartbeatTime;

		private String oSType;

		private Boolean supportSessionManager;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getCloudAssistantStatus() {
			return this.cloudAssistantStatus;
		}

		public void setCloudAssistantStatus(String cloudAssistantStatus) {
			this.cloudAssistantStatus = cloudAssistantStatus;
		}

		public String getLastInvokedTime() {
			return this.lastInvokedTime;
		}

		public void setLastInvokedTime(String lastInvokedTime) {
			this.lastInvokedTime = lastInvokedTime;
		}

		public String getCloudAssistantVersion() {
			return this.cloudAssistantVersion;
		}

		public void setCloudAssistantVersion(String cloudAssistantVersion) {
			this.cloudAssistantVersion = cloudAssistantVersion;
		}

		public Long getActiveTaskCount() {
			return this.activeTaskCount;
		}

		public void setActiveTaskCount(Long activeTaskCount) {
			this.activeTaskCount = activeTaskCount;
		}

		public Long getInvocationCount() {
			return this.invocationCount;
		}

		public void setInvocationCount(Long invocationCount) {
			this.invocationCount = invocationCount;
		}

		public String getLastHeartbeatTime() {
			return this.lastHeartbeatTime;
		}

		public void setLastHeartbeatTime(String lastHeartbeatTime) {
			this.lastHeartbeatTime = lastHeartbeatTime;
		}

		public String getOSType() {
			return this.oSType;
		}

		public void setOSType(String oSType) {
			this.oSType = oSType;
		}

		public Boolean getSupportSessionManager() {
			return this.supportSessionManager;
		}

		public void setSupportSessionManager(Boolean supportSessionManager) {
			this.supportSessionManager = supportSessionManager;
		}
	}

	@Override
	public DescribeCloudAssistantAttributesResponse getInstance(UnmarshallerContext context) {
		return	DescribeCloudAssistantAttributesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
