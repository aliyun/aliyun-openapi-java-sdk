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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.DescribeJobsResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeJobsResponse.Job;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeJobsResponseUnmarshaller {

	public static DescribeJobsResponse unmarshall(DescribeJobsResponse describeJobsResponse, UnmarshallerContext _ctx) {
		
		describeJobsResponse.setRequestId(_ctx.stringValue("DescribeJobsResponse.RequestId"));
		describeJobsResponse.setSuccess(_ctx.booleanValue("DescribeJobsResponse.Success"));
		describeJobsResponse.setCode(_ctx.stringValue("DescribeJobsResponse.Code"));
		describeJobsResponse.setMessage(_ctx.stringValue("DescribeJobsResponse.Message"));
		describeJobsResponse.setTotalCount(_ctx.integerValue("DescribeJobsResponse.TotalCount"));
		describeJobsResponse.setPageSize(_ctx.integerValue("DescribeJobsResponse.PageSize"));
		describeJobsResponse.setPageNumber(_ctx.integerValue("DescribeJobsResponse.PageNumber"));

		List<Job> jobs = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobsResponse.Jobs.Length"); i++) {
			Job job = new Job();
			job.setCreatedTime(_ctx.longValue("DescribeJobsResponse.Jobs["+ i +"].CreatedTime"));
			job.setUpdatedTime(_ctx.longValue("DescribeJobsResponse.Jobs["+ i +"].UpdatedTime"));
			job.setJobId(_ctx.stringValue("DescribeJobsResponse.Jobs["+ i +"].JobId"));
			job.setClientId(_ctx.stringValue("DescribeJobsResponse.Jobs["+ i +"].ClientId"));
			job.setVaultId(_ctx.stringValue("DescribeJobsResponse.Jobs["+ i +"].VaultId"));
			job.setInstanceId(_ctx.stringValue("DescribeJobsResponse.Jobs["+ i +"].InstanceId"));
			job.setJobName(_ctx.stringValue("DescribeJobsResponse.Jobs["+ i +"].JobName"));
			job.setJobType(_ctx.stringValue("DescribeJobsResponse.Jobs["+ i +"].JobType"));
			job.setJobStatus(_ctx.stringValue("DescribeJobsResponse.Jobs["+ i +"].JobStatus"));
			job.setSource(_ctx.stringValue("DescribeJobsResponse.Jobs["+ i +"].Source"));
			job.setPolicyId(_ctx.stringValue("DescribeJobsResponse.Jobs["+ i +"].PolicyId"));
			job.setRetention(_ctx.longValue("DescribeJobsResponse.Jobs["+ i +"].Retention"));
			job.setSchedule(_ctx.stringValue("DescribeJobsResponse.Jobs["+ i +"].Schedule"));
			job.setLastSnapshotId(_ctx.stringValue("DescribeJobsResponse.Jobs["+ i +"].LastSnapshotId"));
			job.setCurrentSnapshotId(_ctx.stringValue("DescribeJobsResponse.Jobs["+ i +"].CurrentSnapshotId"));
			job.setDuration(_ctx.longValue("DescribeJobsResponse.Jobs["+ i +"].Duration"));
			job.setCompleteTime(_ctx.longValue("DescribeJobsResponse.Jobs["+ i +"].CompleteTime"));
			job.setSnapshotStatus(_ctx.stringValue("DescribeJobsResponse.Jobs["+ i +"].SnapshotStatus"));
			job.setBytesDone(_ctx.longValue("DescribeJobsResponse.Jobs["+ i +"].BytesDone"));
			job.setBytesTotal(_ctx.longValue("DescribeJobsResponse.Jobs["+ i +"].BytesTotal"));
			job.setItemsDone(_ctx.longValue("DescribeJobsResponse.Jobs["+ i +"].ItemsDone"));
			job.setItemsTotal(_ctx.longValue("DescribeJobsResponse.Jobs["+ i +"].ItemsTotal"));
			job.setActualBytes(_ctx.longValue("DescribeJobsResponse.Jobs["+ i +"].ActualBytes"));
			job.setExitCode(_ctx.stringValue("DescribeJobsResponse.Jobs["+ i +"].ExitCode"));
			job.setLastRunTime(_ctx.longValue("DescribeJobsResponse.Jobs["+ i +"].LastRunTime"));
			job.setJobOption(_ctx.stringValue("DescribeJobsResponse.Jobs["+ i +"].JobOption"));
			job.setSourceType(_ctx.stringValue("DescribeJobsResponse.Jobs["+ i +"].SourceType"));
			job.setErrorCount(_ctx.longValue("DescribeJobsResponse.Jobs["+ i +"].ErrorCount"));
			job.setInclude(_ctx.stringValue("DescribeJobsResponse.Jobs["+ i +"].Include"));
			job.setExclude(_ctx.stringValue("DescribeJobsResponse.Jobs["+ i +"].Exclude"));

			jobs.add(job);
		}
		describeJobsResponse.setJobs(jobs);
	 
	 	return describeJobsResponse;
	}
}