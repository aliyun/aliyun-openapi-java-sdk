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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutTasklistbyuserResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutTasklistbyuserResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutTasklistbyuserResponseUnmarshaller {

	public static GetLinkeBahamutTasklistbyuserResponse unmarshall(GetLinkeBahamutTasklistbyuserResponse getLinkeBahamutTasklistbyuserResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutTasklistbyuserResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutTasklistbyuserResponse.RequestId"));
		getLinkeBahamutTasklistbyuserResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutTasklistbyuserResponse.ResultCode"));
		getLinkeBahamutTasklistbyuserResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutTasklistbyuserResponse.ResultMessage"));
		getLinkeBahamutTasklistbyuserResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutTasklistbyuserResponse.ErrorMessage"));
		getLinkeBahamutTasklistbyuserResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutTasklistbyuserResponse.ErrorMsgParamsMap"));
		getLinkeBahamutTasklistbyuserResponse.setMessage(_ctx.stringValue("GetLinkeBahamutTasklistbyuserResponse.Message"));
		getLinkeBahamutTasklistbyuserResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutTasklistbyuserResponse.ResponseStatusCode"));
		getLinkeBahamutTasklistbyuserResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutTasklistbyuserResponse.Success"));

		Result result = new Result();
		result.setErrorMessage(_ctx.stringValue("GetLinkeBahamutTasklistbyuserResponse.Result.ErrorMessage"));
		result.setPager(_ctx.stringValue("GetLinkeBahamutTasklistbyuserResponse.Result.Pager"));
		result.setSuccess(_ctx.booleanValue("GetLinkeBahamutTasklistbyuserResponse.Result.Success"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutTasklistbyuserResponse.Result.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetLinkeBahamutTasklistbyuserResponse.Result.Data["+ i +"]"));
		}
		result.setData(data);
		getLinkeBahamutTasklistbyuserResponse.setResult(result);
	 
	 	return getLinkeBahamutTasklistbyuserResponse;
	}
}