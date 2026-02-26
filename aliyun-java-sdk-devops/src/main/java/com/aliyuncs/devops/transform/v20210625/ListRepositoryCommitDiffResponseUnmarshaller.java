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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.ListRepositoryCommitDiffResponse;
import com.aliyuncs.devops.model.v20210625.ListRepositoryCommitDiffResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRepositoryCommitDiffResponseUnmarshaller {

	public static ListRepositoryCommitDiffResponse unmarshall(ListRepositoryCommitDiffResponse listRepositoryCommitDiffResponse, UnmarshallerContext _ctx) {
		
		listRepositoryCommitDiffResponse.setErrorMessage(_ctx.stringValue("ListRepositoryCommitDiffResponse.errorMessage"));
		listRepositoryCommitDiffResponse.setRequestId(_ctx.stringValue("ListRepositoryCommitDiffResponse.requestId"));
		listRepositoryCommitDiffResponse.setErrorCode(_ctx.stringValue("ListRepositoryCommitDiffResponse.errorCode"));
		listRepositoryCommitDiffResponse.setSuccess(_ctx.booleanValue("ListRepositoryCommitDiffResponse.success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRepositoryCommitDiffResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setOldId(_ctx.stringValue("ListRepositoryCommitDiffResponse.result["+ i +"].oldId"));
			resultItem.setNewId(_ctx.stringValue("ListRepositoryCommitDiffResponse.result["+ i +"].newId"));
			resultItem.setIsNewLfs(_ctx.booleanValue("ListRepositoryCommitDiffResponse.result["+ i +"].isNewLfs"));
			resultItem.setIsOldLfs(_ctx.booleanValue("ListRepositoryCommitDiffResponse.result["+ i +"].isOldLfs"));
			resultItem.setDiff(_ctx.stringValue("ListRepositoryCommitDiffResponse.result["+ i +"].diff"));
			resultItem.setNewPath(_ctx.stringValue("ListRepositoryCommitDiffResponse.result["+ i +"].newPath"));
			resultItem.setOldPath(_ctx.stringValue("ListRepositoryCommitDiffResponse.result["+ i +"].oldPath"));
			resultItem.setAMode(_ctx.stringValue("ListRepositoryCommitDiffResponse.result["+ i +"].aMode"));
			resultItem.setBMode(_ctx.stringValue("ListRepositoryCommitDiffResponse.result["+ i +"].bMode"));
			resultItem.setNewFile(_ctx.booleanValue("ListRepositoryCommitDiffResponse.result["+ i +"].newFile"));
			resultItem.setRenamedFile(_ctx.booleanValue("ListRepositoryCommitDiffResponse.result["+ i +"].renamedFile"));
			resultItem.setDeletedFile(_ctx.booleanValue("ListRepositoryCommitDiffResponse.result["+ i +"].deletedFile"));
			resultItem.setIsBinary(_ctx.booleanValue("ListRepositoryCommitDiffResponse.result["+ i +"].isBinary"));

			result.add(resultItem);
		}
		listRepositoryCommitDiffResponse.setResult(result);
	 
	 	return listRepositoryCommitDiffResponse;
	}
}