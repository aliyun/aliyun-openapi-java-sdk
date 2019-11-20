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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeCloudAssistantStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCloudAssistantStatusResponse extends AcsResponse {

	private String requestId;

	private List<InstanceCloudAssistantStatus> instanceCloudAssistantStatusSet;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<InstanceCloudAssistantStatus> getInstanceCloudAssistantStatusSet() {
		return this.instanceCloudAssistantStatusSet;
	}

	public void setInstanceCloudAssistantStatusSet(List<InstanceCloudAssistantStatus> instanceCloudAssistantStatusSet) {
		this.instanceCloudAssistantStatusSet = instanceCloudAssistantStatusSet;
	}

	public static class InstanceCloudAssistantStatus {

		private String instanceId;

		private String cloudAssistantStatus;

		private String cloudAssistantVersion;

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

		public String getCloudAssistantVersion() {
			return this.cloudAssistantVersion;
		}

		public void setCloudAssistantVersion(String cloudAssistantVersion) {
			this.cloudAssistantVersion = cloudAssistantVersion;
		}
	}

	@Override
	public DescribeCloudAssistantStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeCloudAssistantStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
