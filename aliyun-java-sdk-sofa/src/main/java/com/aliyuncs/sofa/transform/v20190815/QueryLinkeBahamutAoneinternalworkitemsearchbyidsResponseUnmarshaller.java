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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseUnmarshaller {

	public static QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse unmarshall(QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse queryLinkeBahamutAoneinternalworkitemsearchbyidsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.RequestId"));
		queryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.ResultCode"));
		queryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.ResultMessage"));
		queryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.ErrorMessage"));
		queryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.Message"));
		queryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.ResponseStatusCode"));
		queryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAcHour(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.Result["+ i +"].AcHour"));
			resultItem.setAssignedTo(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.Result["+ i +"].AssignedTo"));
			resultItem.setAssignedToStaffId(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.Result["+ i +"].AssignedToStaffId"));
			resultItem.setCanSelect(_ctx.booleanValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.Result["+ i +"].CanSelect"));
			resultItem.setCreator(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.Result["+ i +"].Creator"));
			resultItem.setCreatorId(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.Result["+ i +"].CreatorId"));
			resultItem.setCreatorStaffId(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.Result["+ i +"].CreatorStaffId"));
			resultItem.setEsHour(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.Result["+ i +"].EsHour"));
			resultItem.setExternalId(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.Result["+ i +"].ExternalId"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.Result["+ i +"].Id"));
			resultItem.setLink(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.Result["+ i +"].Link"));
			resultItem.setNoSelectInfo(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.Result["+ i +"].NoSelectInfo"));
			resultItem.setNoSelectTag(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.Result["+ i +"].NoSelectTag"));
			resultItem.setPriority(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.Result["+ i +"].Priority"));
			resultItem.setPriorityId(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.Result["+ i +"].PriorityId"));
			resultItem.setProgress(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.Result["+ i +"].Progress"));
			resultItem.setProjectId(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.Result["+ i +"].ProjectId"));
			resultItem.setStamp(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.Result["+ i +"].Stamp"));
			resultItem.setStatus(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.Result["+ i +"].Status"));
			resultItem.setStatusId(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.Result["+ i +"].StatusId"));
			resultItem.setStatusStage(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.Result["+ i +"].StatusStage"));
			resultItem.setSubject(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.Result["+ i +"].Subject"));
			resultItem.setUrl(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.Result["+ i +"].Url"));

			result.add(resultItem);
		}
		queryLinkeBahamutAoneinternalworkitemsearchbyidsResponse.setResult(result);
	 
	 	return queryLinkeBahamutAoneinternalworkitemsearchbyidsResponse;
	}
}