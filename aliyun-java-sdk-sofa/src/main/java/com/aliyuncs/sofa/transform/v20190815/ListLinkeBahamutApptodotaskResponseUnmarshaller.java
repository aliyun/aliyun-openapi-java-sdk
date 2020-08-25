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

import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutApptodotaskResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutApptodotaskResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeBahamutApptodotaskResponseUnmarshaller {

	public static ListLinkeBahamutApptodotaskResponse unmarshall(ListLinkeBahamutApptodotaskResponse listLinkeBahamutApptodotaskResponse, UnmarshallerContext _ctx) {
		
		listLinkeBahamutApptodotaskResponse.setRequestId(_ctx.stringValue("ListLinkeBahamutApptodotaskResponse.RequestId"));
		listLinkeBahamutApptodotaskResponse.setResultCode(_ctx.stringValue("ListLinkeBahamutApptodotaskResponse.ResultCode"));
		listLinkeBahamutApptodotaskResponse.setResultMessage(_ctx.stringValue("ListLinkeBahamutApptodotaskResponse.ResultMessage"));
		listLinkeBahamutApptodotaskResponse.setErrorMessage(_ctx.stringValue("ListLinkeBahamutApptodotaskResponse.ErrorMessage"));
		listLinkeBahamutApptodotaskResponse.setErrorMsgParamsMap(_ctx.stringValue("ListLinkeBahamutApptodotaskResponse.ErrorMsgParamsMap"));
		listLinkeBahamutApptodotaskResponse.setMessage(_ctx.stringValue("ListLinkeBahamutApptodotaskResponse.Message"));
		listLinkeBahamutApptodotaskResponse.setResponseStatusCode(_ctx.longValue("ListLinkeBahamutApptodotaskResponse.ResponseStatusCode"));
		listLinkeBahamutApptodotaskResponse.setSuccess(_ctx.booleanValue("ListLinkeBahamutApptodotaskResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeBahamutApptodotaskResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppMetaId(_ctx.stringValue("ListLinkeBahamutApptodotaskResponse.Result["+ i +"].AppMetaId"));
			resultItem.setCreated(_ctx.longValue("ListLinkeBahamutApptodotaskResponse.Result["+ i +"].Created"));
			resultItem.setDeleted(_ctx.booleanValue("ListLinkeBahamutApptodotaskResponse.Result["+ i +"].Deleted"));
			resultItem.setFinished(_ctx.booleanValue("ListLinkeBahamutApptodotaskResponse.Result["+ i +"].Finished"));
			resultItem.setId(_ctx.stringValue("ListLinkeBahamutApptodotaskResponse.Result["+ i +"].Id"));
			resultItem.setLastModified(_ctx.longValue("ListLinkeBahamutApptodotaskResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("ListLinkeBahamutApptodotaskResponse.Result["+ i +"].Name"));
			resultItem.setReleaseId(_ctx.stringValue("ListLinkeBahamutApptodotaskResponse.Result["+ i +"].ReleaseId"));
			resultItem.setRepo(_ctx.stringValue("ListLinkeBahamutApptodotaskResponse.Result["+ i +"].Repo"));
			resultItem.setSourceBranch(_ctx.stringValue("ListLinkeBahamutApptodotaskResponse.Result["+ i +"].SourceBranch"));
			resultItem.setState(_ctx.stringValue("ListLinkeBahamutApptodotaskResponse.Result["+ i +"].State"));
			resultItem.setTargetBranch(_ctx.stringValue("ListLinkeBahamutApptodotaskResponse.Result["+ i +"].TargetBranch"));
			resultItem.setType(_ctx.stringValue("ListLinkeBahamutApptodotaskResponse.Result["+ i +"].Type"));
			resultItem.setUrl(_ctx.stringValue("ListLinkeBahamutApptodotaskResponse.Result["+ i +"].Url"));

			result.add(resultItem);
		}
		listLinkeBahamutApptodotaskResponse.setResult(result);
	 
	 	return listLinkeBahamutApptodotaskResponse;
	}
}