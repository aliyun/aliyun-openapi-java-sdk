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

import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutWebapistabledeploycheckResponse;
import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutWebapistabledeploycheckResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckLinkeBahamutWebapistabledeploycheckResponseUnmarshaller {

	public static CheckLinkeBahamutWebapistabledeploycheckResponse unmarshall(CheckLinkeBahamutWebapistabledeploycheckResponse checkLinkeBahamutWebapistabledeploycheckResponse, UnmarshallerContext _ctx) {
		
		checkLinkeBahamutWebapistabledeploycheckResponse.setRequestId(_ctx.stringValue("CheckLinkeBahamutWebapistabledeploycheckResponse.RequestId"));
		checkLinkeBahamutWebapistabledeploycheckResponse.setResultCode(_ctx.stringValue("CheckLinkeBahamutWebapistabledeploycheckResponse.ResultCode"));
		checkLinkeBahamutWebapistabledeploycheckResponse.setResultMessage(_ctx.stringValue("CheckLinkeBahamutWebapistabledeploycheckResponse.ResultMessage"));
		checkLinkeBahamutWebapistabledeploycheckResponse.setErrorMessage(_ctx.stringValue("CheckLinkeBahamutWebapistabledeploycheckResponse.ErrorMessage"));
		checkLinkeBahamutWebapistabledeploycheckResponse.setErrorMsgParamsMap(_ctx.stringValue("CheckLinkeBahamutWebapistabledeploycheckResponse.ErrorMsgParamsMap"));
		checkLinkeBahamutWebapistabledeploycheckResponse.setMessage(_ctx.stringValue("CheckLinkeBahamutWebapistabledeploycheckResponse.Message"));
		checkLinkeBahamutWebapistabledeploycheckResponse.setResponseStatusCode(_ctx.longValue("CheckLinkeBahamutWebapistabledeploycheckResponse.ResponseStatusCode"));
		checkLinkeBahamutWebapistabledeploycheckResponse.setSuccess(_ctx.booleanValue("CheckLinkeBahamutWebapistabledeploycheckResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("CheckLinkeBahamutWebapistabledeploycheckResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setApp(_ctx.stringValue("CheckLinkeBahamutWebapistabledeploycheckResponse.Result["+ i +"].App"));
			resultItem.setStatus(_ctx.stringValue("CheckLinkeBahamutWebapistabledeploycheckResponse.Result["+ i +"].Status"));
			resultItem.setUrl(_ctx.stringValue("CheckLinkeBahamutWebapistabledeploycheckResponse.Result["+ i +"].Url"));

			result.add(resultItem);
		}
		checkLinkeBahamutWebapistabledeploycheckResponse.setResult(result);
	 
	 	return checkLinkeBahamutWebapistabledeploycheckResponse;
	}
}