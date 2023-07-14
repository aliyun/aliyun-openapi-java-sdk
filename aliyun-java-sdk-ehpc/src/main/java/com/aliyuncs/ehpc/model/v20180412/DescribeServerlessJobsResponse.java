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

package com.aliyuncs.ehpc.model.v20180412;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.DescribeServerlessJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeServerlessJobsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private List<JobInfo> jobInfos;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<JobInfo> getJobInfos() {
		return this.jobInfos;
	}

	public void setJobInfos(List<JobInfo> jobInfos) {
		this.jobInfos = jobInfos;
	}

	public static class JobInfo {

		private Long endTime;

		private String id;

		private Boolean isArrayJob;

		private Long lastModifyTime;

		private String name;

		private String owner;

		private Long priority;

		private String queue;

		private Long startTime;

		private String state;

		private Long submitTime;

		private List<ContainerGroup> containerGroups;

		private ArrayProperties arrayProperties;

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Boolean getIsArrayJob() {
			return this.isArrayJob;
		}

		public void setIsArrayJob(Boolean isArrayJob) {
			this.isArrayJob = isArrayJob;
		}

		public Long getLastModifyTime() {
			return this.lastModifyTime;
		}

		public void setLastModifyTime(Long lastModifyTime) {
			this.lastModifyTime = lastModifyTime;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public Long getPriority() {
			return this.priority;
		}

		public void setPriority(Long priority) {
			this.priority = priority;
		}

		public String getQueue() {
			return this.queue;
		}

		public void setQueue(String queue) {
			this.queue = queue;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Long getSubmitTime() {
			return this.submitTime;
		}

		public void setSubmitTime(Long submitTime) {
			this.submitTime = submitTime;
		}

		public List<ContainerGroup> getContainerGroups() {
			return this.containerGroups;
		}

		public void setContainerGroups(List<ContainerGroup> containerGroups) {
			this.containerGroups = containerGroups;
		}

		public ArrayProperties getArrayProperties() {
			return this.arrayProperties;
		}

		public void setArrayProperties(ArrayProperties arrayProperties) {
			this.arrayProperties = arrayProperties;
		}

		public static class ContainerGroup {

			private String containerGroupId;

			private String containerGroupName;

			private Float cpu;

			private String creationTime;

			private Long discount;

			private String eniInstanceId;

			private Long ephemeralStorage;

			private String expiredTime;

			private String failedTime;

			private String instanceType;

			private String internetIp;

			private String intranetIp;

			private String ipv6Address;

			private Float memory;

			private String ramRoleName;

			private String regionId;

			private String resourceGroupId;

			private String restartPolicy;

			private String securityGroupId;

			private Float spotPriceLimit;

			private String spotStrategy;

			private String status;

			private String succeededTime;

			private String tenantEniInstanceId;

			private String tenantEniIp;

			private String tenantSecurityGroupId;

			private String tenantVSwitchId;

			private String vSwitchId;

			private String vpcId;

			private String zoneId;

			private List<Container> containers;

			private List<Event> events;

			private List<HostAlias> hostAliases;

			private List<InitContainer> initContainers;

			private List<Tag> tags;

			private List<Volume> volumes;

			private DnsConfig dnsConfig;

			private EciSecurityContext eciSecurityContext;

			public String getContainerGroupId() {
				return this.containerGroupId;
			}

			public void setContainerGroupId(String containerGroupId) {
				this.containerGroupId = containerGroupId;
			}

			public String getContainerGroupName() {
				return this.containerGroupName;
			}

			public void setContainerGroupName(String containerGroupName) {
				this.containerGroupName = containerGroupName;
			}

			public Float getCpu() {
				return this.cpu;
			}

			public void setCpu(Float cpu) {
				this.cpu = cpu;
			}

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public Long getDiscount() {
				return this.discount;
			}

			public void setDiscount(Long discount) {
				this.discount = discount;
			}

			public String getEniInstanceId() {
				return this.eniInstanceId;
			}

			public void setEniInstanceId(String eniInstanceId) {
				this.eniInstanceId = eniInstanceId;
			}

			public Long getEphemeralStorage() {
				return this.ephemeralStorage;
			}

			public void setEphemeralStorage(Long ephemeralStorage) {
				this.ephemeralStorage = ephemeralStorage;
			}

			public String getExpiredTime() {
				return this.expiredTime;
			}

			public void setExpiredTime(String expiredTime) {
				this.expiredTime = expiredTime;
			}

			public String getFailedTime() {
				return this.failedTime;
			}

			public void setFailedTime(String failedTime) {
				this.failedTime = failedTime;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public String getInternetIp() {
				return this.internetIp;
			}

			public void setInternetIp(String internetIp) {
				this.internetIp = internetIp;
			}

			public String getIntranetIp() {
				return this.intranetIp;
			}

			public void setIntranetIp(String intranetIp) {
				this.intranetIp = intranetIp;
			}

			public String getIpv6Address() {
				return this.ipv6Address;
			}

			public void setIpv6Address(String ipv6Address) {
				this.ipv6Address = ipv6Address;
			}

			public Float getMemory() {
				return this.memory;
			}

			public void setMemory(Float memory) {
				this.memory = memory;
			}

			public String getRamRoleName() {
				return this.ramRoleName;
			}

			public void setRamRoleName(String ramRoleName) {
				this.ramRoleName = ramRoleName;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getResourceGroupId() {
				return this.resourceGroupId;
			}

			public void setResourceGroupId(String resourceGroupId) {
				this.resourceGroupId = resourceGroupId;
			}

			public String getRestartPolicy() {
				return this.restartPolicy;
			}

			public void setRestartPolicy(String restartPolicy) {
				this.restartPolicy = restartPolicy;
			}

			public String getSecurityGroupId() {
				return this.securityGroupId;
			}

			public void setSecurityGroupId(String securityGroupId) {
				this.securityGroupId = securityGroupId;
			}

			public Float getSpotPriceLimit() {
				return this.spotPriceLimit;
			}

			public void setSpotPriceLimit(Float spotPriceLimit) {
				this.spotPriceLimit = spotPriceLimit;
			}

			public String getSpotStrategy() {
				return this.spotStrategy;
			}

			public void setSpotStrategy(String spotStrategy) {
				this.spotStrategy = spotStrategy;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getSucceededTime() {
				return this.succeededTime;
			}

			public void setSucceededTime(String succeededTime) {
				this.succeededTime = succeededTime;
			}

			public String getTenantEniInstanceId() {
				return this.tenantEniInstanceId;
			}

			public void setTenantEniInstanceId(String tenantEniInstanceId) {
				this.tenantEniInstanceId = tenantEniInstanceId;
			}

			public String getTenantEniIp() {
				return this.tenantEniIp;
			}

			public void setTenantEniIp(String tenantEniIp) {
				this.tenantEniIp = tenantEniIp;
			}

			public String getTenantSecurityGroupId() {
				return this.tenantSecurityGroupId;
			}

			public void setTenantSecurityGroupId(String tenantSecurityGroupId) {
				this.tenantSecurityGroupId = tenantSecurityGroupId;
			}

			public String getTenantVSwitchId() {
				return this.tenantVSwitchId;
			}

			public void setTenantVSwitchId(String tenantVSwitchId) {
				this.tenantVSwitchId = tenantVSwitchId;
			}

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public List<Container> getContainers() {
				return this.containers;
			}

			public void setContainers(List<Container> containers) {
				this.containers = containers;
			}

			public List<Event> getEvents() {
				return this.events;
			}

			public void setEvents(List<Event> events) {
				this.events = events;
			}

			public List<HostAlias> getHostAliases() {
				return this.hostAliases;
			}

			public void setHostAliases(List<HostAlias> hostAliases) {
				this.hostAliases = hostAliases;
			}

			public List<InitContainer> getInitContainers() {
				return this.initContainers;
			}

			public void setInitContainers(List<InitContainer> initContainers) {
				this.initContainers = initContainers;
			}

			public List<Tag> getTags() {
				return this.tags;
			}

			public void setTags(List<Tag> tags) {
				this.tags = tags;
			}

			public List<Volume> getVolumes() {
				return this.volumes;
			}

			public void setVolumes(List<Volume> volumes) {
				this.volumes = volumes;
			}

			public DnsConfig getDnsConfig() {
				return this.dnsConfig;
			}

			public void setDnsConfig(DnsConfig dnsConfig) {
				this.dnsConfig = dnsConfig;
			}

			public EciSecurityContext getEciSecurityContext() {
				return this.eciSecurityContext;
			}

			public void setEciSecurityContext(EciSecurityContext eciSecurityContext) {
				this.eciSecurityContext = eciSecurityContext;
			}

			public static class Container {

				private Float cpu;

				private Integer gpu;

				private String image;

				private String imagePullPolicy;

				private Float memory;

				private String name;

				private Boolean ready;

				private Integer restartCount;

				private Boolean stdin;

				private Boolean stdinOnce;

				private Boolean tty;

				private String workingDir;

				private List<EnvironmentVar> environmentVars;

				private List<Port> ports;

				private List<VolumeMount> volumeMounts;

				private List<String> args;

				private List<String> commands;

				private CurrentState currentState;

				private LivenessProbe livenessProbe;

				private PreviousState previousState;

				private ReadinessProbe readinessProbe;

				private SecurityContext securityContext;

				public Float getCpu() {
					return this.cpu;
				}

				public void setCpu(Float cpu) {
					this.cpu = cpu;
				}

				public Integer getGpu() {
					return this.gpu;
				}

				public void setGpu(Integer gpu) {
					this.gpu = gpu;
				}

				public String getImage() {
					return this.image;
				}

				public void setImage(String image) {
					this.image = image;
				}

				public String getImagePullPolicy() {
					return this.imagePullPolicy;
				}

				public void setImagePullPolicy(String imagePullPolicy) {
					this.imagePullPolicy = imagePullPolicy;
				}

				public Float getMemory() {
					return this.memory;
				}

				public void setMemory(Float memory) {
					this.memory = memory;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Boolean getReady() {
					return this.ready;
				}

				public void setReady(Boolean ready) {
					this.ready = ready;
				}

				public Integer getRestartCount() {
					return this.restartCount;
				}

				public void setRestartCount(Integer restartCount) {
					this.restartCount = restartCount;
				}

				public Boolean getStdin() {
					return this.stdin;
				}

				public void setStdin(Boolean stdin) {
					this.stdin = stdin;
				}

				public Boolean getStdinOnce() {
					return this.stdinOnce;
				}

				public void setStdinOnce(Boolean stdinOnce) {
					this.stdinOnce = stdinOnce;
				}

				public Boolean getTty() {
					return this.tty;
				}

				public void setTty(Boolean tty) {
					this.tty = tty;
				}

				public String getWorkingDir() {
					return this.workingDir;
				}

				public void setWorkingDir(String workingDir) {
					this.workingDir = workingDir;
				}

				public List<EnvironmentVar> getEnvironmentVars() {
					return this.environmentVars;
				}

				public void setEnvironmentVars(List<EnvironmentVar> environmentVars) {
					this.environmentVars = environmentVars;
				}

				public List<Port> getPorts() {
					return this.ports;
				}

				public void setPorts(List<Port> ports) {
					this.ports = ports;
				}

				public List<VolumeMount> getVolumeMounts() {
					return this.volumeMounts;
				}

				public void setVolumeMounts(List<VolumeMount> volumeMounts) {
					this.volumeMounts = volumeMounts;
				}

				public List<String> getArgs() {
					return this.args;
				}

				public void setArgs(List<String> args) {
					this.args = args;
				}

				public List<String> getCommands() {
					return this.commands;
				}

				public void setCommands(List<String> commands) {
					this.commands = commands;
				}

				public CurrentState getCurrentState() {
					return this.currentState;
				}

				public void setCurrentState(CurrentState currentState) {
					this.currentState = currentState;
				}

				public LivenessProbe getLivenessProbe() {
					return this.livenessProbe;
				}

				public void setLivenessProbe(LivenessProbe livenessProbe) {
					this.livenessProbe = livenessProbe;
				}

				public PreviousState getPreviousState() {
					return this.previousState;
				}

				public void setPreviousState(PreviousState previousState) {
					this.previousState = previousState;
				}

				public ReadinessProbe getReadinessProbe() {
					return this.readinessProbe;
				}

				public void setReadinessProbe(ReadinessProbe readinessProbe) {
					this.readinessProbe = readinessProbe;
				}

				public SecurityContext getSecurityContext() {
					return this.securityContext;
				}

				public void setSecurityContext(SecurityContext securityContext) {
					this.securityContext = securityContext;
				}

				public static class EnvironmentVar {

					private String key;

					private String value;

					private ValueFrom valueFrom;

					public String getKey() {
						return this.key;
					}

					public void setKey(String key) {
						this.key = key;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}

					public ValueFrom getValueFrom() {
						return this.valueFrom;
					}

					public void setValueFrom(ValueFrom valueFrom) {
						this.valueFrom = valueFrom;
					}

					public static class ValueFrom {

						private FieldRef fieldRef;

						public FieldRef getFieldRef() {
							return this.fieldRef;
						}

						public void setFieldRef(FieldRef fieldRef) {
							this.fieldRef = fieldRef;
						}

						public static class FieldRef {

							private String fieldPath;

							public String getFieldPath() {
								return this.fieldPath;
							}

							public void setFieldPath(String fieldPath) {
								this.fieldPath = fieldPath;
							}
						}
					}
				}

				public static class Port {

					private Long port;

					private String protocol;

					public Long getPort() {
						return this.port;
					}

					public void setPort(Long port) {
						this.port = port;
					}

					public String getBizProtocol() {
						return this.protocol;
					}

					public void setBizProtocol(String protocol) {
						this.protocol = protocol;
					}
				}

				public static class VolumeMount {

					private String mountPath;

					private String mountPropagation;

					private String name;

					private Boolean readOnly;

					private String subPath;

					public String getMountPath() {
						return this.mountPath;
					}

					public void setMountPath(String mountPath) {
						this.mountPath = mountPath;
					}

					public String getMountPropagation() {
						return this.mountPropagation;
					}

					public void setMountPropagation(String mountPropagation) {
						this.mountPropagation = mountPropagation;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public Boolean getReadOnly() {
						return this.readOnly;
					}

					public void setReadOnly(Boolean readOnly) {
						this.readOnly = readOnly;
					}

					public String getSubPath() {
						return this.subPath;
					}

					public void setSubPath(String subPath) {
						this.subPath = subPath;
					}
				}

				public static class CurrentState {

					private String detailStatus;

					private Long exitCode;

					private String finishTime;

					private String message;

					private String reason;

					private Long signal;

					private String startTime;

					private String state;

					public String getDetailStatus() {
						return this.detailStatus;
					}

					public void setDetailStatus(String detailStatus) {
						this.detailStatus = detailStatus;
					}

					public Long getExitCode() {
						return this.exitCode;
					}

					public void setExitCode(Long exitCode) {
						this.exitCode = exitCode;
					}

					public String getFinishTime() {
						return this.finishTime;
					}

					public void setFinishTime(String finishTime) {
						this.finishTime = finishTime;
					}

					public String getMessage() {
						return this.message;
					}

					public void setMessage(String message) {
						this.message = message;
					}

					public String getReason() {
						return this.reason;
					}

					public void setReason(String reason) {
						this.reason = reason;
					}

					public Long getSignal() {
						return this.signal;
					}

					public void setSignal(Long signal) {
						this.signal = signal;
					}

					public String getStartTime() {
						return this.startTime;
					}

					public void setStartTime(String startTime) {
						this.startTime = startTime;
					}

					public String getState() {
						return this.state;
					}

					public void setState(String state) {
						this.state = state;
					}
				}

				public static class LivenessProbe {

					private Long failureThreshold;

					private Long initialDelaySeconds;

					private Long periodSeconds;

					private Long successThreshold;

					private Long timeoutSeconds;

					private List<String> execs;

					private HttpGet httpGet;

					private TcpSocket tcpSocket;

					public Long getFailureThreshold() {
						return this.failureThreshold;
					}

					public void setFailureThreshold(Long failureThreshold) {
						this.failureThreshold = failureThreshold;
					}

					public Long getInitialDelaySeconds() {
						return this.initialDelaySeconds;
					}

					public void setInitialDelaySeconds(Long initialDelaySeconds) {
						this.initialDelaySeconds = initialDelaySeconds;
					}

					public Long getPeriodSeconds() {
						return this.periodSeconds;
					}

					public void setPeriodSeconds(Long periodSeconds) {
						this.periodSeconds = periodSeconds;
					}

					public Long getSuccessThreshold() {
						return this.successThreshold;
					}

					public void setSuccessThreshold(Long successThreshold) {
						this.successThreshold = successThreshold;
					}

					public Long getTimeoutSeconds() {
						return this.timeoutSeconds;
					}

					public void setTimeoutSeconds(Long timeoutSeconds) {
						this.timeoutSeconds = timeoutSeconds;
					}

					public List<String> getExecs() {
						return this.execs;
					}

					public void setExecs(List<String> execs) {
						this.execs = execs;
					}

					public HttpGet getHttpGet() {
						return this.httpGet;
					}

					public void setHttpGet(HttpGet httpGet) {
						this.httpGet = httpGet;
					}

					public TcpSocket getTcpSocket() {
						return this.tcpSocket;
					}

					public void setTcpSocket(TcpSocket tcpSocket) {
						this.tcpSocket = tcpSocket;
					}

					public static class HttpGet {

						private String path;

						private Long port;

						private String scheme;

						public String getPath() {
							return this.path;
						}

						public void setPath(String path) {
							this.path = path;
						}

						public Long getPort() {
							return this.port;
						}

						public void setPort(Long port) {
							this.port = port;
						}

						public String getScheme() {
							return this.scheme;
						}

						public void setScheme(String scheme) {
							this.scheme = scheme;
						}
					}

					public static class TcpSocket {

						private String host;

						private Long port;

						public String getHost() {
							return this.host;
						}

						public void setHost(String host) {
							this.host = host;
						}

						public Long getPort() {
							return this.port;
						}

						public void setPort(Long port) {
							this.port = port;
						}
					}
				}

				public static class PreviousState {

					private String detailStatus;

					private Long exitCode;

					private String finishTime;

					private String message;

					private String reason;

					private Long signal;

					private String startTime;

					private String state;

					public String getDetailStatus() {
						return this.detailStatus;
					}

					public void setDetailStatus(String detailStatus) {
						this.detailStatus = detailStatus;
					}

					public Long getExitCode() {
						return this.exitCode;
					}

					public void setExitCode(Long exitCode) {
						this.exitCode = exitCode;
					}

					public String getFinishTime() {
						return this.finishTime;
					}

					public void setFinishTime(String finishTime) {
						this.finishTime = finishTime;
					}

					public String getMessage() {
						return this.message;
					}

					public void setMessage(String message) {
						this.message = message;
					}

					public String getReason() {
						return this.reason;
					}

					public void setReason(String reason) {
						this.reason = reason;
					}

					public Long getSignal() {
						return this.signal;
					}

					public void setSignal(Long signal) {
						this.signal = signal;
					}

					public String getStartTime() {
						return this.startTime;
					}

					public void setStartTime(String startTime) {
						this.startTime = startTime;
					}

					public String getState() {
						return this.state;
					}

					public void setState(String state) {
						this.state = state;
					}
				}

				public static class ReadinessProbe {

					private Long failureThreshold;

					private Long initialDelaySeconds;

					private Long periodSeconds;

					private Long successThreshold;

					private Long timeoutSeconds;

					private List<String> execs1;

					private HttpGet2 httpGet2;

					private TcpSocket3 tcpSocket3;

					public Long getFailureThreshold() {
						return this.failureThreshold;
					}

					public void setFailureThreshold(Long failureThreshold) {
						this.failureThreshold = failureThreshold;
					}

					public Long getInitialDelaySeconds() {
						return this.initialDelaySeconds;
					}

					public void setInitialDelaySeconds(Long initialDelaySeconds) {
						this.initialDelaySeconds = initialDelaySeconds;
					}

					public Long getPeriodSeconds() {
						return this.periodSeconds;
					}

					public void setPeriodSeconds(Long periodSeconds) {
						this.periodSeconds = periodSeconds;
					}

					public Long getSuccessThreshold() {
						return this.successThreshold;
					}

					public void setSuccessThreshold(Long successThreshold) {
						this.successThreshold = successThreshold;
					}

					public Long getTimeoutSeconds() {
						return this.timeoutSeconds;
					}

					public void setTimeoutSeconds(Long timeoutSeconds) {
						this.timeoutSeconds = timeoutSeconds;
					}

					public List<String> getExecs1() {
						return this.execs1;
					}

					public void setExecs1(List<String> execs1) {
						this.execs1 = execs1;
					}

					public HttpGet2 getHttpGet2() {
						return this.httpGet2;
					}

					public void setHttpGet2(HttpGet2 httpGet2) {
						this.httpGet2 = httpGet2;
					}

					public TcpSocket3 getTcpSocket3() {
						return this.tcpSocket3;
					}

					public void setTcpSocket3(TcpSocket3 tcpSocket3) {
						this.tcpSocket3 = tcpSocket3;
					}

					public static class HttpGet2 {

						private String path;

						private Long port;

						private String scheme;

						public String getPath() {
							return this.path;
						}

						public void setPath(String path) {
							this.path = path;
						}

						public Long getPort() {
							return this.port;
						}

						public void setPort(Long port) {
							this.port = port;
						}

						public String getScheme() {
							return this.scheme;
						}

						public void setScheme(String scheme) {
							this.scheme = scheme;
						}
					}

					public static class TcpSocket3 {

						private String host;

						private Long port;

						public String getHost() {
							return this.host;
						}

						public void setHost(String host) {
							this.host = host;
						}

						public Long getPort() {
							return this.port;
						}

						public void setPort(Long port) {
							this.port = port;
						}
					}
				}

				public static class SecurityContext {

					private Boolean readOnlyRootFilesystem;

					private Long runAsUser;

					private Capability capability;

					public Boolean getReadOnlyRootFilesystem() {
						return this.readOnlyRootFilesystem;
					}

					public void setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
						this.readOnlyRootFilesystem = readOnlyRootFilesystem;
					}

					public Long getRunAsUser() {
						return this.runAsUser;
					}

					public void setRunAsUser(Long runAsUser) {
						this.runAsUser = runAsUser;
					}

					public Capability getCapability() {
						return this.capability;
					}

					public void setCapability(Capability capability) {
						this.capability = capability;
					}

					public static class Capability {

						private List<String> adds;

						public List<String> getAdds() {
							return this.adds;
						}

						public void setAdds(List<String> adds) {
							this.adds = adds;
						}
					}
				}
			}

			public static class Event {

				private Integer count;

				private String firstTimestamp;

				private String lastTimestamp;

				private String message;

				private String name;

				private String reason;

				private String type;

				public Integer getCount() {
					return this.count;
				}

				public void setCount(Integer count) {
					this.count = count;
				}

				public String getFirstTimestamp() {
					return this.firstTimestamp;
				}

				public void setFirstTimestamp(String firstTimestamp) {
					this.firstTimestamp = firstTimestamp;
				}

				public String getLastTimestamp() {
					return this.lastTimestamp;
				}

				public void setLastTimestamp(String lastTimestamp) {
					this.lastTimestamp = lastTimestamp;
				}

				public String getMessage() {
					return this.message;
				}

				public void setMessage(String message) {
					this.message = message;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getReason() {
					return this.reason;
				}

				public void setReason(String reason) {
					this.reason = reason;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}
			}

			public static class HostAlias {

				private String ip;

				private List<String> hostnames;

				public String getIp() {
					return this.ip;
				}

				public void setIp(String ip) {
					this.ip = ip;
				}

				public List<String> getHostnames() {
					return this.hostnames;
				}

				public void setHostnames(List<String> hostnames) {
					this.hostnames = hostnames;
				}
			}

			public static class InitContainer {

				private Long cpu;

				private Long gpu;

				private String image;

				private String imagePullPolicy;

				private Long memory;

				private String name;

				private Boolean ready;

				private Long restartCount;

				private String workingDir;

				private List<EnvironmentVar11> environmentVars8;

				private List<Port14> ports9;

				private List<VolumeMount15> volumeMounts10;

				private List<String> args4;

				private List<String> command;

				private CurrentState5 currentState5;

				private PreviousState6 previousState6;

				private SecurityContext7 securityContext7;

				public Long getCpu() {
					return this.cpu;
				}

				public void setCpu(Long cpu) {
					this.cpu = cpu;
				}

				public Long getGpu() {
					return this.gpu;
				}

				public void setGpu(Long gpu) {
					this.gpu = gpu;
				}

				public String getImage() {
					return this.image;
				}

				public void setImage(String image) {
					this.image = image;
				}

				public String getImagePullPolicy() {
					return this.imagePullPolicy;
				}

				public void setImagePullPolicy(String imagePullPolicy) {
					this.imagePullPolicy = imagePullPolicy;
				}

				public Long getMemory() {
					return this.memory;
				}

				public void setMemory(Long memory) {
					this.memory = memory;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Boolean getReady() {
					return this.ready;
				}

				public void setReady(Boolean ready) {
					this.ready = ready;
				}

				public Long getRestartCount() {
					return this.restartCount;
				}

				public void setRestartCount(Long restartCount) {
					this.restartCount = restartCount;
				}

				public String getWorkingDir() {
					return this.workingDir;
				}

				public void setWorkingDir(String workingDir) {
					this.workingDir = workingDir;
				}

				public List<EnvironmentVar11> getEnvironmentVars8() {
					return this.environmentVars8;
				}

				public void setEnvironmentVars8(List<EnvironmentVar11> environmentVars8) {
					this.environmentVars8 = environmentVars8;
				}

				public List<Port14> getPorts9() {
					return this.ports9;
				}

				public void setPorts9(List<Port14> ports9) {
					this.ports9 = ports9;
				}

				public List<VolumeMount15> getVolumeMounts10() {
					return this.volumeMounts10;
				}

				public void setVolumeMounts10(List<VolumeMount15> volumeMounts10) {
					this.volumeMounts10 = volumeMounts10;
				}

				public List<String> getArgs4() {
					return this.args4;
				}

				public void setArgs4(List<String> args4) {
					this.args4 = args4;
				}

				public List<String> getCommand() {
					return this.command;
				}

				public void setCommand(List<String> command) {
					this.command = command;
				}

				public CurrentState5 getCurrentState5() {
					return this.currentState5;
				}

				public void setCurrentState5(CurrentState5 currentState5) {
					this.currentState5 = currentState5;
				}

				public PreviousState6 getPreviousState6() {
					return this.previousState6;
				}

				public void setPreviousState6(PreviousState6 previousState6) {
					this.previousState6 = previousState6;
				}

				public SecurityContext7 getSecurityContext7() {
					return this.securityContext7;
				}

				public void setSecurityContext7(SecurityContext7 securityContext7) {
					this.securityContext7 = securityContext7;
				}

				public static class EnvironmentVar11 {

					private String key;

					private String value;

					private ValueFrom12 valueFrom12;

					public String getKey() {
						return this.key;
					}

					public void setKey(String key) {
						this.key = key;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}

					public ValueFrom12 getValueFrom12() {
						return this.valueFrom12;
					}

					public void setValueFrom12(ValueFrom12 valueFrom12) {
						this.valueFrom12 = valueFrom12;
					}

					public static class ValueFrom12 {

						private FieldRef13 fieldRef13;

						public FieldRef13 getFieldRef13() {
							return this.fieldRef13;
						}

						public void setFieldRef13(FieldRef13 fieldRef13) {
							this.fieldRef13 = fieldRef13;
						}

						public static class FieldRef13 {

							private String fieldPath;

							public String getFieldPath() {
								return this.fieldPath;
							}

							public void setFieldPath(String fieldPath) {
								this.fieldPath = fieldPath;
							}
						}
					}
				}

				public static class Port14 {

					private Long port;

					private String protocol;

					public Long getPort() {
						return this.port;
					}

					public void setPort(Long port) {
						this.port = port;
					}

					public String getBizProtocol() {
						return this.protocol;
					}

					public void setBizProtocol(String protocol) {
						this.protocol = protocol;
					}
				}

				public static class VolumeMount15 {

					private String mountPath;

					private String mountPropagation;

					private String name;

					private Boolean readOnly;

					public String getMountPath() {
						return this.mountPath;
					}

					public void setMountPath(String mountPath) {
						this.mountPath = mountPath;
					}

					public String getMountPropagation() {
						return this.mountPropagation;
					}

					public void setMountPropagation(String mountPropagation) {
						this.mountPropagation = mountPropagation;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public Boolean getReadOnly() {
						return this.readOnly;
					}

					public void setReadOnly(Boolean readOnly) {
						this.readOnly = readOnly;
					}
				}

				public static class CurrentState5 {

					private String detailStatus;

					private Long exitCode;

					private String finishTime;

					private String message;

					private String reason;

					private Long signal;

					private String startTime;

					private String state;

					public String getDetailStatus() {
						return this.detailStatus;
					}

					public void setDetailStatus(String detailStatus) {
						this.detailStatus = detailStatus;
					}

					public Long getExitCode() {
						return this.exitCode;
					}

					public void setExitCode(Long exitCode) {
						this.exitCode = exitCode;
					}

					public String getFinishTime() {
						return this.finishTime;
					}

					public void setFinishTime(String finishTime) {
						this.finishTime = finishTime;
					}

					public String getMessage() {
						return this.message;
					}

					public void setMessage(String message) {
						this.message = message;
					}

					public String getReason() {
						return this.reason;
					}

					public void setReason(String reason) {
						this.reason = reason;
					}

					public Long getSignal() {
						return this.signal;
					}

					public void setSignal(Long signal) {
						this.signal = signal;
					}

					public String getStartTime() {
						return this.startTime;
					}

					public void setStartTime(String startTime) {
						this.startTime = startTime;
					}

					public String getState() {
						return this.state;
					}

					public void setState(String state) {
						this.state = state;
					}
				}

				public static class PreviousState6 {

					private String detailStatus;

					private Long exitCode;

					private String finishTime;

					private String message;

					private String reason;

					private Long signal;

					private String startTime;

					private String state;

					public String getDetailStatus() {
						return this.detailStatus;
					}

					public void setDetailStatus(String detailStatus) {
						this.detailStatus = detailStatus;
					}

					public Long getExitCode() {
						return this.exitCode;
					}

					public void setExitCode(Long exitCode) {
						this.exitCode = exitCode;
					}

					public String getFinishTime() {
						return this.finishTime;
					}

					public void setFinishTime(String finishTime) {
						this.finishTime = finishTime;
					}

					public String getMessage() {
						return this.message;
					}

					public void setMessage(String message) {
						this.message = message;
					}

					public String getReason() {
						return this.reason;
					}

					public void setReason(String reason) {
						this.reason = reason;
					}

					public Long getSignal() {
						return this.signal;
					}

					public void setSignal(Long signal) {
						this.signal = signal;
					}

					public String getStartTime() {
						return this.startTime;
					}

					public void setStartTime(String startTime) {
						this.startTime = startTime;
					}

					public String getState() {
						return this.state;
					}

					public void setState(String state) {
						this.state = state;
					}
				}

				public static class SecurityContext7 {

					private Boolean readOnlyRootFilesystem;

					private Long runAsUser;

					private Capability16 capability16;

					public Boolean getReadOnlyRootFilesystem() {
						return this.readOnlyRootFilesystem;
					}

					public void setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
						this.readOnlyRootFilesystem = readOnlyRootFilesystem;
					}

					public Long getRunAsUser() {
						return this.runAsUser;
					}

					public void setRunAsUser(Long runAsUser) {
						this.runAsUser = runAsUser;
					}

					public Capability16 getCapability16() {
						return this.capability16;
					}

					public void setCapability16(Capability16 capability16) {
						this.capability16 = capability16;
					}

					public static class Capability16 {

						private List<String> adds17;

						public List<String> getAdds17() {
							return this.adds17;
						}

						public void setAdds17(List<String> adds17) {
							this.adds17 = adds17;
						}
					}
				}
			}

			public static class Tag {

				private String key;

				private String value;

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Volume {

				private String diskVolumeDiskId;

				private String diskVolumeFsType;

				private String emptyDirVolumeMedium;

				private String emptyDirVolumeSizeLimit;

				private String flexVolumeDriver;

				private String flexVolumeFsType;

				private String flexVolumeOptions;

				private String nFSVolumePath;

				private Boolean nFSVolumeReadOnly;

				private String nFSVolumeServer;

				private String name;

				private String type;

				private List<ConfigFileVolumeConfigFileToPath> configFileVolumeConfigFileToPaths;

				public String getDiskVolumeDiskId() {
					return this.diskVolumeDiskId;
				}

				public void setDiskVolumeDiskId(String diskVolumeDiskId) {
					this.diskVolumeDiskId = diskVolumeDiskId;
				}

				public String getDiskVolumeFsType() {
					return this.diskVolumeFsType;
				}

				public void setDiskVolumeFsType(String diskVolumeFsType) {
					this.diskVolumeFsType = diskVolumeFsType;
				}

				public String getEmptyDirVolumeMedium() {
					return this.emptyDirVolumeMedium;
				}

				public void setEmptyDirVolumeMedium(String emptyDirVolumeMedium) {
					this.emptyDirVolumeMedium = emptyDirVolumeMedium;
				}

				public String getEmptyDirVolumeSizeLimit() {
					return this.emptyDirVolumeSizeLimit;
				}

				public void setEmptyDirVolumeSizeLimit(String emptyDirVolumeSizeLimit) {
					this.emptyDirVolumeSizeLimit = emptyDirVolumeSizeLimit;
				}

				public String getFlexVolumeDriver() {
					return this.flexVolumeDriver;
				}

				public void setFlexVolumeDriver(String flexVolumeDriver) {
					this.flexVolumeDriver = flexVolumeDriver;
				}

				public String getFlexVolumeFsType() {
					return this.flexVolumeFsType;
				}

				public void setFlexVolumeFsType(String flexVolumeFsType) {
					this.flexVolumeFsType = flexVolumeFsType;
				}

				public String getFlexVolumeOptions() {
					return this.flexVolumeOptions;
				}

				public void setFlexVolumeOptions(String flexVolumeOptions) {
					this.flexVolumeOptions = flexVolumeOptions;
				}

				public String getNFSVolumePath() {
					return this.nFSVolumePath;
				}

				public void setNFSVolumePath(String nFSVolumePath) {
					this.nFSVolumePath = nFSVolumePath;
				}

				public Boolean getNFSVolumeReadOnly() {
					return this.nFSVolumeReadOnly;
				}

				public void setNFSVolumeReadOnly(Boolean nFSVolumeReadOnly) {
					this.nFSVolumeReadOnly = nFSVolumeReadOnly;
				}

				public String getNFSVolumeServer() {
					return this.nFSVolumeServer;
				}

				public void setNFSVolumeServer(String nFSVolumeServer) {
					this.nFSVolumeServer = nFSVolumeServer;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public List<ConfigFileVolumeConfigFileToPath> getConfigFileVolumeConfigFileToPaths() {
					return this.configFileVolumeConfigFileToPaths;
				}

				public void setConfigFileVolumeConfigFileToPaths(List<ConfigFileVolumeConfigFileToPath> configFileVolumeConfigFileToPaths) {
					this.configFileVolumeConfigFileToPaths = configFileVolumeConfigFileToPaths;
				}

				public static class ConfigFileVolumeConfigFileToPath {

					private String content;

					private String path;

					public String getContent() {
						return this.content;
					}

					public void setContent(String content) {
						this.content = content;
					}

					public String getPath() {
						return this.path;
					}

					public void setPath(String path) {
						this.path = path;
					}
				}
			}

			public static class DnsConfig {

				private List<Option> options;

				private List<String> nameServers;

				private List<String> searches;

				public List<Option> getOptions() {
					return this.options;
				}

				public void setOptions(List<Option> options) {
					this.options = options;
				}

				public List<String> getNameServers() {
					return this.nameServers;
				}

				public void setNameServers(List<String> nameServers) {
					this.nameServers = nameServers;
				}

				public List<String> getSearches() {
					return this.searches;
				}

				public void setSearches(List<String> searches) {
					this.searches = searches;
				}

				public static class Option {

					private String name;

					private String value;

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}
				}
			}

			public static class EciSecurityContext {

				private List<Sysctl> sysctls;

				public List<Sysctl> getSysctls() {
					return this.sysctls;
				}

				public void setSysctls(List<Sysctl> sysctls) {
					this.sysctls = sysctls;
				}

				public static class Sysctl {

					private String name;

					private String value;

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}
				}
			}
		}

		public static class ArrayProperties {

			private Long indexStart;

			private Long indexEnd;

			private Long indexStep;

			public Long getIndexStart() {
				return this.indexStart;
			}

			public void setIndexStart(Long indexStart) {
				this.indexStart = indexStart;
			}

			public Long getIndexEnd() {
				return this.indexEnd;
			}

			public void setIndexEnd(Long indexEnd) {
				this.indexEnd = indexEnd;
			}

			public Long getIndexStep() {
				return this.indexStep;
			}

			public void setIndexStep(Long indexStep) {
				this.indexStep = indexStep;
			}
		}
	}

	@Override
	public DescribeServerlessJobsResponse getInstance(UnmarshallerContext context) {
		return	DescribeServerlessJobsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
