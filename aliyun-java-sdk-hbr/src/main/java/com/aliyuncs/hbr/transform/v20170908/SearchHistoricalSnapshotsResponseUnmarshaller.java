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
		searchHistoricalSnapshotsResponse.setSuccess(_ctx.booleanValue("SearchHistoricalSnapshotsResponse.Success"));
		searchHistoricalSnapshotsResponse.setCode(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Code"));
		searchHistoricalSnapshotsResponse.setMessage(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Message"));
		searchHistoricalSnapshotsResponse.setLimit(_ctx.integerValue("SearchHistoricalSnapshotsResponse.Limit"));
		searchHistoricalSnapshotsResponse.setNextToken(_ctx.stringValue("SearchHistoricalSnapshotsResponse.NextToken"));
		searchHistoricalSnapshotsResponse.setTotalCount(_ctx.integerValue("SearchHistoricalSnapshotsResponse.TotalCount"));

		List<Snapshot> snapshots = new ArrayList<Snapshot>();
		for (int i = 0; i < _ctx.lengthValue("SearchHistoricalSnapshotsResponse.Snapshots.Length"); i++) {
			Snapshot snapshot = new Snapshot();
			snapshot.setCreatedTime(_ctx.longValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].CreatedTime"));
			snapshot.setUpdatedTime(_ctx.longValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].UpdatedTime"));
			snapshot.setSnapshotId(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].SnapshotId"));
			snapshot.setSourceType(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].SourceType"));
			snapshot.setJobId(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].JobId"));
			snapshot.setBackupType(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].BackupType"));
			snapshot.setStatus(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].Status"));
			snapshot.setSnapshotHash(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].SnapshotHash"));
			snapshot.setParentSnapshotHash(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].ParentSnapshotHash"));
			snapshot.setStartTime(_ctx.longValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].StartTime"));
			snapshot.setCompleteTime(_ctx.longValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].CompleteTime"));
			snapshot.setRetention(_ctx.longValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].Retention"));
			snapshot.setBytesTotal(_ctx.longValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].BytesTotal"));
			snapshot.setFileSystemId(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].FileSystemId"));
			snapshot.setCreateTime(_ctx.longValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].CreateTime"));
			snapshot.setBucket(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].Bucket"));
			snapshot.setPrefix(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].Prefix"));
			snapshot.setInstanceId(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].InstanceId"));
			snapshot.setPath(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].Path"));
			snapshot.setClientId(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].ClientId"));
			snapshot.setBytesDone(_ctx.longValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].BytesDone"));
			snapshot.setActualBytes(_ctx.longValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].ActualBytes"));
			snapshot.setItemsDone(_ctx.longValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].ItemsDone"));
			snapshot.setItemsTotal(_ctx.longValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].ItemsTotal"));
			snapshot.setActualItems(_ctx.longValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].ActualItems"));
			snapshot.setErrorFile(_ctx.stringValue("SearchHistoricalSnapshotsResponse.Snapshots["+ i +"].ErrorFile"));

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