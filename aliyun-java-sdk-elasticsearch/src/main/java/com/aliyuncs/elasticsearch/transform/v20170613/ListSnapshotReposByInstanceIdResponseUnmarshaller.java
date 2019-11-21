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

package com.aliyuncs.elasticsearch.transform.v20170613;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.ListSnapshotReposByInstanceIdResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListSnapshotReposByInstanceIdResponse.Repo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSnapshotReposByInstanceIdResponseUnmarshaller {

	public static ListSnapshotReposByInstanceIdResponse unmarshall(ListSnapshotReposByInstanceIdResponse listSnapshotReposByInstanceIdResponse, UnmarshallerContext _ctx) {
		
		listSnapshotReposByInstanceIdResponse.setRequestId(_ctx.stringValue("ListSnapshotReposByInstanceIdResponse.RequestId"));

		List<Repo> result = new ArrayList<Repo>();
		for (int i = 0; i < _ctx.lengthValue("ListSnapshotReposByInstanceIdResponse.Result.Length"); i++) {
			Repo repo = new Repo();
			repo.setInstanceId(_ctx.stringValue("ListSnapshotReposByInstanceIdResponse.Result["+ i +"].instanceId"));
			repo.setSnapWarehouse(_ctx.stringValue("ListSnapshotReposByInstanceIdResponse.Result["+ i +"].snapWarehouse"));
			repo.setRepoPath(_ctx.stringValue("ListSnapshotReposByInstanceIdResponse.Result["+ i +"].repoPath"));
			repo.setStatus(_ctx.stringValue("ListSnapshotReposByInstanceIdResponse.Result["+ i +"].status"));

			result.add(repo);
		}
		listSnapshotReposByInstanceIdResponse.setResult(result);
	 
	 	return listSnapshotReposByInstanceIdResponse;
	}
}