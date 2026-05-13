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

package com.aliyuncs.ess.model.v20140828;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ess.transform.v20140828.RemoveInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RemoveInstancesResponse extends AcsResponse {

	private String scalingActivityId;

	private String requestId;

	private List<IgnoredInstance> ignoredInstances;

	public String getScalingActivityId() {
		return this.scalingActivityId;
	}

	public void setScalingActivityId(String scalingActivityId) {
		this.scalingActivityId = scalingActivityId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<IgnoredInstance> getIgnoredInstances() {
		return this.ignoredInstances;
	}

	public void setIgnoredInstances(List<IgnoredInstance> ignoredInstances) {
		this.ignoredInstances = ignoredInstances;
	}

	public static class IgnoredInstance {

		private String instanceId;

		private String code;

		private String message;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

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
	}

	@Override
	public RemoveInstancesResponse getInstance(UnmarshallerContext context) {
		return	RemoveInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
