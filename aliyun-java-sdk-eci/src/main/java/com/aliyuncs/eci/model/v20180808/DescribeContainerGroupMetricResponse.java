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

package com.aliyuncs.eci.model.v20180808;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.eci.transform.v20180808.DescribeContainerGroupMetricResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class DescribeContainerGroupMetricResponse extends AcsResponse {

	private String requestId;

	private String containerGroupId;

	private List<Record> records;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getContainerGroupId() {
		return this.containerGroupId;
	}

	public void setContainerGroupId(String containerGroupId) {
		this.containerGroupId = containerGroupId;
	}

	public List<Record> getRecords() {
		return this.records;
	}

	public void setRecords(List<Record> records) {
		this.records = records;
	}

	public static class Record {

		private String timestamp;

		private List<Container> containers;

		private CPU cPU;

		private Memory memory;

		private Network network;

		public String getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}

		public List<Container> getContainers() {
			return this.containers;
		}

		public void setContainers(List<Container> containers) {
			this.containers = containers;
		}

		public CPU getCPU() {
			return this.cPU;
		}

		public void setCPU(CPU cPU) {
			this.cPU = cPU;
		}

		public Memory getMemory() {
			return this.memory;
		}

		public void setMemory(Memory memory) {
			this.memory = memory;
		}

		public Network getNetwork() {
			return this.network;
		}

		public void setNetwork(Network network) {
			this.network = network;
		}

		public static class Container {

			private String name;

			private CPU1 cPU1;

			private Memory2 memory2;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public CPU1 getCPU1() {
				return this.cPU1;
			}

			public void setCPU1(CPU1 cPU1) {
				this.cPU1 = cPU1;
			}

			public Memory2 getMemory2() {
				return this.memory2;
			}

			public void setMemory2(Memory2 memory2) {
				this.memory2 = memory2;
			}

			public static class CPU1 {

				private Long usageNanoCores;

				private Long usageCoreNanoSeconds;

				private Long load;

				private Long limit;

				public Long getUsageNanoCores() {
					return this.usageNanoCores;
				}

				public void setUsageNanoCores(Long usageNanoCores) {
					this.usageNanoCores = usageNanoCores;
				}

				public Long getUsageCoreNanoSeconds() {
					return this.usageCoreNanoSeconds;
				}

				public void setUsageCoreNanoSeconds(Long usageCoreNanoSeconds) {
					this.usageCoreNanoSeconds = usageCoreNanoSeconds;
				}

				public Long getLoad() {
					return this.load;
				}

				public void setLoad(Long load) {
					this.load = load;
				}

				public Long getLimit() {
					return this.limit;
				}

				public void setLimit(Long limit) {
					this.limit = limit;
				}
			}

			public static class Memory2 {

				private Long availableBytes;

				private Long usageBytes;

				private Long cache;

				private Long workingSet;

				private Long rss;

				public Long getAvailableBytes() {
					return this.availableBytes;
				}

				public void setAvailableBytes(Long availableBytes) {
					this.availableBytes = availableBytes;
				}

				public Long getUsageBytes() {
					return this.usageBytes;
				}

				public void setUsageBytes(Long usageBytes) {
					this.usageBytes = usageBytes;
				}

				public Long getCache() {
					return this.cache;
				}

				public void setCache(Long cache) {
					this.cache = cache;
				}

				public Long getWorkingSet() {
					return this.workingSet;
				}

				public void setWorkingSet(Long workingSet) {
					this.workingSet = workingSet;
				}

				public Long getRss() {
					return this.rss;
				}

				public void setRss(Long rss) {
					this.rss = rss;
				}
			}
		}

		public static class CPU {

			private Long usageNanoCores;

			private Long usageCoreNanoSeconds;

			private Long load;

			private Long limit;

			public Long getUsageNanoCores() {
				return this.usageNanoCores;
			}

			public void setUsageNanoCores(Long usageNanoCores) {
				this.usageNanoCores = usageNanoCores;
			}

			public Long getUsageCoreNanoSeconds() {
				return this.usageCoreNanoSeconds;
			}

			public void setUsageCoreNanoSeconds(Long usageCoreNanoSeconds) {
				this.usageCoreNanoSeconds = usageCoreNanoSeconds;
			}

			public Long getLoad() {
				return this.load;
			}

			public void setLoad(Long load) {
				this.load = load;
			}

			public Long getLimit() {
				return this.limit;
			}

			public void setLimit(Long limit) {
				this.limit = limit;
			}
		}

		public static class Memory {

			private Long availableBytes;

			private Long usageBytes;

			private Long cache;

			private Long workingSet;

			private Long rss;

			public Long getAvailableBytes() {
				return this.availableBytes;
			}

			public void setAvailableBytes(Long availableBytes) {
				this.availableBytes = availableBytes;
			}

			public Long getUsageBytes() {
				return this.usageBytes;
			}

			public void setUsageBytes(Long usageBytes) {
				this.usageBytes = usageBytes;
			}

			public Long getCache() {
				return this.cache;
			}

			public void setCache(Long cache) {
				this.cache = cache;
			}

			public Long getWorkingSet() {
				return this.workingSet;
			}

			public void setWorkingSet(Long workingSet) {
				this.workingSet = workingSet;
			}

			public Long getRss() {
				return this.rss;
			}

			public void setRss(Long rss) {
				this.rss = rss;
			}
		}

		public static class Network {

			private List<_Interface> interfaces;

			public List<_Interface> getInterfaces() {
				return this.interfaces;
			}

			public void setInterfaces(List<_Interface> interfaces) {
				this.interfaces = interfaces;
			}

			public static class _Interface {

				private Long txBytes;

				private Long rxBytes;

				private Long txErrors;

				private Long rxErrors;

				private String name;

				public Long getTxBytes() {
					return this.txBytes;
				}

				public void setTxBytes(Long txBytes) {
					this.txBytes = txBytes;
				}

				public Long getRxBytes() {
					return this.rxBytes;
				}

				public void setRxBytes(Long rxBytes) {
					this.rxBytes = rxBytes;
				}

				public Long getTxErrors() {
					return this.txErrors;
				}

				public void setTxErrors(Long txErrors) {
					this.txErrors = txErrors;
				}

				public Long getRxErrors() {
					return this.rxErrors;
				}

				public void setRxErrors(Long rxErrors) {
					this.rxErrors = rxErrors;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}
		}
	}

	@Override
	public DescribeContainerGroupMetricResponse getInstance(UnmarshallerContext context) {
		return	DescribeContainerGroupMetricResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
