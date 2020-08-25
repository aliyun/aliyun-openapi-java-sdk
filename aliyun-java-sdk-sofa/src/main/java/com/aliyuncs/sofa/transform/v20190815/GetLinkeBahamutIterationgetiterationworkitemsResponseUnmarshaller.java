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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationgetiterationworkitemsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationgetiterationworkitemsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutIterationgetiterationworkitemsResponseUnmarshaller {

	public static GetLinkeBahamutIterationgetiterationworkitemsResponse unmarshall(GetLinkeBahamutIterationgetiterationworkitemsResponse getLinkeBahamutIterationgetiterationworkitemsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutIterationgetiterationworkitemsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.RequestId"));
		getLinkeBahamutIterationgetiterationworkitemsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.ResultCode"));
		getLinkeBahamutIterationgetiterationworkitemsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.ResultMessage"));
		getLinkeBahamutIterationgetiterationworkitemsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.ErrorMessage"));
		getLinkeBahamutIterationgetiterationworkitemsResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.ErrorMsgParamsMap"));
		getLinkeBahamutIterationgetiterationworkitemsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.Message"));
		getLinkeBahamutIterationgetiterationworkitemsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.ResponseStatusCode"));
		getLinkeBahamutIterationgetiterationworkitemsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAcHour(_ctx.stringValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.Result["+ i +"].AcHour"));
			resultItem.setAssignedTo(_ctx.stringValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.Result["+ i +"].AssignedTo"));
			resultItem.setAssignedToStaffId(_ctx.stringValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.Result["+ i +"].AssignedToStaffId"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.Result["+ i +"].Created"));
			resultItem.setCreator(_ctx.stringValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.Result["+ i +"].Creator"));
			resultItem.setCreatorStaffId(_ctx.stringValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.Result["+ i +"].CreatorStaffId"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.Result["+ i +"].Deleted"));
			resultItem.setEsHour(_ctx.stringValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.Result["+ i +"].EsHour"));
			resultItem.setExternalId(_ctx.stringValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.Result["+ i +"].ExternalId"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.Result["+ i +"].Id"));
			resultItem.setIterationExternalId(_ctx.stringValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.Result["+ i +"].IterationExternalId"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.Result["+ i +"].LastModified"));
			resultItem.setLink(_ctx.stringValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.Result["+ i +"].Link"));
			resultItem.setMergeRequestId(_ctx.stringValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.Result["+ i +"].MergeRequestId"));
			resultItem.setPriority(_ctx.stringValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.Result["+ i +"].Priority"));
			resultItem.setPriorityId(_ctx.stringValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.Result["+ i +"].PriorityId"));
			resultItem.setProgress(_ctx.stringValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.Result["+ i +"].Progress"));
			resultItem.setStamp(_ctx.stringValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.Result["+ i +"].Stamp"));
			resultItem.setStatus(_ctx.stringValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.Result["+ i +"].Status"));
			resultItem.setStatusId(_ctx.stringValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.Result["+ i +"].StatusId"));
			resultItem.setStatusStage(_ctx.stringValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.Result["+ i +"].StatusStage"));
			resultItem.setSubject(_ctx.stringValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.Result["+ i +"].Subject"));
			resultItem.setSys(_ctx.stringValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.Result["+ i +"].Sys"));
			resultItem.setUrl(_ctx.stringValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.Result["+ i +"].Url"));

			List<String> mergeRequestIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.Result["+ i +"].MergeRequestIds.Length"); j++) {
				mergeRequestIds.add(_ctx.stringValue("GetLinkeBahamutIterationgetiterationworkitemsResponse.Result["+ i +"].MergeRequestIds["+ j +"]"));
			}
			resultItem.setMergeRequestIds(mergeRequestIds);

			result.add(resultItem);
		}
		getLinkeBahamutIterationgetiterationworkitemsResponse.setResult(result);
	 
	 	return getLinkeBahamutIterationgetiterationworkitemsResponse;
	}
}