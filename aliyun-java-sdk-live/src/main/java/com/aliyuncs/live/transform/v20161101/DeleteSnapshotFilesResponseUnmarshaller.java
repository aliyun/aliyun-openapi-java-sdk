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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DeleteSnapshotFilesResponse;
import com.aliyuncs.live.model.v20161101.DeleteSnapshotFilesResponse.SnapshotDeleteInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteSnapshotFilesResponseUnmarshaller {

	public static DeleteSnapshotFilesResponse unmarshall(DeleteSnapshotFilesResponse deleteSnapshotFilesResponse, UnmarshallerContext _ctx) {
		
		deleteSnapshotFilesResponse.setRequestId(_ctx.stringValue("DeleteSnapshotFilesResponse.RequestId"));
		deleteSnapshotFilesResponse.setSuccessCount(_ctx.integerValue("DeleteSnapshotFilesResponse.SuccessCount"));
		deleteSnapshotFilesResponse.setFailureCount(_ctx.integerValue("DeleteSnapshotFilesResponse.FailureCount"));

		List<SnapshotDeleteInfo> snapshotDeleteInfoList = new ArrayList<SnapshotDeleteInfo>();
		for (int i = 0; i < _ctx.lengthValue("DeleteSnapshotFilesResponse.SnapshotDeleteInfoList.Length"); i++) {
			SnapshotDeleteInfo snapshotDeleteInfo = new SnapshotDeleteInfo();
			snapshotDeleteInfo.setCreateTimestamp(_ctx.longValue("DeleteSnapshotFilesResponse.SnapshotDeleteInfoList["+ i +"].CreateTimestamp"));
			snapshotDeleteInfo.setMessage(_ctx.stringValue("DeleteSnapshotFilesResponse.SnapshotDeleteInfoList["+ i +"].Message"));

			snapshotDeleteInfoList.add(snapshotDeleteInfo);
		}
		deleteSnapshotFilesResponse.setSnapshotDeleteInfoList(snapshotDeleteInfoList);
	 
	 	return deleteSnapshotFilesResponse;
	}
}