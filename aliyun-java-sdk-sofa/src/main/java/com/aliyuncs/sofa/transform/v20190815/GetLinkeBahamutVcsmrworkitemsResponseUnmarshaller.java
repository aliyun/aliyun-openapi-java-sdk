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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutVcsmrworkitemsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutVcsmrworkitemsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutVcsmrworkitemsResponseUnmarshaller {

	public static GetLinkeBahamutVcsmrworkitemsResponse unmarshall(GetLinkeBahamutVcsmrworkitemsResponse getLinkeBahamutVcsmrworkitemsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutVcsmrworkitemsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutVcsmrworkitemsResponse.RequestId"));
		getLinkeBahamutVcsmrworkitemsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutVcsmrworkitemsResponse.ResultCode"));
		getLinkeBahamutVcsmrworkitemsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutVcsmrworkitemsResponse.ResultMessage"));
		getLinkeBahamutVcsmrworkitemsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutVcsmrworkitemsResponse.ErrorMessage"));
		getLinkeBahamutVcsmrworkitemsResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutVcsmrworkitemsResponse.ErrorMsgParamsMap"));
		getLinkeBahamutVcsmrworkitemsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutVcsmrworkitemsResponse.Message"));
		getLinkeBahamutVcsmrworkitemsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutVcsmrworkitemsResponse.ResponseStatusCode"));
		getLinkeBahamutVcsmrworkitemsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutVcsmrworkitemsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutVcsmrworkitemsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAcHour(_ctx.stringValue("GetLinkeBahamutVcsmrworkitemsResponse.Result["+ i +"].AcHour"));
			resultItem.setAssignedTo(_ctx.stringValue("GetLinkeBahamutVcsmrworkitemsResponse.Result["+ i +"].AssignedTo"));
			resultItem.setAssignedToStaffId(_ctx.stringValue("GetLinkeBahamutVcsmrworkitemsResponse.Result["+ i +"].AssignedToStaffId"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutVcsmrworkitemsResponse.Result["+ i +"].Created"));
			resultItem.setCreator(_ctx.stringValue("GetLinkeBahamutVcsmrworkitemsResponse.Result["+ i +"].Creator"));
			resultItem.setCreatorStaffId(_ctx.stringValue("GetLinkeBahamutVcsmrworkitemsResponse.Result["+ i +"].CreatorStaffId"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutVcsmrworkitemsResponse.Result["+ i +"].Deleted"));
			resultItem.setEsHour(_ctx.stringValue("GetLinkeBahamutVcsmrworkitemsResponse.Result["+ i +"].EsHour"));
			resultItem.setExternalId(_ctx.stringValue("GetLinkeBahamutVcsmrworkitemsResponse.Result["+ i +"].ExternalId"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutVcsmrworkitemsResponse.Result["+ i +"].Id"));
			resultItem.setIterationExternalId(_ctx.stringValue("GetLinkeBahamutVcsmrworkitemsResponse.Result["+ i +"].IterationExternalId"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutVcsmrworkitemsResponse.Result["+ i +"].LastModified"));
			resultItem.setLink(_ctx.stringValue("GetLinkeBahamutVcsmrworkitemsResponse.Result["+ i +"].Link"));
			resultItem.setMergeRequestId(_ctx.stringValue("GetLinkeBahamutVcsmrworkitemsResponse.Result["+ i +"].MergeRequestId"));
			resultItem.setPriority(_ctx.stringValue("GetLinkeBahamutVcsmrworkitemsResponse.Result["+ i +"].Priority"));
			resultItem.setPriorityId(_ctx.stringValue("GetLinkeBahamutVcsmrworkitemsResponse.Result["+ i +"].PriorityId"));
			resultItem.setProgress(_ctx.stringValue("GetLinkeBahamutVcsmrworkitemsResponse.Result["+ i +"].Progress"));
			resultItem.setStamp(_ctx.stringValue("GetLinkeBahamutVcsmrworkitemsResponse.Result["+ i +"].Stamp"));
			resultItem.setStatus(_ctx.stringValue("GetLinkeBahamutVcsmrworkitemsResponse.Result["+ i +"].Status"));
			resultItem.setStatusId(_ctx.stringValue("GetLinkeBahamutVcsmrworkitemsResponse.Result["+ i +"].StatusId"));
			resultItem.setStatusStage(_ctx.stringValue("GetLinkeBahamutVcsmrworkitemsResponse.Result["+ i +"].StatusStage"));
			resultItem.setSubject(_ctx.stringValue("GetLinkeBahamutVcsmrworkitemsResponse.Result["+ i +"].Subject"));
			resultItem.setSys(_ctx.stringValue("GetLinkeBahamutVcsmrworkitemsResponse.Result["+ i +"].Sys"));
			resultItem.setUrl(_ctx.stringValue("GetLinkeBahamutVcsmrworkitemsResponse.Result["+ i +"].Url"));

			List<String> mergeRequestIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutVcsmrworkitemsResponse.Result["+ i +"].MergeRequestIds.Length"); j++) {
				mergeRequestIds.add(_ctx.stringValue("GetLinkeBahamutVcsmrworkitemsResponse.Result["+ i +"].MergeRequestIds["+ j +"]"));
			}
			resultItem.setMergeRequestIds(mergeRequestIds);

			result.add(resultItem);
		}
		getLinkeBahamutVcsmrworkitemsResponse.setResult(result);
	 
	 	return getLinkeBahamutVcsmrworkitemsResponse;
	}
}