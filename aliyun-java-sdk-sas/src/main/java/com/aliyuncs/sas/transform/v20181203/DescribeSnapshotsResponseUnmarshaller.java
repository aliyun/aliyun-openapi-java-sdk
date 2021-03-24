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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeSnapshotsResponse;
import com.aliyuncs.sas.model.v20181203.DescribeSnapshotsResponse.BackupSnapshots;
import com.aliyuncs.sas.model.v20181203.DescribeSnapshotsResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSnapshotsResponseUnmarshaller {

	public static DescribeSnapshotsResponse unmarshall(DescribeSnapshotsResponse describeSnapshotsResponse, UnmarshallerContext _ctx) {
		
		describeSnapshotsResponse.setRequestId(_ctx.stringValue("DescribeSnapshotsResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCount(_ctx.integerValue("DescribeSnapshotsResponse.PageInfo.Count"));
		pageInfo.setNextToken(_ctx.stringValue("DescribeSnapshotsResponse.PageInfo.NextToken"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeSnapshotsResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeSnapshotsResponse.PageInfo.TotalCount"));
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeSnapshotsResponse.PageInfo.CurrentPage"));
		describeSnapshotsResponse.setPageInfo(pageInfo);

		List<BackupSnapshots> snapshots = new ArrayList<BackupSnapshots>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSnapshotsResponse.Snapshots.Length"); i++) {
			BackupSnapshots backupSnapshots = new BackupSnapshots();
			backupSnapshots.setSnapshotId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotId"));
			backupSnapshots.setClientId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ClientId"));
			backupSnapshots.setVaultId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].VaultId"));
			backupSnapshots.setSnapshotHash(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotHash"));
			backupSnapshots.setDuration(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Duration"));
			backupSnapshots.setCompleteTime(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].CompleteTime"));
			backupSnapshots.setSource(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Source"));
			backupSnapshots.setParentHash(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ParentHash"));
			backupSnapshots.setStatus(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Status"));
			backupSnapshots.setSize(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Size"));
			backupSnapshots.setErrorCount(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ErrorCount"));
			backupSnapshots.setRetention(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Retention"));
			backupSnapshots.setSnapshotName(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotName"));
			backupSnapshots.setBytesDone(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].BytesDone"));
			backupSnapshots.setBytesTotal(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].BytesTotal"));
			backupSnapshots.setItemsDone(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ItemsDone"));
			backupSnapshots.setItemsTotal(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ItemsTotal"));
			backupSnapshots.setActualBytes(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ActualBytes"));
			backupSnapshots.setJobId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].JobId"));
			backupSnapshots.setExitCode(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ExitCode"));
			backupSnapshots.setCreatedTime(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].CreatedTime"));
			backupSnapshots.setUpdatedTime(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].UpdatedTime"));
			backupSnapshots.setSourceType(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceType"));
			backupSnapshots.setSnapshotOption(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotOption"));
			backupSnapshots.setContainerSnapshotId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ContainerSnapshotId"));
			backupSnapshots.setPlanId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].PlanId"));
			backupSnapshots.setSnapshotType(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotType"));
			backupSnapshots.setServerId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ServerId"));
			backupSnapshots.setExtra(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Extra"));
			backupSnapshots.setErrorMessage(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ErrorMessage"));
			backupSnapshots.setErrorFile(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ErrorFile"));
			backupSnapshots.setErrorType(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ErrorType"));
			backupSnapshots.setUuid(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Uuid"));
			backupSnapshots.setInstanceId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].InstanceId"));
			backupSnapshots.setMachineInfoJson(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].MachineInfoJson"));
			backupSnapshots.setRegionId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].RegionId"));
			backupSnapshots.setBackupType(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].BackupType"));
			backupSnapshots.setParentSnapshotHash(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ParentSnapshotHash"));
			backupSnapshots.setBucket(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Bucket"));
			backupSnapshots.setPrefix(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Prefix"));
			backupSnapshots.setFileSystemId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].FileSystemId"));
			backupSnapshots.setStartTime(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].StartTime"));
			backupSnapshots.setCreateTime(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].CreateTime"));
			backupSnapshots.setActualItems(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ActualItems"));
			backupSnapshots.setPath(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Path"));

			List<String> paths = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Paths.Length"); j++) {
				paths.add(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Paths["+ j +"]"));
			}
			backupSnapshots.setPaths(paths);

			snapshots.add(backupSnapshots);
		}
		describeSnapshotsResponse.setSnapshots(snapshots);
	 
	 	return describeSnapshotsResponse;
	}
}