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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAoneinternalgetdefectlistResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAoneinternalgetdefectlistResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAoneinternalgetdefectlistResponseUnmarshaller {

	public static GetLinkeBahamutAoneinternalgetdefectlistResponse unmarshall(GetLinkeBahamutAoneinternalgetdefectlistResponse getLinkeBahamutAoneinternalgetdefectlistResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAoneinternalgetdefectlistResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAoneinternalgetdefectlistResponse.RequestId"));
		getLinkeBahamutAoneinternalgetdefectlistResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAoneinternalgetdefectlistResponse.ResultCode"));
		getLinkeBahamutAoneinternalgetdefectlistResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAoneinternalgetdefectlistResponse.ResultMessage"));
		getLinkeBahamutAoneinternalgetdefectlistResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAoneinternalgetdefectlistResponse.ErrorMessage"));
		getLinkeBahamutAoneinternalgetdefectlistResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAoneinternalgetdefectlistResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAoneinternalgetdefectlistResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAoneinternalgetdefectlistResponse.Message"));
		getLinkeBahamutAoneinternalgetdefectlistResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAoneinternalgetdefectlistResponse.ResponseStatusCode"));
		getLinkeBahamutAoneinternalgetdefectlistResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAoneinternalgetdefectlistResponse.Success"));

		Result result = new Result();
		result.setMessage(_ctx.stringValue("GetLinkeBahamutAoneinternalgetdefectlistResponse.Result.Message"));
		result.setPageSize(_ctx.longValue("GetLinkeBahamutAoneinternalgetdefectlistResponse.Result.PageSize"));
		result.setSuccess(_ctx.booleanValue("GetLinkeBahamutAoneinternalgetdefectlistResponse.Result.Success"));
		result.setTotalCount(_ctx.longValue("GetLinkeBahamutAoneinternalgetdefectlistResponse.Result.TotalCount"));
		result.setTotalPages(_ctx.longValue("GetLinkeBahamutAoneinternalgetdefectlistResponse.Result.TotalPages"));
		result.setToPage(_ctx.longValue("GetLinkeBahamutAoneinternalgetdefectlistResponse.Result.ToPage"));

		List<String> result1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAoneinternalgetdefectlistResponse.Result.Result.Length"); i++) {
			result1.add(_ctx.stringValue("GetLinkeBahamutAoneinternalgetdefectlistResponse.Result.Result["+ i +"]"));
		}
		result.setResult1(result1);
		getLinkeBahamutAoneinternalgetdefectlistResponse.setResult(result);
	 
	 	return getLinkeBahamutAoneinternalgetdefectlistResponse;
	}
}