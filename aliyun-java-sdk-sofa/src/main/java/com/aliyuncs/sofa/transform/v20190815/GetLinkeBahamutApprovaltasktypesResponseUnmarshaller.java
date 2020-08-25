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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutApprovaltasktypesResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutApprovaltasktypesResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutApprovaltasktypesResponseUnmarshaller {

	public static GetLinkeBahamutApprovaltasktypesResponse unmarshall(GetLinkeBahamutApprovaltasktypesResponse getLinkeBahamutApprovaltasktypesResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutApprovaltasktypesResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutApprovaltasktypesResponse.RequestId"));
		getLinkeBahamutApprovaltasktypesResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutApprovaltasktypesResponse.ResultCode"));
		getLinkeBahamutApprovaltasktypesResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutApprovaltasktypesResponse.ResultMessage"));
		getLinkeBahamutApprovaltasktypesResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutApprovaltasktypesResponse.ErrorMessage"));
		getLinkeBahamutApprovaltasktypesResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutApprovaltasktypesResponse.ErrorMsgParamsMap"));
		getLinkeBahamutApprovaltasktypesResponse.setMessage(_ctx.stringValue("GetLinkeBahamutApprovaltasktypesResponse.Message"));
		getLinkeBahamutApprovaltasktypesResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutApprovaltasktypesResponse.ResponseStatusCode"));
		getLinkeBahamutApprovaltasktypesResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutApprovaltasktypesResponse.Success"));

		Result result = new Result();
		result.setCount(_ctx.longValue("GetLinkeBahamutApprovaltasktypesResponse.Result.Count"));
		result.setPage(_ctx.longValue("GetLinkeBahamutApprovaltasktypesResponse.Result.Page"));
		result.setPageCount(_ctx.longValue("GetLinkeBahamutApprovaltasktypesResponse.Result.PageCount"));
		result.setPageSize(_ctx.longValue("GetLinkeBahamutApprovaltasktypesResponse.Result.PageSize"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutApprovaltasktypesResponse.Result.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetLinkeBahamutApprovaltasktypesResponse.Result.Data["+ i +"]"));
		}
		result.setData(data);
		getLinkeBahamutApprovaltasktypesResponse.setResult(result);
	 
	 	return getLinkeBahamutApprovaltasktypesResponse;
	}
}