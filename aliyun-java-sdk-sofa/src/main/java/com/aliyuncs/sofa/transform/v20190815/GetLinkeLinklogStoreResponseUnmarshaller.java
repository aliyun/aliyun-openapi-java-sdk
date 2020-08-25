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

import com.aliyuncs.sofa.model.v20190815.GetLinkeLinklogStoreResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeLinklogStoreResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeLinklogStoreResponseUnmarshaller {

	public static GetLinkeLinklogStoreResponse unmarshall(GetLinkeLinklogStoreResponse getLinkeLinklogStoreResponse, UnmarshallerContext _ctx) {
		
		getLinkeLinklogStoreResponse.setRequestId(_ctx.stringValue("GetLinkeLinklogStoreResponse.RequestId"));
		getLinkeLinklogStoreResponse.setResultCode(_ctx.stringValue("GetLinkeLinklogStoreResponse.ResultCode"));
		getLinkeLinklogStoreResponse.setResultMessage(_ctx.stringValue("GetLinkeLinklogStoreResponse.ResultMessage"));
		getLinkeLinklogStoreResponse.setErrorMsg(_ctx.stringValue("GetLinkeLinklogStoreResponse.ErrorMsg"));
		getLinkeLinklogStoreResponse.setResponseContentRange(_ctx.stringValue("GetLinkeLinklogStoreResponse.ResponseContentRange"));
		getLinkeLinklogStoreResponse.setResponseContentType(_ctx.stringValue("GetLinkeLinklogStoreResponse.ResponseContentType"));
		getLinkeLinklogStoreResponse.setResponseStatusCode(_ctx.longValue("GetLinkeLinklogStoreResponse.ResponseStatusCode"));
		getLinkeLinklogStoreResponse.setSuccess(_ctx.booleanValue("GetLinkeLinklogStoreResponse.Success"));

		Result result = new Result();
		result.setBegin(_ctx.longValue("GetLinkeLinklogStoreResponse.Result.Begin"));
		result.setBeginMills(_ctx.longValue("GetLinkeLinklogStoreResponse.Result.BeginMills"));
		result.setCurrentPage(_ctx.longValue("GetLinkeLinklogStoreResponse.Result.CurrentPage"));
		result.setEnd(_ctx.longValue("GetLinkeLinklogStoreResponse.Result.End"));
		result.setEndMills(_ctx.longValue("GetLinkeLinklogStoreResponse.Result.EndMills"));
		result.setEnvPattern(_ctx.stringValue("GetLinkeLinklogStoreResponse.Result.EnvPattern"));
		result.setGmtCreate(_ctx.longValue("GetLinkeLinklogStoreResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.longValue("GetLinkeLinklogStoreResponse.Result.GmtModified"));
		result.setId(_ctx.longValue("GetLinkeLinklogStoreResponse.Result.Id"));
		result.setName(_ctx.stringValue("GetLinkeLinklogStoreResponse.Result.Name"));
		result.setOwnerId(_ctx.stringValue("GetLinkeLinklogStoreResponse.Result.OwnerId"));
		result.setPageSize(_ctx.longValue("GetLinkeLinklogStoreResponse.Result.PageSize"));
		result.setSorter(_ctx.stringValue("GetLinkeLinklogStoreResponse.Result.Sorter"));
		result.setStepPattern(_ctx.stringValue("GetLinkeLinklogStoreResponse.Result.StepPattern"));
		getLinkeLinklogStoreResponse.setResult(result);
	 
	 	return getLinkeLinklogStoreResponse;
	}
}