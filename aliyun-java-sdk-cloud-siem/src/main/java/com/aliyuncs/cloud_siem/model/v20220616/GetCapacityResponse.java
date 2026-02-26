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

package com.aliyuncs.cloud_siem.model.v20220616;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloud_siem.transform.v20220616.GetCapacityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCapacityResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Double usedCapacity;

		private Long preservedCapacity;

		private Boolean existLogStore;

		private Long agentManagedAssetQuota;

		private Long agentManagedAssetUsed;

		public Double getUsedCapacity() {
			return this.usedCapacity;
		}

		public void setUsedCapacity(Double usedCapacity) {
			this.usedCapacity = usedCapacity;
		}

		public Long getPreservedCapacity() {
			return this.preservedCapacity;
		}

		public void setPreservedCapacity(Long preservedCapacity) {
			this.preservedCapacity = preservedCapacity;
		}

		public Boolean getExistLogStore() {
			return this.existLogStore;
		}

		public void setExistLogStore(Boolean existLogStore) {
			this.existLogStore = existLogStore;
		}

		public Long getAgentManagedAssetQuota() {
			return this.agentManagedAssetQuota;
		}

		public void setAgentManagedAssetQuota(Long agentManagedAssetQuota) {
			this.agentManagedAssetQuota = agentManagedAssetQuota;
		}

		public Long getAgentManagedAssetUsed() {
			return this.agentManagedAssetUsed;
		}

		public void setAgentManagedAssetUsed(Long agentManagedAssetUsed) {
			this.agentManagedAssetUsed = agentManagedAssetUsed;
		}
	}

	@Override
	public GetCapacityResponse getInstance(UnmarshallerContext context) {
		return	GetCapacityResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
