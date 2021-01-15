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

import com.aliyuncs.hbr.model.v20170908.DescribeBackupJobs2Response;
import com.aliyuncs.hbr.model.v20170908.DescribeBackupJobs2Response.BackupJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupJobs2ResponseUnmarshaller {

	public static DescribeBackupJobs2Response unmarshall(DescribeBackupJobs2Response describeBackupJobs2Response, UnmarshallerContext _ctx) {
		
		describeBackupJobs2Response.setRequestId(_ctx.stringValue("DescribeBackupJobs2Response.RequestId"));
		describeBackupJobs2Response.setSuccess(_ctx.booleanValue("DescribeBackupJobs2Response.Success"));
		describeBackupJobs2Response.setCode(_ctx.stringValue("DescribeBackupJobs2Response.Code"));
		describeBackupJobs2Response.setMessage(_ctx.stringValue("DescribeBackupJobs2Response.Message"));
		describeBackupJobs2Response.setTotalCount(_ctx.longValue("DescribeBackupJobs2Response.TotalCount"));
		describeBackupJobs2Response.setPageSize(_ctx.integerValue("DescribeBackupJobs2Response.PageSize"));
		describeBackupJobs2Response.setPageNumber(_ctx.integerValue("DescribeBackupJobs2Response.PageNumber"));
		describeBackupJobs2Response.setDiskId(_ctx.stringValue("DescribeBackupJobs2Response.DiskId"));

		List<BackupJob> backupJobs = new ArrayList<BackupJob>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupJobs2Response.BackupJobs.Length"); i++) {
			BackupJob backupJob = new BackupJob();
			backupJob.setJobId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].JobId"));
			backupJob.setSourceType(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].SourceType"));
			backupJob.setVaultId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].VaultId"));
			backupJob.setBackupSourceGroupId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].BackupSourceGroupId"));
			backupJob.setJobName(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].JobName"));
			backupJob.setBackupType(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].BackupType"));
			backupJob.setStatus(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Status"));
			backupJob.setCompleteTime(_ctx.longValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].CompleteTime"));
			backupJob.setProgress(_ctx.integerValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Progress"));
			backupJob.setErrorMessage(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].ErrorMessage"));
			backupJob.setParentId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].ParentId"));
			backupJob.setClusterId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].ClusterId"));
			backupJob.setDatabaseName(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].DatabaseName"));
			backupJob.setCreatedTime(_ctx.longValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].CreatedTime"));
			backupJob.setUpdatedTime(_ctx.longValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].UpdatedTime"));
			backupJob.setStartTime(_ctx.longValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].StartTime"));
			backupJob.setBytesDone(_ctx.longValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].BytesDone"));
			backupJob.setBytesTotal(_ctx.longValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].BytesTotal"));
			backupJob.setFileSystemId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].FileSystemId"));
			backupJob.setCreateTime(_ctx.longValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].CreateTime"));
			backupJob.setBucket(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Bucket"));
			backupJob.setPrefix(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Prefix"));
			backupJob.setPlanId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].PlanId"));
			backupJob.setInstanceId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].InstanceId"));
			backupJob.setDetail(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail"));
			backupJob.setDiskId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].DiskId"));
			backupJob.setClientId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].ClientId"));
			backupJob.setSpeedLimit(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].SpeedLimit"));
			backupJob.setOptions(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Options"));
			backupJob.setInclude(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Include"));
			backupJob.setExclude(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Exclude"));
			backupJob.setDataSourceId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].DataSourceId"));
			backupJob.setActualBytes(_ctx.longValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].ActualBytes"));
			backupJob.setItemsDone(_ctx.longValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].ItemsDone"));
			backupJob.setItemsTotal(_ctx.longValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].ItemsTotal"));
			backupJob.setActualItems(_ctx.longValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].ActualItems"));
			backupJob.setErrorFile(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].ErrorFile"));

			List<String> paths = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Paths.Length"); j++) {
				paths.add(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Paths["+ j +"]"));
			}
			backupJob.setPaths(paths);

			backupJobs.add(backupJob);
		}
		describeBackupJobs2Response.setBackupJobs(backupJobs);
	 
	 	return describeBackupJobs2Response;
	}
}