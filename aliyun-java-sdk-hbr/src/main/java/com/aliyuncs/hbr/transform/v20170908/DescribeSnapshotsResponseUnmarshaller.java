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

import com.aliyuncs.hbr.model.v20170908.DescribeSnapshotsResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeSnapshotsResponse.Snapshot;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSnapshotsResponseUnmarshaller {

	public static DescribeSnapshotsResponse unmarshall(DescribeSnapshotsResponse describeSnapshotsResponse, UnmarshallerContext _ctx) {
		
		describeSnapshotsResponse.setRequestId(_ctx.stringValue("DescribeSnapshotsResponse.RequestId"));
		describeSnapshotsResponse.setSuccess(_ctx.booleanValue("DescribeSnapshotsResponse.Success"));
		describeSnapshotsResponse.setCode(_ctx.stringValue("DescribeSnapshotsResponse.Code"));
		describeSnapshotsResponse.setMessage(_ctx.stringValue("DescribeSnapshotsResponse.Message"));
		describeSnapshotsResponse.setTotalCount(_ctx.integerValue("DescribeSnapshotsResponse.TotalCount"));
		describeSnapshotsResponse.setPageSize(_ctx.integerValue("DescribeSnapshotsResponse.PageSize"));
		describeSnapshotsResponse.setPageNumber(_ctx.integerValue("DescribeSnapshotsResponse.PageNumber"));

		List<Snapshot> snapshots = new ArrayList<Snapshot>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSnapshotsResponse.Snapshots.Length"); i++) {
			Snapshot snapshot = new Snapshot();
			snapshot.setSnapshotId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotId"));
			snapshot.setClientId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ClientId"));
			snapshot.setVaultId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].VaultId"));
			snapshot.setSnapshotHash(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotHash"));
			snapshot.setDuration(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Duration"));
			snapshot.setCompleteTime(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].CompleteTime"));
			snapshot.setSource(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Source"));
			snapshot.setParentHash(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ParentHash"));
			snapshot.setStatus(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Status"));
			snapshot.setSize(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Size"));
			snapshot.setErrorCount(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ErrorCount"));
			snapshot.setRetention(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Retention"));
			snapshot.setSnapshotName(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotName"));
			snapshot.setBytesDone(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].BytesDone"));
			snapshot.setBytesTotal(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].BytesTotal"));
			snapshot.setItemsDone(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ItemsDone"));
			snapshot.setItemsTotal(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ItemsTotal"));
			snapshot.setActualBytes(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ActualBytes"));
			snapshot.setJobId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].JobId"));
			snapshot.setExitCode(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ExitCode"));
			snapshot.setCreatedTime(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].CreatedTime"));
			snapshot.setUpdatedTime(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].UpdatedTime"));
			snapshot.setSourceType(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceType"));
			snapshot.setSnapshotOption(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotOption"));
			snapshot.setContainerSnapshotId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ContainerSnapshotId"));
			snapshot.setPlanId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].PlanId"));
			snapshot.setSnapshotType(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotType"));
			snapshot.setServerId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ServerId"));
			snapshot.setExtra(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Extra"));
			snapshot.setErrorMessage(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ErrorMessage"));
			snapshot.setErrorFile(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ErrorFile"));
			snapshot.setErrorType(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ErrorType"));

			snapshots.add(snapshot);
		}
		describeSnapshotsResponse.setSnapshots(snapshots);
	 
	 	return describeSnapshotsResponse;
	}
}