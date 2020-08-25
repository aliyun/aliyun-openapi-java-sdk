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

import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutLogsinsertlogResponse;
import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutLogsinsertlogResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeBahamutLogsinsertlogResponseUnmarshaller {

	public static AddLinkeBahamutLogsinsertlogResponse unmarshall(AddLinkeBahamutLogsinsertlogResponse addLinkeBahamutLogsinsertlogResponse, UnmarshallerContext _ctx) {
		
		addLinkeBahamutLogsinsertlogResponse.setRequestId(_ctx.stringValue("AddLinkeBahamutLogsinsertlogResponse.RequestId"));
		addLinkeBahamutLogsinsertlogResponse.setResultCode(_ctx.stringValue("AddLinkeBahamutLogsinsertlogResponse.ResultCode"));
		addLinkeBahamutLogsinsertlogResponse.setResultMessage(_ctx.stringValue("AddLinkeBahamutLogsinsertlogResponse.ResultMessage"));
		addLinkeBahamutLogsinsertlogResponse.setErrorMessage(_ctx.stringValue("AddLinkeBahamutLogsinsertlogResponse.ErrorMessage"));
		addLinkeBahamutLogsinsertlogResponse.setErrorMsgParamsMap(_ctx.stringValue("AddLinkeBahamutLogsinsertlogResponse.ErrorMsgParamsMap"));
		addLinkeBahamutLogsinsertlogResponse.setMessage(_ctx.stringValue("AddLinkeBahamutLogsinsertlogResponse.Message"));
		addLinkeBahamutLogsinsertlogResponse.setResponseStatusCode(_ctx.longValue("AddLinkeBahamutLogsinsertlogResponse.ResponseStatusCode"));
		addLinkeBahamutLogsinsertlogResponse.setSuccess(_ctx.booleanValue("AddLinkeBahamutLogsinsertlogResponse.Success"));

		Result result = new Result();
		result.setContent(_ctx.stringValue("AddLinkeBahamutLogsinsertlogResponse.Result.Content"));
		result.setContentDetail(_ctx.stringValue("AddLinkeBahamutLogsinsertlogResponse.Result.ContentDetail"));
		result.setCreated(_ctx.longValue("AddLinkeBahamutLogsinsertlogResponse.Result.Created"));
		result.setDeleted(_ctx.booleanValue("AddLinkeBahamutLogsinsertlogResponse.Result.Deleted"));
		result.setId(_ctx.stringValue("AddLinkeBahamutLogsinsertlogResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("AddLinkeBahamutLogsinsertlogResponse.Result.LastModified"));
		result.setPostValue(_ctx.stringValue("AddLinkeBahamutLogsinsertlogResponse.Result.PostValue"));
		result.setPreValue(_ctx.stringValue("AddLinkeBahamutLogsinsertlogResponse.Result.PreValue"));
		result.setTarget(_ctx.stringValue("AddLinkeBahamutLogsinsertlogResponse.Result.Target"));
		result.setTargetId(_ctx.stringValue("AddLinkeBahamutLogsinsertlogResponse.Result.TargetId"));
		result.setTime(_ctx.longValue("AddLinkeBahamutLogsinsertlogResponse.Result.Time"));
		result.setTraceId(_ctx.stringValue("AddLinkeBahamutLogsinsertlogResponse.Result.TraceId"));
		result.setType(_ctx.stringValue("AddLinkeBahamutLogsinsertlogResponse.Result.Type"));
		result.setUser(_ctx.stringValue("AddLinkeBahamutLogsinsertlogResponse.Result.User"));
		addLinkeBahamutLogsinsertlogResponse.setResult(result);
	 
	 	return addLinkeBahamutLogsinsertlogResponse;
	}
}