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

import com.aliyuncs.elasticsearch.model.v20170613.ListAlternativeSnapshotReposResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListAlternativeSnapshotReposResponse.Repo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAlternativeSnapshotReposResponseUnmarshaller {

	public static ListAlternativeSnapshotReposResponse unmarshall(ListAlternativeSnapshotReposResponse listAlternativeSnapshotReposResponse, UnmarshallerContext _ctx) {
		
		listAlternativeSnapshotReposResponse.setRequestId(_ctx.stringValue("ListAlternativeSnapshotReposResponse.RequestId"));

		List<Repo> result = new ArrayList<Repo>();
		for (int i = 0; i < _ctx.lengthValue("ListAlternativeSnapshotReposResponse.Result.Length"); i++) {
			Repo repo = new Repo();
			repo.setInstanceId(_ctx.stringValue("ListAlternativeSnapshotReposResponse.Result["+ i +"].instanceId"));
			repo.setSnapWarehouse(_ctx.stringValue("ListAlternativeSnapshotReposResponse.Result["+ i +"].snapWarehouse"));
			repo.setRepoPath(_ctx.stringValue("ListAlternativeSnapshotReposResponse.Result["+ i +"].repoPath"));

			result.add(repo);
		}
		listAlternativeSnapshotReposResponse.setResult(result);
	 
	 	return listAlternativeSnapshotReposResponse;
	}
}