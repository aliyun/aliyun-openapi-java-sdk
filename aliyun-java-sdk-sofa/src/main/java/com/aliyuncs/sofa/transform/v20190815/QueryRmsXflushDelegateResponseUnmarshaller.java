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

import com.aliyuncs.sofa.model.v20190815.QueryRmsXflushDelegateResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsXflushDelegateResponse.Response;
import com.aliyuncs.sofa.model.v20190815.QueryRmsXflushDelegateResponse.Response.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsXflushDelegateResponseUnmarshaller {

	public static QueryRmsXflushDelegateResponse unmarshall(QueryRmsXflushDelegateResponse queryRmsXflushDelegateResponse, UnmarshallerContext _ctx) {
		
		queryRmsXflushDelegateResponse.setRequestId(_ctx.stringValue("QueryRmsXflushDelegateResponse.RequestId"));
		queryRmsXflushDelegateResponse.setResultCode(_ctx.stringValue("QueryRmsXflushDelegateResponse.ResultCode"));
		queryRmsXflushDelegateResponse.setResultMessage(_ctx.stringValue("QueryRmsXflushDelegateResponse.ResultMessage"));

		Response response = new Response();
		response.setLayer(_ctx.stringValue("QueryRmsXflushDelegateResponse.Response.Layer"));

		Data data = new Data();
		data.setErrCode(_ctx.stringValue("QueryRmsXflushDelegateResponse.Response.Data.ErrCode"));
		data.setErrMsg(_ctx.stringValue("QueryRmsXflushDelegateResponse.Response.Data.ErrMsg"));
		data.setErrResolution(_ctx.stringValue("QueryRmsXflushDelegateResponse.Response.Data.ErrResolution"));
		data.setMessage(_ctx.stringValue("QueryRmsXflushDelegateResponse.Response.Data.Message"));
		data.setModule(_ctx.stringValue("QueryRmsXflushDelegateResponse.Response.Data.Module"));
		data.setSuccess(_ctx.booleanValue("QueryRmsXflushDelegateResponse.Response.Data.Success"));
		response.setData(data);
		queryRmsXflushDelegateResponse.setResponse(response);
	 
	 	return queryRmsXflushDelegateResponse;
	}
}