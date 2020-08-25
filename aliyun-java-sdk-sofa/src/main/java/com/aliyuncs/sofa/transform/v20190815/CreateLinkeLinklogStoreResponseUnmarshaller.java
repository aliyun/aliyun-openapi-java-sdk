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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinklogStoreResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinklogStoreResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeLinklogStoreResponseUnmarshaller {

	public static CreateLinkeLinklogStoreResponse unmarshall(CreateLinkeLinklogStoreResponse createLinkeLinklogStoreResponse, UnmarshallerContext _ctx) {
		
		createLinkeLinklogStoreResponse.setRequestId(_ctx.stringValue("CreateLinkeLinklogStoreResponse.RequestId"));
		createLinkeLinklogStoreResponse.setResultCode(_ctx.stringValue("CreateLinkeLinklogStoreResponse.ResultCode"));
		createLinkeLinklogStoreResponse.setResultMessage(_ctx.stringValue("CreateLinkeLinklogStoreResponse.ResultMessage"));
		createLinkeLinklogStoreResponse.setErrorMsg(_ctx.stringValue("CreateLinkeLinklogStoreResponse.ErrorMsg"));
		createLinkeLinklogStoreResponse.setResponseContentRange(_ctx.stringValue("CreateLinkeLinklogStoreResponse.ResponseContentRange"));
		createLinkeLinklogStoreResponse.setResponseContentType(_ctx.stringValue("CreateLinkeLinklogStoreResponse.ResponseContentType"));
		createLinkeLinklogStoreResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeLinklogStoreResponse.ResponseStatusCode"));
		createLinkeLinklogStoreResponse.setSuccess(_ctx.booleanValue("CreateLinkeLinklogStoreResponse.Success"));

		Result result = new Result();
		result.setBegin(_ctx.longValue("CreateLinkeLinklogStoreResponse.Result.Begin"));
		result.setBeginMills(_ctx.longValue("CreateLinkeLinklogStoreResponse.Result.BeginMills"));
		result.setCurrentPage(_ctx.longValue("CreateLinkeLinklogStoreResponse.Result.CurrentPage"));
		result.setEnd(_ctx.longValue("CreateLinkeLinklogStoreResponse.Result.End"));
		result.setEndMills(_ctx.longValue("CreateLinkeLinklogStoreResponse.Result.EndMills"));
		result.setEnvPattern(_ctx.stringValue("CreateLinkeLinklogStoreResponse.Result.EnvPattern"));
		result.setGmtCreate(_ctx.longValue("CreateLinkeLinklogStoreResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.longValue("CreateLinkeLinklogStoreResponse.Result.GmtModified"));
		result.setId(_ctx.longValue("CreateLinkeLinklogStoreResponse.Result.Id"));
		result.setName(_ctx.stringValue("CreateLinkeLinklogStoreResponse.Result.Name"));
		result.setOwnerId(_ctx.stringValue("CreateLinkeLinklogStoreResponse.Result.OwnerId"));
		result.setPageSize(_ctx.longValue("CreateLinkeLinklogStoreResponse.Result.PageSize"));
		result.setSorter(_ctx.stringValue("CreateLinkeLinklogStoreResponse.Result.Sorter"));
		result.setStepPattern(_ctx.stringValue("CreateLinkeLinklogStoreResponse.Result.StepPattern"));
		createLinkeLinklogStoreResponse.setResult(result);
	 
	 	return createLinkeLinklogStoreResponse;
	}
}