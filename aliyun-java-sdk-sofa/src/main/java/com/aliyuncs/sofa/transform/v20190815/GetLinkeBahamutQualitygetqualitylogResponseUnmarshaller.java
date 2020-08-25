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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutQualitygetqualitylogResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutQualitygetqualitylogResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutQualitygetqualitylogResponseUnmarshaller {

	public static GetLinkeBahamutQualitygetqualitylogResponse unmarshall(GetLinkeBahamutQualitygetqualitylogResponse getLinkeBahamutQualitygetqualitylogResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutQualitygetqualitylogResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutQualitygetqualitylogResponse.RequestId"));
		getLinkeBahamutQualitygetqualitylogResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutQualitygetqualitylogResponse.ResultCode"));
		getLinkeBahamutQualitygetqualitylogResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutQualitygetqualitylogResponse.ResultMessage"));
		getLinkeBahamutQualitygetqualitylogResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutQualitygetqualitylogResponse.ErrorMessage"));
		getLinkeBahamutQualitygetqualitylogResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutQualitygetqualitylogResponse.ErrorMsgParamsMap"));
		getLinkeBahamutQualitygetqualitylogResponse.setMessage(_ctx.stringValue("GetLinkeBahamutQualitygetqualitylogResponse.Message"));
		getLinkeBahamutQualitygetqualitylogResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutQualitygetqualitylogResponse.ResponseStatusCode"));
		getLinkeBahamutQualitygetqualitylogResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutQualitygetqualitylogResponse.Success"));

		Result result = new Result();
		result.setCount(_ctx.longValue("GetLinkeBahamutQualitygetqualitylogResponse.Result.Count"));
		result.setPage(_ctx.longValue("GetLinkeBahamutQualitygetqualitylogResponse.Result.Page"));
		result.setPageCount(_ctx.longValue("GetLinkeBahamutQualitygetqualitylogResponse.Result.PageCount"));
		result.setPageSize(_ctx.longValue("GetLinkeBahamutQualitygetqualitylogResponse.Result.PageSize"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutQualitygetqualitylogResponse.Result.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetLinkeBahamutQualitygetqualitylogResponse.Result.Data["+ i +"]"));
		}
		result.setData(data);
		getLinkeBahamutQualitygetqualitylogResponse.setResult(result);
	 
	 	return getLinkeBahamutQualitygetqualitylogResponse;
	}
}