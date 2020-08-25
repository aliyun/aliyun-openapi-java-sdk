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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutWebapigetlogsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutWebapigetlogsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutWebapigetlogsResponseUnmarshaller {

	public static GetLinkeBahamutWebapigetlogsResponse unmarshall(GetLinkeBahamutWebapigetlogsResponse getLinkeBahamutWebapigetlogsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutWebapigetlogsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutWebapigetlogsResponse.RequestId"));
		getLinkeBahamutWebapigetlogsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutWebapigetlogsResponse.ResultCode"));
		getLinkeBahamutWebapigetlogsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutWebapigetlogsResponse.ResultMessage"));
		getLinkeBahamutWebapigetlogsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutWebapigetlogsResponse.ErrorMessage"));
		getLinkeBahamutWebapigetlogsResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutWebapigetlogsResponse.ErrorMsgParamsMap"));
		getLinkeBahamutWebapigetlogsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutWebapigetlogsResponse.Message"));
		getLinkeBahamutWebapigetlogsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutWebapigetlogsResponse.ResponseStatusCode"));
		getLinkeBahamutWebapigetlogsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutWebapigetlogsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutWebapigetlogsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setContent(_ctx.stringValue("GetLinkeBahamutWebapigetlogsResponse.Result["+ i +"].Content"));
			resultItem.setContentDetail(_ctx.stringValue("GetLinkeBahamutWebapigetlogsResponse.Result["+ i +"].ContentDetail"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutWebapigetlogsResponse.Result["+ i +"].Created"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutWebapigetlogsResponse.Result["+ i +"].Deleted"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutWebapigetlogsResponse.Result["+ i +"].Id"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutWebapigetlogsResponse.Result["+ i +"].LastModified"));
			resultItem.setPostValue(_ctx.stringValue("GetLinkeBahamutWebapigetlogsResponse.Result["+ i +"].PostValue"));
			resultItem.setPreValue(_ctx.stringValue("GetLinkeBahamutWebapigetlogsResponse.Result["+ i +"].PreValue"));
			resultItem.setTarget(_ctx.stringValue("GetLinkeBahamutWebapigetlogsResponse.Result["+ i +"].Target"));
			resultItem.setTargetId(_ctx.stringValue("GetLinkeBahamutWebapigetlogsResponse.Result["+ i +"].TargetId"));
			resultItem.setTime(_ctx.longValue("GetLinkeBahamutWebapigetlogsResponse.Result["+ i +"].Time"));
			resultItem.setTraceId(_ctx.stringValue("GetLinkeBahamutWebapigetlogsResponse.Result["+ i +"].TraceId"));
			resultItem.setType(_ctx.stringValue("GetLinkeBahamutWebapigetlogsResponse.Result["+ i +"].Type"));
			resultItem.setUser(_ctx.stringValue("GetLinkeBahamutWebapigetlogsResponse.Result["+ i +"].User"));

			result.add(resultItem);
		}
		getLinkeBahamutWebapigetlogsResponse.setResult(result);
	 
	 	return getLinkeBahamutWebapigetlogsResponse;
	}
}