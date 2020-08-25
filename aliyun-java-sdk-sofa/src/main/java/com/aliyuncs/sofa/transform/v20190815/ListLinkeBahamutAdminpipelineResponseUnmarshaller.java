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

import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutAdminpipelineResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutAdminpipelineResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeBahamutAdminpipelineResponseUnmarshaller {

	public static ListLinkeBahamutAdminpipelineResponse unmarshall(ListLinkeBahamutAdminpipelineResponse listLinkeBahamutAdminpipelineResponse, UnmarshallerContext _ctx) {
		
		listLinkeBahamutAdminpipelineResponse.setRequestId(_ctx.stringValue("ListLinkeBahamutAdminpipelineResponse.RequestId"));
		listLinkeBahamutAdminpipelineResponse.setResultCode(_ctx.stringValue("ListLinkeBahamutAdminpipelineResponse.ResultCode"));
		listLinkeBahamutAdminpipelineResponse.setResultMessage(_ctx.stringValue("ListLinkeBahamutAdminpipelineResponse.ResultMessage"));
		listLinkeBahamutAdminpipelineResponse.setErrorMessage(_ctx.stringValue("ListLinkeBahamutAdminpipelineResponse.ErrorMessage"));
		listLinkeBahamutAdminpipelineResponse.setErrorMsgParamsMap(_ctx.stringValue("ListLinkeBahamutAdminpipelineResponse.ErrorMsgParamsMap"));
		listLinkeBahamutAdminpipelineResponse.setMessage(_ctx.stringValue("ListLinkeBahamutAdminpipelineResponse.Message"));
		listLinkeBahamutAdminpipelineResponse.setResponseStatusCode(_ctx.longValue("ListLinkeBahamutAdminpipelineResponse.ResponseStatusCode"));
		listLinkeBahamutAdminpipelineResponse.setSuccess(_ctx.booleanValue("ListLinkeBahamutAdminpipelineResponse.Success"));

		Result result = new Result();
		result.setCount(_ctx.longValue("ListLinkeBahamutAdminpipelineResponse.Result.Count"));
		result.setPage(_ctx.longValue("ListLinkeBahamutAdminpipelineResponse.Result.Page"));
		result.setPageCount(_ctx.longValue("ListLinkeBahamutAdminpipelineResponse.Result.PageCount"));
		result.setPageSize(_ctx.longValue("ListLinkeBahamutAdminpipelineResponse.Result.PageSize"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeBahamutAdminpipelineResponse.Result.Data.Length"); i++) {
			data.add(_ctx.stringValue("ListLinkeBahamutAdminpipelineResponse.Result.Data["+ i +"]"));
		}
		result.setData(data);
		listLinkeBahamutAdminpipelineResponse.setResult(result);
	 
	 	return listLinkeBahamutAdminpipelineResponse;
	}
}