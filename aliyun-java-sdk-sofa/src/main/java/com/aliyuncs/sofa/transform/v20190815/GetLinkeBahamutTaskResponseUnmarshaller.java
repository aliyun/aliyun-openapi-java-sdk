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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutTaskResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutTaskResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutTaskResponseUnmarshaller {

	public static GetLinkeBahamutTaskResponse unmarshall(GetLinkeBahamutTaskResponse getLinkeBahamutTaskResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutTaskResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutTaskResponse.RequestId"));
		getLinkeBahamutTaskResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutTaskResponse.ResultCode"));
		getLinkeBahamutTaskResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutTaskResponse.ResultMessage"));
		getLinkeBahamutTaskResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutTaskResponse.ErrorMessage"));
		getLinkeBahamutTaskResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutTaskResponse.ErrorMsgParamsMap"));
		getLinkeBahamutTaskResponse.setMessage(_ctx.stringValue("GetLinkeBahamutTaskResponse.Message"));
		getLinkeBahamutTaskResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutTaskResponse.ResponseStatusCode"));
		getLinkeBahamutTaskResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutTaskResponse.Success"));

		Result result = new Result();
		result.setAssignee(_ctx.stringValue("GetLinkeBahamutTaskResponse.Result.Assignee"));
		result.setAutoCreating(_ctx.booleanValue("GetLinkeBahamutTaskResponse.Result.AutoCreating"));
		result.setContent(_ctx.stringValue("GetLinkeBahamutTaskResponse.Result.Content"));
		result.setContext(_ctx.stringValue("GetLinkeBahamutTaskResponse.Result.Context"));
		result.setCreated(_ctx.longValue("GetLinkeBahamutTaskResponse.Result.Created"));
		result.setDeleted(_ctx.booleanValue("GetLinkeBahamutTaskResponse.Result.Deleted"));
		result.setExternalId(_ctx.stringValue("GetLinkeBahamutTaskResponse.Result.ExternalId"));
		result.setId(_ctx.stringValue("GetLinkeBahamutTaskResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("GetLinkeBahamutTaskResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("GetLinkeBahamutTaskResponse.Result.Name"));
		result.setOperatorAccount(_ctx.stringValue("GetLinkeBahamutTaskResponse.Result.OperatorAccount"));
		result.setRefId(_ctx.stringValue("GetLinkeBahamutTaskResponse.Result.RefId"));
		result.setRefName(_ctx.stringValue("GetLinkeBahamutTaskResponse.Result.RefName"));
		result.setResultMessage(_ctx.stringValue("GetLinkeBahamutTaskResponse.Result.ResultMessage"));
		result.setStatus(_ctx.stringValue("GetLinkeBahamutTaskResponse.Result.Status"));
		result.setTaskScope(_ctx.stringValue("GetLinkeBahamutTaskResponse.Result.TaskScope"));
		result.setType(_ctx.stringValue("GetLinkeBahamutTaskResponse.Result.Type"));
		result.setUrl(_ctx.stringValue("GetLinkeBahamutTaskResponse.Result.Url"));
		getLinkeBahamutTaskResponse.setResult(result);
	 
	 	return getLinkeBahamutTaskResponse;
	}
}