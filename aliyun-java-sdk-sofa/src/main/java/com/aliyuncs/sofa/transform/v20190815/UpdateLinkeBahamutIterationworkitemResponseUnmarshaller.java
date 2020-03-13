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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutIterationworkitemResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutIterationworkitemResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutIterationworkitemResponseUnmarshaller {

	public static UpdateLinkeBahamutIterationworkitemResponse unmarshall(UpdateLinkeBahamutIterationworkitemResponse updateLinkeBahamutIterationworkitemResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutIterationworkitemResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutIterationworkitemResponse.RequestId"));
		updateLinkeBahamutIterationworkitemResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutIterationworkitemResponse.ResultCode"));
		updateLinkeBahamutIterationworkitemResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutIterationworkitemResponse.ResultMessage"));
		updateLinkeBahamutIterationworkitemResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutIterationworkitemResponse.ErrorMessage"));
		updateLinkeBahamutIterationworkitemResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutIterationworkitemResponse.Message"));
		updateLinkeBahamutIterationworkitemResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutIterationworkitemResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutIterationworkitemResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAcHour(_ctx.stringValue("UpdateLinkeBahamutIterationworkitemResponse.Result["+ i +"].AcHour"));
			resultItem.setAssignedTo(_ctx.stringValue("UpdateLinkeBahamutIterationworkitemResponse.Result["+ i +"].AssignedTo"));
			resultItem.setAssignedToStaffId(_ctx.stringValue("UpdateLinkeBahamutIterationworkitemResponse.Result["+ i +"].AssignedToStaffId"));
			resultItem.setCreated(_ctx.longValue("UpdateLinkeBahamutIterationworkitemResponse.Result["+ i +"].Created"));
			resultItem.setCreator(_ctx.stringValue("UpdateLinkeBahamutIterationworkitemResponse.Result["+ i +"].Creator"));
			resultItem.setCreatorStaffId(_ctx.stringValue("UpdateLinkeBahamutIterationworkitemResponse.Result["+ i +"].CreatorStaffId"));
			resultItem.setDeleted(_ctx.booleanValue("UpdateLinkeBahamutIterationworkitemResponse.Result["+ i +"].Deleted"));
			resultItem.setEsHour(_ctx.stringValue("UpdateLinkeBahamutIterationworkitemResponse.Result["+ i +"].EsHour"));
			resultItem.setExternalId(_ctx.stringValue("UpdateLinkeBahamutIterationworkitemResponse.Result["+ i +"].ExternalId"));
			resultItem.setId(_ctx.stringValue("UpdateLinkeBahamutIterationworkitemResponse.Result["+ i +"].Id"));
			resultItem.setIterationExternalId(_ctx.stringValue("UpdateLinkeBahamutIterationworkitemResponse.Result["+ i +"].IterationExternalId"));
			resultItem.setLastModified(_ctx.longValue("UpdateLinkeBahamutIterationworkitemResponse.Result["+ i +"].LastModified"));
			resultItem.setLink(_ctx.stringValue("UpdateLinkeBahamutIterationworkitemResponse.Result["+ i +"].Link"));
			resultItem.setMergeRequestId(_ctx.stringValue("UpdateLinkeBahamutIterationworkitemResponse.Result["+ i +"].MergeRequestId"));
			resultItem.setPriority(_ctx.stringValue("UpdateLinkeBahamutIterationworkitemResponse.Result["+ i +"].Priority"));
			resultItem.setPriorityId(_ctx.stringValue("UpdateLinkeBahamutIterationworkitemResponse.Result["+ i +"].PriorityId"));
			resultItem.setProgress(_ctx.stringValue("UpdateLinkeBahamutIterationworkitemResponse.Result["+ i +"].Progress"));
			resultItem.setStamp(_ctx.stringValue("UpdateLinkeBahamutIterationworkitemResponse.Result["+ i +"].Stamp"));
			resultItem.setStatus(_ctx.stringValue("UpdateLinkeBahamutIterationworkitemResponse.Result["+ i +"].Status"));
			resultItem.setStatusId(_ctx.stringValue("UpdateLinkeBahamutIterationworkitemResponse.Result["+ i +"].StatusId"));
			resultItem.setStatusStage(_ctx.stringValue("UpdateLinkeBahamutIterationworkitemResponse.Result["+ i +"].StatusStage"));
			resultItem.setSubject(_ctx.stringValue("UpdateLinkeBahamutIterationworkitemResponse.Result["+ i +"].Subject"));
			resultItem.setSys(_ctx.stringValue("UpdateLinkeBahamutIterationworkitemResponse.Result["+ i +"].Sys"));
			resultItem.setUrl(_ctx.stringValue("UpdateLinkeBahamutIterationworkitemResponse.Result["+ i +"].Url"));

			result.add(resultItem);
		}
		updateLinkeBahamutIterationworkitemResponse.setResult(result);
	 
	 	return updateLinkeBahamutIterationworkitemResponse;
	}
}