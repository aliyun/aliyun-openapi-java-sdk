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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutLogsgetlogsbyuserResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutLogsgetlogsbyuserResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutLogsgetlogsbyuserResponseUnmarshaller {

	public static GetLinkeBahamutLogsgetlogsbyuserResponse unmarshall(GetLinkeBahamutLogsgetlogsbyuserResponse getLinkeBahamutLogsgetlogsbyuserResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutLogsgetlogsbyuserResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutLogsgetlogsbyuserResponse.RequestId"));
		getLinkeBahamutLogsgetlogsbyuserResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutLogsgetlogsbyuserResponse.ResultCode"));
		getLinkeBahamutLogsgetlogsbyuserResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutLogsgetlogsbyuserResponse.ResultMessage"));
		getLinkeBahamutLogsgetlogsbyuserResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutLogsgetlogsbyuserResponse.ErrorMessage"));
		getLinkeBahamutLogsgetlogsbyuserResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutLogsgetlogsbyuserResponse.ErrorMsgParamsMap"));
		getLinkeBahamutLogsgetlogsbyuserResponse.setMessage(_ctx.stringValue("GetLinkeBahamutLogsgetlogsbyuserResponse.Message"));
		getLinkeBahamutLogsgetlogsbyuserResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutLogsgetlogsbyuserResponse.ResponseStatusCode"));
		getLinkeBahamutLogsgetlogsbyuserResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutLogsgetlogsbyuserResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutLogsgetlogsbyuserResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setContent(_ctx.stringValue("GetLinkeBahamutLogsgetlogsbyuserResponse.Result["+ i +"].Content"));
			resultItem.setContentDetail(_ctx.stringValue("GetLinkeBahamutLogsgetlogsbyuserResponse.Result["+ i +"].ContentDetail"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutLogsgetlogsbyuserResponse.Result["+ i +"].Created"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutLogsgetlogsbyuserResponse.Result["+ i +"].Deleted"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutLogsgetlogsbyuserResponse.Result["+ i +"].Id"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutLogsgetlogsbyuserResponse.Result["+ i +"].LastModified"));
			resultItem.setPostValue(_ctx.stringValue("GetLinkeBahamutLogsgetlogsbyuserResponse.Result["+ i +"].PostValue"));
			resultItem.setPreValue(_ctx.stringValue("GetLinkeBahamutLogsgetlogsbyuserResponse.Result["+ i +"].PreValue"));
			resultItem.setTarget(_ctx.stringValue("GetLinkeBahamutLogsgetlogsbyuserResponse.Result["+ i +"].Target"));
			resultItem.setTargetId(_ctx.stringValue("GetLinkeBahamutLogsgetlogsbyuserResponse.Result["+ i +"].TargetId"));
			resultItem.setTime(_ctx.longValue("GetLinkeBahamutLogsgetlogsbyuserResponse.Result["+ i +"].Time"));
			resultItem.setTraceId(_ctx.stringValue("GetLinkeBahamutLogsgetlogsbyuserResponse.Result["+ i +"].TraceId"));
			resultItem.setType(_ctx.stringValue("GetLinkeBahamutLogsgetlogsbyuserResponse.Result["+ i +"].Type"));
			resultItem.setUser(_ctx.stringValue("GetLinkeBahamutLogsgetlogsbyuserResponse.Result["+ i +"].User"));

			result.add(resultItem);
		}
		getLinkeBahamutLogsgetlogsbyuserResponse.setResult(result);
	 
	 	return getLinkeBahamutLogsgetlogsbyuserResponse;
	}
}