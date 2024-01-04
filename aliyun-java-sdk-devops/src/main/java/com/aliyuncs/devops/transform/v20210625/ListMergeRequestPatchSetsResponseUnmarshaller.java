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

import com.aliyuncs.devops.model.v20210625.ListMergeRequestPatchSetsResponse;
import com.aliyuncs.devops.model.v20210625.ListMergeRequestPatchSetsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMergeRequestPatchSetsResponseUnmarshaller {

	public static ListMergeRequestPatchSetsResponse unmarshall(ListMergeRequestPatchSetsResponse listMergeRequestPatchSetsResponse, UnmarshallerContext _ctx) {
		
		listMergeRequestPatchSetsResponse.setRequestId(_ctx.stringValue("ListMergeRequestPatchSetsResponse.requestId"));
		listMergeRequestPatchSetsResponse.setSuccess(_ctx.booleanValue("ListMergeRequestPatchSetsResponse.success"));
		listMergeRequestPatchSetsResponse.setErrorCode(_ctx.stringValue("ListMergeRequestPatchSetsResponse.errorCode"));
		listMergeRequestPatchSetsResponse.setErrorMessage(_ctx.stringValue("ListMergeRequestPatchSetsResponse.errorMessage"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMergeRequestPatchSetsResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setPatchSetNo(_ctx.longValue("ListMergeRequestPatchSetsResponse.result["+ i +"].patchSetNo"));
			resultItem.setPatchSetBizId(_ctx.stringValue("ListMergeRequestPatchSetsResponse.result["+ i +"].patchSetBizId"));
			resultItem.setPatchSetName(_ctx.stringValue("ListMergeRequestPatchSetsResponse.result["+ i +"].patchSetName"));
			resultItem.setCommitId(_ctx.stringValue("ListMergeRequestPatchSetsResponse.result["+ i +"].commitId"));
			resultItem.setShortCommitId(_ctx.stringValue("ListMergeRequestPatchSetsResponse.result["+ i +"].shortCommitId"));
			resultItem.setRelatedMergeItemType(_ctx.stringValue("ListMergeRequestPatchSetsResponse.result["+ i +"].relatedMergeItemType"));
			resultItem.setCreatedAt(_ctx.stringValue("ListMergeRequestPatchSetsResponse.result["+ i +"].createdAt"));

			result.add(resultItem);
		}
		listMergeRequestPatchSetsResponse.setResult(result);
	 
	 	return listMergeRequestPatchSetsResponse;
	}
}