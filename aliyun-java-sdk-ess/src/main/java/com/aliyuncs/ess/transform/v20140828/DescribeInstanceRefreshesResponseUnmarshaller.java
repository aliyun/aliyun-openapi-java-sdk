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

package com.aliyuncs.ess.transform.v20140828;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ess.model.v20140828.DescribeInstanceRefreshesResponse;
import com.aliyuncs.ess.model.v20140828.DescribeInstanceRefreshesResponse.InstanceRefreshTask;
import com.aliyuncs.ess.model.v20140828.DescribeInstanceRefreshesResponse.InstanceRefreshTask.Checkpoint;
import com.aliyuncs.ess.model.v20140828.DescribeInstanceRefreshesResponse.InstanceRefreshTask.DesiredConfiguration;
import com.aliyuncs.ess.model.v20140828.DescribeInstanceRefreshesResponse.InstanceRefreshTask.DesiredConfiguration.Container;
import com.aliyuncs.ess.model.v20140828.DescribeInstanceRefreshesResponse.InstanceRefreshTask.DesiredConfiguration.Container.EnvironmentVar;
import com.aliyuncs.ess.model.v20140828.DescribeInstanceRefreshesResponse.InstanceRefreshTask.DesiredConfiguration.LaunchTemplateOverride;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceRefreshesResponseUnmarshaller {

	public static DescribeInstanceRefreshesResponse unmarshall(DescribeInstanceRefreshesResponse describeInstanceRefreshesResponse, UnmarshallerContext _ctx) {
		
		describeInstanceRefreshesResponse.setRequestId(_ctx.stringValue("DescribeInstanceRefreshesResponse.RequestId"));
		describeInstanceRefreshesResponse.setNextToken(_ctx.stringValue("DescribeInstanceRefreshesResponse.NextToken"));
		describeInstanceRefreshesResponse.setMaxResults(_ctx.integerValue("DescribeInstanceRefreshesResponse.MaxResults"));
		describeInstanceRefreshesResponse.setTotalCount(_ctx.integerValue("DescribeInstanceRefreshesResponse.TotalCount"));

		List<InstanceRefreshTask> instanceRefreshTasks = new ArrayList<InstanceRefreshTask>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks.Length"); i++) {
			InstanceRefreshTask instanceRefreshTask = new InstanceRefreshTask();
			instanceRefreshTask.setInstanceRefreshTaskId(_ctx.stringValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].InstanceRefreshTaskId"));
			instanceRefreshTask.setScalingGroupId(_ctx.stringValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].ScalingGroupId"));
			instanceRefreshTask.setRegionId(_ctx.stringValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].RegionId"));
			instanceRefreshTask.setEndTime(_ctx.stringValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].EndTime"));
			instanceRefreshTask.setStartTime(_ctx.stringValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].StartTime"));
			instanceRefreshTask.setStatus(_ctx.stringValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].Status"));
			instanceRefreshTask.setDetail(_ctx.stringValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].Detail"));
			instanceRefreshTask.setMinHealthyPercentage(_ctx.integerValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].MinHealthyPercentage"));
			instanceRefreshTask.setMaxHealthyPercentage(_ctx.integerValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].MaxHealthyPercentage"));
			instanceRefreshTask.setFinishedUpdateCapacity(_ctx.integerValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].FinishedUpdateCapacity"));
			instanceRefreshTask.setTotalNeedUpdateCapacity(_ctx.integerValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].TotalNeedUpdateCapacity"));
			instanceRefreshTask.setSkipMatching(_ctx.booleanValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].SkipMatching"));
			instanceRefreshTask.setCheckpointPauseTime(_ctx.integerValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].CheckpointPauseTime"));

			DesiredConfiguration desiredConfiguration = new DesiredConfiguration();
			desiredConfiguration.setImageId(_ctx.stringValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].DesiredConfiguration.ImageId"));
			desiredConfiguration.setScalingConfigurationId(_ctx.stringValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].DesiredConfiguration.ScalingConfigurationId"));
			desiredConfiguration.setLaunchTemplateId(_ctx.stringValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].DesiredConfiguration.LaunchTemplateId"));
			desiredConfiguration.setLaunchTemplateVersion(_ctx.stringValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].DesiredConfiguration.LaunchTemplateVersion"));

			List<LaunchTemplateOverride> launchTemplateOverrides = new ArrayList<LaunchTemplateOverride>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].DesiredConfiguration.LaunchTemplateOverrides.Length"); j++) {
				LaunchTemplateOverride launchTemplateOverride = new LaunchTemplateOverride();
				launchTemplateOverride.setInstanceType(_ctx.stringValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].DesiredConfiguration.LaunchTemplateOverrides["+ j +"].InstanceType"));

				launchTemplateOverrides.add(launchTemplateOverride);
			}
			desiredConfiguration.setLaunchTemplateOverrides(launchTemplateOverrides);

			List<Container> containers = new ArrayList<Container>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].DesiredConfiguration.Containers.Length"); j++) {
				Container container = new Container();
				container.setName(_ctx.stringValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].DesiredConfiguration.Containers["+ j +"].Name"));
				container.setImage(_ctx.stringValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].DesiredConfiguration.Containers["+ j +"].Image"));

				List<String> commands = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].DesiredConfiguration.Containers["+ j +"].Commands.Length"); k++) {
					commands.add(_ctx.stringValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].DesiredConfiguration.Containers["+ j +"].Commands["+ k +"]"));
				}
				container.setCommands(commands);

				List<String> args = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].DesiredConfiguration.Containers["+ j +"].Args.Length"); k++) {
					args.add(_ctx.stringValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].DesiredConfiguration.Containers["+ j +"].Args["+ k +"]"));
				}
				container.setArgs(args);

				List<EnvironmentVar> environmentVars = new ArrayList<EnvironmentVar>();
				for (int k = 0; k < _ctx.lengthValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].DesiredConfiguration.Containers["+ j +"].EnvironmentVars.Length"); k++) {
					EnvironmentVar environmentVar = new EnvironmentVar();
					environmentVar.setKey(_ctx.stringValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].DesiredConfiguration.Containers["+ j +"].EnvironmentVars["+ k +"].Key"));
					environmentVar.setValue(_ctx.stringValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].DesiredConfiguration.Containers["+ j +"].EnvironmentVars["+ k +"].Value"));
					environmentVar.setFieldRefFieldPath(_ctx.stringValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].DesiredConfiguration.Containers["+ j +"].EnvironmentVars["+ k +"].FieldRefFieldPath"));

					environmentVars.add(environmentVar);
				}
				container.setEnvironmentVars(environmentVars);

				containers.add(container);
			}
			desiredConfiguration.setContainers(containers);
			instanceRefreshTask.setDesiredConfiguration(desiredConfiguration);

			List<Checkpoint> checkpoints = new ArrayList<Checkpoint>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].Checkpoints.Length"); j++) {
				Checkpoint checkpoint = new Checkpoint();
				checkpoint.setPercentage(_ctx.integerValue("DescribeInstanceRefreshesResponse.InstanceRefreshTasks["+ i +"].Checkpoints["+ j +"].Percentage"));

				checkpoints.add(checkpoint);
			}
			instanceRefreshTask.setCheckpoints(checkpoints);

			instanceRefreshTasks.add(instanceRefreshTask);
		}
		describeInstanceRefreshesResponse.setInstanceRefreshTasks(instanceRefreshTasks);
	 
	 	return describeInstanceRefreshesResponse;
	}
}