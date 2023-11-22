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

package com.aliyuncs.hitsdb.model.v20200615;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hitsdb.transform.v20200615.GetLdpsNamespacedQuotaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLdpsNamespacedQuotaResponse extends AcsResponse {

	private String requestId;

	private List<NamespacedQuota> namespacedQuotas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<NamespacedQuota> getNamespacedQuotas() {
		return this.namespacedQuotas;
	}

	public void setNamespacedQuotas(List<NamespacedQuota> namespacedQuotas) {
		this.namespacedQuotas = namespacedQuotas;
	}

	public static class NamespacedQuota {

		private String name;

		private String cpuAmount;

		private String memoryAmount;

		private String usedCpu;

		private String usedMemory;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCpuAmount() {
			return this.cpuAmount;
		}

		public void setCpuAmount(String cpuAmount) {
			this.cpuAmount = cpuAmount;
		}

		public String getMemoryAmount() {
			return this.memoryAmount;
		}

		public void setMemoryAmount(String memoryAmount) {
			this.memoryAmount = memoryAmount;
		}

		public String getUsedCpu() {
			return this.usedCpu;
		}

		public void setUsedCpu(String usedCpu) {
			this.usedCpu = usedCpu;
		}

		public String getUsedMemory() {
			return this.usedMemory;
		}

		public void setUsedMemory(String usedMemory) {
			this.usedMemory = usedMemory;
		}
	}

	@Override
	public GetLdpsNamespacedQuotaResponse getInstance(UnmarshallerContext context) {
		return	GetLdpsNamespacedQuotaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
