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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutInternaltasksResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutInternaltasksResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutInternaltasksResponseUnmarshaller {

	public static GetLinkeBahamutInternaltasksResponse unmarshall(GetLinkeBahamutInternaltasksResponse getLinkeBahamutInternaltasksResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutInternaltasksResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutInternaltasksResponse.RequestId"));
		getLinkeBahamutInternaltasksResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutInternaltasksResponse.ResultCode"));
		getLinkeBahamutInternaltasksResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutInternaltasksResponse.ResultMessage"));
		getLinkeBahamutInternaltasksResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutInternaltasksResponse.ErrorMessage"));
		getLinkeBahamutInternaltasksResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutInternaltasksResponse.ErrorMsgParamsMap"));
		getLinkeBahamutInternaltasksResponse.setMessage(_ctx.stringValue("GetLinkeBahamutInternaltasksResponse.Message"));
		getLinkeBahamutInternaltasksResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutInternaltasksResponse.ResponseStatusCode"));
		getLinkeBahamutInternaltasksResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutInternaltasksResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutInternaltasksResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAssignee(_ctx.stringValue("GetLinkeBahamutInternaltasksResponse.Result["+ i +"].Assignee"));
			resultItem.setAutoCreating(_ctx.booleanValue("GetLinkeBahamutInternaltasksResponse.Result["+ i +"].AutoCreating"));
			resultItem.setContent(_ctx.stringValue("GetLinkeBahamutInternaltasksResponse.Result["+ i +"].Content"));
			resultItem.setContext(_ctx.stringValue("GetLinkeBahamutInternaltasksResponse.Result["+ i +"].Context"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutInternaltasksResponse.Result["+ i +"].Created"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutInternaltasksResponse.Result["+ i +"].Deleted"));
			resultItem.setExternalId(_ctx.stringValue("GetLinkeBahamutInternaltasksResponse.Result["+ i +"].ExternalId"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutInternaltasksResponse.Result["+ i +"].Id"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutInternaltasksResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutInternaltasksResponse.Result["+ i +"].Name"));
			resultItem.setOperatorAccount(_ctx.stringValue("GetLinkeBahamutInternaltasksResponse.Result["+ i +"].OperatorAccount"));
			resultItem.setRefId(_ctx.stringValue("GetLinkeBahamutInternaltasksResponse.Result["+ i +"].RefId"));
			resultItem.setRefName(_ctx.stringValue("GetLinkeBahamutInternaltasksResponse.Result["+ i +"].RefName"));
			resultItem.setResultMessage(_ctx.stringValue("GetLinkeBahamutInternaltasksResponse.Result["+ i +"].ResultMessage"));
			resultItem.setStatus(_ctx.stringValue("GetLinkeBahamutInternaltasksResponse.Result["+ i +"].Status"));
			resultItem.setTaskScope(_ctx.stringValue("GetLinkeBahamutInternaltasksResponse.Result["+ i +"].TaskScope"));
			resultItem.setType(_ctx.stringValue("GetLinkeBahamutInternaltasksResponse.Result["+ i +"].Type"));
			resultItem.setUrl(_ctx.stringValue("GetLinkeBahamutInternaltasksResponse.Result["+ i +"].Url"));

			result.add(resultItem);
		}
		getLinkeBahamutInternaltasksResponse.setResult(result);
	 
	 	return getLinkeBahamutInternaltasksResponse;
	}
}