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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutVcsmergerequestResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutVcsmergerequestResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutVcsmergerequestResponseUnmarshaller {

	public static UpdateLinkeBahamutVcsmergerequestResponse unmarshall(UpdateLinkeBahamutVcsmergerequestResponse updateLinkeBahamutVcsmergerequestResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutVcsmergerequestResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutVcsmergerequestResponse.RequestId"));
		updateLinkeBahamutVcsmergerequestResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutVcsmergerequestResponse.ResultCode"));
		updateLinkeBahamutVcsmergerequestResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutVcsmergerequestResponse.ResultMessage"));
		updateLinkeBahamutVcsmergerequestResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutVcsmergerequestResponse.ErrorMessage"));
		updateLinkeBahamutVcsmergerequestResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutVcsmergerequestResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutVcsmergerequestResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutVcsmergerequestResponse.Message"));
		updateLinkeBahamutVcsmergerequestResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutVcsmergerequestResponse.ResponseStatusCode"));
		updateLinkeBahamutVcsmergerequestResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutVcsmergerequestResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutVcsmergerequestResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAmode(_ctx.stringValue("UpdateLinkeBahamutVcsmergerequestResponse.Result["+ i +"].Amode"));
			resultItem.setBinary(_ctx.booleanValue("UpdateLinkeBahamutVcsmergerequestResponse.Result["+ i +"].Binary"));
			resultItem.setBmode(_ctx.stringValue("UpdateLinkeBahamutVcsmergerequestResponse.Result["+ i +"].Bmode"));
			resultItem.setCharset(_ctx.stringValue("UpdateLinkeBahamutVcsmergerequestResponse.Result["+ i +"].Charset"));
			resultItem.setDeletedFile(_ctx.booleanValue("UpdateLinkeBahamutVcsmergerequestResponse.Result["+ i +"].DeletedFile"));
			resultItem.setDiff(_ctx.stringValue("UpdateLinkeBahamutVcsmergerequestResponse.Result["+ i +"].Diff"));
			resultItem.setFilePathId(_ctx.stringValue("UpdateLinkeBahamutVcsmergerequestResponse.Result["+ i +"].FilePathId"));
			resultItem.setFromId(_ctx.stringValue("UpdateLinkeBahamutVcsmergerequestResponse.Result["+ i +"].FromId"));
			resultItem.setNewFile(_ctx.booleanValue("UpdateLinkeBahamutVcsmergerequestResponse.Result["+ i +"].NewFile"));
			resultItem.setNewPath(_ctx.stringValue("UpdateLinkeBahamutVcsmergerequestResponse.Result["+ i +"].NewPath"));
			resultItem.setOldPath(_ctx.stringValue("UpdateLinkeBahamutVcsmergerequestResponse.Result["+ i +"].OldPath"));
			resultItem.setRenamedFile(_ctx.booleanValue("UpdateLinkeBahamutVcsmergerequestResponse.Result["+ i +"].RenamedFile"));
			resultItem.setToId(_ctx.stringValue("UpdateLinkeBahamutVcsmergerequestResponse.Result["+ i +"].ToId"));

			result.add(resultItem);
		}
		updateLinkeBahamutVcsmergerequestResponse.setResult(result);
	 
	 	return updateLinkeBahamutVcsmergerequestResponse;
	}
}