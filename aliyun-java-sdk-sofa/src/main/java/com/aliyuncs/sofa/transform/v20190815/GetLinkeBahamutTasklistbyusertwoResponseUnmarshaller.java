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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutTasklistbyusertwoResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutTasklistbyusertwoResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutTasklistbyusertwoResponseUnmarshaller {

	public static GetLinkeBahamutTasklistbyusertwoResponse unmarshall(GetLinkeBahamutTasklistbyusertwoResponse getLinkeBahamutTasklistbyusertwoResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutTasklistbyusertwoResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutTasklistbyusertwoResponse.RequestId"));
		getLinkeBahamutTasklistbyusertwoResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutTasklistbyusertwoResponse.ResultCode"));
		getLinkeBahamutTasklistbyusertwoResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutTasklistbyusertwoResponse.ResultMessage"));
		getLinkeBahamutTasklistbyusertwoResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutTasklistbyusertwoResponse.ErrorMessage"));
		getLinkeBahamutTasklistbyusertwoResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutTasklistbyusertwoResponse.ErrorMsgParamsMap"));
		getLinkeBahamutTasklistbyusertwoResponse.setMessage(_ctx.stringValue("GetLinkeBahamutTasklistbyusertwoResponse.Message"));
		getLinkeBahamutTasklistbyusertwoResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutTasklistbyusertwoResponse.ResponseStatusCode"));
		getLinkeBahamutTasklistbyusertwoResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutTasklistbyusertwoResponse.Success"));

		Result result = new Result();
		result.setCount(_ctx.longValue("GetLinkeBahamutTasklistbyusertwoResponse.Result.Count"));
		result.setPage(_ctx.longValue("GetLinkeBahamutTasklistbyusertwoResponse.Result.Page"));
		result.setPageCount(_ctx.longValue("GetLinkeBahamutTasklistbyusertwoResponse.Result.PageCount"));
		result.setPageSize(_ctx.longValue("GetLinkeBahamutTasklistbyusertwoResponse.Result.PageSize"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutTasklistbyusertwoResponse.Result.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetLinkeBahamutTasklistbyusertwoResponse.Result.Data["+ i +"]"));
		}
		result.setData(data);
		getLinkeBahamutTasklistbyusertwoResponse.setResult(result);
	 
	 	return getLinkeBahamutTasklistbyusertwoResponse;
	}
}