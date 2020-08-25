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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinklogStoreResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinklogStoreResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinklogStoreResponseUnmarshaller {

	public static UpdateLinkeLinklogStoreResponse unmarshall(UpdateLinkeLinklogStoreResponse updateLinkeLinklogStoreResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinklogStoreResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinklogStoreResponse.RequestId"));
		updateLinkeLinklogStoreResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinklogStoreResponse.ResultCode"));
		updateLinkeLinklogStoreResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinklogStoreResponse.ResultMessage"));
		updateLinkeLinklogStoreResponse.setErrorMsg(_ctx.stringValue("UpdateLinkeLinklogStoreResponse.ErrorMsg"));
		updateLinkeLinklogStoreResponse.setResponseContentRange(_ctx.stringValue("UpdateLinkeLinklogStoreResponse.ResponseContentRange"));
		updateLinkeLinklogStoreResponse.setResponseContentType(_ctx.stringValue("UpdateLinkeLinklogStoreResponse.ResponseContentType"));
		updateLinkeLinklogStoreResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeLinklogStoreResponse.ResponseStatusCode"));
		updateLinkeLinklogStoreResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinklogStoreResponse.Success"));

		Result result = new Result();
		result.setBegin(_ctx.longValue("UpdateLinkeLinklogStoreResponse.Result.Begin"));
		result.setBeginMills(_ctx.longValue("UpdateLinkeLinklogStoreResponse.Result.BeginMills"));
		result.setCurrentPage(_ctx.longValue("UpdateLinkeLinklogStoreResponse.Result.CurrentPage"));
		result.setEnd(_ctx.longValue("UpdateLinkeLinklogStoreResponse.Result.End"));
		result.setEndMills(_ctx.longValue("UpdateLinkeLinklogStoreResponse.Result.EndMills"));
		result.setEnvPattern(_ctx.stringValue("UpdateLinkeLinklogStoreResponse.Result.EnvPattern"));
		result.setGmtCreate(_ctx.longValue("UpdateLinkeLinklogStoreResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.longValue("UpdateLinkeLinklogStoreResponse.Result.GmtModified"));
		result.setId(_ctx.longValue("UpdateLinkeLinklogStoreResponse.Result.Id"));
		result.setName(_ctx.stringValue("UpdateLinkeLinklogStoreResponse.Result.Name"));
		result.setOwnerId(_ctx.stringValue("UpdateLinkeLinklogStoreResponse.Result.OwnerId"));
		result.setPageSize(_ctx.longValue("UpdateLinkeLinklogStoreResponse.Result.PageSize"));
		result.setSorter(_ctx.stringValue("UpdateLinkeLinklogStoreResponse.Result.Sorter"));
		result.setStepPattern(_ctx.stringValue("UpdateLinkeLinklogStoreResponse.Result.StepPattern"));
		updateLinkeLinklogStoreResponse.setResult(result);
	 
	 	return updateLinkeLinklogStoreResponse;
	}
}