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
import com.aliyuncs.ecs.transform.v20140526.CreateAutoProvisioningGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateAutoProvisioningGroupResponse extends AcsResponse {

	private String autoProvisioningGroupId;

	private String requestId;

	private List<LaunchResult> launchResults;

	public String getAutoProvisioningGroupId() {
		return this.autoProvisioningGroupId;
	}

	public void setAutoProvisioningGroupId(String autoProvisioningGroupId) {
		this.autoProvisioningGroupId = autoProvisioningGroupId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<LaunchResult> getLaunchResults() {
		return this.launchResults;
	}

	public void setLaunchResults(List<LaunchResult> launchResults) {
		this.launchResults = launchResults;
	}

	public static class LaunchResult {

		private String zoneId;

		private String errorMsg;

		private String instanceType;

		private String errorCode;

		private String spotStrategy;

		private List<String> instanceIds;

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getErrorMsg() {
			return this.errorMsg;
		}

		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getSpotStrategy() {
			return this.spotStrategy;
		}

		public void setSpotStrategy(String spotStrategy) {
			this.spotStrategy = spotStrategy;
		}

		public List<String> getInstanceIds() {
			return this.instanceIds;
		}

		public void setInstanceIds(List<String> instanceIds) {
			this.instanceIds = instanceIds;
		}
	}

	@Override
	public CreateAutoProvisioningGroupResponse getInstance(UnmarshallerContext context) {
		return	CreateAutoProvisioningGroupResponseUnmarshaller.unmarshall(this, context);
	}
}
