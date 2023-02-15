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

import com.aliyuncs.hbr.model.v20170908.DescribeUdmSnapshotsResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeUdmSnapshotsResponse.Snapshot;
import com.aliyuncs.hbr.model.v20170908.DescribeUdmSnapshotsResponse.Snapshot.Detail;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUdmSnapshotsResponseUnmarshaller {

	public static DescribeUdmSnapshotsResponse unmarshall(DescribeUdmSnapshotsResponse describeUdmSnapshotsResponse, UnmarshallerContext _ctx) {
		
		describeUdmSnapshotsResponse.setRequestId(_ctx.stringValue("DescribeUdmSnapshotsResponse.RequestId"));
		describeUdmSnapshotsResponse.setCode(_ctx.stringValue("DescribeUdmSnapshotsResponse.Code"));
		describeUdmSnapshotsResponse.setMessage(_ctx.stringValue("DescribeUdmSnapshotsResponse.Message"));
		describeUdmSnapshotsResponse.setTotalCount(_ctx.longValue("DescribeUdmSnapshotsResponse.TotalCount"));
		describeUdmSnapshotsResponse.setSuccess(_ctx.booleanValue("DescribeUdmSnapshotsResponse.Success"));

		List<Snapshot> snapshots = new ArrayList<Snapshot>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUdmSnapshotsResponse.Snapshots.Length"); i++) {
			Snapshot snapshot = new Snapshot();
			snapshot.setStatus(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Status"));
			snapshot.setSnapshotHash(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].SnapshotHash"));
			snapshot.setVaultId(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].VaultId"));
			snapshot.setBackupType(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].BackupType"));
			snapshot.setCreateTime(_ctx.longValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].CreateTime"));
			snapshot.setActualBytes(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].ActualBytes"));
			snapshot.setSourceType(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].SourceType"));
			snapshot.setPrefix(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Prefix"));
			snapshot.setDiskId(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].DiskId"));
			snapshot.setBytesTotal(_ctx.longValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].BytesTotal"));
			snapshot.setNativeSnapshotInfo(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].NativeSnapshotInfo"));
			snapshot.setCompleteTime(_ctx.longValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].CompleteTime"));
			snapshot.setRetention(_ctx.longValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Retention"));
			snapshot.setCreatedTime(_ctx.longValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].CreatedTime"));
			snapshot.setBucket(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Bucket"));
			snapshot.setRealSnapshotTime(_ctx.longValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].RealSnapshotTime"));
			snapshot.setParentSnapshotHash(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].ParentSnapshotHash"));
			snapshot.setInstanceId(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].InstanceId"));
			snapshot.setFileSystemId(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].FileSystemId"));
			snapshot.setStartTime(_ctx.longValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].StartTime"));
			snapshot.setUpdatedTime(_ctx.longValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].UpdatedTime"));
			snapshot.setSnapshotId(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].SnapshotId"));
			snapshot.setJobId(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].JobId"));
			snapshot.setNativeSnapshotId(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].NativeSnapshotId"));
			snapshot.setInstanceGroupId(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].InstanceGroupId"));
			snapshot.setAdvancedRetentionType(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].AdvancedRetentionType"));
			snapshot.setExpireTime(_ctx.longValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].ExpireTime"));

			List<String> paths = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Paths.Length"); j++) {
				paths.add(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Paths["+ j +"]"));
			}
			snapshot.setPaths(paths);

			Detail detail = new Detail();
			detail.setDiskDevName(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Detail.DiskDevName"));
			detail.setDowngradeReason(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Detail.DowngradeReason"));
			detail.setOsDiskId(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Detail.OsDiskId"));
			detail.setOsName(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Detail.OsName"));
			detail.setContainOsDisk(_ctx.booleanValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Detail.ContainOsDisk"));
			detail.setConsistentLevel(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Detail.ConsistentLevel"));
			detail.setVmName(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Detail.VmName"));
			detail.setDiskHbrBackupSnapshotIdWithDeviceMap(_ctx.mapValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Detail.DiskHbrBackupSnapshotIdWithDeviceMap"));
			detail.setNativeSnapshotInfo(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Detail.NativeSnapshotInfo"));
			detail.setDiskHbrSnapshotIdWithDeviceMap(_ctx.mapValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Detail.DiskHbrSnapshotIdWithDeviceMap"));
			detail.setInstanceIdWithDiskIdListMap(_ctx.mapValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Detail.InstanceIdWithDiskIdListMap"));
			detail.setInstanceName(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Detail.InstanceName"));
			detail.setOsType(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Detail.OsType"));
			detail.setPlatform(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Detail.Platform"));
			detail.setOsNameEn(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Detail.OsNameEn"));
			detail.setHostName(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Detail.HostName"));
			detail.setSystemDisk(_ctx.booleanValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Detail.SystemDisk"));
			detail.setSnapshotGroupId(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Detail.SnapshotGroupId"));
			detail.setInstanceType(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Detail.InstanceType"));
			detail.setDiskCategory(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Detail.DiskCategory"));
			detail.setPerformanceLevel(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Detail.PerformanceLevel"));
			detail.setInstantAccess(_ctx.booleanValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Detail.InstantAccess"));

			List<String> diskIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Detail.DiskIdList.Length"); j++) {
				diskIdList.add(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Detail.DiskIdList["+ j +"]"));
			}
			detail.setDiskIdList(diskIdList);

			List<String> nativeSnapshotIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Detail.NativeSnapshotIdList.Length"); j++) {
				nativeSnapshotIdList.add(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Detail.NativeSnapshotIdList["+ j +"]"));
			}
			detail.setNativeSnapshotIdList(nativeSnapshotIdList);
			snapshot.setDetail(detail);

			snapshots.add(snapshot);
		}
		describeUdmSnapshotsResponse.setSnapshots(snapshots);
	 
	 	return describeUdmSnapshotsResponse;
	}
}