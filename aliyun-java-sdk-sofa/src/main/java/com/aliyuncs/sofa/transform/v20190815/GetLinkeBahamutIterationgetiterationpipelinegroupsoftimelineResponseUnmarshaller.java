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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse.Paginator;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponseUnmarshaller {

	public static GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse unmarshall(GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse getLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse.RequestId"));
		getLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse.ResultCode"));
		getLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse.ResultMessage"));
		getLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse.ErrorMessage"));
		getLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse.ErrorMsgParamsMap"));
		getLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse.setMessage(_ctx.stringValue("GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse.Message"));
		getLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse.ResponseStatusCode"));
		getLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse.setResult(_ctx.stringValue("GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse.Result"));
		getLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse.Success"));

		Paginator paginator = new Paginator();
		paginator.setItemCount(_ctx.longValue("GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse.Paginator.ItemCount"));
		paginator.setPage(_ctx.longValue("GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse.Paginator.Page"));
		paginator.setPageCount(_ctx.longValue("GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse.Paginator.PageCount"));
		paginator.setPageSize(_ctx.longValue("GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse.Paginator.PageSize"));
		getLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse.setPaginator(paginator);
	 
	 	return getLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse;
	}
}