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

import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutReleasestabledeploycheckResponse;
import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutReleasestabledeploycheckResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckLinkeBahamutReleasestabledeploycheckResponseUnmarshaller {

	public static CheckLinkeBahamutReleasestabledeploycheckResponse unmarshall(CheckLinkeBahamutReleasestabledeploycheckResponse checkLinkeBahamutReleasestabledeploycheckResponse, UnmarshallerContext _ctx) {
		
		checkLinkeBahamutReleasestabledeploycheckResponse.setRequestId(_ctx.stringValue("CheckLinkeBahamutReleasestabledeploycheckResponse.RequestId"));
		checkLinkeBahamutReleasestabledeploycheckResponse.setResultCode(_ctx.stringValue("CheckLinkeBahamutReleasestabledeploycheckResponse.ResultCode"));
		checkLinkeBahamutReleasestabledeploycheckResponse.setResultMessage(_ctx.stringValue("CheckLinkeBahamutReleasestabledeploycheckResponse.ResultMessage"));
		checkLinkeBahamutReleasestabledeploycheckResponse.setErrorMessage(_ctx.stringValue("CheckLinkeBahamutReleasestabledeploycheckResponse.ErrorMessage"));
		checkLinkeBahamutReleasestabledeploycheckResponse.setErrorMsgParamsMap(_ctx.stringValue("CheckLinkeBahamutReleasestabledeploycheckResponse.ErrorMsgParamsMap"));
		checkLinkeBahamutReleasestabledeploycheckResponse.setMessage(_ctx.stringValue("CheckLinkeBahamutReleasestabledeploycheckResponse.Message"));
		checkLinkeBahamutReleasestabledeploycheckResponse.setResponseStatusCode(_ctx.longValue("CheckLinkeBahamutReleasestabledeploycheckResponse.ResponseStatusCode"));
		checkLinkeBahamutReleasestabledeploycheckResponse.setSuccess(_ctx.booleanValue("CheckLinkeBahamutReleasestabledeploycheckResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("CheckLinkeBahamutReleasestabledeploycheckResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setApp(_ctx.stringValue("CheckLinkeBahamutReleasestabledeploycheckResponse.Result["+ i +"].App"));
			resultItem.setStatus(_ctx.stringValue("CheckLinkeBahamutReleasestabledeploycheckResponse.Result["+ i +"].Status"));
			resultItem.setUrl(_ctx.stringValue("CheckLinkeBahamutReleasestabledeploycheckResponse.Result["+ i +"].Url"));

			result.add(resultItem);
		}
		checkLinkeBahamutReleasestabledeploycheckResponse.setResult(result);
	 
	 	return checkLinkeBahamutReleasestabledeploycheckResponse;
	}
}