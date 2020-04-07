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

import com.aliyuncs.hbr.model.v20170908.DescribeBackupJobsResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeBackupJobsResponse.BackupJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupJobsResponseUnmarshaller {

	public static DescribeBackupJobsResponse unmarshall(DescribeBackupJobsResponse describeBackupJobsResponse, UnmarshallerContext _ctx) {
		
		describeBackupJobsResponse.setRequestId(_ctx.stringValue("DescribeBackupJobsResponse.RequestId"));
		describeBackupJobsResponse.setSuccess(_ctx.booleanValue("DescribeBackupJobsResponse.Success"));
		describeBackupJobsResponse.setCode(_ctx.stringValue("DescribeBackupJobsResponse.Code"));
		describeBackupJobsResponse.setMessage(_ctx.stringValue("DescribeBackupJobsResponse.Message"));
		describeBackupJobsResponse.setTotalCount(_ctx.integerValue("DescribeBackupJobsResponse.TotalCount"));
		describeBackupJobsResponse.setPageSize(_ctx.integerValue("DescribeBackupJobsResponse.PageSize"));
		describeBackupJobsResponse.setPageNumber(_ctx.integerValue("DescribeBackupJobsResponse.PageNumber"));

		List<BackupJob> backupJobs = new ArrayList<BackupJob>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupJobsResponse.BackupJobs.Length"); i++) {
			BackupJob backupJob = new BackupJob();
			backupJob.setJobId(_ctx.stringValue("DescribeBackupJobsResponse.BackupJobs["+ i +"].JobId"));
			backupJob.setJobName(_ctx.stringValue("DescribeBackupJobsResponse.BackupJobs["+ i +"].JobName"));
			backupJob.setJobStatus(_ctx.stringValue("DescribeBackupJobsResponse.BackupJobs["+ i +"].JobStatus"));
			backupJob.setSource(_ctx.stringValue("DescribeBackupJobsResponse.BackupJobs["+ i +"].Source"));
			backupJob.setRetention(_ctx.longValue("DescribeBackupJobsResponse.BackupJobs["+ i +"].Retention"));
			backupJob.setSchedule(_ctx.stringValue("DescribeBackupJobsResponse.BackupJobs["+ i +"].Schedule"));
			backupJob.setClientId(_ctx.stringValue("DescribeBackupJobsResponse.BackupJobs["+ i +"].ClientId"));
			backupJob.setInstanceId(_ctx.stringValue("DescribeBackupJobsResponse.BackupJobs["+ i +"].InstanceId"));
			backupJob.setInstanceName(_ctx.stringValue("DescribeBackupJobsResponse.BackupJobs["+ i +"].InstanceName"));
			backupJob.setPercentage(_ctx.integerValue("DescribeBackupJobsResponse.BackupJobs["+ i +"].Percentage"));
			backupJob.setSpeed(_ctx.longValue("DescribeBackupJobsResponse.BackupJobs["+ i +"].Speed"));
			backupJob.setJobOption(_ctx.stringValue("DescribeBackupJobsResponse.BackupJobs["+ i +"].JobOption"));
			backupJob.setOsType(_ctx.stringValue("DescribeBackupJobsResponse.BackupJobs["+ i +"].OsType"));
			backupJob.setErrorType(_ctx.stringValue("DescribeBackupJobsResponse.BackupJobs["+ i +"].ErrorType"));
			backupJob.setVaultId(_ctx.stringValue("DescribeBackupJobsResponse.BackupJobs["+ i +"].VaultId"));
			backupJob.setGatewayId(_ctx.stringValue("DescribeBackupJobsResponse.BackupJobs["+ i +"].GatewayId"));
			backupJob.setGatewayName(_ctx.stringValue("DescribeBackupJobsResponse.BackupJobs["+ i +"].GatewayName"));
			backupJob.setInclude(_ctx.stringValue("DescribeBackupJobsResponse.BackupJobs["+ i +"].Include"));
			backupJob.setExclude(_ctx.stringValue("DescribeBackupJobsResponse.BackupJobs["+ i +"].Exclude"));

			backupJobs.add(backupJob);
		}
		describeBackupJobsResponse.setBackupJobs(backupJobs);
	 
	 	return describeBackupJobsResponse;
	}
}