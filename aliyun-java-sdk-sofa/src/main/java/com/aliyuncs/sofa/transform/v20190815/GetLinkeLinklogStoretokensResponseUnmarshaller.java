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

import com.aliyuncs.sofa.model.v20190815.GetLinkeLinklogStoretokensResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeLinklogStoretokensResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeLinklogStoretokensResponseUnmarshaller {

	public static GetLinkeLinklogStoretokensResponse unmarshall(GetLinkeLinklogStoretokensResponse getLinkeLinklogStoretokensResponse, UnmarshallerContext _ctx) {
		
		getLinkeLinklogStoretokensResponse.setRequestId(_ctx.stringValue("GetLinkeLinklogStoretokensResponse.RequestId"));
		getLinkeLinklogStoretokensResponse.setResultCode(_ctx.stringValue("GetLinkeLinklogStoretokensResponse.ResultCode"));
		getLinkeLinklogStoretokensResponse.setResultMessage(_ctx.stringValue("GetLinkeLinklogStoretokensResponse.ResultMessage"));
		getLinkeLinklogStoretokensResponse.setErrorMsg(_ctx.stringValue("GetLinkeLinklogStoretokensResponse.ErrorMsg"));
		getLinkeLinklogStoretokensResponse.setResponseContentRange(_ctx.stringValue("GetLinkeLinklogStoretokensResponse.ResponseContentRange"));
		getLinkeLinklogStoretokensResponse.setResponseContentType(_ctx.stringValue("GetLinkeLinklogStoretokensResponse.ResponseContentType"));
		getLinkeLinklogStoretokensResponse.setResponseStatusCode(_ctx.longValue("GetLinkeLinklogStoretokensResponse.ResponseStatusCode"));
		getLinkeLinklogStoretokensResponse.setSuccess(_ctx.booleanValue("GetLinkeLinklogStoretokensResponse.Success"));

		Result result = new Result();
		result.setBegin(_ctx.longValue("GetLinkeLinklogStoretokensResponse.Result.Begin"));
		result.setBeginMills(_ctx.longValue("GetLinkeLinklogStoretokensResponse.Result.BeginMills"));
		result.setCurrentPage(_ctx.longValue("GetLinkeLinklogStoretokensResponse.Result.CurrentPage"));
		result.setEnd(_ctx.longValue("GetLinkeLinklogStoretokensResponse.Result.End"));
		result.setEndMills(_ctx.longValue("GetLinkeLinklogStoretokensResponse.Result.EndMills"));
		result.setEnvPattern(_ctx.stringValue("GetLinkeLinklogStoretokensResponse.Result.EnvPattern"));
		result.setGmtCreate(_ctx.longValue("GetLinkeLinklogStoretokensResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.longValue("GetLinkeLinklogStoretokensResponse.Result.GmtModified"));
		result.setId(_ctx.longValue("GetLinkeLinklogStoretokensResponse.Result.Id"));
		result.setName(_ctx.stringValue("GetLinkeLinklogStoretokensResponse.Result.Name"));
		result.setOwnerId(_ctx.stringValue("GetLinkeLinklogStoretokensResponse.Result.OwnerId"));
		result.setPageSize(_ctx.longValue("GetLinkeLinklogStoretokensResponse.Result.PageSize"));
		result.setSorter(_ctx.stringValue("GetLinkeLinklogStoretokensResponse.Result.Sorter"));
		result.setStepPattern(_ctx.stringValue("GetLinkeLinklogStoretokensResponse.Result.StepPattern"));
		getLinkeLinklogStoretokensResponse.setResult(result);
	 
	 	return getLinkeLinklogStoretokensResponse;
	}
}