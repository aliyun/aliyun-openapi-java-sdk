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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutQualitygetexternaldataResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutQualitygetexternaldataResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutQualitygetexternaldataResponseUnmarshaller {

	public static GetLinkeBahamutQualitygetexternaldataResponse unmarshall(GetLinkeBahamutQualitygetexternaldataResponse getLinkeBahamutQualitygetexternaldataResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutQualitygetexternaldataResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutQualitygetexternaldataResponse.RequestId"));
		getLinkeBahamutQualitygetexternaldataResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutQualitygetexternaldataResponse.ResultCode"));
		getLinkeBahamutQualitygetexternaldataResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutQualitygetexternaldataResponse.ResultMessage"));
		getLinkeBahamutQualitygetexternaldataResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutQualitygetexternaldataResponse.ErrorMessage"));
		getLinkeBahamutQualitygetexternaldataResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutQualitygetexternaldataResponse.ErrorMsgParamsMap"));
		getLinkeBahamutQualitygetexternaldataResponse.setMessage(_ctx.stringValue("GetLinkeBahamutQualitygetexternaldataResponse.Message"));
		getLinkeBahamutQualitygetexternaldataResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutQualitygetexternaldataResponse.ResponseStatusCode"));
		getLinkeBahamutQualitygetexternaldataResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutQualitygetexternaldataResponse.Success"));

		Result result = new Result();
		result.setAppName(_ctx.stringValue("GetLinkeBahamutQualitygetexternaldataResponse.Result.AppName"));
		result.setBranch(_ctx.stringValue("GetLinkeBahamutQualitygetexternaldataResponse.Result.Branch"));
		result.setCodeName(_ctx.stringValue("GetLinkeBahamutQualitygetexternaldataResponse.Result.CodeName"));
		result.setPass(_ctx.booleanValue("GetLinkeBahamutQualitygetexternaldataResponse.Result.Pass"));

		List<String> items = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutQualitygetexternaldataResponse.Result.Items.Length"); i++) {
			items.add(_ctx.stringValue("GetLinkeBahamutQualitygetexternaldataResponse.Result.Items["+ i +"]"));
		}
		result.setItems(items);
		getLinkeBahamutQualitygetexternaldataResponse.setResult(result);
	 
	 	return getLinkeBahamutQualitygetexternaldataResponse;
	}
}