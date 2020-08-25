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

import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponse;
import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponseUnmarshaller {

	public static CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponse unmarshall(CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponse checkLinkeBahamutReleasestablestablerollbackdeploycheckResponse, UnmarshallerContext _ctx) {
		
		checkLinkeBahamutReleasestablestablerollbackdeploycheckResponse.setRequestId(_ctx.stringValue("CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponse.RequestId"));
		checkLinkeBahamutReleasestablestablerollbackdeploycheckResponse.setResultCode(_ctx.stringValue("CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponse.ResultCode"));
		checkLinkeBahamutReleasestablestablerollbackdeploycheckResponse.setResultMessage(_ctx.stringValue("CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponse.ResultMessage"));
		checkLinkeBahamutReleasestablestablerollbackdeploycheckResponse.setErrorMessage(_ctx.stringValue("CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponse.ErrorMessage"));
		checkLinkeBahamutReleasestablestablerollbackdeploycheckResponse.setErrorMsgParamsMap(_ctx.stringValue("CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponse.ErrorMsgParamsMap"));
		checkLinkeBahamutReleasestablestablerollbackdeploycheckResponse.setMessage(_ctx.stringValue("CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponse.Message"));
		checkLinkeBahamutReleasestablestablerollbackdeploycheckResponse.setResponseStatusCode(_ctx.longValue("CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponse.ResponseStatusCode"));
		checkLinkeBahamutReleasestablestablerollbackdeploycheckResponse.setSuccess(_ctx.booleanValue("CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setApp(_ctx.stringValue("CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponse.Result["+ i +"].App"));
			resultItem.setStatus(_ctx.stringValue("CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponse.Result["+ i +"].Status"));
			resultItem.setUrl(_ctx.stringValue("CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponse.Result["+ i +"].Url"));

			result.add(resultItem);
		}
		checkLinkeBahamutReleasestablestablerollbackdeploycheckResponse.setResult(result);
	 
	 	return checkLinkeBahamutReleasestablestablerollbackdeploycheckResponse;
	}
}