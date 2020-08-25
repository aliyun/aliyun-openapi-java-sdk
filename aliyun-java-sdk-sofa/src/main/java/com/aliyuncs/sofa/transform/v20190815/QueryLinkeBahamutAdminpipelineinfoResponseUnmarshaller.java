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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAdminpipelineinfoResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAdminpipelineinfoResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutAdminpipelineinfoResponseUnmarshaller {

	public static QueryLinkeBahamutAdminpipelineinfoResponse unmarshall(QueryLinkeBahamutAdminpipelineinfoResponse queryLinkeBahamutAdminpipelineinfoResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutAdminpipelineinfoResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutAdminpipelineinfoResponse.RequestId"));
		queryLinkeBahamutAdminpipelineinfoResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutAdminpipelineinfoResponse.ResultCode"));
		queryLinkeBahamutAdminpipelineinfoResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutAdminpipelineinfoResponse.ResultMessage"));
		queryLinkeBahamutAdminpipelineinfoResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutAdminpipelineinfoResponse.ErrorMessage"));
		queryLinkeBahamutAdminpipelineinfoResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutAdminpipelineinfoResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutAdminpipelineinfoResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutAdminpipelineinfoResponse.Message"));
		queryLinkeBahamutAdminpipelineinfoResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutAdminpipelineinfoResponse.ResponseStatusCode"));
		queryLinkeBahamutAdminpipelineinfoResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutAdminpipelineinfoResponse.Success"));

		Result result = new Result();
		result.setContext(_ctx.stringValue("QueryLinkeBahamutAdminpipelineinfoResponse.Result.Context"));
		result.setDescription(_ctx.stringValue("QueryLinkeBahamutAdminpipelineinfoResponse.Result.Description"));
		result.setExternalExecId(_ctx.stringValue("QueryLinkeBahamutAdminpipelineinfoResponse.Result.ExternalExecId"));
		result.setExternalPipelineId(_ctx.stringValue("QueryLinkeBahamutAdminpipelineinfoResponse.Result.ExternalPipelineId"));
		result.setId(_ctx.longValue("QueryLinkeBahamutAdminpipelineinfoResponse.Result.Id"));
		result.setName(_ctx.stringValue("QueryLinkeBahamutAdminpipelineinfoResponse.Result.Name"));
		result.setPipelineInstanceId(_ctx.longValue("QueryLinkeBahamutAdminpipelineinfoResponse.Result.PipelineInstanceId"));
		result.setStageEnv(_ctx.stringValue("QueryLinkeBahamutAdminpipelineinfoResponse.Result.StageEnv"));
		result.setStatus(_ctx.stringValue("QueryLinkeBahamutAdminpipelineinfoResponse.Result.Status"));
		result.setTenantId(_ctx.stringValue("QueryLinkeBahamutAdminpipelineinfoResponse.Result.TenantId"));

		List<String> stageList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAdminpipelineinfoResponse.Result.StageList.Length"); i++) {
			stageList.add(_ctx.stringValue("QueryLinkeBahamutAdminpipelineinfoResponse.Result.StageList["+ i +"]"));
		}
		result.setStageList(stageList);

		List<String> tags = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAdminpipelineinfoResponse.Result.Tags.Length"); i++) {
			tags.add(_ctx.stringValue("QueryLinkeBahamutAdminpipelineinfoResponse.Result.Tags["+ i +"]"));
		}
		result.setTags(tags);
		queryLinkeBahamutAdminpipelineinfoResponse.setResult(result);
	 
	 	return queryLinkeBahamutAdminpipelineinfoResponse;
	}
}