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

package com.aliyuncs.alidns.model.v20150109;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribeGtmRecoveryPlanAvailableConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGtmRecoveryPlanAvailableConfigResponse extends AcsResponse {

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

		private String instanceId;

		private String instanceName;

		private List<AddrPool> addrPools;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public List<AddrPool> getAddrPools() {
			return this.addrPools;
		}

		public void setAddrPools(List<AddrPool> addrPools) {
			this.addrPools = addrPools;
		}

		public static class AddrPool {

			private String addrPoolId;

			private String name;

			public String getAddrPoolId() {
				return this.addrPoolId;
			}

			public void setAddrPoolId(String addrPoolId) {
				this.addrPoolId = addrPoolId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public DescribeGtmRecoveryPlanAvailableConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeGtmRecoveryPlanAvailableConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
