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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutTasksgettaskbykeywordResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutTasksgettaskbykeywordResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutTasksgettaskbykeywordResponseUnmarshaller {

	public static GetLinkeBahamutTasksgettaskbykeywordResponse unmarshall(GetLinkeBahamutTasksgettaskbykeywordResponse getLinkeBahamutTasksgettaskbykeywordResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutTasksgettaskbykeywordResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutTasksgettaskbykeywordResponse.RequestId"));
		getLinkeBahamutTasksgettaskbykeywordResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutTasksgettaskbykeywordResponse.ResultCode"));
		getLinkeBahamutTasksgettaskbykeywordResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutTasksgettaskbykeywordResponse.ResultMessage"));
		getLinkeBahamutTasksgettaskbykeywordResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutTasksgettaskbykeywordResponse.ErrorMessage"));
		getLinkeBahamutTasksgettaskbykeywordResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutTasksgettaskbykeywordResponse.ErrorMsgParamsMap"));
		getLinkeBahamutTasksgettaskbykeywordResponse.setMessage(_ctx.stringValue("GetLinkeBahamutTasksgettaskbykeywordResponse.Message"));
		getLinkeBahamutTasksgettaskbykeywordResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutTasksgettaskbykeywordResponse.ResponseStatusCode"));
		getLinkeBahamutTasksgettaskbykeywordResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutTasksgettaskbykeywordResponse.Success"));

		Result result = new Result();
		result.setCount(_ctx.longValue("GetLinkeBahamutTasksgettaskbykeywordResponse.Result.Count"));
		result.setPage(_ctx.longValue("GetLinkeBahamutTasksgettaskbykeywordResponse.Result.Page"));
		result.setPageCount(_ctx.longValue("GetLinkeBahamutTasksgettaskbykeywordResponse.Result.PageCount"));
		result.setPageSize(_ctx.longValue("GetLinkeBahamutTasksgettaskbykeywordResponse.Result.PageSize"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutTasksgettaskbykeywordResponse.Result.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetLinkeBahamutTasksgettaskbykeywordResponse.Result.Data["+ i +"]"));
		}
		result.setData(data);
		getLinkeBahamutTasksgettaskbykeywordResponse.setResult(result);
	 
	 	return getLinkeBahamutTasksgettaskbykeywordResponse;
	}
}