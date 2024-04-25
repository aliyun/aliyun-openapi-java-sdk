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

package com.aliyuncs.ehpcinstant.transform.v20230701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpcinstant.model.v20230701.GetJobResponse;
import com.aliyuncs.ehpcinstant.model.v20230701.GetJobResponse.JobInfo;
import com.aliyuncs.ehpcinstant.model.v20230701.GetJobResponse.JobInfo.DependencyPolicy;
import com.aliyuncs.ehpcinstant.model.v20230701.GetJobResponse.JobInfo.DependencyPolicy.JobDependencyItem;
import com.aliyuncs.ehpcinstant.model.v20230701.GetJobResponse.JobInfo.DeploymentPolicy;
import com.aliyuncs.ehpcinstant.model.v20230701.GetJobResponse.JobInfo.DeploymentPolicy.Network;
import com.aliyuncs.ehpcinstant.model.v20230701.GetJobResponse.JobInfo.DeploymentPolicy.Tag;
import com.aliyuncs.ehpcinstant.model.v20230701.GetJobResponse.JobInfo.MonitorPolicy;
import com.aliyuncs.ehpcinstant.model.v20230701.GetJobResponse.JobInfo.MonitorPolicy.LogSpec;
import com.aliyuncs.ehpcinstant.model.v20230701.GetJobResponse.JobInfo.MonitorPolicy.NotificationSpec;
import com.aliyuncs.ehpcinstant.model.v20230701.GetJobResponse.JobInfo.MonitorPolicy.NotificationSpec.MNSTopicItem;
import com.aliyuncs.ehpcinstant.model.v20230701.GetJobResponse.JobInfo.SecurityPolicy;
import com.aliyuncs.ehpcinstant.model.v20230701.GetJobResponse.JobInfo.SecurityPolicy.SecurityGroup;
import com.aliyuncs.ehpcinstant.model.v20230701.GetJobResponse.JobInfo.Task;
import com.aliyuncs.ehpcinstant.model.v20230701.GetJobResponse.JobInfo.Task.ExecutorPolicy;
import com.aliyuncs.ehpcinstant.model.v20230701.GetJobResponse.JobInfo.Task.ExecutorPolicy.ArraySpec;
import com.aliyuncs.ehpcinstant.model.v20230701.GetJobResponse.JobInfo.Task.ExecutorStatusItem;
import com.aliyuncs.ehpcinstant.model.v20230701.GetJobResponse.JobInfo.Task.TaskSpec;
import com.aliyuncs.ehpcinstant.model.v20230701.GetJobResponse.JobInfo.Task.TaskSpec.Resource;
import com.aliyuncs.ehpcinstant.model.v20230701.GetJobResponse.JobInfo.Task.TaskSpec.Resource.Disk;
import com.aliyuncs.ehpcinstant.model.v20230701.GetJobResponse.JobInfo.Task.TaskSpec.RetryPolicy;
import com.aliyuncs.ehpcinstant.model.v20230701.GetJobResponse.JobInfo.Task.TaskSpec.RetryPolicy.ExitCodeAction;
import com.aliyuncs.ehpcinstant.model.v20230701.GetJobResponse.JobInfo.Task.TaskSpec.TaskExecutorItem;
import com.aliyuncs.ehpcinstant.model.v20230701.GetJobResponse.JobInfo.Task.TaskSpec.TaskExecutorItem.Container;
import com.aliyuncs.ehpcinstant.model.v20230701.GetJobResponse.JobInfo.Task.TaskSpec.TaskExecutorItem.Container.EnvironmentVar;
import com.aliyuncs.ehpcinstant.model.v20230701.GetJobResponse.JobInfo.Task.TaskSpec.TaskExecutorItem.VM;
import com.aliyuncs.ehpcinstant.model.v20230701.GetJobResponse.JobInfo.Task.TaskSpec.TaskExecutorItem.VM.EnvironmentVar2;
import com.aliyuncs.ehpcinstant.model.v20230701.GetJobResponse.JobInfo.Task.TaskSpec.VolumeMountItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobResponseUnmarshaller {

	public static GetJobResponse unmarshall(GetJobResponse getJobResponse, UnmarshallerContext _ctx) {
		
		getJobResponse.setRequestId(_ctx.stringValue("GetJobResponse.RequestId"));

		JobInfo jobInfo = new JobInfo();
		jobInfo.setJobId(_ctx.stringValue("GetJobResponse.JobInfo.JobId"));
		jobInfo.setJobName(_ctx.stringValue("GetJobResponse.JobInfo.JobName"));
		jobInfo.setJobDescription(_ctx.stringValue("GetJobResponse.JobInfo.JobDescription"));
		jobInfo.setJobScheduler(_ctx.stringValue("GetJobResponse.JobInfo.JobScheduler"));
		jobInfo.setCreateTime(_ctx.stringValue("GetJobResponse.JobInfo.CreateTime"));
		jobInfo.setStartTime(_ctx.stringValue("GetJobResponse.JobInfo.StartTime"));
		jobInfo.setEndTime(_ctx.stringValue("GetJobResponse.JobInfo.EndTime"));
		jobInfo.setStatus(_ctx.stringValue("GetJobResponse.JobInfo.Status"));

		DeploymentPolicy deploymentPolicy = new DeploymentPolicy();
		deploymentPolicy.setAllocationSpec(_ctx.stringValue("GetJobResponse.JobInfo.DeploymentPolicy.AllocationSpec"));

		Network network = new Network();
		network.setEnableERI(_ctx.booleanValue("GetJobResponse.JobInfo.DeploymentPolicy.Network.EnableERI"));

		List<String> vswitch = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetJobResponse.JobInfo.DeploymentPolicy.Network.Vswitch.Length"); i++) {
			vswitch.add(_ctx.stringValue("GetJobResponse.JobInfo.DeploymentPolicy.Network.Vswitch["+ i +"]"));
		}
		network.setVswitch(vswitch);
		deploymentPolicy.setNetwork(network);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("GetJobResponse.JobInfo.DeploymentPolicy.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setName(_ctx.stringValue("GetJobResponse.JobInfo.DeploymentPolicy.Tags["+ i +"].Name"));
			tag.setValue(_ctx.stringValue("GetJobResponse.JobInfo.DeploymentPolicy.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		deploymentPolicy.setTags(tags);
		jobInfo.setDeploymentPolicy(deploymentPolicy);

		SecurityPolicy securityPolicy = new SecurityPolicy();

		SecurityGroup securityGroup = new SecurityGroup();

		List<String> securityGroupIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetJobResponse.JobInfo.SecurityPolicy.SecurityGroup.SecurityGroupIds.Length"); i++) {
			securityGroupIds.add(_ctx.stringValue("GetJobResponse.JobInfo.SecurityPolicy.SecurityGroup.SecurityGroupIds["+ i +"]"));
		}
		securityGroup.setSecurityGroupIds(securityGroupIds);
		securityPolicy.setSecurityGroup(securityGroup);
		jobInfo.setSecurityPolicy(securityPolicy);

		DependencyPolicy dependencyPolicy = new DependencyPolicy();

		List<JobDependencyItem> jobDependency = new ArrayList<JobDependencyItem>();
		for (int i = 0; i < _ctx.lengthValue("GetJobResponse.JobInfo.DependencyPolicy.JobDependency.Length"); i++) {
			JobDependencyItem jobDependencyItem = new JobDependencyItem();
			jobDependencyItem.setJobId(_ctx.stringValue("GetJobResponse.JobInfo.DependencyPolicy.JobDependency["+ i +"].JobId"));
			jobDependencyItem.setType(_ctx.stringValue("GetJobResponse.JobInfo.DependencyPolicy.JobDependency["+ i +"].Type"));

			jobDependency.add(jobDependencyItem);
		}
		dependencyPolicy.setJobDependency(jobDependency);
		jobInfo.setDependencyPolicy(dependencyPolicy);

		MonitorPolicy monitorPolicy = new MonitorPolicy();

		NotificationSpec notificationSpec = new NotificationSpec();

		List<MNSTopicItem> mNSTopic = new ArrayList<MNSTopicItem>();
		for (int i = 0; i < _ctx.lengthValue("GetJobResponse.JobInfo.MonitorPolicy.NotificationSpec.MNSTopic.Length"); i++) {
			MNSTopicItem mNSTopicItem = new MNSTopicItem();
			mNSTopicItem.setTopicLocation(_ctx.stringValue("GetJobResponse.JobInfo.MonitorPolicy.NotificationSpec.MNSTopic["+ i +"].TopicLocation"));

			List<String> event = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetJobResponse.JobInfo.MonitorPolicy.NotificationSpec.MNSTopic["+ i +"].Event.Length"); j++) {
				event.add(_ctx.stringValue("GetJobResponse.JobInfo.MonitorPolicy.NotificationSpec.MNSTopic["+ i +"].Event["+ j +"]"));
			}
			mNSTopicItem.setEvent(event);

			mNSTopic.add(mNSTopicItem);
		}
		notificationSpec.setMNSTopic(mNSTopic);
		monitorPolicy.setNotificationSpec(notificationSpec);

		LogSpec logSpec = new LogSpec();
		logSpec.setProject(_ctx.stringValue("GetJobResponse.JobInfo.MonitorPolicy.LogSpec.Project"));
		logSpec.setLogstore(_ctx.stringValue("GetJobResponse.JobInfo.MonitorPolicy.LogSpec.Logstore"));
		logSpec.setMachineGroup(_ctx.stringValue("GetJobResponse.JobInfo.MonitorPolicy.LogSpec.MachineGroup"));
		logSpec.setShard(_ctx.stringValue("GetJobResponse.JobInfo.MonitorPolicy.LogSpec.Shard"));
		logSpec.setExpireTime(_ctx.stringValue("GetJobResponse.JobInfo.MonitorPolicy.LogSpec.ExpireTime"));
		monitorPolicy.setLogSpec(logSpec);
		jobInfo.setMonitorPolicy(monitorPolicy);

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("GetJobResponse.JobInfo.Tasks.Length"); i++) {
			Task task = new Task();
			task.setTaskName(_ctx.stringValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskName"));
			task.setTaskSustainable(_ctx.booleanValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskSustainable"));

			TaskSpec taskSpec = new TaskSpec();
			taskSpec.setTaskDuration(_ctx.stringValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskSpec.TaskDuration"));

			Resource resource = new Resource();
			resource.setCores(_ctx.floatValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskSpec.Resource.Cores"));
			resource.setEnableHT(_ctx.booleanValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskSpec.Resource.EnableHT"));
			resource.setMemory(_ctx.integerValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskSpec.Resource.Memory"));

			List<Disk> disks = new ArrayList<Disk>();
			for (int j = 0; j < _ctx.lengthValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskSpec.Resource.Disks.Length"); j++) {
				Disk disk = new Disk();
				disk.setType(_ctx.stringValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskSpec.Resource.Disks["+ j +"].Type"));
				disk.setSize(_ctx.integerValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskSpec.Resource.Disks["+ j +"].Size"));

				disks.add(disk);
			}
			resource.setDisks(disks);
			taskSpec.setResource(resource);

			RetryPolicy retryPolicy = new RetryPolicy();
			retryPolicy.setRetryCount(_ctx.integerValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskSpec.RetryPolicy.RetryCount"));

			List<ExitCodeAction> exitCodeActions = new ArrayList<ExitCodeAction>();
			for (int j = 0; j < _ctx.lengthValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskSpec.RetryPolicy.ExitCodeActions.Length"); j++) {
				ExitCodeAction exitCodeAction = new ExitCodeAction();
				exitCodeAction.setExitCode(_ctx.stringValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskSpec.RetryPolicy.ExitCodeActions["+ j +"].ExitCode"));
				exitCodeAction.setAction(_ctx.stringValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskSpec.RetryPolicy.ExitCodeActions["+ j +"].Action"));

				exitCodeActions.add(exitCodeAction);
			}
			retryPolicy.setExitCodeActions(exitCodeActions);
			taskSpec.setRetryPolicy(retryPolicy);

			List<TaskExecutorItem> taskExecutor = new ArrayList<TaskExecutorItem>();
			for (int j = 0; j < _ctx.lengthValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskSpec.TaskExecutor.Length"); j++) {
				TaskExecutorItem taskExecutorItem = new TaskExecutorItem();

				Container container = new Container();
				container.setImage(_ctx.stringValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskSpec.TaskExecutor["+ j +"].Container.Image"));
				container.setWorkingDir(_ctx.stringValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskSpec.TaskExecutor["+ j +"].Container.WorkingDir"));
				container.setCommand(_ctx.stringValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskSpec.TaskExecutor["+ j +"].Container.Command"));
				container.setAppId(_ctx.stringValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskSpec.TaskExecutor["+ j +"].Container.AppId"));

				List<EnvironmentVar> environmentVars = new ArrayList<EnvironmentVar>();
				for (int k = 0; k < _ctx.lengthValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskSpec.TaskExecutor["+ j +"].Container.EnvironmentVars.Length"); k++) {
					EnvironmentVar environmentVar = new EnvironmentVar();
					environmentVar.setName(_ctx.stringValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskSpec.TaskExecutor["+ j +"].Container.EnvironmentVars["+ k +"].Name"));
					environmentVar.setValue(_ctx.stringValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskSpec.TaskExecutor["+ j +"].Container.EnvironmentVars["+ k +"].Value"));

					environmentVars.add(environmentVar);
				}
				container.setEnvironmentVars(environmentVars);
				taskExecutorItem.setContainer(container);

				VM vM = new VM();
				vM.setImage(_ctx.stringValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskSpec.TaskExecutor["+ j +"].VM.Image"));
				vM.setPrologScript(_ctx.stringValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskSpec.TaskExecutor["+ j +"].VM.PrologScript"));
				vM.setScript(_ctx.stringValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskSpec.TaskExecutor["+ j +"].VM.Script"));
				vM.setAppId(_ctx.stringValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskSpec.TaskExecutor["+ j +"].VM.AppId"));

				List<EnvironmentVar2> environmentVars1 = new ArrayList<EnvironmentVar2>();
				for (int k = 0; k < _ctx.lengthValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskSpec.TaskExecutor["+ j +"].VM.EnvironmentVars.Length"); k++) {
					EnvironmentVar2 environmentVar2 = new EnvironmentVar2();
					environmentVar2.setName(_ctx.stringValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskSpec.TaskExecutor["+ j +"].VM.EnvironmentVars["+ k +"].Name"));
					environmentVar2.setValue(_ctx.stringValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskSpec.TaskExecutor["+ j +"].VM.EnvironmentVars["+ k +"].Value"));

					environmentVars1.add(environmentVar2);
				}
				vM.setEnvironmentVars1(environmentVars1);
				taskExecutorItem.setVM(vM);

				taskExecutor.add(taskExecutorItem);
			}
			taskSpec.setTaskExecutor(taskExecutor);

			List<VolumeMountItem> volumeMount = new ArrayList<VolumeMountItem>();
			for (int j = 0; j < _ctx.lengthValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskSpec.VolumeMount.Length"); j++) {
				VolumeMountItem volumeMountItem = new VolumeMountItem();
				volumeMountItem.setMountPath(_ctx.stringValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskSpec.VolumeMount["+ j +"].MountPath"));
				volumeMountItem.setVolumeDriver(_ctx.stringValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskSpec.VolumeMount["+ j +"].VolumeDriver"));
				volumeMountItem.setMountOptions(_ctx.stringValue("GetJobResponse.JobInfo.Tasks["+ i +"].TaskSpec.VolumeMount["+ j +"].MountOptions"));

				volumeMount.add(volumeMountItem);
			}
			taskSpec.setVolumeMount(volumeMount);
			task.setTaskSpec(taskSpec);

			ExecutorPolicy executorPolicy = new ExecutorPolicy();
			executorPolicy.setMaxCount(_ctx.integerValue("GetJobResponse.JobInfo.Tasks["+ i +"].ExecutorPolicy.MaxCount"));
			executorPolicy.setParallelism(_ctx.integerValue("GetJobResponse.JobInfo.Tasks["+ i +"].ExecutorPolicy.Parallelism"));

			ArraySpec arraySpec = new ArraySpec();
			arraySpec.setIndexStart(_ctx.integerValue("GetJobResponse.JobInfo.Tasks["+ i +"].ExecutorPolicy.ArraySpec.IndexStart"));
			arraySpec.setIndexEnd(_ctx.integerValue("GetJobResponse.JobInfo.Tasks["+ i +"].ExecutorPolicy.ArraySpec.IndexEnd"));
			arraySpec.setIndexStep(_ctx.integerValue("GetJobResponse.JobInfo.Tasks["+ i +"].ExecutorPolicy.ArraySpec.IndexStep"));
			executorPolicy.setArraySpec(arraySpec);
			task.setExecutorPolicy(executorPolicy);

			List<ExecutorStatusItem> executorStatus = new ArrayList<ExecutorStatusItem>();
			for (int j = 0; j < _ctx.lengthValue("GetJobResponse.JobInfo.Tasks["+ i +"].ExecutorStatus.Length"); j++) {
				ExecutorStatusItem executorStatusItem = new ExecutorStatusItem();
				executorStatusItem.setArrayId(_ctx.integerValue("GetJobResponse.JobInfo.Tasks["+ i +"].ExecutorStatus["+ j +"].ArrayId"));
				executorStatusItem.setStatus(_ctx.stringValue("GetJobResponse.JobInfo.Tasks["+ i +"].ExecutorStatus["+ j +"].Status"));
				executorStatusItem.setStatusReason(_ctx.stringValue("GetJobResponse.JobInfo.Tasks["+ i +"].ExecutorStatus["+ j +"].StatusReason"));
				executorStatusItem.setCreateTime(_ctx.stringValue("GetJobResponse.JobInfo.Tasks["+ i +"].ExecutorStatus["+ j +"].CreateTime"));
				executorStatusItem.setStartTime(_ctx.stringValue("GetJobResponse.JobInfo.Tasks["+ i +"].ExecutorStatus["+ j +"].StartTime"));
				executorStatusItem.setEndTime(_ctx.stringValue("GetJobResponse.JobInfo.Tasks["+ i +"].ExecutorStatus["+ j +"].EndTime"));

				executorStatus.add(executorStatusItem);
			}
			task.setExecutorStatus(executorStatus);

			tasks.add(task);
		}
		jobInfo.setTasks(tasks);
		getJobResponse.setJobInfo(jobInfo);
	 
	 	return getJobResponse;
	}
}