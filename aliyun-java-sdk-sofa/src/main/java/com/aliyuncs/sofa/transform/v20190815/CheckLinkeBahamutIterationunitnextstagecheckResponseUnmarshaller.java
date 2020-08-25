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

import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutIterationunitnextstagecheckResponse;
import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutIterationunitnextstagecheckResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckLinkeBahamutIterationunitnextstagecheckResponseUnmarshaller {

	public static CheckLinkeBahamutIterationunitnextstagecheckResponse unmarshall(CheckLinkeBahamutIterationunitnextstagecheckResponse checkLinkeBahamutIterationunitnextstagecheckResponse, UnmarshallerContext _ctx) {
		
		checkLinkeBahamutIterationunitnextstagecheckResponse.setRequestId(_ctx.stringValue("CheckLinkeBahamutIterationunitnextstagecheckResponse.RequestId"));
		checkLinkeBahamutIterationunitnextstagecheckResponse.setResultCode(_ctx.stringValue("CheckLinkeBahamutIterationunitnextstagecheckResponse.ResultCode"));
		checkLinkeBahamutIterationunitnextstagecheckResponse.setResultMessage(_ctx.stringValue("CheckLinkeBahamutIterationunitnextstagecheckResponse.ResultMessage"));
		checkLinkeBahamutIterationunitnextstagecheckResponse.setErrorMessage(_ctx.stringValue("CheckLinkeBahamutIterationunitnextstagecheckResponse.ErrorMessage"));
		checkLinkeBahamutIterationunitnextstagecheckResponse.setErrorMsgParamsMap(_ctx.stringValue("CheckLinkeBahamutIterationunitnextstagecheckResponse.ErrorMsgParamsMap"));
		checkLinkeBahamutIterationunitnextstagecheckResponse.setMessage(_ctx.stringValue("CheckLinkeBahamutIterationunitnextstagecheckResponse.Message"));
		checkLinkeBahamutIterationunitnextstagecheckResponse.setResponseStatusCode(_ctx.longValue("CheckLinkeBahamutIterationunitnextstagecheckResponse.ResponseStatusCode"));
		checkLinkeBahamutIterationunitnextstagecheckResponse.setSuccess(_ctx.booleanValue("CheckLinkeBahamutIterationunitnextstagecheckResponse.Success"));

		Result result = new Result();
		result.setBatchGuardCheckResult(_ctx.stringValue("CheckLinkeBahamutIterationunitnextstagecheckResponse.Result.BatchGuardCheckResult"));
		result.setPassed(_ctx.booleanValue("CheckLinkeBahamutIterationunitnextstagecheckResponse.Result.Passed"));

		List<String> content = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CheckLinkeBahamutIterationunitnextstagecheckResponse.Result.Content.Length"); i++) {
			content.add(_ctx.stringValue("CheckLinkeBahamutIterationunitnextstagecheckResponse.Result.Content["+ i +"]"));
		}
		result.setContent(content);

		List<String> warnContent = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CheckLinkeBahamutIterationunitnextstagecheckResponse.Result.WarnContent.Length"); i++) {
			warnContent.add(_ctx.stringValue("CheckLinkeBahamutIterationunitnextstagecheckResponse.Result.WarnContent["+ i +"]"));
		}
		result.setWarnContent(warnContent);
		checkLinkeBahamutIterationunitnextstagecheckResponse.setResult(result);
	 
	 	return checkLinkeBahamutIterationunitnextstagecheckResponse;
	}
}