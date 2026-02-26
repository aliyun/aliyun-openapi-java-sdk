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

package com.aliyuncs.ehpcinstant.model.v20230701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpcinstant.transform.v20230701.GetJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetJobResponse extends AcsResponse {

	private String requestId;

	private JobInfo jobInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public JobInfo getJobInfo() {
		return this.jobInfo;
	}

	public void setJobInfo(JobInfo jobInfo) {
		this.jobInfo = jobInfo;
	}

	public static class JobInfo {

		private String jobId;

		private String jobName;

		private String jobDescription;

		private String jobScheduler;

		private String createTime;

		private String startTime;

		private String endTime;

		private String status;

		private List<Task> tasks;

		private DeploymentPolicy deploymentPolicy;

		private SecurityPolicy securityPolicy;

		private DependencyPolicy dependencyPolicy;

		private MonitorPolicy monitorPolicy;

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getJobName() {
			return this.jobName;
		}

		public void setJobName(String jobName) {
			this.jobName = jobName;
		}

		public String getJobDescription() {
			return this.jobDescription;
		}

		public void setJobDescription(String jobDescription) {
			this.jobDescription = jobDescription;
		}

		public String getJobScheduler() {
			return this.jobScheduler;
		}

		public void setJobScheduler(String jobScheduler) {
			this.jobScheduler = jobScheduler;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<Task> getTasks() {
			return this.tasks;
		}

		public void setTasks(List<Task> tasks) {
			this.tasks = tasks;
		}

		public DeploymentPolicy getDeploymentPolicy() {
			return this.deploymentPolicy;
		}

		public void setDeploymentPolicy(DeploymentPolicy deploymentPolicy) {
			this.deploymentPolicy = deploymentPolicy;
		}

		public SecurityPolicy getSecurityPolicy() {
			return this.securityPolicy;
		}

		public void setSecurityPolicy(SecurityPolicy securityPolicy) {
			this.securityPolicy = securityPolicy;
		}

		public DependencyPolicy getDependencyPolicy() {
			return this.dependencyPolicy;
		}

		public void setDependencyPolicy(DependencyPolicy dependencyPolicy) {
			this.dependencyPolicy = dependencyPolicy;
		}

		public MonitorPolicy getMonitorPolicy() {
			return this.monitorPolicy;
		}

		public void setMonitorPolicy(MonitorPolicy monitorPolicy) {
			this.monitorPolicy = monitorPolicy;
		}

		public static class Task {

			private String taskName;

			private Boolean taskSustainable;

			private List<ExecutorStatusItem> executorStatus;

			private TaskSpec taskSpec;

			private ExecutorPolicy executorPolicy;

			public String getTaskName() {
				return this.taskName;
			}

			public void setTaskName(String taskName) {
				this.taskName = taskName;
			}

			public Boolean getTaskSustainable() {
				return this.taskSustainable;
			}

			public void setTaskSustainable(Boolean taskSustainable) {
				this.taskSustainable = taskSustainable;
			}

			public List<ExecutorStatusItem> getExecutorStatus() {
				return this.executorStatus;
			}

			public void setExecutorStatus(List<ExecutorStatusItem> executorStatus) {
				this.executorStatus = executorStatus;
			}

			public TaskSpec getTaskSpec() {
				return this.taskSpec;
			}

			public void setTaskSpec(TaskSpec taskSpec) {
				this.taskSpec = taskSpec;
			}

			public ExecutorPolicy getExecutorPolicy() {
				return this.executorPolicy;
			}

			public void setExecutorPolicy(ExecutorPolicy executorPolicy) {
				this.executorPolicy = executorPolicy;
			}

			public static class ExecutorStatusItem {

				private Integer arrayId;

				private String status;

				private String statusReason;

				private String createTime;

				private String startTime;

				private String endTime;

				public Integer getArrayId() {
					return this.arrayId;
				}

				public void setArrayId(Integer arrayId) {
					this.arrayId = arrayId;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getStatusReason() {
					return this.statusReason;
				}

				public void setStatusReason(String statusReason) {
					this.statusReason = statusReason;
				}

				public String getCreateTime() {
					return this.createTime;
				}

				public void setCreateTime(String createTime) {
					this.createTime = createTime;
				}

				public String getStartTime() {
					return this.startTime;
				}

				public void setStartTime(String startTime) {
					this.startTime = startTime;
				}

				public String getEndTime() {
					return this.endTime;
				}

				public void setEndTime(String endTime) {
					this.endTime = endTime;
				}
			}

			public static class TaskSpec {

				private String taskDuration;

				private List<TaskExecutorItem> taskExecutor;

				private List<VolumeMountItem> volumeMount;

				private Resource resource;

				private RetryPolicy retryPolicy;

				public String getTaskDuration() {
					return this.taskDuration;
				}

				public void setTaskDuration(String taskDuration) {
					this.taskDuration = taskDuration;
				}

				public List<TaskExecutorItem> getTaskExecutor() {
					return this.taskExecutor;
				}

				public void setTaskExecutor(List<TaskExecutorItem> taskExecutor) {
					this.taskExecutor = taskExecutor;
				}

				public List<VolumeMountItem> getVolumeMount() {
					return this.volumeMount;
				}

				public void setVolumeMount(List<VolumeMountItem> volumeMount) {
					this.volumeMount = volumeMount;
				}

				public Resource getResource() {
					return this.resource;
				}

				public void setResource(Resource resource) {
					this.resource = resource;
				}

				public RetryPolicy getRetryPolicy() {
					return this.retryPolicy;
				}

				public void setRetryPolicy(RetryPolicy retryPolicy) {
					this.retryPolicy = retryPolicy;
				}

				public static class TaskExecutorItem {

					private Container container;

					private VM vM;

					public Container getContainer() {
						return this.container;
					}

					public void setContainer(Container container) {
						this.container = container;
					}

					public VM getVM() {
						return this.vM;
					}

					public void setVM(VM vM) {
						this.vM = vM;
					}

					public static class Container {

						private String image;

						private String workingDir;

						private String command;

						private String appId;

						private List<EnvironmentVar> environmentVars;

						public String getImage() {
							return this.image;
						}

						public void setImage(String image) {
							this.image = image;
						}

						public String getWorkingDir() {
							return this.workingDir;
						}

						public void setWorkingDir(String workingDir) {
							this.workingDir = workingDir;
						}

						public String getCommand() {
							return this.command;
						}

						public void setCommand(String command) {
							this.command = command;
						}

						public String getAppId() {
							return this.appId;
						}

						public void setAppId(String appId) {
							this.appId = appId;
						}

						public List<EnvironmentVar> getEnvironmentVars() {
							return this.environmentVars;
						}

						public void setEnvironmentVars(List<EnvironmentVar> environmentVars) {
							this.environmentVars = environmentVars;
						}

						public static class EnvironmentVar {

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

					public static class VM {

						private String image;

						private String prologScript;

						private String script;

						private String appId;

						private List<EnvironmentVar2> environmentVars1;

						public String getImage() {
							return this.image;
						}

						public void setImage(String image) {
							this.image = image;
						}

						public String getPrologScript() {
							return this.prologScript;
						}

						public void setPrologScript(String prologScript) {
							this.prologScript = prologScript;
						}

						public String getScript() {
							return this.script;
						}

						public void setScript(String script) {
							this.script = script;
						}

						public String getAppId() {
							return this.appId;
						}

						public void setAppId(String appId) {
							this.appId = appId;
						}

						public List<EnvironmentVar2> getEnvironmentVars1() {
							return this.environmentVars1;
						}

						public void setEnvironmentVars1(List<EnvironmentVar2> environmentVars1) {
							this.environmentVars1 = environmentVars1;
						}

						public static class EnvironmentVar2 {

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

				public static class VolumeMountItem {

					private String mountPath;

					private String volumeDriver;

					private String mountOptions;

					public String getMountPath() {
						return this.mountPath;
					}

					public void setMountPath(String mountPath) {
						this.mountPath = mountPath;
					}

					public String getVolumeDriver() {
						return this.volumeDriver;
					}

					public void setVolumeDriver(String volumeDriver) {
						this.volumeDriver = volumeDriver;
					}

					public String getMountOptions() {
						return this.mountOptions;
					}

					public void setMountOptions(String mountOptions) {
						this.mountOptions = mountOptions;
					}
				}

				public static class Resource {

					private Float cores;

					private Boolean enableHT;

					private Integer memory;

					private List<Disk> disks;

					public Float getCores() {
						return this.cores;
					}

					public void setCores(Float cores) {
						this.cores = cores;
					}

					public Boolean getEnableHT() {
						return this.enableHT;
					}

					public void setEnableHT(Boolean enableHT) {
						this.enableHT = enableHT;
					}

					public Integer getMemory() {
						return this.memory;
					}

					public void setMemory(Integer memory) {
						this.memory = memory;
					}

					public List<Disk> getDisks() {
						return this.disks;
					}

					public void setDisks(List<Disk> disks) {
						this.disks = disks;
					}

					public static class Disk {

						private String type;

						private Integer size;

						public String getType() {
							return this.type;
						}

						public void setType(String type) {
							this.type = type;
						}

						public Integer getSize() {
							return this.size;
						}

						public void setSize(Integer size) {
							this.size = size;
						}
					}
				}

				public static class RetryPolicy {

					private Integer retryCount;

					private List<ExitCodeAction> exitCodeActions;

					public Integer getRetryCount() {
						return this.retryCount;
					}

					public void setRetryCount(Integer retryCount) {
						this.retryCount = retryCount;
					}

					public List<ExitCodeAction> getExitCodeActions() {
						return this.exitCodeActions;
					}

					public void setExitCodeActions(List<ExitCodeAction> exitCodeActions) {
						this.exitCodeActions = exitCodeActions;
					}

					public static class ExitCodeAction {

						private String exitCode;

						private String action;

						public String getExitCode() {
							return this.exitCode;
						}

						public void setExitCode(String exitCode) {
							this.exitCode = exitCode;
						}

						public String getAction() {
							return this.action;
						}

						public void setAction(String action) {
							this.action = action;
						}
					}
				}
			}

			public static class ExecutorPolicy {

				private Integer maxCount;

				private Integer parallelism;

				private ArraySpec arraySpec;

				public Integer getMaxCount() {
					return this.maxCount;
				}

				public void setMaxCount(Integer maxCount) {
					this.maxCount = maxCount;
				}

				public Integer getParallelism() {
					return this.parallelism;
				}

				public void setParallelism(Integer parallelism) {
					this.parallelism = parallelism;
				}

				public ArraySpec getArraySpec() {
					return this.arraySpec;
				}

				public void setArraySpec(ArraySpec arraySpec) {
					this.arraySpec = arraySpec;
				}

				public static class ArraySpec {

					private Integer indexStart;

					private Integer indexEnd;

					private Integer indexStep;

					public Integer getIndexStart() {
						return this.indexStart;
					}

					public void setIndexStart(Integer indexStart) {
						this.indexStart = indexStart;
					}

					public Integer getIndexEnd() {
						return this.indexEnd;
					}

					public void setIndexEnd(Integer indexEnd) {
						this.indexEnd = indexEnd;
					}

					public Integer getIndexStep() {
						return this.indexStep;
					}

					public void setIndexStep(Integer indexStep) {
						this.indexStep = indexStep;
					}
				}
			}
		}

		public static class DeploymentPolicy {

			private String allocationSpec;

			private List<Tag> tags;

			private Network network;

			public String getAllocationSpec() {
				return this.allocationSpec;
			}

			public void setAllocationSpec(String allocationSpec) {
				this.allocationSpec = allocationSpec;
			}

			public List<Tag> getTags() {
				return this.tags;
			}

			public void setTags(List<Tag> tags) {
				this.tags = tags;
			}

			public Network getNetwork() {
				return this.network;
			}

			public void setNetwork(Network network) {
				this.network = network;
			}

			public static class Tag {

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

			public static class Network {

				private Boolean enableERI;

				private List<String> vswitch;

				public Boolean getEnableERI() {
					return this.enableERI;
				}

				public void setEnableERI(Boolean enableERI) {
					this.enableERI = enableERI;
				}

				public List<String> getVswitch() {
					return this.vswitch;
				}

				public void setVswitch(List<String> vswitch) {
					this.vswitch = vswitch;
				}
			}
		}

		public static class SecurityPolicy {

			private SecurityGroup securityGroup;

			public SecurityGroup getSecurityGroup() {
				return this.securityGroup;
			}

			public void setSecurityGroup(SecurityGroup securityGroup) {
				this.securityGroup = securityGroup;
			}

			public static class SecurityGroup {

				private List<String> securityGroupIds;

				public List<String> getSecurityGroupIds() {
					return this.securityGroupIds;
				}

				public void setSecurityGroupIds(List<String> securityGroupIds) {
					this.securityGroupIds = securityGroupIds;
				}
			}
		}

		public static class DependencyPolicy {

			private List<JobDependencyItem> jobDependency;

			public List<JobDependencyItem> getJobDependency() {
				return this.jobDependency;
			}

			public void setJobDependency(List<JobDependencyItem> jobDependency) {
				this.jobDependency = jobDependency;
			}

			public static class JobDependencyItem {

				private String jobId;

				private String type;

				public String getJobId() {
					return this.jobId;
				}

				public void setJobId(String jobId) {
					this.jobId = jobId;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}
			}
		}

		public static class MonitorPolicy {

			private NotificationSpec notificationSpec;

			private LogSpec logSpec;

			public NotificationSpec getNotificationSpec() {
				return this.notificationSpec;
			}

			public void setNotificationSpec(NotificationSpec notificationSpec) {
				this.notificationSpec = notificationSpec;
			}

			public LogSpec getLogSpec() {
				return this.logSpec;
			}

			public void setLogSpec(LogSpec logSpec) {
				this.logSpec = logSpec;
			}

			public static class NotificationSpec {

				private List<MNSTopicItem> mNSTopic;

				public List<MNSTopicItem> getMNSTopic() {
					return this.mNSTopic;
				}

				public void setMNSTopic(List<MNSTopicItem> mNSTopic) {
					this.mNSTopic = mNSTopic;
				}

				public static class MNSTopicItem {

					private String topicLocation;

					private List<String> event;

					public String getTopicLocation() {
						return this.topicLocation;
					}

					public void setTopicLocation(String topicLocation) {
						this.topicLocation = topicLocation;
					}

					public List<String> getEvent() {
						return this.event;
					}

					public void setEvent(List<String> event) {
						this.event = event;
					}
				}
			}

			public static class LogSpec {

				private String project;

				private String logstore;

				private String machineGroup;

				private String shard;

				private String expireTime;

				public String getProject() {
					return this.project;
				}

				public void setProject(String project) {
					this.project = project;
				}

				public String getLogstore() {
					return this.logstore;
				}

				public void setLogstore(String logstore) {
					this.logstore = logstore;
				}

				public String getMachineGroup() {
					return this.machineGroup;
				}

				public void setMachineGroup(String machineGroup) {
					this.machineGroup = machineGroup;
				}

				public String getShard() {
					return this.shard;
				}

				public void setShard(String shard) {
					this.shard = shard;
				}

				public String getExpireTime() {
					return this.expireTime;
				}

				public void setExpireTime(String expireTime) {
					this.expireTime = expireTime;
				}
			}
		}
	}

	@Override
	public GetJobResponse getInstance(UnmarshallerContext context) {
		return	GetJobResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
