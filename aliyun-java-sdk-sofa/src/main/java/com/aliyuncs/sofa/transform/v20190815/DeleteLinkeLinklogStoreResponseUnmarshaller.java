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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeLinklogStoreResponse;
import com.aliyuncs.sofa.model.v20190815.DeleteLinkeLinklogStoreResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeLinklogStoreResponseUnmarshaller {

	public static DeleteLinkeLinklogStoreResponse unmarshall(DeleteLinkeLinklogStoreResponse deleteLinkeLinklogStoreResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeLinklogStoreResponse.setRequestId(_ctx.stringValue("DeleteLinkeLinklogStoreResponse.RequestId"));
		deleteLinkeLinklogStoreResponse.setResultCode(_ctx.stringValue("DeleteLinkeLinklogStoreResponse.ResultCode"));
		deleteLinkeLinklogStoreResponse.setResultMessage(_ctx.stringValue("DeleteLinkeLinklogStoreResponse.ResultMessage"));
		deleteLinkeLinklogStoreResponse.setErrorMsg(_ctx.stringValue("DeleteLinkeLinklogStoreResponse.ErrorMsg"));
		deleteLinkeLinklogStoreResponse.setResponseContentRange(_ctx.stringValue("DeleteLinkeLinklogStoreResponse.ResponseContentRange"));
		deleteLinkeLinklogStoreResponse.setResponseContentType(_ctx.stringValue("DeleteLinkeLinklogStoreResponse.ResponseContentType"));
		deleteLinkeLinklogStoreResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeLinklogStoreResponse.ResponseStatusCode"));
		deleteLinkeLinklogStoreResponse.setSuccess(_ctx.booleanValue("DeleteLinkeLinklogStoreResponse.Success"));

		Result result = new Result();
		result.setBegin(_ctx.longValue("DeleteLinkeLinklogStoreResponse.Result.Begin"));
		result.setBeginMills(_ctx.longValue("DeleteLinkeLinklogStoreResponse.Result.BeginMills"));
		result.setCurrentPage(_ctx.longValue("DeleteLinkeLinklogStoreResponse.Result.CurrentPage"));
		result.setEnd(_ctx.longValue("DeleteLinkeLinklogStoreResponse.Result.End"));
		result.setEndMills(_ctx.longValue("DeleteLinkeLinklogStoreResponse.Result.EndMills"));
		result.setEnvPattern(_ctx.stringValue("DeleteLinkeLinklogStoreResponse.Result.EnvPattern"));
		result.setGmtCreate(_ctx.longValue("DeleteLinkeLinklogStoreResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.longValue("DeleteLinkeLinklogStoreResponse.Result.GmtModified"));
		result.setId(_ctx.longValue("DeleteLinkeLinklogStoreResponse.Result.Id"));
		result.setName(_ctx.stringValue("DeleteLinkeLinklogStoreResponse.Result.Name"));
		result.setOwnerId(_ctx.stringValue("DeleteLinkeLinklogStoreResponse.Result.OwnerId"));
		result.setPageSize(_ctx.longValue("DeleteLinkeLinklogStoreResponse.Result.PageSize"));
		result.setSorter(_ctx.stringValue("DeleteLinkeLinklogStoreResponse.Result.Sorter"));
		result.setStepPattern(_ctx.stringValue("DeleteLinkeLinklogStoreResponse.Result.StepPattern"));
		deleteLinkeLinklogStoreResponse.setResult(result);
	 
	 	return deleteLinkeLinklogStoreResponse;
	}
}