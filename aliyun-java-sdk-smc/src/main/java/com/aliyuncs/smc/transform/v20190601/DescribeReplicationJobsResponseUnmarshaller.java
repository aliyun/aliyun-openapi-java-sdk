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
import com.aliyuncs.smc.model.v20190601.DescribeReplicationJobsResponse.ReplicationJob.ReplicationJobRun;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeReplicationJobsResponseUnmarshaller {

	public static DescribeReplicationJobsResponse unmarshall(DescribeReplicationJobsResponse describeReplicationJobsResponse, UnmarshallerContext _ctx) {
		
		describeReplicationJobsResponse.setRequestId(_ctx.stringValue("DescribeReplicationJobsResponse.RequestId"));
		describeReplicationJobsResponse.setTotalCount(_ctx.integerValue("DescribeReplicationJobsResponse.TotalCount"));
		describeReplicationJobsResponse.setPageNumber(_ctx.integerValue("DescribeReplicationJobsResponse.PageNumber"));
		describeReplicationJobsResponse.setPageSize(_ctx.integerValue("DescribeReplicationJobsResponse.PageSize"));

		List<ReplicationJob> replicationJobs = new ArrayList<ReplicationJob>();
		for (int i = 0; i < _ctx.lengthValue("DescribeReplicationJobsResponse.ReplicationJobs.Length"); i++) {
			ReplicationJob replicationJob = new ReplicationJob();
			replicationJob.setJobId(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].JobId"));
			replicationJob.setSourceId(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].SourceId"));
			replicationJob.setName(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].Name"));
			replicationJob.setDescription(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].Description"));
			replicationJob.setRegionId(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].RegionId"));
			replicationJob.setTargetType(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].TargetType"));
			replicationJob.setScheduledStartTime(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].ScheduledStartTime"));
			replicationJob.setImageName(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].ImageName"));
			replicationJob.setInstanceId(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].InstanceId"));
			replicationJob.setImageId(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].ImageId"));
			replicationJob.setStatus(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].Status"));
			replicationJob.setBusinessStatus(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].BusinessStatus"));
			replicationJob.setErrorCode(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].ErrorCode"));
			replicationJob.setProgress(_ctx.floatValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].Progress"));
			replicationJob.setCreationTime(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].CreationTime"));
			replicationJob.setValidTime(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].ValidTime"));
			replicationJob.setStartTime(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].StartTime"));
			replicationJob.setEndTime(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].EndTime"));
			replicationJob.setNetMode(_ctx.integerValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].NetMode"));
			replicationJob.setSystemDiskSize(_ctx.integerValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].SystemDiskSize"));
			replicationJob.setVpcId(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].VpcId"));
			replicationJob.setVSwitchId(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].VSwitchId"));
			replicationJob.setTransitionInstanceId(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].TransitionInstanceId"));
			replicationJob.setStatusInfo(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].StatusInfo"));
			replicationJob.setReplicationParameters(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].ReplicationParameters"));
			replicationJob.setRunOnce(_ctx.booleanValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].RunOnce"));
			replicationJob.setFrequency(_ctx.integerValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].Frequency"));
			replicationJob.setMaxNumberOfImageToKeep(_ctx.integerValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].MaxNumberOfImageToKeep"));

			List<DataDisk> dataDisks = new ArrayList<DataDisk>();
			for (int j = 0; j < _ctx.lengthValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].DataDisks.Length"); j++) {
				DataDisk dataDisk = new DataDisk();
				dataDisk.setSize(_ctx.integerValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].DataDisks["+ j +"].Size"));
				dataDisk.setIndex(_ctx.integerValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].DataDisks["+ j +"].Index"));

				dataDisks.add(dataDisk);
			}
			replicationJob.setDataDisks(dataDisks);

			List<ReplicationJobRun> replicationJobRuns = new ArrayList<ReplicationJobRun>();
			for (int j = 0; j < _ctx.lengthValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].ReplicationJobRuns.Length"); j++) {
				ReplicationJobRun replicationJobRun = new ReplicationJobRun();
				replicationJobRun.setImageId(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].ReplicationJobRuns["+ j +"].ImageId"));
				replicationJobRun.setType(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].ReplicationJobRuns["+ j +"].Type"));
				replicationJobRun.setStartTime(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].ReplicationJobRuns["+ j +"].StartTime"));
				replicationJobRun.setEndTime(_ctx.stringValue("DescribeReplicationJobsResponse.ReplicationJobs["+ i +"].ReplicationJobRuns["+ j +"].EndTime"));

				replicationJobRuns.add(replicationJobRun);
			}
			replicationJob.setReplicationJobRuns(replicationJobRuns);

			replicationJobs.add(replicationJob);
		}
		describeReplicationJobsResponse.setReplicationJobs(replicationJobs);
	 
	 	return describeReplicationJobsResponse;
	}
}