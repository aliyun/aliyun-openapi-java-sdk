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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeRCCloudAssistantStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRCCloudAssistantStatusResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private String nextToken;

	private String pageNumber;

	private String pageSize;

	private List<InstanceCloudAssistantStatusSetItem> instanceCloudAssistantStatusSet;

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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public List<InstanceCloudAssistantStatusSetItem> getInstanceCloudAssistantStatusSet() {
		return this.instanceCloudAssistantStatusSet;
	}

	public void setInstanceCloudAssistantStatusSet(List<InstanceCloudAssistantStatusSetItem> instanceCloudAssistantStatusSet) {
		this.instanceCloudAssistantStatusSet = instanceCloudAssistantStatusSet;
	}

	public static class InstanceCloudAssistantStatusSetItem {

		private String cloudAssistantVersion;

		private Boolean supportSessionManager;

		private String instanceId;

		private Integer invocationCount;

		private String oSType;

		private String cloudAssistantStatus;

		private String lastHeartbeatTime;

		private String lastInvokedTime;

		private Integer activeTaskCount;

		public String getCloudAssistantVersion() {
			return this.cloudAssistantVersion;
		}

		public void setCloudAssistantVersion(String cloudAssistantVersion) {
			this.cloudAssistantVersion = cloudAssistantVersion;
		}

		public Boolean getSupportSessionManager() {
			return this.supportSessionManager;
		}

		public void setSupportSessionManager(Boolean supportSessionManager) {
			this.supportSessionManager = supportSessionManager;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getInvocationCount() {
			return this.invocationCount;
		}

		public void setInvocationCount(Integer invocationCount) {
			this.invocationCount = invocationCount;
		}

		public String getOSType() {
			return this.oSType;
		}

		public void setOSType(String oSType) {
			this.oSType = oSType;
		}

		public String getCloudAssistantStatus() {
			return this.cloudAssistantStatus;
		}

		public void setCloudAssistantStatus(String cloudAssistantStatus) {
			this.cloudAssistantStatus = cloudAssistantStatus;
		}

		public String getLastHeartbeatTime() {
			return this.lastHeartbeatTime;
		}

		public void setLastHeartbeatTime(String lastHeartbeatTime) {
			this.lastHeartbeatTime = lastHeartbeatTime;
		}

		public String getLastInvokedTime() {
			return this.lastInvokedTime;
		}

		public void setLastInvokedTime(String lastInvokedTime) {
			this.lastInvokedTime = lastInvokedTime;
		}

		public Integer getActiveTaskCount() {
			return this.activeTaskCount;
		}

		public void setActiveTaskCount(Integer activeTaskCount) {
			this.activeTaskCount = activeTaskCount;
		}
	}

	@Override
	public DescribeRCCloudAssistantStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeRCCloudAssistantStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
