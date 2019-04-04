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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.foas.transform.v20181111.GetClusterQueueInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetClusterQueueInfoResponse extends AcsResponse {

	private String requestId;

	private List<Queue> queues;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Queue> getQueues() {
		return this.queues;
	}

	public void setQueues(List<Queue> queues) {
		this.queues = queues;
	}

	public static class Queue {

		private String clusterId;

		private String queueName;

		private Integer minGpu;

		private Integer maxGpu;

		private Integer minMem;

		private Integer usedVCore;

		private Integer usedGpu;

		private Integer usedMem;

		private Integer minVCore;

		private Integer maxVCore;

		private Integer maxMem;

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getQueueName() {
			return this.queueName;
		}

		public void setQueueName(String queueName) {
			this.queueName = queueName;
		}

		public Integer getMinGpu() {
			return this.minGpu;
		}

		public void setMinGpu(Integer minGpu) {
			this.minGpu = minGpu;
		}

		public Integer getMaxGpu() {
			return this.maxGpu;
		}

		public void setMaxGpu(Integer maxGpu) {
			this.maxGpu = maxGpu;
		}

		public Integer getMinMem() {
			return this.minMem;
		}

		public void setMinMem(Integer minMem) {
			this.minMem = minMem;
		}

		public Integer getUsedVCore() {
			return this.usedVCore;
		}

		public void setUsedVCore(Integer usedVCore) {
			this.usedVCore = usedVCore;
		}

		public Integer getUsedGpu() {
			return this.usedGpu;
		}

		public void setUsedGpu(Integer usedGpu) {
			this.usedGpu = usedGpu;
		}

		public Integer getUsedMem() {
			return this.usedMem;
		}

		public void setUsedMem(Integer usedMem) {
			this.usedMem = usedMem;
		}

		public Integer getMinVCore() {
			return this.minVCore;
		}

		public void setMinVCore(Integer minVCore) {
			this.minVCore = minVCore;
		}

		public Integer getMaxVCore() {
			return this.maxVCore;
		}

		public void setMaxVCore(Integer maxVCore) {
			this.maxVCore = maxVCore;
		}

		public Integer getMaxMem() {
			return this.maxMem;
		}

		public void setMaxMem(Integer maxMem) {
			this.maxMem = maxMem;
		}
	}

	@Override
	public GetClusterQueueInfoResponse getInstance(UnmarshallerContext context) {
		return	GetClusterQueueInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
