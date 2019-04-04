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

package com.aliyuncs.foas.model.v20181111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.foas.transform.v20181111.GetClusterResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetClusterResourceResponse extends AcsResponse {

	private String requestId;

	private Resource resource;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Resource getResource() {
		return this.resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public static class Resource {

		private Long totalMB;

		private Long allocatedMB;

		private Long availableMB;

		private Long totalVirtualCores;

		private Long allocatedVirtualCores;

		private Long availableVirtualCores;

		public Long getTotalMB() {
			return this.totalMB;
		}

		public void setTotalMB(Long totalMB) {
			this.totalMB = totalMB;
		}

		public Long getAllocatedMB() {
			return this.allocatedMB;
		}

		public void setAllocatedMB(Long allocatedMB) {
			this.allocatedMB = allocatedMB;
		}

		public Long getAvailableMB() {
			return this.availableMB;
		}

		public void setAvailableMB(Long availableMB) {
			this.availableMB = availableMB;
		}

		public Long getTotalVirtualCores() {
			return this.totalVirtualCores;
		}

		public void setTotalVirtualCores(Long totalVirtualCores) {
			this.totalVirtualCores = totalVirtualCores;
		}

		public Long getAllocatedVirtualCores() {
			return this.allocatedVirtualCores;
		}

		public void setAllocatedVirtualCores(Long allocatedVirtualCores) {
			this.allocatedVirtualCores = allocatedVirtualCores;
		}

		public Long getAvailableVirtualCores() {
			return this.availableVirtualCores;
		}

		public void setAvailableVirtualCores(Long availableVirtualCores) {
			this.availableVirtualCores = availableVirtualCores;
		}
	}

	@Override
	public GetClusterResourceResponse getInstance(UnmarshallerContext context) {
		return	GetClusterResourceResponseUnmarshaller.unmarshall(this, context);
	}
}
