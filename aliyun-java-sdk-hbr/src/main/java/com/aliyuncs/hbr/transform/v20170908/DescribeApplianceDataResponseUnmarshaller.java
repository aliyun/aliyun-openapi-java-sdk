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

import com.aliyuncs.hbr.model.v20170908.DescribeApplianceDataResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeApplianceDataResponse.BackupHistory;
import com.aliyuncs.hbr.model.v20170908.DescribeApplianceDataResponse.BackupJob;
import com.aliyuncs.hbr.model.v20170908.DescribeApplianceDataResponse.RestoreHistory;
import com.aliyuncs.hbr.model.v20170908.DescribeApplianceDataResponse.RestoreJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApplianceDataResponseUnmarshaller {

	public static DescribeApplianceDataResponse unmarshall(DescribeApplianceDataResponse describeApplianceDataResponse, UnmarshallerContext _ctx) {
		
		describeApplianceDataResponse.setRequestId(_ctx.stringValue("DescribeApplianceDataResponse.RequestId"));
		describeApplianceDataResponse.setSuccess(_ctx.booleanValue("DescribeApplianceDataResponse.Success"));
		describeApplianceDataResponse.setCode(_ctx.stringValue("DescribeApplianceDataResponse.Code"));
		describeApplianceDataResponse.setMessage(_ctx.stringValue("DescribeApplianceDataResponse.Message"));
		describeApplianceDataResponse.setTotalCount(_ctx.integerValue("DescribeApplianceDataResponse.TotalCount"));
		describeApplianceDataResponse.setPageNumber(_ctx.integerValue("DescribeApplianceDataResponse.PageNumber"));
		describeApplianceDataResponse.setPageSize(_ctx.integerValue("DescribeApplianceDataResponse.PageSize"));

		List<BackupJob> backupJobList = new ArrayList<BackupJob>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplianceDataResponse.BackupJobList.Length"); i++) {
			BackupJob backupJob = new BackupJob();
			backupJob.setApplianceId(_ctx.stringValue("DescribeApplianceDataResponse.BackupJobList["+ i +"].ApplianceId"));
			backupJob.setJobName(_ctx.stringValue("DescribeApplianceDataResponse.BackupJobList["+ i +"].JobName"));
			backupJob.setJobId(_ctx.stringValue("DescribeApplianceDataResponse.BackupJobList["+ i +"].JobId"));
			backupJob.setStatus(_ctx.stringValue("DescribeApplianceDataResponse.BackupJobList["+ i +"].Status"));
			backupJob.setModule(_ctx.stringValue("DescribeApplianceDataResponse.BackupJobList["+ i +"].Module"));
			backupJob.setHostId(_ctx.stringValue("DescribeApplianceDataResponse.BackupJobList["+ i +"].HostId"));
			backupJob.setResourceId(_ctx.stringValue("DescribeApplianceDataResponse.BackupJobList["+ i +"].ResourceId"));
			backupJob.setSchedule(_ctx.stringValue("DescribeApplianceDataResponse.BackupJobList["+ i +"].Schedule"));
			backupJob.setSource(_ctx.stringValue("DescribeApplianceDataResponse.BackupJobList["+ i +"].Source"));
			backupJob.setCreatedTime(_ctx.longValue("DescribeApplianceDataResponse.BackupJobList["+ i +"].CreatedTime"));
			backupJob.setUpdatedTime(_ctx.longValue("DescribeApplianceDataResponse.BackupJobList["+ i +"].UpdatedTime"));
			backupJob.setStorageId(_ctx.stringValue("DescribeApplianceDataResponse.BackupJobList["+ i +"].StorageId"));
			backupJob.setBackupType(_ctx.stringValue("DescribeApplianceDataResponse.BackupJobList["+ i +"].BackupType"));

			backupJobList.add(backupJob);
		}
		describeApplianceDataResponse.setBackupJobList(backupJobList);

		List<BackupHistory> backupHistoryList = new ArrayList<BackupHistory>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplianceDataResponse.BackupHistoryList.Length"); i++) {
			BackupHistory backupHistory = new BackupHistory();
			backupHistory.setTenantName(_ctx.stringValue("DescribeApplianceDataResponse.BackupHistoryList["+ i +"].TenantName"));
			backupHistory.setJobName(_ctx.stringValue("DescribeApplianceDataResponse.BackupHistoryList["+ i +"].JobName"));
			backupHistory.setHistoryId(_ctx.stringValue("DescribeApplianceDataResponse.BackupHistoryList["+ i +"].HistoryId"));
			backupHistory.setJobId(_ctx.stringValue("DescribeApplianceDataResponse.BackupHistoryList["+ i +"].JobId"));
			backupHistory.setStatus(_ctx.stringValue("DescribeApplianceDataResponse.BackupHistoryList["+ i +"].Status"));
			backupHistory.setModule(_ctx.stringValue("DescribeApplianceDataResponse.BackupHistoryList["+ i +"].Module"));
			backupHistory.setHostId(_ctx.stringValue("DescribeApplianceDataResponse.BackupHistoryList["+ i +"].HostId"));
			backupHistory.setCreatedTime(_ctx.longValue("DescribeApplianceDataResponse.BackupHistoryList["+ i +"].CreatedTime"));
			backupHistory.setUpdatedTime(_ctx.longValue("DescribeApplianceDataResponse.BackupHistoryList["+ i +"].UpdatedTime"));
			backupHistory.setResourceId(_ctx.stringValue("DescribeApplianceDataResponse.BackupHistoryList["+ i +"].ResourceId"));
			backupHistory.setSource(_ctx.stringValue("DescribeApplianceDataResponse.BackupHistoryList["+ i +"].Source"));
			backupHistory.setStorageId(_ctx.stringValue("DescribeApplianceDataResponse.BackupHistoryList["+ i +"].StorageId"));
			backupHistory.setStartTime(_ctx.longValue("DescribeApplianceDataResponse.BackupHistoryList["+ i +"].StartTime"));
			backupHistory.setCompleteTime(_ctx.longValue("DescribeApplianceDataResponse.BackupHistoryList["+ i +"].CompleteTime"));
			backupHistory.setOriginSize(_ctx.longValue("DescribeApplianceDataResponse.BackupHistoryList["+ i +"].OriginSize"));
			backupHistory.setStorageSize(_ctx.longValue("DescribeApplianceDataResponse.BackupHistoryList["+ i +"].StorageSize"));

			backupHistoryList.add(backupHistory);
		}
		describeApplianceDataResponse.setBackupHistoryList(backupHistoryList);

		List<RestoreJob> restoreJobList = new ArrayList<RestoreJob>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplianceDataResponse.RestoreJobList.Length"); i++) {
			RestoreJob restoreJob = new RestoreJob();
			restoreJob.setTenantName(_ctx.stringValue("DescribeApplianceDataResponse.RestoreJobList["+ i +"].TenantName"));
			restoreJob.setJobName(_ctx.stringValue("DescribeApplianceDataResponse.RestoreJobList["+ i +"].JobName"));
			restoreJob.setJobId(_ctx.stringValue("DescribeApplianceDataResponse.RestoreJobList["+ i +"].JobId"));
			restoreJob.setStatus(_ctx.stringValue("DescribeApplianceDataResponse.RestoreJobList["+ i +"].Status"));
			restoreJob.setModule(_ctx.stringValue("DescribeApplianceDataResponse.RestoreJobList["+ i +"].Module"));
			restoreJob.setHostId(_ctx.stringValue("DescribeApplianceDataResponse.RestoreJobList["+ i +"].HostId"));
			restoreJob.setResourceId(_ctx.stringValue("DescribeApplianceDataResponse.RestoreJobList["+ i +"].ResourceId"));
			restoreJob.setSchedule(_ctx.stringValue("DescribeApplianceDataResponse.RestoreJobList["+ i +"].Schedule"));
			restoreJob.setCreatedTime(_ctx.longValue("DescribeApplianceDataResponse.RestoreJobList["+ i +"].CreatedTime"));
			restoreJob.setUpdatedTime(_ctx.longValue("DescribeApplianceDataResponse.RestoreJobList["+ i +"].UpdatedTime"));
			restoreJob.setSource(_ctx.stringValue("DescribeApplianceDataResponse.RestoreJobList["+ i +"].Source"));
			restoreJob.setStorageId(_ctx.stringValue("DescribeApplianceDataResponse.RestoreJobList["+ i +"].StorageId"));
			restoreJob.setRestoreType(_ctx.stringValue("DescribeApplianceDataResponse.RestoreJobList["+ i +"].RestoreType"));

			restoreJobList.add(restoreJob);
		}
		describeApplianceDataResponse.setRestoreJobList(restoreJobList);

		List<RestoreHistory> restoreHistoryList = new ArrayList<RestoreHistory>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplianceDataResponse.RestoreHistoryList.Length"); i++) {
			RestoreHistory restoreHistory = new RestoreHistory();
			restoreHistory.setTenantName(_ctx.stringValue("DescribeApplianceDataResponse.RestoreHistoryList["+ i +"].TenantName"));
			restoreHistory.setJobName(_ctx.stringValue("DescribeApplianceDataResponse.RestoreHistoryList["+ i +"].JobName"));
			restoreHistory.setHistoryId(_ctx.stringValue("DescribeApplianceDataResponse.RestoreHistoryList["+ i +"].HistoryId"));
			restoreHistory.setJobId(_ctx.stringValue("DescribeApplianceDataResponse.RestoreHistoryList["+ i +"].JobId"));
			restoreHistory.setModule(_ctx.stringValue("DescribeApplianceDataResponse.RestoreHistoryList["+ i +"].Module"));
			restoreHistory.setHostId(_ctx.stringValue("DescribeApplianceDataResponse.RestoreHistoryList["+ i +"].HostId"));
			restoreHistory.setResourceId(_ctx.stringValue("DescribeApplianceDataResponse.RestoreHistoryList["+ i +"].ResourceId"));
			restoreHistory.setSource(_ctx.stringValue("DescribeApplianceDataResponse.RestoreHistoryList["+ i +"].Source"));
			restoreHistory.setTarget(_ctx.stringValue("DescribeApplianceDataResponse.RestoreHistoryList["+ i +"].Target"));
			restoreHistory.setStartTime(_ctx.longValue("DescribeApplianceDataResponse.RestoreHistoryList["+ i +"].StartTime"));
			restoreHistory.setCompleteTime(_ctx.longValue("DescribeApplianceDataResponse.RestoreHistoryList["+ i +"].CompleteTime"));
			restoreHistory.setRestoredSize(_ctx.longValue("DescribeApplianceDataResponse.RestoreHistoryList["+ i +"].RestoredSize"));
			restoreHistory.setCreatedTime(_ctx.longValue("DescribeApplianceDataResponse.RestoreHistoryList["+ i +"].CreatedTime"));
			restoreHistory.setUpdatedTime(_ctx.longValue("DescribeApplianceDataResponse.RestoreHistoryList["+ i +"].UpdatedTime"));
			restoreHistory.setStatus(_ctx.stringValue("DescribeApplianceDataResponse.RestoreHistoryList["+ i +"].Status"));

			restoreHistoryList.add(restoreHistory);
		}
		describeApplianceDataResponse.setRestoreHistoryList(restoreHistoryList);
	 
	 	return describeApplianceDataResponse;
	}
}