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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationworkitemsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationworkitemsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutIterationworkitemsResponseUnmarshaller {

	public static GetLinkeBahamutIterationworkitemsResponse unmarshall(GetLinkeBahamutIterationworkitemsResponse getLinkeBahamutIterationworkitemsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutIterationworkitemsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutIterationworkitemsResponse.RequestId"));
		getLinkeBahamutIterationworkitemsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutIterationworkitemsResponse.ResultCode"));
		getLinkeBahamutIterationworkitemsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutIterationworkitemsResponse.ResultMessage"));
		getLinkeBahamutIterationworkitemsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutIterationworkitemsResponse.ErrorMessage"));
		getLinkeBahamutIterationworkitemsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutIterationworkitemsResponse.Message"));
		getLinkeBahamutIterationworkitemsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutIterationworkitemsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutIterationworkitemsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAcHour(_ctx.stringValue("GetLinkeBahamutIterationworkitemsResponse.Result["+ i +"].AcHour"));
			resultItem.setAssignedTo(_ctx.stringValue("GetLinkeBahamutIterationworkitemsResponse.Result["+ i +"].AssignedTo"));
			resultItem.setAssignedToStaffId(_ctx.stringValue("GetLinkeBahamutIterationworkitemsResponse.Result["+ i +"].AssignedToStaffId"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutIterationworkitemsResponse.Result["+ i +"].Created"));
			resultItem.setCreator(_ctx.stringValue("GetLinkeBahamutIterationworkitemsResponse.Result["+ i +"].Creator"));
			resultItem.setCreatorStaffId(_ctx.stringValue("GetLinkeBahamutIterationworkitemsResponse.Result["+ i +"].CreatorStaffId"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutIterationworkitemsResponse.Result["+ i +"].Deleted"));
			resultItem.setEsHour(_ctx.stringValue("GetLinkeBahamutIterationworkitemsResponse.Result["+ i +"].EsHour"));
			resultItem.setExternalId(_ctx.stringValue("GetLinkeBahamutIterationworkitemsResponse.Result["+ i +"].ExternalId"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutIterationworkitemsResponse.Result["+ i +"].Id"));
			resultItem.setIterationExternalId(_ctx.stringValue("GetLinkeBahamutIterationworkitemsResponse.Result["+ i +"].IterationExternalId"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutIterationworkitemsResponse.Result["+ i +"].LastModified"));
			resultItem.setLink(_ctx.stringValue("GetLinkeBahamutIterationworkitemsResponse.Result["+ i +"].Link"));
			resultItem.setMergeRequestId(_ctx.stringValue("GetLinkeBahamutIterationworkitemsResponse.Result["+ i +"].MergeRequestId"));
			resultItem.setPriority(_ctx.stringValue("GetLinkeBahamutIterationworkitemsResponse.Result["+ i +"].Priority"));
			resultItem.setPriorityId(_ctx.stringValue("GetLinkeBahamutIterationworkitemsResponse.Result["+ i +"].PriorityId"));
			resultItem.setProgress(_ctx.stringValue("GetLinkeBahamutIterationworkitemsResponse.Result["+ i +"].Progress"));
			resultItem.setStamp(_ctx.stringValue("GetLinkeBahamutIterationworkitemsResponse.Result["+ i +"].Stamp"));
			resultItem.setStatus(_ctx.stringValue("GetLinkeBahamutIterationworkitemsResponse.Result["+ i +"].Status"));
			resultItem.setStatusId(_ctx.stringValue("GetLinkeBahamutIterationworkitemsResponse.Result["+ i +"].StatusId"));
			resultItem.setStatusStage(_ctx.stringValue("GetLinkeBahamutIterationworkitemsResponse.Result["+ i +"].StatusStage"));
			resultItem.setSubject(_ctx.stringValue("GetLinkeBahamutIterationworkitemsResponse.Result["+ i +"].Subject"));
			resultItem.setSys(_ctx.stringValue("GetLinkeBahamutIterationworkitemsResponse.Result["+ i +"].Sys"));
			resultItem.setUrl(_ctx.stringValue("GetLinkeBahamutIterationworkitemsResponse.Result["+ i +"].Url"));

			result.add(resultItem);
		}
		getLinkeBahamutIterationworkitemsResponse.setResult(result);
	 
	 	return getLinkeBahamutIterationworkitemsResponse;
	}
}