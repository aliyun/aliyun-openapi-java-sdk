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

import com.aliyuncs.devops.model.v20210625.ListMergeRequestFilesReadsResponse;
import com.aliyuncs.devops.model.v20210625.ListMergeRequestFilesReadsResponse.ResultItem;
import com.aliyuncs.devops.model.v20210625.ListMergeRequestFilesReadsResponse.ResultItem.Read_users;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMergeRequestFilesReadsResponseUnmarshaller {

	public static ListMergeRequestFilesReadsResponse unmarshall(ListMergeRequestFilesReadsResponse listMergeRequestFilesReadsResponse, UnmarshallerContext _ctx) {
		
		listMergeRequestFilesReadsResponse.setRequestId(_ctx.stringValue("ListMergeRequestFilesReadsResponse.requestId"));
		listMergeRequestFilesReadsResponse.setSuccess(_ctx.booleanValue("ListMergeRequestFilesReadsResponse.success"));
		listMergeRequestFilesReadsResponse.setErrorCode(_ctx.stringValue("ListMergeRequestFilesReadsResponse.errorCode"));
		listMergeRequestFilesReadsResponse.setErrorMessage(_ctx.stringValue("ListMergeRequestFilesReadsResponse.errorMessage"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMergeRequestFilesReadsResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setOldFilePath(_ctx.stringValue("ListMergeRequestFilesReadsResponse.result["+ i +"].oldFilePath"));
			resultItem.setNewFilePath(_ctx.stringValue("ListMergeRequestFilesReadsResponse.result["+ i +"].newFilePath"));
			resultItem.setNewFile(_ctx.booleanValue("ListMergeRequestFilesReadsResponse.result["+ i +"].newFile"));
			resultItem.setRenamedFile(_ctx.stringValue("ListMergeRequestFilesReadsResponse.result["+ i +"].renamedFile"));
			resultItem.setDeletedFile(_ctx.stringValue("ListMergeRequestFilesReadsResponse.result["+ i +"].deletedFile"));

			List<Read_users> readUsers = new ArrayList<Read_users>();
			for (int j = 0; j < _ctx.lengthValue("ListMergeRequestFilesReadsResponse.result["+ i +"].readUsers.Length"); j++) {
				Read_users read_users = new Read_users();
				read_users.setAliyunPk(_ctx.stringValue("ListMergeRequestFilesReadsResponse.result["+ i +"].readUsers["+ j +"].aliyunPk"));
				read_users.setName(_ctx.stringValue("ListMergeRequestFilesReadsResponse.result["+ i +"].readUsers["+ j +"].name"));
				read_users.setUsername(_ctx.stringValue("ListMergeRequestFilesReadsResponse.result["+ i +"].readUsers["+ j +"].username"));
				read_users.setState(_ctx.stringValue("ListMergeRequestFilesReadsResponse.result["+ i +"].readUsers["+ j +"].state"));
				read_users.setAvatarUrl(_ctx.stringValue("ListMergeRequestFilesReadsResponse.result["+ i +"].readUsers["+ j +"].avatarUrl"));
				read_users.setEmail(_ctx.stringValue("ListMergeRequestFilesReadsResponse.result["+ i +"].readUsers["+ j +"].email"));

				readUsers.add(read_users);
			}
			resultItem.setReadUsers(readUsers);

			result.add(resultItem);
		}
		listMergeRequestFilesReadsResponse.setResult(result);
	 
	 	return listMergeRequestFilesReadsResponse;
	}
}