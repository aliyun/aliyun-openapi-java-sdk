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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAllbuResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAllbuResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAllbuResponseUnmarshaller {

	public static GetLinkeBahamutAllbuResponse unmarshall(GetLinkeBahamutAllbuResponse getLinkeBahamutAllbuResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAllbuResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAllbuResponse.RequestId"));
		getLinkeBahamutAllbuResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAllbuResponse.ResultCode"));
		getLinkeBahamutAllbuResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAllbuResponse.ResultMessage"));
		getLinkeBahamutAllbuResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAllbuResponse.ErrorMessage"));
		getLinkeBahamutAllbuResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAllbuResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAllbuResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAllbuResponse.Message"));
		getLinkeBahamutAllbuResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAllbuResponse.ResponseStatusCode"));
		getLinkeBahamutAllbuResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAllbuResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAllbuResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setDescription(_ctx.stringValue("GetLinkeBahamutAllbuResponse.Result["+ i +"].Description"));
			resultItem.setId(_ctx.longValue("GetLinkeBahamutAllbuResponse.Result["+ i +"].Id"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutAllbuResponse.Result["+ i +"].Name"));

			result.add(resultItem);
		}
		getLinkeBahamutAllbuResponse.setResult(result);
	 
	 	return getLinkeBahamutAllbuResponse;
	}
}