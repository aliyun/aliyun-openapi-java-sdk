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
import com.aliyuncs.swas_open.transform.v20200601.DescribeCloudMonitorAgentStatusesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCloudMonitorAgentStatusesResponse extends AcsResponse {

	private String requestId;

	private List<InstanceStatus> instanceStatusList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<InstanceStatus> getInstanceStatusList() {
		return this.instanceStatusList;
	}

	public void setInstanceStatusList(List<InstanceStatus> instanceStatusList) {
		this.instanceStatusList = instanceStatusList;
	}

	public static class InstanceStatus {

		private String status;

		private String instanceId;

		private Boolean autoInstall;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Boolean getAutoInstall() {
			return this.autoInstall;
		}

		public void setAutoInstall(Boolean autoInstall) {
			this.autoInstall = autoInstall;
		}
	}

	@Override
	public DescribeCloudMonitorAgentStatusesResponse getInstance(UnmarshallerContext context) {
		return	DescribeCloudMonitorAgentStatusesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
