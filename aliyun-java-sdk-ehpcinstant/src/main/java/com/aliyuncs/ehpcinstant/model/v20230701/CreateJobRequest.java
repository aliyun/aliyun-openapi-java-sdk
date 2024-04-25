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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateJobRequest extends RpcAcsRequest<CreateJobResponse> {
	   

	private String jobDescription;

	@SerializedName("deploymentPolicy")
	private DeploymentPolicy deploymentPolicy;

	private String jobName;

	@SerializedName("tasks")
	private List<Tasks> tasks;
	public CreateJobRequest() {
		super("EhpcInstant", "2023-07-01", "CreateJob");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getJobDescription() {
		return this.jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
		if(jobDescription != null){
			putQueryParameter("JobDescription", jobDescription);
		}
	}

	public DeploymentPolicy getDeploymentPolicy() {
		return this.deploymentPolicy;
	}

	public void setDeploymentPolicy(DeploymentPolicy deploymentPolicy) {
		this.deploymentPolicy = deploymentPolicy;	
		if (deploymentPolicy != null) {
			putQueryParameter("DeploymentPolicy" , new Gson().toJson(deploymentPolicy));
		}	
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
		if(jobName != null){
			putQueryParameter("JobName", jobName);
		}
	}

	public List<Tasks> getTasks() {
		return this.tasks;
	}

	public void setTasks(List<Tasks> tasks) {
		this.tasks = tasks;	
		if (tasks != null) {
			putQueryParameter("Tasks" , new Gson().toJson(tasks));
		}	
	}

	public static class DeploymentPolicy {

		@SerializedName("AllocationSpec")
		private String allocationSpec;

		@SerializedName("Network")
		private Network network;

		public String getAllocationSpec() {
			return this.allocationSpec;
		}

		public void setAllocationSpec(String allocationSpec) {
			this.allocationSpec = allocationSpec;
		}

		public Network getNetwork() {
			return this.network;
		}

		public void setNetwork(Network network) {
			this.network = network;
		}

		public static class Network {

			@SerializedName("EnableERI")
			private Boolean enableERI;

			@SerializedName("Vswitch")
			private List<String> vswitch;

			@SerializedName("EnableENIMapping")
			private Boolean enableENIMapping;

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

			public Boolean getEnableENIMapping() {
				return this.enableENIMapping;
			}

			public void setEnableENIMapping(Boolean enableENIMapping) {
				this.enableENIMapping = enableENIMapping;
			}
		}
	}

	public static class Tasks {

		@SerializedName("TaskSustainable")
		private Boolean taskSustainable;

		@SerializedName("TaskName")
		private String taskName;

		@SerializedName("ExecutorPolicy")
		private ExecutorPolicy executorPolicy;

		@SerializedName("TaskSpec")
		private TaskSpec taskSpec;

		public Boolean getTaskSustainable() {
			return this.taskSustainable;
		}

		public void setTaskSustainable(Boolean taskSustainable) {
			this.taskSustainable = taskSustainable;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public ExecutorPolicy getExecutorPolicy() {
			return this.executorPolicy;
		}

		public void setExecutorPolicy(ExecutorPolicy executorPolicy) {
			this.executorPolicy = executorPolicy;
		}

		public TaskSpec getTaskSpec() {
			return this.taskSpec;
		}

		public void setTaskSpec(TaskSpec taskSpec) {
			this.taskSpec = taskSpec;
		}

		public static class ExecutorPolicy {

			@SerializedName("MaxCount")
			private Integer maxCount;

			@SerializedName("ArraySpec")
			private ArraySpec arraySpec;

			public Integer getMaxCount() {
				return this.maxCount;
			}

			public void setMaxCount(Integer maxCount) {
				this.maxCount = maxCount;
			}

			public ArraySpec getArraySpec() {
				return this.arraySpec;
			}

			public void setArraySpec(ArraySpec arraySpec) {
				this.arraySpec = arraySpec;
			}

			public static class ArraySpec {

				@SerializedName("IndexStart")
				private Integer indexStart;

				@SerializedName("IndexStep")
				private Integer indexStep;

				@SerializedName("IndexEnd")
				private Integer indexEnd;

				public Integer getIndexStart() {
					return this.indexStart;
				}

				public void setIndexStart(Integer indexStart) {
					this.indexStart = indexStart;
				}

				public Integer getIndexStep() {
					return this.indexStep;
				}

				public void setIndexStep(Integer indexStep) {
					this.indexStep = indexStep;
				}

				public Integer getIndexEnd() {
					return this.indexEnd;
				}

				public void setIndexEnd(Integer indexEnd) {
					this.indexEnd = indexEnd;
				}
			}
		}

		public static class TaskSpec {

			@SerializedName("VolumeMount")
			private List<VolumeMountItem> volumeMount;

			@SerializedName("RetryPolicy")
			private RetryPolicy retryPolicy;

			@SerializedName("Resource")
			private Resource resource;

			@SerializedName("TaskDuration")
			private String taskDuration;

			@SerializedName("TaskExecutor")
			private List<TaskExecutorItem> taskExecutor;

			public List<VolumeMountItem> getVolumeMount() {
				return this.volumeMount;
			}

			public void setVolumeMount(List<VolumeMountItem> volumeMount) {
				this.volumeMount = volumeMount;
			}

			public RetryPolicy getRetryPolicy() {
				return this.retryPolicy;
			}

			public void setRetryPolicy(RetryPolicy retryPolicy) {
				this.retryPolicy = retryPolicy;
			}

			public Resource getResource() {
				return this.resource;
			}

			public void setResource(Resource resource) {
				this.resource = resource;
			}

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

			public static class VolumeMountItem {

				@SerializedName("MountOptions")
				private String mountOptions;

				@SerializedName("VolumeDriver")
				private String volumeDriver;

				@SerializedName("MountPath")
				private String mountPath;

				public String getMountOptions() {
					return this.mountOptions;
				}

				public void setMountOptions(String mountOptions) {
					this.mountOptions = mountOptions;
				}

				public String getVolumeDriver() {
					return this.volumeDriver;
				}

				public void setVolumeDriver(String volumeDriver) {
					this.volumeDriver = volumeDriver;
				}

				public String getMountPath() {
					return this.mountPath;
				}

				public void setMountPath(String mountPath) {
					this.mountPath = mountPath;
				}
			}

			public static class RetryPolicy {

				@SerializedName("RetryCount")
				private Integer retryCount;

				@SerializedName("ExitCodeActions")
				private List<ExitCodeActionsItem> exitCodeActions;

				public Integer getRetryCount() {
					return this.retryCount;
				}

				public void setRetryCount(Integer retryCount) {
					this.retryCount = retryCount;
				}

				public List<ExitCodeActionsItem> getExitCodeActions() {
					return this.exitCodeActions;
				}

				public void setExitCodeActions(List<ExitCodeActionsItem> exitCodeActions) {
					this.exitCodeActions = exitCodeActions;
				}

				public static class ExitCodeActionsItem {

					@SerializedName("Action")
					private String action;

					@SerializedName("ExitCode")
					private String exitCode;

					public String getAction() {
						return this.action;
					}

					public void setAction(String action) {
						this.action = action;
					}

					public String getExitCode() {
						return this.exitCode;
					}

					public void setExitCode(String exitCode) {
						this.exitCode = exitCode;
					}
				}
			}

			public static class Resource {

				@SerializedName("Cores")
				private Float cores;

				@SerializedName("Memory")
				private Float memory;

				@SerializedName("Disks")
				private List<DisksItem> disks;

				@SerializedName("EnableHT")
				private Boolean enableHT;

				public Float getCores() {
					return this.cores;
				}

				public void setCores(Float cores) {
					this.cores = cores;
				}

				public Float getMemory() {
					return this.memory;
				}

				public void setMemory(Float memory) {
					this.memory = memory;
				}

				public List<DisksItem> getDisks() {
					return this.disks;
				}

				public void setDisks(List<DisksItem> disks) {
					this.disks = disks;
				}

				public Boolean getEnableHT() {
					return this.enableHT;
				}

				public void setEnableHT(Boolean enableHT) {
					this.enableHT = enableHT;
				}

				public static class DisksItem {

					@SerializedName("Size")
					private Integer size;

					@SerializedName("Type")
					private String type;

					public Integer getSize() {
						return this.size;
					}

					public void setSize(Integer size) {
						this.size = size;
					}

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}
				}
			}

			public static class TaskExecutorItem {

				@SerializedName("Container")
				private Container container;

				@SerializedName("VM")
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

					@SerializedName("Image")
					private String image;

					@SerializedName("EnvironmentVars")
					private List<EnvironmentVarsItem> environmentVars;

					@SerializedName("WorkingDir")
					private String workingDir;

					@SerializedName("Command")
					private List<String> command;

					public String getImage() {
						return this.image;
					}

					public void setImage(String image) {
						this.image = image;
					}

					public List<EnvironmentVarsItem> getEnvironmentVars() {
						return this.environmentVars;
					}

					public void setEnvironmentVars(List<EnvironmentVarsItem> environmentVars) {
						this.environmentVars = environmentVars;
					}

					public String getWorkingDir() {
						return this.workingDir;
					}

					public void setWorkingDir(String workingDir) {
						this.workingDir = workingDir;
					}

					public List<String> getCommand() {
						return this.command;
					}

					public void setCommand(List<String> command) {
						this.command = command;
					}

					public static class EnvironmentVarsItem {

						@SerializedName("Name")
						private String name;

						@SerializedName("Value")
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

					@SerializedName("Image")
					private String image;

					@SerializedName("PrologScript")
					private String prologScript;

					@SerializedName("EnvironmentVars")
					private List<EnvironmentVarsItem> environmentVars;

					@SerializedName("Script")
					private String script;

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

					public List<EnvironmentVarsItem> getEnvironmentVars() {
						return this.environmentVars;
					}

					public void setEnvironmentVars(List<EnvironmentVarsItem> environmentVars) {
						this.environmentVars = environmentVars;
					}

					public String getScript() {
						return this.script;
					}

					public void setScript(String script) {
						this.script = script;
					}

					public static class EnvironmentVarsItem {

						@SerializedName("Name")
						private String name;

						@SerializedName("Value")
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
	}

	@Override
	public Class<CreateJobResponse> getResponseClass() {
		return CreateJobResponse.class;
	}

}
