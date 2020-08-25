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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutIterationupdateiterationworkitemsResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutIterationupdateiterationworkitemsResponseUnmarshaller {

	public static UpdateLinkeBahamutIterationupdateiterationworkitemsResponse unmarshall(UpdateLinkeBahamutIterationupdateiterationworkitemsResponse updateLinkeBahamutIterationupdateiterationworkitemsResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutIterationupdateiterationworkitemsResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.RequestId"));
		updateLinkeBahamutIterationupdateiterationworkitemsResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.ResultCode"));
		updateLinkeBahamutIterationupdateiterationworkitemsResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.ResultMessage"));
		updateLinkeBahamutIterationupdateiterationworkitemsResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.ErrorMessage"));
		updateLinkeBahamutIterationupdateiterationworkitemsResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutIterationupdateiterationworkitemsResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.Message"));
		updateLinkeBahamutIterationupdateiterationworkitemsResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.ResponseStatusCode"));
		updateLinkeBahamutIterationupdateiterationworkitemsResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAcHour(_ctx.stringValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.Result["+ i +"].AcHour"));
			resultItem.setAssignedTo(_ctx.stringValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.Result["+ i +"].AssignedTo"));
			resultItem.setAssignedToStaffId(_ctx.stringValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.Result["+ i +"].AssignedToStaffId"));
			resultItem.setCreated(_ctx.longValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.Result["+ i +"].Created"));
			resultItem.setCreator(_ctx.stringValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.Result["+ i +"].Creator"));
			resultItem.setCreatorStaffId(_ctx.stringValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.Result["+ i +"].CreatorStaffId"));
			resultItem.setDeleted(_ctx.booleanValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.Result["+ i +"].Deleted"));
			resultItem.setEsHour(_ctx.stringValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.Result["+ i +"].EsHour"));
			resultItem.setExternalId(_ctx.stringValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.Result["+ i +"].ExternalId"));
			resultItem.setId(_ctx.stringValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.Result["+ i +"].Id"));
			resultItem.setIterationExternalId(_ctx.stringValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.Result["+ i +"].IterationExternalId"));
			resultItem.setLastModified(_ctx.longValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.Result["+ i +"].LastModified"));
			resultItem.setLink(_ctx.stringValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.Result["+ i +"].Link"));
			resultItem.setMergeRequestId(_ctx.stringValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.Result["+ i +"].MergeRequestId"));
			resultItem.setPriority(_ctx.stringValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.Result["+ i +"].Priority"));
			resultItem.setPriorityId(_ctx.stringValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.Result["+ i +"].PriorityId"));
			resultItem.setProgress(_ctx.stringValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.Result["+ i +"].Progress"));
			resultItem.setStamp(_ctx.stringValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.Result["+ i +"].Stamp"));
			resultItem.setStatus(_ctx.stringValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.Result["+ i +"].Status"));
			resultItem.setStatusId(_ctx.stringValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.Result["+ i +"].StatusId"));
			resultItem.setStatusStage(_ctx.stringValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.Result["+ i +"].StatusStage"));
			resultItem.setSubject(_ctx.stringValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.Result["+ i +"].Subject"));
			resultItem.setSys(_ctx.stringValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.Result["+ i +"].Sys"));
			resultItem.setUrl(_ctx.stringValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.Result["+ i +"].Url"));

			List<String> mergeRequestIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.Result["+ i +"].MergeRequestIds.Length"); j++) {
				mergeRequestIds.add(_ctx.stringValue("UpdateLinkeBahamutIterationupdateiterationworkitemsResponse.Result["+ i +"].MergeRequestIds["+ j +"]"));
			}
			resultItem.setMergeRequestIds(mergeRequestIds);

			result.add(resultItem);
		}
		updateLinkeBahamutIterationupdateiterationworkitemsResponse.setResult(result);
	 
	 	return updateLinkeBahamutIterationupdateiterationworkitemsResponse;
	}
}