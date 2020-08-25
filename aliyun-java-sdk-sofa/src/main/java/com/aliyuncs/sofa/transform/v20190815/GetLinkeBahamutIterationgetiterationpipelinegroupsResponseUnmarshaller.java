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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationgetiterationpipelinegroupsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationgetiterationpipelinegroupsResponse.Paginator;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutIterationgetiterationpipelinegroupsResponseUnmarshaller {

	public static GetLinkeBahamutIterationgetiterationpipelinegroupsResponse unmarshall(GetLinkeBahamutIterationgetiterationpipelinegroupsResponse getLinkeBahamutIterationgetiterationpipelinegroupsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutIterationgetiterationpipelinegroupsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutIterationgetiterationpipelinegroupsResponse.RequestId"));
		getLinkeBahamutIterationgetiterationpipelinegroupsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutIterationgetiterationpipelinegroupsResponse.ResultCode"));
		getLinkeBahamutIterationgetiterationpipelinegroupsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutIterationgetiterationpipelinegroupsResponse.ResultMessage"));
		getLinkeBahamutIterationgetiterationpipelinegroupsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutIterationgetiterationpipelinegroupsResponse.ErrorMessage"));
		getLinkeBahamutIterationgetiterationpipelinegroupsResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutIterationgetiterationpipelinegroupsResponse.ErrorMsgParamsMap"));
		getLinkeBahamutIterationgetiterationpipelinegroupsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutIterationgetiterationpipelinegroupsResponse.Message"));
		getLinkeBahamutIterationgetiterationpipelinegroupsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutIterationgetiterationpipelinegroupsResponse.ResponseStatusCode"));
		getLinkeBahamutIterationgetiterationpipelinegroupsResponse.setResult(_ctx.stringValue("GetLinkeBahamutIterationgetiterationpipelinegroupsResponse.Result"));
		getLinkeBahamutIterationgetiterationpipelinegroupsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutIterationgetiterationpipelinegroupsResponse.Success"));

		Paginator paginator = new Paginator();
		paginator.setItemCount(_ctx.longValue("GetLinkeBahamutIterationgetiterationpipelinegroupsResponse.Paginator.ItemCount"));
		paginator.setPage(_ctx.longValue("GetLinkeBahamutIterationgetiterationpipelinegroupsResponse.Paginator.Page"));
		paginator.setPageCount(_ctx.longValue("GetLinkeBahamutIterationgetiterationpipelinegroupsResponse.Paginator.PageCount"));
		paginator.setPageSize(_ctx.longValue("GetLinkeBahamutIterationgetiterationpipelinegroupsResponse.Paginator.PageSize"));
		getLinkeBahamutIterationgetiterationpipelinegroupsResponse.setPaginator(paginator);
	 
	 	return getLinkeBahamutIterationgetiterationpipelinegroupsResponse;
	}
}