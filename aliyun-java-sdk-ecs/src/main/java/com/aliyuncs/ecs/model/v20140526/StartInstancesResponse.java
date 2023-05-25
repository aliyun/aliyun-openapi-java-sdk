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
import com.aliyuncs.ecs.transform.v20140526.StartInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class StartInstancesResponse extends AcsResponse {

	private String requestId;

	private List<InstanceResponse> instanceResponses;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<InstanceResponse> getInstanceResponses() {
		return this.instanceResponses;
	}

	public void setInstanceResponses(List<InstanceResponse> instanceResponses) {
		this.instanceResponses = instanceResponses;
	}

	public static class InstanceResponse {

		private String code;

		private String message;

		private String instanceId;

		private String currentStatus;

		private String previousStatus;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getCurrentStatus() {
			return this.currentStatus;
		}

		public void setCurrentStatus(String currentStatus) {
			this.currentStatus = currentStatus;
		}

		public String getPreviousStatus() {
			return this.previousStatus;
		}

		public void setPreviousStatus(String previousStatus) {
			this.previousStatus = previousStatus;
		}
	}

	@Override
	public StartInstancesResponse getInstance(UnmarshallerContext context) {
		return	StartInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
