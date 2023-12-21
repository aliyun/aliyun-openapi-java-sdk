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

package com.aliyuncs.eiam.model.v20211201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eiam.transform.v20211201.ListEiamInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEiamInstancesResponse extends AcsResponse {

	private String requestId;

	private List<Instance> instances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Instance> getInstances() {
		return this.instances;
	}

	public void setInstances(List<Instance> instances) {
		this.instances = instances;
	}

	public static class Instance {

		private String description;

		private String instanceId;

		private Long startTime;

		private String sSODomain;

		private String developerAPIPrivateDomain;

		private String developerAPIPublicDomain;

		private String openAPIPrivateDomain;

		private String openAPIPublicDomain;

		private String instanceStatus;

		private String instanceVersion;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public String getSSODomain() {
			return this.sSODomain;
		}

		public void setSSODomain(String sSODomain) {
			this.sSODomain = sSODomain;
		}

		public String getDeveloperAPIPrivateDomain() {
			return this.developerAPIPrivateDomain;
		}

		public void setDeveloperAPIPrivateDomain(String developerAPIPrivateDomain) {
			this.developerAPIPrivateDomain = developerAPIPrivateDomain;
		}

		public String getDeveloperAPIPublicDomain() {
			return this.developerAPIPublicDomain;
		}

		public void setDeveloperAPIPublicDomain(String developerAPIPublicDomain) {
			this.developerAPIPublicDomain = developerAPIPublicDomain;
		}

		public String getOpenAPIPrivateDomain() {
			return this.openAPIPrivateDomain;
		}

		public void setOpenAPIPrivateDomain(String openAPIPrivateDomain) {
			this.openAPIPrivateDomain = openAPIPrivateDomain;
		}

		public String getOpenAPIPublicDomain() {
			return this.openAPIPublicDomain;
		}

		public void setOpenAPIPublicDomain(String openAPIPublicDomain) {
			this.openAPIPublicDomain = openAPIPublicDomain;
		}

		public String getInstanceStatus() {
			return this.instanceStatus;
		}

		public void setInstanceStatus(String instanceStatus) {
			this.instanceStatus = instanceStatus;
		}

		public String getInstanceVersion() {
			return this.instanceVersion;
		}

		public void setInstanceVersion(String instanceVersion) {
			this.instanceVersion = instanceVersion;
		}
	}

	@Override
	public ListEiamInstancesResponse getInstance(UnmarshallerContext context) {
		return	ListEiamInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
