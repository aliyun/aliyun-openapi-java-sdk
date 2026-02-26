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

package com.aliyuncs.smc.transform.v20190601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smc.model.v20190601.DescribeReplicationJobsResponse;
import com.aliyuncs.smc.model.v20190601.DescribeReplicationJobsResponse.ReplicationJob;
import com.aliyuncs.smc.model.v20190601.DescribeReplicationJobsResponse.ReplicationJob.DataDisk;
import com.aliyuncs.smc.model.v20190601.DescribeReplicationJobsResponse.ReplicationJob.DataDisk.Part;
import com.aliyuncs.smc.model.v20190601.DescribeReplicationJobsResponse.ReplicationJob.ReplicationJobRun;
import com.aliyuncs.smc.model.v20190601.DescribeReplicationJobsResponse.ReplicationJob.SystemDiskPart;
import com.aliyuncs.smc.model.v20190601.DescribeReplicationJobsResponse.ReplicationJob.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeReplicationJobsResponseUnmarshaller {

	public static DescribeReplicationJobsResponse unmarshall(DescribeReplicationJobsResponse describeReplicationJobsResponse, UnmarshallerContext _ctx) {
		
		describeReplicationJobsResponse.setRequestId(_ctx.stringValue("DescribeReplicationJobsResponse.RequestId"));
		describeReplicationJobsResponse.setTotalCount(_ctx.integerValue("DescribeReplicationJobsResponse.TotalCount"));
		describeReplicationJobsResponse.setPageSize(_ctx.integerValue("DescribeReplicationJobsResponse.PageSize"));
		describeReplicationJobsResponse.setPageNumber(_ctx.integerValue("DescribeReplicationJobsResponse.PageNumber"));

		List<ReplicationJob> replicationJobs = new ArrayList<ReplicationJob>();
		for (int i = 0; i < _ctx.lengthValue("DescribeReplicationJobsResponse.ReplicationJobs.Length"); i++) {
			ReplicationJob replicationJob = new ReplicationJob();
			replicationJob.setFrequency(_ctx.integerValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].Frequency"));
			replicationJob.setVpcId(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].VpcId"));
			replicationJob.setCreationTime(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].CreationTime"));
			replicationJob.setStatus(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].Status"));
			replicationJob.setScheduledStartTime(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].ScheduledStartTime"));
			replicationJob.setMaxNumberOfImageToKeep(_ctx.integerValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].MaxNumberOfImageToKeep"));
			replicationJob.setContainerNamespace(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].ContainerNamespace"));
			replicationJob.setStatusInfo(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].StatusInfo"));
			replicationJob.setInstanceRamRole(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].InstanceRamRole"));
			replicationJob.setSystemDiskSize(_ctx.integerValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].SystemDiskSize"));
			replicationJob.setDescription(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].Description"));
			replicationJob.setReplicationParameters(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].ReplicationParameters"));
			replicationJob.setErrorCode(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].ErrorCode"));
			replicationJob.setValidTime(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].ValidTime"));
			replicationJob.setNetMode(_ctx.integerValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].NetMode"));
			replicationJob.setContainerTag(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].ContainerTag"));
			replicationJob.setLicenseType(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].LicenseType"));
			replicationJob.setName(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].Name"));
			replicationJob.setImageId(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].ImageId"));
			replicationJob.setProgress(_ctx.floatValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].Progress"));
			replicationJob.setRunOnce(_ctx.booleanValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].RunOnce"));
			replicationJob.setLaunchTemplateId(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].LaunchTemplateId"));
			replicationJob.setContainerRepository(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].ContainerRepository"));
			replicationJob.setInstanceId(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].InstanceId"));
			replicationJob.setInstanceType(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].InstanceType"));
			replicationJob.setSourceId(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].SourceId"));
			replicationJob.setLaunchTemplateVersion(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].LaunchTemplateVersion"));
			replicationJob.setRegionId(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].RegionId"));
			replicationJob.setTransitionInstanceId(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].TransitionInstanceId"));
			replicationJob.setEndTime(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].EndTime"));
			replicationJob.setStartTime(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].StartTime"));
			replicationJob.setVSwitchId(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].VSwitchId"));
			replicationJob.setJobId(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].JobId"));
			replicationJob.setImageName(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].ImageName"));
			replicationJob.setBusinessStatus(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].BusinessStatus"));
			replicationJob.setTargetType(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].TargetType"));
			replicationJob.setJobType(_ctx.integerValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].JobType"));
			replicationJob.setResourceGroupId(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].ResourceGroupId"));

			List<DataDisk> dataDisks = new ArrayList<DataDisk>();
			for (int j = 0; j < _ctx.lengthValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].DataDisks.Length"); j++) {
				DataDisk dataDisk = new DataDisk();
				dataDisk.setIndex(_ctx.integerValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].DataDisks["+ j +"].Index"));
				dataDisk.setSize(_ctx.integerValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].DataDisks["+ j +"].Size"));

				List<Part> parts = new ArrayList<Part>();
				for (int k = 0; k < _ctx.lengthValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].DataDisks["+ j +"].Parts.Length"); k++) {
					Part part = new Part();
					part.setSizeBytes(_ctx.longValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].DataDisks["+ j +"].Parts["+ k +"].SizeBytes"));
					part.setBlock(_ctx.booleanValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].DataDisks["+ j +"].Parts["+ k +"].Block"));
					part.setDevice(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].DataDisks["+ j +"].Parts["+ k +"].Device"));

					parts.add(part);
				}
				dataDisk.setParts(parts);

				dataDisks.add(dataDisk);
			}
			replicationJob.setDataDisks(dataDisks);

			List<SystemDiskPart> systemDiskParts = new ArrayList<SystemDiskPart>();
			for (int j = 0; j < _ctx.lengthValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].SystemDiskParts.Length"); j++) {
				SystemDiskPart systemDiskPart = new SystemDiskPart();
				systemDiskPart.setSizeBytes(_ctx.longValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].SystemDiskParts["+ j +"].SizeBytes"));
				systemDiskPart.setBlock(_ctx.booleanValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].SystemDiskParts["+ j +"].Block"));
				systemDiskPart.setDevice(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].SystemDiskParts["+ j +"].Device"));

				systemDiskParts.add(systemDiskPart);
			}
			replicationJob.setSystemDiskParts(systemDiskParts);

			List<ReplicationJobRun> replicationJobRuns = new ArrayList<ReplicationJobRun>();
			for (int j = 0; j < _ctx.lengthValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].ReplicationJobRuns.Length"); j++) {
				ReplicationJobRun replicationJobRun = new ReplicationJobRun();
				replicationJobRun.setEndTime(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].ReplicationJobRuns["+ j +"].EndTime"));
				replicationJobRun.setType(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].ReplicationJobRuns["+ j +"].Type"));
				replicationJobRun.setStartTime(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].ReplicationJobRuns["+ j +"].StartTime"));
				replicationJobRun.setImageId(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].ReplicationJobRuns["+ j +"].ImageId"));

				replicationJobRuns.add(replicationJobRun);
			}
			replicationJob.setReplicationJobRuns(replicationJobRuns);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			replicationJob.setTags(tags);

			replicationJobs.add(replicationJob);
		}
		describeReplicationJobsResponse.setReplicationJobs(replicationJobs);
	 
	 	return describeReplicationJobsResponse;
	}
}