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

import com.aliyuncs.devops.model.v20210625.GetMergeRequestChangeTreeResponse;
import com.aliyuncs.devops.model.v20210625.GetMergeRequestChangeTreeResponse.Result;
import com.aliyuncs.devops.model.v20210625.GetMergeRequestChangeTreeResponse.Result.ChangesetDTOS;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMergeRequestChangeTreeResponseUnmarshaller {

	public static GetMergeRequestChangeTreeResponse unmarshall(GetMergeRequestChangeTreeResponse getMergeRequestChangeTreeResponse, UnmarshallerContext _ctx) {
		
		getMergeRequestChangeTreeResponse.setRequestId(_ctx.stringValue("GetMergeRequestChangeTreeResponse.requestId"));
		getMergeRequestChangeTreeResponse.setSuccess(_ctx.booleanValue("GetMergeRequestChangeTreeResponse.success"));
		getMergeRequestChangeTreeResponse.setErrorCode(_ctx.stringValue("GetMergeRequestChangeTreeResponse.errorCode"));
		getMergeRequestChangeTreeResponse.setErrorMessage(_ctx.stringValue("GetMergeRequestChangeTreeResponse.errorMessage"));

		Result result = new Result();
		result.setChangedFilesCount(_ctx.longValue("GetMergeRequestChangeTreeResponse.result.changedFilesCount"));
		result.setTotalAddLines(_ctx.longValue("GetMergeRequestChangeTreeResponse.result.totalAddLines"));
		result.setTotalDelLines(_ctx.longValue("GetMergeRequestChangeTreeResponse.result.totalDelLines"));

		List<ChangesetDTOS> changedFilesInfos = new ArrayList<ChangesetDTOS>();
		for (int i = 0; i < _ctx.lengthValue("GetMergeRequestChangeTreeResponse.result.changedFilesInfos.Length"); i++) {
			ChangesetDTOS changesetDTOS = new ChangesetDTOS();
			changesetDTOS.setNewPath(_ctx.stringValue("GetMergeRequestChangeTreeResponse.result.changedFilesInfos["+ i +"].newPath"));
			changesetDTOS.setOldPath(_ctx.stringValue("GetMergeRequestChangeTreeResponse.result.changedFilesInfos["+ i +"].oldPath"));
			changesetDTOS.setNewFile(_ctx.booleanValue("GetMergeRequestChangeTreeResponse.result.changedFilesInfos["+ i +"].newFile"));
			changesetDTOS.setRenamedFile(_ctx.booleanValue("GetMergeRequestChangeTreeResponse.result.changedFilesInfos["+ i +"].renamedFile"));
			changesetDTOS.setDeletedFile(_ctx.booleanValue("GetMergeRequestChangeTreeResponse.result.changedFilesInfos["+ i +"].deletedFile"));
			changesetDTOS.setBinaryFile(_ctx.booleanValue("GetMergeRequestChangeTreeResponse.result.changedFilesInfos["+ i +"].binaryFile"));
			changesetDTOS.setAddLines(_ctx.longValue("GetMergeRequestChangeTreeResponse.result.changedFilesInfos["+ i +"].addLines"));
			changesetDTOS.setDelLines(_ctx.longValue("GetMergeRequestChangeTreeResponse.result.changedFilesInfos["+ i +"].delLines"));

			changedFilesInfos.add(changesetDTOS);
		}
		result.setChangedFilesInfos(changedFilesInfos);
		getMergeRequestChangeTreeResponse.setResult(result);
	 
	 	return getMergeRequestChangeTreeResponse;
	}
}