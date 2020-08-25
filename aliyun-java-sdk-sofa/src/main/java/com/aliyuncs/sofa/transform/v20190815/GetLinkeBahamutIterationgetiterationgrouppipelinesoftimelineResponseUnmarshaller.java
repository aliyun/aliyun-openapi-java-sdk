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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse.Paginator;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponseUnmarshaller {

	public static GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse unmarshall(GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse getLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse.RequestId"));
		getLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse.ResultCode"));
		getLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse.ResultMessage"));
		getLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse.ErrorMessage"));
		getLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse.ErrorMsgParamsMap"));
		getLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse.setMessage(_ctx.stringValue("GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse.Message"));
		getLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse.ResponseStatusCode"));
		getLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse.setResult(_ctx.stringValue("GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse.Result"));
		getLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse.Success"));

		Paginator paginator = new Paginator();
		paginator.setItemCount(_ctx.longValue("GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse.Paginator.ItemCount"));
		paginator.setPage(_ctx.longValue("GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse.Paginator.Page"));
		paginator.setPageCount(_ctx.longValue("GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse.Paginator.PageCount"));
		paginator.setPageSize(_ctx.longValue("GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse.Paginator.PageSize"));
		getLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse.setPaginator(paginator);
	 
	 	return getLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse;
	}
}