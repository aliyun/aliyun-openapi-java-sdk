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

package com.aliyuncs.codeup.transform.v20200414;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.codeup.model.v20200414.ListRepositoryCommitDiffResponse;
import com.aliyuncs.codeup.model.v20200414.ListRepositoryCommitDiffResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRepositoryCommitDiffResponseUnmarshaller {

	public static ListRepositoryCommitDiffResponse unmarshall(ListRepositoryCommitDiffResponse listRepositoryCommitDiffResponse, UnmarshallerContext _ctx) {
		
		listRepositoryCommitDiffResponse.setRequestId(_ctx.stringValue("ListRepositoryCommitDiffResponse.RequestId"));
		listRepositoryCommitDiffResponse.setErrorCode(_ctx.stringValue("ListRepositoryCommitDiffResponse.ErrorCode"));
		listRepositoryCommitDiffResponse.setErrorMessage(_ctx.stringValue("ListRepositoryCommitDiffResponse.ErrorMessage"));
		listRepositoryCommitDiffResponse.setSuccess(_ctx.booleanValue("ListRepositoryCommitDiffResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRepositoryCommitDiffResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAMode(_ctx.stringValue("ListRepositoryCommitDiffResponse.Result["+ i +"].AMode"));
			resultItem.setBMode(_ctx.stringValue("ListRepositoryCommitDiffResponse.Result["+ i +"].BMode"));
			resultItem.setDeletedFile(_ctx.booleanValue("ListRepositoryCommitDiffResponse.Result["+ i +"].DeletedFile"));
			resultItem.setDiff(_ctx.stringValue("ListRepositoryCommitDiffResponse.Result["+ i +"].Diff"));
			resultItem.setIsBinary(_ctx.booleanValue("ListRepositoryCommitDiffResponse.Result["+ i +"].IsBinary"));
			resultItem.setIsNewLfs(_ctx.booleanValue("ListRepositoryCommitDiffResponse.Result["+ i +"].IsNewLfs"));
			resultItem.setIsOldLfs(_ctx.booleanValue("ListRepositoryCommitDiffResponse.Result["+ i +"].IsOldLfs"));
			resultItem.setNewFile(_ctx.booleanValue("ListRepositoryCommitDiffResponse.Result["+ i +"].NewFile"));
			resultItem.setNewId(_ctx.stringValue("ListRepositoryCommitDiffResponse.Result["+ i +"].NewId"));
			resultItem.setNewPath(_ctx.stringValue("ListRepositoryCommitDiffResponse.Result["+ i +"].NewPath"));
			resultItem.setOldId(_ctx.stringValue("ListRepositoryCommitDiffResponse.Result["+ i +"].OldId"));
			resultItem.setOldPath(_ctx.stringValue("ListRepositoryCommitDiffResponse.Result["+ i +"].OldPath"));
			resultItem.setRenamedFile(_ctx.booleanValue("ListRepositoryCommitDiffResponse.Result["+ i +"].RenamedFile"));

			result.add(resultItem);
		}
		listRepositoryCommitDiffResponse.setResult(result);
	 
	 	return listRepositoryCommitDiffResponse;
	}
}