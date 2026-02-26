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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eci.transform.v20180808.DescribeMultiContainerGroupMetricResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author xiaohui
 * @version 1.3.4
 */
public class DescribeMultiContainerGroupMetricResponse extends AcsResponse {

	private String requestId;

	private List<MonitorData> monitorDatas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<MonitorData> getMonitorDatas() {
		return this.monitorDatas;
	}

	public void setMonitorDatas(List<MonitorData> monitorDatas) {
		this.monitorDatas = monitorDatas;
	}

	public static class MonitorData {

		private String containerGroupId;

		private List<Record> records;

		private List<ContainerInfo> containerInfos;

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

		public List<ContainerInfo> getContainerInfos() {
			return this.containerInfos;
		}

		public void setContainerInfos(List<ContainerInfo> containerInfos) {
			this.containerInfos = containerInfos;
		}

		public static class Record {

			private CPU cpu;

			private Memory memory;

			private Network network;

			private List<Container> containers;

			private List<Filesystem> filesystem;

			private List<Disk> disk;


			public CPU getCpu() {
				return this.cpu;
			}

			public void setCpu(CPU cpu) {
				this.cpu = cpu;
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

			public List<Container> getContainers() {
				return this.containers;
			}

			public void setContainers(List<Container> containers) {
				this.containers = containers;
			}

			public List<Filesystem> getFilesystem() {
				return this.filesystem;
			}

			public void setFilesystem(List<Filesystem> filesystem) {
				this.filesystem = filesystem;
			}

			public List<Disk> getDisk() {
				return this.disk;
			}

			public void setDisk(List<Disk> disk) {
				this.disk = disk;
			}

			public static class CPU {

				private Long usageNanoCores;

				private Long limit;

				private Long usageCoreNanoSeconds;

				private Long load;

				public Long getUsageNanoCores() {
					return this.usageNanoCores;
				}

				public void setUsageNanoCores(Long usageNanoCores) {
					this.usageNanoCores = usageNanoCores;
				}

				public Long getLimit() {
					return this.limit;
				}

				public void setLimit(Long limit) {
					this.limit = limit;
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
			}

			public static class Memory {

				private Long rss;

				private Long usageBytes;

				private Long workingSet;

				private Long actualAvailableBytes;

				private Long availableBytes;

				private Long cache;

				public Long getRss() {
					return this.rss;
				}

				public void setRss(Long rss) {
					this.rss = rss;
				}

				public Long getUsageBytes() {
					return this.usageBytes;
				}

				public void setUsageBytes(Long usageBytes) {
					this.usageBytes = usageBytes;
				}

				public Long getWorkingSet() {
					return this.workingSet;
				}

				public void setWorkingSet(Long workingSet) {
					this.workingSet = workingSet;
				}

				public Long getActualAvailableBytes() {
					return this.actualAvailableBytes;
				}

				public void setActualAvailableBytes(Long actualAvailableBytes) {
					this.actualAvailableBytes = actualAvailableBytes;
				}

				public Long getAvailableBytes() {
					return this.availableBytes;
				}

				public void setAvailableBytes(Long availableBytes) {
					this.availableBytes = availableBytes;
				}

				public Long getCache() {
					return this.cache;
				}

				public void setCache(Long cache) {
					this.cache = cache;
				}
			}

			public static class Network {

				private List<Interface> interfaces;

				public List<Interface> getInterfaces() {
					return this.interfaces;
				}

				public void setInterfaces(List<Interface> interfaces) {
					this.interfaces = interfaces;
				}

				public static class Interface {

					private Long rxErrors;

					private Long txDrops;

					private Long txBytes;

					private Long rxPackets;

					private Long txPackets;

					private String name;

					private Long txErrors;

					private Long rxBytes;

					private Long rxDrops;

					public Long getRxErrors() {
						return this.rxErrors;
					}
					public void setRxErrors(Long rxErrors) {
						this.rxErrors = rxErrors;
					}

					public Long getTxDrops() {
						return this.txDrops;
					}

					public void setTxDrops(Long txDrops) {
						this.txDrops = txDrops;
					}

					public Long getTxBytes() {
						return this.txBytes;
					}

					public void setTxBytes(Long txBytes) {
						this.txBytes = txBytes;
					}

					public Long getRxPackets() {
						return this.rxPackets;
					}

					public void setRxPackets(Long rxPackets) {
						this.rxPackets = rxPackets;
					}

					public Long getTxPackets() {
						return this.txPackets;
					}

					public void setTxPackets(Long txPackets) {
						this.txPackets = txPackets;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public Long getTxErrors() {
						return this.txErrors;
					}

					public void setTxErrors(Long txErrors) {
						this.txErrors = txErrors;
					}

					public Long getRxBytes() {
						return this.rxBytes;
					}

					public void setRxBytes(Long rxBytes) {
						this.rxBytes = rxBytes;
					}

					public Long getRxDrops() {
						return this.rxDrops;
					}

					public void setRxDrops(Long rxDrops) {
						this.rxDrops = rxDrops;
					}
				}
			}

			public static class Container {

				private String name;

				private CPU cpu;

				private Memory memory;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public CPU getCpu() {
					return this.cpu;
				}

				public void setCpu(CPU cpu) {
					this.cpu = cpu;
				}

				public Memory getMemory() {
					return this.memory;
				}

				public void setMemory(Memory memory) {
					this.memory = memory;
				}
			}

			public static class Filesystem {

				private Long capacity;

				private Long available;

				private String fsName;

				private Long usage;

				public Long getCapacity() {
					return this.capacity;
				}

				public void setCapacity(Long capacity) {
					this.capacity = capacity;
				}

				public Long getAvailable() {
					return this.available;
				}

				public void setAvailable(Long available) {
					this.available = available;
				}

				public String getFsName() {
					return this.fsName;
				}

				public void setFsName(String fsName) {
					this.fsName = fsName;
				}

				public Long getUsage() {
					return this.usage;
				}

				public void setUsage(Long usage) {
					this.usage = usage;
				}
			}

			public static class Disk {

				private Long writeBytes;

				private String device;

				private Long writeIo;

				private Long readBytes;

				private Long readIo;

				public Long getWriteBytes() {
					return this.writeBytes;
				}

				public void setWriteBytes(Long writeBytes) {
					this.writeBytes = writeBytes;
				}

				public String getDevice() {
					return this.device;
				}

				public void setDevice(String device) {
					this.device = device;
				}

				public Long getWriteIo() {
					return this.writeIo;
				}

				public void setWriteIo(Long writeIo) {
					this.writeIo = writeIo;
				}

				public Long getReadBytes() {
					return this.readBytes;
				}

				public void setReadBytes(Long readBytes) {
					this.readBytes = readBytes;
				}

				public Long getReadIo() {
					return this.readIo;
				}

				public void setReadIo(Long readIo) {
					this.readIo = readIo;
				}
			}
		}

		public static class ContainerInfo {

			private String labels;

			private String namespace;

			private String name;

			private String id;

			private List<ContainerStat> containerStats;

			private List<String> aliases;

			private ContainerSpec containerSpec;

			public String getLabels() {
				return this.labels;
			}

			public void setLabels(String labels) {
				this.labels = labels;
			}

			public String getNamespace() {
				return this.namespace;
			}

			public void setNamespace(String namespace) {
				this.namespace = namespace;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public List<ContainerStat> getContainerStats() {
				return this.containerStats;
			}

			public void setContainerStats(List<ContainerStat> containerStats) {
				this.containerStats = containerStats;
			}

			public List<String> getAliases() {
				return this.aliases;
			}

			public void setAliases(List<String> aliases) {
				this.aliases = aliases;
			}

			public ContainerSpec getContainerSpec() {
				return this.containerSpec;
			}

			public void setContainerSpec(ContainerSpec containerSpec) {
				this.containerSpec = containerSpec;
			}

			public static class ContainerStat {

				private String timestamp;

				private List<FsStat> fsStats;

				private List<AcceleratorStat> acceleratorStats;

				private NetworkStats networkStats;

				private CpuStats cpuStats;

				private MemoryStats memoryStats;

				private TaskStats taskStats;

				private DiskIoStats diskIoStats;

				public String getTimestamp() {
					return this.timestamp;
				}

				public void setTimestamp(String timestamp) {
					this.timestamp = timestamp;
				}

				public List<FsStat> getFsStats() {
					return this.fsStats;
				}

				public void setFsStats(List<FsStat> fsStats) {
					this.fsStats = fsStats;
				}

				public List<AcceleratorStat> getAcceleratorStats() {
					return this.acceleratorStats;
				}

				public void setAcceleratorStats(List<AcceleratorStat> acceleratorStats) {
					this.acceleratorStats = acceleratorStats;
				}

				public NetworkStats getNetworkStats() {
					return this.networkStats;
				}

				public void setNetworkStats(NetworkStats networkStats) {
					this.networkStats = networkStats;
				}

				public CpuStats getCpuStats() {
					return this.cpuStats;
				}

				public void setCpuStats(CpuStats cpuStats) {
					this.cpuStats = cpuStats;
				}

				public MemoryStats getMemoryStats() {
					return this.memoryStats;
				}

				public void setMemoryStats(MemoryStats memoryStats) {
					this.memoryStats = memoryStats;
				}

				public TaskStats getTaskStats() {
					return this.taskStats;
				}

				public void setTaskStats(TaskStats taskStats) {
					this.taskStats = taskStats;
				}

				public DiskIoStats getDiskIoStats() {
					return this.diskIoStats;
				}

				public void setDiskIoStats(DiskIoStats diskIoStats) {
					this.diskIoStats = diskIoStats;
				}

				public static class FsStat {

					private String type;

					private Long readsMerged;

					private Boolean hasInodes;

					private Long readsCompleted;

					private Long writesMerged;

					private Long inodesFree;

					private Long available;

					private Long usage;

					private Long inodes;

					private Long baseUsage;

					private Long sectorsRead;

					private Long writeTime;

					private Long sectorsWritten;

					private Long readTime;

					private Long limit;

					private String device;

					private Long writesCompleted;

					private Long ioTime;

					private Long weightedIoTime;

					private Long ioInProgress;

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public Long getReadsMerged() {
						return this.readsMerged;
					}

					public void setReadsMerged(Long readsMerged) {
						this.readsMerged = readsMerged;
					}

					public Boolean getHasInodes() {
						return this.hasInodes;
					}

					public void setHasInodes(Boolean hasInodes) {
						this.hasInodes = hasInodes;
					}

					public Long getReadsCompleted() {
						return this.readsCompleted;
					}

					public void setReadsCompleted(Long readsCompleted) {
						this.readsCompleted = readsCompleted;
					}

					public Long getWritesMerged() {
						return this.writesMerged;
					}

					public void setWritesMerged(Long writesMerged) {
						this.writesMerged = writesMerged;
					}

					public Long getInodesFree() {
						return this.inodesFree;
					}

					public void setInodesFree(Long inodesFree) {
						this.inodesFree = inodesFree;
					}

					public Long getAvailable() {
						return this.available;
					}

					public void setAvailable(Long available) {
						this.available = available;
					}

					public Long getUsage() {
						return this.usage;
					}

					public void setUsage(Long usage) {
						this.usage = usage;
					}

					public Long getInodes() {
						return this.inodes;
					}

					public void setInodes(Long inodes) {
						this.inodes = inodes;
					}

					public Long getBaseUsage() {
						return this.baseUsage;
					}

					public void setBaseUsage(Long baseUsage) {
						this.baseUsage = baseUsage;
					}

					public Long getSectorsRead() {
						return this.sectorsRead;
					}

					public void setSectorsRead(Long sectorsRead) {
						this.sectorsRead = sectorsRead;
					}

					public Long getWriteTime() {
						return this.writeTime;
					}

					public void setWriteTime(Long writeTime) {
						this.writeTime = writeTime;
					}

					public Long getSectorsWritten() {
						return this.sectorsWritten;
					}

					public void setSectorsWritten(Long sectorsWritten) {
						this.sectorsWritten = sectorsWritten;
					}

					public Long getReadTime() {
						return this.readTime;
					}

					public void setReadTime(Long readTime) {
						this.readTime = readTime;
					}

					public Long getLimit() {
						return this.limit;
					}

					public void setLimit(Long limit) {
						this.limit = limit;
					}

					public String getDevice() {
						return this.device;
					}

					public void setDevice(String device) {
						this.device = device;
					}

					public Long getWritesCompleted() {
						return this.writesCompleted;
					}

					public void setWritesCompleted(Long writesCompleted) {
						this.writesCompleted = writesCompleted;
					}

					public Long getIoTime() {
						return this.ioTime;
					}

					public void setIoTime(Long ioTime) {
						this.ioTime = ioTime;
					}

					public Long getWeightedIoTime() {
						return this.weightedIoTime;
					}

					public void setWeightedIoTime(Long weightedIoTime) {
						this.weightedIoTime = weightedIoTime;
					}

					public Long getIoInProgress() {
						return this.ioInProgress;
					}

					public void setIoInProgress(Long ioInProgress) {
						this.ioInProgress = ioInProgress;
					}
				}

				public static class AcceleratorStat {

					private String model;

					private Long minor;

					private Long temperature;

					private Long powerUsage;

					private Long memoryTotal;

					private String make;

					private Long dutyCycle;

					private Long memoryUsed;

					private String id;

					public String getModel() {
						return this.model;
					}

					public void setModel(String model) {
						this.model = model;
					}

					public Long getMinor() {
						return this.minor;
					}

					public void setMinor(Long minor) {
						this.minor = minor;
					}

					public Long getTemperature() {
						return this.temperature;
					}

					public void setTemperature(Long temperature) {
						this.temperature = temperature;
					}

					public Long getPowerUsage() {
						return this.powerUsage;
					}

					public void setPowerUsage(Long powerUsage) {
						this.powerUsage = powerUsage;
					}

					public Long getMemoryTotal() {
						return this.memoryTotal;
					}

					public void setMemoryTotal(Long memoryTotal) {
						this.memoryTotal = memoryTotal;
					}

					public String getMake() {
						return this.make;
					}

					public void setMake(String make) {
						this.make = make;
					}

					public Long getDutyCycle() {
						return this.dutyCycle;
					}

					public void setDutyCycle(Long dutyCycle) {
						this.dutyCycle = dutyCycle;
					}

					public Long getMemoryUsed() {
						return this.memoryUsed;
					}

					public void setMemoryUsed(Long memoryUsed) {
						this.memoryUsed = memoryUsed;
					}

					public String getId() {
						return this.id;
					}

					public void setId(String id) {
						this.id = id;
					}
				}

				public static class NetworkStats {

					private Long rxDropped;

					private Long txErrors;

					private Long rxErrors;

					private Long txDropped;

					private Long txBytes;

					private Long rxPackets;

					private String name;

					private Long rxBytes;

					private Long txPackets;

					private List<InterfaceStat> interfaceStats;

					private Tcp tcp;

					private Tcp6 tcp6;

					private Udp udp;

					private Udp6 udp6;

					public Long getRxDropped() {
						return this.rxDropped;
					}

					public void setRxDropped(Long rxDropped) {
						this.rxDropped = rxDropped;
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

					public Long getTxDropped() {
						return this.txDropped;
					}

					public void setTxDropped(Long txDropped) {
						this.txDropped = txDropped;
					}

					public Long getTxBytes() {
						return this.txBytes;
					}

					public void setTxBytes(Long txBytes) {
						this.txBytes = txBytes;
					}

					public Long getRxPackets() {
						return this.rxPackets;
					}

					public void setRxPackets(Long rxPackets) {
						this.rxPackets = rxPackets;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public Long getRxBytes() {
						return this.rxBytes;
					}

					public void setRxBytes(Long rxBytes) {
						this.rxBytes = rxBytes;
					}

					public Long getTxPackets() {
						return this.txPackets;
					}

					public void setTxPackets(Long txPackets) {
						this.txPackets = txPackets;
					}

					public List<InterfaceStat> getInterfaceStats() {
						return this.interfaceStats;
					}

					public void setInterfaceStats(List<InterfaceStat> interfaceStats) {
						this.interfaceStats = interfaceStats;
					}

					public Tcp getTcp() {
						return this.tcp;
					}

					public void setTcp(Tcp tcp) {
						this.tcp = tcp;
					}

					public Tcp6 getTcp6() {
						return this.tcp6;
					}

					public void setTcp6(Tcp6 tcp6) {
						this.tcp6 = tcp6;
					}

					public Udp getUdp() {
						return this.udp;
					}

					public void setUdp(Udp udp) {
						this.udp = udp;
					}

					public Udp6 getUdp6() {
						return this.udp6;
					}

					public void setUdp6(Udp6 udp6) {
						this.udp6 = udp6;
					}

					public static class InterfaceStat {

						private Long rxErrors;

						private Long rxDropped;

						private Long txDropped;

						private Long txBytes;

						private Long rxPackets;

						private Long txErrors;

						private Long txPackets;

						private Long rxBytes;

						private String name;

						public Long getRxErrors() {
							return this.rxErrors;
						}

						public void setRxErrors(Long rxErrors) {
							this.rxErrors = rxErrors;
						}

						public Long getRxDropped() {
							return this.rxDropped;
						}

						public void setRxDropped(Long rxDropped) {
							this.rxDropped = rxDropped;
						}

						public Long getTxDropped() {
							return this.txDropped;
						}

						public void setTxDropped(Long txDropped) {
							this.txDropped = txDropped;
						}

						public Long getTxBytes() {
							return this.txBytes;
						}

						public void setTxBytes(Long txBytes) {
							this.txBytes = txBytes;
						}

						public Long getRxPackets() {
							return this.rxPackets;
						}

						public void setRxPackets(Long rxPackets) {
							this.rxPackets = rxPackets;
						}

						public Long getTxErrors() {
							return this.txErrors;
						}

						public void setTxErrors(Long txErrors) {
							this.txErrors = txErrors;
						}

						public Long getTxPackets() {
							return this.txPackets;
						}

						public void setTxPackets(Long txPackets) {
							this.txPackets = txPackets;
						}

						public Long getRxBytes() {
							return this.rxBytes;
						}

						public void setRxBytes(Long rxBytes) {
							this.rxBytes = rxBytes;
						}

						public String getName() {
							return this.name;
						}

						public void setName(String name) {
							this.name = name;
						}
					}

					public static class Tcp {

						private Long closeWait;

						private Long finWait2;

						private Long lastAck;

						private Long closing;

						private Long listen;

						private Long timeWait;

						private Long established;

						private Long finWait1;

						private Long close;

						private Long synRecv;

						private Long synSent;

						public Long getCloseWait() {
							return this.closeWait;
						}

						public void setCloseWait(Long closeWait) {
							this.closeWait = closeWait;
						}

						public Long getFinWait2() {
							return this.finWait2;
						}

						public void setFinWait2(Long finWait2) {
							this.finWait2 = finWait2;
						}

						public Long getLastAck() {
							return this.lastAck;
						}

						public void setLastAck(Long lastAck) {
							this.lastAck = lastAck;
						}

						public Long getClosing() {
							return this.closing;
						}

						public void setClosing(Long closing) {
							this.closing = closing;
						}

						public Long getListen() {
							return this.listen;
						}

						public void setListen(Long listen) {
							this.listen = listen;
						}

						public Long getTimeWait() {
							return this.timeWait;
						}

						public void setTimeWait(Long timeWait) {
							this.timeWait = timeWait;
						}

						public Long getEstablished() {
							return this.established;
						}

						public void setEstablished(Long established) {
							this.established = established;
						}

						public Long getFinWait1() {
							return this.finWait1;
						}

						public void setFinWait1(Long finWait1) {
							this.finWait1 = finWait1;
						}

						public Long getClose() {
							return this.close;
						}

						public void setClose(Long close) {
							this.close = close;
						}

						public Long getSynRecv() {
							return this.synRecv;
						}

						public void setSynRecv(Long synRecv) {
							this.synRecv = synRecv;
						}

						public Long getSynSent() {
							return this.synSent;
						}

						public void setSynSent(Long synSent) {
							this.synSent = synSent;
						}
					}

					public static class Tcp6 {

						private Long closeWait;

						private Long finWait2;

						private Long lastAck;

						private Long closing;

						private Long listen;

						private Long timeWait;

						private Long established;

						private Long finWait1;

						private Long close;

						private Long synRecv;

						private Long synSent;

						public Long getCloseWait() {
							return this.closeWait;
						}

						public void setCloseWait(Long closeWait) {
							this.closeWait = closeWait;
						}

						public Long getFinWait2() {
							return this.finWait2;
						}

						public void setFinWait2(Long finWait2) {
							this.finWait2 = finWait2;
						}

						public Long getLastAck() {
							return this.lastAck;
						}

						public void setLastAck(Long lastAck) {
							this.lastAck = lastAck;
						}

						public Long getClosing() {
							return this.closing;
						}

						public void setClosing(Long closing) {
							this.closing = closing;
						}

						public Long getListen() {
							return this.listen;
						}

						public void setListen(Long listen) {
							this.listen = listen;
						}

						public Long getTimeWait() {
							return this.timeWait;
						}

						public void setTimeWait(Long timeWait) {
							this.timeWait = timeWait;
						}

						public Long getEstablished() {
							return this.established;
						}

						public void setEstablished(Long established) {
							this.established = established;
						}

						public Long getFinWait1() {
							return this.finWait1;
						}

						public void setFinWait1(Long finWait1) {
							this.finWait1 = finWait1;
						}

						public Long getClose() {
							return this.close;
						}

						public void setClose(Long close) {
							this.close = close;
						}

						public Long getSynRecv() {
							return this.synRecv;
						}

						public void setSynRecv(Long synRecv) {
							this.synRecv = synRecv;
						}

						public Long getSynSent() {
							return this.synSent;
						}

						public void setSynSent(Long synSent) {
							this.synSent = synSent;
						}
					}

					public static class Udp {

						private Long txQueued;

						private Long listen;

						private Long dropped;

						private Long rxQueued;

						public Long getTxQueued() {
							return this.txQueued;
						}

						public void setTxQueued(Long txQueued) {
							this.txQueued = txQueued;
						}

						public Long getListen() {
							return this.listen;
						}

						public void setListen(Long listen) {
							this.listen = listen;
						}

						public Long getDropped() {
							return this.dropped;
						}

						public void setDropped(Long dropped) {
							this.dropped = dropped;
						}

						public Long getRxQueued() {
							return this.rxQueued;
						}

						public void setRxQueued(Long rxQueued) {
							this.rxQueued = rxQueued;
						}
					}

					public static class Udp6 {

						private Long txQueued;

						private Long listen;

						private Long dropped;

						private Long rxQueued;

						public Long getTxQueued() {
							return this.txQueued;
						}

						public void setTxQueued(Long txQueued) {
							this.txQueued = txQueued;
						}

						public Long getListen() {
							return this.listen;
						}

						public void setListen(Long listen) {
							this.listen = listen;
						}

						public Long getDropped() {
							return this.dropped;
						}

						public void setDropped(Long dropped) {
							this.dropped = dropped;
						}

						public Long getRxQueued() {
							return this.rxQueued;
						}

						public void setRxQueued(Long rxQueued) {
							this.rxQueued = rxQueued;
						}
					}
				}

				public static class CpuStats {

					private Long loadAverage;

					private CpuUsage cpuUsage;

					private CpuCFS cpuCFS;

					public Long getLoadAverage() {
						return this.loadAverage;
					}

					public void setLoadAverage(Long loadAverage) {
						this.loadAverage = loadAverage;
					}

					public CpuUsage getCpuUsage() {
						return this.cpuUsage;
					}

					public void setCpuUsage(CpuUsage cpuUsage) {
						this.cpuUsage = cpuUsage;
					}

					public CpuCFS getCpuCFS() {
						return this.cpuCFS;
					}

					public void setCpuCFS(CpuCFS cpuCFS) {
						this.cpuCFS = cpuCFS;
					}

					public static class CpuUsage {

						private Long user;

						private Long total;

						private Long system;

						private List<Long> perCpuUsages;

						public Long getUser() {
							return this.user;
						}

						public void setUser(Long user) {
							this.user = user;
						}

						public Long getTotal() {
							return this.total;
						}

						public void setTotal(Long total) {
							this.total = total;
						}

						public Long getSystem() {
							return this.system;
						}

						public void setSystem(Long system) {
							this.system = system;
						}

						public List<Long> getPerCpuUsages() {
							return this.perCpuUsages;
						}

						public void setPerCpuUsages(List<Long> perCpuUsages) {
							this.perCpuUsages = perCpuUsages;
						}
					}

					public static class CpuCFS {

						private Long throttledTime;

						private Long periods;

						private Long throttledPeriods;

						public Long getThrottledTime() {
							return this.throttledTime;
						}

						public void setThrottledTime(Long throttledTime) {
							this.throttledTime = throttledTime;
						}

						public Long getPeriods() {
							return this.periods;
						}

						public void setPeriods(Long periods) {
							this.periods = periods;
						}

						public Long getThrottledPeriods() {
							return this.throttledPeriods;
						}

						public void setThrottledPeriods(Long throttledPeriods) {
							this.throttledPeriods = throttledPeriods;
						}
					}
				}

				public static class MemoryStats {

					private Long failCnt;

					private Long maxUsage;

					private Long rss;

					private Long workingSet;

					private Long swap;

					private Long cache;

					private Long usage;

					private HierarchicalData hierarchicalData;

					private ContainerData containerData;

					public Long getFailCnt() {
						return this.failCnt;
					}

					public void setFailCnt(Long failCnt) {
						this.failCnt = failCnt;
					}

					public Long getMaxUsage() {
						return this.maxUsage;
					}

					public void setMaxUsage(Long maxUsage) {
						this.maxUsage = maxUsage;
					}

					public Long getRss() {
						return this.rss;
					}

					public void setRss(Long rss) {
						this.rss = rss;
					}

					public Long getWorkingSet() {
						return this.workingSet;
					}

					public void setWorkingSet(Long workingSet) {
						this.workingSet = workingSet;
					}

					public Long getSwap() {
						return this.swap;
					}

					public void setSwap(Long swap) {
						this.swap = swap;
					}

					public Long getCache() {
						return this.cache;
					}

					public void setCache(Long cache) {
						this.cache = cache;
					}

					public Long getUsage() {
						return this.usage;
					}

					public void setUsage(Long usage) {
						this.usage = usage;
					}

					public HierarchicalData getHierarchicalData() {
						return this.hierarchicalData;
					}

					public void setHierarchicalData(HierarchicalData hierarchicalData) {
						this.hierarchicalData = hierarchicalData;
					}

					public ContainerData getContainerData() {
						return this.containerData;
					}

					public void setContainerData(ContainerData containerData) {
						this.containerData = containerData;
					}

					public static class HierarchicalData {

						private Long pgmajFault;

						private Long pgFault;

						public Long getPgmajFault() {
							return this.pgmajFault;
						}

						public void setPgmajFault(Long pgmajFault) {
							this.pgmajFault = pgmajFault;
						}

						public Long getPgFault() {
							return this.pgFault;
						}

						public void setPgFault(Long pgFault) {
							this.pgFault = pgFault;
						}
					}

					public static class ContainerData {

						private Long pgmajFault;

						private Long pgFault;

						public Long getPgmajFault() {
							return this.pgmajFault;
						}

						public void setPgmajFault(Long pgmajFault) {
							this.pgmajFault = pgmajFault;
						}

						public Long getPgFault() {
							return this.pgFault;
						}

						public void setPgFault(Long pgFault) {
							this.pgFault = pgFault;
						}
					}
				}

				public static class TaskStats {

					private Long nrUninterruptible;

					private Long nrRunning;

					private Long nrSleeping;

					private Long nrIoWait;

					private Long nrStopped;

					public Long getNrUninterruptible() {
						return this.nrUninterruptible;
					}

					public void setNrUninterruptible(Long nrUninterruptible) {
						this.nrUninterruptible = nrUninterruptible;
					}

					public Long getNrRunning() {
						return this.nrRunning;
					}

					public void setNrRunning(Long nrRunning) {
						this.nrRunning = nrRunning;
					}

					public Long getNrSleeping() {
						return this.nrSleeping;
					}

					public void setNrSleeping(Long nrSleeping) {
						this.nrSleeping = nrSleeping;
					}

					public Long getNrIoWait() {
						return this.nrIoWait;
					}

					public void setNrIoWait(Long nrIoWait) {
						this.nrIoWait = nrIoWait;
					}

					public Long getNrStopped() {
						return this.nrStopped;
					}

					public void setNrStopped(Long nrStopped) {
						this.nrStopped = nrStopped;
					}
				}

				public static class DiskIoStats {

					private List<IoServicedItem> ioServiced;

					private List<IoServiceTimeItem> ioServiceTime;

					private List<IoServiceByte> ioServiceBytes;

					private List<IoMergedItem> ioMerged;

					private List<Sector> sectors;

					private List<IoQueuedItem> ioQueued;

					private List<IoTimeItem> ioTime;

					private List<IoWaitTimeItem> ioWaitTime;

					public List<IoServicedItem> getIoServiced() {
						return this.ioServiced;
					}

					public void setIoServiced(List<IoServicedItem> ioServiced) {
						this.ioServiced = ioServiced;
					}

					public List<IoServiceTimeItem> getIoServiceTime() {
						return this.ioServiceTime;
					}

					public void setIoServiceTime(List<IoServiceTimeItem> ioServiceTime) {
						this.ioServiceTime = ioServiceTime;
					}

					public List<IoServiceByte> getIoServiceBytes() {
						return this.ioServiceBytes;
					}

					public void setIoServiceBytes(List<IoServiceByte> ioServiceBytes) {
						this.ioServiceBytes = ioServiceBytes;
					}

					public List<IoMergedItem> getIoMerged() {
						return this.ioMerged;
					}

					public void setIoMerged(List<IoMergedItem> ioMerged) {
						this.ioMerged = ioMerged;
					}

					public List<Sector> getSectors() {
						return this.sectors;
					}

					public void setSectors(List<Sector> sectors) {
						this.sectors = sectors;
					}

					public List<IoQueuedItem> getIoQueued() {
						return this.ioQueued;
					}

					public void setIoQueued(List<IoQueuedItem> ioQueued) {
						this.ioQueued = ioQueued;
					}

					public List<IoTimeItem> getIoTime() {
						return this.ioTime;
					}

					public void setIoTime(List<IoTimeItem> ioTime) {
						this.ioTime = ioTime;
					}

					public List<IoWaitTimeItem> getIoWaitTime() {
						return this.ioWaitTime;
					}

					public void setIoWaitTime(List<IoWaitTimeItem> ioWaitTime) {
						this.ioWaitTime = ioWaitTime;
					}

					public static class IoServicedItem {

						private String stats;

						private Long minor;

						private Long major;

						private String device;

						public String getStats() {
							return this.stats;
						}

						public void setStats(String stats) {
							this.stats = stats;
						}

						public Long getMinor() {
							return this.minor;
						}

						public void setMinor(Long minor) {
							this.minor = minor;
						}

						public Long getMajor() {
							return this.major;
						}

						public void setMajor(Long major) {
							this.major = major;
						}

						public String getDevice() {
							return this.device;
						}

						public void setDevice(String device) {
							this.device = device;
						}
					}

					public static class IoServiceTimeItem {

						private String stats;

						private Long minor;

						private Long major;

						private String device;

						public String getStats() {
							return this.stats;
						}

						public void setStats(String stats) {
							this.stats = stats;
						}

						public Long getMinor() {
							return this.minor;
						}

						public void setMinor(Long minor) {
							this.minor = minor;
						}

						public Long getMajor() {
							return this.major;
						}

						public void setMajor(Long major) {
							this.major = major;
						}

						public String getDevice() {
							return this.device;
						}

						public void setDevice(String device) {
							this.device = device;
						}
					}

					public static class IoServiceByte {

						private String stats;

						private Long minor;

						private Long major;

						private String device;

						public String getStats() {
							return this.stats;
						}

						public void setStats(String stats) {
							this.stats = stats;
						}

						public Long getMinor() {
							return this.minor;
						}

						public void setMinor(Long minor) {
							this.minor = minor;
						}

						public Long getMajor() {
							return this.major;
						}

						public void setMajor(Long major) {
							this.major = major;
						}

						public String getDevice() {
							return this.device;
						}

						public void setDevice(String device) {
							this.device = device;
						}
					}

					public static class IoMergedItem {

						private String stats;

						private Long minor;

						private Long major;

						private String device;

						public String getStats() {
							return this.stats;
						}

						public void setStats(String stats) {
							this.stats = stats;
						}

						public Long getMinor() {
							return this.minor;
						}

						public void setMinor(Long minor) {
							this.minor = minor;
						}

						public Long getMajor() {
							return this.major;
						}

						public void setMajor(Long major) {
							this.major = major;
						}

						public String getDevice() {
							return this.device;
						}

						public void setDevice(String device) {
							this.device = device;
						}
					}

					public static class Sector {

						private String stats;

						private Long minor;

						private Long major;

						private String device;

						public String getStats() {
							return this.stats;
						}

						public void setStats(String stats) {
							this.stats = stats;
						}

						public Long getMinor() {
							return this.minor;
						}

						public void setMinor(Long minor) {
							this.minor = minor;
						}

						public Long getMajor() {
							return this.major;
						}

						public void setMajor(Long major) {
							this.major = major;
						}

						public String getDevice() {
							return this.device;
						}

						public void setDevice(String device) {
							this.device = device;
						}
					}

					public static class IoQueuedItem {

						private String stats;

						private Long minor;

						private Long major;

						private String device;

						public String getStats() {
							return this.stats;
						}

						public void setStats(String stats) {
							this.stats = stats;
						}

						public Long getMinor() {
							return this.minor;
						}

						public void setMinor(Long minor) {
							this.minor = minor;
						}

						public Long getMajor() {
							return this.major;
						}

						public void setMajor(Long major) {
							this.major = major;
						}

						public String getDevice() {
							return this.device;
						}

						public void setDevice(String device) {
							this.device = device;
						}
					}

					public static class IoTimeItem {

						private String stats;

						private Long minor;

						private Long major;

						private String device;

						public String getStats() {
							return this.stats;
						}

						public void setStats(String stats) {
							this.stats = stats;
						}

						public Long getMinor() {
							return this.minor;
						}

						public void setMinor(Long minor) {
							this.minor = minor;
						}

						public Long getMajor() {
							return this.major;
						}

						public void setMajor(Long major) {
							this.major = major;
						}

						public String getDevice() {
							return this.device;
						}

						public void setDevice(String device) {
							this.device = device;
						}
					}

					public static class IoWaitTimeItem {

						private String stats;

						private Long minor;

						private Long major;

						private String device;

						public String getStats() {
							return this.stats;
						}

						public void setStats(String stats) {
							this.stats = stats;
						}

						public Long getMinor() {
							return this.minor;
						}

						public void setMinor(Long minor) {
							this.minor = minor;
						}

						public Long getMajor() {
							return this.major;
						}

						public void setMajor(Long major) {
							this.major = major;
						}

						public String getDevice() {
							return this.device;
						}

						public void setDevice(String device) {
							this.device = device;
						}
					}
				}
			}

			public static class ContainerSpec {

				private String creationTime;

				private String image;

				private String labels;

				private Boolean hasCustomMetrics;

				private Boolean hasCpu;

				private String envs;

				private Boolean hasDiskIo;

				private Boolean hasFilesystem;

				private Boolean hasNetwork;

				private Boolean hasMemory;

				private ContainerMemory containerMemory;

				private ContainerCpu containerCpu;

				public String getCreationTime() {
					return this.creationTime;
				}

				public void setCreationTime(String creationTime) {
					this.creationTime = creationTime;
				}

				public String getImage() {
					return this.image;
				}

				public void setImage(String image) {
					this.image = image;
				}

				public String getLabels() {
					return this.labels;
				}

				public void setLabels(String labels) {
					this.labels = labels;
				}

				public Boolean getHasCustomMetrics() {
					return this.hasCustomMetrics;
				}

				public void setHasCustomMetrics(Boolean hasCustomMetrics) {
					this.hasCustomMetrics = hasCustomMetrics;
				}

				public Boolean getHasCpu() {
					return this.hasCpu;
				}

				public void setHasCpu(Boolean hasCpu) {
					this.hasCpu = hasCpu;
				}

				public String getEnvs() {
					return this.envs;
				}

				public void setEnvs(String envs) {
					this.envs = envs;
				}

				public Boolean getHasDiskIo() {
					return this.hasDiskIo;
				}

				public void setHasDiskIo(Boolean hasDiskIo) {
					this.hasDiskIo = hasDiskIo;
				}

				public Boolean getHasFilesystem() {
					return this.hasFilesystem;
				}

				public void setHasFilesystem(Boolean hasFilesystem) {
					this.hasFilesystem = hasFilesystem;
				}

				public Boolean getHasNetwork() {
					return this.hasNetwork;
				}

				public void setHasNetwork(Boolean hasNetwork) {
					this.hasNetwork = hasNetwork;
				}

				public Boolean getHasMemory() {
					return this.hasMemory;
				}

				public void setHasMemory(Boolean hasMemory) {
					this.hasMemory = hasMemory;
				}

				public ContainerMemory getContainerMemory() {
					return this.containerMemory;
				}

				public void setContainerMemory(ContainerMemory containerMemory) {
					this.containerMemory = containerMemory;
				}

				public ContainerCpu getContainerCpu() {
					return this.containerCpu;
				}

				public void setContainerCpu(ContainerCpu containerCpu) {
					this.containerCpu = containerCpu;
				}

				public static class ContainerMemory {

					private Long limit;

					private Long swapLimit;

					private Long reservation;

					public Long getLimit() {
						return this.limit;
					}

					public void setLimit(Long limit) {
						this.limit = limit;
					}

					public Long getSwapLimit() {
						return this.swapLimit;
					}

					public void setSwapLimit(Long swapLimit) {
						this.swapLimit = swapLimit;
					}

					public Long getReservation() {
						return this.reservation;
					}

					public void setReservation(Long reservation) {
						this.reservation = reservation;
					}
				}

				public static class ContainerCpu {

					private Long quota;

					private String mask;

					private Long limit;

					private Long maxLimit;

					private Long period;

					public Long getQuota() {
						return this.quota;
					}

					public void setQuota(Long quota) {
						this.quota = quota;
					}

					public String getMask() {
						return this.mask;
					}

					public void setMask(String mask) {
						this.mask = mask;
					}

					public Long getLimit() {
						return this.limit;
					}

					public void setLimit(Long limit) {
						this.limit = limit;
					}

					public Long getMaxLimit() {
						return this.maxLimit;
					}

					public void setMaxLimit(Long maxLimit) {
						this.maxLimit = maxLimit;
					}

					public Long getPeriod() {
						return this.period;
					}

					public void setPeriod(Long period) {
						this.period = period;
					}
				}
			}
		}

	}

	@Override
	public DescribeMultiContainerGroupMetricResponse getInstance(UnmarshallerContext context) {
		return	DescribeMultiContainerGroupMetricResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
