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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DeleteActivationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DeleteActivationResponse extends AcsResponse {

	private String requestId;

	private Activation activation;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Activation getActivation() {
		return this.activation;
	}

	public void setActivation(Activation activation) {
		this.activation = activation;
	}

	public static class Activation {

		private String activationId;

		private String instanceName;

		private String description;

		private Integer instanceCount;

		private Long timeToLiveInHours;

		private String ipAddressRange;

		private Integer registeredCount;

		private Integer deregisteredCount;

		private String creationTime;

		public String getActivationId() {
			return this.activationId;
		}

		public void setActivationId(String activationId) {
			this.activationId = activationId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getInstanceCount() {
			return this.instanceCount;
		}

		public void setInstanceCount(Integer instanceCount) {
			this.instanceCount = instanceCount;
		}

		public Long getTimeToLiveInHours() {
			return this.timeToLiveInHours;
		}

		public void setTimeToLiveInHours(Long timeToLiveInHours) {
			this.timeToLiveInHours = timeToLiveInHours;
		}

		public String getIpAddressRange() {
			return this.ipAddressRange;
		}

		public void setIpAddressRange(String ipAddressRange) {
			this.ipAddressRange = ipAddressRange;
		}

		public Integer getRegisteredCount() {
			return this.registeredCount;
		}

		public void setRegisteredCount(Integer registeredCount) {
			this.registeredCount = registeredCount;
		}

		public Integer getDeregisteredCount() {
			return this.deregisteredCount;
		}

		public void setDeregisteredCount(Integer deregisteredCount) {
			this.deregisteredCount = deregisteredCount;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}
	}

	@Override
	public DeleteActivationResponse getInstance(UnmarshallerContext context) {
		return	DeleteActivationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
