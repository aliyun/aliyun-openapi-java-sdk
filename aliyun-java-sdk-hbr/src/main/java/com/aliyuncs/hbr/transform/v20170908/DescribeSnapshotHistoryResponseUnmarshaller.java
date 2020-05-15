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

import com.aliyuncs.hbr.model.v20170908.DescribeSnapshotHistoryResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeSnapshotHistoryResponse.Snapshot;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSnapshotHistoryResponseUnmarshaller {

	public static DescribeSnapshotHistoryResponse unmarshall(DescribeSnapshotHistoryResponse describeSnapshotHistoryResponse, UnmarshallerContext _ctx) {
		
		describeSnapshotHistoryResponse.setRequestId(_ctx.stringValue("DescribeSnapshotHistoryResponse.RequestId"));
		describeSnapshotHistoryResponse.setSuccess(_ctx.booleanValue("DescribeSnapshotHistoryResponse.Success"));
		describeSnapshotHistoryResponse.setCode(_ctx.stringValue("DescribeSnapshotHistoryResponse.Code"));
		describeSnapshotHistoryResponse.setMessage(_ctx.stringValue("DescribeSnapshotHistoryResponse.Message"));
		describeSnapshotHistoryResponse.setTotalCount(_ctx.integerValue("DescribeSnapshotHistoryResponse.TotalCount"));
		describeSnapshotHistoryResponse.setPageSize(_ctx.integerValue("DescribeSnapshotHistoryResponse.PageSize"));
		describeSnapshotHistoryResponse.setPageNumber(_ctx.integerValue("DescribeSnapshotHistoryResponse.PageNumber"));

		List<Snapshot> snapshots = new ArrayList<Snapshot>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSnapshotHistoryResponse.Snapshots.Length"); i++) {
			Snapshot snapshot = new Snapshot();
			snapshot.setCreatedTime(_ctx.longValue("DescribeSnapshotHistoryResponse.Snapshots["+ i +"].CreatedTime"));
			snapshot.setUpdatedTime(_ctx.longValue("DescribeSnapshotHistoryResponse.Snapshots["+ i +"].UpdatedTime"));
			snapshot.setSnapshotId(_ctx.stringValue("DescribeSnapshotHistoryResponse.Snapshots["+ i +"].SnapshotId"));
			snapshot.setClientId(_ctx.stringValue("DescribeSnapshotHistoryResponse.Snapshots["+ i +"].ClientId"));
			snapshot.setVaultId(_ctx.stringValue("DescribeSnapshotHistoryResponse.Snapshots["+ i +"].VaultId"));
			snapshot.setJobId(_ctx.stringValue("DescribeSnapshotHistoryResponse.Snapshots["+ i +"].JobId"));
			snapshot.setSnapshotHash(_ctx.stringValue("DescribeSnapshotHistoryResponse.Snapshots["+ i +"].SnapshotHash"));
			snapshot.setSnapshotName(_ctx.stringValue("DescribeSnapshotHistoryResponse.Snapshots["+ i +"].SnapshotName"));
			snapshot.setSourceType(_ctx.stringValue("DescribeSnapshotHistoryResponse.Snapshots["+ i +"].SourceType"));
			snapshot.setSource(_ctx.stringValue("DescribeSnapshotHistoryResponse.Snapshots["+ i +"].Source"));
			snapshot.setParentHash(_ctx.stringValue("DescribeSnapshotHistoryResponse.Snapshots["+ i +"].ParentHash"));
			snapshot.setStatus(_ctx.stringValue("DescribeSnapshotHistoryResponse.Snapshots["+ i +"].Status"));
			snapshot.setSize(_ctx.longValue("DescribeSnapshotHistoryResponse.Snapshots["+ i +"].Size"));
			snapshot.setRetention(_ctx.longValue("DescribeSnapshotHistoryResponse.Snapshots["+ i +"].Retention"));
			snapshot.setSnapshotOption(_ctx.stringValue("DescribeSnapshotHistoryResponse.Snapshots["+ i +"].SnapshotOption"));
			snapshot.setDuration(_ctx.longValue("DescribeSnapshotHistoryResponse.Snapshots["+ i +"].Duration"));
			snapshot.setCompleteTime(_ctx.longValue("DescribeSnapshotHistoryResponse.Snapshots["+ i +"].CompleteTime"));
			snapshot.setErrorCount(_ctx.longValue("DescribeSnapshotHistoryResponse.Snapshots["+ i +"].ErrorCount"));
			snapshot.setBytesDone(_ctx.longValue("DescribeSnapshotHistoryResponse.Snapshots["+ i +"].BytesDone"));
			snapshot.setBytesTotal(_ctx.longValue("DescribeSnapshotHistoryResponse.Snapshots["+ i +"].BytesTotal"));
			snapshot.setItemsDone(_ctx.longValue("DescribeSnapshotHistoryResponse.Snapshots["+ i +"].ItemsDone"));
			snapshot.setItemsTotal(_ctx.longValue("DescribeSnapshotHistoryResponse.Snapshots["+ i +"].ItemsTotal"));
			snapshot.setActualBytes(_ctx.longValue("DescribeSnapshotHistoryResponse.Snapshots["+ i +"].ActualBytes"));
			snapshot.setExitCode(_ctx.stringValue("DescribeSnapshotHistoryResponse.Snapshots["+ i +"].ExitCode"));

			snapshots.add(snapshot);
		}
		describeSnapshotHistoryResponse.setSnapshots(snapshots);
	 
	 	return describeSnapshotHistoryResponse;
	}
}