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

import com.aliyuncs.sofa.model.v20190815.ConfirmLinkeBahamutIterationconfigcheckResponse;
import com.aliyuncs.sofa.model.v20190815.ConfirmLinkeBahamutIterationconfigcheckResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConfirmLinkeBahamutIterationconfigcheckResponseUnmarshaller {

	public static ConfirmLinkeBahamutIterationconfigcheckResponse unmarshall(ConfirmLinkeBahamutIterationconfigcheckResponse confirmLinkeBahamutIterationconfigcheckResponse, UnmarshallerContext _ctx) {
		
		confirmLinkeBahamutIterationconfigcheckResponse.setRequestId(_ctx.stringValue("ConfirmLinkeBahamutIterationconfigcheckResponse.RequestId"));
		confirmLinkeBahamutIterationconfigcheckResponse.setResultCode(_ctx.stringValue("ConfirmLinkeBahamutIterationconfigcheckResponse.ResultCode"));
		confirmLinkeBahamutIterationconfigcheckResponse.setResultMessage(_ctx.stringValue("ConfirmLinkeBahamutIterationconfigcheckResponse.ResultMessage"));
		confirmLinkeBahamutIterationconfigcheckResponse.setErrorMessage(_ctx.stringValue("ConfirmLinkeBahamutIterationconfigcheckResponse.ErrorMessage"));
		confirmLinkeBahamutIterationconfigcheckResponse.setErrorMsgParamsMap(_ctx.stringValue("ConfirmLinkeBahamutIterationconfigcheckResponse.ErrorMsgParamsMap"));
		confirmLinkeBahamutIterationconfigcheckResponse.setMessage(_ctx.stringValue("ConfirmLinkeBahamutIterationconfigcheckResponse.Message"));
		confirmLinkeBahamutIterationconfigcheckResponse.setResponseStatusCode(_ctx.longValue("ConfirmLinkeBahamutIterationconfigcheckResponse.ResponseStatusCode"));
		confirmLinkeBahamutIterationconfigcheckResponse.setSuccess(_ctx.booleanValue("ConfirmLinkeBahamutIterationconfigcheckResponse.Success"));

		Result result = new Result();
		result.setDetailMessage(_ctx.stringValue("ConfirmLinkeBahamutIterationconfigcheckResponse.Result.DetailMessage"));
		result.setForceStop(_ctx.booleanValue("ConfirmLinkeBahamutIterationconfigcheckResponse.Result.ForceStop"));
		result.setPass(_ctx.booleanValue("ConfirmLinkeBahamutIterationconfigcheckResponse.Result.Pass"));

		List<String> checkList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ConfirmLinkeBahamutIterationconfigcheckResponse.Result.CheckList.Length"); i++) {
			checkList.add(_ctx.stringValue("ConfirmLinkeBahamutIterationconfigcheckResponse.Result.CheckList["+ i +"]"));
		}
		result.setCheckList(checkList);
		confirmLinkeBahamutIterationconfigcheckResponse.setResult(result);
	 
	 	return confirmLinkeBahamutIterationconfigcheckResponse;
	}
}