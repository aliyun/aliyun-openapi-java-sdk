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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutVcscommitchangeResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutVcscommitchangeResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutVcscommitchangeResponseUnmarshaller {

	public static GetLinkeBahamutVcscommitchangeResponse unmarshall(GetLinkeBahamutVcscommitchangeResponse getLinkeBahamutVcscommitchangeResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutVcscommitchangeResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutVcscommitchangeResponse.RequestId"));
		getLinkeBahamutVcscommitchangeResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutVcscommitchangeResponse.ResultCode"));
		getLinkeBahamutVcscommitchangeResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutVcscommitchangeResponse.ResultMessage"));
		getLinkeBahamutVcscommitchangeResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutVcscommitchangeResponse.ErrorMessage"));
		getLinkeBahamutVcscommitchangeResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutVcscommitchangeResponse.ErrorMsgParamsMap"));
		getLinkeBahamutVcscommitchangeResponse.setMessage(_ctx.stringValue("GetLinkeBahamutVcscommitchangeResponse.Message"));
		getLinkeBahamutVcscommitchangeResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutVcscommitchangeResponse.ResponseStatusCode"));
		getLinkeBahamutVcscommitchangeResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutVcscommitchangeResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutVcscommitchangeResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAmode(_ctx.stringValue("GetLinkeBahamutVcscommitchangeResponse.Result["+ i +"].Amode"));
			resultItem.setBinary(_ctx.booleanValue("GetLinkeBahamutVcscommitchangeResponse.Result["+ i +"].Binary"));
			resultItem.setBmode(_ctx.stringValue("GetLinkeBahamutVcscommitchangeResponse.Result["+ i +"].Bmode"));
			resultItem.setCharset(_ctx.stringValue("GetLinkeBahamutVcscommitchangeResponse.Result["+ i +"].Charset"));
			resultItem.setDeletedFile(_ctx.booleanValue("GetLinkeBahamutVcscommitchangeResponse.Result["+ i +"].DeletedFile"));
			resultItem.setDiff(_ctx.stringValue("GetLinkeBahamutVcscommitchangeResponse.Result["+ i +"].Diff"));
			resultItem.setFilePathId(_ctx.stringValue("GetLinkeBahamutVcscommitchangeResponse.Result["+ i +"].FilePathId"));
			resultItem.setFromId(_ctx.stringValue("GetLinkeBahamutVcscommitchangeResponse.Result["+ i +"].FromId"));
			resultItem.setNewFile(_ctx.booleanValue("GetLinkeBahamutVcscommitchangeResponse.Result["+ i +"].NewFile"));
			resultItem.setNewPath(_ctx.stringValue("GetLinkeBahamutVcscommitchangeResponse.Result["+ i +"].NewPath"));
			resultItem.setOldPath(_ctx.stringValue("GetLinkeBahamutVcscommitchangeResponse.Result["+ i +"].OldPath"));
			resultItem.setRenamedFile(_ctx.booleanValue("GetLinkeBahamutVcscommitchangeResponse.Result["+ i +"].RenamedFile"));
			resultItem.setToId(_ctx.stringValue("GetLinkeBahamutVcscommitchangeResponse.Result["+ i +"].ToId"));

			result.add(resultItem);
		}
		getLinkeBahamutVcscommitchangeResponse.setResult(result);
	 
	 	return getLinkeBahamutVcscommitchangeResponse;
	}
}