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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutVcsmergerequestmrcommitResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutVcsmergerequestmrcommitResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutVcsmergerequestmrcommitResponseUnmarshaller {

	public static GetLinkeBahamutVcsmergerequestmrcommitResponse unmarshall(GetLinkeBahamutVcsmergerequestmrcommitResponse getLinkeBahamutVcsmergerequestmrcommitResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutVcsmergerequestmrcommitResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutVcsmergerequestmrcommitResponse.RequestId"));
		getLinkeBahamutVcsmergerequestmrcommitResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutVcsmergerequestmrcommitResponse.ResultCode"));
		getLinkeBahamutVcsmergerequestmrcommitResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutVcsmergerequestmrcommitResponse.ResultMessage"));
		getLinkeBahamutVcsmergerequestmrcommitResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutVcsmergerequestmrcommitResponse.ErrorMessage"));
		getLinkeBahamutVcsmergerequestmrcommitResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutVcsmergerequestmrcommitResponse.ErrorMsgParamsMap"));
		getLinkeBahamutVcsmergerequestmrcommitResponse.setMessage(_ctx.stringValue("GetLinkeBahamutVcsmergerequestmrcommitResponse.Message"));
		getLinkeBahamutVcsmergerequestmrcommitResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutVcsmergerequestmrcommitResponse.ResponseStatusCode"));
		getLinkeBahamutVcsmergerequestmrcommitResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutVcsmergerequestmrcommitResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutVcsmergerequestmrcommitResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAuthoredData(_ctx.longValue("GetLinkeBahamutVcsmergerequestmrcommitResponse.Result["+ i +"].AuthoredData"));
			resultItem.setAuthorEmail(_ctx.stringValue("GetLinkeBahamutVcsmergerequestmrcommitResponse.Result["+ i +"].AuthorEmail"));
			resultItem.setAuthorName(_ctx.stringValue("GetLinkeBahamutVcsmergerequestmrcommitResponse.Result["+ i +"].AuthorName"));
			resultItem.setCommittedDate(_ctx.stringValue("GetLinkeBahamutVcsmergerequestmrcommitResponse.Result["+ i +"].CommittedDate"));
			resultItem.setCommitterEmail(_ctx.stringValue("GetLinkeBahamutVcsmergerequestmrcommitResponse.Result["+ i +"].CommitterEmail"));
			resultItem.setCommitterName(_ctx.stringValue("GetLinkeBahamutVcsmergerequestmrcommitResponse.Result["+ i +"].CommitterName"));
			resultItem.setCreatedAt(_ctx.longValue("GetLinkeBahamutVcsmergerequestmrcommitResponse.Result["+ i +"].CreatedAt"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutVcsmergerequestmrcommitResponse.Result["+ i +"].Id"));
			resultItem.setMessage(_ctx.stringValue("GetLinkeBahamutVcsmergerequestmrcommitResponse.Result["+ i +"].Message"));
			resultItem.setShortId(_ctx.stringValue("GetLinkeBahamutVcsmergerequestmrcommitResponse.Result["+ i +"].ShortId"));

			List<String> parentIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutVcsmergerequestmrcommitResponse.Result["+ i +"].ParentIds.Length"); j++) {
				parentIds.add(_ctx.stringValue("GetLinkeBahamutVcsmergerequestmrcommitResponse.Result["+ i +"].ParentIds["+ j +"]"));
			}
			resultItem.setParentIds(parentIds);

			result.add(resultItem);
		}
		getLinkeBahamutVcsmergerequestmrcommitResponse.setResult(result);
	 
	 	return getLinkeBahamutVcsmergerequestmrcommitResponse;
	}
}