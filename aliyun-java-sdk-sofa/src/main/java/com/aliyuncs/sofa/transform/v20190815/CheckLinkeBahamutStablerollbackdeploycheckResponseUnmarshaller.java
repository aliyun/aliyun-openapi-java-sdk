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

import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutStablerollbackdeploycheckResponse;
import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutStablerollbackdeploycheckResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckLinkeBahamutStablerollbackdeploycheckResponseUnmarshaller {

	public static CheckLinkeBahamutStablerollbackdeploycheckResponse unmarshall(CheckLinkeBahamutStablerollbackdeploycheckResponse checkLinkeBahamutStablerollbackdeploycheckResponse, UnmarshallerContext _ctx) {
		
		checkLinkeBahamutStablerollbackdeploycheckResponse.setRequestId(_ctx.stringValue("CheckLinkeBahamutStablerollbackdeploycheckResponse.RequestId"));
		checkLinkeBahamutStablerollbackdeploycheckResponse.setResultCode(_ctx.stringValue("CheckLinkeBahamutStablerollbackdeploycheckResponse.ResultCode"));
		checkLinkeBahamutStablerollbackdeploycheckResponse.setResultMessage(_ctx.stringValue("CheckLinkeBahamutStablerollbackdeploycheckResponse.ResultMessage"));
		checkLinkeBahamutStablerollbackdeploycheckResponse.setErrorMessage(_ctx.stringValue("CheckLinkeBahamutStablerollbackdeploycheckResponse.ErrorMessage"));
		checkLinkeBahamutStablerollbackdeploycheckResponse.setErrorMsgParamsMap(_ctx.stringValue("CheckLinkeBahamutStablerollbackdeploycheckResponse.ErrorMsgParamsMap"));
		checkLinkeBahamutStablerollbackdeploycheckResponse.setMessage(_ctx.stringValue("CheckLinkeBahamutStablerollbackdeploycheckResponse.Message"));
		checkLinkeBahamutStablerollbackdeploycheckResponse.setResponseStatusCode(_ctx.longValue("CheckLinkeBahamutStablerollbackdeploycheckResponse.ResponseStatusCode"));
		checkLinkeBahamutStablerollbackdeploycheckResponse.setSuccess(_ctx.booleanValue("CheckLinkeBahamutStablerollbackdeploycheckResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("CheckLinkeBahamutStablerollbackdeploycheckResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setApp(_ctx.stringValue("CheckLinkeBahamutStablerollbackdeploycheckResponse.Result["+ i +"].App"));
			resultItem.setStatus(_ctx.stringValue("CheckLinkeBahamutStablerollbackdeploycheckResponse.Result["+ i +"].Status"));
			resultItem.setUrl(_ctx.stringValue("CheckLinkeBahamutStablerollbackdeploycheckResponse.Result["+ i +"].Url"));

			result.add(resultItem);
		}
		checkLinkeBahamutStablerollbackdeploycheckResponse.setResult(result);
	 
	 	return checkLinkeBahamutStablerollbackdeploycheckResponse;
	}
}