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
import com.aliyuncs.swas_open.transform.v20200601.ListInstancesTrafficPackagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInstancesTrafficPackagesResponse extends AcsResponse {

	private String requestId;

	private List<InstanceTrafficPackageUsage> instanceTrafficPackageUsages;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<InstanceTrafficPackageUsage> getInstanceTrafficPackageUsages() {
		return this.instanceTrafficPackageUsages;
	}

	public void setInstanceTrafficPackageUsages(List<InstanceTrafficPackageUsage> instanceTrafficPackageUsages) {
		this.instanceTrafficPackageUsages = instanceTrafficPackageUsages;
	}

	public static class InstanceTrafficPackageUsage {

		private String instanceId;

		private Long trafficUsed;

		private Long trafficPackageTotal;

		private Long trafficPackageRemaining;

		private Long trafficOverflow;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getTrafficUsed() {
			return this.trafficUsed;
		}

		public void setTrafficUsed(Long trafficUsed) {
			this.trafficUsed = trafficUsed;
		}

		public Long getTrafficPackageTotal() {
			return this.trafficPackageTotal;
		}

		public void setTrafficPackageTotal(Long trafficPackageTotal) {
			this.trafficPackageTotal = trafficPackageTotal;
		}

		public Long getTrafficPackageRemaining() {
			return this.trafficPackageRemaining;
		}

		public void setTrafficPackageRemaining(Long trafficPackageRemaining) {
			this.trafficPackageRemaining = trafficPackageRemaining;
		}

		public Long getTrafficOverflow() {
			return this.trafficOverflow;
		}

		public void setTrafficOverflow(Long trafficOverflow) {
			this.trafficOverflow = trafficOverflow;
		}
	}

	@Override
	public ListInstancesTrafficPackagesResponse getInstance(UnmarshallerContext context) {
		return	ListInstancesTrafficPackagesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
