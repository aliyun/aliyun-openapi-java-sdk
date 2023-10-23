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

import com.aliyuncs.hbr.model.v20170908.SearchHistoricalSnapshotsResponse;
import com.aliyuncs.hbr.model.v20170908.SearchHistoricalSnapshotsResponse.Snapshot;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchHistoricalSnapshotsResponseUnmarshaller {

	public static SearchHistoricalSnapshotsResponse unmarshall(SearchHistoricalSnapshotsResponse searchHistoricalSnapshotsResponse, UnmarshallerContext _ctx) {
		
		searchHistoricalSnapshotsResponse.setRequestId(_ctx.stringValue("SearchHistoricalSnapshotsResponse.RequestId"));
		searchHistoricalSnapshotsResponse.setNextToken(_ctx.stringValue("SearchHistoricalSnapshotsResponse.NextToken"));
		searchHistoricalSnapshotsResponse.setSuccess(_ctx.booleanValue("SearchHistoricalSnapshotsResponse.Success"));
		searchHistoricalSnapshotsResponse.setLimit(_ctx.integerValue("SearchHistoricalSnapshotsResponse.Limit"));
		searchHistoricalSnapshotsResponse.setCode(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Code"));
		searchHistoricalSnapshotsResponse.setMessage(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Message"));
		searchHistoricalSnapshotsResponse.setTotalCount(_ctx.integerValue("SearchHistoricalSnapshotsResponse.TotalCount"));

		List<Snapshot> snapshots = new ArrayList<Snapshot>();
		for (int i = 0; i < _ctx.lengthValue("SearchHistoricalSnapshotsResponse.Snapshots.Length"); i++) {
			Snapshot snapshot = new Snapshot();
			snapshot.setStatus(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].Status"));
			snapshot.setSnapshotHash(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].SnapshotHash"));
			snapshot.setVaultId(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].VaultId"));
			snapshot.setActualItems(_ctx.longValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].ActualItems"));
			snapshot.setBackupType(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].BackupType"));
			snapshot.setCreateTime(_ctx.longValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].CreateTime"));
			snapshot.setActualBytes(_ctx.longValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].ActualBytes"));
			snapshot.setSourceType(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].SourceType"));
			snapshot.setPrefix(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].Prefix"));
			snapshot.setClientId(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].ClientId"));
			snapshot.setBytesTotal(_ctx.longValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].BytesTotal"));
			snapshot.setItemsDone(_ctx.longValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].ItemsDone"));
			snapshot.setCompleteTime(_ctx.longValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].CompleteTime"));
			snapshot.setRetention(_ctx.longValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].Retention"));
			snapshot.setCreatedTime(_ctx.longValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].CreatedTime"));
			snapshot.setBucket(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].Bucket"));
			snapshot.setParentSnapshotHash(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].ParentSnapshotHash"));
			snapshot.setInstanceId(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].InstanceId"));
			snapshot.setFileSystemId(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].FileSystemId"));
			snapshot.setErrorFile(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].ErrorFile"));
			snapshot.setStartTime(_ctx.longValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].StartTime"));
			snapshot.setUpdatedTime(_ctx.longValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].UpdatedTime"));
			snapshot.setSnapshotId(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].SnapshotId"));
			snapshot.setJobId(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].JobId"));
			snapshot.setPath(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].Path"));
			snapshot.setItemsTotal(_ctx.longValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].ItemsTotal"));
			snapshot.setBytesDone(_ctx.longValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].BytesDone"));
			snapshot.setInstanceName(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].InstanceName"));
			snapshot.setTableName(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].TableName"));
			snapshot.setRangeStart(_ctx.longValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].RangeStart"));
			snapshot.setRangeEnd(_ctx.longValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].RangeEnd"));
			snapshot.setExpireTime(_ctx.longValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].ExpireTime"));
			snapshot.setSourceSnapshotHash(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].SourceSnapshotHash"));
			snapshot.setSourceParentSnapshotHash(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].SourceParentSnapshotHash"));
			snapshot.setStorageClass(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].StorageClass"));
			snapshot.setArchiveTime(_ctx.longValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].ArchiveTime"));
			snapshot.setUseCommonNas(_ctx.booleanValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].UseCommonNas"));
			snapshot.setInclude(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].Include"));
			snapshot.setExclude(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].Exclude"));

			List<String> paths = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].Paths.Length"); j++) {
				paths.add(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].Paths["+ j +"]"));
			}
			snapshot.setPaths(paths);

			snapshots.add(snapshot);
		}
		searchHistoricalSnapshotsResponse.setSnapshots(snapshots);
	 
	 	return searchHistoricalSnapshotsResponse;
	}
}