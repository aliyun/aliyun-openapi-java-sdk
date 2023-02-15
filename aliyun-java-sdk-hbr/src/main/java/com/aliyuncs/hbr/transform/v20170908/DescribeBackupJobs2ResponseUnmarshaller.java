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
import com.aliyuncs.hbr.model.v20170908.DescribeBackupJobs2Response.BackupJob.Detail;
import com.aliyuncs.hbr.model.v20170908.DescribeBackupJobs2Response.BackupJob.OtsDetail;
import com.aliyuncs.hbr.model.v20170908.DescribeBackupJobs2Response.BackupJob.Report;
import com.aliyuncs.hbr.model.v20170908.DescribeBackupJobs2Response.BackupJob.Source;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupJobs2ResponseUnmarshaller {

	public static DescribeBackupJobs2Response unmarshall(DescribeBackupJobs2Response describeBackupJobs2Response, UnmarshallerContext _ctx) {
		
		describeBackupJobs2Response.setRequestId(_ctx.stringValue("DescribeBackupJobs2Response.RequestId"));
		describeBackupJobs2Response.setSuccess(_ctx.booleanValue("DescribeBackupJobs2Response.Success"));
		describeBackupJobs2Response.setCode(_ctx.stringValue("DescribeBackupJobs2Response.Code"));
		describeBackupJobs2Response.setMessage(_ctx.stringValue("DescribeBackupJobs2Response.Message"));
		describeBackupJobs2Response.setDiskId(_ctx.stringValue("DescribeBackupJobs2Response.DiskId"));
		describeBackupJobs2Response.setPageNumber(_ctx.integerValue("DescribeBackupJobs2Response.PageNumber"));
		describeBackupJobs2Response.setPageSize(_ctx.integerValue("DescribeBackupJobs2Response.PageSize"));
		describeBackupJobs2Response.setTotalCount(_ctx.longValue("DescribeBackupJobs2Response.TotalCount"));

		List<BackupJob> backupJobs = new ArrayList<BackupJob>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupJobs2Response.BackupJobs.Length"); i++) {
			BackupJob backupJob = new BackupJob();
			backupJob.setStatus(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Status"));
			backupJob.setErrorMessage(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].ErrorMessage"));
			backupJob.setActualItems(_ctx.longValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].ActualItems"));
			backupJob.setVaultId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].VaultId"));
			backupJob.setActualBytes(_ctx.longValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].ActualBytes"));
			backupJob.setDataSourceId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].DataSourceId"));
			backupJob.setCreateTime(_ctx.longValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].CreateTime"));
			backupJob.setBackupType(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].BackupType"));
			backupJob.setPrefix(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Prefix"));
			backupJob.setSourceType(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].SourceType"));
			backupJob.setOptions(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Options"));
			backupJob.setDiskId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].DiskId"));
			backupJob.setClientId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].ClientId"));
			backupJob.setItemsDone(_ctx.longValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].ItemsDone"));
			backupJob.setBytesTotal(_ctx.longValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].BytesTotal"));
			backupJob.setExclude(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Exclude"));
			backupJob.setParentId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].ParentId"));
			backupJob.setJobName(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].JobName"));
			backupJob.setDatabaseName(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].DatabaseName"));
			backupJob.setCompleteTime(_ctx.longValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].CompleteTime"));
			backupJob.setCreatedTime(_ctx.longValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].CreatedTime"));
			backupJob.setBucket(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Bucket"));
			backupJob.setClusterId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].ClusterId"));
			backupJob.setProgress(_ctx.integerValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Progress"));
			backupJob.setSpeedLimit(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].SpeedLimit"));
			backupJob.setInstanceId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].InstanceId"));
			backupJob.setPlanId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].PlanId"));
			backupJob.setBackupSourceGroupId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].BackupSourceGroupId"));
			backupJob.setFileSystemId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].FileSystemId"));
			backupJob.setErrorFile(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].ErrorFile"));
			backupJob.setStartTime(_ctx.longValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].StartTime"));
			backupJob.setUpdatedTime(_ctx.longValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].UpdatedTime"));
			backupJob.setJobId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].JobId"));
			backupJob.setItemsTotal(_ctx.longValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].ItemsTotal"));
			backupJob.setInclude(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Include"));
			backupJob.setBytesDone(_ctx.longValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].BytesDone"));
			backupJob.setInstanceName(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].InstanceName"));
			backupJob.setSpeed(_ctx.longValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Speed"));
			backupJob.setTableName(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].TableName"));
			backupJob.setCrossAccountType(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].CrossAccountType"));
			backupJob.setCrossAccountUserId(_ctx.longValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].CrossAccountUserId"));
			backupJob.setCrossAccountRoleName(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].CrossAccountRoleName"));

			List<String> paths = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Paths.Length"); j++) {
				paths.add(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Paths["+ j +"]"));
			}
			backupJob.setPaths(paths);

			Detail detail = new Detail();
			detail.setDowngradeReason(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.DowngradeReason"));
			detail.setBackupVaultId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.BackupVaultId"));
			detail.setOsName(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.OsName"));
			detail.setGroupSnapshot(_ctx.booleanValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.GroupSnapshot"));
			detail.setDoCopy(_ctx.booleanValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.DoCopy"));
			detail.setUdmEcsDiskSnapshotId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.UdmEcsDiskSnapshotId"));
			detail.setDestinationRegionId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.DestinationRegionId"));
			detail.setNativeSnapshotRetention(_ctx.longValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.NativeSnapshotRetention"));
			detail.setDoBackup(_ctx.booleanValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.DoBackup"));
			detail.setInstanceName(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.InstanceName"));
			detail.setJobDetail(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.JobDetail"));
			detail.setPlatform(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.Platform"));
			detail.setOsNameEn(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.OsNameEn"));
			detail.setDestinationNativeSnapshotId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.DestinationNativeSnapshotId"));
			detail.setDestinationNativeSnapshotProgress(_ctx.integerValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.DestinationNativeSnapshotProgress"));
			detail.setUdmEcsDiskHbrSnapshotId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.UdmEcsDiskHbrSnapshotId"));
			detail.setDiskDevName(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.DiskDevName"));
			detail.setStage(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.Stage"));
			detail.setSnapshotGroupId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.SnapshotGroupId"));
			detail.setDestinationNativeSnapshotStatus(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.DestinationNativeSnapshotStatus"));
			detail.setDiskSize(_ctx.longValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.DiskSize"));
			detail.setConsistentLevel(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.ConsistentLevel"));
			detail.setBackupRetention(_ctx.longValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.BackupRetention"));
			detail.setDestinationRetention(_ctx.longValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.DestinationRetention"));
			detail.setStartTime(_ctx.longValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.StartTime"));
			detail.setDestinationSnapshotId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.DestinationSnapshotId"));
			detail.setDiskHbrSnapshotIdWithDeviceMap(_ctx.mapValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.DiskHbrSnapshotIdWithDeviceMap"));
			detail.setOsType(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.OsType"));
			detail.setDestinationNativeSnapshotErrorMessage(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.DestinationNativeSnapshotErrorMessage"));
			detail.setHbrSnapshotId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.HbrSnapshotId"));
			detail.setNativeSnapshotId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.NativeSnapshotId"));
			detail.setSystemDisk(_ctx.booleanValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.SystemDisk"));
			detail.setNativeSnapshotStatus(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.NativeSnapshotStatus"));
			detail.setInstanceInfos(_ctx.mapValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.InstanceInfos"));

			List<String> diskHbrSnapshotIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.DiskHbrSnapshotIdList.Length"); j++) {
				diskHbrSnapshotIdList.add(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.DiskHbrSnapshotIdList["+ j +"]"));
			}
			detail.setDiskHbrSnapshotIdList(diskHbrSnapshotIdList);

			List<String> diskIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.DiskIdList.Length"); j++) {
				diskIdList.add(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.DiskIdList["+ j +"]"));
			}
			detail.setDiskIdList(diskIdList);

			List<String> diskNativeSnapshotIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.DiskNativeSnapshotIdList.Length"); j++) {
				diskNativeSnapshotIdList.add(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.DiskNativeSnapshotIdList["+ j +"]"));
			}
			detail.setDiskNativeSnapshotIdList(diskNativeSnapshotIdList);

			List<String> excludeDiskIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.ExcludeDiskIdList.Length"); j++) {
				excludeDiskIdList.add(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Detail.ExcludeDiskIdList["+ j +"]"));
			}
			detail.setExcludeDiskIdList(excludeDiskIdList);
			backupJob.setDetail(detail);

			OtsDetail otsDetail = new OtsDetail();

			List<String> tableNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].OtsDetail.TableNames.Length"); j++) {
				tableNames.add(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].OtsDetail.TableNames["+ j +"]"));
			}
			otsDetail.setTableNames(tableNames);
			backupJob.setOtsDetail(otsDetail);

			Report report = new Report();
			report.setTotalFiles(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Report.TotalFiles"));
			report.setSuccessFiles(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Report.SuccessFiles"));
			report.setFailedFiles(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Report.FailedFiles"));
			report.setSkippedFiles(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Report.SkippedFiles"));
			report.setReportTaskStatus(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Report.ReportTaskStatus"));
			backupJob.setReport(report);

			List<Source> sources = new ArrayList<Source>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Sources.Length"); j++) {
				Source source = new Source();
				source.setResourceType(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Sources["+ j +"].ResourceType"));
				source.setBackupMethod(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Sources["+ j +"].BackupMethod"));
				source.setResourceId(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Sources["+ j +"].ResourceId"));
				source.setResourceInfo(_ctx.stringValue("DescribeBackupJobs2Response.BackupJobs["+ i +"].Sources["+ j +"].ResourceInfo"));

				sources.add(source);
			}
			backupJob.setSources(sources);

			backupJobs.add(backupJob);
		}
		describeBackupJobs2Response.setBackupJobs(backupJobs);
	 
	 	return describeBackupJobs2Response;
	}
}