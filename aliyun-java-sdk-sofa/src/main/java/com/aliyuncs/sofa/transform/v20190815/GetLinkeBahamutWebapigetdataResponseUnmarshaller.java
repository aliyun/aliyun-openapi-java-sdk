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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutWebapigetdataResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutWebapigetdataResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutWebapigetdataResponseUnmarshaller {

	public static GetLinkeBahamutWebapigetdataResponse unmarshall(GetLinkeBahamutWebapigetdataResponse getLinkeBahamutWebapigetdataResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutWebapigetdataResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutWebapigetdataResponse.RequestId"));
		getLinkeBahamutWebapigetdataResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutWebapigetdataResponse.ResultCode"));
		getLinkeBahamutWebapigetdataResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutWebapigetdataResponse.ResultMessage"));
		getLinkeBahamutWebapigetdataResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutWebapigetdataResponse.ErrorMessage"));
		getLinkeBahamutWebapigetdataResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutWebapigetdataResponse.ErrorMsgParamsMap"));
		getLinkeBahamutWebapigetdataResponse.setMessage(_ctx.stringValue("GetLinkeBahamutWebapigetdataResponse.Message"));
		getLinkeBahamutWebapigetdataResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutWebapigetdataResponse.ResponseStatusCode"));
		getLinkeBahamutWebapigetdataResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutWebapigetdataResponse.Success"));

		Result result = new Result();
		result.setAppName(_ctx.stringValue("GetLinkeBahamutWebapigetdataResponse.Result.AppName"));
		result.setBranch(_ctx.stringValue("GetLinkeBahamutWebapigetdataResponse.Result.Branch"));
		result.setCodeName(_ctx.stringValue("GetLinkeBahamutWebapigetdataResponse.Result.CodeName"));
		result.setPass(_ctx.booleanValue("GetLinkeBahamutWebapigetdataResponse.Result.Pass"));

		List<String> items = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutWebapigetdataResponse.Result.Items.Length"); i++) {
			items.add(_ctx.stringValue("GetLinkeBahamutWebapigetdataResponse.Result.Items["+ i +"]"));
		}
		result.setItems(items);
		getLinkeBahamutWebapigetdataResponse.setResult(result);
	 
	 	return getLinkeBahamutWebapigetdataResponse;
	}
}