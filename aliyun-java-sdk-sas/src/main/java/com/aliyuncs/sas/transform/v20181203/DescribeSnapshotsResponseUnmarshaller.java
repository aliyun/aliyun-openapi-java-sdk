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
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeSnapshotsResponse.PageInfo.CurrentPage"));
		pageInfo.setNextToken(_ctx.stringValue("DescribeSnapshotsResponse.PageInfo.NextToken"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeSnapshotsResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeSnapshotsResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribeSnapshotsResponse.PageInfo.Count"));
		describeSnapshotsResponse.setPageInfo(pageInfo);

		List<BackupSnapshots> snapshots = new ArrayList<BackupSnapshots>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSnapshotsResponse.Snapshots.Length"); i++) {
			BackupSnapshots backupSnapshots = new BackupSnapshots();
			backupSnapshots.setContainerSnapshotId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ContainerSnapshotId"));
			backupSnapshots.setStatus(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Status"));
			backupSnapshots.setSnapshotHash(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotHash"));
			backupSnapshots.setErrorMessage(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ErrorMessage"));
			backupSnapshots.setActualItems(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ActualItems"));
			backupSnapshots.setVaultId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].VaultId"));
			backupSnapshots.setActualBytes(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ActualBytes"));
			backupSnapshots.setSourceType(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceType"));
			backupSnapshots.setExitCode(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ExitCode"));
			backupSnapshots.setClientId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ClientId"));
			backupSnapshots.setItemsDone(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ItemsDone"));
			backupSnapshots.setBytesTotal(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].BytesTotal"));
			backupSnapshots.setRetention(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Retention"));
			backupSnapshots.setErrorType(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ErrorType"));
			backupSnapshots.setCreatedTime(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].CreatedTime"));
			backupSnapshots.setParentSnapshotHash(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ParentSnapshotHash"));
			backupSnapshots.setInstanceId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].InstanceId"));
			backupSnapshots.setPlanId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].PlanId"));
			backupSnapshots.setSource(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Source"));
			backupSnapshots.setRegionId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].RegionId"));
			backupSnapshots.setParentHash(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ParentHash"));
			backupSnapshots.setUuid(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Uuid"));
			backupSnapshots.setErrorFile(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ErrorFile"));
			backupSnapshots.setSnapshotType(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotType"));
			backupSnapshots.setSnapshotName(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotName"));
			backupSnapshots.setSnapshotOption(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotOption"));
			backupSnapshots.setSnapshotId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotId"));
			backupSnapshots.setJobId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].JobId"));
			backupSnapshots.setSize(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Size"));
			backupSnapshots.setPath(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Path"));
			backupSnapshots.setErrorCount(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ErrorCount"));
			backupSnapshots.setDuration(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Duration"));
			backupSnapshots.setItemsTotal(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ItemsTotal"));
			backupSnapshots.setBytesDone(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].BytesDone"));
			backupSnapshots.setClientVersion(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ClientVersion"));

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