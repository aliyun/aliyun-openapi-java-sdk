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
import com.aliyuncs.eci.transform.v20180808.ExportContainerGroupTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class ExportContainerGroupTemplateResponse extends AcsResponse {

	private String requestId;

	private Template template;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Template getTemplate() {
		return this.template;
	}

	public void setTemplate(Template template) {
		this.template = template;
	}

	public static class Template {

		private String regionId;

		private String zoneId;

		private String securityGroupId;

		private String vSwitchId;

		private String resourceGroupId;

		private String eipInstanceId;

		private String containerGroupName;

		private List<Tag> tags;

		private Resources resources;

		private Spec spec;

		public String getBizRegionId() {
			return this.regionId;
		}

		public void setBizRegionId(String regionId) {
			this.regionId = regionId;
		}

		/**
		 * @deprecated use getBizRegionId instead of this.
		 */
		@Deprecated
		public String getRegionId() {
			return this.regionId;
		}

		/**
		 * @deprecated use setBizRegionId instead of this.
		 */
		@Deprecated
		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getEipInstanceId() {
			return this.eipInstanceId;
		}

		public void setEipInstanceId(String eipInstanceId) {
			this.eipInstanceId = eipInstanceId;
		}

		public String getContainerGroupName() {
			return this.containerGroupName;
		}

		public void setContainerGroupName(String containerGroupName) {
			this.containerGroupName = containerGroupName;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public Resources getResources() {
			return this.resources;
		}

		public void setResources(Resources resources) {
			this.resources = resources;
		}

		public Spec getSpec() {
			return this.spec;
		}

		public void setSpec(Spec spec) {
			this.spec = spec;
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

		public static class Resources {

			private Float cpu;

			private Float memory;

			public Float getCpu() {
				return this.cpu;
			}

			public void setCpu(Float cpu) {
				this.cpu = cpu;
			}

			public Float getMemory() {
				return this.memory;
			}

			public void setMemory(Float memory) {
				this.memory = memory;
			}
		}

		public static class Spec {

			private String restartPolicy;

			private String dnsPolicy;

			private List<Volume> volumes;

			private List<InitContainer> initContainers;

			private List<ContainersItem> containers;

			private DnsConfig dnsConfig;

			public String getRestartPolicy() {
				return this.restartPolicy;
			}

			public void setRestartPolicy(String restartPolicy) {
				this.restartPolicy = restartPolicy;
			}

			public String getDnsPolicy() {
				return this.dnsPolicy;
			}

			public void setDnsPolicy(String dnsPolicy) {
				this.dnsPolicy = dnsPolicy;
			}

			public List<Volume> getVolumes() {
				return this.volumes;
			}

			public void setVolumes(List<Volume> volumes) {
				this.volumes = volumes;
			}

			public List<InitContainer> getInitContainers() {
				return this.initContainers;
			}

			public void setInitContainers(List<InitContainer> initContainers) {
				this.initContainers = initContainers;
			}

			public List<ContainersItem> getContainers() {
				return this.containers;
			}

			public void setContainers(List<ContainersItem> containers) {
				this.containers = containers;
			}

			public DnsConfig getDnsConfig() {
				return this.dnsConfig;
			}

			public void setDnsConfig(DnsConfig dnsConfig) {
				this.dnsConfig = dnsConfig;
			}

			public static class Volume {

				private String name;

				private ConfigFile configFile;

				private EmptyDir emptyDir;

				private Nfs nfs;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public ConfigFile getConfigFile() {
					return this.configFile;
				}

				public void setConfigFile(ConfigFile configFile) {
					this.configFile = configFile;
				}

				public EmptyDir getEmptyDir() {
					return this.emptyDir;
				}

				public void setEmptyDir(EmptyDir emptyDir) {
					this.emptyDir = emptyDir;
				}

				public Nfs getNfs() {
					return this.nfs;
				}

				public void setNfs(Nfs nfs) {
					this.nfs = nfs;
				}

				public static class ConfigFile {

					private Integer defaultMode;

					private List<Item> items;

					public Integer getDefaultMode() {
						return this.defaultMode;
					}

					public void setDefaultMode(Integer defaultMode) {
						this.defaultMode = defaultMode;
					}

					public List<Item> getItems() {
						return this.items;
					}

					public void setItems(List<Item> items) {
						this.items = items;
					}

					public static class Item {

						private Integer mode;

						private String path;

						private String content;

						public Integer getMode() {
							return this.mode;
						}

						public void setMode(Integer mode) {
							this.mode = mode;
						}

						public String getPath() {
							return this.path;
						}

						public void setPath(String path) {
							this.path = path;
						}

						public String getContent() {
							return this.content;
						}

						public void setContent(String content) {
							this.content = content;
						}
					}
				}

				public static class EmptyDir {

					private String sizeLimit;

					public String getSizeLimit() {
						return this.sizeLimit;
					}

					public void setSizeLimit(String sizeLimit) {
						this.sizeLimit = sizeLimit;
					}
				}

				public static class Nfs {

					private String server;

					private String path;

					private Boolean readOnly;

					public String getServer() {
						return this.server;
					}

					public void setServer(String server) {
						this.server = server;
					}

					public String getPath() {
						return this.path;
					}

					public void setPath(String path) {
						this.path = path;
					}

					public Boolean getReadOnly() {
						return this.readOnly;
					}

					public void setReadOnly(Boolean readOnly) {
						this.readOnly = readOnly;
					}
				}
			}

			public static class InitContainer {

				private String name;

				private String image;

				private String imagePullPolicy;

				private Boolean stdin;

				private Boolean stdinOnce;

				private Boolean tty;

				private String workingDir;

				private List<EnvItem> env;

				private List<Port> ports;

				private List<VolumeMount> volumeMounts;

				private List<String> command;

				private List<String> args;

				private SecurityContext securityContext;

				private Resources1 resources1;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
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

				public List<EnvItem> getEnv() {
					return this.env;
				}

				public void setEnv(List<EnvItem> env) {
					this.env = env;
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

				public List<String> getCommand() {
					return this.command;
				}

				public void setCommand(List<String> command) {
					this.command = command;
				}

				public List<String> getArgs() {
					return this.args;
				}

				public void setArgs(List<String> args) {
					this.args = args;
				}

				public SecurityContext getSecurityContext() {
					return this.securityContext;
				}

				public void setSecurityContext(SecurityContext securityContext) {
					this.securityContext = securityContext;
				}

				public Resources1 getResources1() {
					return this.resources1;
				}

				public void setResources1(Resources1 resources1) {
					this.resources1 = resources1;
				}

				public static class EnvItem {

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

				public static class Port {

					private String name;

					private String protocol;

					private Integer containerPort;

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public String getBizProtocol() {
						return this.protocol;
					}

					public void setBizProtocol(String protocol) {
						this.protocol = protocol;
					}

					/**
					 * @deprecated use getBizProtocol instead of this.
					 */
					@Deprecated
					public String getProtocol() {
						return this.protocol;
					}

					/**
					 * @deprecated use setBizProtocol instead of this.
					 */
					@Deprecated
					public void setProtocol(String protocol) {
						this.protocol = protocol;
					}

					public Integer getContainerPort() {
						return this.containerPort;
					}

					public void setContainerPort(Integer containerPort) {
						this.containerPort = containerPort;
					}
				}

				public static class VolumeMount {

					private String name;

					private String subPath;

					private String mountPath;

					private Boolean readOnly;

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public String getSubPath() {
						return this.subPath;
					}

					public void setSubPath(String subPath) {
						this.subPath = subPath;
					}

					public String getMountPath() {
						return this.mountPath;
					}

					public void setMountPath(String mountPath) {
						this.mountPath = mountPath;
					}

					public Boolean getReadOnly() {
						return this.readOnly;
					}

					public void setReadOnly(Boolean readOnly) {
						this.readOnly = readOnly;
					}
				}

				public static class SecurityContext {

					private Boolean readOnlyRootFilesystem;

					private Long runAsUser;

					private Capabilities capabilities;

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

					public Capabilities getCapabilities() {
						return this.capabilities;
					}

					public void setCapabilities(Capabilities capabilities) {
						this.capabilities = capabilities;
					}

					public static class Capabilities {

						private List<String> add;

						public List<String> getAdd() {
							return this.add;
						}

						public void setAdd(List<String> add) {
							this.add = add;
						}
					}
				}

				public static class Resources1 {

					private Float cpu;

					private Float memory;

					public Float getCpu() {
						return this.cpu;
					}

					public void setCpu(Float cpu) {
						this.cpu = cpu;
					}

					public Float getMemory() {
						return this.memory;
					}

					public void setMemory(Float memory) {
						this.memory = memory;
					}
				}
			}

			public static class ContainersItem {

				private String name;

				private String image;

				private String imagePullPolicy;

				private Boolean stdin;

				private Boolean stdinOnce;

				private Boolean tty;

				private String workingDir;

				private List<EnvItem9> env6;

				private List<Port10> ports7;

				private List<VolumeMount11> volumeMounts8;

				private List<String> command2;

				private List<String> args3;

				private SecurityContext4 securityContext4;

				private Resources5 resources5;

				private ReadinessProbe readinessProbe;

				private LivenessProbe livenessProbe;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
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

				public List<EnvItem9> getEnv6() {
					return this.env6;
				}

				public void setEnv6(List<EnvItem9> env6) {
					this.env6 = env6;
				}

				public List<Port10> getPorts7() {
					return this.ports7;
				}

				public void setPorts7(List<Port10> ports7) {
					this.ports7 = ports7;
				}

				public List<VolumeMount11> getVolumeMounts8() {
					return this.volumeMounts8;
				}

				public void setVolumeMounts8(List<VolumeMount11> volumeMounts8) {
					this.volumeMounts8 = volumeMounts8;
				}

				public List<String> getCommand2() {
					return this.command2;
				}

				public void setCommand2(List<String> command2) {
					this.command2 = command2;
				}

				public List<String> getArgs3() {
					return this.args3;
				}

				public void setArgs3(List<String> args3) {
					this.args3 = args3;
				}

				public SecurityContext4 getSecurityContext4() {
					return this.securityContext4;
				}

				public void setSecurityContext4(SecurityContext4 securityContext4) {
					this.securityContext4 = securityContext4;
				}

				public Resources5 getResources5() {
					return this.resources5;
				}

				public void setResources5(Resources5 resources5) {
					this.resources5 = resources5;
				}

				public ReadinessProbe getReadinessProbe() {
					return this.readinessProbe;
				}

				public void setReadinessProbe(ReadinessProbe readinessProbe) {
					this.readinessProbe = readinessProbe;
				}

				public LivenessProbe getLivenessProbe() {
					return this.livenessProbe;
				}

				public void setLivenessProbe(LivenessProbe livenessProbe) {
					this.livenessProbe = livenessProbe;
				}

				public static class EnvItem9 {

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

				public static class Port10 {

					private String name;

					private String protocol;

					private Integer containerPort;

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public String getBizProtocol() {
						return this.protocol;
					}

					public void setBizProtocol(String protocol) {
						this.protocol = protocol;
					}

					/**
					 * @deprecated use getBizProtocol instead of this.
					 */
					@Deprecated
					public String getProtocol() {
						return this.protocol;
					}

					/**
					 * @deprecated use setBizProtocol instead of this.
					 */
					@Deprecated
					public void setProtocol(String protocol) {
						this.protocol = protocol;
					}

					public Integer getContainerPort() {
						return this.containerPort;
					}

					public void setContainerPort(Integer containerPort) {
						this.containerPort = containerPort;
					}
				}

				public static class VolumeMount11 {

					private String name;

					private String subPath;

					private String mountPath;

					private Boolean readOnly;

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public String getSubPath() {
						return this.subPath;
					}

					public void setSubPath(String subPath) {
						this.subPath = subPath;
					}

					public String getMountPath() {
						return this.mountPath;
					}

					public void setMountPath(String mountPath) {
						this.mountPath = mountPath;
					}

					public Boolean getReadOnly() {
						return this.readOnly;
					}

					public void setReadOnly(Boolean readOnly) {
						this.readOnly = readOnly;
					}
				}

				public static class SecurityContext4 {

					private Boolean readOnlyRootFilesystem;

					private Long runAsUser;

					private Capabilities12 capabilities12;

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

					public Capabilities12 getCapabilities12() {
						return this.capabilities12;
					}

					public void setCapabilities12(Capabilities12 capabilities12) {
						this.capabilities12 = capabilities12;
					}

					public static class Capabilities12 {

						private List<String> add13;

						public List<String> getAdd13() {
							return this.add13;
						}

						public void setAdd13(List<String> add13) {
							this.add13 = add13;
						}
					}
				}

				public static class Resources5 {

					private Float cpu;

					private Float memory;

					public Float getCpu() {
						return this.cpu;
					}

					public void setCpu(Float cpu) {
						this.cpu = cpu;
					}

					public Float getMemory() {
						return this.memory;
					}

					public void setMemory(Float memory) {
						this.memory = memory;
					}
				}

				public static class ReadinessProbe {

					private Integer initialDelaySeconds;

					private Integer periodSeconds;

					private Integer successThreshold;

					private Integer failureThreshold;

					private Integer timeoutSeconds;

					private Exec exec;

					private TcpSocket tcpSocket;

					private HttpGet httpGet;

					public Integer getInitialDelaySeconds() {
						return this.initialDelaySeconds;
					}

					public void setInitialDelaySeconds(Integer initialDelaySeconds) {
						this.initialDelaySeconds = initialDelaySeconds;
					}

					public Integer getPeriodSeconds() {
						return this.periodSeconds;
					}

					public void setPeriodSeconds(Integer periodSeconds) {
						this.periodSeconds = periodSeconds;
					}

					public Integer getSuccessThreshold() {
						return this.successThreshold;
					}

					public void setSuccessThreshold(Integer successThreshold) {
						this.successThreshold = successThreshold;
					}

					public Integer getFailureThreshold() {
						return this.failureThreshold;
					}

					public void setFailureThreshold(Integer failureThreshold) {
						this.failureThreshold = failureThreshold;
					}

					public Integer getTimeoutSeconds() {
						return this.timeoutSeconds;
					}

					public void setTimeoutSeconds(Integer timeoutSeconds) {
						this.timeoutSeconds = timeoutSeconds;
					}

					public Exec getExec() {
						return this.exec;
					}

					public void setExec(Exec exec) {
						this.exec = exec;
					}

					public TcpSocket getTcpSocket() {
						return this.tcpSocket;
					}

					public void setTcpSocket(TcpSocket tcpSocket) {
						this.tcpSocket = tcpSocket;
					}

					public HttpGet getHttpGet() {
						return this.httpGet;
					}

					public void setHttpGet(HttpGet httpGet) {
						this.httpGet = httpGet;
					}

					public static class Exec {

						private List<String> command14;

						public List<String> getCommand14() {
							return this.command14;
						}

						public void setCommand14(List<String> command14) {
							this.command14 = command14;
						}
					}

					public static class TcpSocket {

						private Integer port;

						public Integer getPort() {
							return this.port;
						}

						public void setPort(Integer port) {
							this.port = port;
						}
					}

					public static class HttpGet {

						private String scheme;

						private String path;

						private Integer port;

						public String getScheme() {
							return this.scheme;
						}

						public void setScheme(String scheme) {
							this.scheme = scheme;
						}

						public String getPath() {
							return this.path;
						}

						public void setPath(String path) {
							this.path = path;
						}

						public Integer getPort() {
							return this.port;
						}

						public void setPort(Integer port) {
							this.port = port;
						}
					}
				}

				public static class LivenessProbe {

					private Integer initialDelaySeconds;

					private Integer periodSeconds;

					private Integer successThreshold;

					private Integer failureThreshold;

					private Integer timeoutSeconds;

					private Exec15 exec15;

					private TcpSocket16 tcpSocket16;

					private HttpGet17 httpGet17;

					public Integer getInitialDelaySeconds() {
						return this.initialDelaySeconds;
					}

					public void setInitialDelaySeconds(Integer initialDelaySeconds) {
						this.initialDelaySeconds = initialDelaySeconds;
					}

					public Integer getPeriodSeconds() {
						return this.periodSeconds;
					}

					public void setPeriodSeconds(Integer periodSeconds) {
						this.periodSeconds = periodSeconds;
					}

					public Integer getSuccessThreshold() {
						return this.successThreshold;
					}

					public void setSuccessThreshold(Integer successThreshold) {
						this.successThreshold = successThreshold;
					}

					public Integer getFailureThreshold() {
						return this.failureThreshold;
					}

					public void setFailureThreshold(Integer failureThreshold) {
						this.failureThreshold = failureThreshold;
					}

					public Integer getTimeoutSeconds() {
						return this.timeoutSeconds;
					}

					public void setTimeoutSeconds(Integer timeoutSeconds) {
						this.timeoutSeconds = timeoutSeconds;
					}

					public Exec15 getExec15() {
						return this.exec15;
					}

					public void setExec15(Exec15 exec15) {
						this.exec15 = exec15;
					}

					public TcpSocket16 getTcpSocket16() {
						return this.tcpSocket16;
					}

					public void setTcpSocket16(TcpSocket16 tcpSocket16) {
						this.tcpSocket16 = tcpSocket16;
					}

					public HttpGet17 getHttpGet17() {
						return this.httpGet17;
					}

					public void setHttpGet17(HttpGet17 httpGet17) {
						this.httpGet17 = httpGet17;
					}

					public static class Exec15 {

						private List<String> command18;

						public List<String> getCommand18() {
							return this.command18;
						}

						public void setCommand18(List<String> command18) {
							this.command18 = command18;
						}
					}

					public static class TcpSocket16 {

						private Integer port;

						public Integer getPort() {
							return this.port;
						}

						public void setPort(Integer port) {
							this.port = port;
						}
					}

					public static class HttpGet17 {

						private String scheme;

						private String path;

						private Integer port;

						public String getScheme() {
							return this.scheme;
						}

						public void setScheme(String scheme) {
							this.scheme = scheme;
						}

						public String getPath() {
							return this.path;
						}

						public void setPath(String path) {
							this.path = path;
						}

						public Integer getPort() {
							return this.port;
						}

						public void setPort(Integer port) {
							this.port = port;
						}
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
		}
	}

	@Override
	public ExportContainerGroupTemplateResponse getInstance(UnmarshallerContext context) {
		return	ExportContainerGroupTemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
